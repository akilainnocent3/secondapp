package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class JsPlugStreaming_Factory implements l730 {

    public static final class InstanceHolder {
        static final JsPlugStreaming_Factory INSTANCE = new JsPlugStreaming_Factory();

        private InstanceHolder() {
        }
    }

    public static JsPlugStreaming_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static JsPlugStreaming newInstance() {
        return new JsPlugStreaming();
    }

    @Override // defpackage.m730
    public JsPlugStreaming get() {
        return newInstance();
    }
}
