package va;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class v implements c, wa.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<wa.a.b> f140628c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bb.t.a f140629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wa.a<?, Float> f140630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.a<?, Float> f140631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wa.a<?, Float> f140632g;

    public v(cb.b bVar, bb.t tVar) {
        this.f140626a = tVar.c();
        this.f140627b = tVar.g();
        this.f140629d = tVar.f();
        wa.d dVarF = tVar.e().f();
        this.f140630e = dVarF;
        wa.d dVarF2 = tVar.b().f();
        this.f140631f = dVarF2;
        wa.d dVarF3 = tVar.d().f();
        this.f140632g = dVarF3;
        bVar.j(dVarF);
        bVar.j(dVarF2);
        bVar.j(dVarF3);
        dVarF.a(this);
        dVarF2.a(this);
        dVarF3.a(this);
    }

    public void a(wa.a.b bVar) {
        this.f140628c.add(bVar);
    }

    public wa.a<?, Float> b() {
        return this.f140631f;
    }

    public wa.a<?, Float> d() {
        return this.f140632g;
    }

    @Override // wa.a.b
    public void e() {
        for (int i10 = 0; i10 < this.f140628c.size(); i10++) {
            this.f140628c.get(i10).e();
        }
    }

    @Override // va.c
    public String getName() {
        return this.f140626a;
    }

    public wa.a<?, Float> j() {
        return this.f140630e;
    }

    public bb.t.a k() {
        return this.f140629d;
    }

    public boolean l() {
        return this.f140627b;
    }

    @Override // va.c
    public void f(List<c> list, List<c> list2) {
    }
}
