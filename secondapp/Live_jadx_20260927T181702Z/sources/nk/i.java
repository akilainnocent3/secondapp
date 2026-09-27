package nk;

import fk.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f117441a;

    public i(h0 h0Var) {
        this.f117441a = h0Var;
    }

    public static j a(int i10) {
        if (i10 == 3) {
            return new n();
        }
        ck.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt(h.f117419c)).a(this.f117441a, jSONObject);
    }
}
