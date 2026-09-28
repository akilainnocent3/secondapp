package com.google.android.recaptcha.internal;

import defpackage.ej5;
import defpackage.hwr;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgu extends TimerTask {
    final /* synthetic */ zzgz zza;

    public zzgu(zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            int i = zzby.zza;
            ej5.c(((zzcr) hwr.b(zzgw.zza).getValue()).zza(), null, null, new zzgv(this.zza, null), 3);
        } catch (Exception unused) {
        }
    }
}
