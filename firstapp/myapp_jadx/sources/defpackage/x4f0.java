package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
public final class x4f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u020 c;
    public final /* synthetic */ gaj<ip20, gly, v1b<? super Unit>, Object> d;
    public final /* synthetic */ Function1<gly, Unit> e;
    public final /* synthetic */ lp20 f;

    @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public jvd0 b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ v5b e;
        public final /* synthetic */ gaj<ip20, gly, v1b<? super Unit>, Object> f;
        public final /* synthetic */ Function1<gly, Unit> i;
        public final /* synthetic */ lp20 v;

        /* JADX INFO: renamed from: x4f0$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend")
        public static final class C1275a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ gaj<ip20, gly, v1b<? super Unit>, Object> b;
            public final /* synthetic */ lp20 c;
            public final /* synthetic */ m020 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1275a(gaj<? super ip20, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, lp20 lp20Var, m020 m020Var, v1b<? super C1275a> v1bVar) {
                super(2, v1bVar);
                this.b = gajVar;
                this.c = lp20Var;
                this.d = m020Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1275a(this.b, this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1275a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    gly glyVar = new gly(this.d.c);
                    this.a = 1;
                    if (this.b.invoke(this.c, glyVar, this) == y5bVar) {
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

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(lp20 lp20Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.e();
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(lp20 lp20Var, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.g();
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {249}, m = "invokeSuspend")
        public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ lp20 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(lp20 lp20Var, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.b = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new d(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (this.b.i(this) == y5bVar) {
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
        public a(v5b v5bVar, gaj<? super ip20, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, Function1<? super gly, Unit> function1, lp20 lp20Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = v5bVar;
            this.f = gajVar;
            this.i = function1;
            this.v = lp20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.e, this.f, this.i, this.v, v1bVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
            return ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code duplicated, block: B:24:0x007e  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jvd0 jvd0VarC;
            vp1 vp1Var;
            c9p c9pVar;
            m020 m020Var;
            y5b y5bVar = y5b.a;
            int i = this.c;
            v5b v5bVar = this.e;
            lp20 lp20Var = this.v;
            if (i == 0) {
                uj50.b(obj);
                vp1 vp1Var2 = (vp1) this.d;
                u4f0.a aVar = u4f0.a;
                jvd0VarC = ej5.c(v5bVar, null, a6b.d, new d(lp20Var, null), 1);
                this.d = vp1Var2;
                this.b = jvd0VarC;
                this.c = 1;
                Object objB = u4f0.b(vp1Var2, this, 3);
                if (objB != y5bVar) {
                    vp1Var = vp1Var2;
                    obj = objB;
                }
                return y5bVar;
            }
            if (i == 1) {
                jvd0VarC = this.b;
                vp1Var = (vp1) this.d;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c9pVar = (c9p) this.d;
                uj50.b(obj);
            }
            m020Var = (m020) obj;
            if (m020Var == null) {
                u4f0.f(v5bVar, c9pVar, new b(lp20Var, null));
            } else {
                m020Var.a();
                u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                this.i.invoke(new gly(m020Var.c));
            }
            return Unit.a;
            m020 m020Var2 = (m020) obj;
            m020Var2.a();
            u4f0.a aVar2 = u4f0.a;
            gaj<ip20, gly, v1b<? super Unit>, Object> gajVar = this.f;
            if (gajVar != aVar2) {
                u4f0.f(v5bVar, jvd0VarC, new C1275a(gajVar, lp20Var, m020Var2, null));
            }
            this.d = jvd0VarC;
            this.b = null;
            this.c = 2;
            obj = u4f0.h(vp1Var, c020.b, this);
            if (obj != y5bVar) {
                c9pVar = jvd0VarC;
                m020Var = (m020) obj;
                if (m020Var == null) {
                    u4f0.f(v5bVar, c9pVar, new b(lp20Var, null));
                } else {
                    m020Var.a();
                    u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                    this.i.invoke(new gly(m020Var.c));
                }
                return Unit.a;
            }
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x4f0(u020 u020Var, gaj<? super ip20, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, Function1<? super gly, Unit> function1, lp20 lp20Var, v1b<? super x4f0> v1bVar) {
        super(2, v1bVar);
        this.c = u020Var;
        this.d = gajVar;
        this.e = function1;
        this.f = lp20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x4f0 x4f0Var = new x4f0(this.c, this.d, this.e, this.f, v1bVar);
        x4f0Var.b = obj;
        return x4f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x4f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((v5b) this.b, this.d, this.e, this.f, null);
            this.a = 1;
            if (dqi.b(this.c, aVar, this) == y5bVar) {
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
