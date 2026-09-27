package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2329Tu {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final Map<EnumC2333Ty, List<String>> A02 = new HashMap();
    public final JSONObject A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{81, 92, 85, 64, q.A, 118, 104};
    }

    public C2329Tu(String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        List<String> list;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (EnumC2333Ty enumC2333Ty : EnumC2333Ty.values()) {
            this.A02.put(enumC2333Ty, new LinkedList());
        }
        for (int i10 = 0; i10 < i; i10++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                String trackerUrl = jSONObject2.getString(A00(0, 4, 35));
                String trackerTypeStr = jSONObject2.getString(A00(4, 3, 2));
                EnumC2333Ty enumC2333TyValueOf = EnumC2333Ty.valueOf(trackerUrl.toUpperCase(Locale.US));
                if (!TextUtils.isEmpty(trackerTypeStr) && (list = this.A02.get(enumC2333TyValueOf)) != null) {
                    list.add(trackerTypeStr);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String A02() {
        return this.A00;
    }

    public final List<String> A03(EnumC2333Ty enumC2333Ty) {
        return this.A02.get(enumC2333Ty);
    }

    public final JSONObject A04() {
        return this.A03;
    }
}
