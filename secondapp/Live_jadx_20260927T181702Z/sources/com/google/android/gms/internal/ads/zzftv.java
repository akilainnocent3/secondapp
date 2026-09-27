package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzftv {
    private final zzfuh zza;
    private final zzfuh zzb;
    private final boolean zzc;
    private final zzftz zzd;
    private final zzfuc zze;

    private zzftv(zzftz zzftzVar, zzfuc zzfucVar, zzfuh zzfuhVar, zzfuh zzfuhVar2, boolean z10) {
        this.zzd = zzftzVar;
        this.zze = zzfucVar;
        this.zza = zzfuhVar;
        if (zzfuhVar2 == null) {
            this.zzb = zzfuh.NONE;
        } else {
            this.zzb = zzfuhVar2;
        }
        this.zzc = z10;
    }

    public static zzftv zza(zzftz zzftzVar, zzfuc zzfucVar, zzfuh zzfuhVar, zzfuh zzfuhVar2, boolean z10) {
        zzfvs.zzb(zzftzVar, "CreativeType is null");
        zzfvs.zzb(zzfucVar, "ImpressionType is null");
        zzfvs.zzb(zzfuhVar, "Impression owner is null");
        if (zzfuhVar == zzfuh.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzftzVar == zzftz.DEFINED_BY_JAVASCRIPT && zzfuhVar == zzfuh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfucVar == zzfuc.DEFINED_BY_JAVASCRIPT && zzfuhVar == zzfuh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzftv(zzftzVar, zzfucVar, zzfuhVar, zzfuhVar2, z10);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfvo.zzc(jSONObject, "impressionOwner", this.zza);
        zzfvo.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        zzfvo.zzc(jSONObject, "creativeType", this.zzd);
        zzfvo.zzc(jSONObject, "impressionType", this.zze);
        zzfvo.zzc(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
