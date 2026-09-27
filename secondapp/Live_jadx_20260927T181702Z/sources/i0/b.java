package i0;

import fk.n0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b implements e.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f90160g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f90161h = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f90166e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f90162a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f90163b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90164c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<i> f90165d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90167f = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void clear();

        int d();

        float e(i iVar, boolean z10);

        i f(int i10);

        float g(b bVar, boolean z10);

        boolean h(i iVar);

        void i(i iVar, float f10);

        int j(i iVar);

        void k(float f10);

        void l(i iVar, float f10, boolean z10);

        void m();

        float n(i iVar);

        int o();

        void p();

        float q(int i10);
    }

    public b() {
    }

    public i A(i iVar) {
        return B(null, iVar);
    }

    public final i B(boolean[] zArr, i iVar) {
        i.a aVar;
        int iD = this.f90166e.d();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float fQ = this.f90166e.q(i10);
            if (fQ < 0.0f) {
                i iVarF = this.f90166e.f(i10);
                if ((zArr == null || !zArr[iVarF.f90250d]) && iVarF != iVar && (((aVar = iVarF.f90257k) == i.a.SLACK || aVar == i.a.ERROR) && fQ < f10)) {
                    f10 = fQ;
                    iVar2 = iVarF;
                }
            }
        }
        return iVar2;
    }

    public void C(i iVar) {
        i iVar2 = this.f90162a;
        if (iVar2 != null) {
            this.f90166e.i(iVar2, -1.0f);
            this.f90162a.f90251e = -1;
            this.f90162a = null;
        }
        float fE = this.f90166e.e(iVar, true) * (-1.0f);
        this.f90162a = iVar;
        if (fE == 1.0f) {
            return;
        }
        this.f90163b /= fE;
        this.f90166e.k(fE);
    }

    public void D() {
        this.f90162a = null;
        this.f90166e.clear();
        this.f90163b = 0.0f;
        this.f90167f = false;
    }

    public int E() {
        return (this.f90162a != null ? 4 : 0) + 8 + this.f90166e.o();
    }

    public String F() {
        boolean z10;
        String str = (this.f90162a == null ? "0" : "" + this.f90162a) + " = ";
        if (this.f90163b != 0.0f) {
            str = str + this.f90163b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iD = this.f90166e.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarF = this.f90166e.f(i10);
            if (iVarF != null) {
                float fQ = this.f90166e.q(i10);
                if (fQ != 0.0f) {
                    String string = iVarF.toString();
                    if (z10) {
                        if (fQ > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fQ *= -1.0f;
                        }
                    } else if (fQ < 0.0f) {
                        str = str + "- ";
                        fQ *= -1.0f;
                    }
                    str = fQ == 1.0f ? str + string : str + fQ + " " + string;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + n0.f84864h;
    }

    public void G(e eVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f90261o) {
            return;
        }
        float fN = this.f90166e.n(iVar);
        this.f90163b += iVar.f90263q * fN;
        this.f90166e.e(iVar, z10);
        if (z10) {
            iVar.g(this);
        }
        this.f90166e.l(eVar.f90194o.f90171d[iVar.f90262p], fN, z10);
        if (e.f90178y && this.f90166e.d() == 0) {
            this.f90167f = true;
            eVar.f90181b = true;
        }
    }

    @Override // i0.e.a
    public void a(e eVar) {
        if (eVar.f90187h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iD = this.f90166e.d();
            for (int i10 = 0; i10 < iD; i10++) {
                i iVarF = this.f90166e.f(i10);
                if (iVarF.f90251e != -1 || iVarF.f90254h || iVarF.f90261o) {
                    this.f90165d.add(iVarF);
                }
            }
            int size = this.f90165d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f90165d.get(i11);
                    if (iVar.f90254h) {
                        f(eVar, iVar, true);
                    } else if (iVar.f90261o) {
                        G(eVar, iVar, true);
                    } else {
                        e(eVar, eVar.f90187h[iVar.f90251e], true);
                    }
                }
                this.f90165d.clear();
            } else {
                z10 = true;
            }
        }
        if (e.f90178y && this.f90162a != null && this.f90166e.d() == 0) {
            this.f90167f = true;
            eVar.f90181b = true;
        }
    }

    @Override // i0.e.a
    public void b(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f90162a = null;
            this.f90166e.clear();
            for (int i10 = 0; i10 < bVar.f90166e.d(); i10++) {
                this.f90166e.l(bVar.f90166e.f(i10), bVar.f90166e.q(i10), true);
            }
        }
    }

    @Override // i0.e.a
    public i c(e eVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // i0.e.a
    public void clear() {
        this.f90166e.clear();
        this.f90162a = null;
        this.f90163b = 0.0f;
    }

    @Override // i0.e.a
    public void d(i iVar) {
        int i10 = iVar.f90252f;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f90166e.i(iVar, f10);
    }

    @Override // i0.e.a
    public void e(e eVar, b bVar, boolean z10) {
        this.f90163b += bVar.f90163b * this.f90166e.g(bVar, z10);
        if (z10) {
            bVar.f90162a.g(this);
        }
        if (e.f90178y && this.f90162a != null && this.f90166e.d() == 0) {
            this.f90167f = true;
            eVar.f90181b = true;
        }
    }

    @Override // i0.e.a
    public void f(e eVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f90254h) {
            return;
        }
        this.f90163b += iVar.f90253g * this.f90166e.n(iVar);
        this.f90166e.e(iVar, z10);
        if (z10) {
            iVar.g(this);
        }
        if (e.f90178y && this.f90166e.d() == 0) {
            this.f90167f = true;
            eVar.f90181b = true;
        }
    }

    public b g(e eVar, int i10) {
        this.f90166e.i(eVar.q(i10, "ep"), 1.0f);
        this.f90166e.i(eVar.q(i10, "em"), -1.0f);
        return this;
    }

    @Override // i0.e.a
    public i getKey() {
        return this.f90162a;
    }

    public b h(i iVar, int i10) {
        this.f90166e.i(iVar, i10);
        return this;
    }

    public boolean i(e eVar) {
        boolean z10;
        i iVarJ = j(eVar);
        if (iVarJ == null) {
            z10 = true;
        } else {
            C(iVarJ);
            z10 = false;
        }
        if (this.f90166e.d() == 0) {
            this.f90167f = true;
        }
        return z10;
    }

    @Override // i0.e.a
    public boolean isEmpty() {
        return this.f90162a == null && this.f90163b == 0.0f && this.f90166e.d() == 0;
    }

    public i j(e eVar) {
        int iD = this.f90166e.d();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iD; i10++) {
            float fQ = this.f90166e.q(i10);
            i iVarF = this.f90166e.f(i10);
            if (iVarF.f90257k == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fQ) {
                    boolean z12 = z(iVarF, eVar);
                    z10 = z12;
                    f10 = fQ;
                    iVar = iVarF;
                } else if (!z10 && z(iVarF, eVar)) {
                    f10 = fQ;
                    iVar = iVarF;
                    z10 = true;
                }
            } else if (iVar == null && fQ < 0.0f) {
                if (iVar2 == null || f11 > fQ) {
                    boolean z13 = z(iVarF, eVar);
                    z11 = z13;
                    f11 = fQ;
                    iVar2 = iVarF;
                } else if (!z11 && z(iVarF, eVar)) {
                    f11 = fQ;
                    iVar2 = iVarF;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public b k(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar4, 1.0f);
            this.f90166e.i(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar2, -1.0f);
            this.f90166e.i(iVar3, -1.0f);
            this.f90166e.i(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f90163b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f90166e.i(iVar, -1.0f);
                this.f90166e.i(iVar2, 1.0f);
                this.f90163b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f90166e.i(iVar4, -1.0f);
                this.f90166e.i(iVar3, 1.0f);
                this.f90163b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f90166e.i(iVar, f11 * 1.0f);
            this.f90166e.i(iVar2, f11 * (-1.0f));
            this.f90166e.i(iVar3, (-1.0f) * f10);
            this.f90166e.i(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f90163b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    public b l(i iVar, int i10) {
        this.f90162a = iVar;
        float f10 = i10;
        iVar.f90253g = f10;
        this.f90163b = f10;
        this.f90167f = true;
        return this;
    }

    public b m(i iVar, i iVar2, float f10) {
        this.f90166e.i(iVar, -1.0f);
        this.f90166e.i(iVar2, f10);
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f90166e.i(iVar, -1.0f);
        this.f90166e.i(iVar2, 1.0f);
        this.f90166e.i(iVar3, f10);
        this.f90166e.i(iVar4, -f10);
        return this;
    }

    public b o(float f10, float f11, float f12, i iVar, int i10, i iVar2, int i11, i iVar3, int i12, i iVar4, int i13) {
        if (f11 == 0.0f || f10 == f12) {
            this.f90163b = ((-i10) - i11) + i12 + i13;
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar2, -1.0f);
            this.f90166e.i(iVar4, 1.0f);
            this.f90166e.i(iVar3, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f90163b = ((-i10) - i11) + (i12 * f13) + (i13 * f13);
        this.f90166e.i(iVar, 1.0f);
        this.f90166e.i(iVar2, -1.0f);
        this.f90166e.i(iVar4, f13);
        this.f90166e.i(iVar3, -f13);
        return this;
    }

    public b p(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f90163b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar2, -1.0f);
            this.f90166e.i(iVar4, 1.0f);
            this.f90166e.i(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f90166e.i(iVar3, 1.0f);
            this.f90166e.i(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f90166e.i(iVar, 1.0f);
        this.f90166e.i(iVar2, -1.0f);
        this.f90166e.i(iVar4, f13);
        this.f90166e.i(iVar3, -f13);
        return this;
    }

    public b q(i iVar, int i10) {
        if (i10 < 0) {
            this.f90163b = i10 * (-1);
            this.f90166e.i(iVar, 1.0f);
            return this;
        }
        this.f90163b = i10;
        this.f90166e.i(iVar, -1.0f);
        return this;
    }

    public b r(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f90163b = i10;
        }
        if (z10) {
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar2, -1.0f);
            return this;
        }
        this.f90166e.i(iVar, -1.0f);
        this.f90166e.i(iVar2, 1.0f);
        return this;
    }

    public b s(i iVar, int i10, i iVar2) {
        this.f90163b = i10;
        this.f90166e.i(iVar, -1.0f);
        return this;
    }

    public b t(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f90163b = i10;
        }
        if (z10) {
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar2, -1.0f);
            this.f90166e.i(iVar3, -1.0f);
            return this;
        }
        this.f90166e.i(iVar, -1.0f);
        this.f90166e.i(iVar2, 1.0f);
        this.f90166e.i(iVar3, 1.0f);
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f90163b = i10;
        }
        if (z10) {
            this.f90166e.i(iVar, 1.0f);
            this.f90166e.i(iVar2, -1.0f);
            this.f90166e.i(iVar3, 1.0f);
            return this;
        }
        this.f90166e.i(iVar, -1.0f);
        this.f90166e.i(iVar2, 1.0f);
        this.f90166e.i(iVar3, -1.0f);
        return this;
    }

    public b v(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f90166e.i(iVar3, 0.5f);
        this.f90166e.i(iVar4, 0.5f);
        this.f90166e.i(iVar, -0.5f);
        this.f90166e.i(iVar2, -0.5f);
        this.f90163b = -f10;
        return this;
    }

    public void w() {
        float f10 = this.f90163b;
        if (f10 < 0.0f) {
            this.f90163b = f10 * (-1.0f);
            this.f90166e.m();
        }
    }

    public boolean x() {
        i iVar = this.f90162a;
        if (iVar != null) {
            return iVar.f90257k == i.a.UNRESTRICTED || this.f90163b >= 0.0f;
        }
        return false;
    }

    public boolean y(i iVar) {
        return this.f90166e.h(iVar);
    }

    public final boolean z(i iVar, e eVar) {
        return iVar.f90260n <= 1;
    }

    public b(c cVar) {
        this.f90166e = new i0.a(this, cVar);
    }
}
