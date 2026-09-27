package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2091Kk implements Comparable<C2091Kk> {
    public final int A00;
    public final C2082Kb A01;

    public C2091Kk(int i10, C2082Kb c2082Kb) {
        this.A00 = i10;
        this.A01 = c2082Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2091Kk c2091Kk) {
        return Integer.compare(this.A00, c2091Kk.A00);
    }
}
