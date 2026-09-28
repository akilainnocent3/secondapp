package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class c20<T> {
    public final zxc a;
    public final Function0<Float> b;
    public final d590 c;
    public final Function1<T, Boolean> d;
    public final ytw g;
    public final mae h;
    public final mae i;
    public final isw k;
    public final ytw l;
    public final ytw m;
    public final h20 n;
    public final zyo e = new zyo();
    public final k20 f = new k20(this);
    public final isw j = j.a(Float.NaN);

    @c0d(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {564}, m = "anchoredDrag")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ c20<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c20<T> c20Var, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.b = c20Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.b(null, null, null, this);
        }
    }

    @c0d(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {566}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ c20<T> b;
        public final /* synthetic */ T c;
        public final /* synthetic */ iaj<s00, m9f<T>, T, v1b<? super Unit>, Object> d;

        @c0d(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {568}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<Pair<? extends m9f<T>, ? extends T>, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ iaj<s00, m9f<T>, T, v1b<? super Unit>, Object> c;
            public final /* synthetic */ c20<T> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(iaj<? super s00, ? super m9f<T>, ? super T, ? super v1b<? super Unit>, ? extends Object> iajVar, c20<T> c20Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = iajVar;
                this.d = c20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, this.d, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
                return ((a) create((Pair) obj, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Pair pair = (Pair) this.b;
                    m9f<T> m9fVar = (m9f) pair.a;
                    B b = pair.b;
                    h20 h20Var = this.d.n;
                    this.a = 1;
                    if (this.c.d(h20Var, m9fVar, b, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c20<T> c20Var, T t, iaj<? super s00, ? super m9f<T>, ? super T, ? super v1b<? super Unit>, ? extends Object> iajVar, v1b<? super b> v1bVar) {
            super(1, v1bVar);
            this.b = c20Var;
            this.c = t;
            this.d = iajVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((b) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                T t = this.c;
                final c20<T> c20Var = this.b;
                c20Var.i(t);
                Function0 function0 = new Function0() { // from class: e20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        c20 c20Var2 = c20Var;
                        return new Pair(c20Var2.e(), c20Var2.h.getValue());
                    }
                };
                a aVar = new a(this.d, c20Var, null);
                this.a = 1;
                if (androidx.compose.material3.internal.a.b(function0, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public c20(k590 k590Var, zxc zxcVar, Function0 function0, d590 d590Var, Function1 function1) {
        this.a = zxcVar;
        this.b = function0;
        this.c = d590Var;
        this.d = function1;
        this.g = m.b(k590Var);
        int i = 0;
        this.h = a6a0.b(new r10(this, i));
        this.i = a6a0.b(new t10(this, i));
        new mae(new Function0() { // from class: v10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                c20 c20Var = this.a;
                float fD = c20Var.e().d(((x5a0) c20Var.g).getValue());
                float fD2 = c20Var.e().d(c20Var.i.getValue()) - fD;
                float fAbs = Math.abs(fD2);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fG = (c20Var.g() - fD) / fD2;
                    if (fG < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fG <= 0.999999f) {
                        f = fG;
                    }
                }
                return Float.valueOf(f);
            }
        }, bbe0.b);
        this.k = j.a(0.0f);
        this.l = m.b(null);
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.m = m.b(new bou(o2gVar));
        this.n = new h20(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(huw huwVar, j20 j20Var, x1b x1bVar) {
        x10 x10Var;
        if (x1bVar instanceof x10) {
            x10Var = (x10) x1bVar;
            int i = x10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x10Var.c = i - Integer.MIN_VALUE;
            } else {
                x10Var = new x10(this, x1bVar);
            }
        } else {
            x10Var = new x10(this, x1bVar);
        }
        Object obj = x10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = x10Var.c;
        Function1<T, Boolean> function1 = this.d;
        isw iswVar = this.j;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zyo zyoVar = this.e;
                a20 a20Var = new a20(this, null, j20Var);
                x10Var.c = 1;
                zyoVar.getClass();
                if (w5b.d(new azo(huwVar, zyoVar, a20Var, null), x10Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            iswVar = (t5a0) iswVar;
            T tC = e().c(iswVar.j());
            if (tC != null && Math.abs(iswVar.j() - e().d(tC)) <= 0.5f && function1.invoke(tC).booleanValue()) {
                h(tC);
            }
            return Unit.a;
        } catch (Throwable th) {
            t5a0 t5a0Var = (t5a0) iswVar;
            T tC2 = e().c(t5a0Var.j());
            if (tC2 != null && Math.abs(t5a0Var.j() - e().d(tC2)) <= 0.5f && function1.invoke(tC2).booleanValue()) {
                h(tC2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(T t, huw huwVar, iaj<? super s00, ? super m9f<T>, ? super T, ? super v1b<? super Unit>, ? extends Object> iajVar, v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, v1bVar);
            }
        } else {
            aVar = new a(this, v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        Function1<T, Boolean> function1 = this.d;
        isw iswVar = this.j;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                if (e().e(t)) {
                    zyo zyoVar = this.e;
                    b bVar = new b(this, t, iajVar, null);
                    aVar.c = 1;
                    zyoVar.getClass();
                    if (w5b.d(new azo(huwVar, zyoVar, bVar, null), aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    h(t);
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            i(null);
            iswVar = (t5a0) iswVar;
            T tC = e().c(iswVar.j());
            if (tC != null && Math.abs(iswVar.j() - e().d(tC)) <= 0.5f && function1.invoke(tC).booleanValue()) {
                h(tC);
            }
            return Unit.a;
        } catch (Throwable th) {
            i(null);
            t5a0 t5a0Var = (t5a0) iswVar;
            T tC2 = e().c(t5a0Var.j());
            if (tC2 != null && Math.abs(t5a0Var.j() - e().d(tC2)) <= 0.5f && function1.invoke(tC2).booleanValue()) {
                h(tC2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(float f, float f2, Object obj) {
        m9f<T> m9fVarE = e();
        float fD = m9fVarE.d(obj);
        float fFloatValue = this.b.invoke().floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            zxc zxcVar = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    T tB = m9fVarE.b(f, true);
                    tB.getClass();
                    return tB;
                }
                T tB2 = m9fVarE.b(f, true);
                tB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) zxcVar.invoke(Float.valueOf(Math.abs(m9fVarE.d(tB2) - fD)))).floatValue()) + fD)) {
                    return tB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    T tB3 = m9fVarE.b(f, false);
                    tB3.getClass();
                    return tB3;
                }
                T tB4 = m9fVarE.b(f, false);
                tB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) zxcVar.invoke(Float.valueOf(Math.abs(fD - m9fVarE.d(tB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return tB4;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        isw iswVar = this.j;
        t5a0 t5a0Var = (t5a0) iswVar;
        float fJ = Float.isNaN(t5a0Var.j()) ? 0.0f : t5a0Var.j();
        ((t5a0) iswVar).A(f2);
        return f2 - fJ;
    }

    public final m9f<T> e() {
        return (m9f) ((x5a0) this.m).getValue();
    }

    public final float f(float f) {
        t5a0 t5a0Var = (t5a0) this.j;
        return f.d((Float.isNaN(t5a0Var.j()) ? 0.0f : t5a0Var.j()) + f, e().f(), e().g());
    }

    public final float g() {
        isw iswVar = this.j;
        if (!Float.isNaN(((t5a0) iswVar).j())) {
            return ((t5a0) iswVar).j();
        }
        ib5.a("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void h(T t) {
        ((x5a0) this.g).setValue(t);
    }

    public final void i(T t) {
        ((x5a0) this.l).setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object j(float f, tje0 tje0Var) {
        Object value = ((x5a0) this.g).getValue();
        Object objC = c(g(), f, value);
        if (this.d.invoke((T) objC).booleanValue()) {
            Object objB = b(objC, huw.a, new d10(this, f, null), tje0Var);
            y5b y5bVar = y5b.a;
            if (objB != y5bVar) {
                objB = Unit.a;
            }
            return objB == y5bVar ? objB : Unit.a;
        }
        Object objB2 = b(value, huw.a, new d10(this, f, null), tje0Var);
        y5b y5bVar2 = y5b.a;
        if (objB2 != y5bVar2) {
            objB2 = Unit.a;
        }
        return objB2 == y5bVar2 ? objB2 : Unit.a;
    }
}
