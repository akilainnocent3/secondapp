package j0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<c.f, String> f99299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<b, String> f99300f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f99302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f99303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, String> f99304d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99305a;

        public a(String str) {
            this.f99305a = str;
        }

        public String toString() {
            return this.f99305a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        HashMap map = new HashMap();
        f99299e = map;
        map.put(c.f.LEFT, "'left'");
        map.put(c.f.RIGHT, "'right'");
        map.put(c.f.TOP, "'top'");
        map.put(c.f.BOTTOM, "'bottom'");
        map.put(c.f.START, "'start'");
        map.put(c.f.END, "'end'");
        map.put(c.f.BASELINE, "'baseline'");
        HashMap map2 = new HashMap();
        f99300f = map2;
        map2.put(b.VERTICAL_GUIDELINE, "vGuideline");
        map2.put(b.HORIZONTAL_GUIDELINE, "hGuideline");
        map2.put(b.VERTICAL_CHAIN, "vChain");
        map2.put(b.HORIZONTAL_CHAIN, "hChain");
        map2.put(b.BARRIER, "barrier");
    }

    public h(String str, a aVar) {
        this.f99302b = null;
        this.f99304d = new HashMap();
        this.f99301a = str;
        this.f99302b = aVar;
    }

    public static void f(String[] strArr) {
        System.out.println(new j0.a("abc", "['a1', 'b2']").toString());
    }

    public void a(Map<String, String> map, StringBuilder sb2) {
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":");
            sb2.append(map.get(str));
            sb2.append(",\n");
        }
    }

    public Map<String, String> b() {
        String str = this.f99303c;
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        String string = "";
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f99303c.length(); i12++) {
            char cCharAt = this.f99303c.charAt(i12);
            if (cCharAt == ':') {
                string = sb2.toString();
                sb2.setLength(0);
            } else if (cCharAt == ',' && i10 == 0 && i11 == 0) {
                map.put(string, sb2.toString());
                sb2.setLength(0);
                string = "";
            } else if (cCharAt != ' ') {
                if (cCharAt == '[') {
                    i10++;
                } else if (cCharAt == ']') {
                    i10--;
                } else if (cCharAt == '{') {
                    i11++;
                } else if (cCharAt == '}') {
                    i11--;
                }
                sb2.append(cCharAt);
            }
        }
        map.put(string, sb2.toString());
        return map;
    }

    public String c() {
        return this.f99303c;
    }

    public String d() {
        return this.f99301a;
    }

    public a e() {
        return this.f99302b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f99301a + ":{\n");
        if (this.f99302b != null) {
            sb2.append("type:'");
            sb2.append(this.f99302b.toString());
            sb2.append("',\n");
        }
        Map<String, String> map = this.f99304d;
        if (map != null) {
            a(map, sb2);
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public h(String str, a aVar, String str2) {
        this.f99302b = null;
        this.f99304d = new HashMap();
        this.f99301a = str;
        this.f99302b = aVar;
        this.f99303c = str2;
        this.f99304d = b();
    }
}
