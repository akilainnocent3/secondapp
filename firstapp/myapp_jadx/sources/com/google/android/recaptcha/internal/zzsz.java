package com.google.android.recaptcha.internal;

import defpackage.hb5;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzsz implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zztc) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzts) {
            return ((zztc) this.zza.getValue()).zzc((zzts) obj);
        }
        hb5.a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }

    public final zztc zza() {
        return (zztc) this.zza.getValue();
    }
}
