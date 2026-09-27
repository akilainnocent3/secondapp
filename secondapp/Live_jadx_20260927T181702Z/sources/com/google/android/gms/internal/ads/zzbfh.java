package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfh implements Comparator {
    public zzbfh(zzbfj zzbfjVar) {
        Objects.requireNonNull(zzbfjVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbfm zzbfmVar = (zzbfm) obj;
        zzbfm zzbfmVar2 = (zzbfm) obj2;
        int i10 = zzbfmVar.zzc - zzbfmVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzbfmVar.zza, zzbfmVar2.zza);
    }
}
