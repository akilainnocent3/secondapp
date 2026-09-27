package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import f6.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import l3.a;
import org.json.JSONException;
import org.json.JSONObject;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2694dM {
    public static byte[] A00;
    public static String[] A01 = {"qx9J4yAnPXaVyRX1wkhfMyD35E0bVkcp", "bG7a76MJuQYCTQVI4bECP0jat3LYDm8S", "3sji", "WOIjjsVKw0oGTZJ8bV1Eiv07MXmRBJ4e", "zigTdk", "jLtidcNh89Szai5k4uiuh5UaOWCNfF4m", "9OqLRA6IbqecmBl4IJChXH2akamtN0Bd", "1PwXl0SmV68MCkNjB88Y7o3DlBd3CbFY"};
    public static final String A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
            String[] strArr = A01;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "3GrjuQcpYdFWBcs25Ezt7MBLI0wjxHRp";
            strArr2[7] = "nD922LhxjrSAIQnDmHWR8rAyvz5NrvSF";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-71, -41, a.E7, -34, -37, -106, -29, -33, -23, -23, -106, -36, -27, q.B, -106, -36, -33, -30, -37, -106, -21, q.B, -30, -80, -106, c.f161643u, 48, 50, 55, 52, -17, 60, 56, 66, 66, -17, 53, 62, 65, -17, 56, 60, 48, 54, 52, -17, 68, 65, 59, 9, -17, -47, -43, -32, q.B, c.f161647y, c.f161647y, c.f161643u, c.f161647y, a.f103460r7, c.f161643u, 19, 8, 17, c.f161636n, 17, 10, a.f103460r7, 6, 4, 6, c.f161635m, 8, 7, a.f103460r7, 9, c.f161636n, c.f161639q, 8, a.f103460r7, 9, c.f161643u, c.f161647y, a.f103460r7, c.B, c.f161647y, c.f161639q, -35, a.f103460r7, -36, a.f103428n7, -41, c.f161635m, -6, -1, -5, 4, -7, -5, -28, -5, 10, 13, 5, 8, 1, -17, -21, -46, -12, -15, -27, -25, -11, -11, -21, -16, -23, -94, q.B, -21, -18, -25, -94, -9, -12, -18, -68, -94, -16, c.f161643u, c.f161639q, 3, 5, 19, 19, 9, c.f161638p, 7, a.f103436o7, 9, 13, 1, 7, 5, a.f103436o7, c.f161647y, c.f161643u, c.f161636n, a.B7, a.f103436o7, 34, 68, 65, 53, 55, 69, 69, 59, 64, 57, q.f83622z, 72, 59, 54, 55, 65, q.f83622z, 71, 68, 62, c.f161636n, q.f83622z, c.f161639q, c.H, c.A, -19, -8, -9, -12, -18};
    }

    static {
        A04();
        A02 = C2694dM.class.getSimpleName();
    }

    public static WebResourceResponse A00(C2900gi c2900gi, C2306Sx c2306Sx, WebResourceRequest webResourceRequest, C2692dK c2692dK, boolean z10) {
        String string = webResourceRequest.getUrl().toString();
        if (c2692dK.A05) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(string);
            if (c2692dK.A01.contains(string)) {
                StringBuilder sb2 = new StringBuilder();
                String url = A03(108, 21, 31);
                sb2.append(url).append(string).toString();
                File cachedFile = c2306Sx.A0P(string);
                if (cachedFile != null) {
                    if (z10) {
                        String url2 = c2692dK.A00;
                        if (string.equals(url2)) {
                            return A02(map, strGuessContentTypeFromName, new C2687dF(c2900gi.A02(), new FileInputStream(cachedFile), new Ir(c2900gi, string)));
                        }
                    }
                    return A01(map, strGuessContentTypeFromName, cachedFile);
                }
                StringBuilder sb3 = new StringBuilder();
                String url3 = A03(0, 25, 19);
                sb3.append(url3).append(string).toString();
            }
            if (c2692dK.A02.contains(string)) {
                StringBuilder sb4 = new StringBuilder();
                String url4 = A03(129, 22, 61);
                sb4.append(url4).append(string).toString();
                File fileA0Q = c2306Sx.A0Q(string);
                if (fileA0Q != null) {
                    return A01(map, strGuessContentTypeFromName, fileA0Q);
                }
                StringBuilder sb5 = new StringBuilder();
                String url5 = A03(25, 26, 108);
                sb5.append(url5).append(string).toString();
            }
            if (c2692dK.A03.contains(string)) {
                StringBuilder sb6 = new StringBuilder();
                String url6 = A03(151, 22, 111);
                sb6.append(url6).append(string).toString();
                return AbstractC2790ew.A00(c2900gi, webResourceRequest, webResourceRequest.getUrl(), strGuessContentTypeFromName, map);
            }
        } catch (IOException e10) {
            StringBuilder sb7 = new StringBuilder();
            String url7 = A03(54, 35, 64);
            String mimeType = sb7.append(url7).append(string).toString();
            String url8 = A03(89, 17, 51);
            Log.e(url8, mimeType, e10);
        }
        return null;
    }

    public static WebResourceResponse A01(HashMap<String, String> responseHeaders, String str, File file) throws FileNotFoundException {
        return A02(responseHeaders, str, new FileInputStream(file));
    }

    public static WebResourceResponse A02(HashMap<String, String> responseHeaders, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 61), responseHeaders, inputStream);
    }

    public static void A05(T8 t10, String str, String str2) {
        C2313Te c2313Te = new C2313Te(A03(51, 3, 42));
        c2313Te.A05(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(176, 2, 34), str);
            jSONObject.put(A03(178, 3, 31), str2);
            c2313Te.A07(jSONObject);
        } catch (JSONException unused) {
        }
        t10.A08().ABD(A03(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 3, 72), AbstractC2312Td.A12, c2313Te);
    }
}
