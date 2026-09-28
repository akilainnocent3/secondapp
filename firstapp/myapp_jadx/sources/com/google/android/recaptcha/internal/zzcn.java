package com.google.android.recaptcha.internal;

import defpackage.pr0;
import defpackage.ux5;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcn implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strY = StringsKt.Y(String.valueOf(this.zzb / ((long) this.zza)), 10, ' ');
        String strY2 = StringsKt.Y(String.valueOf(this.zzc), 10, ' ');
        return pr0.a(ux5.a("avgExecutionTime: ", strY, " us| maxExecutionTime: ", strY2, " us| totalTime: "), StringsKt.Y(String.valueOf(this.zzb), 10, ' '), " us| #Usages: ", StringsKt.Y(String.valueOf(this.zza), 5, ' '));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzcn zzcnVar) {
        return Long.valueOf(this.zzb).compareTo(Long.valueOf(zzcnVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
