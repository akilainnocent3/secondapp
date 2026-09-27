package j0;

import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f f99213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f99214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<s> f99215i;

    public a(String str) {
        super(str, new h.a(h.f99300f.get(h.b.BARRIER)));
        this.f99213g = null;
        this.f99214h = Integer.MIN_VALUE;
        this.f99215i = new ArrayList<>();
    }

    public a g(s sVar) {
        this.f99215i.add(sVar);
        this.f99304d.put("contains", k());
        return this;
    }

    public a h(String str) {
        return g(s.g(str));
    }

    public c.f i() {
        return this.f99213g;
    }

    public int j() {
        return this.f99214h;
    }

    public String k() {
        if (this.f99215i.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(C4235d4.j.f61460d);
        Iterator<s> it = this.f99215i.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    public void l(c.f fVar) {
        this.f99213g = fVar;
        this.f99304d.put("direction", h.f99299e.get(fVar));
    }

    public void m(int i10) {
        this.f99214h = i10;
        this.f99304d.put("margin", String.valueOf(i10));
    }

    public a(String str, String str2) {
        super(str, new h.a(h.f99300f.get(h.b.BARRIER)), str2);
        this.f99213g = null;
        this.f99214h = Integer.MIN_VALUE;
        this.f99215i = new ArrayList<>();
        Map<String, String> mapB = b();
        this.f99304d = mapB;
        if (mapB.containsKey("contains")) {
            s.a(this.f99304d.get("contains"), this.f99215i);
        }
    }
}
