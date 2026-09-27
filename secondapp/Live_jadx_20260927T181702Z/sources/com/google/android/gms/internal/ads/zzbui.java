package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbui implements zzhaq {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final nj.t1 zzb;

    public zzbui(nj.t1 t1Var, String str, zzbtp zzbtpVar, zzbto zzbtoVar) {
        this.zzb = t1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final nj.t1 zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final nj.t1 zzb(final Object obj) {
        return zzhbi.zzj(this.zzb, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzbuh
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ nj.t1 zza(Object obj2) {
                return this.zza.zzc(obj, (zzbtj) obj2);
            }
        }, zzcff.zzh);
    }

    public final /* synthetic */ nj.t1 zzc(Object obj, zzbtj zzbtjVar) throws JSONException {
        zzcfk zzcfkVar = new zzcfk();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbpd.zzo.zzb(string, new zzbug(this, zzcfkVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbtjVar.zzb(this.zza, jSONObject);
        return zzcfkVar;
    }
}
