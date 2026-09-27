package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzibf extends zzibh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzibf(zzibg zzibgVar) {
        super(zzibgVar.zza);
        Objects.requireNonNull(zzibgVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
