package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    GET_TOKEN,
    DIAGNOSTIC_EVENT,
    OPERATIVE_EVENT,
    UNIVERSAL_EVENT;

    @Override // java.lang.Enum
    @l
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.getDefault();
        m0.o(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        m0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
