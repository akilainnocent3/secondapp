package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sje0 {

    @c0d(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate")
    public static final class a<T, V extends mj0> extends x1b {
        public aj0 a;
        public mh0 b;
        public Function1 c;
        public dq40 d;
        public /* synthetic */ Object e;
        public int f;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return sje0.b(null, null, 0L, null, this);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object a(float f, float f2, float f3, xi0<Float> xi0Var, Function2<? super Float, ? super Float, Unit> function2, v1b<? super Unit> v1bVar) {
        g0h0 g0h0Var = gjs.b;
        Object f4 = new Float(f);
        Float f5 = new Float(f2);
        Object f6 = new Float(f3);
        Function1<T, V> function1 = g0h0Var.a;
        mj0 mj0VarC = (mj0) function1.invoke((T) f6);
        if (mj0VarC == null) {
            mj0VarC = ((mj0) function1.invoke((T) f4)).c();
        }
        mj0 mj0Var = mj0VarC;
        Object objB = b(new aj0(g0h0Var, f4, mj0Var, 56), new g5f0(xi0Var, g0h0Var, f4, f5, mj0Var), Long.MIN_VALUE, new d4y(function2, 2), v1bVar);
        y5b y5bVar = y5b.a;
        if (objB != y5bVar) {
            objB = Unit.a;
        }
        return objB == y5bVar ? objB : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, vi0] */
    public static final <T, V extends mj0> Object b(aj0<T, V> aj0Var, mh0<T, V> mh0Var, long j, final Function1<? super vi0<T, V>, Unit> function1, v1b<? super Unit> v1bVar) {
        a aVar;
        final dq40 dq40Var;
        final aj0<T, V> aj0Var2;
        aj0<T, V> aj0Var3;
        dq40 dq40Var2;
        Object objP;
        Function1<? super vi0<T, V>, Unit> function2;
        vi0 vi0Var;
        vi0 vi0Var2;
        Object objP2;
        final mh0<T, V> mh0Var2 = mh0Var;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.e;
        y5b y5bVar = y5b.a;
        int i2 = aVar2.f;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(obj);
            final T tF = mh0Var2.f(0L);
            final mj0 mj0VarB = mh0Var2.b(0L);
            dq40Var = new dq40();
            if (j == Long.MIN_VALUE) {
                try {
                    final float fH = h(aVar2.getContext());
                    aj0Var2 = aj0Var;
                    try {
                        Function1 function3 = new Function1() { // from class: pje0
                            /* JADX WARN: Type inference failed for: r0v0, types: [T, vi0] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                mh0 mh0Var3 = mh0Var2;
                                f0h0 f0h0VarE = mh0Var3.e();
                                Object objG = mh0Var3.g();
                                aj0 aj0Var4 = aj0Var2;
                                ?? vi0Var3 = new vi0(tF, f0h0VarE, mj0VarB, jLongValue, objG, jLongValue, new w3f(aj0Var4, 1));
                                sje0.g(vi0Var3, jLongValue, fH, mh0Var3, aj0Var4, function1);
                                dq40Var.a = vi0Var3;
                                return Unit.a;
                            }
                        };
                        dq40Var2 = dq40Var;
                        try {
                            aVar2.a = aj0Var2;
                            aVar2.b = mh0Var2;
                            aVar2.c = function1;
                            aVar2.d = dq40Var2;
                            aVar2.f = 1;
                            if (mh0Var2.a()) {
                                objP = bgn.a(function3, aVar2);
                            } else {
                                objP = t4w.a(aVar2.getContext()).P(new jza0(function3, i3), aVar2);
                            }
                            if (objP != y5bVar) {
                                aj0Var3 = aj0Var2;
                                function2 = function1;
                                dq40Var = dq40Var2;
                            }
                            return y5bVar;
                        } catch (CancellationException e) {
                            e = e;
                            aj0Var3 = aj0Var2;
                            dq40Var = dq40Var2;
                            vi0Var = (vi0) dq40Var.a;
                            if (vi0Var != null) {
                                ((x5a0) vi0Var.i).setValue(Boolean.FALSE);
                            }
                            vi0Var2 = (vi0) dq40Var.a;
                            if (vi0Var2 != null) {
                                aj0Var3.f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        aj0Var3 = aj0Var2;
                        vi0Var = (vi0) dq40Var.a;
                        if (vi0Var != null) {
                            ((x5a0) vi0Var.i).setValue(Boolean.FALSE);
                        }
                        vi0Var2 = (vi0) dq40Var.a;
                        if (vi0Var2 != null) {
                            aj0Var3.f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    aj0Var2 = aj0Var;
                }
            } else {
                dq40Var2 = dq40Var;
                try {
                    ?? r12 = (T) new vi0(tF, mh0Var2.e(), mj0VarB, j, mh0Var2.g(), j, new s3f(aj0Var, 2));
                    g(r12, j, h(aVar2.getContext()), mh0Var2, aj0Var, function1);
                    dq40Var2.a = r12;
                    aj0Var3 = aj0Var;
                    mh0Var2 = mh0Var;
                    function2 = function1;
                    dq40Var = dq40Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    aj0Var3 = aj0Var;
                    dq40Var = dq40Var2;
                    vi0Var = (vi0) dq40Var.a;
                    if (vi0Var != null) {
                        ((x5a0) vi0Var.i).setValue(Boolean.FALSE);
                    }
                    vi0Var2 = (vi0) dq40Var.a;
                    if (vi0Var2 != null && vi0Var2.g == aj0Var3.d) {
                        aj0Var3.f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = aVar2.d;
            function2 = aVar2.c;
            mh0Var2 = aVar2.b;
            aj0Var3 = aVar2.a;
            try {
                uj50.b(obj);
            } catch (CancellationException e5) {
                e = e5;
                vi0Var = (vi0) dq40Var.a;
                if (vi0Var != null) {
                    ((x5a0) vi0Var.i).setValue(Boolean.FALSE);
                }
                vi0Var2 = (vi0) dq40Var.a;
                if (vi0Var2 != null) {
                    aj0Var3.f = false;
                }
                throw e;
            }
        }
        do {
            T t = dq40Var.a;
            t.getClass();
            if (!((Boolean) ((x5a0) ((vi0) t).i).getValue()).booleanValue()) {
                return Unit.a;
            }
            final float fH2 = h(aVar2.getContext());
            final dq40 dq40Var3 = dq40Var;
            final Function1<? super vi0<T, V>, Unit> function4 = function2;
            final mh0<T, V> mh0Var3 = mh0Var2;
            final aj0<T, V> aj0Var4 = aj0Var3;
            try {
                Function1 function5 = new Function1() { // from class: qje0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        T t2 = dq40Var3.a;
                        t2.getClass();
                        sje0.g((vi0) t2, jLongValue, fH2, mh0Var3, aj0Var4, function4);
                        return Unit.a;
                    }
                };
                dq40Var = dq40Var3;
                mh0Var2 = mh0Var3;
                aj0Var3 = aj0Var4;
                function2 = function4;
                aVar2.a = aj0Var3;
                aVar2.b = mh0Var2;
                aVar2.c = function2;
                aVar2.d = dq40Var;
                aVar2.f = 2;
                if (mh0Var2.a()) {
                    objP2 = bgn.a(function5, aVar2);
                } else {
                    objP2 = t4w.a(aVar2.getContext()).P(new jza0(function5, i3), aVar2);
                }
            } catch (CancellationException e6) {
                e = e6;
                dq40Var = dq40Var3;
                aj0Var3 = aj0Var4;
                vi0Var = (vi0) dq40Var.a;
                if (vi0Var != null) {
                    ((x5a0) vi0Var.i).setValue(Boolean.FALSE);
                }
                vi0Var2 = (vi0) dq40Var.a;
                if (vi0Var2 != null) {
                    aj0Var3.f = false;
                }
                throw e;
            }
        } while (objP2 != y5bVar);
        return y5bVar;
    }

    public static /* synthetic */ Object c(float f, float f2, float f3, xi0 xi0Var, Function2 function2, v1b v1bVar, int i) {
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            xi0Var = yi0.d(0.0f, 0.0f, null, 7);
        }
        return a(f, f2, f3, xi0Var, function2, v1bVar);
    }

    public static final Object d(aj0 aj0Var, h4d h4dVar, boolean z, Function1 function1, x1b x1bVar) {
        Object objB = b(aj0Var, new g4d(h4dVar, aj0Var.a, ((x5a0) aj0Var.b).getValue(), aj0Var.c), z ? aj0Var.d : Long.MIN_VALUE, function1, x1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    public static final Object e(aj0 aj0Var, Float f, xi0 xi0Var, boolean z, Function1 function1, x1b x1bVar) {
        Object objB = b(aj0Var, new g5f0(xi0Var, aj0Var.a, ((x5a0) aj0Var.b).getValue(), f, aj0Var.c), z ? aj0Var.d : Long.MIN_VALUE, function1, x1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    public static /* synthetic */ Object f(aj0 aj0Var, Float f, xi0 xi0Var, boolean z, Function1 function1, x1b x1bVar, int i) {
        if ((i & 2) != 0) {
            xi0Var = yi0.d(0.0f, 0.0f, null, 7);
        }
        xi0 xi0Var2 = xi0Var;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new rje0();
        }
        return e(aj0Var, f, xi0Var2, z2, function1, x1bVar);
    }

    public static final <T, V extends mj0> void g(vi0<T, V> vi0Var, long j, float f, mh0<T, V> mh0Var, aj0<T, V> aj0Var, Function1<? super vi0<T, V>, Unit> function1) {
        long jD = f == 0.0f ? mh0Var.d() : (long) ((j - vi0Var.c) / f);
        vi0Var.g = j;
        ((x5a0) vi0Var.e).setValue(mh0Var.f(jD));
        vi0Var.f = (V) mh0Var.b(jD);
        if (mh0Var.c(jD)) {
            vi0Var.h = vi0Var.g;
            ((x5a0) vi0Var.i).setValue(Boolean.FALSE);
        }
        i(vi0Var, aj0Var);
        function1.invoke(vi0Var);
    }

    public static final float h(CoroutineContext coroutineContext) {
        o5w o5wVar = (o5w) coroutineContext.get(o5w.a.a);
        float fG = o5wVar != null ? o5wVar.g() : 1.0f;
        if (fG >= 0.0f) {
            return fG;
        }
        mm20.b("negative scale factor");
        return fG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, V extends mj0> void i(vi0<T, V> vi0Var, aj0<T, V> aj0Var) {
        ((x5a0) aj0Var.b).setValue(((x5a0) vi0Var.e).getValue());
        V v = aj0Var.c;
        V v2 = vi0Var.f;
        int iB = v.b();
        for (int i = 0; i < iB; i++) {
            v.e(i, v2.a(i));
        }
        aj0Var.e = vi0Var.h;
        aj0Var.d = vi0Var.g;
        aj0Var.f = ((Boolean) ((x5a0) vi0Var.i).getValue()).booleanValue();
    }
}
