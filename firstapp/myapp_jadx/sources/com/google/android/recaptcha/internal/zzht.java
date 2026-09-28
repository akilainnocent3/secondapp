package com.google.android.recaptcha.internal;

import defpackage.hwr;
import defpackage.ttr;
import defpackage.v1b;
import defpackage.w5b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzht {
    private final ttr zza;
    private final ttr zzb;

    public zzht() {
        int i = zzby.zza;
        this.zza = hwr.b(zzhr.zza);
        this.zzb = hwr.b(zzhs.zza);
    }

    public static final /* synthetic */ zzhn zza(zzht zzhtVar) {
        return (zzhn) zzhtVar.zzb.getValue();
    }

    public static final /* synthetic */ zzig zzb(zzht zzhtVar) {
        return (zzig) zzhtVar.zza.getValue();
    }

    public final Object zzc(String str, zzzd zzzdVar, v1b v1bVar) {
        return w5b.d(new zzhq(this, str, zzzdVar, null), v1bVar);
    }
}
