package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C3070ji A01;
    public final AbstractC3065jd A02;
    public final C2900gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C2206Ow A07;
    public final AbstractC2200Oq A08;
    public final AbstractC2844fo A09;
    public final C2845fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public Z2(C2900gi c2900gi, VA va2, C2306Sx c2306Sx, WeakReference<Z1> weakReference, int i10, int i11, int i12, int i13, C3070ji c3070ji, String str) {
        super(c2900gi);
        this.A06 = new Y2();
        this.A03 = c2900gi;
        this.A04 = va2;
        this.A01 = c3070ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC3065jd abstractC3065jdA0F = this.A01.A0F();
        if (abstractC3065jdA0F == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i10, i13, i11, i12);
        LinearLayout linearLayout = new LinearLayout(c2900gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c2306Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(abstractC3065jdA0F);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, c.G, a.E7, c.G, c.D, 45, c.D, a.E7, c.E, 46, 39, c.G, 37, c.H, a.E7, 34, 44, a.E7, 28, c.D, 39, 39, 40, 45, a.E7, c.E, c.H, a.E7, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, yr.a.f159811k, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C2206Ow A02(AbstractC3065jd abstractC3065jd) {
        C2158Na c2158NaA00;
        NR nrA29 = abstractC3065jd.A29();
        PW pw2 = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                int i13 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i13 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 4);
                    i13++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2441Yh
            public final void A4j(String str) {
                P2.A00(this.A00.A03).A07(new Intent(str + A00(0, 1, 92) + this.A00.A0B));
            }
        };
        if (getOrientation() == 1) {
            c2158NaA00 = abstractC3065jd.A28().A01();
        } else {
            NN nnA28 = abstractC3065jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            c2158NaA00 = nnA28.A00();
        }
        C2206Ow c2206Ow = new C2206Ow(this.A03, A0F, c2158NaA00, nrA29.A0J().A06(), A09(32, 31, 110), this.A04, pw2, this.A0A, this.A06, abstractC3065jd.A2A());
        c2206Ow.setInfo(nrA29.A0I(), nrA29.A0J(), this.A01.A7O(), abstractC3065jd.A2C().A01(), null, null);
        if (C2350Up.A1N(this.A03)) {
            c2206Ow.A0k();
        }
        return c2206Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC2200Oq A04(C2306Sx c2306Sx) {
        final ViewOnClickListenerC2459Yz viewOnClickListenerC2459Yz = new ViewOnClickListenerC2459Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c2306Sx, this.A01) && videoUrl != null) {
            C17446g videoView = new C17446g(this.A03, this.A04, c2306Sx, this.A05, viewOnClickListenerC2459Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C2350Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C2362Vb c2362VbA0H = this.A01.A0H();
        if (c2362VbA0H == null) {
            return null;
        }
        final C2900gi c2900gi = this.A03;
        final VI vi2 = this.A05;
        final AbstractC3065jd abstractC3065jd = this.A02;
        C17546q c17546qA0I = new AbstractC2200Oq(c2900gi, viewOnClickListenerC2459Yz, vi2, abstractC3065jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C2553b5 A00;

            {
                super(c2900gi, viewOnClickListenerC2459Yz, vi2, abstractC3065jd);
                this.A00 = new C2553b5(c2900gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2200Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2200Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC2200Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C17546q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C2201Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2200Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(c2362VbA0H.getUrl());
        if (C2350Up.A1P(this.A03)) {
            setViewAsCTA(c17546qA0I);
        }
        return c17546qA0I;
    }

    private C2185Ob A06() {
        return new C2185Ob(this);
    }

    private C2845fp A07(int i10, int i11, int i12, int i13) {
        C2845fp c2845fp = new C2845fp(this, i10, i11, true, new WeakReference(this.A09), this.A03);
        c2845fp.A0W(i12);
        c2845fp.A0X(i13);
        return c2845fp;
    }

    private void A0C() {
        String strA0M = this.A01.A0M();
        if (!TextUtils.isEmpty(strA0M)) {
            X6 x10 = new X6();
            C2900gi c2900gi = this.A03;
            Uri uriA00 = XB.A00(strA0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x10, c2900gi, uriA00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC2191Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC2463Zd abstractC2463ZdA01 = AbstractC2464Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (abstractC2463ZdA01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(abstractC2463ZdA01, new FrameLayout.LayoutParams(-1, -1));
        abstractC2463ZdA01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C2306Sx c2306Sx, C3070ji c3070ji) {
        String strA0e = c3070ji.A0e();
        if (TextUtils.isEmpty(strA0e)) {
            return false;
        }
        String videoUrl = c2306Sx.A0T(strA0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC2200Oq abstractC2200Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC2200Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C2845fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
