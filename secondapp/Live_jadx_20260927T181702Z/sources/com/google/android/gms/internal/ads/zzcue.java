package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcue implements zzbee {
    private zzcki zza;
    private final Executor zzb;
    private final zzctq zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzctt zzg = new zzctt();

    public zzcue(Executor executor, zzctq zzctqVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzctqVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcud
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza(zzcki zzckiVar) {
        this.zza = zzckiVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzdj(zzbed zzbedVar) {
        boolean z10 = this.zzf ? false : zzbedVar.zzj;
        zzctt zzcttVar = this.zzg;
        zzcttVar.zza = z10;
        zzcttVar.zzd = this.zzd.elapsedRealtime();
        zzcttVar.zzf = zzbedVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 31);
        sb2.append("Calling AFMA_updateActiveView(");
        sb2.append(string);
        sb2.append(gi.j.f86771d);
        String string2 = sb2.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
