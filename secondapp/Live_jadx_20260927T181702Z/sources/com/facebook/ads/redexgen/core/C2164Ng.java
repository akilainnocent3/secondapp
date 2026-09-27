package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import f6.q;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2164Ng implements Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2164Ng A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(A04(0, 6, 78));
        String strOptString2 = jSONObject.optString(A04(36, 8, 81));
        String strOptString3 = jSONObject.optString(A04(24, 12, 84));
        int iOptInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean zOptBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3) || iOptInt == -1) {
            return null;
        }
        return new C2164Ng(strOptString, strOptString2, strOptString3, iOptInt, zOptBoolean);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{46, a.f159811k, a.f159811k, 44, 54, 49, 8, 3, c.f161638p, c.f161638p, 4, 3, 5, 13, 1, c.f161635m, c.f161640r, c.f161647y, c.f161648z, 3, 9, c.f161646x, 3, c.f161639q, 67, 52, 54, 62, 52, 58, 56, 50, 65, 52, 64, 56, 66, 53, 54, 53, 66, 66, 53, 66, -10, -23, -12, -13, -10, -8, -19, q.f83622z, -21, -29, -15, -13, q.B, -23};
    }

    public C2164Ng(String str, String str2, String str3, int i10, boolean z10) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i10;
        this.A04 = z10;
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(C2164Ng c2164Ng, C2900gi c2900gi) {
        if (c2164Ng != null && c2164Ng.A09()) {
            new W6(c2900gi).A04(true, c2164Ng.A01(), c2164Ng.A03(), c2164Ng.A02(), System.currentTimeMillis(), c2164Ng.A08());
        }
    }

    public static void A07(C2164Ng c2164Ng, C2900gi c2900gi) {
        if (c2164Ng != null && c2164Ng.A0A()) {
            new W6(c2900gi).A04(false, c2164Ng.A01(), c2164Ng.A03(), c2164Ng.A02(), System.currentTimeMillis(), c2164Ng.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}
