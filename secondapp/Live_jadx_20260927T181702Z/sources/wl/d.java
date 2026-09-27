package wl;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
@uk.a
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f143425a = "rolloutId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f143426b = "variantId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f143427c = "parameterKey";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f143428d = "parameterValue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f143429e = "templateVersion";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tk.a f143430f = new wk.e().k(wl.a.f143406b).j();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(@NonNull String str);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(long j10);

        @NonNull
        public abstract a f(@NonNull String str);
    }

    @NonNull
    public static a a() {
        return new b.C1507b();
    }

    @NonNull
    public static d b(@NonNull String str) throws JSONException {
        return c(new JSONObject(str));
    }

    @NonNull
    public static d c(@NonNull JSONObject jSONObject) throws JSONException {
        return a().d(jSONObject.getString(f143425a)).f(jSONObject.getString(f143426b)).b(jSONObject.getString(f143427c)).c(jSONObject.getString(f143428d)).e(jSONObject.getLong(f143429e)).a();
    }

    @NonNull
    public abstract String d();

    @NonNull
    public abstract String e();

    @NonNull
    public abstract String f();

    public abstract long g();

    @NonNull
    public abstract String h();
}
