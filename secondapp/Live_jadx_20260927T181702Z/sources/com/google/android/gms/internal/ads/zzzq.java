package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzzq implements Comparator {
    static final /* synthetic */ zzzq zza = new zzzq();

    private /* synthetic */ zzzq() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzp) Collections.max((List) obj)).compareTo((zzzp) Collections.max((List) obj2));
    }
}
