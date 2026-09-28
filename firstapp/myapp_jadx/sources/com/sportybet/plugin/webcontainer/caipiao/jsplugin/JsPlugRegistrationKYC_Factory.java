package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class JsPlugRegistrationKYC_Factory implements l730 {

    public static final class InstanceHolder {
        static final JsPlugRegistrationKYC_Factory INSTANCE = new JsPlugRegistrationKYC_Factory();

        private InstanceHolder() {
        }
    }

    public static JsPlugRegistrationKYC_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static JsPlugRegistrationKYC newInstance() {
        return new JsPlugRegistrationKYC();
    }

    @Override // defpackage.m730
    public JsPlugRegistrationKYC get() {
        return newInstance();
    }
}
