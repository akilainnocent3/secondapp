package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.android.material.bottomappbar.d;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import r7.i1;
import rg.a;
import x6.f;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2379Vu {
    public static byte[] A04;
    public static String[] A05 = {"ZYrzMRmVY0fKuwQx318rNacSlgEREo8W", "DFlEfnYj9N0tv35MBsRVrv0NQ03vrQp9", "7c1jEy6Yvwz0PD0sTLnvRvzL7JrMoPnP", "hf", "LVfRkpSB2W01n6UoKBvMpgi93s4V", "wjSsCSJEOA2zcxlJjQpf4WZQJP", "cgSUujLLCITlA6k0bkAALzG3bpp7bkqz", "L2ObalbYjPtjYVm4HCkeGK0BV8R2iNFP"};
    public final EnumC2378Vt A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C2379Vu(T8 t10, String str, String str2, EnumC2375Vq enumC2375Vq) throws C2373Vn {
        String strA01 = A01(d.f50281j, 21, 91);
        String strA02 = A01(291, 11, 58);
        String strA03 = A01(f.f144638w2, 14, 109);
        String strA04 = A01(310, 4, 38);
        String strA05 = A01(302, 8, 37);
        if (TextUtils.isEmpty(str)) {
            this.A00 = EnumC2378Vt.A04;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (EnumC2378Vt.valueOf(jSONObject.getString(strA04).toUpperCase()).ordinal()) {
                case 0:
                    this.A00 = EnumC2378Vt.A03;
                    this.A01 = Long.valueOf(jSONObject.getString(A01(241, 6, 127)));
                    if (jSONObject.has(strA03)) {
                        this.A02 = jSONObject.getString(strA03);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(i1.d.HandlerC1208d.f123897l, 9, 88));
                    if (!jSONObject.getString(strA02).equals(t10.A05().A9T()) && !ProcessUtils.isRemoteRenderingProcess() && AbstractC2353Us.A03(jSONObject) != Boolean.TRUE) {
                        throw new C2373Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 122), this.A01, jSONObject.getString(strA02), t10.A05().A9T()));
                    }
                    if (!jSONObject.getString(strA01).equals(str2)) {
                        throw new C2373Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 11), this.A01, jSONObject.getString(strA01), str2));
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(EnumC2375Vq.A0H.A04()), Integer.valueOf(EnumC2375Vq.A0K.A04()), Integer.valueOf(EnumC2375Vq.A0I.A04()), Integer.valueOf(EnumC2375Vq.A0J.A04())));
                    if (jSONObject.getInt(strA05) != enumC2375Vq.A04()) {
                        if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(strA05))) || !hashSet.contains(Integer.valueOf(enumC2375Vq.A04()))) {
                            throw new C2373Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(104, 48, 28), this.A01, Integer.valueOf(jSONObject.getInt(strA05)), enumC2375Vq));
                        }
                        return;
                    }
                    return;
                default:
                    throw new C2373Vn(AdErrorType.BID_PAYLOAD_ERROR, A01(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 28, 68) + jSONObject.getString(strA04));
            }
        } catch (JSONException e10) {
            t10.A08().ABC(A01(238, 3, 5), AbstractC2312Td.A0P, new C2313Te(e10));
            throw new C2373Vn(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 88), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{34, 9, 4, 64, 69, 4, 64, 6, c.f161639q, c.f161643u, 64, 51, 36, 43, 64, c.f161648z, 5, c.f161643u, 19, 9, c.f161639q, c.f161638p, 64, 69, 19, 64, 2, 5, 9, c.f161638p, 7, 64, c.f161647y, 19, 5, 4, 64, c.f161639q, c.f161638p, 64, 51, 36, 43, 64, c.f161648z, 5, c.f161643u, 19, 9, c.f161639q, c.f161638p, 64, 69, 19, 83, a.f127263w, 117, 49, 52, 117, 49, 119, 126, 99, 49, 97, 125, 112, 114, 116, 124, 116, 127, 101, 49, 52, 98, 49, 115, 116, a.f127263w, 127, 118, 49, q.f83619w, 98, 116, 117, 49, 126, 127, 49, 97, 125, 112, 114, 116, 124, 116, 127, 101, 49, 52, 98, 68, 111, 98, 38, 35, 98, 38, 96, 105, 116, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, 38, q.f83619w, 99, 111, 104, 97, 38, 115, 117, 99, 98, 38, 105, 104, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, c.f161635m, 44, 52, 35, 46, 43, 38, 98, 0, 43, 38, c.f161643u, 35, 59, 46, 45, 35, 38, 71, 118, 126, 99, 127, 114, 103, 118, 51, 54, 96, 51, 122, 96, 51, 125, 124, 103, 51, 101, 114, 127, 122, 119, 51, q.A, 114, 125, 125, 118, 97, 51, 103, 118, 126, 99, 127, 114, 103, 118, c.f161635m, 48, 45, 43, 46, 46, 49, 44, 42, 59, 58, 126, 28, 55, 58, c.f161638p, 63, 39, 50, 49, 63, 58, 126, 42, 39, 46, 59, 126, 126, 111, 118, 7, c.f161636n, 1, 58, c.f161636n, 1, c.f161647y, c.H, 19, 40, 3, c.H, c.D, c.f161643u, 40, 3, c.B, 28, c.f161643u, c.C, 38, 39, 52, 43, 33, 39, c.G, 43, 38, 51, 36, 50, 46, 45, 55, 36, 37, c.H, 49, 45, 32, 34, 36, 44, 36, 47, 53, c.H, 40, 37, 83, 68, 75, 127, 86, 69, 82, 83, 73, 79, 78, 75, 90, 82, 79, 83, 94, 75, 90, 72, 69, 76, 89};
    }

    static {
        A02();
    }

    public C2379Vu() {
        this.A00 = EnumC2378Vt.A04;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static EnumC2375Vq A00(String str) throws C2373Vn {
        try {
            return EnumC2375Vq.A00(new JSONObject(str).getInt(A01(302, 8, 37)));
        } catch (JSONException e10) {
            throw new C2373Vn(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 88), e10);
        }
    }

    public static void A03(EnumC2375Vq enumC2375Vq) throws C2373Vn {
        if (!EnumC2375Vq.A0G.equals(enumC2375Vq) && !EnumC2375Vq.A0E.equals(enumC2375Vq) && !EnumC2375Vq.A0F.equals(enumC2375Vq)) {
            boolean zEquals = EnumC2375Vq.A0D.equals(enumC2375Vq);
            if (A05[1].charAt(20) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "X5uVqi4FyBeSosvF2q5aVclYJStrMHB5";
            strArr[2] = "BOgVvqLcU58P5XEa1Smg5LyKHeBKxxT8";
            if (zEquals) {
            } else {
                throw new C2373Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(jj.c.f100514f, 40, 9), Integer.valueOf(enumC2375Vq.A04())));
            }
        }
    }

    public final String A04() {
        if (this.A01 == null) {
            return null;
        }
        Long l10 = this.A01;
        if (A05[4].length() == 4) {
            throw new RuntimeException();
        }
        A05[7] = "9BRFtSg6abebTfCvkl6x8CVGG9ZYJ4hw";
        return l10.toString();
    }

    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != EnumC2378Vt.A04;
    }
}
