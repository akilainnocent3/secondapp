package sg.bigo.ads.api.a;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f132706a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f132707b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f132708c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f132709d = "";
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f132710a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f132711b = "";
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f132712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f132713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f132714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f132715d;

        public c(@NonNull JSONObject jSONObject) {
            this.f132712a = "";
            this.f132713b = 0;
            this.f132714c = null;
            this.f132715d = "";
            this.f132712a = jSONObject.optString("title", "");
            this.f132713b = jSONObject.optInt("type", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.f132714c = new String[jSONArrayOptJSONArray.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f132714c[i10] = jSONArrayOptJSONArray.optString(i10);
                }
            }
            this.f132715d = jSONObject.optString("id", "");
        }
    }

    String a();

    String b();

    long c();

    int d();

    String e();

    int f();

    String g();

    String h();

    f[] i();

    f j();

    f k();

    b l();

    c[] m();

    a n();
}
