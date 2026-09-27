package j0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class u extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f99481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f99482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f99483l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends b.a {
        public a(c.h hVar) {
            super(c.f.valueOf(hVar.name()));
        }
    }

    public u(String str) {
        super(str);
        this.f99481j = new a(c.h.TOP);
        this.f99482k = new a(c.h.BOTTOM);
        this.f99483l = new a(c.h.BASELINE);
        this.f99302b = new h.a(h.f99300f.get(h.b.VERTICAL_CHAIN));
    }

    public a l() {
        return this.f99483l;
    }

    public a m() {
        return this.f99482k;
    }

    public a n() {
        return this.f99481j;
    }

    public void o(c.g gVar) {
        p(gVar, 0);
    }

    public void p(c.g gVar, int i10) {
        q(gVar, i10, Integer.MIN_VALUE);
    }

    public void q(c.g gVar, int i10, int i11) {
        a aVar = this.f99483l;
        aVar.f99220b = gVar;
        aVar.f99221c = i10;
        aVar.f99222d = i11;
        this.f99304d.put("baseline", aVar.toString());
    }

    public void r(c.g gVar) {
        s(gVar, 0);
    }

    public void s(c.g gVar, int i10) {
        t(gVar, i10, Integer.MIN_VALUE);
    }

    public void t(c.g gVar, int i10, int i11) {
        a aVar = this.f99482k;
        aVar.f99220b = gVar;
        aVar.f99221c = i10;
        aVar.f99222d = i11;
        this.f99304d.put("bottom", aVar.toString());
    }

    public void u(c.g gVar) {
        v(gVar, 0);
    }

    public void v(c.g gVar, int i10) {
        w(gVar, i10, Integer.MIN_VALUE);
    }

    public void w(c.g gVar, int i10, int i11) {
        a aVar = this.f99481j;
        aVar.f99220b = gVar;
        aVar.f99221c = i10;
        aVar.f99222d = i11;
        this.f99304d.put("top", aVar.toString());
    }

    public u(String str, String str2) {
        super(str);
        this.f99481j = new a(c.h.TOP);
        this.f99482k = new a(c.h.BOTTOM);
        this.f99483l = new a(c.h.BASELINE);
        this.f99303c = str2;
        this.f99302b = new h.a(h.f99300f.get(h.b.VERTICAL_CHAIN));
        Map<String, String> mapB = b();
        this.f99304d = mapB;
        if (mapB.containsKey("contains")) {
            s.a(this.f99304d.get("contains"), this.f99218h);
        }
    }
}
