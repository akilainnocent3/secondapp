package com.google.android.recaptcha.internal;

import defpackage.ej5;
import defpackage.hb5;
import defpackage.itg0;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.y5b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzip implements zzik {
    private final v5b zza;
    private final zzjb zzb;
    private final zzkt zzc;
    private final Map zzd;

    public zzip(v5b v5bVar, zzjb zzjbVar, zzkt zzktVar, Map map) {
        this.zza = v5bVar;
        this.zzb = zzjbVar;
        this.zzc = zzktVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzip zzipVar, zzzu zzzuVar, zziz zzizVar) throws zzdm {
        zzmf zzmfVarZzb = zzmf.zzb();
        int iZza = zzizVar.zza();
        zzjt zzjtVar = (zzjt) zzipVar.zzd.get(Integer.valueOf(zzzuVar.zzf()));
        if (zzjtVar == null) {
            itg0.b(5, 2, null);
            return;
        }
        int iZzg = zzzuVar.zzg();
        zzzt[] zzztVarArr = (zzzt[]) zzzuVar.zzj().toArray(new zzzt[0]);
        zzjtVar.zza(iZzg, zzizVar, (zzzt[]) Arrays.copyOf(zzztVarArr, zzztVarArr.length));
        if (iZza == zzizVar.zza()) {
            zzizVar.zzg(zzizVar.zza() + 1);
        }
        zzmfVarZzb.zzf();
        long jZza = zzmfVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzco.zza;
        int iZzk = zzzuVar.zzk();
        if (iZzk != 1) {
            zzco.zza(iZzk - 2, jZza);
        } else {
            hb5.a("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zziz zzizVar, v1b v1bVar) {
        Object objD = w5b.d(new zzim(zzizVar, list, this, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zziz zzizVar, v1b v1bVar) {
        Object objD = w5b.d(new zzin(exc, zzizVar, this, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zza(String str) {
        ej5.c(this.zza, null, null, new zzio(new zziz(this.zzb), this, str, null), 3);
    }
}
