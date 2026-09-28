package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import defpackage.cm8;
import defpackage.ej5;
import defpackage.hwr;
import defpackage.ttr;
import defpackage.txf0;
import defpackage.v1b;
import defpackage.y5b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzly extends zzg {
    public cm8 zza;
    public zzik zzb;
    private zzxn zze;
    private final ttr zzi;
    private final ttr zzj;
    private final ttr zzk;
    private final ttr zzl;
    private final ttr zzm;
    private final ttr zzn;
    private final ttr zzo;
    private final Map zzc = zzlz.zza();
    private final Map zzd = new LinkedHashMap();
    private final zzdj zzf = new zzdj(zzmc.zza);
    private final zzmf zzg = zzmf.zzc();
    private final zzld zzh = new zzld(this);

    public zzly() {
        int i = zzby.zza;
        this.zzi = hwr.b(zzlm.zza);
        this.zzj = hwr.b(zzln.zza);
        this.zzk = hwr.b(zzlo.zza);
        this.zzl = hwr.b(zzlp.zza);
        this.zzm = hwr.b(zzlq.zza);
        this.zzn = hwr.b(zzlr.zza);
        this.zzo = hwr.b(zzls.zza);
    }

    private final Application zzC() {
        return (Application) this.zzm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcr zzD() {
        return (zzcr) this.zzn.getValue();
    }

    public static final /* synthetic */ zzcy zzm(zzly zzlyVar) {
        return (zzcy) zzlyVar.zzj.getValue();
    }

    public static final /* synthetic */ zzgs zzo(zzly zzlyVar) {
        return (zzgs) zzlyVar.zzo.getValue();
    }

    public static final /* synthetic */ zzib zzp(zzly zzlyVar) {
        return (zzib) zzlyVar.zzl.getValue();
    }

    public static final /* synthetic */ zzig zzq(zzly zzlyVar) {
        return (zzig) zzlyVar.zzk.getValue();
    }

    public static final /* synthetic */ Object zzu(zzly zzlyVar, v1b v1bVar) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(CollectionsKt.B0(zzxnVar.zzQ()));
        zzjb zzjbVar = new zzjb(zzisVar, zzdoVar, new zzct());
        zzkv zzkvVar = new zzkv(zzkuVar, new zzks());
        zzjbVar.zze(3, zzC());
        zzjbVar.zze(5, zzlb.class.getMethod("cs", new Object[0].getClass()));
        zzjbVar.zze(6, new zzkw(zzC()));
        zzjbVar.zze(7, new zzky());
        zzjbVar.zze(8, new zzlc(zzC()));
        zzjbVar.zze(9, new zzkz(zzC()));
        zzjbVar.zze(10, new zzkx(zzC()));
        return new zzip(zzD().zzd(), zzjbVar, zzkvVar, zzij.zza());
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, v1b v1bVar) {
        zzxw zzxwVarZzf = zzxx.zzf();
        zzxwVarZzf.zze(str);
        return zzxwVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, v1b v1bVar) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzc(zzcg zzcgVar, v1b v1bVar) {
        Intrinsics.g(zzcgVar.zza(), zzcd.zzb);
        return Unit.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, v1b v1bVar) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zze(String str, long j, Exception exc, v1b v1bVar) {
        exc.getMessage();
        cm8 cm8Var = (cm8) this.zzd.remove(str);
        if (cm8Var != null) {
            cm8Var.F(exc);
        }
        return Unit.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, v1b v1bVar) {
        return ((exc instanceof txf0) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzj() {
        return 33;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzk() {
        return 32;
    }

    public final zzdj zzn() {
        return this.zzf;
    }

    public final zzld zzr() {
        return this.zzh;
    }

    public final Object zzv(v1b v1bVar) {
        return ej5.d(zzD().zzb().getCoroutineContext(), new zzma((zzmb) this.zzi.getValue(), zzC(), null), v1bVar);
    }

    public final Object zzw(v1b v1bVar) {
        Object objD = ej5.d(zzD().zzb().getCoroutineContext(), new zzlf(this, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    public final cm8 zzz() {
        cm8 cm8Var = this.zza;
        if (cm8Var != null) {
            return cm8Var;
        }
        return null;
    }
}
