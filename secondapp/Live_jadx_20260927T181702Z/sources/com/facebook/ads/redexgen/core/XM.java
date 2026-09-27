package com.facebook.ads.redexgen.core;

import android.graphics.Rect;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class XM {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C3509rN<C2357Uw, V1> c3509rN) {
        if (c3509rN.A06.A05()) {
            return c3509rN.A07.A07();
        }
        if (!c3509rN.A06.A06()) {
            return true;
        }
        return c3509rN.A07.A06();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    private boolean A01(C3509rN<C2357Uw, V1> c3509rN, InterfaceC3500rD interfaceC3500rD) {
        boolean z10;
        int i10;
        int i11;
        float fA9X = -1.0f;
        try {
            fA9X = interfaceC3500rD.A9X(c3509rN);
        } catch (IllegalStateException unused) {
        }
        if (A02[6].length() == 7) {
            throw new RuntimeException();
        }
        A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
        if (fA9X > 0.0f && A00(c3509rN)) {
            return true;
        }
        if (c3509rN.A06.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c3509rN)) {
            return true;
        }
        interfaceC3500rD.A9W(this.A00);
        if (A02[2].length() != 2) {
            A02[2] = "WH3ZGQ";
            interfaceC3500rD.A8D(c3509rN, this.A01);
            if (this.A00.bottom - this.A00.top > 0) {
                i10 = this.A01.bottom;
                i11 = this.A00.top;
                if (A02[7].length() != 7) {
                    throw new RuntimeException();
                }
                A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
                z10 = i10 - i11 > 0;
            }
            return !z10 && A00(c3509rN);
        }
        interfaceC3500rD.A8D(c3509rN, this.A01);
        if (this.A00.bottom - this.A00.top > 0) {
            i10 = this.A01.bottom;
            i11 = this.A00.top;
            if (A02[7].length() != 7) {
                throw new RuntimeException();
            }
            A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
            if (i10 - i11 > 0) {
            }
        }
        if (z10) {
        }
        if (z10) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C3509rN<C2357Uw, V1> c3509rN, InterfaceC3500rD interfaceC3500rD) {
        if (c3509rN.A07.A04() && A01(c3509rN, interfaceC3500rD)) {
            c3509rN.A07.A01();
            c3509rN.A06.A02().ABx(c3509rN.A06.A03(), c3509rN.A06.A04());
        }
        if (c3509rN.A07.A05() && C2350Up.A1l(c3509rN.A06.A01())) {
            c3509rN.A07.A02();
            c3509rN.A06.A02().ABL(c3509rN.A06.A03(), c3509rN.A06.A04());
        }
    }
}
