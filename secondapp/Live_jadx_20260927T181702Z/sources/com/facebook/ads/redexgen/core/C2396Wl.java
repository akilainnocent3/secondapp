package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.internal.protocol.AdPlacementType;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l3.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2396Wl {
    public static C2396Wl A03;
    public static byte[] A04;
    public static String[] A05 = {"5MKMOaVWDDOIRCHctWxXh6vg", "GTC1GbhELwGgGpWjZKevJ0k3Uxf5MI", "MErkTVrLaasGcwo7fnbPc0zPsPKQVooy", "Ww5tByWtz7", "O4OPIcLjmjm8Tl1QjT4vF9B23yTFDVzh", "ARYbvHkkpIBkY7WVIiyXY2IMU7tTgba1", "T0IhwzJuni2c17YqQ80jTeD3w7vBm05R", "Etvi9wSKDpLI2gJoBB"};
    public final T8 A00;
    public final Map<String, Set<String>> A02 = new HashMap();
    public final C2395Wk A01 = new C2395Wk();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-109, -114, a.f103484u7, a.f103502w7, a.f103468s7, a.f103529z7, a.f103511x7, a.A7, a.f103520y7, a.f103529z7, a.B7, c.f161638p, 17, 32, 17, 34, 1, -2, 17, -2, -45, -44, -43, a.f103428n7, -35, a.f103428n7, -29, a.f103428n7, -34, -35, -90, -98, -83, -102, -99, -102, -83, -102, -9, -13, q.B, -22, -20, -12, -20, -11, -5, -6, -75, -74, -79, -76, -89, -90, -124, -93, -80, -80, -89, -76, -123, -79, -73, -80, -74, c.D, c.E, c.f161648z, c.C, c.f161636n, c.f161635m, -16, c.f161647y, c.E, c.f161636n, c.C, c.D, c.E, c.f161640r, c.E, c.f161640r, 8, 19, -22, c.f161648z, 28, c.f161647y, c.E, 19, c.f161646x, c.f161639q, c.f161643u, 5, 4, -19, 5, 4, 9, c.f161647y, 13, q.f83622z, 5, 3, c.f161646x, 1, c.f161638p, 7, c.f161636n, 5, -29, c.f161639q, c.f161647y, c.f161638p, c.f161646x, -27, -26, a.C7, -28, -41, -42, a.f103436o7, -45, -26, -37, q.B, -41, -76, -45, -32, -32, -41, -28, -75, a.C7, -25, -32, -26, -88, -87, -92, -89, -102, -103, -125, -106, -87, -98, -85, -102, rg.a.f127263w, -92, -86, -93, -87, -32, a.C7, -36, -33, -46, -47, -65, a.f103460r7, -80, -36, -30, -37, a.C7, -80, -91, -87, -95, -101, -81, -80, -99, -87, -84, 34, 39, c.H, 19, 4, 6};
    }

    static {
        A04();
    }

    public C2396Wl(T8 t10) {
        this.A00 = t10;
    }

    public static C2396Wl A00(T8 t10) {
        if (A03 == null) {
            A03 = new C2396Wl(t10);
        }
        return A03;
    }

    private final String A02(String str) {
        return this.A01.A04(this.A00, str, A01(181, 2, 89));
    }

    private String A03(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(30, 8, 9));
        if (jSONObjectOptJSONObject == null) {
            return AdPlacementType.BANNER.toString();
        }
        if (jSONObjectOptJSONObject.optString(A01(2, 9, 54)).equals(A01(0, 2, 46))) {
            return AdPlacementType.BANNER.toString();
        }
        return AdPlacementType.MEDIUM_RECTANGLE.toString();
    }

    private void A05(String str) {
        A06(str, 0);
        this.A01.A06(this.A00, str, A01(181, 2, 89));
    }

    private void A06(String str, int i10) {
        if (str.equals(AdPlacementType.REWARDED_VIDEO.toString())) {
            this.A01.A05(this.A00, A01(154, 13, 61), i10);
            return;
        }
        if (str.equals(AdPlacementType.INTERSTITIAL.toString())) {
            this.A01.A05(this.A00, A01(65, 23, 119), i10);
            return;
        }
        if (str.equals(AdPlacementType.BANNER.toString())) {
            this.A01.A05(this.A00, A01(48, 17, 18), i10);
            return;
        }
        if (str.equals(AdPlacementType.MEDIUM_RECTANGLE.toString())) {
            this.A01.A05(this.A00, A01(88, 26, 112), i10);
        } else if (str.equals(AdPlacementType.NATIVE.toString())) {
            this.A01.A05(this.A00, A01(137, 17, 5), i10);
        } else {
            if (!str.equals(AdPlacementType.NATIVE_BANNER.toString())) {
                return;
            }
            this.A01.A05(this.A00, A01(114, 23, 66), i10);
        }
    }

    private final void A07(String str, String str2) {
        if (this.A02.get(str) == null) {
            this.A02.put(str, new HashSet());
        }
        this.A02.get(str).add(str2);
    }

    private boolean A08(String str, String str2) {
        int iA0J = C2350Up.A0J(this.A00);
        if (str.equals(AdPlacementType.INTERSTITIAL.toString()) || str.equals(AdPlacementType.REWARDED_VIDEO.toString())) {
            iA0J *= 2;
        }
        if (this.A02.get(str) != null) {
            int maxLoadedAdsAllowed = A09(str);
            if (maxLoadedAdsAllowed <= iA0J && this.A02.get(str).contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int A09(String str) {
        if (this.A02.get(str) == null) {
            return 0;
        }
        return this.A02.get(str).size();
    }

    public final int A0A(String str) {
        if (str.equals(AdPlacementType.REWARDED_VIDEO.toString())) {
            return this.A01.A03(this.A00, A01(154, 13, 61), 0);
        }
        if (str.equals(AdPlacementType.INTERSTITIAL.toString())) {
            return this.A01.A03(this.A00, A01(65, 23, 119), 0);
        }
        if (str.equals(AdPlacementType.BANNER.toString())) {
            return this.A01.A03(this.A00, A01(48, 17, 18), 0);
        }
        if (str.equals(AdPlacementType.MEDIUM_RECTANGLE.toString())) {
            return this.A01.A03(this.A00, A01(88, 26, 112), 0);
        }
        if (str.equals(AdPlacementType.NATIVE.toString())) {
            return this.A01.A03(this.A00, A01(137, 17, 5), 0);
        }
        if (!str.equals(AdPlacementType.NATIVE_BANNER.toString())) {
            return 0;
        }
        C2395Wk c2395Wk = this.A01;
        T8 t10 = this.A00;
        String strA01 = A01(114, 23, 66);
        if (A05[5].charAt(25) != '7') {
            throw new RuntimeException();
        }
        A05[3] = "fotbcTaHfC";
        return c2395Wk.A03(t10, strA01, 0);
    }

    public final Pair<String, String> A0B(String str) {
        String strA01 = A01(167, 10, 12);
        String strA02 = A02(str);
        if (strA02 == null) {
            return null;
        }
        try {
            JSONObject storedAdResponse = new JSONObject(strA02);
            Iterator<String> itKeys = storedAdResponse.keys();
            while (itKeys.hasNext()) {
                try {
                    String clientToken = itKeys.next();
                    if (!A08(str, clientToken)) {
                        JSONObject jSONObject = new JSONObject((String) storedAdResponse.get(clientToken));
                        if (!jSONObject.has(strA01)) {
                            continue;
                        } else {
                            if (System.currentTimeMillis() - jSONObject.getLong(strA01) < C2350Up.A02(this.A00)) {
                                String storedResponsesString = (String) storedAdResponse.get(clientToken);
                                Pair<String, String> pair = new Pair<>(clientToken, storedResponsesString);
                                A07(str, clientToken);
                                return pair;
                            }
                            A0E(str, clientToken);
                        }
                    }
                } catch (JSONException unused) {
                    A05(str);
                    return null;
                }
            }
            return null;
        } catch (JSONException unused2) {
            A05(str);
            return null;
        }
    }

    public final void A0C(String str) {
        try {
            JSONObject adData = new JSONObject(str);
            JSONArray jSONArray = adData.getJSONArray(A01(38, 10, 87));
            JSONArray placementJSON = jSONArray.getJSONObject(0).getJSONArray(A01(11, 3, 125));
            if (placementJSON.length() == 0) {
                return;
            }
            JSONObject jSONObject = placementJSON.getJSONObject(0).getJSONObject(A01(16, 4, 109));
            String string = jSONObject.getString(A01(14, 2, 126));
            String clientToken = jSONArray.getJSONObject(0).getJSONObject(A01(20, 10, 63)).getString(A01(177, 4, 126));
            if (A00(this.A00).A0F(clientToken)) {
                return;
            }
            if (clientToken.equals(AdPlacementType.BANNER.toString())) {
                clientToken = A03(jSONObject);
            }
            String strA02 = A02(clientToken);
            if (strA02 == null) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strA02);
            adData.put(A01(167, 10, 12), System.currentTimeMillis());
            jSONObject2.put(string, adData.toString());
            this.A01.A06(this.A00, clientToken, jSONObject2.toString());
            A06(clientToken, A0A(clientToken) + 1);
            A07(clientToken, string);
        } catch (JSONException unused) {
        }
    }

    public final void A0D(String str, String str2) {
        if (str == null || str2 == null || this.A02.get(str) == null) {
            return;
        }
        this.A02.get(str).remove(str2);
    }

    public final void A0E(String str, String str2) {
        if (C2350Up.A02(this.A00) <= 0) {
            return;
        }
        int newStoredCount = A0A(str) - 1;
        if (newStoredCount < 0) {
            newStoredCount = 0;
        }
        A06(str, newStoredCount);
        String storedResponses = A02(str);
        if (storedResponses == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(storedResponses);
            jSONObject.remove(str2);
            this.A01.A06(this.A00, str, jSONObject.toString());
            A0D(str, str2);
        } catch (JSONException unused) {
        }
    }

    public final boolean A0F(String str) {
        return !C2350Up.A1A(this.A00) && (str.equals(AdPlacementType.BANNER.toString()) || str.equals(AdPlacementType.MEDIUM_RECTANGLE.toString()));
    }
}
