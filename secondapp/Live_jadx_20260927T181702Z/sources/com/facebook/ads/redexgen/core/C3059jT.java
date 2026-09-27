package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r7.i1;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3059jT extends NQ implements Serializable {
    public static byte[] A0E = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A08;
    public boolean A09;
    public final List<AbstractC3065jd> A0D;
    public final ArrayList<Integer> A0C = new ArrayList<>();
    public boolean A0A = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public String A05 = A02(280, 2, 22);
    public final String A0B = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{93, 88, 79, 117, 126, 119, 127, a.f127263w, 73, 102, 119, q.f83619w, 119, 123, 101, 17, c.D, 19, c.E, 28, c.A, c.f161648z, 45, 19, c.f161648z, 1, 45, 17, c.G, 7, 28, 6, 54, yr.a.f159811k, 52, 60, 59, 48, 49, 10, 52, 49, 38, 10, 56, 52, 45, 10, 49, 32, 39, 52, 33, 60, 58, 59, 73, 66, 75, 67, 68, 79, 78, 117, 75, 78, 89, 117, 92, 75, 88, 67, 79, 68, 94, 74, 65, 72, 64, 71, 64, 71, 78, 118, 79, 70, 91, 74, 76, 118, 95, 64, 76, 94, 118, 93, 64, 68, 76, 90, 110, 101, 111, 84, 104, 106, 121, 111, 84, 106, 126, 127, q.f83619w, 84, 104, 103, q.f83619w, a.f127263w, 110, 84, 127, 98, 102, 110, 118, q.A, 123, 122, 103, 64, 107, 112, 64, 109, 122, 111, 112, 109, 107, 64, 115, 112, 126, 123, 122, 123, 65, 86, 67, 92, 65, 71, 108, 85, 90, 65, 64, 71, 108, 86, 80, 67, 94, 108, 92, 93, 95, 74, c.f161636n, c.E, c.f161638p, 17, c.f161636n, 10, 33, c.B, c.A, c.f161636n, 13, 10, 33, c.A, 19, c.f161638p, c.f161636n, c.E, 13, 13, c.A, 17, c.f161640r, 33, 17, c.f161640r, c.f161643u, 7, 17, 10, 13, c.f161647y, yr.a.f159811k, 17, 7, 1, 13, c.f161636n, 6, yr.a.f159811k, 3, 6, yr.a.f159811k, 13, c.f161636n, yr.a.f159811k, 3, 6, yr.a.f159811k, c.f161640r, 7, c.f161643u, 13, c.f161640r, c.f161648z, c.f161635m, c.f161636n, 5, c.f161638p, c.f161647y, c.f161643u, 10, 34, c.f161638p, c.B, c.H, c.f161643u, 19, c.C, 34, 28, c.C, 34, c.f161643u, 19, 34, c.f161635m, c.f161646x, c.C, c.B, c.f161643u, 34, 13, 17, 28, 4, 31, 28, c.H, c.f161648z, 34, c.B, c.f161639q, c.f161639q, c.f161643u, c.f161639q, 3, 0, 28, c.C, 4, 47, c.f161648z, 31, 2, 19, c.f161647y, 47, 6, c.C, c.f161647y, 7, 72, 78};
    }

    public C3059jT(List<AbstractC3065jd> list) {
        this.A0D = list;
    }

    public static C3059jT A00(JSONObject jSONObject, C2900gi c2900gi) throws JSONException {
        return A01(jSONObject, c2900gi, false);
    }

    public static C3059jT A01(JSONObject jSONObject, C2900gi c2900gi, boolean z10) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A02(0, 3, 25));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (z10) {
                arrayList.add(C17777n.A00(jSONArray.getJSONObject(i10), c2900gi));
            } else {
                arrayList.add(C17757l.A00(jSONArray.getJSONObject(i10), c2900gi));
            }
        }
        C3059jT c3059jT = new C3059jT(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A02(3, 12, 51));
        c3059jT.A05 = chainingParams.toString();
        c3059jT.A01 = chainingParams.optInt(A02(15, 17, 87), arrayList.size());
        c3059jT.A04 = chainingParams.optInt(A02(32, 24, 112), 0);
        c3059jT.A02 = chainingParams.optInt(A02(100, 24, 46), 0);
        c3059jT.A03 = chainingParams.optInt(A02(124, 22, 58), 0);
        c3059jT.A09 = chainingParams.optBoolean(A02(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 38, 88), true);
        c3059jT.A08 = chainingParams.optBoolean(A02(196, 30, 71), true);
        c3059jT.A00 = chainingParams.optInt(A02(56, 19, 15), 2);
        c3059jT.A1P(chainingParams);
        c3059jT.A0A = chainingParams.optBoolean(A02(i1.d.HandlerC1208d.f123900o, 16, 85), false);
        c3059jT.A07 = chainingParams.optBoolean(A02(168, 28, 91), false);
        c3059jT.A06 = chainingParams.optBoolean(A02(146, 22, 22), false);
        JSONArray jSONArrayOptJSONArray = chainingParams.optJSONArray(A02(75, 25, 12));
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                c3059jT.A0C.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i11, 0)));
            }
        }
        return c3059jT;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0o() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0p() {
        return this.A04 + this.A02;
    }

    public final int A22() {
        return this.A00;
    }

    public final int A23() {
        return this.A01;
    }

    public final int A24() {
        return this.A02;
    }

    public final int A25() {
        return this.A03;
    }

    public final AbstractC3065jd A26() {
        if (!this.A0D.isEmpty()) {
            return this.A0D.get(0);
        }
        return null;
    }

    public final AbstractC3065jd A27(int i10) {
        return this.A0D.get(i10);
    }

    public final String A28() {
        return this.A0B;
    }

    public final String A29() {
        return this.A05;
    }

    public final String A2A() {
        AbstractC3065jd firstAdDataBundle = A26();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A2E();
        }
        return null;
    }

    public final ArrayList<Integer> A2B() {
        return this.A0C;
    }

    public final void A2C(int i10) {
        this.A0D.remove(i10);
        this.A01--;
    }

    public final boolean A2D() {
        return this.A00 == 0;
    }

    public final boolean A2E() {
        return this.A06;
    }

    public final boolean A2F() {
        return this.A07;
    }

    public final boolean A2G() {
        return this.A08;
    }

    public final boolean A2H() {
        return this.A09;
    }

    public final boolean A2I() {
        return this.A0A;
    }

    public final boolean A2J(int i10) {
        return i10 >= 0 && i10 < this.A0D.size();
    }
}
