package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class PZ extends RelativeLayout implements InterfaceC2442Yi {
    public static byte[] A0G;
    public static final String A0H;
    public static final int A0I;
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public final InterfaceC2268Rk A06;
    public final LinearLayout A07;
    public final C2262Re A08;
    public final C2900gi A09;
    public final VA A0A;
    public final InterfaceC2441Yh A0B;
    public final C2529ah A0C;
    public final InterfaceC2538aq A0D;
    public final M3 A0E;
    public final InterfaceC2543av A0F;

    public static String A0D(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0G = new byte[]{90, 112, 112, 125, 112, c.f161646x, 63, a.f159811k, 112, 19, 63, 62, 36, 53, 62, 36, 112, 28, 63, 49, 52, 53, 52, 112, 4, 57, a.f159811k, 53, 106, 112, 48, c.D, c.D, c.A, c.D, 118, 85, 91, 94, c.D, 124, 83, 84, 83, 73, 82, c.D, 110, 83, 87, 95, 0, c.D, 95, 117, 117, rg.a.f127263w, 117, c.C, 58, 52, 49, 117, 6, 33, 52, 39, 33, 117, 1, 60, 56, 48, 111, 117, 117, 95, 95, 82, 95, 45, c.D, c.f161636n, c.f161639q, c.f161640r, 17, c.f161636n, c.D, 95, 58, 17, c.E, 95, 43, c.f161648z, c.f161643u, c.D, 69, 95, 109, 71, 71, 74, 71, 52, 4, c.f161647y, 8, c.f161635m, c.f161635m, 71, 53, 2, 6, 3, c.H, 71, 51, c.f161638p, 10, 2, 93, 71, 87, 125, 125, 112, 125, c.f161638p, 56, 46, 46, 52, 50, 51, 125, c.E, 52, 51, 52, 46, 53, 125, 9, 52, 48, 56, 103, 125, 42, c.D, 48, 48, a.f159811k, 48, 88, q.A, 126, 116, 124, 117, 98, 48, 68, 121, 125, 117, 42, 48, 97, 81, 76, 84, 80, 70, 81, 3, 80, 70, 80, 80, 74, 76, 77, 3, 71, 66, 87, 66, 3, 79, 76, 68, 68, 70, 71, 3, 99, 3, 126, 125, 112, 106, 107, 37, 125, 115, 126, q.A, 116, 67, 83, 78, 86, 82, 68, 83, 116, 115, 109, 85, 90, 95, 83, 88, 66, 98, 89, 93, 83, 88, 37, 44, 35, 41, 33, 40, 63, c.C, 36, 32, 40};
    }

    static {
        A0E();
        A0H = PZ.class.getSimpleName();
        A0I = XV.A0A;
    }

    public PZ(C2262Re c2262Re, C2900gi c2900gi, VA va2, InterfaceC2441Yh interfaceC2441Yh, boolean z10) {
        M3 m10;
        super(c2900gi);
        this.A06 = new C2212Pc(this);
        this.A05 = true;
        this.A01 = -1L;
        this.A03 = true;
        this.A08 = c2262Re;
        this.A0A = va2;
        this.A0B = interfaceC2441Yh;
        this.A09 = c2900gi;
        if (c2900gi.A0E() == null) {
            c2900gi.A0F().A9v();
        }
        this.A0D = A0F();
        if (AbstractC2351Uq.A02(c2900gi) || c2900gi.A0E() == null) {
            m10 = new M3(c2900gi, this.A0D);
        } else {
            m10 = new M3(c2900gi, c2900gi.A0E(), this.A0D);
        }
        this.A0E = m10;
        this.A0F = A0C(z10);
        this.A07 = (LinearLayout) this.A0F;
        this.A07.setId(View.generateViewId());
        this.A0F.setListener(new C2211Pb(this));
        this.A0E.setBrowserNavigationListener(this.A0F.getBrowserNavigationListener());
        this.A0C = new C2529ah(c2900gi, null, R.attr.progressBarStyleHorizontal);
        A0G();
        c2262Re.A0A(this.A06);
    }

    private InterfaceC2543av A0C(boolean z10) {
        if (z10) {
            return new M8(this.A09, this.A0E, false);
        }
        return new M6(this.A09, this.A0E);
    }

    public InterfaceC2538aq A0F() {
        return new C2210Pa(this);
    }

    public void A0G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A07.setPadding(XV.A0b, XV.A0b, XV.A0b, XV.A0b);
        this.A0B.A45(this.A07, layoutParams);
        RelativeLayout.LayoutParams webViewParams = new RelativeLayout.LayoutParams(-1, -2);
        webViewParams.addRule(3, this.A07.getId());
        webViewParams.addRule(12);
        this.A0B.A45(this.A0E, webViewParams);
        RelativeLayout.LayoutParams webViewParams2 = new RelativeLayout.LayoutParams(-1, A0I);
        webViewParams2.addRule(3, this.A07.getId());
        this.A0C.setProgress(0);
        this.A0B.A45(this.A0C, webViewParams2);
    }

    public void A0H() {
        this.A08.finish(1);
    }

    public void A0I(String str) {
    }

    public void AAu(Intent intent, Bundle bundle, C2262Re c2262Re) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String strA0D = A0D(231, 11, 97);
        String strA0D2 = A0D(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 11, 26);
        String url = A0D(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 10, 13);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(url);
            this.A04 = intent.getStringExtra(strA0D2);
            this.A00 = intent.getLongExtra(strA0D, -1L);
        } else {
            this.A02 = bundle.getString(url);
            this.A04 = bundle.getString(strA0D2);
            this.A00 = bundle.getLong(strA0D, -1L);
        }
        String strA0D3 = this.A02 != null ? this.A02 : A0D(199, 11, 51);
        this.A0F.setUrl(strA0D3);
        this.A0E.loadUrl(strA0D3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2442Yi
    public final void AFA(boolean z10) {
        this.A0E.onPause();
        if (this.A03) {
            this.A03 = false;
            C2532ak c2532akA07 = new C2531aj(this.A0E.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0E.getResponseEndMs()).A00(this.A0E.getDomContentLoadedMs()).A05(this.A0E.getScrollReadyMs()).A02(this.A0E.getLoadFinishMs()).A06(System.currentTimeMillis()).A07();
            this.A0A.AB5(this.A04, c2532akA07.A02());
            if (BuildConfigApi.isDebug()) {
                String str = A0D(169, 30, 15) + System.currentTimeMillis() + A0D(149, 20, 60) + c2532akA07.A01 + A0D(53, 22, 121) + c2532akA07.A03 + A0D(75, 24, 83) + c2532akA07.A04 + A0D(0, 30, 124) + c2532akA07.A00 + A0D(99, 24, 75) + c2532akA07.A05 + A0D(30, 23, 22) + c2532akA07.A02 + A0D(123, 26, 113) + c2532akA07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2442Yi
    public final void AFi(boolean z10) {
        this.A0E.onResume();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2442Yi
    public final void AIv(Bundle bundle) {
        bundle.putString(A0D(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 10, 13), this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2442Yi
    public String getCurrentClientToken() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2442Yi
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A0B(this.A06);
        AbstractC2552b4.A03(this.A0E);
        this.A0E.destroy();
    }

    public void setListener(InterfaceC2441Yh interfaceC2441Yh) {
    }
}
