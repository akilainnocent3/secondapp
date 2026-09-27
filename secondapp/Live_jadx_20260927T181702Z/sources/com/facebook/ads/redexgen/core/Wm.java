package com.facebook.ads.redexgen.core;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import f6.q;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Wm implements V9 {
    public static byte[] A0D;
    public static String[] A0E = {"KlcQ4aPMCjTEuj6tlqvSPg02tmhmGUou", "NbdeitWOc1zrv1JDjauqKHmjPPhSGwGe", "R4vSD9xrU3uFkHfeeGcLq0xvgbIcHayT", "rvVAUvGslDbkwSzXQ4gHiQTP5zrG", "ljLEgEfbMYnmdR7mWy3vUvMk8HSCwfcz", "YjYM3cC5SO9DuryblpH9N9a8sNamrwLD", "dglxEHbBnsXp5lOZvNi9PFSn5QE5iyod", "nrMzKM4Ejqm74mRasA"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C2896ge A06;
    public final V8 A07;
    public final InterfaceC2851fv A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C2401Wr(this);
    public final Runnable A09 = new C2400Wq(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0E[2].charAt(25) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "STFGVVXWKW9SjLATYObI8PiLTu9r";
            strArr[7] = "1bj9PcPMGQWJpkILDx";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
            i13++;
        }
    }

    public static void A07() {
        A0D = new byte[]{106, 121, 99, 84, 88, 117, 111, 108, 125, 104, 127, 116, 117, 114, 123, 60, 121, 106, 121, 114, 104, 60, 52, 64, 125, 102, 96, 117, q.A, 108, 106, 107, 37, 114, 109, 108, 105, 96, 37, 97, 108, 118, 117, q.f83619w, q.A, 102, 109, 108, 107, 98, 37, 96, 115, 96, 107, q.A, 118, 43, 73, 127, 104, 108, 127, 104, 58, 106, 104, 117, 121, 127, 105, 105, 127, 126, 58, 106, 123, 104, 110, 115, 123, 118, 58, a.f127263w, 123, 110, 121, 114, 54, 58, 121, 117, 116, 110, 115, 116, 111, 115, 116, 125, 58, 110, 117, 58, 116, 127, 98, 110, 58, 117, 116, 127, 52, 89, 111, a.f127263w, 124, 111, a.f127263w, 42, a.f127263w, 111, 121, 122, 101, q.f83619w, 121, 111, 42, 99, 121, 42, 111, 103, 122, 126, 115, 36, 0, 54, 33, 37, 54, 33, 115, 33, 54, 39, 38, 33, yr.a.f159811k, 54, 55, 115, 50, 115, yr.a.f159811k, 60, yr.a.f159811k, 126, 32, 38, 48, 48, 54, 32, 32, 53, 38, 63, 115, 32, 39, 50, 39, 38, 32, 115, 48, 60, 55, 54, 115, 60, 53, 115, 70, 112, 103, 99, 112, 103, 53, 98, 116, 102, 53, 96, 123, 116, 119, 121, 112, 53, 97, 122, 53, 101, 103, 122, 118, 112, 102, 102, 53, 116, 121, 121, 53, 112, 99, 112, 123, 97, 102, 57, 53, 97, 103, 108, 124, 123, 114, 53, 116, 114, 116, 124, 123, 59, 57, 1, 3, c.D, c.D, 3, 4, 13, 74, c.f161638p, 3, c.C, c.D, c.f161635m, c.H, 9, 2, 74, c.f161638p, 31, c.f161639q, 74, c.H, 5, 74, 6, c.f161635m, 9, 1, 74, 5, c.f161636n, 74, 9, 5, 4, 4, c.f161639q, 9, c.H, 3, 28, 3, c.H, 19, 68, 74, 95, 95, 78, 70, 91, 95, 93, 81, 80, 80, 91, 93, 74, 87, 72, 87, 74, 71, 32, 37, 48, 37, 3, c.f161640r, 3, 8, c.f161643u, c.f161647y, 59, 42, 50, 39, 36, 42, 47};
    }

    static {
        A07();
        A0F = V9.class.getSimpleName();
    }

    public Wm(C2896ge c2896ge, V8 v10) {
        this.A07 = v10;
        this.A06 = c2896ge;
        this.A04 = (ConnectivityManager) c2896ge.getSystemService(A03(293, 12, 115));
        this.A08 = C2869gD.A01(c2896ge);
        this.A03 = AbstractC2352Ur.A0K(c2896ge);
        this.A02 = AbstractC2352Ur.A0J(c2896ge);
    }

    public static /* synthetic */ int A00(Wm wm2) {
        int i10 = wm2.A00 + 1;
        wm2.A00 = i10;
        return i10;
    }

    private void A05() {
        this.A06.A05().AAO();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.ACu();
        }
    }

    private void A06() {
        if (this.A00 >= AbstractC2352Ur.A09(this.A06)) {
            A05();
            A61();
            return;
        }
        int i10 = this.A00;
        if (A0E[4].charAt(15) == 'm') {
            String[] strArr = A0E;
            strArr[0] = "48XWu56AgSaDG2v80CTGd4cBK4h9Z0cs";
            strArr[1] = "AYX5vj0PphgSAPbgEesjNh2Dg1h2Tuc1";
            if (i10 == 1) {
                this.A01 = AbstractC2352Ur.A0I(this.A06);
            } else {
                long j10 = this.A01 * 2;
                String[] strArr2 = A0E;
                if (strArr2[5].charAt(19) == strArr2[6].charAt(19)) {
                    String[] strArr3 = A0E;
                    strArr3[0] = "1ToF3hMm2VA6KDOeCYlfpYX9EZhWZaCs";
                    strArr3[1] = "Z30ky6DQTC9ucfzgiQKOMI68k5hVrHHu";
                    this.A01 = j10;
                }
            }
            A62();
            return;
        }
        throw new RuntimeException();
    }

    private void A08(long j10) {
        this.A05.postDelayed(this.A09, j10);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Map<String, String> shortEvnData = this.A06.A04().A5a();
        for (Map.Entry<String, String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() throws Exception {
        try {
            NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A05().AAO()) {
                    Log.e(A0F, A03(240, 46, 39));
                }
                A08(this.A02);
                return;
            }
            this.A06.A05().AAO();
            JSONObject jSONObjectA5L = this.A07.A5L();
            if (jSONObjectA5L == null) {
                this.A06.A05().AAO();
                A05();
                return;
            }
            boolean zAAO = this.A06.A05().AAO();
            String strA03 = A03(309, 6, 43);
            if (zAAO && jSONObjectA5L.has(strA03)) {
                JSONArray jSONArray = jSONObjectA5L.getJSONArray(strA03);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String str = A03(4, 19, 81) + i10 + A03(0, 3, 14) + jSONArray.get(i10);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 102), String.valueOf(this.A00));
            A09(jSONObject);
            jSONObjectA5L.put(A03(305, 4, 9), jSONObject);
            C2865g9 c2865g9 = new C2865g9();
            c2865g9.put(A03(315, 7, 6), jSONObjectA5L.toString());
            InterfaceC2850fu interfaceC2850fuAGx = this.A08.AGx(this.A06.A05().A86(), c2865g9.A08());
            String strA73 = interfaceC2850fuAGx != null ? interfaceC2850fuAGx.A73() : null;
            if (!TextUtils.isEmpty(strA73) && interfaceC2850fuAGx != null) {
                if (interfaceC2850fuAGx.A9C() != 200) {
                    if (this.A06.A05().AAO()) {
                        String responseBody = A0F;
                        Log.e(responseBody, A03(138, 48, 30) + interfaceC2850fuAGx.A9C() + A03(3, 1, 55));
                    }
                    if (interfaceC2850fuAGx.A9C() == 413 && C2350Up.A2Y(this.A06)) {
                        this.A07.AFZ();
                        A05();
                        return;
                    } else {
                        if (jSONObjectA5L.has(strA03)) {
                            this.A07.ADe(jSONObjectA5L.getJSONArray(strA03));
                        }
                        A06();
                        return;
                    }
                }
                if (!this.A07.ADf(new JSONArray(strA73))) {
                    if (this.A06.A05().AAO()) {
                        Log.w(A0F, A03(186, 54, 88));
                    }
                    A06();
                    return;
                } else {
                    if (this.A07.AAb()) {
                        if (this.A06.A05().AAO()) {
                            Log.i(A0F, A03(58, 55, 87));
                        }
                        A06();
                        return;
                    }
                    A05();
                    return;
                }
            }
            if (this.A06.A05().AAO()) {
                Log.e(A0F, A03(113, 25, 71));
            }
            if (C2350Up.A2N(this.A06) && jSONObjectA5L.has(strA03)) {
                this.A07.ADe(jSONObjectA5L.getJSONArray(strA03));
            }
            A06();
        } catch (Exception e10) {
            C2896ge c2896ge = this.A06;
            String[] strArr = A0E;
            if (strArr[0].charAt(26) != strArr[1].charAt(26)) {
                Exception e11 = new RuntimeException();
                throw e11;
            }
            String[] strArr2 = A0E;
            strArr2[5] = "juVm3rSGrTKw83uGBob9EWWg86xlgGIp";
            strArr2[6] = "uyuZsDIDSXItwx867Sl9CxjwWd0LLO11";
            if (c2896ge.A05().AAO()) {
                Log.e(A0F, A03(23, 35, 72), e10);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.V9
    public final void A61() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.V9
    public final void A62() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
