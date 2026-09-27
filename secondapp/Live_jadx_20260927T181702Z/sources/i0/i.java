package i0;

import com.ironsource.C4235d4;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {
    public static final int A = 5;
    public static final int B = 6;
    public static final int C = 7;
    public static final int D = 8;
    public static int E = 1;
    public static int F = 1;
    public static int G = 1;
    public static int H = 1;
    public static int I = 1;
    public static final int J = 9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f90240s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f90241t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f90242u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f90243v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f90244w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f90245x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f90246y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f90247z = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f90248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f90249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f90253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f90254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f90255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f90256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f90257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b[] f90258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f90259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f90260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f90261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f90262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f90263q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashSet<b> f90264r;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(String str, a aVar) {
        this.f90250d = -1;
        this.f90251e = -1;
        this.f90252f = 0;
        this.f90254h = false;
        this.f90255i = new float[9];
        this.f90256j = new float[9];
        this.f90258l = new b[16];
        this.f90259m = 0;
        this.f90260n = 0;
        this.f90261o = false;
        this.f90262p = -1;
        this.f90263q = 0.0f;
        this.f90264r = null;
        this.f90249c = str;
        this.f90257k = aVar;
    }

    public static String e(a aVar, String str) {
        if (str != null) {
            return str + F;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("U");
            int i10 = G + 1;
            G = i10;
            sb2.append(i10);
            return sb2.toString();
        }
        if (iOrdinal == 1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("C");
            int i11 = H + 1;
            H = i11;
            sb3.append(i11);
            return sb3.toString();
        }
        if (iOrdinal == 2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(l3.a.R4);
            int i12 = E + 1;
            E = i12;
            sb4.append(i12);
            return sb4.toString();
        }
        if (iOrdinal == 3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("e");
            int i13 = F + 1;
            F = i13;
            sb5.append(i13);
            return sb5.toString();
        }
        if (iOrdinal != 4) {
            throw new AssertionError(aVar.name());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(l3.a.X4);
        int i14 = I + 1;
        I = i14;
        sb6.append(i14);
        return sb6.toString();
    }

    public static void f() {
        F++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f90259m;
            if (i10 >= i11) {
                b[] bVarArr = this.f90258l;
                if (i11 >= bVarArr.length) {
                    this.f90258l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f90258l;
                int i12 = this.f90259m;
                bVarArr2[i12] = bVar;
                this.f90259m = i12 + 1;
                return;
            }
            if (this.f90258l[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public void b() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f90255i[i10] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f90250d - iVar.f90250d;
    }

    public String d() {
        return this.f90249c;
    }

    public final void g(b bVar) {
        int i10 = this.f90259m;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f90258l[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f90258l;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f90259m--;
                return;
            }
            i11++;
        }
    }

    public void h() {
        this.f90249c = null;
        this.f90257k = a.UNKNOWN;
        this.f90252f = 0;
        this.f90250d = -1;
        this.f90251e = -1;
        this.f90253g = 0.0f;
        this.f90254h = false;
        this.f90261o = false;
        this.f90262p = -1;
        this.f90263q = 0.0f;
        int i10 = this.f90259m;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f90258l[i11] = null;
        }
        this.f90259m = 0;
        this.f90260n = 0;
        this.f90248b = false;
        Arrays.fill(this.f90256j, 0.0f);
    }

    public void i(e eVar, float f10) {
        this.f90253g = f10;
        this.f90254h = true;
        this.f90261o = false;
        this.f90262p = -1;
        this.f90263q = 0.0f;
        int i10 = this.f90259m;
        this.f90251e = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f90258l[i11].f(eVar, this, false);
        }
        this.f90259m = 0;
    }

    public void j(String str) {
        this.f90249c = str;
    }

    public void k(e eVar, i iVar, float f10) {
        this.f90261o = true;
        this.f90262p = iVar.f90250d;
        this.f90263q = f10;
        int i10 = this.f90259m;
        this.f90251e = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f90258l[i11].G(eVar, this, false);
        }
        this.f90259m = 0;
        eVar.x();
    }

    public void l(a aVar, String str) {
        this.f90257k = aVar;
    }

    public String m() {
        String str = this + C4235d4.j.f61460d;
        boolean z10 = false;
        boolean z11 = true;
        for (int i10 = 0; i10 < this.f90255i.length; i10++) {
            String str2 = str + this.f90255i[i10];
            float[] fArr = this.f90255i;
            float f10 = fArr[i10];
            if (f10 > 0.0f) {
                z10 = false;
            } else if (f10 < 0.0f) {
                z10 = true;
            }
            if (f10 != 0.0f) {
                z11 = false;
            }
            str = i10 < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z10) {
            str = str + " (-)";
        }
        if (!z11) {
            return str;
        }
        return str + " (*)";
    }

    public final void n(e eVar, b bVar) {
        int i10 = this.f90259m;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f90258l[i11].e(eVar, bVar, false);
        }
        this.f90259m = 0;
    }

    public String toString() {
        if (this.f90249c != null) {
            return "" + this.f90249c;
        }
        return "" + this.f90250d;
    }

    public i(a aVar, String str) {
        this.f90250d = -1;
        this.f90251e = -1;
        this.f90252f = 0;
        this.f90254h = false;
        this.f90255i = new float[9];
        this.f90256j = new float[9];
        this.f90258l = new b[16];
        this.f90259m = 0;
        this.f90260n = 0;
        this.f90261o = false;
        this.f90262p = -1;
        this.f90263q = 0.0f;
        this.f90264r = null;
        this.f90257k = aVar;
    }
}
