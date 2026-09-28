package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzeo extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzeo zzeoVar = new zzeo(this.zzb, this.zzc, this.zzd, v1bVar);
        zzeoVar.zze = obj;
        return zzeoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeo) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x005a A[Catch: Exception -> 0x006a, zzcg -> 0x007e, TryCatch #2 {zzcg -> 0x007e, Exception -> 0x006a, blocks: (B:5:0x0009, B:16:0x0051, B:19:0x005a, B:20:0x0068, B:8:0x0011, B:13:0x003e, B:11:0x001e), top: B:28:0x0005 }] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        zzgr zzgrVar;
        zzeo zzeoVar;
        String str;
        y5b y5bVar = y5b.a;
        int i = this.zza;
        try {
            if (i != 0) {
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    zzgrVar = (zzgr) this.zze;
                    uj50.b(obj);
                    zzeoVar = this;
                }
                str = (String) obj;
                if (str.length() != 0) {
                    return str;
                }
                throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
            }
            uj50.b(obj);
            zzgrVar = (zzgr) this.zze;
            zzeq zzeqVar = this.zzb;
            long j = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            zzeq.zzd(zzeqVar, j, recaptchaAction);
            zzdw zzdwVar = zzeqVar.zzb;
            String strZzb = zzgrVar.zza().zzb();
            this.zze = zzgrVar;
            this.zza = 1;
            zzeoVar = this;
            obj = zzdwVar.zza(strZzb, recaptchaAction, j, zzeoVar);
            if (obj != y5bVar) {
            }
            return y5bVar;
            zzeoVar.zze = null;
            zzeoVar.zza = 2;
            obj = ((zzhg) obj).zza(zzgrVar.zza(), zzeoVar);
            if (obj == y5bVar) {
                return y5bVar;
            }
            str = (String) obj;
            if (str.length() != 0) {
                return str;
            }
            throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzX, e2.getMessage(), null, 8, null);
        }
    }
}
