package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes4.dex */
public class zzsj extends zzsh implements zztt {
    public zzsj(zzsk zzskVar) {
        super(zzskVar);
    }

    @Override // com.google.android.recaptcha.internal.zzsh, com.google.android.recaptcha.internal.zztr
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzsk zzl() {
        boolean zZzL = ((zzsk) this.zza).zzL();
        zzsn zzsnVar = this.zza;
        if (!zZzL) {
            return (zzsk) zzsnVar;
        }
        ((zzsk) zzsnVar).zzb.zzg();
        return (zzsk) super.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzsh
    public final void zzo() {
        super.zzo();
        if (((zzsk) this.zza).zzb != zzsd.zzd()) {
            zzsk zzskVar = (zzsk) this.zza;
            zzskVar.zzb = zzskVar.zzb.clone();
        }
    }
}
