/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2011 OpenConcerto, by ILM Informatique. All rights reserved.
 * 
 * The contents of this file are subject to the terms of the GNU General Public License Version 3
 * only ("GPL"). You may not use this file except in compliance with the License. You can obtain a
 * copy of the License at http://www.gnu.org/licenses/gpl-3.0.html See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each file.
 */
 
 package org.openconcerto.erp.graph;

import org.openconcerto.erp.core.finance.accounting.model.SommeCompte;
import org.openconcerto.sql.Configuration;
import org.openconcerto.sql.element.SQLElementDirectory;
import org.openconcerto.sql.model.SQLSelect;
import org.openconcerto.sql.model.SQLTable;
import org.openconcerto.sql.model.Where;
import org.openconcerto.utils.RTInterruptedException;

import java.util.Calendar;
import java.util.Date;

import org.jopenchart.DataModel1D;
import org.jopenchart.barchart.VerticalBarChart;

public class CmdYearDataModel extends DataModel1D {

    private Thread thread;
    private int year;

    public CmdYearDataModel(final int year) {
        loadYear(year);
    }

    @Override
    public int getSize() {
        return 1;
    }

    public synchronized void loadYear(Object value) {
        if (!(value instanceof Number)) {
            return;
        }
        if (thread != null) {
            thread.interrupt();
        }
        year = ((Number) value).intValue();

        thread = new Thread() {
            @Override
            public void run() {
                setState(LOADING);
                // Clear
                CmdYearDataModel.this.clear();
                fireDataModelChanged();
                SommeCompte sommeCompte = new SommeCompte();
                try {

                    Calendar c = Calendar.getInstance();
                    c.set(year, Calendar.JANUARY, 1);
                    Date d1 = new Date(c.getTimeInMillis());
                    c.set(Calendar.MONTH, Calendar.DECEMBER);
                    c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE));
                    Date d2 = new Date(c.getTimeInMillis());
                    Thread.yield();
                    double vCA = 0;

                    final SQLElementDirectory directory = Configuration.getInstance().getDirectory();
                    SQLTable tableEcr = directory.getElement("COMMANDE_CLIENT").getTable();
                    SQLSelect sel = new SQLSelect();
                    sel.addSelect(tableEcr.getField("T_HT"), "SUM");
                    Where w = new Where(tableEcr.getField("DATE"), d1, d2);
                    sel.setWhere(w);

                    Object[] o = tableEcr.getBase().getDataSource().executeA1(sel.asString());
                    if (o != null && o[0] != null && (Long.valueOf(o[0].toString()) != 0)) {
                        long deb = Long.valueOf(o[0].toString());

                        vCA = deb;
                    }
                    final double value = vCA / 100.0D;

                    if (((int) value) != 0) {
                        CmdYearDataModel.this.setValueAt(0, value);
                        fireDataModelChanged();
                        Thread.sleep(20);
                    }

                    if (!isInterrupted()) {
                        setState(LOADED);
                        fireDataModelChanged();
                    }
                } catch (InterruptedException e) {
                    // Thread stopped because of year changed
                } catch (RTInterruptedException e) {
                    // Thread stopped because of year changed
                }

            }
        };

        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

    }

    public int getYear() {
        return year;
    }

}
