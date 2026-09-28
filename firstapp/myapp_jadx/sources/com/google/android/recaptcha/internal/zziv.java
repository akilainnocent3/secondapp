package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zziv {
    private final zzmj zza;

    public zziv(int i) {
        this.zza = zzmj.zza(i);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return CollectionsKt.A0(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public zziv() {
        this(1);
    }
}
