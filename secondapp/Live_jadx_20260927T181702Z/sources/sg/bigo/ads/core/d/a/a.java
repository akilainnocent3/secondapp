package sg.bigo.ads.core.d.a;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134620a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134621b = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, C1374a> f134622c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.a.a$a, reason: collision with other inner class name */
    public static class C1374a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f134623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f134624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f134625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f134626d;

        public static C1374a a(String str) {
            C1374a c1374a = new C1374a();
            c1374a.f134623a = str;
            c1374a.f134624b = true;
            c1374a.f134625c = true;
            c1374a.f134626d = 86400000;
            return c1374a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.common.t.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.f134623a = jSONObject.optString("event_id");
            this.f134624b = jSONObject.optInt("status") == 1;
            this.f134625c = jSONObject.optInt("delay") == 1;
            int iOptInt = jSONObject.optInt("expired") * 1000;
            this.f134626d = iOptInt;
            if (iOptInt == 0) {
                this.f134626d = 86400000;
            }
        }
    }

    public a() {
        HashMap<String, C1374a> map = new HashMap<>();
        this.f134622c = map;
        b();
        map.put("06002002", C1374a.a("06002002"));
        map.put("06002007", C1374a.a("06002007"));
    }

    private void b() {
        this.f134620a = 10;
        this.f134621b = 900000;
        this.f134622c.clear();
    }

    public final int a() {
        return Math.round(this.f134620a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f134620a = jSONObject.optInt("delay_num", 10);
        int iOptInt = jSONObject.optInt("delay_interval") * 1000;
        this.f134621b = iOptInt;
        if (iOptInt == 0) {
            this.f134621b = 900000;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("event_config");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            C1374a c1374a = new C1374a();
            c1374a.a(jSONArrayOptJSONArray.optJSONObject(i10));
            if (q.b((CharSequence) c1374a.f134623a)) {
                this.f134622c.put(c1374a.f134623a, c1374a);
            }
        }
    }

    public final boolean a(String str) {
        C1374a c1374a = this.f134622c.get(str);
        if (c1374a == null) {
            return false;
        }
        return c1374a.f134624b;
    }
}
