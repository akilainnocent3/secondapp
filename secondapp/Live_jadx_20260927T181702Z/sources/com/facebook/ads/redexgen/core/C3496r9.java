package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3496r9 {
    public final InterfaceC3500rD A00;
    public final String A01;
    public final Collection<C3509rN> A02;
    public final Collection<C3509rN> A03;
    public final List<Rect> A04;

    public C3496r9(String str, InterfaceC3500rD interfaceC3500rD, List<Rect> rects, Collection<C3509rN> collection, Collection<C3509rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC3500rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
