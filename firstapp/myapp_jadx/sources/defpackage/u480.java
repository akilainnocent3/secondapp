package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class u480<S> extends o {
    public static final ij0 r = new ij0(0.0f);
    public static final ij0 s = new ij0(1.0f);
    public final ytw b;
    public final ytw c;
    public S d;
    public dtg0<S> e;
    public long f;
    public final ke8 g;
    public final isw h;
    public bc6 i;
    public final tuw j;
    public final luw k;
    public long l;
    public final etw<a> m;
    public a n;
    public final s480 o;
    public float p;
    public final t480 q;

    public static final class a {
        public long a;
        public uwh0 b;
        public boolean c;
        public float d;
        public final ij0 e = new ij0(0.0f);
        public ij0 f;
        public long g;
        public long h;

        public final String toString() {
            return "progress nanos: " + this.a + ", animationSpec: " + this.b + ", isComplete: " + this.c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f + ", durationNanos: " + this.g + ", animationSpecDuration: " + this.h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [s480] */
    /* JADX WARN: Type inference failed for: r3v8, types: [t480] */
    public u480(ifx ifxVar) {
        super(3);
        this.b = m.b(ifxVar);
        this.c = m.b(ifxVar);
        this.d = ifxVar;
        this.g = new ke8(this, 2);
        this.h = j.a(0.0f);
        this.j = uuw.a();
        this.k = new luw();
        this.l = Long.MIN_VALUE;
        this.m = new etw<>((Object) null);
        this.o = new Function1() { // from class: s480
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.a.l = ((Long) obj).longValue();
                return Unit.a;
            }
        };
        this.q = new Function1() { // from class: t480
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long jLongValue = ((Long) obj).longValue();
                u480 u480Var = this.a;
                long j = jLongValue - u480Var.l;
                u480Var.l = jLongValue;
                long jC = ycv.c(j / ((double) u480Var.p));
                etw<u480.a> etwVar = u480Var.m;
                if (etwVar.e()) {
                    Object[] objArr = etwVar.a;
                    int i = etwVar.b;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        u480.a aVar = (u480.a) objArr[i3];
                        u480.q0(aVar, jC);
                        aVar.c = true;
                    }
                    dtg0<S> dtg0Var = u480Var.e;
                    if (dtg0Var != 0) {
                        dtg0Var.q();
                    }
                    int i4 = etwVar.b;
                    Object[] objArr2 = etwVar.a;
                    IntRange intRangeN = f.n(0, i4);
                    int i5 = intRangeN.a;
                    int i6 = intRangeN.b;
                    if (i5 <= i6) {
                        while (true) {
                            objArr2[i5 - i2] = objArr2[i5];
                            if (((u480.a) objArr2[i5]).c) {
                                i2++;
                            }
                            if (i5 == i6) {
                                break;
                            }
                            i5++;
                        }
                    }
                    xx0.l(i4 - i2, i4, null, objArr2);
                    etwVar.b -= i2;
                }
                u480.a aVar2 = u480Var.n;
                if (aVar2 != null) {
                    aVar2.g = u480Var.f;
                    u480.q0(aVar2, jC);
                    u480Var.u0(aVar2.d);
                    if (aVar2.d == 1.0f) {
                        u480Var.n = null;
                    }
                    u480Var.t0();
                }
                return Unit.a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q0(a aVar, long j) {
        long j2 = aVar.a + j;
        aVar.a = j2;
        long j3 = aVar.h;
        if (j2 >= j3) {
            aVar.d = 1.0f;
            return;
        }
        uwh0 uwh0Var = aVar.b;
        ij0 ij0Var = aVar.e;
        if (uwh0Var == null) {
            float f = j2 / j3;
            aVar.d = (f * 1.0f) + ((1.0f - f) * ij0Var.a(0));
            return;
        }
        ij0 ij0Var2 = aVar.f;
        if (ij0Var2 == null) {
            ij0Var2 = r;
        }
        aVar.d = f.d(((ij0) uwh0Var.g(j2, ij0Var, s, ij0Var2)).a(0), 0.0f, 1.0f);
    }

    @Override // defpackage.o
    public final S V() {
        return (S) ((x5a0) this.c).getValue();
    }

    @Override // defpackage.o
    public final S b0() {
        return (S) ((x5a0) this.b).getValue();
    }

    @Override // defpackage.o
    public final void d0(S s2) {
        ((x5a0) this.c).setValue(s2);
    }

    @Override // defpackage.o
    public final void e0(dtg0<S> dtg0Var) {
        dtg0<S> dtg0Var2 = this.e;
        if (dtg0Var2 != null && dtg0Var != dtg0Var2) {
            mm20.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + dtg0Var);
        }
        this.e = dtg0Var;
    }

    @Override // defpackage.o
    public final void f0() {
        this.e = null;
        ((r6a0) vtg0.b.getValue()).b(this);
    }

    public final Object n0(x1b x1bVar) {
        float fH = sje0.h(x1bVar.getContext());
        if (fH <= 0.0f) {
            o0();
            return Unit.a;
        }
        this.p = fH;
        Object objP = t4w.a(x1bVar.getContext()).P(this.q, x1bVar);
        return objP == y5b.a ? objP : Unit.a;
    }

    public final void o0() {
        dtg0<S> dtg0Var = this.e;
        if (dtg0Var != null) {
            dtg0Var.c();
        }
        this.m.i();
        if (this.n != null) {
            this.n = null;
            u0(1.0f);
            t0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    public final void p0() {
        dtg0<S> dtg0Var = this.e;
        if (dtg0Var == null) {
            return;
        }
        a aVar = this.n;
        if (aVar == null) {
            if (this.f > 0) {
                t5a0 t5a0Var = (t5a0) this.h;
                if (t5a0Var.j() == 1.0f || Intrinsics.g(((x5a0) this.c).getValue(), ((x5a0) this.b).getValue())) {
                    aVar = null;
                } else {
                    a aVar2 = new a();
                    aVar2.d = t5a0Var.j();
                    long j = this.f;
                    aVar2.g = j;
                    aVar2.h = ycv.c((1.0d - ((double) t5a0Var.j())) * j);
                    aVar2.e.e(0, t5a0Var.j());
                    aVar = aVar2;
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.g = this.f;
            this.m.g(aVar);
            dtg0Var.o(aVar);
        }
        this.n = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r0(x1b x1bVar) {
        w480 w480Var;
        if (x1bVar instanceof w480) {
            w480Var = (w480) x1bVar;
            int i = w480Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w480Var.c = i - Integer.MIN_VALUE;
            } else {
                w480Var = new w480(this, x1bVar);
            }
        } else {
            w480Var = new w480(this, x1bVar);
        }
        Object obj = w480Var.a;
        y5b y5bVar = y5b.a;
        int i2 = w480Var.c;
        etw<a> etwVar = this.m;
        if (i2 == 0) {
            uj50.b(obj);
            if (etwVar.d() && this.n == null) {
                return Unit.a;
            }
            if (sje0.h(w480Var.getContext()) == 0.0f) {
                o0();
                this.l = Long.MIN_VALUE;
                return Unit.a;
            }
            if (this.l == Long.MIN_VALUE) {
                w480Var.c = 1;
                if (t4w.a(w480Var.getContext()).P(this.o, w480Var) != y5bVar) {
                }
            }
            return y5bVar;
        }
        if (i2 != 1 && i2 != 2) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            if (!etwVar.e() && this.n == null) {
                this.l = Long.MIN_VALUE;
                return Unit.a;
            }
            w480Var.c = 2;
        } while (n0(w480Var) != y5bVar);
        return y5bVar;
    }

    public final Object s0(float f, Object obj, tje0 tje0Var) {
        if (0.0f > f || f > 1.0f) {
            mm20.a("Expecting fraction between 0 and 1. Got " + f);
        }
        dtg0<S> dtg0Var = this.e;
        if (dtg0Var == null) {
            return Unit.a;
        }
        Object objA = luw.a(this.k, new x480(obj, ((x5a0) this.b).getValue(), this, dtg0Var, f, null), tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    public final void t0() {
        dtg0<S> dtg0Var = this.e;
        if (dtg0Var == null) {
            return;
        }
        dtg0Var.n(ycv.c(((double) ((t5a0) this.h).j()) * ((Number) dtg0Var.l.getValue()).longValue()));
    }

    public final void u0(float f) {
        ((t5a0) this.h).A(f);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v0(x1b x1bVar) throws Throwable {
        z480 z480Var;
        Object value;
        Object obj;
        if (x1bVar instanceof z480) {
            z480Var = (z480) x1bVar;
            int i = z480Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                z480Var.d = i - Integer.MIN_VALUE;
            } else {
                z480Var = new z480(this, x1bVar);
            }
        } else {
            z480Var = new z480(this, x1bVar);
        }
        Object obj2 = z480Var.b;
        y5b y5bVar = y5b.a;
        int i2 = z480Var.d;
        tuw tuwVar = this.j;
        if (i2 == 0) {
            uj50.b(obj2);
            value = ((x5a0) this.b).getValue();
            z480Var.a = value;
            z480Var.d = 1;
            if (tuwVar.d(z480Var) != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            Object obj3 = z480Var.a;
            uj50.b(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = z480Var.a;
            uj50.b(obj2);
        }
        if (Intrinsics.g(obj2, obj)) {
            return Unit.a;
        }
        this.l = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        z480Var.a = value;
        z480Var.d = 2;
        bc6 bc6Var = new bc6(1, yzo.b(z480Var));
        bc6Var.q();
        this.i = bc6Var;
        tuwVar.f(null);
        Object objO = bc6Var.o();
        if (objO != y5bVar) {
            obj = value;
            obj2 = objO;
            if (Intrinsics.g(obj2, obj)) {
                return Unit.a;
            }
            this.l = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0086, please report this as an issue */
    public final Object w0(x1b x1bVar) throws Throwable {
        a580 a580Var;
        Object value;
        Object obj;
        if (x1bVar instanceof a580) {
            a580Var = (a580) x1bVar;
            int i = a580Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a580Var.d = i - Integer.MIN_VALUE;
            } else {
                a580Var = new a580(this, x1bVar);
            }
        } else {
            a580Var = new a580(this, x1bVar);
        }
        Object obj2 = a580Var.b;
        y5b y5bVar = y5b.a;
        int i2 = a580Var.d;
        tuw tuwVar = this.j;
        if (i2 == 0) {
            uj50.b(obj2);
            value = ((x5a0) this.b).getValue();
            a580Var.a = value;
            a580Var.d = 1;
            if (tuwVar.d(a580Var) != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            Object obj3 = a580Var.a;
            uj50.b(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = a580Var.a;
            uj50.b(obj2);
        }
        if (!Intrinsics.g(obj2, obj)) {
            this.l = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return Unit.a;
        if (!Intrinsics.g(value, this.d)) {
            a580Var.a = value;
            a580Var.d = 2;
            bc6 bc6Var = new bc6(1, yzo.b(a580Var));
            bc6Var.q();
            this.i = bc6Var;
            tuwVar.f(null);
            Object objO = bc6Var.o();
            if (objO != y5bVar) {
                obj = value;
                obj2 = objO;
                if (!Intrinsics.g(obj2, obj)) {
                    this.l = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return y5bVar;
        }
        tuwVar.f(null);
        return Unit.a;
    }
}
