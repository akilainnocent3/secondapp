package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2768ea {
    public static byte[] A05;
    public Executor A00 = YG.A06;
    public final C2900gi A01;
    public final InterfaceC2441Yh A02;
    public final ZU A03;
    public final String A04;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{5, c.f161646x, c.f161646x, 13, 8, 19, 31, 31, c.E, c.H, -27, a.B7, a.B7, 34, 34, 34, a.E7, -48, c.H, a.E7, 17, c.f161636n, c.f161638p, c.f161640r, 13, c.D, c.D, c.f161648z, a.E7, c.f161638p, c.D, c.B, a.B7, c.f161636n, 32, c.f161639q, c.f161646x, c.f161640r, c.C, c.f161638p, c.f161640r, 10, c.C, c.f161640r, 31, 34, c.D, c.G, c.f161648z, a.B7, c.H, c.f161640r, c.G, 33, c.f161640r, c.G, 10, c.H, c.f161646x, c.f161639q, c.f161640r, 10, c.G, c.f161640r, 34, c.f161636n, c.G, c.f161639q, a.C7, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, a.B7, -36, -34, -37, q.B, q.B, -28, -89, -36, q.B, -26, -88, a.B7, -18, -35, -30, -34, -25, -36, -34, a.f103428n7, -25, -34, -19, -16, q.B, -21, -28, -88, -20, -34, -21, -17, -34, -21, a.f103428n7, -20, -30, -35, -34, a.f103428n7, -21, -34, -16, a.B7, -21, -35, c.f161646x, 7, 31, 35, c.B, 19, 42, 47, 35, c.H};
    }

    public C2768ea(C2900gi c2900gi, ZU zu2, String str, InterfaceC2441Yh interfaceC2441Yh) {
        this.A01 = c2900gi;
        this.A03 = zu2;
        this.A04 = str;
        this.A02 = interfaceC2441Yh;
    }

    public static String A04(RewardData rewardData, String str, String str2) {
        String urlPrefix;
        if (rewardData != null) {
            String serverSideProxyURL = AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A03(68, 60, 45);
            } else {
                String urlPrefix2 = A03(5, 63, 95);
                urlPrefix = String.format(Locale.US, urlPrefix2, serverSideProxyURL);
            }
            Uri uriA00 = XB.A00(urlPrefix);
            Uri.Builder uriBuilder = new Uri.Builder();
            String urlPrefix3 = uriA00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            String urlPrefix4 = uriA00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            String urlPrefix5 = uriA00.getPath();
            uriBuilder.path(urlPrefix5);
            String urlPrefix6 = uriA00.getQuery();
            uriBuilder.query(urlPrefix6);
            String urlPrefix7 = uriA00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            String serverSideProxyURL2 = A03(134, 4, 110);
            String urlPrefix8 = rewardData.getUserID();
            uriBuilder.appendQueryParameter(serverSideProxyURL2, urlPrefix8);
            String serverSideProxyURL3 = A03(128, 2, 88);
            String urlPrefix9 = rewardData.getCurrency();
            uriBuilder.appendQueryParameter(serverSideProxyURL3, urlPrefix9);
            String urlPrefix10 = A03(130, 4, 99);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            String urlPrefix11 = A03(0, 5, 88);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A06() {
        if (!TextUtils.isEmpty(this.A04)) {
            AsyncTaskC2871gF asyncTaskC2871gF = new AsyncTaskC2871gF(this.A01, new HashMap());
            asyncTaskC2871gF.A07(new F8(this));
            asyncTaskC2871gF.executeOnExecutor(this.A00, this.A04);
        }
    }
}
