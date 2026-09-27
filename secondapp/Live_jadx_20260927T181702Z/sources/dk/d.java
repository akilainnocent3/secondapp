package dk;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ck.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class d implements b, ek.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f79374b = "name";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f79375c = "parameters";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f79376d = "$A$:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ek.a f79377a;

    @NonNull
    public static String b(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(f79375c, jSONObject2);
        return jSONObject.toString();
    }

    @Override // ek.b
    public void a(@Nullable ek.a aVar) {
        this.f79377a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // dk.b
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        ek.a aVar = this.f79377a;
        if (aVar != null) {
            try {
                aVar.a(f79376d + b(str, bundle));
            } catch (JSONException unused) {
                g.f().m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
