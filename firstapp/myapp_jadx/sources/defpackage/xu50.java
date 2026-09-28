package defpackage;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class xu50 {
    public noa a;
    public noa b;

    public final kk1 a(b bVar) throws jrh {
        String string;
        JSONArray jSONArray = bVar.g;
        long j = bVar.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                b bVarC = this.a.c();
                String string3 = null;
                if (bVarC == null) {
                    string = null;
                } else {
                    try {
                        string = bVarC.b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    b bVarC2 = this.b.c();
                    if (bVarC2 != null) {
                        try {
                            string3 = bVarC2.b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = uu50.a;
                ik1.a aVar = new ik1.a();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                aVar.a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                aVar.b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                aVar.c = strOptString;
                aVar.d = string;
                aVar.e = j;
                aVar.f = (byte) (aVar.f | 1);
                hashSet.add(aVar.a());
            } catch (JSONException e) {
                throw new jrh("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new kk1(hashSet);
    }
}
