package hk;

import com.google.auto.value.AutoValue;
import ik.f0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
@uk.a
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f88454a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tk.a f88455b = new wk.e().k(a.f88399b).j();

    public static j a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString(wl.d.f143425a), jSONObject.getString(wl.d.f143427c), jSONObject.getString(wl.d.f143428d), jSONObject.getString(wl.d.f143426b), jSONObject.getLong(wl.d.f143429e));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    public static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public f0.f.d.e h() {
        return f0.f.d.e.a().d(f0.f.d.e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
