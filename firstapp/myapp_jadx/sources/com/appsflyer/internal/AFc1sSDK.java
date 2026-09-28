package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1sSDK {
    final List<AFc1vSDK> getCurrencyIso4217Code;

    public AFc1sSDK(List<AFc1vSDK> list) {
        list.getClass();
        this.getCurrencyIso4217Code = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.g(this.getCurrencyIso4217Code, ((AFc1sSDK) obj).getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode();
    }

    public final String toString() {
        return p.a("StorageConfig(typeEntries=", ")", this.getCurrencyIso4217Code);
    }
}
