package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfb {
    private final zzbb zza;
    private final zzaz zzb;
    private final zzev zzc;
    private final zzbd zzd = new zzbd();
    private final zzdy zze;
    private final zzew zzf;
    private final zzey zzg;
    private final zzez zzh;
    private final zzfa zzi;

    public zzfb(zzbb zzbbVar, zzev zzevVar, zzdo zzdoVar, int i10, int i11, int i12, int i13) {
        this.zza = zzbbVar;
        this.zzc = zzevVar;
        this.zze = zzdoVar.zzd(zzbbVar.zzd(), new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzex
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                return this.zza.zzb(message);
            }
        });
        this.zzf = new zzew(this, i10);
        this.zzg = new zzey(this, i11);
        this.zzh = new zzez(this, i12);
        this.zzi = new zzfa(this, i13);
        zzeu zzeuVar = new zzeu(this);
        this.zzb = zzeuVar;
        zzbbVar.zze(zzeuVar);
    }

    public final void zza() {
        this.zze.zzl(null);
        this.zza.zzf(this.zzb);
    }

    public final /* synthetic */ boolean zzb(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            this.zzf.zza();
            return true;
        }
        if (i10 == 2) {
            this.zzg.zza();
            return true;
        }
        if (i10 == 3) {
            this.zzh.zza();
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        this.zzi.zza();
        return true;
    }

    public final /* synthetic */ void zzc() {
        this.zzf.zza();
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
    }

    public final /* synthetic */ zzbb zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzev zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzdy zzg() {
        return this.zze;
    }
}
