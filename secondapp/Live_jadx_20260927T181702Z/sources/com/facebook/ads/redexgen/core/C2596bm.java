package com.facebook.ads.redexgen.core;

import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2596bm extends LinearLayout {
    public static final int A06 = (int) (XX.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C2900gi A04;
    public final C2597bn[] A05;

    public C2596bm(C2900gi c2900gi, int i10, int i11, int i12, int i13) {
        super(c2900gi);
        this.A00 = A06;
        this.A04 = c2900gi;
        setOrientation(0);
        this.A03 = i10;
        this.A01 = i12;
        this.A02 = i13;
        this.A05 = new C2597bn[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.A05[i14] = A00();
            addView(this.A05[i14]);
        }
        A01();
    }

    private C2597bn A00() {
        C2597bn c2597bn = new C2597bn(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c2597bn.setLayoutParams(starRatingViewParams);
        return c2597bn;
    }

    private void A01() {
        int i10 = 0;
        while (i10 < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i10].getLayoutParams();
            int i11 = i10 == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i11;
            i10++;
        }
        requestLayout();
    }

    private void A02(float f10) {
        for (int i10 = 0; i10 < i; i10++) {
            float fillRatio = Math.min(1.0f, f10 - i10);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i10].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i10) {
        this.A00 = i10;
        A01();
    }

    public void setRating(float f10) {
        A02(f10);
    }
}
