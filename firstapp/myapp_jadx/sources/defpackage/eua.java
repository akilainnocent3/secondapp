package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class eua<E> extends tb5<E> {
    public final pb5 G;

    @Override // defpackage.tb5
    public final boolean C() {
        return this.G == pb5.b;
    }

    public final Object Q(E e, boolean z) {
        Function1<E, Unit> function1;
        jdh0 jdh0VarB;
        if (this.G == pb5.c) {
            Object objC = super.c(e);
            if (!(objC instanceof h77.b) || (objC instanceof h77.a)) {
                return objC;
            }
            if (!z || (function1 = this.b) == null || (jdh0VarB = lpy.b(function1, e, null)) == null) {
                return Unit.a;
            }
            throw jdh0VarB;
        }
        E e2 = e;
        Object obj = zb5.d;
        i77<E> i77Var = (i77) s0o.a.getObjectVolatile(this, tb5.E);
        while (true) {
            long andIncrement = tb5.d.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zA = A(andIncrement, false);
            int i = zb5.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (i77Var.d != j3) {
                i77<E> i77VarR = r(j3, i77Var);
                if (i77VarR != null) {
                    i77Var = i77VarR;
                } else if (zA) {
                    return new h77.a(w());
                }
            }
            int iN = N(i77Var, i2, e2, j, obj, zA);
            if (iN == 0) {
                i77Var.a();
                return Unit.a;
            }
            if (iN == 1) {
                return Unit.a;
            }
            if (iN == 2) {
                if (zA) {
                    i77Var.i();
                    return new h77.a(w());
                }
                bwi0 bwi0Var = obj instanceof bwi0 ? (bwi0) obj : null;
                if (bwi0Var != null) {
                    bwi0Var.a(i77Var, i2 + i);
                }
                o((i77Var.d * j2) + ((long) i2));
                return Unit.a;
            }
            if (iN == 3) {
                ib5.a("unexpected");
                return null;
            }
            if (iN == 4) {
                if (j < v()) {
                    i77Var.a();
                }
                return new h77.a(w());
            }
            if (iN == 5) {
                i77Var.a();
            }
            e2 = e;
        }
    }

    @Override // defpackage.tb5, defpackage.ec80
    public final Object c(E e) {
        return Q(e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tb5, defpackage.ec80
    public final Object j(v1b v1bVar, Object obj) throws Throwable {
        jdh0 jdh0VarB;
        if (!(Q(obj, true) instanceof h77.a)) {
            return Unit.a;
        }
        Function1<E, Unit> function1 = this.b;
        if (function1 == null || (jdh0VarB = lpy.b(function1, obj, null)) == null) {
            throw w();
        }
        rtg.a(jdh0VarB, w());
        throw jdh0VarB;
    }

    public eua(int i, pb5 pb5Var, Function1<? super E, Unit> function1) {
        super(i, function1);
        this.G = pb5Var;
        if (pb5Var != pb5.a) {
            if (i >= 1) {
                return;
            }
            kb5.a(pe4.b(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        efx.a(jq40.a(tb5.class).k(), YAzniTbXHYQ.SwUrQ, " instead");
        throw null;
    }
}
