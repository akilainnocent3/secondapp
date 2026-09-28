package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class yn4 {
    public il4 A;
    public final un4 a;
    public no4 b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public hl4 f;
    public xj4 g;
    public float h;
    public float i;
    public String j;
    public double k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public km4 s;
    public km4 t;
    public km4 u;
    public km4 v;
    public km4 w;
    public float x;
    public long y;
    public boolean z;

    public static final class a {
        public final long a;
        public final int b;
        public ek4 c;
        public rp4 d;
        public rp4 e;
        public rp4 f;
        public final float g;
        public final float h;
        public final float i;
        public final Double j;
        public final boolean k;
        public final float l;
        public boolean m;
        public rp4 n;
        public rp4 o;
        public float p;
        public dk4 q;
        public float r;

        public a(long j, int i, ek4 ek4Var, rp4 rp4Var, rp4 rp4Var2, float f, float f2, float f3, Double d, boolean z, float f4) {
            dk4 dk4Var = dk4.a;
            this.a = j;
            this.b = i;
            this.c = ek4Var;
            this.d = rp4Var;
            this.e = rp4Var;
            this.f = rp4Var2;
            this.g = f;
            this.h = f2;
            this.i = f3;
            this.j = d;
            this.k = z;
            this.l = f4;
            this.m = false;
            this.n = null;
            this.o = null;
            this.p = 0.0f;
            this.q = dk4Var;
            this.r = 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && Float.compare(this.g, aVar.g) == 0 && Float.compare(this.h, aVar.h) == 0 && Float.compare(this.i, aVar.i) == 0 && Intrinsics.g(this.j, aVar.j) && this.k == aVar.k && Float.compare(this.l, aVar.l) == 0 && this.m == aVar.m && Intrinsics.g(this.n, aVar.n) && Intrinsics.g(this.o, aVar.o) && Float.compare(this.p, aVar.p) == 0 && this.q == aVar.q && Float.compare(this.r, aVar.r) == 0;
        }

        public final int hashCode() {
            int iA = tvh.a(this.i, tvh.a(this.h, tvh.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + gpp.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31);
            Double d = this.j;
            int iA2 = mtg0.a(tvh.a(this.l, mtg0.a((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.k), 31), 31, this.m);
            rp4 rp4Var = this.n;
            int iHashCode = (iA2 + (rp4Var == null ? 0 : rp4Var.hashCode())) * 31;
            rp4 rp4Var2 = this.o;
            return Float.hashCode(this.r) + ((this.q.hashCode() + tvh.a(this.p, (iHashCode + (rp4Var2 != null ? rp4Var2.hashCode() : 0)) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MutableBody(id=");
            sb.append(this.a);
            sb.append(", objectId=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", center=");
            sb.append(this.d);
            sb.append(", previousCenter=");
            sb.append(this.e);
            sb.append(", velocity=");
            sb.append(this.f);
            sb.append(", radius=");
            sb.append(this.g);
            sb.append(", halfWidth=");
            sb.append(this.h);
            sb.append(", halfHeight=");
            sb.append(this.i);
            sb.append(", rewardValue=");
            sb.append(this.j);
            sb.append(", isGoldenBallAllowed=");
            sb.append(this.k);
            sb.append(", velocityMultiplier=");
            sb.append(this.l);
            sb.append(", hasBouncedOffCupEdge=");
            sb.append(this.m);
            sb.append(", collectStartCenter=");
            sb.append(this.n);
            sb.append(", collectTargetCenter=");
            sb.append(this.o);
            sb.append(", collectElapsedSeconds=");
            sb.append(this.p);
            sb.append(", state=");
            sb.append(this.q);
            sb.append(", collisionCooldownSeconds=");
            return h70.a(sb, this.r, ')');
        }
    }

    public static final class b {
        public final long a;
        public final wj4 b;
        public final rp4 c;
        public Double d;
        public float e;
        public final float f;

        public b(long j, wj4 wj4Var, rp4 rp4Var, float f, int i) {
            rp4Var.getClass();
            this.a = j;
            this.b = wj4Var;
            this.c = rp4Var;
            this.d = null;
            this.e = 0.0f;
            this.f = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Float.compare(this.e, bVar.e) == 0 && Float.compare(this.f, bVar.f) == 0;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31;
            Double d = this.d;
            return Float.hashCode(this.f) + tvh.a(this.e, (iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MutableEffect(id=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", position=");
            sb.append(this.c);
            sb.append(", amount=");
            sb.append(this.d);
            sb.append(", ageSeconds=");
            sb.append(this.e);
            sb.append(", durationSeconds=");
            return h70.a(sb, this.f, ')');
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ek4.values().length];
            try {
                ek4 ek4Var = ek4.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ek4 ek4Var2 = ek4.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ek4 ek4Var3 = ek4.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ek4 ek4Var4 = ek4.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public yn4(int i) {
        un4 un4Var = new un4(0);
        no4 no4Var = new no4(null, null);
        this.a = un4Var;
        this.b = no4Var;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = hl4.a;
        Float f = this.b.b;
        this.i = f != null ? f.floatValue() : 0.0f;
        this.j = "";
        this.n = un4Var.a();
        this.o = un4Var.a();
        this.p = un4Var.a();
        this.A = d();
        k();
    }

    public static rp4 b(a aVar, zi4 zi4Var) {
        rp4 rp4Var = aVar.n;
        if (rp4Var == null) {
            rp4Var = aVar.d;
        }
        float f = rp4Var.b;
        return new rp4(zi4Var.a(), Math.max(f, (zi4Var.e * 0.42f) + zi4Var.c));
    }

    public static boolean g(a aVar, zi4 zi4Var) {
        rp4 rp4VarO = o(aVar.e, zi4Var);
        rp4 rp4VarO2 = o(aVar.d, zi4Var);
        float f = rp4VarO2.b;
        float f2 = rp4VarO.b;
        float f3 = f - f2;
        if (f3 <= 0.0f) {
            return false;
        }
        float f4 = zi4Var.c;
        if (f2 > f4 || f < f4) {
            return false;
        }
        float fD = f.d((f4 - f2) / f3, 0.0f, 1.0f);
        float f5 = rp4VarO.a;
        float fA = hxa.a(rp4VarO2.a, f5, fD, f5);
        return zi4Var.a() - 0.5f <= fA && fA <= zi4Var.a() + 0.5f;
    }

    public static void j(a aVar, zi4 zi4Var, float f) {
        float fD = 1.0f - f.d(f, 0.0f, 1.0f);
        float fA = w6.a(fD, fD, fD, 1.0f);
        rp4 rp4Var = aVar.n;
        if (rp4Var == null) {
            rp4Var = aVar.d;
        }
        rp4 rp4VarB = b(aVar, zi4Var);
        aVar.o = rp4VarB;
        float f2 = rp4Var.a;
        float fA2 = hxa.a(rp4VarB.a, f2, fA, f2);
        float f3 = rp4Var.b;
        aVar.d = new rp4(fA2, hxa.a(rp4VarB.b, f3, fA, f3));
    }

    public static void m(a aVar, zi4 zi4Var) {
        aVar.q = dk4.b;
        aVar.n = aVar.d;
        aVar.o = b(aVar, zi4Var);
        aVar.p = 0.0396f;
        aVar.f = new rp4(0.0f, 0.0f);
        aVar.r = 0.0f;
        j(aVar, zi4Var, 0.22f);
    }

    public static rp4 o(rp4 rp4Var, zi4 zi4Var) {
        float f = zi4Var.f;
        if (f == 0.0f) {
            return rp4Var;
        }
        float fA = zi4Var.a();
        float f2 = (zi4Var.e * 0.36f) + zi4Var.c;
        float f3 = rp4Var.a - fA;
        float f4 = rp4Var.b - f2;
        double d = ((-f) * 3.1415927f) / 180.0f;
        return new rp4(fA + ((((float) Math.cos(d)) * f3) - (((float) Math.sin(d)) * f4)), f2 + (f4 * ((float) Math.cos(d))) + (f3 * ((float) Math.sin(d))));
    }

    public final il4 a(Integer num, Double d, Double d2) {
        if (num != null) {
            float fIntValue = num.intValue();
            if (fIntValue < 0.0f) {
                fIntValue = 0.0f;
            }
            this.i = fIntValue;
            no4 no4Var = this.b;
            if (no4Var.b == null) {
                if (fIntValue < 1.0f) {
                    fIntValue = 1.0f;
                }
                this.b = new no4(no4Var.a, Float.valueOf(fIntValue));
            }
        }
        Object obj = null;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            double dC = dDoubleValue < 0.0d ? 0.0d : dDoubleValue;
            no4 no4Var2 = this.b;
            Double dE = e(dC, null);
            Float f = no4Var2.b;
            no4Var2.getClass();
            this.b = new no4(dE, f);
            if (dE != null) {
                dC = f.c(dC, 0.0d, dE.doubleValue());
            } else if (dC < 0.0d) {
                dC = 0.0d;
            }
            this.k = dC;
        }
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                b bVar = (b) obj2;
                wj4 wj4Var = bVar.b;
                if (wj4Var == wj4.a || wj4Var == wj4.b) {
                    if (bVar.d == null) {
                        obj = obj2;
                        break;
                    }
                }
            }
            b bVar2 = (b) obj;
            if (bVar2 != null) {
                if (dDoubleValue2 <= 0.0d) {
                    arrayList.remove(bVar2);
                } else {
                    bVar2.d = Double.valueOf(dDoubleValue2);
                    bVar2.e = 0.0f;
                }
            }
        }
        il4 il4VarD = d();
        this.A = il4VarD;
        return il4VarD;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public final zi4 c() {
        float f;
        float fCos;
        float f2 = this.n;
        float f3 = this.p;
        un4 un4Var = this.a;
        float f4 = un4Var.b;
        float f5 = un4Var.h;
        float f6 = un4Var.d;
        float f7 = f4 - f6;
        float f8 = un4Var.c;
        km4 km4Var = this.s;
        if (km4Var == null) {
            km4 km4Var2 = this.t;
            if (km4Var2 != null) {
                float f9 = un4Var.g;
                if (f9 != 0.0f) {
                    float fD = f.d(this.r / f9, 0.0f, 1.0f);
                    fCos = (1.0f - fD) * km4Var2.a * f5 * ((float) Math.cos(3.1415927f * fD * 1.5f));
                }
                km4 km4Var3 = this.s;
                return new zi4(f2, f3, f7, f8, f6, f, km4Var3, km4Var3 != null, this.t != null);
            }
            f = 0.0f;
            km4 km4Var4 = this.s;
            return new zi4(f2, f3, f7, f8, f6, f, km4Var4, km4Var4 != null, this.t != null);
        }
        fCos = km4Var.a * f5;
        f = fCos;
        km4 km4Var5 = this.s;
        return new zi4(f2, f3, f7, f8, f6, f, km4Var5, km4Var5 != null, this.t != null);
    }

    public final il4 d() {
        no4 no4Var = this.b;
        mo4 mo4Var = new mo4(this.k, no4Var.a);
        Float f = no4Var.b;
        float fD = (f == null || f.floatValue() <= 0.0f) ? 0.0f : f.d(1.0f - (this.i / f.floatValue()), 0.0f, 1.0f);
        hl4 hl4Var = this.f;
        un4 un4Var = this.a;
        float f2 = un4Var.a;
        float f3 = un4Var.b;
        zn4 zn4Var = new zn4(f2, f3, f3 - 0.0f);
        float f4 = this.h;
        float f5 = this.i;
        String str = this.j;
        im4 im4Var = new im4(this.l, this.m);
        zi4 zi4VarC = c();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar = (a) obj;
            arrayList2.add(new ck4(aVar.a, aVar.c, aVar.d, aVar.f, aVar.g, aVar.h, aVar.i, aVar.q, aVar.r, aVar.m));
            size = size;
            hl4Var = hl4Var;
        }
        hl4 hl4Var2 = hl4Var;
        ArrayList arrayList3 = this.d;
        ArrayList arrayList4 = new ArrayList(l48.r(arrayList3, 10));
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            b bVar = (b) obj2;
            arrayList4.add(new vj4(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f));
            zn4Var = zn4Var;
            arrayList3 = arrayList3;
        }
        return new il4(hl4Var2, zn4Var, f4, fD, f5, str, mo4Var, im4Var, zi4VarC, arrayList2, arrayList4, this.g);
    }

    public final Double e(double d, Double d2) {
        Double d3 = this.b.a;
        if (d2 == null) {
            return (d3 == null || d <= d3.doubleValue()) ? d3 : Double.valueOf(d);
        }
        double dDoubleValue = d2.doubleValue();
        if (dDoubleValue < 0.0d) {
            dDoubleValue = 0.0d;
        }
        return Double.valueOf(d + dDoubleValue);
    }

    public final float f(ek4 ek4Var) {
        int iOrdinal = ek4Var.ordinal();
        if (iOrdinal == 0) {
            return 1.0f;
        }
        un4 un4Var = this.a;
        if (iOrdinal == 1) {
            return un4Var.p;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return un4Var.q;
        }
        uhc.a();
        return 0.0f;
    }

    public final il4 h(Integer num, Double d, Double d2, int i, String str) {
        double d3;
        Float fValueOf;
        str.getClass();
        double dC = 0.0d;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
            d3 = dDoubleValue;
        } else {
            d3 = 0.0d;
        }
        no4 no4Var = this.b;
        Double dE = e(d3, d2);
        if (num != null) {
            float fIntValue = num.intValue();
            if (fIntValue < 1.0f) {
                fIntValue = 1.0f;
            }
            fValueOf = Float.valueOf(fIntValue);
        } else {
            fValueOf = this.b.b;
        }
        no4Var.getClass();
        this.b = new no4(dE, fValueOf);
        k();
        this.j = str;
        Double d4 = this.b.a;
        if (d4 != null) {
            dC = f.c(d3, 0.0d, d4.doubleValue());
        } else if (d3 >= 0.0d) {
            dC = d3;
        }
        this.k = dC;
        this.l = f.e(i, 0, 2);
        il4 il4VarD = d();
        this.A = il4VarD;
        return il4VarD;
    }

    public final boolean i(a aVar, zi4 zi4Var) {
        float f = zi4Var.c;
        float f2 = (zi4Var.e * this.a.k) + f;
        float f3 = aVar.d.b;
        float f4 = aVar.g;
        return f3 + f4 >= f && f3 - f4 <= f2;
    }

    public final il4 k() {
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f = hl4.a;
        this.g = null;
        this.h = 0.0f;
        Float f = this.b.b;
        this.i = f != null ? f.floatValue() : 0.0f;
        this.j = "";
        this.k = 0.0d;
        this.l = 0;
        this.m = 0;
        float fA = this.a.a();
        this.n = fA;
        this.o = fA;
        this.p = fA;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = 0.0f;
        this.y = 0L;
        this.z = false;
        il4 il4VarD = d();
        this.A = il4VarD;
        return il4VarD;
    }

    public final il4 l(fp4 fp4Var) {
        float f;
        fp4Var.getClass();
        ek4 ek4Var = fp4Var.b;
        hl4 hl4Var = this.f;
        hl4 hl4Var2 = hl4.c;
        if (hl4Var == hl4Var2) {
            return this.A;
        }
        if (hl4Var == hl4.a) {
            if (hl4Var == hl4Var2) {
                k();
            }
            this.f = hl4.b;
            this.g = null;
            this.A = d();
        }
        boolean z = ek4Var == ek4.c || ek4Var == ek4.d;
        un4 un4Var = this.a;
        float fMax = z ? Math.max(un4Var.y, un4Var.z) : un4Var.x;
        float f2 = z ? un4Var.y : fMax;
        float f3 = z ? un4Var.z : fMax;
        int i = fp4Var.c;
        int i2 = i <= 0 ? 0 : i - 1;
        float f4 = un4Var.a / 7.0f;
        float fD = f.d((f4 / 2.0f) + (f.e(i2, 0, 6) * f4), f2, un4Var.a - f2);
        float f5 = fp4Var.e;
        float f6 = f5 < 0.1f ? 0.1f : f5;
        int iOrdinal = ek4Var.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            f = un4Var.q * un4Var.n;
        } else {
            f = f(ek4Var) * un4Var.o * 1.0f;
        }
        float f7 = f * f6;
        float f8 = (fp4Var.d * 3.1415927f) / 180.0f;
        float fSin = 0.0f;
        if (!z) {
            double d = f8;
            float fCos = (float) Math.cos(d);
            if (Math.abs(fCos) >= 1.0E-6f) {
                fSin = (((float) Math.sin(d)) * f7) / fCos;
            }
        }
        int i3 = fp4Var.a;
        this.c.add(new a(i3, i3, ek4Var, new rp4(fD, -f3), new rp4(fSin, f7), fMax, f2, f3, fp4Var.f, fp4Var.g, f6));
        il4 il4VarD = d();
        this.A = il4VarD;
        return il4VarD;
    }

    public final void n(km4 km4Var) {
        float f = this.p + km4Var.a;
        un4 un4Var = this.a;
        float f2 = un4Var.c;
        float fD = f.d(f, 0.5f - (f2 / 2.0f), (un4Var.a - 0.5f) - (f2 / 2.0f));
        if (fD == this.p) {
            return;
        }
        this.o = this.n;
        this.p = fD;
        this.q = 0.0f;
        this.s = km4Var;
        this.t = null;
        this.r = 0.0f;
    }

    public yn4() {
        this(0);
    }
}
