package i0;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h extends i0.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f90227o = 1.0E-4f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f90228p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f90229q = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i[] f90231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i[] f90232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f90233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f90234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f90235n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f90250d - iVar2.f90250d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f90237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f90238b;

        public b(h hVar) {
            this.f90238b = hVar;
        }

        public void a(i iVar) {
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f90237a.f90256j;
                float f10 = fArr[i10] + iVar.f90256j[i10];
                fArr[i10] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.f90237a.f90256j[i10] = 0.0f;
                }
            }
        }

        public boolean b(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f90237a.f90248b) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f90256j[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f90237a.f90256j[i10] = f12;
                    } else {
                        this.f90237a.f90256j[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f90237a.f90256j;
                float f13 = fArr[i11] + (iVar.f90256j[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f90237a.f90256j[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.J(this.f90237a);
            }
            return false;
        }

        public void c(i iVar) {
            this.f90237a = iVar;
        }

        public final boolean d() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f90237a.f90256j[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i10 = 0; i10 < 9; i10++) {
                if (this.f90237a.f90256j[i10] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f90256j[i10];
                float f11 = this.f90237a.f90256j[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f90237a.f90256j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f90237a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f90237a.f90256j[i10] + " ";
                }
            }
            return str + "] " + this.f90237a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f90230i = 128;
        this.f90231j = new i[128];
        this.f90232k = new i[128];
        this.f90233l = 0;
        this.f90234m = new b(this);
        this.f90235n = cVar;
    }

    public final void I(i iVar) {
        int i10;
        int i11 = this.f90233l + 1;
        i[] iVarArr = this.f90231j;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f90231j = iVarArr2;
            this.f90232k = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f90231j;
        int i12 = this.f90233l;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f90233l = i13;
        if (i13 > 1 && iVarArr3[i12].f90250d > iVar.f90250d) {
            int i14 = 0;
            while (true) {
                i10 = this.f90233l;
                if (i14 >= i10) {
                    break;
                }
                this.f90232k[i14] = this.f90231j[i14];
                i14++;
            }
            Arrays.sort(this.f90232k, 0, i10, new a());
            for (int i15 = 0; i15 < this.f90233l; i15++) {
                this.f90231j[i15] = this.f90232k[i15];
            }
        }
        iVar.f90248b = true;
        iVar.a(this);
    }

    public final void J(i iVar) {
        int i10 = 0;
        while (i10 < this.f90233l) {
            if (this.f90231j[i10] == iVar) {
                while (true) {
                    int i11 = this.f90233l;
                    if (i10 >= i11 - 1) {
                        this.f90233l = i11 - 1;
                        iVar.f90248b = false;
                        return;
                    } else {
                        i[] iVarArr = this.f90231j;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // i0.b, i0.e.a
    public i c(e eVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f90233l; i11++) {
            i iVar = this.f90231j[i11];
            if (!zArr[iVar.f90250d]) {
                this.f90234m.c(iVar);
                if (i10 == -1) {
                    if (this.f90234m.d()) {
                        i10 = i11;
                    }
                } else if (this.f90234m.f(this.f90231j[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f90231j[i10];
    }

    @Override // i0.b, i0.e.a
    public void clear() {
        this.f90233l = 0;
        this.f90163b = 0.0f;
    }

    @Override // i0.b, i0.e.a
    public void d(i iVar) {
        this.f90234m.c(iVar);
        this.f90234m.g();
        iVar.f90256j[iVar.f90252f] = 1.0f;
        I(iVar);
    }

    @Override // i0.b, i0.e.a
    public void e(e eVar, i0.b bVar, boolean z10) {
        i iVar = bVar.f90162a;
        if (iVar == null) {
            return;
        }
        i0.b.a aVar = bVar.f90166e;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarF = aVar.f(i10);
            float fQ = aVar.q(i10);
            this.f90234m.c(iVarF);
            if (this.f90234m.b(iVar, fQ)) {
                I(iVarF);
            }
            this.f90163b += bVar.f90163b * fQ;
        }
        J(iVar);
    }

    @Override // i0.b, i0.e.a
    public boolean isEmpty() {
        return this.f90233l == 0;
    }

    @Override // i0.b
    public String toString() {
        String str = " goal -> (" + this.f90163b + ") : ";
        for (int i10 = 0; i10 < this.f90233l; i10++) {
            this.f90234m.c(this.f90231j[i10]);
            str = str + this.f90234m + " ";
        }
        return str;
    }
}
