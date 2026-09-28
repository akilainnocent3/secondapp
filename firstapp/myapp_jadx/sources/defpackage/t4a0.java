package defpackage;

import androidx.compose.foundation.gestures.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t4a0 implements l5f0 {
    public final y4a0 a;
    public final h4d<Float> b;
    public final xi0<Float> c;
    public final b.a d = b.c;

    public t4a0(y4a0 y4a0Var, h4d<Float> h4dVar, xi0<Float> xi0Var) {
        this.a = y4a0Var;
        this.b = h4dVar;
        this.c = xi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.l5f0
    public final Object b(tp70 tp70Var, float f, Function1 function1, x1b x1bVar) {
        r4a0 r4a0Var;
        if (x1bVar instanceof r4a0) {
            r4a0Var = (r4a0) x1bVar;
            int i = r4a0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r4a0Var.c = i - Integer.MIN_VALUE;
            } else {
                r4a0Var = new r4a0(this, x1bVar);
            }
        } else {
            r4a0Var = new r4a0(this, x1bVar);
        }
        Object objC = r4a0Var.a;
        Object obj = y5b.a;
        int i2 = r4a0Var.c;
        if (i2 == 0) {
            uj50.b(objC);
            r4a0Var.c = 1;
            objC = c(tp70Var, f, function1, r4a0Var);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        ti0 ti0Var = (ti0) objC;
        return new Float(ti0Var.a.floatValue() != 0.0f ? ((Number) ti0Var.b.b()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(tp70 tp70Var, float f, Function1 function1, x1b x1bVar) {
        o4a0 o4a0Var;
        Function1 function2;
        if (x1bVar instanceof o4a0) {
            o4a0Var = (o4a0) x1bVar;
            int i = o4a0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o4a0Var.d = i - Integer.MIN_VALUE;
            } else {
                o4a0Var = new o4a0(this, x1bVar);
            }
        } else {
            o4a0Var = new o4a0(this, x1bVar);
        }
        Object objD = o4a0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = o4a0Var.d;
        if (i2 == 0) {
            uj50.b(objD);
            q4a0 q4a0Var = new q4a0(this, f, function1, tp70Var, null);
            o4a0Var.a = function1;
            o4a0Var.d = 1;
            objD = ej5.d(this.d, q4a0Var, o4a0Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
            function2 = function1;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function2 = o4a0Var.a;
            uj50.b(objD);
        }
        ti0 ti0Var = (ti0) objD;
        function2.invoke(new Float(0.0f));
        return ti0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(tp70 tp70Var, float f, float f2, p4a0 p4a0Var, x1b x1bVar) {
        s4a0 s4a0Var;
        if (x1bVar instanceof s4a0) {
            s4a0Var = (s4a0) x1bVar;
            int i = s4a0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s4a0Var.c = i - Integer.MIN_VALUE;
            } else {
                s4a0Var = new s4a0(this, x1bVar);
            }
        } else {
            s4a0Var = new s4a0(this, x1bVar);
        }
        s4a0 s4a0Var2 = s4a0Var;
        Object objA = s4a0Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = s4a0Var2.c;
        if (i2 == 0) {
            uj50.b(objA);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return cj0.a(28, f, f2);
            }
            s4a0Var2.c = 1;
            h4d<Float> h4dVar = this.b;
            objA = (Math.abs(j4d.a(h4dVar, 0.0f, f2)) >= Math.abs(f) ? new k4d(h4dVar) : new f5f0(this.c)).a(tp70Var, new Float(f), new Float(f2), p4a0Var, s4a0Var2);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        return ((ti0) objA).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t4a0) {
            t4a0 t4a0Var = (t4a0) obj;
            if (Intrinsics.g(t4a0Var.c, this.c) && Intrinsics.g(t4a0Var.b, this.b) && Intrinsics.g(t4a0Var.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
