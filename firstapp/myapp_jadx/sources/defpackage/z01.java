package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z01 {
    public final s4u<b, a> a = new s4u<>(16);
    public final rtw<b, a> b = fz60.b();
    public final ppe0 c = new ppe0();

    public static final class a {
        public final Object a;

        public /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.g(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }
    }

    public static final class b {
        public final z7i a;
        public final Object b;

        public b(z7i z7iVar, Object obj) {
            this.a = z7iVar;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(font=");
            sb.append(this.a);
            sb.append(", loaderKey=");
            return ekw.a(sb, this.b, ')');
        }
    }

    public static void a(z01 z01Var, z7i z7iVar, k70 k70Var, Object obj) {
        z01Var.getClass();
        Object obj2 = null;
        b bVar = new b(z7iVar, null);
        synchronized (z01Var.c) {
            try {
                if (obj == null) {
                    z01Var.b.m(bVar, new a(obj2));
                    Unit unit = Unit.a;
                } else {
                    z01Var.a.c(bVar, new a(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(z7i z7iVar, k70 k70Var, sz0 sz0Var, x1b x1bVar) {
        a11 a11Var;
        b bVar;
        if (x1bVar instanceof a11) {
            a11Var = (a11) x1bVar;
            int i = a11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a11Var.d = i - Integer.MIN_VALUE;
            } else {
                a11Var = new a11(this, x1bVar);
            }
        } else {
            a11Var = new a11(this, x1bVar);
        }
        Object obj = a11Var.b;
        Object obj2 = y5b.a;
        int i2 = a11Var.d;
        Object obj3 = null;
        if (i2 == 0) {
            uj50.b(obj);
            k70Var.getClass();
            b bVar2 = new b(z7iVar, null);
            synchronized (this.c) {
                try {
                    a aVarB = this.a.b(bVar2);
                    if (aVarB == null) {
                        aVarB = this.b.d(bVar2);
                    }
                    if (aVarB != null) {
                        return aVarB.a;
                    }
                    Unit unit = Unit.a;
                    a11Var.a = bVar2;
                    a11Var.d = 1;
                    Object objInvoke = sz0Var.invoke(a11Var);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    obj = objInvoke;
                    bVar = bVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = a11Var.a;
            uj50.b(obj);
        }
        synchronized (this.c) {
            try {
                if (obj == null) {
                    this.b.m(bVar, new a(obj3));
                } else {
                    this.a.c(bVar, new a(obj));
                }
                Unit unit2 = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
