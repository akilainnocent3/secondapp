package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {489}, m = "invokeSuspend")
public final class x480 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ u480<Object> d;
    public final /* synthetic */ dtg0<Object> e;
    public final /* synthetic */ float f;

    @c0d(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {511}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ u480<Object> e;
        public final /* synthetic */ dtg0<Object> f;
        public final /* synthetic */ float i;

        /* JADX INFO: renamed from: x480$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {507}, m = "invokeSuspend")
        public static final class C1274a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ u480<Object> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1274a(u480<Object> u480Var, v1b<? super C1274a> v1bVar) {
                super(2, v1bVar);
                this.b = u480Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1274a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1274a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    ij0 ij0Var = u480.r;
                    if (this.b.r0(this) == y5bVar) {
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
        public a(Object obj, Object obj2, u480<Object> u480Var, dtg0<Object> dtg0Var, float f, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = obj;
            this.d = obj2;
            this.e = u480Var;
            this.f = dtg0Var;
            this.i = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.i, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            u480<Object> u480Var = this.e;
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                Object obj2 = this.c;
                Object obj3 = this.d;
                if (Intrinsics.g(obj2, obj3)) {
                    u480Var.n = null;
                    if (Intrinsics.g(((x5a0) u480Var.c).getValue(), obj2)) {
                        return Unit.a;
                    }
                } else {
                    ij0 ij0Var = u480.r;
                    u480Var.p0();
                }
                boolean zG = Intrinsics.g(obj2, obj3);
                float f = this.i;
                if (!zG) {
                    dtg0<Object> dtg0Var = this.f;
                    dtg0Var.r(obj2);
                    dtg0Var.p(0L);
                    ((x5a0) u480Var.b).setValue(obj2);
                    dtg0Var.l(f);
                }
                ij0 ij0Var2 = u480.r;
                u480Var.u0(f);
                if (u480Var.m.e()) {
                    ej5.c(v5bVar, null, null, new C1274a(u480Var, null), 3);
                } else {
                    u480Var.l = Long.MIN_VALUE;
                }
                this.a = 1;
                if (u480Var.w0(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ij0 ij0Var3 = u480.r;
            u480Var.t0();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x480(Object obj, Object obj2, u480<Object> u480Var, dtg0<Object> dtg0Var, float f, v1b<? super x480> v1bVar) {
        super(1, v1bVar);
        this.b = obj;
        this.c = obj2;
        this.d = u480Var;
        this.e = dtg0Var;
        this.f = f;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new x480(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((x480) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(this.b, this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if (w5b.d(aVar, this) == y5bVar) {
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
