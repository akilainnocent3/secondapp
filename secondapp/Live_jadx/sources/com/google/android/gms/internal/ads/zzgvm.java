package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgvm {
    private static final zzgvm zza = new zzgvk();
    private static final zzgvm zzb = new zzgvl(-1);
    private static final zzgvm zzc = new zzgvl(1);

    public /* synthetic */ zzgvm(byte[] bArr) {
    }

    public static zzgvm zzg() {
        return zza;
    }

    public abstract zzgvm zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgvm zzb(int i10, int i11);

    public abstract zzgvm zzc(boolean z10, boolean z11);

    public abstract zzgvm zzd(boolean z10, boolean z11);

    public abstract int zze();
}
