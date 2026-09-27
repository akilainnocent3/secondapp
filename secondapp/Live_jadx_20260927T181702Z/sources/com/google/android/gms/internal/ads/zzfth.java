package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzfth implements Comparator {
    static final /* synthetic */ zzfth zza = new zzfth();

    private /* synthetic */ zzfth() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzfsy zzfsyVar = (zzfsy) obj2;
        zzfsy zzfsyVar2 = (zzfsy) obj;
        int iCompare = Double.compare(zzfsyVar.zze(), zzfsyVar2.zze());
        return iCompare == 0 ? Long.compare(zzfsyVar2.zzd(), zzfsyVar.zzd()) : iCompare;
    }
}
