package defpackage;

import com.sporty.android.permission.location.UserAddress;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class o5p {
    public static final void a(JSONObject jSONObject, UserAddress userAddress) throws JSONException {
        if (userAddress != null) {
            jSONObject.put("gpsLatitude", userAddress.e);
            jSONObject.put("gpsLongitude", userAddress.f);
            String str = userAddress.c;
            if (str != null) {
                jSONObject.put("gpsCountry", str);
            }
            String str2 = userAddress.b;
            if (str2 != null) {
                jSONObject.put("gpsRegion", str2);
            }
            String str3 = userAddress.a;
            if (str3 != null) {
                jSONObject.put("gpsCity", str3);
            }
            String str4 = userAddress.i;
            if (str4 != null) {
                jSONObject.put("gpsPostalCode", str4);
            }
        }
    }
}
