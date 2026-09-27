package yads;

import android.os.Build;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ew3 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        lw3.a(jSONObject, r7.y0.f124211n, Build.MANUFACTURER + "; " + Build.MODEL);
        lw3.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        lw3.a(jSONObject, Q6.F, C4235d4.f61260d);
        return jSONObject;
    }
}
