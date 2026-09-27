package j0;

import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<EnumC0930b, String> f99216i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EnumC0930b f99217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<s> f99218h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f f99219a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f99221c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f99220b = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f99222d = Integer.MIN_VALUE;

        public a(c.f fVar) {
            this.f99219a = fVar;
        }

        public void a(StringBuilder sb2) {
            if (this.f99220b != null) {
                sb2.append(this.f99219a.toString().toLowerCase());
                sb2.append(":");
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String b() {
            return b.this.f99301a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(C4235d4.j.f61460d);
            if (this.f99220b != null) {
                sb2.append("'");
                sb2.append(this.f99220b.b());
                sb2.append("',");
                sb2.append("'");
                sb2.append(this.f99220b.f99254a.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.f99221c != 0) {
                sb2.append(",");
                sb2.append(this.f99221c);
            }
            if (this.f99222d != Integer.MIN_VALUE) {
                if (this.f99221c == 0) {
                    sb2.append(",0,");
                    sb2.append(this.f99222d);
                } else {
                    sb2.append(",");
                    sb2.append(this.f99222d);
                }
            }
            sb2.append(C4235d4.j.f61462e);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: j0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0930b {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    static {
        HashMap map = new HashMap();
        f99216i = map;
        map.put(EnumC0930b.SPREAD, "'spread'");
        map.put(EnumC0930b.SPREAD_INSIDE, "'spread_inside'");
        map.put(EnumC0930b.PACKED, "'packed'");
    }

    public b(String str) {
        super(str, new h.a(""));
        this.f99217g = null;
        this.f99218h = new ArrayList<>();
    }

    public b g(s sVar) {
        this.f99218h.add(sVar);
        this.f99304d.put("contains", j());
        return this;
    }

    public b h(String str) {
        return g(s.g(str));
    }

    public EnumC0930b i() {
        return this.f99217g;
    }

    public String j() {
        if (this.f99218h.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(C4235d4.j.f61460d);
        Iterator<s> it = this.f99218h.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    public void k(EnumC0930b enumC0930b) {
        this.f99217g = enumC0930b;
        this.f99304d.put("style", f99216i.get(enumC0930b));
    }
}
