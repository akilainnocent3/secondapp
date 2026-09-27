package com.inmobi.media;

import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4049um implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dr.z0 z0Var = (dr.z0) obj;
        System.out.println((Object) (((C3924pl) z0Var.j()).f57342c + " " + z0Var.k()));
        Double d10 = (Double) z0Var.k();
        dr.z0 z0Var2 = (dr.z0) obj2;
        System.out.println((Object) (((C3924pl) z0Var2.j()).f57342c + " " + z0Var2.k()));
        return jr.g.l(d10, (Double) z0Var2.k());
    }
}
