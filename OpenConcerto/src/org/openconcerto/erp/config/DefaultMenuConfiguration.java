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
 
 package org.openconcerto.erp.config;

import org.openconcerto.erp.action.AboutAction;
import org.openconcerto.erp.action.AstuceAction;
import org.openconcerto.erp.action.GestionDroitsAction;
import org.openconcerto.erp.action.ListeBanqueAction;
import org.openconcerto.erp.action.NouvelleSocieteAction;
import org.openconcerto.erp.action.PreferencesAction;
import org.openconcerto.erp.action.SauvegardeBaseAction;
import org.openconcerto.erp.action.TaskAdminAction;
import org.openconcerto.erp.action.list.ListeDesSocietesCommonsAction;
import org.openconcerto.erp.action.list.ListeDesUsersCommonAction;
import org.openconcerto.erp.core.customerrelationship.customer.action.ListeDesClientsAction;
import org.openconcerto.erp.core.customerrelationship.customer.action.ListeDesContactsAction;
import org.openconcerto.erp.core.customerrelationship.customer.action.NouvelHistoriqueListeClientAction;
import org.openconcerto.erp.core.customerrelationship.mail.action.ListeDesCourriersClientsAction;
import org.openconcerto.erp.core.finance.accounting.action.BalanceAgeeAction;
import org.openconcerto.erp.core.finance.accounting.action.CompteResultatBilanAction;
import org.openconcerto.erp.core.finance.accounting.action.EtatBalanceAction;
import org.openconcerto.erp.core.finance.accounting.action.EtatChargeAction;
import org.openconcerto.erp.core.finance.accounting.action.EtatGrandLivreAction;
import org.openconcerto.erp.core.finance.accounting.action.EtatJournauxAction;
import org.openconcerto.erp.core.finance.accounting.action.ExportRelationExpertAction;
import org.openconcerto.erp.core.finance.accounting.action.GenerePointageAction;
import org.openconcerto.erp.core.finance.accounting.action.GestionPlanComptableEAction;
import org.openconcerto.erp.core.finance.accounting.action.ImpressionJournauxAnalytiqueAction;
import org.openconcerto.erp.core.finance.accounting.action.ImpressionLivrePayeAction;
import org.openconcerto.erp.core.finance.accounting.action.ListeDesDevisesAction;
import org.openconcerto.erp.core.finance.accounting.action.ListeDesEcrituresAction;
import org.openconcerto.erp.core.finance.accounting.action.ListeDesEcrituresAnalytiquesAction;
import org.openconcerto.erp.core.finance.accounting.action.ListeDesJournauxAction;
import org.openconcerto.erp.core.finance.accounting.action.ListeEcritureParClasseAction;
import org.openconcerto.erp.core.finance.accounting.action.NouveauClotureAction;
import org.openconcerto.erp.core.finance.accounting.action.NouveauLettrageAction;
import org.openconcerto.erp.core.finance.accounting.action.NouveauPointageAction;
import org.openconcerto.erp.core.finance.accounting.action.NouvelleValidationAction;
import org.openconcerto.erp.core.finance.accounting.action.ResultatAnalytiqueAction;
import org.openconcerto.erp.core.finance.payment.action.ListeDesChequesAEncaisserAction;
import org.openconcerto.erp.core.finance.payment.action.ListeDesChequesAvoirAction;
import org.openconcerto.erp.core.finance.payment.action.ListeDesChequesFournisseursAction;
import org.openconcerto.erp.core.finance.payment.action.ListeDesEncaissementsAction;
import org.openconcerto.erp.core.finance.payment.action.ListeDesReferencesAction;
import org.openconcerto.erp.core.finance.payment.action.ListeDesRelancesAction;
import org.openconcerto.erp.core.finance.payment.action.ListeDesTraitesFournisseursAction;
import org.openconcerto.erp.core.finance.payment.action.NouveauDecaissementChequeAvoirAction;
import org.openconcerto.erp.core.finance.payment.action.NouveauListeDesChequesADecaisserAction;
import org.openconcerto.erp.core.finance.payment.action.NouveauListeDesChequesAEncaisserAction;
import org.openconcerto.erp.core.humanresources.ListeDesContactsAdministratif;
import org.openconcerto.erp.core.humanresources.employe.action.ListeDesCommerciauxAction;
import org.openconcerto.erp.core.humanresources.employe.action.ListeDesSalariesAction;
import org.openconcerto.erp.core.humanresources.employe.action.ListeDesSecretairesAction;
import org.openconcerto.erp.core.humanresources.employe.action.N4DSAction;
import org.openconcerto.erp.core.humanresources.payroll.action.ClotureMensuellePayeAction;
import org.openconcerto.erp.core.humanresources.payroll.action.EditionFichePayeAction;
import org.openconcerto.erp.core.humanresources.payroll.action.ListeDesProfilsPayeAction;
import org.openconcerto.erp.core.humanresources.payroll.action.ListeDesRubriquesDePayeAction;
import org.openconcerto.erp.core.humanresources.payroll.action.ListeDesVariablesPayes;
import org.openconcerto.erp.core.humanresources.payroll.action.NouvelAcompteAction;
import org.openconcerto.erp.core.humanresources.payroll.action.NouvelHistoriqueFichePayeAction;
import org.openconcerto.erp.core.humanresources.payroll.action.NouvelleSaisieKmAction;
import org.openconcerto.erp.core.reports.stat.action.EvolutionCAAction;
import org.openconcerto.erp.core.reports.stat.action.EvolutionCACumulAction;
import org.openconcerto.erp.core.reports.stat.action.EvolutionCmdAction;
import org.openconcerto.erp.core.reports.stat.action.EvolutionCmdCumulAction;
import org.openconcerto.erp.core.reports.stat.action.EvolutionMargeAction;
import org.openconcerto.erp.core.reports.stat.action.VenteArticleFamilleGraphAction;
import org.openconcerto.erp.core.reports.stat.action.VenteArticleGraphAction;
import org.openconcerto.erp.core.reports.stat.action.VenteArticleMargeGraphAction;
import org.openconcerto.erp.core.sales.credit.action.ListeDesAvoirsClientsAction;
import org.openconcerto.erp.core.sales.credit.action.NouveauAvoirClientAction;
import org.openconcerto.erp.core.sales.invoice.action.EtatVenteAction;
import org.openconcerto.erp.core.sales.invoice.action.GenListeVenteAction;
import org.openconcerto.erp.core.sales.invoice.action.ListeDebiteursAction;
import org.openconcerto.erp.core.sales.invoice.action.ListeDesElementsFactureAction;
import org.openconcerto.erp.core.sales.invoice.action.ListeDesVentesAction;
import org.openconcerto.erp.core.sales.invoice.action.ListeSaisieVenteFactureAction;
import org.openconcerto.erp.core.sales.invoice.action.ListesFacturesClientsImpayeesAction;
import org.openconcerto.erp.core.sales.invoice.action.NouveauSaisieVenteComptoirAction;
import org.openconcerto.erp.core.sales.invoice.action.NouveauSaisieVenteFactureAction;
import org.openconcerto.erp.core.sales.order.action.ListeDesCommandesClientAction;
import org.openconcerto.erp.core.sales.order.action.NouvelleCommandeClientAction;
import org.openconcerto.erp.core.sales.pos.action.ListeDesCaissesTicketAction;
import org.openconcerto.erp.core.sales.product.action.FamilleArticleAction;
import org.openconcerto.erp.core.sales.product.action.ListeDesArticlesAction;
import org.openconcerto.erp.core.sales.quote.action.ListeDesDevisAction;
import org.openconcerto.erp.core.sales.quote.action.ListeDesElementsPropositionsAction;
import org.openconcerto.erp.core.sales.quote.action.NouveauDevisAction;
import org.openconcerto.erp.core.sales.quote.action.NouvellePropositionAction;
import org.openconcerto.erp.core.sales.shipment.action.ListeDesBonsDeLivraisonAction;
import org.openconcerto.erp.core.sales.shipment.action.NouveauBonLivraisonAction;
import org.openconcerto.erp.core.supplychain.credit.action.ListeDesAvoirsFournisseurAction;
import org.openconcerto.erp.core.supplychain.credit.action.NouvelAvoirFournisseurAction;
import org.openconcerto.erp.core.supplychain.order.action.ListeDesCommandesAction;
import org.openconcerto.erp.core.supplychain.order.action.ListeDesFacturesFournisseurAction;
import org.openconcerto.erp.core.supplychain.order.action.ListeSaisieAchatAction;
import org.openconcerto.erp.core.supplychain.order.action.NouveauSaisieAchatAction;
import org.openconcerto.erp.core.supplychain.order.action.NouvelleCommandeAction;
import org.openconcerto.erp.core.supplychain.order.action.NouvelleFactureFournisseurAction;
import org.openconcerto.erp.core.supplychain.product.action.ListeDesArticlesFournisseurAction;
import org.openconcerto.erp.core.supplychain.receipt.action.ListeDesBonsReceptionsAction;
import org.openconcerto.erp.core.supplychain.receipt.action.NouveauBonReceptionAction;
import org.openconcerto.erp.core.supplychain.stock.action.ListeDesMouvementsStockAction;
import org.openconcerto.erp.core.supplychain.stock.action.NouvelleSaisieMouvementStockAction;
import org.openconcerto.erp.core.supplychain.supplier.action.ListeDesContactsFournisseursAction;
import org.openconcerto.erp.core.supplychain.supplier.action.ListeDesFournisseursAction;
import org.openconcerto.erp.core.supplychain.supplier.action.ListesFacturesFournImpayeesAction;
import org.openconcerto.erp.core.supplychain.supplier.action.NouvelHistoriqueListeFournAction;
import org.openconcerto.erp.modules.ModuleFrame;
import org.openconcerto.erp.preferences.DefaultNXProps;
import org.openconcerto.erp.rights.ComptaUserRight;
import org.openconcerto.erp.rights.NXRights;
import org.openconcerto.erp.utils.correct.CorrectMouvement;
import org.openconcerto.sql.model.DBRoot;
import org.openconcerto.sql.model.SQLSelect;
import org.openconcerto.sql.users.UserManager;
import org.openconcerto.sql.users.rights.LockAdminUserRight;
import org.openconcerto.sql.users.rights.UserRights;
import org.openconcerto.sql.users.rights.UserRightsManager;
import org.openconcerto.sql.utils.BackupPanel;
import org.openconcerto.ui.FrameUtil;
import org.openconcerto.ui.group.Group;
import org.openconcerto.ui.group.LayoutHints;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class DefaultMenuConfiguration implements MenuConfiguration {
    public void registerMenuTranslations() {

    }

    @Override
    public final MenuAndActions createMenuAndActions() {
        final MenuAndActions res = new MenuAndActions();
        this.createMenuGroup(res.getGroup());
        this.registerMenuActions(res);
        return res;
    }

    private void createMenuGroup(Group mGroup) {
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();

        mGroup.add(createFilesMenuGroup());
        mGroup.add(createCreationMenuGroup());
        mGroup.add(createListMenuGroup());
        if (rights.haveRight(ComptaUserRight.MENU)) {
            mGroup.add(createAccountingMenuGroup());
            mGroup.add(createStatsDocumentsGroup());
        }
        if (rights.haveRight(NXRights.ACCES_MENU_STAT.getCode())) {
            mGroup.add(createStatsMenuGroup());
        }
            mGroup.add(createPaymentMenuGroup());
        if (rights.haveRight(NXRights.LOCK_MENU_PAYE.getCode())) {
            mGroup.add(createPayrollMenuGroup());
        }
        if (rights.haveRight(NXRights.ACCES_MENU_STRUCTURE.getCode())) {
            mGroup.add(createOrganizationMenuGroup());
        }
        mGroup.add(createHelpMenuGroup());
        if (rights.haveRight(NXRights.LOCK_MENU_TEST.getCode())) {
            mGroup.add(createTestMenuGroup());
        }

    }

    public void registerMenuActions(final MenuAndActions ma) {
        registerFilesMenuActions(ma);
        registerCreationMenuActions(ma);
        registerListMenuActions(ma);
        registerAccountingMenuActions(ma);
        registerStatsDocumentsActions(ma);
        registerStatsMenuActions(ma);
        registerPaymentMenuActions(ma);
        registerPayrollMenuActions(ma);
        registerOrganizationMenuActions(ma);
        registerHelpMenuActions(ma);
        registerHelpTestActions(ma);
    }

    /**
     * Groups
     */
    private Group createFilesMenuGroup() {
        Group group = new Group(MainFrame.FILE_MENU);
        if (UserRightsManager.getCurrentUserRights().haveRight(BackupPanel.RIGHT_CODE))
            group.addItem("backup");
        group.addItem("export.accounting");
        group.addItem("modules");
        if (!Gestion.MAC_OS_X) {
            group.addItem("preferences");
            group.addItem("quit");
        }
        return group;
    }

    private Group createCreationMenuGroup() {
        final Group group = new Group(MainFrame.CREATE_MENU);
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();

        final Boolean bModeVenteComptoir = DefaultNXProps.getInstance().getBooleanValue("ArticleVenteComptoir", true);
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();
        final Group accountingGroup = new Group("accounting");
        if (rights.haveRight(ComptaUserRight.MENU)) {
            accountingGroup.addItem("accounting.entry.create");
        }
        group.add(accountingGroup);

        final Group customerGroup = new Group("customer", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);

            customerGroup.addItem("customer.quote.create");

            customerGroup.addItem("customer.delivery.create");
            customerGroup.addItem("customer.order.create");
            if (bModeVenteComptoir && rights.haveRight("VENTE_COMPTOIR")) {
                customerGroup.addItem("pos.sale.create");
            }
            customerGroup.addItem("customer.invoice.create");

            customerGroup.addItem("customer.credit.create");
            group.add(customerGroup);

            final Group supplierGroup = new Group("supplier", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
            group.add(supplierGroup);
            if (rights.haveRight(NXRights.LOCK_MENU_ACHAT.getCode())) {
                supplierGroup.addItem("supplier.order.create");
                supplierGroup.addItem("supplier.receipt.create");
                supplierGroup.addItem("supplier.purchase.create");
                supplierGroup.addItem("supplier.invoice.purchase.create");
                supplierGroup.addItem("supplier.credit.create");
                group.addItem("stock.io.create");
            }

        return group;
    }

    private Group createHelpMenuGroup() {
        final Group group = new Group(MainFrame.HELP_MENU);
        group.addItem("information");
        group.addItem("tips");
        return group;
    }

    private Group createOrganizationMenuGroup() {
        final Group group = new Group(MainFrame.STRUCTURE_MENU);
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();

        if (rights.haveRight(ComptaUserRight.MENU)) {
            final Group gAccounting = new Group("menu.organization.accounting", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
            gAccounting.addItem("accounting.chart");
            gAccounting.addItem("accounting.journal");
            gAccounting.addItem("accounting.checkDB");
            gAccounting.addItem("accounting.currency");
            group.add(gAccounting);
        }

        if (rights.haveRight(LockAdminUserRight.LOCK_MENU_ADMIN)) {
            final Group gUser = new Group("menu.organization.user", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
            gUser.addItem("user.list");
            gUser.addItem("user.right.list");
            gUser.addItem("user.task.right");
            group.add(gUser);
        }

        group.addItem("office.contact.list");
        group.addItem("salesman.list");

        final Group gPos = new Group("menu.organization.pos", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
        gPos.addItem("pos.list");
        group.add(gPos);


            group.addItem("enterprise.list");

        group.addItem("divison.bank.list");
            group.addItem("enterprise.create");
        return group;
    }

    private Group createPayrollMenuGroup() {
        final Group group = new Group(MainFrame.PAYROLL_MENU);
        group.addItem("payroll.list.report.print");
        group.addItem("payroll.profile.list");
        group.addItem("payroll.history");
        group.addItem("payroll.create");
        group.addItem("payroll.deposit.create");
        group.addItem("employee.list");
        final Group groupConfig = new Group("menu.payroll.config", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
        groupConfig.addItem("payroll.section");
        groupConfig.addItem("payroll.variable");
        group.add(groupConfig);
        group.addItem("payroll.closing");
        return group;
    }

    public Group createPaymentMenuGroup() {
        final Group group = new Group(MainFrame.PAYMENT_MENU);
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();

        if (rights.haveRight(ComptaUserRight.MENU) || rights.haveRight(ComptaUserRight.POINTAGE_LETTRAGE)) {
            group.addItem("payment.checking.create");
            group.addItem("payment.reconciliation.create");
        }

        if (rights.haveRight(NXRights.GESTION_ENCAISSEMENT.getCode())) {
            Group gCustomer = new Group("menu.payment.customer");
            gCustomer.addItem("customer.invoice.unpaid.list");
            gCustomer.addItem("customer.dept.list");
            gCustomer.addItem("customer.payment.list");
            gCustomer.addItem("customer.payment.followup.list");
            gCustomer.addItem("customer.payment.check.pending.list");
            gCustomer.addItem("customer.payment.check.pending.create");
            gCustomer.addItem("customer.credit.check.list");
            gCustomer.addItem("customer.credit.check.create");
            group.add(gCustomer);
        }
        if (rights.haveRight(NXRights.LOCK_MENU_ACHAT.getCode())) {
            Group gSupplier = new Group("menu.payment.supplier");
            gSupplier.addItem("supplier.invoice.unpaid.list");
            gSupplier.addItem("supplier.bill.list");
            gSupplier.addItem("supplier.payment.check.list");
            gSupplier.addItem("supplier.payment.check.pending.list");
            group.add(gSupplier);
        }
        return group;
    }

    public Group createStatsMenuGroup() {
        final Group group = new Group(MainFrame.STATS_MENU);
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();

        group.addItem("sales.graph");
        group.addItem("sales.graph.cumulate");
        group.addItem("sales.graph.cmd");
        group.addItem("sales.graph.cmd.cumulate");

            group.addItem("sales.margin.graph");

        group.addItem("sales.list.report");
            group.addItem("sales.product.graph");
            group.addItem("sales.product.margin.graph");
            group.addItem("sales.product.family.graph");
        group.addItem("sales.list.graph");
        return group;
    }

    public Group createStatsDocumentsGroup() {
        final Group group = new Group(MainFrame.DECLARATION_MENU);
        // group.addItem("accounting.vat.report");
        group.addItem("accounting.costs.report");
        group.addItem("accounting.balance.report");
        group.addItem("employe.social.report");
        return group;
    }

    public Group createAccountingMenuGroup() {
        final Group group = new Group(MainFrame.STATE_MENU);
        group.addItem("accounting.balance");
        group.addItem("accounting.client.balance");
        group.addItem("accounting.ledger");
        Group analytic = new Group("accounting.analytical");
        analytic.addItem("accounting.analytical.ledger");
        analytic.addItem("accounting.analytical.entries.ledger");
        group.add(analytic);
        group.addItem("accounting.general.ledger");
        group.addItem("accounting.entries.ledger");
        group.addItem("accounting.entries.list");
        final Group gClosing = new Group("menu.accounting.closing", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
        gClosing.addItem("accounting.validating");
        gClosing.addItem("accounting.closing");
        group.add(gClosing);
        return group;
    }

    private Group createListMenuGroup() {
        final Group group = new Group(MainFrame.LIST_MENU);

        final Boolean bModeVenteComptoir = DefaultNXProps.getInstance().getBooleanValue("ArticleVenteComptoir", true);
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();

        Group gCustomer = new Group("menu.list.customer", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
        gCustomer.addItem("customer.list");
        gCustomer.addItem("contact.list");

        if (rights.haveRight(NXRights.ACCES_HISTORIQUE.getCode())) {
            gCustomer.addItem("customer.history");
        }


            gCustomer.addItem("customer.quote.list");


            gCustomer.addItem("customer.order.list");
            gCustomer.addItem("customer.delivery.list");
        group.add(gCustomer);

        boolean useListDesVentesAction = bModeVenteComptoir;
        if (useListDesVentesAction) {
            gCustomer.addItem("sales.list");

        } else {

            gCustomer.addItem("customer.invoice.list");
        }

        gCustomer.addItem("customer.credit.list");

        final Group gSupplier = new Group("menu.list.supplier", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
            gSupplier.addItem("supplier.list");
            gSupplier.addItem("supplier.contact.list");
                gSupplier.addItem("supplier.history");
            if (rights.haveRight(NXRights.LOCK_MENU_ACHAT.getCode())) {
                    gSupplier.addItem("supplier.order.list");
                gSupplier.addItem("supplier.receipt.list");
                gSupplier.addItem("supplier.purchase.list");
                gSupplier.addItem("supplier.invoice.purchase.list");
                    gSupplier.addItem("supplier.credit.list");
            }
            group.add(gSupplier);

            final Group gProduct = new Group("menu.list.product", LayoutHints.DEFAULT_NOLABEL_SEPARATED_GROUP_HINTS);
            gProduct.addItem("product.list");
            // gProduct.addItem("product.supplychain.list");
            gProduct.addItem("stock.io.list");
            group.add(gProduct);

        return group;
    }

    private Group createTestMenuGroup() {
        final Group group = new Group("menu.test");
        return group;
    }

    /**
     * Actions
     * */
    private void registerFilesMenuActions(final MenuAndActions mManager) {
        mManager.registerAction("backup", new SauvegardeBaseAction());
        mManager.registerAction("export.accounting", new ExportRelationExpertAction());
        mManager.registerAction("modules", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameUtil.show(ModuleFrame.getInstance());
            }
        });
        if (!Gestion.MAC_OS_X) {
            mManager.registerAction("preferences", new PreferencesAction());
            mManager.registerAction("quit", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MainFrame.getInstance().quit();
                }
            });
        }
    }

    private void registerCreationMenuActions(final MenuAndActions mManager) {
        final Boolean bModeVenteComptoir = DefaultNXProps.getInstance().getBooleanValue("ArticleVenteComptoir", true);
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();

        if (rights.haveRight(ComptaUserRight.MENU)) {
            mManager.registerAction("accounting.entry.create", new NouvelleSaisieKmAction());
        }


        mManager.registerAction("customer.quote.create", new NouveauDevisAction());

        mManager.registerAction("customer.delivery.create", new NouveauBonLivraisonAction());
        mManager.registerAction("customer.order.create", new NouvelleCommandeClientAction());
        if (bModeVenteComptoir && rights.haveRight("VENTE_COMPTOIR")) {
            mManager.registerAction("pos.sale.create", new NouveauSaisieVenteComptoirAction());
        }
        mManager.registerAction("customer.invoice.create", new NouveauSaisieVenteFactureAction());

        mManager.registerAction("customer.credit.create", new NouveauAvoirClientAction());

        if (rights.haveRight(NXRights.LOCK_MENU_ACHAT.getCode())) {

            mManager.registerAction("supplier.order.create", new NouvelleCommandeAction());
            mManager.registerAction("supplier.receipt.create", new NouveauBonReceptionAction());
            mManager.registerAction("supplier.purchase.create", new NouveauSaisieAchatAction());
            mManager.registerAction("supplier.invoice.purchase.create", new NouvelleFactureFournisseurAction());
            mManager.registerAction("supplier.credit.create", new NouvelAvoirFournisseurAction());
            mManager.registerAction("stock.io.create", new NouvelleSaisieMouvementStockAction());
        }

    }

    private void registerListMenuActions(final MenuAndActions mManager) {
        final Boolean bModeVenteComptoir = DefaultNXProps.getInstance().getBooleanValue("ArticleVenteComptoir", true);
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();

        mManager.registerAction("customer.list", new ListeDesClientsAction());
        mManager.registerAction("contact.list", new ListeDesContactsAction());

        if (rights.haveRight(NXRights.ACCES_HISTORIQUE.getCode())) {
            mManager.registerAction("customer.history", new NouvelHistoriqueListeClientAction());
        }


            mManager.registerAction("customer.quote.list", new ListeDesDevisAction());


            mManager.registerAction("customer.order.list", new ListeDesCommandesClientAction());
            mManager.registerAction("customer.delivery.list", new ListeDesBonsDeLivraisonAction());

        boolean useListDesVentesAction = bModeVenteComptoir;
        if (useListDesVentesAction) {
            mManager.registerAction("sales.list", new ListeDesVentesAction());

        } else {

            mManager.registerAction("customer.invoice.list", new ListeSaisieVenteFactureAction());
        }

        mManager.registerAction("customer.credit.list", new ListeDesAvoirsClientsAction());

            mManager.registerAction("supplier.list", new ListeDesFournisseursAction());
            mManager.registerAction("supplier.contact.list", new ListeDesContactsFournisseursAction());
                mManager.registerAction("supplier.history", new NouvelHistoriqueListeFournAction());
            if (rights.haveRight(NXRights.LOCK_MENU_ACHAT.getCode())) {
                    mManager.registerAction("supplier.order.list", new ListeDesCommandesAction());
                mManager.registerAction("supplier.receipt.list", new ListeDesBonsReceptionsAction());
                mManager.registerAction("supplier.purchase.list", new ListeSaisieAchatAction());
                mManager.registerAction("supplier.invoice.purchase.list", new ListeDesFacturesFournisseurAction());
                    mManager.registerAction("supplier.credit.list", new ListeDesAvoirsFournisseurAction());
            }

            mManager.registerAction("product.list", new ListeDesArticlesAction());
            mManager.registerAction("product.supplychain.list", new ListeDesArticlesFournisseurAction());
            mManager.registerAction("stock.io.list", new ListeDesMouvementsStockAction());


    }

    public void registerAccountingMenuActions(final MenuAndActions mManager) {
        mManager.registerAction("accounting.balance", new EtatBalanceAction());
        mManager.registerAction("accounting.client.balance", new BalanceAgeeAction());
        mManager.registerAction("accounting.analytical.ledger", new ImpressionJournauxAnalytiqueAction());
        mManager.registerAction("accounting.ledger", new EtatJournauxAction());
        mManager.registerAction("accounting.general.ledger", new EtatGrandLivreAction());
        mManager.registerAction("accounting.entries.ledger", new ListeDesEcrituresAction());
        mManager.registerAction("accounting.analytical.entries.ledger", new ListeDesEcrituresAnalytiquesAction());
        mManager.registerAction("accounting.entries.list", new ListeEcritureParClasseAction());
        mManager.registerAction("accounting.validating", new NouvelleValidationAction());
        mManager.registerAction("accounting.closing", new NouveauClotureAction());
    }

    public void registerStatsDocumentsActions(final MenuAndActions mManager) {
        // mManager.registerAction("accounting.vat.report", new DeclarationTVAAction());
        mManager.registerAction("accounting.costs.report", new EtatChargeAction());
        mManager.registerAction("accounting.balance.report", new CompteResultatBilanAction());
        mManager.registerAction("employe.social.report", new N4DSAction());
    }

    public void registerStatsMenuActions(final MenuAndActions mManager) {
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();

        mManager.registerAction("sales.graph", new EvolutionCAAction());
        mManager.registerAction("sales.graph.cumulate", new EvolutionCACumulAction());

        mManager.registerAction("sales.graph.cmd", new EvolutionCmdAction());
        mManager.registerAction("sales.graph.cmd.cumulate", new EvolutionCmdCumulAction());

            mManager.registerAction("sales.margin.graph", new EvolutionMargeAction());

        mManager.registerAction("sales.list.report", new GenListeVenteAction());
            mManager.registerAction("sales.product.graph", new VenteArticleGraphAction());
            mManager.registerAction("sales.product.margin.graph", new VenteArticleMargeGraphAction());
            mManager.registerAction("sales.product.family.graph", new VenteArticleFamilleGraphAction());
        mManager.registerAction("sales.list.graph", new EtatVenteAction());

    }

    public void registerPaymentMenuActions(final MenuAndActions mManager) {
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();

        if (rights.haveRight(ComptaUserRight.MENU) || rights.haveRight(ComptaUserRight.POINTAGE_LETTRAGE)) {
            mManager.registerAction("payment.checking.create", new NouveauPointageAction());
            mManager.registerAction("payment.reconciliation.create", new NouveauLettrageAction());
        }

        if (rights.haveRight(NXRights.GESTION_ENCAISSEMENT.getCode())) {
            mManager.registerAction("customer.invoice.unpaid.list", new ListesFacturesClientsImpayeesAction());
            mManager.registerAction("customer.dept.list", new ListeDebiteursAction());
            mManager.registerAction("customer.payment.list", new ListeDesEncaissementsAction());
            mManager.registerAction("customer.payment.followup.list", new ListeDesRelancesAction());
            mManager.registerAction("customer.payment.check.pending.list", new ListeDesChequesAEncaisserAction());
            mManager.registerAction("customer.payment.check.pending.create", new NouveauListeDesChequesAEncaisserAction());
            mManager.registerAction("customer.credit.check.list", new ListeDesChequesAvoirAction());
            mManager.registerAction("customer.credit.check.create", new NouveauDecaissementChequeAvoirAction());
        }
        if (rights.haveRight(NXRights.LOCK_MENU_ACHAT.getCode())) {
            mManager.registerAction("supplier.invoice.unpaid.list", new ListesFacturesFournImpayeesAction());
            mManager.registerAction("supplier.bill.list", new ListeDesTraitesFournisseursAction());
            mManager.registerAction("supplier.payment.check.list", new ListeDesChequesFournisseursAction());
            mManager.registerAction("supplier.payment.check.pending.list", new NouveauListeDesChequesADecaisserAction());
        }

    }

    private void registerPayrollMenuActions(final MenuAndActions mManager) {
        mManager.registerAction("payroll.list.report.print", new ImpressionLivrePayeAction());
        mManager.registerAction("payroll.profile.list", new ListeDesProfilsPayeAction());
        mManager.registerAction("payroll.history", new NouvelHistoriqueFichePayeAction());
        mManager.registerAction("payroll.create", new EditionFichePayeAction());
        mManager.registerAction("payroll.deposit.create", new NouvelAcompteAction());
        mManager.registerAction("employee.list", new ListeDesSalariesAction());
        mManager.registerAction("payroll.section", new ListeDesRubriquesDePayeAction());
        mManager.registerAction("payroll.variable", new ListeDesVariablesPayes());
        mManager.registerAction("payroll.closing", new ClotureMensuellePayeAction());

    }

    public void registerOrganizationMenuActions(final MenuAndActions mManager) {
        final UserRights rights = UserManager.getInstance().getCurrentUser().getRights();
        final ComptaPropsConfiguration configuration = ComptaPropsConfiguration.getInstanceCompta();
        if (rights.haveRight(ComptaUserRight.MENU)) {
            mManager.putAction(new GestionPlanComptableEAction(), "accounting.chart");
            mManager.putAction(new ListeDesJournauxAction(), "accounting.journal");
            mManager.putAction(new ListeDesDevisesAction(), "accounting.currency");
            mManager.putAction(new AbstractAction("Check DB") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    final DBRoot rootSociete = ComptaPropsConfiguration.getInstanceCompta().getRootSociete();
                    final SQLSelect sel = CorrectMouvement.createUnbalancedSelect(rootSociete);
                    final List<?> ids = rootSociete.getDBSystemRoot().getDataSource().executeCol(sel.asString());
                    JOptionPane.showMessageDialog((Component) e.getSource(), "Il y a " + ids.size() + " mouvement(s) non équilibré(s).", "Résultat", ids.size() == 0 ? JOptionPane.INFORMATION_MESSAGE
                            : JOptionPane.WARNING_MESSAGE);
                }
            }, "accounting.checkDB");
        }

        if (rights.haveRight(LockAdminUserRight.LOCK_MENU_ADMIN)) {
            mManager.registerAction("user.list", new ListeDesUsersCommonAction());
            mManager.registerAction("user.right.list", new GestionDroitsAction());
            mManager.registerAction("user.task.right", new TaskAdminAction());
        }

        mManager.registerAction("office.contact.list", new ListeDesContactsAdministratif());
        mManager.registerAction("salesman.list", new ListeDesCommerciauxAction());
        mManager.registerAction("pos.list", new ListeDesCaissesTicketAction());


            mManager.registerAction("enterprise.list", new ListeDesSocietesCommonsAction());

        mManager.registerAction("divison.bank.list", new ListeBanqueAction());
            mManager.registerAction("enterprise.create", new NouvelleSocieteAction());
    }

    private void registerHelpMenuActions(final MenuAndActions mManager) {
        mManager.registerAction("information", AboutAction.getInstance());
        mManager.registerAction("tips", new AstuceAction());
    }

    private void registerHelpTestActions(final MenuAndActions mManager) {
    }
}
