package com.google.android.recaptcha.internal;

import defpackage.jb5;

/* JADX INFO: loaded from: classes4.dex */
enum zzoq {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static /* bridge */ /* synthetic */ zzoq zza(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        jb5.a("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return null;
    }
}
