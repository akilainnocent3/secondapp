package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.hwr;
import defpackage.ojd;
import defpackage.ttr;
import defpackage.uf40;
import defpackage.v1b;
import defpackage.w4l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu extends zzg {
    private final zzcz zza;
    private String zzb;
    private ojd zzc;
    private final ttr zzd;

    public zzu(zzcz zzczVar, uf40 uf40Var) {
        this.zza = zzczVar;
        int i = zzby.zza;
        this.zzd = hwr.b(zzt.zza);
    }

    public static final /* synthetic */ Application zzl(zzu zzuVar) {
        return (Application) zzuVar.zzd.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, v1b v1bVar) {
        zzxw zzxwVarZzf = zzxx.zzf();
        zzxwVarZzf.zze(str);
        return zzxwVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, v1b v1bVar) {
        return new zzhg(new zzr(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, v1b v1bVar) {
        return new zzhg(new zzs(this, zzxnVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzj() {
        return 40;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzk() {
        return 39;
    }

    public zzu() {
        this(null, null, 3, null);
    }

    public zzu(zzcz zzczVar, uf40 uf40Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(new zzcz(w4l.b), null);
    }
}
