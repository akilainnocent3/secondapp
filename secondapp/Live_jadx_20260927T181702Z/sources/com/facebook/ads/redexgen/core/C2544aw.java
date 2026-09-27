package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2544aw extends RelativeLayout {
    public static InterfaceC2441Yh A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC2948hU A00;
    public C2900gi A01;
    public C0w A02;
    public M1 A03;
    public C2593bj A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, c.f161639q, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = XV.A0v;
        A07 = A08 * 10;
        A09 = (int) (XX.A02 * 15.0f);
        A05 = new C2128Lv();
    }

    public C2544aw(C2900gi c2900gi) {
        super(c2900gi);
        this.A01 = c2900gi;
        this.A02 = new C0w(c2900gi);
        YB.A0K(this.A02);
        this.A00 = new C7N();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C2738e5> A01(AbstractC3065jd abstractC3065jd) {
        if (abstractC3065jd == null) {
            return new ArrayList<>();
        }
        List<NR> listA2G = abstractC3065jd.A2G();
        ArrayList<C2738e5> arrayList = new ArrayList<>(listA2G.size());
        for (int i10 = 0; i10 < listA2G.size(); i10++) {
            arrayList.add(new C2738e5(i10, listA2G.size(), listA2G.get(i10)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(UK uk2, int i10) {
        ArrayList<C2738e5> arrayListA01 = A01(uk2.A13());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new M1(this.A01, arrayListA01, uk2.A13(), this.A01.A02().A0A(), uk2, A05, uk2.A13().A2E(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i10 == 0) {
            i10 = XX.A04.widthPixels;
        }
        this.A03.A0O(i10 - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(uk2, arrayListA01);
    }

    public final void A06(C2845fp c2845fp) {
        if (this.A03 != null) {
            this.A03.A0P(c2845fp);
        } else {
            this.A01.A08().ABC(A00(51, 7, 24), AbstractC2312Td.A1v, new C2313Te(A00(0, 51, 125)));
        }
        this.A02.A20(c2845fp);
    }

    public static InterfaceC2441Yh getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10 && this.A03 != null) {
            this.A03.A0O((i12 - i10) - A07, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        if (this.A04 != null) {
            this.A04.A00(i10);
        }
    }

    private void setupDotsLayout(UK uk2, ArrayList<C2738e5> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C2125Ls(this));
        this.A04 = new C2593bj(this.A01, uk2.A13().A28().A01(), arrayList.size());
        YB.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
