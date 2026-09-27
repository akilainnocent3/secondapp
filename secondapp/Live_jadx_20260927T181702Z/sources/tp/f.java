package tp;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f137131a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f137132b = null;

    public void a(String str, String str2) {
        this.f137131a.put(str, str2);
    }

    public String b() {
        return this.f137132b;
    }

    public Map<String, String> c() {
        return this.f137131a;
    }

    public void d(String str) {
        this.f137132b = str;
    }
}
