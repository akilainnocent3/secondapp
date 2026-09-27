package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2688dG implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C2691dJ A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{13, 33, 59, 34, 42, 110, 32, 33, 58, 110, 62, 47, 60, a.f159811k, 43, 110, a.f159811k, 43, 60, 56, 43, 60, 110, 35, 43, a.f159811k, a.f159811k, 47, 41, 43, 72, 127, 127, 98, 127, 45, 125, 108, 127, 126, q.f83619w, 99, 106, 45, 71, 94, 66, 67, 45, q.f83619w, 99, 45, 125, 98, 126, 121, 64, 104, 126, 126, 108, 106, 104, 45, 87, 67, 66, 94, 125, 83, 79, 53, 40, 36, 34, 49, c.f161639q, 52, 49, 36, 49, c.f161638p, 3, 10, 31, 58, 60};
    }

    public RunnableC2688dG(C2691dJ c2691dJ, String str) {
        this.A00 = c2691dJ;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                if (this.A00.A05.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(EnumC2689dH.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                } else {
                    this.A00.A04.A04(AbstractC2312Td.A11, A00(0, 30, 47));
                }
            } catch (JSONException e10) {
                this.A00.A04.A04(AbstractC2312Td.A15, A00(30, 34, 108) + e10.getMessage());
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
