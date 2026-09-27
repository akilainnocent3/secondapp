package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass62 extends FrameLayout implements InterfaceC2047Is {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public C2845fp A00;
    public final int A01;
    public final AbstractC3065jd A02;
    public final C2900gi A03;
    public final VA A04;
    public final Y2 A05;
    public final InterfaceC2673d1 A06;
    public final C2684dC A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{q.f83619w, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, c.B, 28, 31, 43, 58, 55, 59, 48, a.f159811k, 59, c.f161640r, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, c.f161635m, c.f161638p, 4, c.f161636n, 56, c.f161646x, 8, c.f161643u, c.f161647y, 4, 2, 90, 85, 64, 93, 66, 81, 117, 80, 112, 85, 64, 85, 118, 65, 90, 80, 88, 81, c.E, c.G, c.f161635m, 28, 13, 2, 7, 13, 5, c.f161648z, 9, 5, c.A, 52, c.C, c.f161640r, 5};
    }

    static {
        A02();
    }

    public AnonymousClass62(C2900gi c2900gi, VA va2, InterfaceC2673d1 interfaceC2673d1, AbstractC3065jd abstractC3065jd, String str, int i10, Y2 y10) {
        super(c2900gi);
        this.A03 = c2900gi;
        this.A04 = va2;
        this.A02 = abstractC3065jd;
        this.A08 = str;
        this.A06 = interfaceC2673d1;
        this.A01 = i10;
        C2684dC preloadedDynamicWebViewController = AbstractC2685dD.A02(abstractC3065jd.A1D());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C2684dC(this.A03, abstractC3065jd, va2, i10);
            AbstractC2685dD.A03(abstractC3065jd, this.A07);
            this.A09 = false;
        }
        if (y10 != null) {
            this.A05 = y10;
            this.A07.A0Z(y10);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new JJ(this));
        this.A07.A0a(interfaceC2673d1);
        EnumC2410Xc.A04(this, EnumC2410Xc.A0B);
        if (C2350Up.A1z(c2900gi)) {
            c2900gi.A0B().AKp(this.A07.A0O(), abstractC3065jd.A2E(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A66();
            this.A07.A0X();
        } else {
            this.A03.A0F().A67();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ADm(this);
                    }
                    if (C2350Up.A1z(this.A03)) {
                        VM vmA0B = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        vmA0B.ADb();
                    }
                } else {
                    AKD();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C2684dC.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC3065jd abstractC3065jd) {
        intent.putExtra(A01(157, 8, 110), WK.A07);
        intent.putExtra(A01(130, 18, 58), abstractC3065jd);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC3065jd abstractC3065jd) {
        AdActivityIntent adActivityIntentA05 = C2404Wu.A05(this.A03);
        A05(adActivityIntentA05, abstractC3065jd);
        try {
            C2404Wu.A0B(this.A03, adActivityIntentA05);
        } catch (Exception e10) {
            this.A03.A08().ABC(A01(SignalKey.EVENT_ID, 11, 42), AbstractC2312Td.A0D, new C2313Te(e10));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e10);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2579bV c2579bV = new C2579bV(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A2A());
        HashMap map = new HashMap();
        map.put(A01(118, 12, 105), A01(148, 9, 96));
        c2579bV.A05(this.A02.A2E(), str, map);
    }

    public final void A08() {
        YB.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void A9f() {
        A07(this.A02.A29().A0J().A05());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void A9g(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void A9k() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AAm() {
        new Handler(Looper.getMainLooper()).post(new JF(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AE0() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AE4() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AEu(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AFz() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AGX(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AGZ(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AGo(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void AKD() {
        if (this.A06 != null) {
            this.A06.ADm(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047Is
    public final void close() {
    }

    public VA getAdEventManager() {
        return this.A04;
    }

    public C2684dC getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C2845fp c2845fp) {
        this.A00 = c2845fp;
        this.A07.A0e(c2845fp);
    }
}
