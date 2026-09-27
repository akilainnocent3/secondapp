package com.facebook.ads.redexgen.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class NR implements Serializable {
    public static byte[] A0C = null;
    public static final long serialVersionUID = 85021702336014823L;
    public NT A00;
    public long A01;
    public NU A02;
    public NY A03;
    public C2160Nc A04;
    public C2161Nd A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    static {
        A04();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static NR A00(JSONObject jSONObject) {
        NR nr2 = new NR();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(374, 12, 11));
        nr2.A08(new NX().A0Z(jSONObject.optString(A01(774, 5, 94))).A0Y(jSONObject.optString(A01(766, 8, 26))).A0M(jSONObject.optString(A01(136, 4, 25))).A0X(jSONObject.optString(A01(752, 14, 83))).A0V(jSONObject.optString(A01(602, 12, 101))).A0S(jSONObject.optString(A01(TTAdConstant.STYLE_SIZE_RADIO_9_16, 12, 23))).A0J(jSONObject.optString(A01(128, 8, 53))).A0O(jSONObject.optString(A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 14, 111))).A0I(jSONObject.optString(A01(93, 16, 72))).A0K(jSONObject.optString(A01(165, 8, 28))).A0N(jSONObject.optString(A01(202, 17, 8))).A0U(A03(jSONObjectOptJSONObject, A01(591, 11, 106), A01(76, 6, 30))).A0P(A03(jSONObjectOptJSONObject, A01(233, 19, 44), A01(8, 9, 63))).A0W(A03(jSONObjectOptJSONObject, A01(706, 9, 61), A01(89, 4, 119))).A0L(A03(jSONObjectOptJSONObject, A01(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 13, 99), A01(0, 8, 99))).A0T(A03(jSONObjectOptJSONObject, A01(574, 17, 41), A01(82, 7, 30))).A0Q(A03(jSONObjectOptJSONObject, A01(347, 27, 28), A01(17, 22, 67))).A0R(A03(jSONObjectOptJSONObject, A01(548, 14, 54), A01(0, 0, 55))).A0a());
        nr2.A0B(jSONObject.optString(A01(541, 7, 11)));
        nr2.A09(new C2160Nc(jSONObject.optString(A01(335, 12, 29)), jSONObject.optString(A01(151, 14, 12)), jSONObject.optJSONObject(A01(140, 11, 95)), jSONObject.optString(A02(jSONObject))));
        String strA01 = A01(779, 19, 64);
        NT ntA0K = new NT().A0L(jSONObject.optString(A01(865, 9, 113))).A0J(jSONObject.optLong(A01(841, 24, 121), -1L)).A0F(jSONObject.optInt(strA01, -1) == -1 ? jSONObject.optInt(A01(735, 17, 21), -1) : jSONObject.optInt(strA01, -1)).A0E(jSONObject.optInt(A01(634, 18, 72), Integer.MAX_VALUE)).A0D(jSONObject.optInt(A01(IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, 20, 108), -1)).A0K(C2172No.A02(jSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(A01(392, 5, 29));
        if (jSONObjectOptJSONObject2 != null) {
            ntA0K.A0M(jSONObjectOptJSONObject2.optString(A01(798, 3, 98))).A0I(jSONObjectOptJSONObject2.optInt(A01(874, 5, 9))).A0H(jSONObjectOptJSONObject2.optInt(A01(386, 6, 82)));
        }
        nr2.A06(ntA0K);
        nr2.A0F(jSONObject.optBoolean(A01(685, 21, 126)));
        nr2.A0A(new C2161Nd(AbstractC2411Xd.A04(jSONObject.optJSONArray(A01(320, 15, 95))), jSONObject.optLong(A01(252, 24, 57), 0L), jSONObject.optLong(A01(276, 44, 66), 0L), jSONObject.optBoolean(A01(476, 26, 75)), jSONObject.optBoolean(A01(397, 31, 46), false), jSONObject.optBoolean(A01(428, 34, 79), false)));
        nr2.A0C(jSONObject.optBoolean(A01(522, 19, 75)));
        nr2.A05(jSONObject.optLong(A01(109, 19, 59), 0L));
        return nr2;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{57, c.E, c.f161638p, 31, c.G, c.f161647y, 8, 3, 98, 73, 81, 72, 74, 73, 71, 66, 85, 28, 40, 53, 55, 122, c.G, 53, 53, a.f159811k, 54, 63, 122, 10, 54, 59, 35, 122, 9, 46, 53, 40, 63, 126, 67, c.A, 64, 94, 91, 91, c.A, 86, 66, 67, 88, 90, 86, 67, 94, 84, 86, 91, 91, 78, c.A, 88, 71, 82, 89, c.A, 94, 89, c.A, 108, 68, 82, 84, 68, 106, 68, 85, 102, 115, 110, 105, 96, 85, 98, q.A, 110, 98, 112, 116, a.f159811k, 7, c.f161646x, c.f161635m, 48, 53, c.f161638p, 50, 35, 52, 48, 37, 56, 39, 52, c.f161638p, 37, 40, 33, 52, 67, 70, 125, 84, 75, 70, 71, 77, 125, 78, 77, 77, 82, 125, 86, 75, 79, 71, 81, 77, 92, 92, 115, 95, 69, 86, 73, 98, 111, q.f83619w, 121, 36, 51, 50, 50, 41, 40, c.C, 47, 37, 41, 40, 118, 116, 121, 121, 74, 97, 122, 74, 116, 118, 97, 124, 122, 123, 102, q.f83619w, q.A, 96, 98, 106, 119, 124, c.C, c.E, c.f161638p, 31, c.G, c.f161647y, 8, 3, 37, c.f161638p, 31, 2, c.f161638p, 69, 68, 77, 64, 88, 126, 66, 77, 72, 66, 74, 126, 85, 68, 89, 85, 117, 116, 98, 101, rg.a.f127263w, 127, 112, 101, rg.a.f127263w, 126, 127, 78, 101, rg.a.f127263w, 101, 125, 116, c.f161643u, c.C, 1, c.B, c.D, c.C, c.A, c.f161643u, 41, c.f161647y, c.C, 3, c.B, 2, 81, 90, 66, 91, 89, 90, 84, 81, 106, 86, 90, 64, 91, 65, 106, 65, 80, 77, 65, 69, 78, 68, 127, 67, 65, 82, 68, 127, 70, 79, 82, 67, 69, 127, 86, 73, 69, 87, 127, 84, 73, 77, 69, 62, 53, 63, 4, 56, 58, 41, 63, 4, a.f159811k, 52, 41, 56, 62, 4, 45, 50, 62, 44, 4, 47, 50, 54, 62, 4, a.f159811k, 52, 41, 4, 40, 62, 56, 52, 53, 63, 4, 62, 53, 63, 4, 56, 58, 41, 63, 35, 40, 34, c.C, 37, 39, 52, 34, c.C, 47, 43, 39, 33, 35, 53, 98, 102, 101, 96, 91, 103, 107, 105, 105, 101, 106, 96, 99, 119, 106, 104, 90, 98, 106, 106, 98, 105, 96, 90, 117, 105, q.f83619w, 124, 90, 118, q.A, 106, 119, 96, 90, q.A, 96, 125, q.A, 117, 119, 124, 119, 96, 123, q.A, 77, 102, 119, 106, 102, 35, 46, 34, 44, 35, 63, 109, 105, 101, 99, 97, 94, 68, 104, 82, 89, 83, 104, 84, 86, 69, 83, 104, 65, 5, 104, 69, 82, 83, 82, 68, 94, 80, 89, 104, 82, 89, 86, 85, 91, 82, 83, 63, 37, 9, 57, 53, 9, 51, 56, 50, 9, 53, 55, 36, 50, 9, 32, q.f83619w, 9, 36, 51, 50, 51, 37, 63, 49, 56, 9, 51, 56, 55, 52, 58, 51, 50, 94, 68, 104, 69, 82, 64, 86, 69, 83, 82, 83, 104, 86, 83, 59, 33, 13, 33, 55, 49, a.f159811k, 60, 54, 13, 55, 60, 54, 13, 49, 51, 32, 54, 13, 55, 60, 51, 48, 62, 55, 54, 107, q.A, 93, 116, 107, 102, 103, 109, 93, 99, 119, 102, 107, 109, 93, 111, 119, 118, 103, 102, 59, 33, 13, 37, 51, 38, 49, 58, 13, 51, 60, 54, 13, 48, 32, a.f159811k, 37, 33, 55, 98, 115, q.A, 121, 115, 117, 119, 95, 78, 93, 91, 65, 74, 93, 92, 71, 70, 95, 112, 78, 75, 124, 111, 122, 103, 96, 105, 81, 109, 97, 123, 96, 122, 66, 81, 68, 89, 94, 87, 111, 83, 95, 69, 94, 68, 111, 68, 85, 72, 68, 1, c.f161643u, 7, c.D, c.G, c.f161646x, 44, 7, c.f161648z, c.f161635m, 7, c.f161638p, c.G, 8, c.f161647y, c.f161643u, c.E, 35, 10, c.G, c.f161640r, 9, c.C, 6, c.f161640r, c.f161648z, c.D, c.E, 17, 6, 42, 19, c.D, 7, 42, c.E, c.f161640r, 13, 1, 42, c.f161648z, 1, c.f161646x, 34, 52, 50, 62, 63, 53, 34, c.f161638p, 55, 62, 35, c.f161638p, 35, 52, 38, 48, 35, 53, 117, 110, 105, q.A, 89, 99, 104, 98, 89, 101, 103, 116, 98, 96, 123, 124, q.f83619w, 76, 118, 107, 122, 103, 76, 103, 97, 114, 125, 96, 122, 103, 122, 124, 125, c.f161646x, c.f161639q, 8, c.f161640r, 56, c.f161638p, 9, 19, c.f161647y, 8, 56, 19, c.f161647y, 6, 9, c.f161646x, c.f161638p, 19, c.f161638p, 8, 9, 87, 77, 94, 65, 123, 80, 65, 92, 80, 119, 111, 109, 116, 91, 101, 106, 96, 91, 104, 107, 119, 97, 91, 118, 97, 115, 101, 118, 96, 127, 103, 101, 124, 124, 109, 110, 96, 105, 83, 127, 105, 111, 99, 98, 104, 127, 57, 37, 41, 35, 43, 38, c.f161647y, 41, 37, 36, 62, 47, 50, 62, 112, 118, 97, 119, 106, 119, 111, 102, 51, 46, 51, 43, 34, 44, 55, 42, 50, 48, 41, 41, 56, 59, 53, 60, 6, 42, 60, 58, 54, 55, a.f159811k, 42, c.f161638p, 9, c.A, 6, c.C, c.f161646x, c.f161647y, 31, 47, 17, 5, 4, 31, 0, 28, 17, 9, 47, c.f161647y, c.H, 17, c.f161643u, 28, c.f161647y, c.f161646x, 4, c.E, c.f161648z, c.A, c.G, 45, c.f161648z, 7, 0, 19, 6, c.E, c.G, 28, 45, 1, c.A, 17, c.f161648z, 9, 4, 5, c.f161639q, 63, c.f161640r, c.f161643u, 5, c.f161636n, c.f161639q, 1, 4, 63, 19, 9, c.D, 5, 63, 2, c.C, c.f161646x, 5, 19, c.H, 1, c.f161636n, 13, 7, 55, c.G, c.D, 4, 103, 121, 116, q.f83619w, rg.a.f127263w};
    }

    public static String A02(JSONObject jSONObject) {
        String strA01 = A01(186, 16, 56);
        String strA02 = A01(39, 37, 46);
        String strOptString = jSONObject.optString(strA01, strA02);
        if (strOptString.equals(strA02)) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(374, 12, 11));
            if (jSONObjectOptJSONObject != null) {
                strA02 = jSONObjectOptJSONObject.optString(strA01, strA02);
            }
            return strA02;
        }
        return strOptString;
    }

    public static String A03(JSONObject jSONObject, String str, String str2) {
        return jSONObject != null ? jSONObject.optString(str, str2) : str2;
    }

    private final void A05(long j10) {
        this.A01 = Math.max(0L, j10);
    }

    private void A06(NT nt2) {
        this.A00 = nt2;
    }

    private final void A07(NU nu2) {
        this.A02 = nu2;
    }

    private final void A08(NY ny2) {
        this.A03 = ny2;
    }

    private final void A09(C2160Nc c2160Nc) {
        this.A04 = c2160Nc;
    }

    private final void A0A(C2161Nd c2161Nd) {
        this.A05 = c2161Nd;
    }

    private final void A0B(String str) {
        this.A06 = str;
    }

    private final void A0C(boolean z10) {
        this.A08 = z10;
    }

    private final void A0D(boolean z10) {
        this.A09 = z10;
    }

    private final void A0E(boolean z10) {
        this.A0A = z10;
    }

    private final void A0F(boolean z10) {
        this.A0B = z10;
    }

    public final long A0G() {
        return this.A01;
    }

    public final NU A0H() {
        return this.A02;
    }

    public final NY A0I() {
        return this.A03;
    }

    public final C2160Nc A0J() {
        return this.A04;
    }

    public final C2161Nd A0K() {
        return this.A05;
    }

    public final String A0L() {
        return this.A06;
    }

    public final void A0M(int i10) {
        this.A00.A0D(i10);
        A07(this.A00.A0Q());
    }

    public final void A0N(JSONObject jSONObject) {
        A07(this.A00.A0Q());
    }

    public final void A0O(JSONObject jSONObject) {
        this.A00.A0O(jSONObject.optBoolean(A01(801, 22, 105)));
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 27), true));
        A07(this.A00.A0Q());
        A0R(jSONObject.optBoolean(A01(462, 14, 46)));
        A0D(jSONObject.optBoolean(A01(652, 13, 31)));
        A0E(jSONObject.optBoolean(A01(665, 20, 10)));
    }

    public final void A0P(JSONObject jSONObject) {
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 27), true));
        A07(this.A00.A0Q());
    }

    public final void A0Q(JSONObject jSONObject) {
        this.A00.A0G(jSONObject.optInt(A01(823, 18, SignalKey.EVENT_ID)));
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 27), true));
        this.A00.A0P(jSONObject.optBoolean(A01(IronSourceError.ERROR_NT_LOAD_NO_CONFIG, 20, 29), false));
        A07(this.A00.A0Q());
        A0D(jSONObject.optBoolean(A01(652, 13, 31)));
    }

    public final void A0R(boolean z10) {
        this.A07 = z10;
    }

    public final boolean A0S() {
        return this.A07;
    }

    public final boolean A0T() {
        return this.A08;
    }

    public final boolean A0U() {
        return this.A01 > 0;
    }

    public final boolean A0V() {
        return this.A09;
    }

    public final boolean A0W() {
        return this.A0B;
    }
}
