package va;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.z0;
import gb.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d implements e, n, wa.a.b, za.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.b f140495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f140496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f140497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f140498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f140499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f140500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f140501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f140502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<c> f140503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z0 f140504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public List<n> f140505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public wa.s f140506l;

    public d(z0 z0Var, cb.b bVar, bb.q qVar, com.airbnb.lottie.k kVar) {
        this(z0Var, bVar, qVar.c(), qVar.d(), d(z0Var, kVar, bVar, qVar.b()), j(qVar.b()));
    }

    public static List<c> d(z0 z0Var, com.airbnb.lottie.k kVar, cb.b bVar, List<bb.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = list.get(i10).a(z0Var, kVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    @Nullable
    public static ab.n j(List<bb.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            bb.c cVar = list.get(i10);
            if (cVar instanceof ab.n) {
                return (ab.n) cVar;
            }
        }
        return null;
    }

    @Override // za.f
    public void a(za.e eVar, int i10, List<za.e> list, za.e eVar2) {
        if (eVar.h(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.j(this));
                }
            }
            if (eVar.i(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f140503i.size(); i11++) {
                    c cVar = this.f140503i.get(i11);
                    if (cVar instanceof za.f) {
                        ((za.f) cVar).a(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // za.f
    public <T> void b(T t10, @Nullable hb.j<T> jVar) {
        wa.s sVar = this.f140506l;
        if (sVar != null) {
            sVar.f(t10, jVar);
        }
    }

    @Override // va.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f140498d.set(matrix);
        wa.s sVar = this.f140506l;
        if (sVar != null) {
            this.f140498d.preConcat(sVar.i());
        }
        this.f140500f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f140503i.size() - 1; size >= 0; size--) {
            c cVar = this.f140503i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(this.f140500f, this.f140498d, z10);
                rectF.union(this.f140500f);
            }
        }
    }

    @Override // wa.a.b
    public void e() {
        this.f140504j.invalidateSelf();
    }

    @Override // va.c
    public void f(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f140503i.size());
        arrayList.addAll(list);
        for (int size = this.f140503i.size() - 1; size >= 0; size--) {
            c cVar = this.f140503i.get(size);
            cVar.f(arrayList, this.f140503i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // va.e
    public void g(Canvas canvas, Matrix matrix, int i10, @Nullable gb.d dVar) {
        if (this.f140502h) {
            return;
        }
        this.f140498d.set(matrix);
        wa.s sVar = this.f140506l;
        if (sVar != null) {
            this.f140498d.preConcat(sVar.i());
            i10 = (int) (((((this.f140506l.k() == null ? 100 : this.f140506l.k().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = (this.f140504j.u0() && n() && i10 != 255) || (dVar != null && this.f140504j.v0() && n());
        int i11 = z10 ? 255 : i10;
        if (z10) {
            this.f140496b.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(this.f140496b, matrix, true);
            x.b bVar = this.f140495a;
            bVar.f86418a = i10;
            if (dVar != null) {
                dVar.b(bVar);
                dVar = null;
            } else {
                bVar.f86421d = null;
            }
            canvas = this.f140497c.j(canvas, this.f140496b, this.f140495a);
        } else if (dVar != null) {
            gb.d dVar2 = new gb.d(dVar);
            dVar2.i(i11);
            dVar = dVar2;
        }
        for (int size = this.f140503i.size() - 1; size >= 0; size--) {
            c cVar = this.f140503i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).g(canvas, this.f140498d, i11, dVar);
            }
        }
        if (z10) {
            this.f140497c.e();
        }
    }

    @Override // va.c
    public String getName() {
        return this.f140501g;
    }

    @Override // va.n
    public Path getPath() {
        this.f140498d.reset();
        wa.s sVar = this.f140506l;
        if (sVar != null) {
            this.f140498d.set(sVar.i());
        }
        this.f140499e.reset();
        if (this.f140502h) {
            return this.f140499e;
        }
        for (int size = this.f140503i.size() - 1; size >= 0; size--) {
            c cVar = this.f140503i.get(size);
            if (cVar instanceof n) {
                this.f140499e.addPath(((n) cVar).getPath(), this.f140498d);
            }
        }
        return this.f140499e;
    }

    public List<c> k() {
        return this.f140503i;
    }

    public List<n> l() {
        if (this.f140505k == null) {
            this.f140505k = new ArrayList();
            for (int i10 = 0; i10 < this.f140503i.size(); i10++) {
                c cVar = this.f140503i.get(i10);
                if (cVar instanceof n) {
                    this.f140505k.add((n) cVar);
                }
            }
        }
        return this.f140505k;
    }

    public Matrix m() {
        wa.s sVar = this.f140506l;
        if (sVar != null) {
            return sVar.i();
        }
        this.f140498d.reset();
        return this.f140498d;
    }

    public final boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f140503i.size(); i11++) {
            if ((this.f140503i.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public d(z0 z0Var, cb.b bVar, String str, boolean z10, List<c> list, @Nullable ab.n nVar) {
        this.f140495a = new x.b();
        this.f140496b = new RectF();
        this.f140497c = new x();
        this.f140498d = new Matrix();
        this.f140499e = new Path();
        this.f140500f = new RectF();
        this.f140501g = str;
        this.f140504j = z0Var;
        this.f140502h = z10;
        this.f140503i = list;
        if (nVar != null) {
            wa.s sVarB = nVar.b();
            this.f140506l = sVarB;
            sVarB.d(bVar);
            this.f140506l.e(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).d(list.listIterator(list.size()));
        }
    }
}
