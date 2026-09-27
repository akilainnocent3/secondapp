package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnb {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzhnb(zzhmy zzhmyVar, byte[] bArr) {
        this.zza = new HashMap(zzhmyVar.zzd());
        this.zzb = new HashMap(zzhmyVar.zze());
    }

    public static zzhmy zza() {
        return new zzhmy(null);
    }

    private final Object zzg(zzhdc zzhdcVar, Class cls) throws GeneralSecurityException {
        zzhmz zzhmzVar = new zzhmz(zzhdcVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhmzVar)) {
            return ((zzhmx) map.get(zzhmzVar)).zza(zzhdcVar);
        }
        String string = zzhmzVar.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 102);
        sb2.append("No PrimitiveConstructor for ");
        sb2.append(string);
        sb2.append(" available, see https://developers.google.com/tink/faq/registration_errors");
        throw new GeneralSecurityException(sb2.toString());
    }

    public final Object zzb(zzhdc zzhdcVar, Class cls) throws GeneralSecurityException {
        return zzg(zzhdcVar, cls);
    }

    public final Object zzc(zzhdo zzhdoVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final zzhnd zzhndVar = (zzhnd) map.get(cls);
        return zzhndVar.zze(zzhdoVar, new zzhnc() { // from class: com.google.android.gms.internal.ads.zzhna
            @Override // com.google.android.gms.internal.ads.zzhnc
            public final /* synthetic */ Object zza(zzhdl zzhdlVar) {
                return this.zza.zzf(zzhndVar, zzhdlVar);
            }
        });
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }

    public final /* synthetic */ Object zzf(zzhnd zzhndVar, zzhdl zzhdlVar) {
        return zzg(zzhdlVar.zza(), zzhndVar.zzb());
    }
}
