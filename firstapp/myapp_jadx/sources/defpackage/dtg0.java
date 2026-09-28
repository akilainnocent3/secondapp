package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.j;
import androidx.compose.runtime.l;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dtg0<S> {
    public final o a;
    public final dtg0<?> b;
    public final String c;
    public final ytw d;
    public final ytw e;
    public final xsw f;
    public final xsw g;
    public final ytw h;
    public final SnapshotStateList<dtg0<S>.d<?, ?>> i;
    public final SnapshotStateList<dtg0<?>> j;
    public final ytw k;
    public final mae l;

    public final class a<T, V extends mj0> {
        public final g0h0 a;
        public final ytw b = m.b(null);

        /* JADX INFO: renamed from: dtg0$a$a, reason: collision with other inner class name */
        public final class C0505a<T, V extends mj0> implements twd0<T> {
            public final dtg0<S>.d<T, V> a;
            public Function1<? super b<S>, ? extends goh<T>> b;
            public Function1<? super S, ? extends T> c;

            public C0505a(dtg0<S>.d<T, V> dVar, Function1<? super b<S>, ? extends goh<T>> function1, Function1<? super S, ? extends T> function2) {
                this.a = dVar;
                this.b = function1;
                this.c = function2;
            }

            public final void b(b<S> bVar) {
                T tInvoke = this.c.invoke(bVar.a());
                boolean zI = dtg0.this.i();
                dtg0<S>.d<T, V> dVar = this.a;
                if (zI) {
                    dVar.l(this.c.invoke(bVar.c()), tInvoke, this.b.invoke(bVar));
                } else {
                    dVar.m(tInvoke, this.b.invoke(bVar));
                }
            }

            @Override // defpackage.twd0
            public final T getValue() {
                b(dtg0.this.f());
                return (T) ((x5a0) this.a.y).getValue();
            }
        }

        public a(g0h0 g0h0Var, String str) {
            this.a = g0h0Var;
        }

        public final C0505a a(Function1 function1, Function1 function2) {
            ytw ytwVar = this.b;
            C0505a c0505a = (C0505a) ((x5a0) ytwVar).getValue();
            dtg0<S> dtg0Var = dtg0.this;
            if (c0505a == null) {
                Object objInvoke = function2.invoke(dtg0Var.a.V());
                Object objInvoke2 = function2.invoke(dtg0Var.a.V());
                g0h0 g0h0Var = this.a;
                mj0 mj0Var = (mj0) g0h0Var.a().invoke(objInvoke2);
                mj0Var.d();
                dtg0<S>.d<?, ?> dVar = dtg0Var.new d<>(objInvoke, mj0Var, g0h0Var);
                c0505a = new C0505a(dVar, function1, function2);
                ((x5a0) ytwVar).setValue(c0505a);
                dtg0Var.i.add(dVar);
            }
            c0505a.c = function2;
            c0505a.b = function1;
            c0505a.b(dtg0Var.f());
            return c0505a;
        }
    }

    public interface b<S> {
        S a();

        S c();

        default boolean d(S s, S s2) {
            return s.equals(c()) && s2.equals(a());
        }
    }

    public static final class c<S> implements b<S> {
        public final S a;
        public final S b;

        public c(S s, S s2) {
            this.a = s;
            this.b = s2;
        }

        @Override // dtg0.b
        public final S a() {
            return this.b;
        }

        @Override // dtg0.b
        public final S c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.c()) && Intrinsics.g(this.b, bVar.a());
        }

        public final int hashCode() {
            S s = this.a;
            int iHashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.b;
            return iHashCode + (s2 != null ? s2.hashCode() : 0);
        }
    }

    public final class d<T, V extends mj0> implements twd0<T> {
        public final xsw A;
        public boolean B;
        public final fkd0 C;
        public final f0h0<T, V> a;
        public final ytw b;
        public final ytw c;
        public final ytw d;
        public u480.a e;
        public g5f0<T, V> f;
        public final ytw i;
        public final isw v;
        public boolean w;
        public final ytw y;
        public V z;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, mj0 mj0Var, f0h0 f0h0Var) {
            this.a = f0h0Var;
            ytw ytwVarB = m.b(obj);
            this.b = ytwVarB;
            T tInvoke = null;
            ytw ytwVarB2 = m.b(yi0.d(0.0f, 0.0f, null, 7));
            this.c = ytwVarB2;
            this.d = m.b(new g5f0((goh) ((x5a0) ytwVarB2).getValue(), f0h0Var, obj, ((x5a0) ytwVarB).getValue(), mj0Var));
            this.i = m.b(Boolean.TRUE);
            this.v = j.a(-1.0f);
            this.y = m.b(obj);
            this.z = mj0Var;
            this.A = l.a(b().d());
            Float f = mni0.b.get(f0h0Var);
            if (f != null) {
                float fFloatValue = f.floatValue();
                V vInvoke = f0h0Var.a().invoke(obj);
                int iB = vInvoke.b();
                for (int i = 0; i < iB; i++) {
                    vInvoke.e(i, fFloatValue);
                }
                tInvoke = this.a.b().invoke(vInvoke);
            }
            this.C = yi0.d(0.0f, 0.0f, tInvoke, 3);
        }

        public final g5f0<T, V> b() {
            return (g5f0) ((x5a0) this.d).getValue();
        }

        public final void c(long j) {
            if (this.v.j() == -1.0f) {
                this.B = true;
                if (Intrinsics.g(b().c, b().d)) {
                    d(b().c);
                } else {
                    d(b().f(j));
                    this.z = (V) b().b(j);
                }
            }
        }

        public final void d(T t) {
            this.y.setValue(t);
        }

        public final void f(T t, boolean z) {
            g5f0<T, V> g5f0Var = this.f;
            T t2 = g5f0Var != null ? g5f0Var.c : null;
            x5a0 x5a0Var = (x5a0) this.b;
            boolean zG = Intrinsics.g(t2, x5a0Var.getValue());
            xsw xswVar = this.A;
            ytw ytwVar = this.d;
            if (zG) {
                ((x5a0) ytwVar).setValue(new g5f0(this.C, this.a, t, t, this.z.c()));
                this.w = true;
                ((v5a0) xswVar).K(b().d());
                return;
            }
            ytw ytwVar2 = this.c;
            goh gohVar = (!z || this.B || (((goh) ((x5a0) ytwVar2).getValue()) instanceof fkd0)) ? (goh) ((x5a0) ytwVar2).getValue() : this.C;
            dtg0<S> dtg0Var = dtg0.this;
            long jE = dtg0Var.e();
            ytw ytwVar3 = dtg0Var.h;
            ((x5a0) ytwVar).setValue(new g5f0(jE <= 0 ? gohVar : new cwd0(gohVar, dtg0Var.e()), this.a, t, x5a0Var.getValue(), this.z));
            ((v5a0) xswVar).K(b().d());
            this.w = false;
            ((x5a0) ytwVar3).setValue(Boolean.TRUE);
            if (dtg0Var.i()) {
                SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = dtg0Var.i;
                int size = snapshotStateList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    dtg0<S>.d<?, ?> dVar = snapshotStateList.get(i);
                    jMax = Math.max(jMax, ((v5a0) dVar.A).u());
                    dVar.c(0L);
                }
                ((x5a0) ytwVar3).setValue(Boolean.FALSE);
            }
        }

        @Override // defpackage.twd0
        public final T getValue() {
            return (T) ((x5a0) this.y).getValue();
        }

        public final void l(T t, T t2, goh<T> gohVar) {
            ((x5a0) this.b).setValue(t2);
            ((x5a0) this.c).setValue(gohVar);
            if (Intrinsics.g(b().d, t) && Intrinsics.g(b().c, t2)) {
                return;
            }
            f(t, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void m(T t, goh<T> gohVar) {
            if (this.w) {
                g5f0<T, V> g5f0Var = this.f;
                if (Intrinsics.g(t, g5f0Var != null ? g5f0Var.c : null)) {
                    return;
                }
            }
            ytw ytwVar = this.b;
            boolean zG = Intrinsics.g(((x5a0) ytwVar).getValue(), t);
            isw iswVar = this.v;
            if (zG && ((t5a0) iswVar).j() == -1.0f) {
                return;
            }
            ((x5a0) ytwVar).setValue(t);
            ((x5a0) this.c).setValue(gohVar);
            t5a0 t5a0Var = (t5a0) iswVar;
            Object value = t5a0Var.j() == -3.0f ? t : ((x5a0) this.y).getValue();
            ytw ytwVar2 = this.i;
            f(value, !((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue());
            ((x5a0) ytwVar2).setValue(Boolean.valueOf(t5a0Var.j() == -3.0f));
            if (t5a0Var.j() >= 0.0f) {
                d(b().f((long) (t5a0Var.j() * b().d())));
            } else if (t5a0Var.j() == -3.0f) {
                d(t);
            }
            this.w = false;
            ((t5a0) iswVar).A(-1.0f);
        }

        public final String toString() {
            return "current value: " + ((x5a0) this.y).getValue() + ", target: " + ((x5a0) this.b).getValue() + QQWMbKFOuTf.jWzbrdHgVIT + ((goh) ((x5a0) this.c).getValue());
        }
    }

    @c0d(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1202}, m = "invokeSuspend")
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public float a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ dtg0<S> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(dtg0<S> dtg0Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.d = dtg0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.d, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            final float fH;
            v5b v5bVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar2 = (v5b) this.c;
                fH = sje0.h(v5bVar2.getCoroutineContext());
                v5bVar = v5bVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fH = this.a;
                v5bVar = (v5b) this.c;
                uj50.b(obj);
            }
            while (w5b.e(v5bVar)) {
                final dtg0<S> dtg0Var = this.d;
                Function1 function1 = new Function1() { // from class: ktg0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        dtg0 dtg0Var2 = dtg0Var;
                        boolean zI = dtg0Var2.i();
                        xsw xswVar = dtg0Var2.g;
                        if (!zI) {
                            v5a0 v5a0Var = (v5a0) xswVar;
                            if (v5a0Var.u() == Long.MIN_VALUE) {
                                ((v5a0) xswVar).K(jLongValue);
                                ((x5a0) ((ytw) dtg0Var2.a.a)).setValue(Boolean.TRUE);
                            }
                            long jU = jLongValue - v5a0Var.u();
                            float f = fH;
                            if (f != 0.0f) {
                                jU = ycv.c(jU / ((double) f));
                            }
                            dtg0Var2.p(jU);
                            dtg0Var2.j(jU, f == 0.0f);
                        }
                        return Unit.a;
                    }
                };
                this.c = v5bVar;
                this.a = fH;
                this.b = 1;
                if (t4w.a(getContext()).P(function1, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
    }

    public dtg0() {
        throw null;
    }

    public dtg0(o oVar, dtg0<?> dtg0Var, String str) {
        this.a = oVar;
        this.b = dtg0Var;
        this.c = str;
        this.d = m.b(oVar.V());
        this.e = m.b(new c(oVar.V(), oVar.V()));
        this.f = l.a(0L);
        this.g = l.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.h = m.b(bool);
        this.i = new SnapshotStateList<>();
        this.j = new SnapshotStateList<>();
        this.k = m.b(bool);
        this.l = a6a0.b(new mic0(this, 1));
        oVar.e0(this);
    }

    public final void a(final S s, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object obj;
        androidx.compose.runtime.b bVarI = aVar.i(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(s) : bVarI.A(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(this) ? 32 : 16;
        }
        int i3 = 1;
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.G();
        } else if (i()) {
            bVarI.N(467781377);
            bVarI.X(false);
        } else {
            bVarI.N(466120769);
            r(s);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            Object obj2 = objY;
            if (z || objY == c0042a) {
                mae maeVarB = a6a0.b(new emh(this, i3));
                bVarI.r(maeVarB);
                obj2 = maeVarB;
            }
            if (((Boolean) ((twd0) obj2).getValue()).booleanValue()) {
                bVarI.N(466528884);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    obj = objY2;
                    v5b v5bVarI = xvf.i(kotlin.coroutines.e.a, bVarI);
                    bVarI.r(v5bVarI);
                    obj = v5bVarI;
                }
                obj = objY2;
                final v5b v5bVar = (v5b) obj;
                int i5 = (bVarI.A(v5bVar) ? 1 : 0) | (i4 != 32 ? 0 : 1);
                Object objY3 = bVarI.y();
                Object obj3 = objY3;
                if (i5 != 0 || objY3 == c0042a) {
                    Function1 function1 = new Function1() { // from class: zsg0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            ej5.c(v5bVar, null, a6b.d, new dtg0.e(this, null), 1);
                            return new dtg0.f();
                        }
                    };
                    bVarI.r(function1);
                    obj3 = function1;
                }
                xvf.a(v5bVar, this, (Function1) obj3, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(467771457);
                bVarI.X(false);
            }
            bVarI.X(false);
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: atg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    int iA = qj40.a(i | 1);
                    this.a.a(s, (a) obj4, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final long b() {
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((v5a0) snapshotStateList.get(i).A).u());
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i2).b());
        }
        return jMax;
    }

    public final void c() {
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            dtg0<S>.d<?, ?> dVar = snapshotStateList.get(i);
            dVar.f = null;
            dVar.e = null;
            dVar.w = false;
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).c();
        }
    }

    public final boolean d() {
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).e != null) {
                return true;
            }
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (snapshotStateList2.get(i2).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        dtg0<?> dtg0Var = this.b;
        return dtg0Var != null ? dtg0Var.e() : this.f.u();
    }

    public final b<S> f() {
        return (b) ((x5a0) this.e).getValue();
    }

    public final S g() {
        return (S) ((x5a0) this.d).getValue();
    }

    public final boolean h() {
        return ((v5a0) this.g).u() != Long.MIN_VALUE;
    }

    public final boolean i() {
        return ((Boolean) ((x5a0) this.k).getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [V extends mj0, mj0] */
    public final void j(long j, boolean z) {
        xsw xswVar = this.g;
        long jU = ((v5a0) xswVar).u();
        o oVar = this.a;
        if (jU == Long.MIN_VALUE) {
            ((v5a0) xswVar).K(j);
            ((x5a0) ((ytw) oVar.a)).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((x5a0) ((ytw) oVar.a)).getValue()).booleanValue()) {
            ((x5a0) ((ytw) oVar.a)).setValue(Boolean.TRUE);
        }
        ((x5a0) this.h).setValue(Boolean.FALSE);
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            dtg0<S>.d<?, ?> dVar = snapshotStateList.get(i);
            ytw ytwVar = dVar.i;
            ytw ytwVar2 = dVar.i;
            if (!((Boolean) ((x5a0) ytwVar).getValue()).booleanValue()) {
                long jD = z ? dVar.b().d() : j;
                dVar.d(dVar.b().f(jD));
                dVar.z = dVar.b().b(jD);
                if (dVar.b().c(jD)) {
                    ((x5a0) ytwVar2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dtg0<?> dtg0Var = snapshotStateList2.get(i2);
            ytw ytwVar3 = dtg0Var.d;
            o oVar2 = dtg0Var.a;
            if (!Intrinsics.g(((x5a0) ytwVar3).getValue(), oVar2.V())) {
                dtg0Var.j(j, z);
            }
            if (!Intrinsics.g(((x5a0) dtg0Var.d).getValue(), oVar2.V())) {
                z2 = false;
            }
        }
        if (z2) {
            k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        ((v5a0) this.g).K(Long.MIN_VALUE);
        o oVar = this.a;
        if (oVar instanceof cuw) {
            ((cuw) oVar).d0(((x5a0) this.d).getValue());
        }
        p(0L);
        ((x5a0) ((ytw) oVar.a)).setValue(Boolean.FALSE);
        SnapshotStateList<dtg0<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(float f2) {
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            dtg0<S>.d<?, ?> dVar = snapshotStateList.get(i);
            dVar.getClass();
            if (f2 == -4.0f || f2 == -5.0f) {
                g5f0<?, V> g5f0Var = dVar.f;
                if (g5f0Var != 0) {
                    dVar.b().h(g5f0Var.c);
                    dVar.e = null;
                    dVar.f = null;
                }
                Object obj = f2 == -4.0f ? dVar.b().d : dVar.b().c;
                dVar.b().h(obj);
                dVar.b().i(obj);
                dVar.d(obj);
                ((v5a0) dVar.A).K(dVar.b().d());
            } else {
                ((t5a0) dVar.v).A(f2);
            }
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).l(f2);
        }
    }

    public final void m(Object obj, Object obj2) {
        ((v5a0) this.g).K(Long.MIN_VALUE);
        o oVar = this.a;
        ((x5a0) ((ytw) oVar.a)).setValue(Boolean.FALSE);
        boolean zI = i();
        ytw ytwVar = this.d;
        if (!zI || !Intrinsics.g(oVar.V(), obj) || !Intrinsics.g(((x5a0) ytwVar).getValue(), obj2)) {
            if (!Intrinsics.g(oVar.V(), obj) && (oVar instanceof cuw)) {
                ((cuw) oVar).d0(obj);
            }
            ((x5a0) ytwVar).setValue(obj2);
            ((x5a0) this.k).setValue(Boolean.TRUE);
            ((x5a0) this.e).setValue(new c(obj, obj2));
        }
        SnapshotStateList<dtg0<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            dtg0<?> dtg0Var = snapshotStateList.get(i);
            dtg0Var.getClass();
            if (dtg0Var.i()) {
                dtg0Var.m(dtg0Var.a.V(), ((x5a0) dtg0Var.d).getValue());
            }
        }
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).c(0L);
        }
    }

    public final void n(long j) {
        xsw xswVar = this.g;
        if (((v5a0) xswVar).u() == Long.MIN_VALUE) {
            ((v5a0) xswVar).K(j);
        }
        p(j);
        ((x5a0) this.h).setValue(Boolean.FALSE);
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).c(j);
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dtg0<?> dtg0Var = snapshotStateList2.get(i2);
            if (!Intrinsics.g(((x5a0) dtg0Var.d).getValue(), dtg0Var.a.V())) {
                dtg0Var.n(j);
            }
        }
    }

    public final void o(u480.a aVar) {
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            dtg0<S>.d<?, ?> dVar = snapshotStateList.get(i);
            ytw ytwVar = dVar.y;
            if (!Intrinsics.g(dVar.b().c, dVar.b().d)) {
                dVar.f = dVar.b();
                dVar.e = aVar;
            }
            x5a0 x5a0Var = (x5a0) ytwVar;
            ((x5a0) dVar.d).setValue(new g5f0(dVar.C, dVar.a, x5a0Var.getValue(), x5a0Var.getValue(), dVar.z.c()));
            ((v5a0) dVar.A).K(dVar.b().d());
            dVar.w = true;
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).o(aVar);
        }
    }

    public final void p(long j) {
        if (this.b == null) {
            ((v5a0) this.f).K(j);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q() {
        mh0 mh0Var;
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            dtg0<S>.d<?, ?> dVar = snapshotStateList.get(i);
            u480.a aVar = dVar.e;
            if (aVar != null && (mh0Var = dVar.f) != null) {
                long jC = ycv.c(aVar.g * ((double) aVar.d));
                Object objF = mh0Var.f(jC);
                if (dVar.w) {
                    dVar.b().i(objF);
                }
                dVar.b().h(objF);
                ((v5a0) dVar.A).K(dVar.b().d());
                if (((t5a0) dVar.v).j() == -2.0f || dVar.w) {
                    dVar.d(objF);
                } else {
                    dVar.c(dtg0.this.e());
                }
                if (jC >= aVar.g) {
                    dVar.e = null;
                    dVar.f = null;
                } else {
                    aVar.c = false;
                }
            }
        }
        SnapshotStateList<dtg0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).q();
        }
    }

    public final void r(S s) {
        ytw ytwVar = this.d;
        x5a0 x5a0Var = (x5a0) ytwVar;
        if (Intrinsics.g(x5a0Var.getValue(), s)) {
            return;
        }
        ((x5a0) this.e).setValue(new c(x5a0Var.getValue(), s));
        o oVar = this.a;
        if (!Intrinsics.g(oVar.V(), x5a0Var.getValue())) {
            oVar.d0(x5a0Var.getValue());
        }
        ((x5a0) ytwVar).setValue(s);
        if (!h()) {
            ((x5a0) this.h).setValue(Boolean.TRUE);
        }
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((t5a0) snapshotStateList.get(i).v).A(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + snapshotStateList.get(i) + ", ";
        }
        return str;
    }

    public static final class f implements tse {
        @Override // defpackage.tse
        public final void dispose() {
        }
    }
}
