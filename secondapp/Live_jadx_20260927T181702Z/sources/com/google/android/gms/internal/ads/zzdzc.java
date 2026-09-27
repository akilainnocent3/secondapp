package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdzc implements zzfoz {
    private final zzdyu zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdzc(zzdyu zzdyuVar, Set set, Clock clock) {
        this.zzb = zzdyuVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzb zzdzbVar = (zzdzb) it.next();
            this.zzd.put(zzdzbVar.zzc(), zzdzbVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfos zzfosVar, boolean z10) {
        zzdzb zzdzbVar = (zzdzb) this.zzd.get(zzfosVar);
        if (zzdzbVar == null) {
            return;
        }
        String str = true != z10 ? "f." : "s.";
        Map map = this.zza;
        zzfos zzfosVarZzb = zzdzbVar.zzb();
        if (map.containsKey(zzfosVarZzb)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfosVarZzb)).longValue();
            zzdyu zzdyuVar = this.zzb;
            String strZza = zzdzbVar.zza();
            Map mapZzc = zzdyuVar.zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb2.append(str);
            sb2.append(jElapsedRealtime);
            mapZzc.put("label.".concat(strZza), sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdM(zzfos zzfosVar, String str) {
        this.zza.put(zzfosVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdN(zzfos zzfosVar, String str, Throwable th2) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfosVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfosVar)) {
            zze(zzfosVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdO(zzfos zzfosVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfosVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfosVar)) {
            zze(zzfosVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdL(zzfos zzfosVar, String str) {
    }
}
