package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.signals.SignalKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import l3.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class N7 {
    public static byte[] A03;
    public static String[] A04 = {"yonrCQ0uoeCYCSmT5ejKLJLtf9VOp321", "NDuBqnzzJqzb1WeHMragxAHoyIt26Von", "hWL4zdMk8yywijkAtqHNVn2pZmfj34f9", "9i7qyia1evnFwuCuocWilq3mxIKRQ8Gt", "sdkV7vC", "3a", "fP", "wcot"};
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 32));

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-67, -65, a.f103444p7, -65, a.f103529z7, -3, 6, -5, 10, 17, 8, c.f161636n, -3, -4, -9, -7, -4, -9, 1, -4, -9, 7, 10, 1, -1, 1, 6, -7, 4, -19, -10, -21, -6, 1, -8, -4, -19, -20, -25, -15, -20, c.C, 13, 36, c.f161635m, c.f161639q, 13, 28, 28, 17, c.f161640r, c.f161635m, 13, c.H, c.H, 13, 37, c.f161635m, c.B, 17, c.D, 19, 32, c.f161646x, 47, 35, 35, 53, 50, 50, 37, 46, 35, 37, 51, -1, -12, 1, -8, -2, -13, 37, 28, 34, 33, c.f161636n, 28, c.f161640r, c.f161640r, 34, 31, 31, c.f161643u, c.E, c.f161640r, c.f161643u, c.f161636n, 32, c.f161643u, c.f161640r, 32, c.H, c.f161647y, c.E, c.D, 5, c.f161648z, c.f161635m, c.B, c.f161639q, c.f161647y, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0A(@Nullable String str) throws JSONException, C2313Te {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap map = new HashMap();
                Iterator<String> itKeys = this.A00.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.get(next) instanceof String) {
                        map.put(next, A00(next, new JSONObject((String) this.A00.get(next))));
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    this.A00.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        A02();
    }

    private final synchronized C2163Nf A00(String str, JSONObject jSONObject) throws JSONException, C2313Te {
        C2163Nf frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 70), null))) {
            frequencyCappingData = new C2163Nf(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            C2313Te c2313Te = new C2313Te(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 86), str);
            c2313Te.A07(jSONObject);
            c2313Te.A05(1);
            throw c2313Te;
        }
        return frequencyCappingData;
    }

    private void A03(C2163Nf c2163Nf, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt(A01(75, 6, 77));
        int iOptInt2 = jSONObject.optInt(A01(101, 11, 100));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 106), 50);
        long jOptLong = jSONObject.optLong(A01(2, 3, 28));
        String strA01 = A01(64, 11, 126);
        if (jSONObject.has(strA01)) {
            c2163Nf.A06((JSONArray) jSONObject.get(strA01));
        }
        String strA02 = A01(81, 20, SignalKey.EVENT_ID);
        if (jSONObject.has(strA02)) {
            int cappingTimeSecs = jSONObject.optInt(strA02);
            c2163Nf.A04(cappingTimeSecs);
        }
        c2163Nf.A05(iOptInt, iOptInt2, jOptLong, maxCappedArrayLength);
    }

    public final String A04() {
        String list = this.A02.get();
        if (list != null) {
            return list;
        }
        if (A04[0].charAt(21) != 'J') {
            throw new RuntimeException();
        }
        A04[7] = "Yd8WV87KlA8AS9IbyfadEkj";
        return A01(0, 2, 32);
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C2163Nf.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        C2297So.A03();
    }

    public final synchronized void A08(@Nullable String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray.length() && i10 < C2163Nf.A00(); i10++) {
                    this.A01.add(jSONArray.getString(i10));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        C2297So.A03();
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C2163Nf frequencyCappingData;
        String strOptString = jSONObject.optString(A01(29, 12, 70), null);
        if (strOptString == null) {
            return;
        }
        if (this.A00.has(strOptString) && (this.A00.get(strOptString) instanceof C2163Nf)) {
            frequencyCappingData = (C2163Nf) this.A00.get(strOptString);
        } else {
            frequencyCappingData = new C2163Nf(strOptString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(strOptString, frequencyCappingData);
    }
}
