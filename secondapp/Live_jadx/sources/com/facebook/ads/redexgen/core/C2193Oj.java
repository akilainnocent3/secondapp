package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l3.a;
import org.json.JSONArray;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2193Oj {
    public static byte[] A03;
    public VI A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{a.f103511x7, -45, a.E7, -30, a.f103428n7, c.E, c.f161639q, 28, c.f161639q, c.f161647y, 19, 13, c.f161639q, c.f161643u, 13, c.H, 32, 19, c.f161646x, 19, 32, 19, 28, 17, 19, 33, -7, -6, -2, -13, -7, -8, -3, -23, -3, -17, -10, -17, -19, -2, -17, -18, 66, 67, 48, 65, 67, 0, -2, -16, -3, -22, -11, -6, 0, -3, -7, -16, 4, -36, a.f103520y7, -34, -60, a.f103476t7, -46, -60, a.f103529z7, -60, a.f103428n7, a.f103502w7, a.f103502w7, a.f103529z7, -45, -52, -60, a.E7, a.f103520y7, a.f103529z7, a.f103428n7};
    }

    public C2193Oj() {
    }

    public C2193Oj(VI vi2) {
        this.A00 = vi2;
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap();
        map.put(A00(47, 12, 49), new JSONArray((Collection) this.A02).toString());
        map.put(A00(26, 16, 48), new JSONArray((Collection) this.A01).toString());
        return map;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 84));
        if (this.A00 != null) {
            this.A00.A04(VH.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, 117));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 11));
        if (this.A00 != null) {
            this.A00.A04(VH.A0C, null);
        }
    }

    public final void A07(int i10) {
        this.A01.add(String.valueOf(i10));
    }

    public final void A08(EnumC2192Oi enumC2192Oi) {
        this.A02.add(enumC2192Oi.A03() + A00(1, 4, 26));
        if (this.A00 != null) {
            this.A00.A04(VH.A09, null);
        }
    }

    public final void A09(EnumC2192Oi enumC2192Oi, int i10) {
        this.A02.add(enumC2192Oi.A03() + A00(0, 1, 18) + i10);
    }

    public final boolean A0A() {
        return (this.A02.isEmpty() && this.A01.isEmpty()) ? false : true;
    }
}
