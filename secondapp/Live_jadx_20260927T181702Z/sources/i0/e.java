package i0;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static boolean A = true;
    public static boolean B = false;
    public static f C = null;
    public static long D = 0;
    public static long E = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f90172s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f90173t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f90174u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f90175v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f90176w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f90177x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f90178y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f90179z = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f90184e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f90194o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f90197r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90180a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f90181b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90182c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, i> f90183d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90185f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90186g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f90188i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f90189j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f90190k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f90191l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f90192m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f90193n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i[] f90195p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f90196q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0.b[] f90187h = new i0.b[32];

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(e eVar);

        void b(a aVar);

        i c(e eVar, boolean[] zArr);

        void clear();

        void d(i iVar);

        void e(e eVar, i0.b bVar, boolean z10);

        void f(e eVar, i iVar, boolean z10);

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends i0.b {
        public b(c cVar) {
            this.f90166e = new j(this, cVar);
        }
    }

    public e() {
        U();
        c cVar = new c();
        this.f90194o = cVar;
        this.f90184e = new h(cVar);
        if (B) {
            this.f90197r = new b(cVar);
        } else {
            this.f90197r = new i0.b(cVar);
        }
    }

    public static f J() {
        return C;
    }

    public static i0.b u(e eVar, i iVar, i iVar2, float f10) {
        return eVar.t().m(iVar, iVar2, f10);
    }

    public void A() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f90185f; i10++) {
            i0.b bVar = this.f90187h[i10];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        int iE2 = 0;
        for (int i11 = 0; i11 < this.f90192m; i11++) {
            i0.b bVar2 = this.f90187h[i11];
            if (bVar2 != null) {
                iE2 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Linear System -> Table size: ");
        sb2.append(this.f90185f);
        sb2.append(" (");
        int i12 = this.f90185f;
        sb2.append(F(i12 * i12));
        sb2.append(") -- row sizes: ");
        sb2.append(F(iE));
        sb2.append(", actual size: ");
        sb2.append(F(iE2));
        sb2.append(" rows: ");
        sb2.append(this.f90192m);
        sb2.append(to.c.userBaseDel);
        sb2.append(this.f90193n);
        sb2.append(" cols: ");
        sb2.append(this.f90191l);
        sb2.append(to.c.userBaseDel);
        sb2.append(this.f90186g);
        sb2.append(" ");
        sb2.append(0);
        sb2.append(" occupied cells, ");
        sb2.append(F(0));
        printStream.println(sb2.toString());
    }

    public void B() {
        z();
        String str = "";
        for (int i10 = 0; i10 < this.f90192m; i10++) {
            if (this.f90187h[i10].f90162a.f90257k == i.a.UNRESTRICTED) {
                str = (str + this.f90187h[i10].F()) + IOUtils.LINE_SEPARATOR_UNIX;
            }
        }
        System.out.println(str + this.f90184e + IOUtils.LINE_SEPARATOR_UNIX);
    }

    public final int C(a aVar) throws Exception {
        float f10;
        long j10;
        for (int i10 = 0; i10 < this.f90192m; i10++) {
            i0.b bVar = this.f90187h[i10];
            if (bVar.f90162a.f90257k != i.a.UNRESTRICTED) {
                float f11 = 0.0f;
                if (bVar.f90163b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        f fVar = C;
                        long j11 = 1;
                        if (fVar != null) {
                            fVar.f90212o++;
                        }
                        i11++;
                        float f12 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f90192m) {
                                break;
                            }
                            i0.b bVar2 = this.f90187h[i12];
                            if (bVar2.f90162a.f90257k == i.a.UNRESTRICTED || bVar2.f90167f || bVar2.f90163b >= f11) {
                                f10 = f11;
                                j10 = j11;
                            } else if (A) {
                                int iD = bVar2.f90166e.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    float f13 = f11;
                                    i iVarF = bVar2.f90166e.f(i16);
                                    long j12 = j11;
                                    float fN = bVar2.f90166e.n(iVarF);
                                    if (fN > f13) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f14 = iVarF.f90255i[i17] / fN;
                                            if ((f14 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarF.f90250d;
                                                i13 = i12;
                                                f12 = f14;
                                            }
                                        }
                                    }
                                    i16++;
                                    f11 = f13;
                                    j11 = j12;
                                }
                                f10 = f11;
                                j10 = j11;
                            } else {
                                f10 = f11;
                                j10 = j11;
                                for (int i18 = 1; i18 < this.f90191l; i18++) {
                                    i iVar = this.f90194o.f90171d[i18];
                                    float fN2 = bVar2.f90166e.n(iVar);
                                    if (fN2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f15 = iVar.f90255i[i19] / fN2;
                                            if ((f15 < f12 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                f12 = f15;
                                                i13 = i12;
                                                i14 = i18;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f11 = f10;
                            j11 = j10;
                        }
                        float f16 = f11;
                        long j13 = j11;
                        if (i13 != -1) {
                            i0.b bVar3 = this.f90187h[i13];
                            bVar3.f90162a.f90251e = -1;
                            f fVar2 = C;
                            if (fVar2 != null) {
                                fVar2.f90211n += j13;
                            }
                            bVar3.C(this.f90194o.f90171d[i14]);
                            i iVar2 = bVar3.f90162a;
                            iVar2.f90251e = i13;
                            iVar2.n(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f90191l / 2) {
                            z10 = true;
                        }
                        f11 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public void D(f fVar) {
        C = fVar;
    }

    public c E() {
        return this.f90194o;
    }

    public final String F(int i10) {
        int i11 = i10 * 4;
        int i12 = i11 / 1024;
        int i13 = i12 / 1024;
        if (i13 > 0) {
            return "" + i13 + " Mb";
        }
        if (i12 > 0) {
            return "" + i12 + " Kb";
        }
        return "" + i11 + " bytes";
    }

    public final String G(int i10) {
        if (i10 == 1) {
            return "LOW";
        }
        if (i10 == 2) {
            return "MEDIUM";
        }
        if (i10 == 3) {
            return "HIGH";
        }
        if (i10 == 4) {
            return "HIGHEST";
        }
        if (i10 == 5) {
            return "EQUALITY";
        }
        if (i10 == 8) {
            return "FIXED";
        }
        return i10 == 6 ? "BARRIER" : "NONE";
    }

    public a H() {
        return this.f90184e;
    }

    public int I() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f90192m; i10++) {
            i0.b bVar = this.f90187h[i10];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        return iE;
    }

    public int K() {
        return this.f90192m;
    }

    public int L() {
        return this.f90182c;
    }

    public int M(Object obj) {
        i iVarJ = ((s0.d) obj).j();
        if (iVarJ != null) {
            return (int) (iVarJ.f90253g + 0.5f);
        }
        return 0;
    }

    public i0.b N(int i10) {
        return this.f90187h[i10];
    }

    public float O(String str) {
        i iVarP = P(str, i.a.UNRESTRICTED);
        if (iVarP == null) {
            return 0.0f;
        }
        return iVarP.f90253g;
    }

    public i P(String str, i.a aVar) {
        if (this.f90183d == null) {
            this.f90183d = new HashMap<>();
        }
        i iVar = this.f90183d.get(str);
        return iVar == null ? w(str, aVar) : iVar;
    }

    public final void Q() {
        int i10 = this.f90185f * 2;
        this.f90185f = i10;
        this.f90187h = (i0.b[]) Arrays.copyOf(this.f90187h, i10);
        c cVar = this.f90194o;
        cVar.f90171d = (i[]) Arrays.copyOf(cVar.f90171d, this.f90185f);
        int i11 = this.f90185f;
        this.f90190k = new boolean[i11];
        this.f90186g = i11;
        this.f90193n = i11;
        f fVar = C;
        if (fVar != null) {
            fVar.f90205h++;
            fVar.f90217t = Math.max(fVar.f90217t, i11);
            f fVar2 = C;
            fVar2.E = fVar2.f90217t;
        }
    }

    public void R() throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f90206i++;
        }
        if (this.f90184e.isEmpty()) {
            p();
            return;
        }
        if (!this.f90188i && !this.f90189j) {
            S(this.f90184e);
            return;
        }
        f fVar2 = C;
        if (fVar2 != null) {
            fVar2.f90219v++;
        }
        for (int i10 = 0; i10 < this.f90192m; i10++) {
            if (!this.f90187h[i10].f90167f) {
                S(this.f90184e);
                return;
            }
        }
        f fVar3 = C;
        if (fVar3 != null) {
            fVar3.f90218u++;
        }
        p();
    }

    public void S(a aVar) throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f90223z++;
            fVar.A = Math.max(fVar.A, this.f90191l);
            f fVar2 = C;
            fVar2.B = Math.max(fVar2.B, this.f90192m);
        }
        C(aVar);
        T(aVar, false);
        p();
    }

    public final int T(a aVar, boolean z10) {
        f fVar = C;
        if (fVar != null) {
            fVar.f90209l++;
        }
        for (int i10 = 0; i10 < this.f90191l; i10++) {
            this.f90190k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f90210m++;
            }
            i11++;
            if (i11 < this.f90191l * 2) {
                if (aVar.getKey() != null) {
                    this.f90190k[aVar.getKey().f90250d] = true;
                }
                i iVarC = aVar.c(this, this.f90190k);
                if (iVarC != null) {
                    boolean[] zArr = this.f90190k;
                    int i12 = iVarC.f90250d;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarC != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f90192m; i14++) {
                        i0.b bVar = this.f90187h[i14];
                        if (bVar.f90162a.f90257k != i.a.UNRESTRICTED && !bVar.f90167f && bVar.y(iVarC)) {
                            float fN = bVar.f90166e.n(iVarC);
                            if (fN < 0.0f) {
                                float f11 = (-bVar.f90163b) / fN;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        i0.b bVar2 = this.f90187h[i13];
                        bVar2.f90162a.f90251e = -1;
                        f fVar3 = C;
                        if (fVar3 != null) {
                            fVar3.f90211n++;
                        }
                        bVar2.C(iVarC);
                        i iVar = bVar2.f90162a;
                        iVar.f90251e = i13;
                        iVar.n(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    public final void U() {
        int i10 = 0;
        if (B) {
            while (i10 < this.f90192m) {
                i0.b bVar = this.f90187h[i10];
                if (bVar != null) {
                    this.f90194o.f90168a.b(bVar);
                }
                this.f90187h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f90192m) {
            i0.b bVar2 = this.f90187h[i10];
            if (bVar2 != null) {
                this.f90194o.f90169b.b(bVar2);
            }
            this.f90187h[i10] = null;
            i10++;
        }
    }

    public void V(i0.b bVar) {
        i iVar;
        int i10;
        if (!bVar.f90167f || (iVar = bVar.f90162a) == null) {
            return;
        }
        int i11 = iVar.f90251e;
        if (i11 != -1) {
            while (true) {
                i10 = this.f90192m;
                if (i11 >= i10 - 1) {
                    break;
                }
                i0.b[] bVarArr = this.f90187h;
                int i12 = i11 + 1;
                i0.b bVar2 = bVarArr[i12];
                i iVar2 = bVar2.f90162a;
                if (iVar2.f90251e == i12) {
                    iVar2.f90251e = i11;
                }
                bVarArr[i11] = bVar2;
                i11 = i12;
            }
            this.f90192m = i10 - 1;
        }
        i iVar3 = bVar.f90162a;
        if (!iVar3.f90254h) {
            iVar3.i(this, bVar.f90163b);
        }
        if (B) {
            this.f90194o.f90168a.b(bVar);
        } else {
            this.f90194o.f90169b.b(bVar);
        }
    }

    public void W() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f90194o;
            i[] iVarArr = cVar.f90171d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.h();
            }
            i10++;
        }
        cVar.f90170c.c(this.f90195p, this.f90196q);
        this.f90196q = 0;
        Arrays.fill(this.f90194o.f90171d, (Object) null);
        HashMap<String, i> map = this.f90183d;
        if (map != null) {
            map.clear();
        }
        this.f90182c = 0;
        this.f90184e.clear();
        this.f90191l = 1;
        for (int i11 = 0; i11 < this.f90192m; i11++) {
            i0.b bVar = this.f90187h[i11];
            if (bVar != null) {
                bVar.f90164c = false;
            }
        }
        U();
        this.f90192m = 0;
        if (B) {
            this.f90197r = new b(this.f90194o);
        } else {
            this.f90197r = new i0.b(this.f90194o);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVarA = this.f90194o.f90170c.a();
        if (iVarA == null) {
            iVarA = new i(aVar, str);
            iVarA.l(aVar, str);
        } else {
            iVarA.h();
            iVarA.l(aVar, str);
        }
        int i10 = this.f90196q;
        int i11 = this.f90180a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f90180a = i12;
            this.f90195p = (i[]) Arrays.copyOf(this.f90195p, i12);
        }
        i[] iVarArr = this.f90195p;
        int i13 = this.f90196q;
        this.f90196q = i13 + 1;
        iVarArr[i13] = iVarA;
        return iVarA;
    }

    public void b(s0.e eVar, s0.e eVar2, float f10, int i10) {
        s0.d.a aVar = s0.d.a.LEFT;
        i iVarS = s(eVar.r(aVar));
        s0.d.a aVar2 = s0.d.a.TOP;
        i iVarS2 = s(eVar.r(aVar2));
        s0.d.a aVar3 = s0.d.a.RIGHT;
        i iVarS3 = s(eVar.r(aVar3));
        s0.d.a aVar4 = s0.d.a.BOTTOM;
        i iVarS4 = s(eVar.r(aVar4));
        i iVarS5 = s(eVar2.r(aVar));
        i iVarS6 = s(eVar2.r(aVar2));
        i iVarS7 = s(eVar2.r(aVar3));
        i iVarS8 = s(eVar2.r(aVar4));
        i0.b bVarT = t();
        double d10 = f10;
        double d11 = i10;
        bVarT.v(iVarS2, iVarS4, iVarS6, iVarS8, (float) (Math.sin(d10) * d11));
        d(bVarT);
        i0.b bVarT2 = t();
        bVarT2.v(iVarS, iVarS3, iVarS5, iVarS7, (float) (Math.cos(d10) * d11));
        d(bVarT2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        i0.b bVarT = t();
        bVarT.k(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarT.g(this, i12);
        }
        d(bVarT);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    public void d(i0.b bVar) {
        i iVarA;
        if (bVar == null) {
            return;
        }
        f fVar = C;
        if (fVar != null) {
            fVar.f90207j++;
            if (bVar.f90167f) {
                fVar.f90208k++;
            }
        }
        boolean z10 = true;
        if (this.f90192m + 1 >= this.f90193n || this.f90191l + 1 >= this.f90186g) {
            Q();
        }
        boolean z11 = false;
        if (!bVar.f90167f) {
            bVar.a(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.w();
            if (bVar.i(this)) {
                i iVarR = r();
                bVar.f90162a = iVarR;
                int i10 = this.f90192m;
                l(bVar);
                if (this.f90192m == i10 + 1) {
                    this.f90197r.b(bVar);
                    T(this.f90197r, true);
                    if (iVarR.f90251e == -1) {
                        if (bVar.f90162a == iVarR && (iVarA = bVar.A(iVarR)) != null) {
                            f fVar2 = C;
                            if (fVar2 != null) {
                                fVar2.f90211n++;
                            }
                            bVar.C(iVarA);
                        }
                        if (!bVar.f90167f) {
                            bVar.f90162a.n(this, bVar);
                        }
                        if (B) {
                            this.f90194o.f90168a.b(bVar);
                        } else {
                            this.f90194o.f90169b.b(bVar);
                        }
                        this.f90192m--;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!bVar.x()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public i0.b e(i iVar, i iVar2, int i10, int i11) {
        f fVar = C;
        if (fVar != null) {
            fVar.U++;
        }
        if (f90177x && i11 == 8 && iVar2.f90254h && iVar.f90251e == -1) {
            iVar.i(this, iVar2.f90253g + i10);
            return null;
        }
        i0.b bVarT = t();
        bVarT.r(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarT.g(this, i11);
        }
        d(bVarT);
        return bVarT;
    }

    public void f(i iVar, int i10) {
        f fVar = C;
        if (fVar != null) {
            fVar.U++;
        }
        if (f90177x && iVar.f90251e == -1) {
            float f10 = i10;
            iVar.i(this, f10);
            for (int i11 = 0; i11 < this.f90182c + 1; i11++) {
                i iVar2 = this.f90194o.f90171d[i11];
                if (iVar2 != null && iVar2.f90261o && iVar2.f90262p == iVar.f90250d) {
                    iVar2.i(this, iVar2.f90263q + f10);
                }
            }
            return;
        }
        int i12 = iVar.f90251e;
        if (i12 == -1) {
            i0.b bVarT = t();
            bVarT.l(iVar, i10);
            d(bVarT);
            return;
        }
        i0.b bVar = this.f90187h[i12];
        if (bVar.f90167f) {
            bVar.f90163b = i10;
            return;
        }
        if (bVar.f90166e.d() == 0) {
            bVar.f90167f = true;
            bVar.f90163b = i10;
        } else {
            i0.b bVarT2 = t();
            bVarT2.q(iVar, i10);
            d(bVarT2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        i0.b bVarT = t();
        i iVarV = v();
        iVarV.f90252f = 0;
        bVarT.t(iVar, iVar2, iVarV, i10);
        d(bVarT);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        i0.b bVarT = t();
        i iVarV = v();
        iVarV.f90252f = 0;
        bVarT.t(iVar, iVar2, iVarV, i10);
        if (i11 != 8) {
            m(bVarT, (int) (bVarT.f90166e.n(iVarV) * (-1.0f)), i11);
        }
        d(bVarT);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        i0.b bVarT = t();
        i iVarV = v();
        iVarV.f90252f = 0;
        bVarT.u(iVar, iVar2, iVarV, i10);
        d(bVarT);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        i0.b bVarT = t();
        i iVarV = v();
        iVarV.f90252f = 0;
        bVarT.u(iVar, iVar2, iVarV, i10);
        if (i11 != 8) {
            m(bVarT, (int) (bVarT.f90166e.n(iVarV) * (-1.0f)), i11);
        }
        d(bVarT);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        i0.b bVarT = t();
        bVarT.n(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarT.g(this, i10);
        }
        d(bVarT);
    }

    public final void l(i0.b bVar) {
        int i10;
        if (f90178y && bVar.f90167f) {
            bVar.f90162a.i(this, bVar.f90163b);
        } else {
            i0.b[] bVarArr = this.f90187h;
            int i11 = this.f90192m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f90162a;
            iVar.f90251e = i11;
            this.f90192m = i11 + 1;
            iVar.n(this, bVar);
        }
        if (f90178y && this.f90181b) {
            int i12 = 0;
            while (i12 < this.f90192m) {
                if (this.f90187h[i12] == null) {
                    System.out.println("WTF");
                }
                i0.b bVar2 = this.f90187h[i12];
                if (bVar2 != null && bVar2.f90167f) {
                    bVar2.f90162a.i(this, bVar2.f90163b);
                    if (B) {
                        this.f90194o.f90168a.b(bVar2);
                    } else {
                        this.f90194o.f90169b.b(bVar2);
                    }
                    this.f90187h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f90192m;
                        if (i13 >= i10) {
                            break;
                        }
                        i0.b[] bVarArr2 = this.f90187h;
                        int i15 = i13 - 1;
                        i0.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f90162a;
                        if (iVar2.f90251e == i13) {
                            iVar2.f90251e = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f90187h[i14] = null;
                    }
                    this.f90192m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f90181b = false;
        }
    }

    public void m(i0.b bVar, int i10, int i11) {
        bVar.h(q(i11, null), i10);
    }

    public void n(i iVar, i iVar2, int i10) {
        if (iVar.f90251e != -1 || i10 != 0) {
            e(iVar, iVar2, i10, 8);
            return;
        }
        if (iVar2.f90261o) {
            iVar2 = this.f90194o.f90171d[iVar2.f90262p];
        }
        if (iVar.f90261o) {
            i iVar3 = this.f90194o.f90171d[iVar.f90262p];
        } else {
            iVar.k(this, iVar2, 0.0f);
        }
    }

    public final void o() {
        int i10;
        int i11 = 0;
        while (i11 < this.f90192m) {
            i0.b bVar = this.f90187h[i11];
            if (bVar.f90166e.d() == 0) {
                bVar.f90167f = true;
            }
            if (bVar.f90167f) {
                i iVar = bVar.f90162a;
                iVar.f90253g = bVar.f90163b;
                iVar.g(bVar);
                int i12 = i11;
                while (true) {
                    i10 = this.f90192m;
                    if (i12 >= i10 - 1) {
                        break;
                    }
                    i0.b[] bVarArr = this.f90187h;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f90187h[i10 - 1] = null;
                this.f90192m = i10 - 1;
                i11--;
                if (B) {
                    this.f90194o.f90168a.b(bVar);
                } else {
                    this.f90194o.f90169b.b(bVar);
                }
            }
            i11++;
        }
    }

    public final void p() {
        for (int i10 = 0; i10 < this.f90192m; i10++) {
            i0.b bVar = this.f90187h[i10];
            bVar.f90162a.f90253g = bVar.f90163b;
        }
    }

    public i q(int i10, String str) {
        f fVar = C;
        if (fVar != null) {
            fVar.f90214q++;
        }
        if (this.f90191l + 1 >= this.f90186g) {
            Q();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f90182c + 1;
        this.f90182c = i11;
        this.f90191l++;
        iVarA.f90250d = i11;
        iVarA.f90252f = i10;
        this.f90194o.f90171d[i11] = iVarA;
        this.f90184e.d(iVarA);
        return iVarA;
    }

    public i r() {
        f fVar = C;
        if (fVar != null) {
            fVar.f90216s++;
        }
        if (this.f90191l + 1 >= this.f90186g) {
            Q();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f90182c + 1;
        this.f90182c = i10;
        this.f90191l++;
        iVarA.f90250d = i10;
        this.f90194o.f90171d[i10] = iVarA;
        return iVarA;
    }

    public i s(Object obj) {
        i iVarJ = null;
        if (obj == null) {
            return null;
        }
        if (this.f90191l + 1 >= this.f90186g) {
            Q();
        }
        if (obj instanceof s0.d) {
            s0.d dVar = (s0.d) obj;
            iVarJ = dVar.j();
            if (iVarJ == null) {
                dVar.z(this.f90194o);
                iVarJ = dVar.j();
            }
            int i10 = iVarJ.f90250d;
            if (i10 != -1 && i10 <= this.f90182c && this.f90194o.f90171d[i10] != null) {
                return iVarJ;
            }
            if (i10 != -1) {
                iVarJ.h();
            }
            int i11 = this.f90182c + 1;
            this.f90182c = i11;
            this.f90191l++;
            iVarJ.f90250d = i11;
            iVarJ.f90257k = i.a.UNRESTRICTED;
            this.f90194o.f90171d[i11] = iVarJ;
        }
        return iVarJ;
    }

    public i0.b t() {
        i0.b bVarA;
        if (B) {
            bVarA = this.f90194o.f90168a.a();
            if (bVarA == null) {
                bVarA = new b(this.f90194o);
                E++;
            } else {
                bVarA.D();
            }
        } else {
            bVarA = this.f90194o.f90169b.a();
            if (bVarA == null) {
                bVarA = new i0.b(this.f90194o);
                D++;
            } else {
                bVarA.D();
            }
        }
        i.f();
        return bVarA;
    }

    public i v() {
        f fVar = C;
        if (fVar != null) {
            fVar.f90215r++;
        }
        if (this.f90191l + 1 >= this.f90186g) {
            Q();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f90182c + 1;
        this.f90182c = i10;
        this.f90191l++;
        iVarA.f90250d = i10;
        this.f90194o.f90171d[i10] = iVarA;
        return iVarA;
    }

    public final i w(String str, i.a aVar) {
        f fVar = C;
        if (fVar != null) {
            fVar.f90213p++;
        }
        if (this.f90191l + 1 >= this.f90186g) {
            Q();
        }
        i iVarA = a(aVar, null);
        iVarA.j(str);
        int i10 = this.f90182c + 1;
        this.f90182c = i10;
        this.f90191l++;
        iVarA.f90250d = i10;
        if (this.f90183d == null) {
            this.f90183d = new HashMap<>();
        }
        this.f90183d.put(str, iVarA);
        this.f90194o.f90171d[this.f90182c] = iVarA;
        return iVarA;
    }

    public void x() {
        z();
        String str = " num vars " + this.f90182c + IOUtils.LINE_SEPARATOR_UNIX;
        for (int i10 = 0; i10 < this.f90182c + 1; i10++) {
            i iVar = this.f90194o.f90171d[i10];
            if (iVar != null && iVar.f90254h) {
                str = str + " $[" + i10 + "] => " + iVar + " = " + iVar.f90253g + IOUtils.LINE_SEPARATOR_UNIX;
            }
        }
        String str2 = str + IOUtils.LINE_SEPARATOR_UNIX;
        for (int i11 = 0; i11 < this.f90182c + 1; i11++) {
            i[] iVarArr = this.f90194o.f90171d;
            i iVar2 = iVarArr[i11];
            if (iVar2 != null && iVar2.f90261o) {
                str2 = str2 + " ~[" + i11 + "] => " + iVar2 + " = " + iVarArr[iVar2.f90262p] + " + " + iVar2.f90263q + IOUtils.LINE_SEPARATOR_UNIX;
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i12 = 0; i12 < this.f90192m; i12++) {
            str3 = (str3 + this.f90187h[i12].F()) + "\n #  ";
        }
        if (this.f90184e != null) {
            str3 = str3 + "Goal: " + this.f90184e + IOUtils.LINE_SEPARATOR_UNIX;
        }
        System.out.println(str3);
    }

    public final void y() {
        z();
        String str = "";
        for (int i10 = 0; i10 < this.f90192m; i10++) {
            str = (str + this.f90187h[i10]) + IOUtils.LINE_SEPARATOR_UNIX;
        }
        System.out.println(str + this.f90184e + IOUtils.LINE_SEPARATOR_UNIX);
    }

    public final void z() {
        System.out.println("Display Rows (" + this.f90192m + "x" + this.f90191l + ")\n");
    }
}
