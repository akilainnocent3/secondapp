package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lwr extends d.c implements l3w, x44, psr {
    public static final a H = new a();
    public mwr D;
    public jwr E;
    public boolean F;
    public i3z G;

    public static final class a implements x44.a {
        @Override // x44.a
        public final boolean a() {
            return false;
        }
    }

    public static final class b implements x44.a {
        public final /* synthetic */ dq40<jwr.a> b;
        public final /* synthetic */ int c;

        public b(dq40<jwr.a> dq40Var, int i) {
            this.b = dq40Var;
            this.c = i;
        }

        @Override // x44.a
        public final boolean a() {
            return lwr.this.p2(this.b.a, this.c);
        }
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        final y yVarD0 = vhvVar.d0(j);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: kwr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((y.a) obj).s(yVarD0, 0, 0, 0.0f);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.x44
    public final <T> T e0(int i, Function1<? super x44.a, ? extends T> function1) {
        if (this.D.a() <= 0 || !this.D.c() || !this.C) {
            return function1.invoke(H);
        }
        boolean zQ2 = q2(i);
        mwr mwrVar = this.D;
        int iE = zQ2 ? mwrVar.e() : mwrVar.d();
        dq40 dq40Var = new dq40();
        jwr jwrVar = this.E;
        jwrVar.getClass();
        T t = (T) new jwr.a(iE, iE);
        jwrVar.a.b(t);
        dq40Var.a = t;
        int iB = this.D.b() * 2;
        int iA = this.D.a();
        if (iB > iA) {
            iB = iA;
        }
        T tInvoke = null;
        int i2 = 0;
        while (tInvoke == null && p2((jwr.a) dq40Var.a, i) && i2 < iB) {
            jwr.a aVar = (jwr.a) dq40Var.a;
            int i3 = aVar.a;
            int i4 = aVar.b;
            if (q2(i)) {
                i4++;
            } else {
                i3--;
            }
            jwr jwrVar2 = this.E;
            jwrVar2.getClass();
            T t2 = (T) new jwr.a(i3, i4);
            jwrVar2.a.b(t2);
            this.E.a.j((jwr.a) dq40Var.a);
            dq40Var.a = t2;
            i2++;
            pkd.f(this).d();
            tInvoke = function1.invoke(new b(dq40Var, i));
        }
        this.E.a.j((jwr.a) dq40Var.a);
        pkd.f(this).d();
        return tInvoke;
    }

    @Override // defpackage.l3w
    public final kni0 o0() {
        g730<x44> g730Var = y44.a;
        wu90 wu90Var = new wu90(g730Var);
        wu90Var.p(g730Var, this);
        return wu90Var;
    }

    public final boolean p2(jwr.a aVar, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.G != i3z.a) {
                }
            } else if (i != 1 && i != 2) {
                ib5.a("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (q2(i) ? aVar.a > 0 : aVar.b < this.D.a() - 1) {
                return true;
            }
        } else if (this.G != i3z.b) {
            if (q2(i)) {
            }
        }
        return false;
    }

    public final boolean q2(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.F;
            }
            if (i == 6) {
                if (this.F) {
                    return false;
                }
            } else if (i == 3) {
                int iOrdinal = pkd.f(this).O.ordinal();
                if (iOrdinal == 0) {
                    return this.F;
                }
                if (iOrdinal != 1) {
                    uhc.a();
                    return false;
                }
                if (this.F) {
                    return false;
                }
            } else {
                if (i != 4) {
                    ib5.a("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int iOrdinal2 = pkd.f(this).O.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.F;
                    }
                    uhc.a();
                    return false;
                }
                if (this.F) {
                    return false;
                }
            }
        }
        return true;
    }
}
