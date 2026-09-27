package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zziet implements zzifv {
    private static final zzifa zzb = new zzier();
    private final zzifa zza;

    public zziet() {
        zzidk zzidkVarZza = zzidk.zza();
        int i10 = zzica.zza;
        zzies zziesVar = new zzies(zzidkVarZza, zzb);
        byte[] bArr = zziee.zzb;
        this.zza = zziesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifv
    public final zzifu zza(Class cls) {
        int i10 = zzifw.zza;
        if (!zzidr.class.isAssignableFrom(cls)) {
            int i11 = zzica.zza;
        }
        zziez zziezVarZzc = this.zza.zzc(cls);
        if (zziezVarZzc.zza()) {
            int i12 = zzica.zza;
            return zzifg.zzh(zzifw.zzF(), zzide.zza(), zziezVarZzc.zzb());
        }
        int i13 = zzica.zza;
        return zziff.zzm(cls, zziezVarZzc, zzifj.zza(), zziep.zza(), zzifw.zzF(), zziezVarZzc.zzc() + (-1) != 1 ? zzide.zza() : null, zziey.zza());
    }
}
