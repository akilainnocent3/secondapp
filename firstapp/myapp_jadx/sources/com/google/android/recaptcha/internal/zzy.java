package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.ay0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzy extends tje0 implements Function2 {
    final /* synthetic */ zzz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = zzzVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzy(this.zza, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zzyu zzyuVarZzf = zzyx.zzf();
        zzz zzzVar = this.zza;
        zzyw zzywVarZzb = zzz.zzb(zzzVar, Build.MANUFACTURER);
        zzyw zzywVarZzb2 = zzz.zzb(zzzVar, Build.MODEL);
        zzyw zzywVarZzb3 = zzz.zzb(zzzVar, Build.DEVICE);
        zzyw zzywVarZzb4 = zzz.zzb(zzzVar, Build.HARDWARE);
        zzyw zzywVarZzb5 = zzz.zzb(zzzVar, Build.FINGERPRINT);
        zzyw zzywVarZzb6 = zzz.zzb(zzzVar, Build.PRODUCT);
        zzyw zzywVarZzb7 = zzz.zzb(zzzVar, Build.BOARD);
        zzyw zzywVarZzb8 = zzz.zzb(zzzVar, Build.BRAND);
        zzyw zzywVarZzb9 = zzz.zzb(zzzVar, ay0.G(Build.SUPPORTED_ABIS, ",", "[", "]", null, 56));
        long j = Build.TIME;
        zzyv zzyvVarZzf = zzyw.zzf();
        zzyvVarZzf.zzv(j);
        zzyuVarZzf.zze(b.k(zzywVarZzb, zzywVarZzb2, zzywVarZzb3, zzywVarZzb4, zzywVarZzb5, zzywVarZzb6, zzywVarZzb7, zzywVarZzb8, zzywVarZzb9, (zzyw) zzyvVarZzf.zzk(), zzz.zzb(zzzVar, Build.ID), zzz.zzb(zzzVar, Build.BOOTLOADER), zzz.zzb(zzzVar, Build.DISPLAY), zzz.zzb(zzzVar, Build.TYPE), zzz.zzb(zzzVar, Build.TAGS)));
        return zzas.zzb(zzzVar, (zzyx) zzyuVarZzf.zzk());
    }
}
