package yads;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ft1 implements da, e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f149235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi3 f149236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vd3 f149237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt1 f149238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final et1 f149239e = new et1(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vf2 f149240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ea f149241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d3 f149242h;

    public ft1(Context context, l81 l81Var, i3 i3Var, f81 f81Var, w81 w81Var, a91 a91Var, gi3 gi3Var, vd3 vd3Var, wf2 wf2Var) {
        this.f149235a = i3Var;
        this.f149236b = gi3Var;
        this.f149237c = vd3Var;
        this.f149238d = new dt1(context, i3Var, f81Var, w81Var, a91Var, vd3Var);
        this.f149240f = wf2Var.a(l81Var, this);
    }

    @Override // yads.e3
    public final void a() {
    }

    @Override // yads.da
    public final void c() {
        this.f149240f.a();
        d3 d3Var = this.f149242h;
        if (d3Var != null) {
            d3Var.a();
        }
    }

    @Override // yads.e3
    public final void d() {
        this.f149236b.a();
    }

    @Override // yads.e3
    public final void e() {
        this.f149242h = null;
        this.f149236b.c();
    }

    @Override // yads.da
    public final void f() {
        this.f149240f.a();
        d3 d3Var = this.f149242h;
        if (d3Var != null) {
            d3Var.b();
        }
    }

    @Override // yads.e3
    public final void g() {
        this.f149242h = null;
        this.f149236b.c();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final void h() {
        d3 d3Var = this.f149242h;
        if (d3Var != null) {
            d3Var.f148031f = null;
        }
        if (d3Var != null) {
            int iOrdinal = d3Var.f148028c.a(d3Var.f148026a).ordinal();
            if (iOrdinal == 1 || iOrdinal == 2) {
                i3 i3Var = d3Var.f148028c;
                i3Var.f150411a.put(d3Var.f148026a, h3.f149879b);
                d3Var.f148029d.d();
                d3Var.f148029d.b();
            } else if (iOrdinal == 5) {
                i3 i3Var2 = d3Var.f148028c;
                i3Var2.f150411a.put(d3Var.f148026a, h3.f149879b);
                d3Var.f148029d.b();
            } else if (iOrdinal == 6 || iOrdinal == 7) {
                i3 i3Var3 = d3Var.f148028c;
                i3Var3.f150411a.put(d3Var.f148026a, h3.f149879b);
                d3Var.f148029d.d();
                d3Var.f148029d.b();
            }
            d3Var.f148032g = false;
            d3Var.f148027b.a();
        }
    }

    @Override // yads.da
    public final void prepare() {
        ea eaVar = this.f149241g;
        if (eaVar != null) {
            eaVar.b();
        }
    }

    @Override // yads.da
    public final void resume() {
        dr.w2 w2Var;
        d3 d3Var = this.f149242h;
        if (d3Var != null) {
            i3 i3Var = this.f149235a;
            i3Var.getClass();
            List listQ = fr.h0.Q(h3.f149886i, h3.f149885h);
            Collection collectionValues = i3Var.f150411a.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.f149236b.c();
                        d3Var.c();
                        break;
                    } else if (listQ.contains((h3) it.next())) {
                        this.f149236b.a();
                        d3Var.d();
                        break;
                    }
                }
            } else {
                this.f149236b.c();
                d3Var.c();
                break;
            }
            w2Var = dr.w2.f79517a;
        } else {
            w2Var = null;
        }
        if (w2Var == null) {
            this.f149236b.c();
        }
    }

    @Override // yads.da
    public final void start() {
        gi3 gi3Var = this.f149236b;
        gi3Var.f149631d = this.f149239e;
        gi3Var.c();
    }

    public final d3 a(o00 o00Var) {
        dt1 dt1Var = this.f149238d;
        LinkedHashMap linkedHashMap = dt1Var.f148354g;
        Object obj = linkedHashMap.get(o00Var);
        if (obj == null) {
            d3 d3Var = new d3(dt1Var.f148348a.getApplicationContext(), o00Var, dt1Var.f148350c, dt1Var.f148351d, dt1Var.f148352e, dt1Var.f148349b);
            d3Var.f148029d.f157667f.f156922a = dt1Var.f148353f;
            linkedHashMap.put(o00Var, d3Var);
            obj = d3Var;
        }
        d3 d3Var2 = (d3) obj;
        if (!kotlin.jvm.internal.m0.g(d3Var2, this.f149242h)) {
            h();
        }
        return d3Var2;
    }

    @Override // yads.da
    public final void a(za1 za1Var) {
        this.f149237c.f156922a = za1Var;
    }

    @Override // yads.da
    public final void a(ea eaVar) {
        this.f149241g = eaVar;
    }

    @Override // yads.e3
    public final void b() {
    }
}
