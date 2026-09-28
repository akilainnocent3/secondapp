package defpackage;

import com.google.protobuf.Reader;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class k6w {
    public final wr70 a;
    public final c60 b;
    public final ar70 c;
    public mmd d;
    public boolean f;
    public jvd0 g;
    public final tb5 e = d77.b(Reader.READ_DONE, 6, null);
    public final v6w h = new v6w();

    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(boolean z, long j, long j2) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final a a(a aVar) {
            return new a(this.c, gly.f(this.a, aVar.a), Math.max(this.b, aVar.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return gly.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) gly.h(this.a));
            sb.append(", timeMillis=");
            sb.append(this.b);
            sb.append(", shouldApplyImmediately=");
            return ruw.a(sb, this.c, ')');
        }
    }

    public k6w(wr70 wr70Var, c60 c60Var, ar70 ar70Var, mmd mmdVar) {
        this.a = wr70Var;
        this.b = c60Var;
        this.c = ar70Var;
        this.d = mmdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, aj0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, k6w$a] */
    public static final Object c(k6w k6wVar, dq40 dq40Var, aq40 aq40Var, wr70 wr70Var, dq40 dq40Var2, long j, x1b x1bVar) {
        p6w p6wVar;
        wr70 wr70Var2;
        dq40 dq40Var3;
        k6w k6wVar2;
        dq40 dq40Var4;
        aq40 aq40Var2;
        boolean z;
        if (x1bVar instanceof p6w) {
            p6wVar = (p6w) x1bVar;
            int i = p6wVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6wVar.i = i - Integer.MIN_VALUE;
            } else {
                p6wVar = new p6w(x1bVar);
            }
        } else {
            p6wVar = new p6w(x1bVar);
        }
        Object objC = p6wVar.f;
        y5b y5bVar = y5b.a;
        int i2 = p6wVar.i;
        if (i2 == 0) {
            uj50.b(objC);
            if (j < 0) {
                return Boolean.FALSE;
            }
            q6w q6wVar = new q6w(k6wVar, null);
            p6wVar.a = k6wVar;
            p6wVar.b = dq40Var;
            p6wVar.c = aq40Var;
            wr70Var2 = wr70Var;
            p6wVar.d = wr70Var2;
            dq40Var3 = dq40Var2;
            p6wVar.e = dq40Var3;
            p6wVar.i = 1;
            objC = vxf0.c(j, q6wVar, p6wVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
            k6wVar2 = k6wVar;
            dq40Var4 = dq40Var;
            aq40Var2 = aq40Var;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40 dq40Var5 = p6wVar.e;
            wr70 wr70Var3 = p6wVar.d;
            aq40Var2 = p6wVar.c;
            dq40Var4 = p6wVar.b;
            k6w k6wVar3 = p6wVar.a;
            uj50.b(objC);
            dq40Var3 = dq40Var5;
            wr70Var2 = wr70Var3;
            k6wVar2 = k6wVar3;
        }
        a aVar = (a) objC;
        if (aVar != null) {
            boolean z2 = ((a) dq40Var4.a).c;
            long j2 = aVar.a;
            dq40Var4.a = new a(z2, j2, aVar.b);
            aq40Var2.a = wr70Var2.g(wr70Var2.e(j2));
            dq40Var3.a = cj0.a(30, 0.0f, 0.0f);
            k6wVar2.e(aVar);
            z = !w39.a(aq40Var2.a);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static a d(tb5 tb5Var) {
        a aVar = null;
        vc80 vc80VarA = zc80.a(new s6w(new h6w(tb5Var), null));
        while (vc80VarA.hasNext()) {
            a aVarA = (a) vc80VarA.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final float a(olx olxVar, float f) {
        wr70 wr70Var = this.a;
        return wr70Var.g(wr70Var.e(olxVar.a(wr70Var.h(wr70Var.d(f)))));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
    
        if (kotlin.Unit.a == r10) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, k6w$a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, aj0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.wr70 r17, k6w.a r18, float r19, float r20, defpackage.x1b r21) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6w.b(wr70, k6w$a, float, float, x1b):java.lang.Object");
    }

    public final void e(a aVar) {
        long j = aVar.b;
        long j2 = aVar.a;
        v6w v6wVar = this.h;
        v6wVar.a.a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        v6wVar.b.a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(wr70 wr70Var, o6w o6wVar, x1b x1bVar) {
        t6w t6wVar;
        if (x1bVar instanceof t6w) {
            t6wVar = (t6w) x1bVar;
            int i = t6wVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t6wVar.c = i - Integer.MIN_VALUE;
            } else {
                t6wVar = new t6w(this, x1bVar);
            }
        } else {
            t6wVar = new t6w(this, x1bVar);
        }
        Object obj = t6wVar.a;
        y5b y5bVar = y5b.a;
        int i2 = t6wVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            this.f = true;
            u6w u6wVar = new u6w(wr70Var, o6wVar, null);
            t6wVar.c = 1;
            jfe0 jfe0Var = new jfe0(t6wVar, t6wVar.getContext());
            if (mdh0.a(jfe0Var, true, jfe0Var, u6wVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.f = false;
        return Unit.a;
    }
}
