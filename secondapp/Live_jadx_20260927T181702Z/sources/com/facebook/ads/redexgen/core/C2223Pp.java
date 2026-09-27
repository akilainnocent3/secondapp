package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2223Pp implements YT {
    public static byte[] A04;
    public C2896ge A00;
    public C2331Tw A01;
    public InterfaceC2851fv A02;
    public final Executor A03;

    static {
        A06();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{98, 103, 103, 97, q.f83619w, 105, 97, 99, 102, 98, 99, 96, 103, 97, 98, 92, 87, 89, 94, 93, 91, 90, 92, 94, 86, 86, 91, 90, 93, 90, 95, 80, 90, 80, 92, 90, 80, 93, 89, 80, 80, 94, 80, 89, 88, c.f161647y, 80, c.f161635m, c.f161639q, 91, 80, 8, 88, c.f161639q, 91, 94, 93, 92, 94, 93, 95, 8, 95, 10, 95, 89, 13, 94, 89, 94, c.f161639q, 92, c.f161635m, 10, 91, 90, 10, 91, 94, 124, 115, 126, a.f127263w, q.A, 109, 65, 89, 0, 79, 84, 72, 69, 82, 83, 0, 76, 79, 71, 73, 78, 0, 65, 83, 0, 89, 79, 85, 0, 84, 79, 0, 68, 69, 66, 85, 71, 31, 0, 104, 79, 87, 0, 68, 79, 0, 89, 79, 85, 0, 82, 69, 80, 82, 79, 68, 85, 67, 69, 0, 84, 72, 69, 0, 73, 83, 83, 85, 69, 31, 53, 3, 8, 2, 70, 52, 3, c.f161648z, 9, c.f161646x, c.f161643u, 62, 1, 8, c.G, 73, 33, 8, c.C, c.C, c.f161636n, 7, c.f161636n, 13, 86, c.E, c.C, c.C, 31, 9, 9, 37, c.f161638p, c.f161647y, 17, 31, c.f161646x, c.C, c.E, c.f161638p, 31, c.G, c.f161647y, 8, 3, 37, 19, c.H, 47, 32, 37, 41, 34, 56, 19, 56, 37, 33, 41, 99, 108, 105, 101, 110, 116, 95, 116, 111, 107, 101, 110, 89, 85, 84, 92, 83, 93, 101, 83, 94, 1, 0, c.f161648z, 6, c.A, c.f161636n, c.f161647y, 17, c.f161636n, 10, c.f161635m, 47, 39, 54, 35, 38, 35, 54, 35, 57, yr.a.f159811k, 39, 55, c.f161635m, yr.a.f159811k, 58, 50, 59, 116, 114, q.f83619w, 115, 94, 104, 101, q.f83619w, 111, 117, 104, 103, 104, q.f83619w, 115};
    }

    public C2223Pp(Executor executor, C2331Tw c2331Tw, C2900gi c2900gi) {
        this.A00 = c2900gi.A02();
        this.A02 = C2869gD.A01(this.A00);
        this.A03 = executor;
        this.A01 = c2331Tw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A02(String str) {
        C2865g9 c2865g9 = new C2865g9();
        C2865g9 c2865g10 = new C2865g9();
        C2865g9 c2865g11 = new C2865g9();
        c2865g9.put(A03(257, 15, 52), SZ.A00().A03());
        c2865g9.put(A03(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 9, 15), A03(15, 15, 91));
        c2865g9.put(A03(186, 11, 79), A03(0, 15, 101));
        c2865g9.put(A03(174, 12, 79), A03(30, 48, 92));
        c2865g9.put(A03(197, 11, 121), (System.currentTimeMillis() / 1000) + A03(0, 0, 108));
        String strA09 = this.A01.A09();
        if (strA09 != null) {
            c2865g11.put(A03(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 12, 53), strA09);
        }
        c2865g10.put(A03(229, 11, 80), str);
        c2865g10.put(A03(248, 9, 97), AbstractC2411Xd.A01(c2865g11));
        c2865g9.A04(A03(240, 8, 119), AbstractC2411Xd.A01(c2865g10));
        return c2865g9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C2331Tw c2331Tw) {
        this.A01 = c2331Tw;
    }

    @Override // com.facebook.ads.redexgen.core.YT
    public final void AFv() {
        Activity activityA00 = ActivityUtils.A00();
        if (activityA00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activityA00);
        builder.setTitle(A03(160, 14, 92));
        EditText editText = new EditText(activityA00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A03(84, 65, 21));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A03(78, 6, 40), new YQ(this));
        builder.setPositiveButton(A03(149, 11, 83), new YR(this, editText));
        builder.create().show();
    }
}
