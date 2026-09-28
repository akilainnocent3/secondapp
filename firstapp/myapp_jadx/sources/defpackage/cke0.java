package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cke0 extends d.c implements yje0, u020, mmd {
    public Object D;
    public Object E;
    public Object[] F;
    public PointerInputEventHandler G;
    public jvd0 H;
    public b020 I = wje0.a;
    public final duw<a<?>> J;
    public final duw K;
    public final duw<a<?>> L;
    public b020 M;
    public long N;

    public final class a<R> implements vp1, mmd, v1b<R> {
        public final /* synthetic */ cke0 a;
        public final bc6 b;
        public bc6 c;
        public c020 d = c020.b;
        public final e e = e.a;

        public a(bc6 bc6Var) {
            this.a = cke0.this;
            this.b = bc6Var;
        }

        @Override // defpackage.mmd
        public final float C1(float f) {
            return this.a.getDensity() * f;
        }

        @Override // defpackage.mmd
        public final float D0(long j) {
            return this.a.D0(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.vp1
        public final Object E0(long j, Function2 function2, pz1 pz1Var) throws Throwable {
            zje0 zje0Var;
            Throwable th;
            jvd0 jvd0Var;
            bc6 bc6Var;
            if (pz1Var instanceof zje0) {
                zje0Var = (zje0) pz1Var;
                int i = zje0Var.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zje0Var.d = i - Integer.MIN_VALUE;
                } else {
                    zje0Var = new zje0(this, pz1Var);
                }
            } else {
                zje0Var = new zje0(this, pz1Var);
            }
            Object objInvoke = zje0Var.b;
            y5b y5bVar = y5b.a;
            int i2 = zje0Var.d;
            if (i2 != 0) {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jvd0Var = zje0Var.a;
                try {
                    uj50.b(objInvoke);
                    jvd0Var.cancel((CancellationException) rb6.a);
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    jvd0Var.cancel((CancellationException) rb6.a);
                    throw th;
                }
            }
            uj50.b(objInvoke);
            if (j <= 0 && (bc6Var = this.c) != null) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(new zi50.b(new e020(j)));
            }
            jvd0 jvd0VarC = ej5.c(cke0.this.d2(), null, null, new ake0(j, this, null), 3);
            try {
                zje0Var.a = jvd0VarC;
                zje0Var.d = 1;
                objInvoke = function2.invoke(this, zje0Var);
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
                jvd0Var = jvd0VarC;
                jvd0Var.cancel((CancellationException) rb6.a);
                return objInvoke;
            } catch (Throwable th3) {
                th = th3;
                jvd0Var = jvd0VarC;
                jvd0Var.cancel((CancellationException) rb6.a);
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.vp1
        public final Object G1(long j, v4f0 v4f0Var, v1b v1bVar) throws Throwable {
            bke0 bke0Var;
            if (v1bVar instanceof bke0) {
                bke0Var = (bke0) v1bVar;
                int i = bke0Var.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bke0Var.c = i - Integer.MIN_VALUE;
                } else {
                    bke0Var = new bke0(this, (pz1) v1bVar);
                }
            } else {
                bke0Var = new bke0(this, (pz1) v1bVar);
            }
            Object obj = bke0Var.a;
            y5b y5bVar = y5b.a;
            int i2 = bke0Var.c;
            try {
                if (i2 == 0) {
                    uj50.b(obj);
                    bke0Var.c = 1;
                    Object objE0 = E0(j, v4f0Var, bke0Var);
                    return objE0 == y5bVar ? y5bVar : objE0;
                }
                if (i2 == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            } catch (e020 unused) {
                return null;
            }
        }

        @Override // defpackage.mmd
        public final int I1(long j) {
            return this.a.I1(j);
        }

        @Override // defpackage.mmd
        public final long N(float f) {
            return this.a.N(f);
        }

        @Override // defpackage.mmd
        public final long O(long j) {
            return this.a.O(j);
        }

        @Override // defpackage.vp1
        public final b020 U0() {
            return cke0.this.I;
        }

        @Override // defpackage.mmd
        public final long U1(long j) {
            return this.a.U1(j);
        }

        @Override // defpackage.mmd
        public final float X(long j) {
            return this.a.X(j);
        }

        @Override // defpackage.vp1
        public final long a() {
            return cke0.this.N;
        }

        @Override // defpackage.mmd
        public final long g0(float f) {
            return this.a.g0(f);
        }

        @Override // defpackage.v1b
        public final CoroutineContext getContext() {
            return this.e;
        }

        @Override // defpackage.mmd
        public final float getDensity() {
            return this.a.getDensity();
        }

        @Override // defpackage.vp1
        public final z6i0 getViewConfiguration() {
            return pkd.f(cke0.this).P;
        }

        @Override // defpackage.vp1
        public final Object l1(c020 c020Var, v1b<? super b020> v1bVar) throws Throwable {
            bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
            bc6Var.q();
            this.d = c020Var;
            this.c = bc6Var;
            Object objO = bc6Var.o();
            y5b y5bVar = y5b.a;
            return objO;
        }

        @Override // defpackage.v1b
        public final void resumeWith(Object obj) {
            cke0 cke0Var = cke0.this;
            synchronized (cke0Var.K) {
                cke0Var.J.j(this);
                Unit unit = Unit.a;
            }
            this.b.resumeWith(obj);
        }

        @Override // defpackage.vp1
        public final long s0() {
            cke0 cke0Var = cke0.this;
            long jU1 = cke0Var.U1(pkd.f(cke0Var).P.f());
            long j = cke0Var.N;
            return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jU1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jU1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
        }

        @Override // defpackage.mmd
        public final float u1(int i) {
            return this.a.u1(i);
        }

        @Override // defpackage.mmd
        public final float v1(float f) {
            return f / this.a.getDensity();
        }

        @Override // defpackage.mmd
        public final int y0(float f) {
            return this.a.y0(f);
        }

        @Override // defpackage.mmd
        public final float y1() {
            return this.a.y1();
        }
    }

    public static final class b extends qlr implements Function1<Throwable, Unit> {
        public final /* synthetic */ a<R> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            a<R> aVar = this.a;
            bc6 bc6Var = aVar.c;
            if (bc6Var != null) {
                bc6Var.cancel(th2);
            }
            aVar.c = null;
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {718, 720}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return cke0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                cke0 cke0Var = cke0.this;
                PointerInputEventHandler pointerInputEventHandler = cke0Var.G;
                this.a = 2;
                if (pointerInputEventHandler.invoke(cke0Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1 && i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public cke0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.D = obj;
        this.E = obj2;
        this.F = objArr;
        this.G = pointerInputEventHandler;
        duw<a<?>> duwVar = new duw<>(new a[16]);
        this.J = duwVar;
        this.K = duwVar;
        this.L = new duw<>(new a[16]);
        this.N = 0L;
    }

    @Override // defpackage.yje0
    public final void O0() {
        jvd0 jvd0Var = this.H;
        if (jvd0Var != null) {
            jvd0Var.t(new t020("Pointer input was reset"));
            this.H = null;
        }
    }

    @Override // defpackage.s020
    public final void W(b020 b020Var, c020 c020Var, long j) {
        this.N = j;
        if (c020Var == c020.a) {
            this.I = b020Var;
        }
        if (this.H == null) {
            this.H = ej5.c(d2(), null, a6b.d, new c(null), 1);
        }
        p2(b020Var, c020Var);
        List<m020> list = b020Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!ovo.e(list.get(i))) {
                this.M = b020Var;
            }
        }
        b020Var = null;
        this.M = b020Var;
    }

    @Override // defpackage.s020
    public final void W1() {
        O0();
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return pkd.f(this).N.getDensity();
    }

    @Override // defpackage.u020
    public final z6i0 getViewConfiguration() {
        return pkd.f(this).P;
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        O0();
    }

    @Override // defpackage.s020
    public final void n1() {
        b020 b020Var = this.M;
        if (b020Var == null) {
            return;
        }
        List<m020> list = b020Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m020 m020Var = list.get(i2);
                    long j = m020Var.a;
                    long j2 = m020Var.c;
                    long j3 = m020Var.b;
                    float f = m020Var.e;
                    boolean z = m020Var.d;
                    arrayList.add(new m020(j, j3, j2, false, f, j3, j2, z, z, m020Var.i, 0L));
                }
                b020 b020Var2 = new b020(arrayList, null);
                this.I = b020Var2;
                p2(b020Var2, c020.a);
                p2(b020Var2, c020.b);
                p2(b020Var2, c020.c);
                this.M = null;
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0042, B:26:0x0045, B:28:0x004e, B:30:0x0056, B:32:0x005a), top: B:43:0x000d }] */
    public final void p2(b020 b020Var, c020 c020Var) {
        a<?>[] aVarArr;
        int i;
        int i2;
        a<?> aVar;
        bc6 bc6Var;
        bc6 bc6Var2;
        synchronized (this.K) {
            duw<a<?>> duwVar = this.L;
            duwVar.c(duwVar.c, this.J);
        }
        try {
            int iOrdinal = c020Var.ordinal();
            if (iOrdinal == 0) {
                duw<a<?>> duwVar2 = this.L;
                aVarArr = duwVar2.a;
                i = duwVar2.c;
                for (i2 = 0; i2 < i; i2++) {
                    aVar = aVarArr[i2];
                    if (c020Var != aVar.d && (bc6Var = aVar.c) != null) {
                        aVar.c = null;
                        zi50.a aVar2 = zi50.b;
                        bc6Var.resumeWith(b020Var);
                    }
                }
            } else if (iOrdinal == 1) {
                duw<a<?>> duwVar3 = this.L;
                int i3 = duwVar3.c - 1;
                a<?>[] aVarArr2 = duwVar3.a;
                if (i3 < aVarArr2.length) {
                    while (i3 >= 0) {
                        a<?> aVar3 = aVarArr2[i3];
                        if (c020Var == aVar3.d && (bc6Var2 = aVar3.c) != null) {
                            aVar3.c = null;
                            zi50.a aVar4 = zi50.b;
                            bc6Var2.resumeWith(b020Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new uwx();
                }
                duw<a<?>> duwVar4 = this.L;
                aVarArr = duwVar4.a;
                i = duwVar4.c;
                while (i2 < i) {
                    aVar = aVarArr[i2];
                    if (c020Var != aVar.d) {
                    }
                }
            }
            this.L.g();
        } catch (Throwable th) {
            this.L.g();
            throw th;
        }
    }

    @Override // defpackage.okd, defpackage.s020
    public final void x() {
        O0();
    }

    @Override // defpackage.u020
    public final <R> Object x0(Function2<? super vp1, ? super v1b<? super R>, ? extends Object> function2, v1b<? super R> v1bVar) {
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        a aVar = new a(bc6Var);
        synchronized (this.K) {
            this.J.b(aVar);
            nr60 nr60Var = new nr60(yzo.b(yzo.a(aVar, aVar, function2)), y5b.a);
            zi50.a aVar2 = zi50.b;
            nr60Var.resumeWith(Unit.a);
        }
        bc6Var.t(new b(aVar));
        return bc6Var.o();
    }

    @Override // defpackage.mmd
    public final float y1() {
        return pkd.f(this).N.y1();
    }
}
