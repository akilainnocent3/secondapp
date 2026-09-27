package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
import jg.b0;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3087jz implements N1, InterfaceC2177Nt {
    public static byte[] A0B;
    public static String[] A0C = {"Tri2", "1D6RXHNY", "CY2J", "FG3HLf7FRck3Q4", "aTw9XxKg19aD2PWH35UjlgQd", "aN0Sboz7ddtAAnQUWG6qQ4oJRDDzSUBt", "pWs", b0.f100177r};
    public long A00;
    public RewardData A01;
    public NC A02;
    public ND A03;
    public C2178Nu A04;
    public C2900gi A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{-37, -7, 6, -65, c.f161636n, -72, c.f161635m, c.f161636n, -7, 10, c.f161636n, -72, a.E7, 13, -4, 1, -3, 6, -5, -3, -26, -3, c.f161636n, c.f161639q, 7, 10, 3, a.E7, -5, c.f161636n, 1, c.f161638p, 1, c.f161636n, 17, a.f103476t7, -72, -27, -7, 3, -3, -72, c.f161635m, 13, 10, -3, -72, c.f161636n, 0, -7, c.f161636n, -72, 1, c.f161636n, -65, c.f161635m, -72, 1, 6, -72, 17, 7, 13, 10, -72, a.E7, 6, -4, 10, 7, 1, -4, -27, -7, 6, 1, -2, -3, c.f161635m, c.f161636n, a.f103476t7, c.f161640r, 5, 4, -72, -2, 1, 4, -3, a.f103476t7, -16, -20, -21, 31, c.f161638p, 19, c.f161639q, c.B, 13, c.f161639q, -8, c.f161639q, c.H, 33, c.C, 28, c.f161647y, a.f103493v7, -48, -35, a.f103529z7, -48, -46, -29, a.f103428n7, -27, a.f103428n7, -29, q.B, -1, -9, -10, -5, -13, 6, -5, 1, 0, -42, -13, 6, -13, c.f161640r, c.f161636n, 1, 3, 5, 13, 5, c.f161638p, c.f161646x, -23, 4, a.f103493v7, a.f103511x7, -66, -67, -66, -65, a.f103452q7, a.f103484u7, -66, -67, -88, a.f103511x7, a.f103452q7, -66, a.f103484u7, a.f103520y7, -70, a.f103520y7, a.f103452q7, -56, a.f103484u7, -92, -66, -46, -7, -20, -8, -4, -20, -6, -5, -37, -16, -12, -20, -6, -13, -18, -10, -6, -22, a.f103529z7, -23, 34, c.f161647y, 17, 35, 0, 37, 28, 17, c.f161636n, -2, 3, -7, 4, c.f161636n};
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(194, 6, 65));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        EnumC2561bD enumC2561bDA02 = A02();
        if (enumC2561bDA02 == EnumC2561bD.A05) {
            String[] strArr = A0C;
            String str = strArr[4];
            String str2 = strArr[7];
            int rotation2 = str.length();
            if (rotation2 != str2.length()) {
                String[] strArr2 = A0C;
                strArr2[6] = "b7o";
                strArr2[3] = "Q7inAkPu5HYVeU";
                return -1;
            }
        } else if (enumC2561bDA02 == EnumC2561bD.A03) {
            switch (rotation) {
                case 2:
                case 3:
                    int rotation3 = A0C[1].length();
                    if (rotation3 != 29) {
                        String[] strArr3 = A0C;
                        strArr3[6] = "bcp";
                        strArr3[3] = "BEZRNTMscmchpM";
                        return 8;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            switch (rotation) {
                case 2:
                    return 9;
                default:
                    String[] strArr4 = A0C;
                    String str3 = strArr4[4];
                    String str4 = strArr4[7];
                    int rotation4 = str3.length();
                    if (rotation4 == str4.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0C;
                    strArr5[0] = "VdY7";
                    strArr5[2] = "KFhl";
                    return 1;
            }
        }
        throw new RuntimeException();
    }

    private final WK A01() {
        return this.A04.A0E();
    }

    private EnumC2561bD A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        this.A04.A0I(intent, this.A01, C2768ea.A04(this.A01, this.A0A, this.A06));
    }

    private final void A07(C2900gi c2900gi, NC nc2, O8 o10, EnumSet<CacheFlag> cacheFlags, String str) {
        C2178Nu c2178Nu = new C2178Nu(c2900gi, o10, this, str);
        NQ nqA0D = c2178Nu.A0D();
        if (C2350Up.A0v(c2900gi) && (nqA0D instanceof AbstractC3065jd) && AbstractC2156Mx.A06(this.A05, AbstractC2156Mx.A01(c2900gi, o10.A03(), ((AbstractC3065jd) nqA0D).A2E()), c2900gi.A0A())) {
            this.A05.A0F().A52();
            this.A02.AEG(this, AdError.NO_FILL);
        } else {
            this.A04 = c2178Nu;
            A08(c2178Nu.A0E());
            c2178Nu.A0J(c2900gi, cacheFlags);
        }
    }

    private void A08(WK wk2) {
        if (wk2.equals(WK.A04)) {
            this.A05.A0F().AJt(M5.A05);
            return;
        }
        if (wk2.equals(WK.A0A)) {
            this.A05.A0F().AJt(M5.A04);
            return;
        }
        if (wk2.equals(WK.A0B)) {
            this.A05.A0F().AJt(M5.A0B);
            return;
        }
        if (wk2.equals(WK.A0D)) {
            this.A05.A0F().AJt(M5.A0D);
            return;
        }
        if (wk2.equals(WK.A0C)) {
            this.A05.A0F().AJt(M5.A0C);
            return;
        }
        if (!wk2.equals(WK.A06)) {
            return;
        }
        if (this.A04.A0K()) {
            this.A05.A0F().AJt(M5.A08);
            return;
        }
        if ((A09() instanceof AbstractC3065jd) && this.A04.A0L((AbstractC3065jd) A09())) {
            InterfaceC2126Lt interfaceC2126LtA0F = this.A05.A0F();
            if (A0C[1].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "5zP";
            strArr[3] = "kcwn0HZtMTZNOx";
            interfaceC2126LtA0F.AJt(M5.A0A);
            return;
        }
        this.A05.A0F().AJt(M5.A09);
    }

    public final NQ A09() {
        return this.A04.A0D();
    }

    public final void A0A(C2900gi c2900gi, NC nc2, O8 o10, EnumSet<CacheFlag> enumSet, String str, String str2, RewardData rewardData) {
        this.A05 = c2900gi;
        this.A02 = nc2;
        this.A08 = o10.A02();
        this.A06 = this.A08 != null ? this.A08.split(A03(SignalKey.EVENT_ID, 1, 22))[0] : A03(0, 0, 85);
        this.A00 = o10.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c2900gi, nc2, o10, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            if (this.A02 != null) {
                this.A02.AEG(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent adActivityIntentA05 = C2404Wu.A05(this.A05);
        adActivityIntentA05.putExtra(A03(143, 24, 5), A00());
        adActivityIntentA05.putExtra(A03(178, 8, 49), this.A0A);
        adActivityIntentA05.putExtra(A03(132, 11, 76), this.A08);
        adActivityIntentA05.putExtra(A03(167, 11, 51), this.A00);
        WK wkA01 = A01();
        A08(wkA01);
        adActivityIntentA05.putExtra(A03(186, 8, 88), wkA01);
        if (this.A07 != null) {
            adActivityIntentA05.putExtra(A03(119, 13, 62), this.A07);
        }
        A06(adActivityIntentA05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            String[] strArr = A0C;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "Sc68";
            strArr2[2] = "wieN";
            adActivityIntentA05.addFlags(268435456);
        }
        try {
            ActivityUtils.A03(this.A05);
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C2404Wu.A0I(this.A05, adActivityIntentA05)) {
                    this.A05.A0F().AIC();
                    if (this.A02 != null) {
                        this.A02.AEG(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C2404Wu.A0B(this.A05, adActivityIntentA05);
            return true;
        } catch (C2402Ws e10) {
            Throwable cause = e10.getCause();
            C2402Ws cause2 = e10;
            if (cause != null) {
                cause2 = e10.getCause();
            }
            this.A05.A08().ABC(A03(108, 11, 27), AbstractC2312Td.A0D, new C2313Te(cause2));
            Log.e(A03(90, 17, 86), A03(0, 90, 68), cause2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final String A7O() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final AdPlacementType A8k() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Nt
    public final void ACo(AdError adError) {
        if (this.A02 != null) {
            this.A02.AEG(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Nt
    public final void ACp() {
        A04();
        this.A02.AEF(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Nt
    public final void AHY() {
        this.A03 = new ND(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Nt
    public final void AKX() {
        if (this.A03 != null) {
            ND nd2 = this.A03;
            String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "DiF0";
            strArr2[2] = "lQT3";
            nd2.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0H();
        }
    }
}
