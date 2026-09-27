package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgsk implements zzgsx {
    public static zzgsk zzc(char c10) {
        return new zzgsh(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
