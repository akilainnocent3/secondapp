package j0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f99294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f99295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f99296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f99297m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends b.a {
        public a(c.e eVar) {
            super(c.f.valueOf(eVar.name()));
        }
    }

    public f(String str) {
        super(str);
        this.f99294j = new a(c.e.LEFT);
        this.f99295k = new a(c.e.RIGHT);
        this.f99296l = new a(c.e.START);
        this.f99297m = new a(c.e.END);
        this.f99302b = new h.a(h.f99300f.get(h.b.HORIZONTAL_CHAIN));
    }

    public void A(c.d dVar, int i10, int i11) {
        a aVar = this.f99296l;
        aVar.f99220b = dVar;
        aVar.f99221c = i10;
        aVar.f99222d = i11;
        this.f99304d.put("start", aVar.toString());
    }

    public a l() {
        return this.f99297m;
    }

    public a m() {
        return this.f99294j;
    }

    public a n() {
        return this.f99295k;
    }

    public a o() {
        return this.f99296l;
    }

    public void p(c.d dVar) {
        q(dVar, 0);
    }

    public void q(c.d dVar, int i10) {
        r(dVar, i10, Integer.MIN_VALUE);
    }

    public void r(c.d dVar, int i10, int i11) {
        a aVar = this.f99297m;
        aVar.f99220b = dVar;
        aVar.f99221c = i10;
        aVar.f99222d = i11;
        this.f99304d.put("end", aVar.toString());
    }

    public void s(c.d dVar) {
        t(dVar, 0);
    }

    public void t(c.d dVar, int i10) {
        u(dVar, i10, Integer.MIN_VALUE);
    }

    public void u(c.d dVar, int i10, int i11) {
        a aVar = this.f99294j;
        aVar.f99220b = dVar;
        aVar.f99221c = i10;
        aVar.f99222d = i11;
        this.f99304d.put("left", aVar.toString());
    }

    public void v(c.d dVar) {
        w(dVar, 0);
    }

    public void w(c.d dVar, int i10) {
        x(dVar, i10, Integer.MIN_VALUE);
    }

    public void x(c.d dVar, int i10, int i11) {
        a aVar = this.f99295k;
        aVar.f99220b = dVar;
        aVar.f99221c = i10;
        aVar.f99222d = i11;
        this.f99304d.put("right", aVar.toString());
    }

    public void y(c.d dVar) {
        z(dVar, 0);
    }

    public void z(c.d dVar, int i10) {
        A(dVar, i10, Integer.MIN_VALUE);
    }

    public f(String str, String str2) {
        super(str);
        this.f99294j = new a(c.e.LEFT);
        this.f99295k = new a(c.e.RIGHT);
        this.f99296l = new a(c.e.START);
        this.f99297m = new a(c.e.END);
        this.f99303c = str2;
        this.f99302b = new h.a(h.f99300f.get(h.b.HORIZONTAL_CHAIN));
        Map<String, String> mapB = b();
        this.f99304d = mapB;
        if (mapB.containsKey("contains")) {
            s.a(this.f99304d.get("contains"), this.f99218h);
        }
    }
}
