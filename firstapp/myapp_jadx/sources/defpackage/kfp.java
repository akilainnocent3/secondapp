package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class kfp {
    public static final String a(String str, JSONObject jSONObject) {
        String str2 = vZBMKENANSz.gJjvdtxoftY;
        if (jSONObject != null) {
            try {
                String strOptString = jSONObject.optString(str, str2);
                if (strOptString != null) {
                    return strOptString;
                }
            } catch (Exception e) {
                itf0.a.n(lx5.a("Failed to getString for key=", str, ", error=", e.getMessage()), new Object[0]);
            }
        }
        return str2;
    }
}
