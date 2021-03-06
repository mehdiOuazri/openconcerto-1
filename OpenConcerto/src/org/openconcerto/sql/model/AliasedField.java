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
 
 package org.openconcerto.sql.model;

/**
 * An implementation of FieldRef.
 * 
 * @author Sylvain CUAZ
 */
public class AliasedField implements FieldRef {

    private final TableRef t;
    private final SQLField f;

    public AliasedField(SQLField f) {
        this(f, null);
    }

    public AliasedField(TableRef t, String fieldName) {
        this.t = t;
        this.f = t.getTable().getField(fieldName);
    }

    /**
     * Creates a new instance.
     * 
     * @param f a field, eg |OBSERVATION.CONSTAT|.
     * @param alias the alias, can be <code>null</code>, eg "obs".
     */
    public AliasedField(SQLField f, String alias) {
        if (f == null)
            throw new NullPointerException("f is null");
        this.f = f;
        this.t = alias == null ? f.getTable() : new AliasedTable(f.getTable(), alias);
    }

    public SQLField getField() {
        return this.f;
    }

    public String getFieldRef() {
        return SQLBase.quoteIdentifier(this.getAlias()) + "." + SQLBase.quoteIdentifier(this.getField().getName());
    }

    public String getAlias() {
        return this.t.getAlias();
    }

    @Override
    public TableRef getTableRef() {
        return this.t;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AliasedField) {
            final AliasedField o = (AliasedField) obj;
            return this.getAlias().equals(o.getAlias()) && this.getField().equals(o.getField());
        } else {
            return super.equals(obj);
        }
    }

    public int hashCode() {
        return this.getAlias().hashCode() + this.getField().hashCode();
    }

    @Override
    public String toString() {
        return this.getFieldRef();
    }
}
