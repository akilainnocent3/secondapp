package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1840Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC3516rY A00;
    public InterfaceC3504rI A01;
    public C3492r5 A02;
    public final InterfaceC3505rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC3504rI A03 = new C1841Ap(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C1840Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC3516rY interfaceC3516rY, InterfaceC3505rJ interfaceC3505rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC3516rY;
        this.A04 = interfaceC3505rJ;
    }

    public static C1840Ao A01() {
        return new C1840Ao(new ViewpointQeConfig(), new C1843Ar(), null);
    }

    private void A05(AbstractC3507rL abstractC3507rL, InterfaceC3512rQ interfaceC3512rQ, InterfaceC1838Al interfaceC1838Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C3492r5.A01(this.A05, abstractC3507rL, interfaceC3512rQ, interfaceC1838Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C3513rU c3513rU) {
        C3492r5 c3492r5 = this.A02;
        if (c3492r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c3513rU != null) {
                c3492r5.A07(dspViewableNode, c3513rU);
            } else {
                c3492r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C3513rU c3513rU, C3509rN c3509rN) {
        C3492r5 c3492r5 = this.A02;
        if (c3492r5 != null && dspViewableNode != null && c3509rN != null) {
            if (this.A05.A00 && c3513rU != null) {
                c3509rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c3509rN.A08 + c3513rU;
                c3492r5.A08(dspViewableNode, c3513rU, c3509rN);
            } else {
                c3492r5.A09(dspViewableNode, c3509rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C3509rN<?, ?> c3509rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c3509rN);
    }

    public final void A0A(AbstractC3507rL abstractC3507rL, View view) {
        if (abstractC3507rL != null && view != null) {
            A05(abstractC3507rL, new C1842Aq(view, this.A00), new C16321u(null), null);
        }
    }
}
