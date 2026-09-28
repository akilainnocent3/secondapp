package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import defpackage.hwr;
import defpackage.ttr;
import defpackage.v1b;
import defpackage.w4l;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class zzba implements zzar {
    private final zzbo zza;
    private final zzda zzb;
    private boolean zzc;
    private String zzd;
    private final ttr zze;

    public zzba(zzbo zzboVar, zzda zzdaVar) {
        this.zza = zzboVar;
        this.zzb = zzdaVar;
        this.zzc = true;
        this.zzd = "";
        int i = zzby.zza;
        this.zze = hwr.b(zzaz.zza);
    }

    public static final /* synthetic */ Application zzb(zzba zzbaVar) {
        return (Application) zzbaVar.zze.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzp(zzqm zzqmVar) {
        zzpp zzppVarZzg = zzpp.zzg();
        byte[] bArrZzo = zzqmVar.zzo();
        byte[] bArrZzd = zzpg.zza().zza(zzppVarZzg.zzi(bArrZzo, 0, bArrZzo.length), StandardCharsets.UTF_8).zzd();
        zzqm zzqmVarZzl = zzqm.zzl(bArrZzd, 0, bArrZzd.length);
        zzpp zzppVarZzh = zzpp.zzh();
        byte[] bArrZzo2 = zzqmVarZzl.zzo();
        return zzppVarZzh.zzi(bArrZzo2, 0, bArrZzo2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, v1b v1bVar) {
        return zzam.zza(this, str, v1bVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, v1b v1bVar) {
        return zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), v1bVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, v1b v1bVar) {
        return new zzhg(new zzax(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, v1b v1bVar) {
        return new zzhg(new zzay(this, zzxpVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, v1b v1bVar) {
        int i;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i = 44;
            } else if (errorCode == -12) {
                i = 39;
            } else if (errorCode == -3) {
                i = 30;
            } else if (errorCode == -2) {
                i = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i = 54;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i = 53;
                        break;
                    case -17:
                        i = 52;
                        break;
                    case -16:
                        i = 43;
                        break;
                    case -15:
                        i = 42;
                        break;
                    case -14:
                        i = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i = 36;
                                break;
                            case -8:
                                i = 35;
                                break;
                            case -7:
                                i = 34;
                                break;
                            case -6:
                                i = 33;
                                break;
                            case -5:
                                i = 32;
                                break;
                            default:
                                i = 2;
                                break;
                        }
                        break;
                }
            } else {
                i = 28;
            }
        } else {
            i = 45;
        }
        zzys zzysVarZzf = zzyt.zzf();
        zzysVarZzf.zzq(i);
        zzysVarZzf.zzr(15);
        return zzas.zza(this, (zzyt) zzysVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final void zzh(zzyg zzygVar) {
        this.zzd = zzp(zzygVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return this.zzc;
    }

    public final void zzo(boolean z) {
        this.zzc = false;
    }

    public zzba() {
        this(null, null, 3, null);
    }

    public zzba(zzbo zzboVar, zzda zzdaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(new zzbo(28800000L), new zzcz(w4l.b));
    }
}
