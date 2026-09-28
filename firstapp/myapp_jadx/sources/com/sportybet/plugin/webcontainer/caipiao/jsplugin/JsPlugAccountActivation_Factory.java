package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import defpackage.l730;
import defpackage.psm;
import defpackage.uqm;

/* JADX INFO: loaded from: classes5.dex */
public final class JsPlugAccountActivation_Factory implements l730 {
    private final l730<uqm> accountHelperProvider;
    private final l730<psm> countryManagerProvider;

    private JsPlugAccountActivation_Factory(l730<psm> l730Var, l730<uqm> l730Var2) {
        this.countryManagerProvider = l730Var;
        this.accountHelperProvider = l730Var2;
    }

    public static JsPlugAccountActivation_Factory create(l730<psm> l730Var, l730<uqm> l730Var2) {
        return new JsPlugAccountActivation_Factory(l730Var, l730Var2);
    }

    public static JsPlugAccountActivation newInstance(psm psmVar, uqm uqmVar) {
        return new JsPlugAccountActivation(psmVar, uqmVar);
    }

    @Override // defpackage.m730
    public JsPlugAccountActivation get() {
        return newInstance(this.countryManagerProvider.get(), this.accountHelperProvider.get());
    }
}
