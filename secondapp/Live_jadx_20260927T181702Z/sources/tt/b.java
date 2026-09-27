package tt;

import oy.l;
import oy.m;
import yt.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class b {
    public static final C1414b A;
    public static final C1414b B;
    public static final C1414b C;
    public static final C1414b D;
    public static final C1414b E;
    public static final C1414b F;
    public static final C1414b G;
    public static final C1414b H;
    public static final C1414b I;
    public static final C1414b J;
    public static final C1414b K;
    public static final C1414b L;
    public static final C1414b M;
    public static final C1414b N;
    public static final C1414b O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1414b f137338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1414b f137339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1414b f137340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d<rt.a.x> f137341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d<rt.a.k> f137342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d<rt.a.c.EnumC1238c> f137343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1414b f137344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1414b f137345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1414b f137346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1414b f137347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1414b f137348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1414b f137349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1414b f137350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1414b f137351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d<rt.a.j> f137352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1414b f137353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1414b f137354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1414b f137355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1414b f137356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1414b f137357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1414b f137358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1414b f137359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1414b f137360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C1414b f137361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C1414b f137362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C1414b f137363z;

    /* JADX INFO: renamed from: tt.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1414b extends d<Boolean> {
        public C1414b(int i10) {
            super(i10, 1);
        }

        public static /* synthetic */ void f(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // tt.b.d
        @l
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f137365a)) != 0);
        }

        @Override // tt.b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f137365a;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<E extends j.a> extends d<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final E[] f137364c;

        public c(int i10, E[] eArr) {
            super(i10, g(eArr));
            this.f137364c = eArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public static <E> int g(@l E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // tt.b.d
        @m
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i10) {
            int i11 = (1 << this.f137366b) - 1;
            int i12 = this.f137365a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (E e10 : this.f137364c) {
                if (e10.getNumber() == i13) {
                    return e10;
                }
            }
            return null;
        }

        @Override // tt.b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e10) {
            return e10.getNumber() << this.f137365a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f137365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f137366b;

        /* JADX WARN: Incorrect types in method signature: <E::Lyt/j$a;>(Ltt/b$d<*>;[TE;)Ltt/b$d<TE;>; */
        public static d a(d dVar, j.a[] aVarArr) {
            return new c(dVar.f137365a + dVar.f137366b, aVarArr);
        }

        public static C1414b b(d<?> dVar) {
            return new C1414b(dVar.f137365a + dVar.f137366b);
        }

        public static C1414b c() {
            return new C1414b(0);
        }

        public abstract E d(int i10);

        public abstract int e(E e10);

        public d(int i10, int i11) {
            this.f137365a = i10;
            this.f137366b = i11;
        }
    }

    static {
        C1414b c1414bC = d.c();
        f137338a = c1414bC;
        f137339b = d.b(c1414bC);
        C1414b c1414bC2 = d.c();
        f137340c = c1414bC2;
        d<rt.a.x> dVarA = d.a(c1414bC2, rt.a.x.values());
        f137341d = dVarA;
        d<rt.a.k> dVarA2 = d.a(dVarA, rt.a.k.values());
        f137342e = dVarA2;
        d<rt.a.c.EnumC1238c> dVarA3 = d.a(dVarA2, rt.a.c.EnumC1238c.values());
        f137343f = dVarA3;
        C1414b c1414bB = d.b(dVarA3);
        f137344g = c1414bB;
        C1414b c1414bB2 = d.b(c1414bB);
        f137345h = c1414bB2;
        C1414b c1414bB3 = d.b(c1414bB2);
        f137346i = c1414bB3;
        C1414b c1414bB4 = d.b(c1414bB3);
        f137347j = c1414bB4;
        C1414b c1414bB5 = d.b(c1414bB4);
        f137348k = c1414bB5;
        f137349l = d.b(c1414bB5);
        C1414b c1414bB6 = d.b(dVarA);
        f137350m = c1414bB6;
        f137351n = d.b(c1414bB6);
        d<rt.a.j> dVarA4 = d.a(dVarA2, rt.a.j.values());
        f137352o = dVarA4;
        C1414b c1414bB7 = d.b(dVarA4);
        f137353p = c1414bB7;
        C1414b c1414bB8 = d.b(c1414bB7);
        f137354q = c1414bB8;
        C1414b c1414bB9 = d.b(c1414bB8);
        f137355r = c1414bB9;
        C1414b c1414bB10 = d.b(c1414bB9);
        f137356s = c1414bB10;
        C1414b c1414bB11 = d.b(c1414bB10);
        f137357t = c1414bB11;
        C1414b c1414bB12 = d.b(c1414bB11);
        f137358u = c1414bB12;
        C1414b c1414bB13 = d.b(c1414bB12);
        f137359v = c1414bB13;
        f137360w = d.b(c1414bB13);
        C1414b c1414bB14 = d.b(dVarA4);
        f137361x = c1414bB14;
        C1414b c1414bB15 = d.b(c1414bB14);
        f137362y = c1414bB15;
        C1414b c1414bB16 = d.b(c1414bB15);
        f137363z = c1414bB16;
        C1414b c1414bB17 = d.b(c1414bB16);
        A = c1414bB17;
        C1414b c1414bB18 = d.b(c1414bB17);
        B = c1414bB18;
        C1414b c1414bB19 = d.b(c1414bB18);
        C = c1414bB19;
        C1414b c1414bB20 = d.b(c1414bB19);
        D = c1414bB20;
        C1414b c1414bB21 = d.b(c1414bB20);
        E = c1414bB21;
        F = d.b(c1414bB21);
        C1414b c1414bB22 = d.b(c1414bC2);
        G = c1414bB22;
        C1414b c1414bB23 = d.b(c1414bB22);
        H = c1414bB23;
        I = d.b(c1414bB23);
        C1414b c1414bB24 = d.b(dVarA2);
        J = c1414bB24;
        C1414b c1414bB25 = d.b(c1414bB24);
        K = c1414bB25;
        L = d.b(c1414bB25);
        C1414b c1414bC3 = d.c();
        M = c1414bC3;
        N = d.b(c1414bC3);
        O = d.c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "modality";
        } else if (i10 == 2) {
            objArr[0] = "kind";
        } else if (i10 == 5) {
            objArr[0] = "modality";
        } else if (i10 == 6) {
            objArr[0] = "memberKind";
        } else if (i10 == 8) {
            objArr[0] = "modality";
        } else if (i10 == 9) {
            objArr[0] = "memberKind";
        } else if (i10 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i10) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z10, @l rt.a.x xVar, @l rt.a.k kVar, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f137340c.e(Boolean.valueOf(z10)) | f137342e.e(kVar) | f137341d.e(xVar) | J.e(Boolean.valueOf(z11)) | K.e(Boolean.valueOf(z12)) | L.e(Boolean.valueOf(z13));
    }
}
