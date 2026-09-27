package fp;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f84986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f84990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f84991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84992g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84993h = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f84996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f84997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f84998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f84999f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f84994a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f84995b = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f85000g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f85001h = false;

        public d a() {
            d dVar = new d();
            dVar.f84986a = this.f84994a;
            dVar.f84992g = this.f85000g;
            dVar.f84987b = this.f84995b;
            dVar.f84993h = this.f85001h;
            dVar.f84988c = this.f84996c;
            dVar.f84989d = this.f84997d;
            dVar.f84990e = this.f84998e;
            dVar.f84991f = this.f84999f;
            return dVar;
        }

        public a b(String brand) {
            this.f84999f = brand;
            return this;
        }

        public a c(String contentCategory) {
            this.f84997d = contentCategory;
            return this;
        }

        public a d(String contentId) {
            this.f84996c = contentId;
            return this;
        }

        public a e(String contentName) {
            this.f84998e = contentName;
            return this;
        }

        public a f(float price) {
            this.f84994a = price;
            this.f85000g = true;
            return this;
        }

        public a g(int quantity) {
            this.f84995b = quantity;
            this.f85001h = true;
            return this;
        }
    }

    public static a i() {
        return new a();
    }

    public JSONObject j() {
        JSONObject jSONObject;
        Throwable th2;
        try {
            jSONObject = new JSONObject();
            try {
                if (this.f84993h) {
                    jSONObject.put(FirebaseAnalytics.d.C, this.f84987b);
                }
                if (!TextUtils.isEmpty(this.f84988c)) {
                    jSONObject.put("content_id", this.f84988c);
                }
                if (!TextUtils.isEmpty(this.f84989d)) {
                    jSONObject.put("content_category", this.f84989d);
                }
                if (!TextUtils.isEmpty(this.f84990e)) {
                    jSONObject.put("content_name", this.f84990e);
                }
                if (!TextUtils.isEmpty(this.f84991f)) {
                    jSONObject.put("brand", this.f84991f);
                }
                if (this.f84992g) {
                    float f10 = this.f84986a;
                    if (f10 != Float.NaN) {
                        jSONObject.put("price", String.valueOf(f10));
                    }
                }
                return jSONObject;
            } catch (Throwable th3) {
                th2 = th3;
                th2.printStackTrace();
                return jSONObject;
            }
        } catch (Throwable th4) {
            jSONObject = null;
            th2 = th4;
        }
    }
}
