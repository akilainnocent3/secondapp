package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j9, reason: from Kotlin metadata */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfSpecParser;", "", "<init>", "()V", "parseImfSpec", "", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "imfInlineSpec", "", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImfSpecParser {
    public static byte[] A00;
    public static final ImfSpecParser A01;

    static {
        A02();
        A01 = new ImfSpecParser();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{c.A, c.G, c.D, 45, c.D, c.f161636n, c.H, 32, 38, c.H, 39, 45, 44, 8, 5, c.B, 5, -8, c.f161648z, 5, 7, c.f161639q, a.f159811k, 70, 60, 44, 65, 69, a.f159811k, 72, 76, 69, 40, 77, 75, 72, 77, 68, 50, 79, 68, 66, c.f161639q, 2, 9, -2, 17, 6, 19, 2, -27, 2, 6, 4, 5, 17, 47, 34, 41, c.H, 49, 38, 51, 34, c.f161646x, 38, 33, 49, 37, 98, 85, 92, 81, q.f83619w, 89, 102, 85, 72, 41, 28, 35, c.B, 43, 32, 45, 28, c.f161640r, c.f161639q, c.f161636n, 17, -2, 17, 6, c.f161636n, c.f161635m, l3.a.C7, 2, 4, c.f161639q, 2, 2, c.f161640r, 58, 44, 46, 52, 44, 53, 59, c.f161635m, 40, 59, 40, 17, 58, 54, 53, 108, 109, 90, 107, 109, 77, 98, 102, 94, c.A, c.B, 13, 7, c.f161639q, 9, c.f161648z, -27, c.A, c.A, 9, c.B, -19, 8, c.f161646x, c.f161647y, 10, 4, c.f161636n, 6, 19, -11, c.D, 17, 6, 104, 93, 97, 89, 70, 85, 98, 91, 89, 106, 95, 99, 91, 76, 87, 98, 107, 91, 105, 103, 86, 88, 96, 56, q.f83619w, 98, 101, q.f83619w, 104, 94, 105, 94, q.f83619w, 99, 104, 48, 46, c.G, 31, 39, 0, c.G, 48, c.G, 6, 47, 43, 42, -12, q.f83622z, l3.a.C7, -29, -21, l3.a.f103529z7, l3.a.C7, -19, -27};
    }

    @JvmStatic
    public static final List<ImfDataTrack> A01(String str) throws JSONException {
        C3474qY.A09(str, A00(29, 13, 101));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(str).getJSONObject(A00(169, 17, 123)).getJSONArray(A00(0, 1, 105));
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject imfTrack = jSONArray.getJSONObject(i10).getJSONObject(A00(13, 9, 42));
            String string = imfTrack.getString(A00(199, 9, 6));
            JSONObject jSONObject = new JSONObject(imfTrack.getString(A00(186, 13, 66)));
            String string2 = jSONObject.getString(A00(140, 11, 39));
            String string3 = jSONObject.getString(A00(126, 14, 42));
            C3474qY.A06(string2);
            C3474qY.A06(string3);
            C3042j7 c3042j7 = new C3042j7(string2, string3);
            JSONArray jSONArray2 = imfTrack.getJSONArray(A00(1, 12, 63));
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                JSONObject dataTrack = jSONArray2.getJSONObject(i11);
                String strA00 = A00(151, 9, 122);
                JSONObject jSONObject2 = dataTrack.getJSONObject(strA00).getJSONObject(A00(117, 9, 127));
                String strA01 = A00(160, 9, 124);
                long j10 = jSONObject2.getLong(strA01);
                long j11 = dataTrack.getJSONObject(strA00).getJSONObject(A00(22, 7, 94)).getLong(strA01);
                JSONObject jSONObject3 = new JSONObject(dataTrack.getString(A00(102, 15, 77)));
                C3474qY.A06(string);
                arrayList.add(new ImfDataTrack(string, j10, j11, c3042j7, new C3041j6(jSONObject3.getDouble(A00(69, 9, 118)), jSONObject3.getDouble(A00(78, 9, 61)), jSONObject3.getDouble(A00(56, 13, 67)), jSONObject3.getDouble(A00(42, 14, 35)), jSONObject3.getDouble(A00(87, 15, 35)))));
            }
        }
        return arrayList;
    }
}
