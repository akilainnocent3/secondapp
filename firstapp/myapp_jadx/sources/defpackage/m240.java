package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.reaction.ReactionTrayKt$FloatingReaction$1$1", f = "ReactionTray.kt", l = {201}, m = "invokeSuspend", v = 1)
public final class m240 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ float d;
    public final /* synthetic */ wd0<Float, ij0> e;

    @c0d(c = "com.sportygames.piggybash.presentation.component.reaction.ReactionTrayKt$FloatingReaction$1$1$1", f = "ReactionTray.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ wd0<Float, ij0> d;

        /* JADX INFO: renamed from: m240$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.piggybash.presentation.component.reaction.ReactionTrayKt$FloatingReaction$1$1$1$1", f = "ReactionTray.kt", l = {203}, m = "invokeSuspend", v = 1)
        public static final class C0853a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ float c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0853a(wd0<Float, ij0> wd0Var, float f, v1b<? super C0853a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = f;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0853a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0853a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(-this.c);
                    gzg0 gzg0VarE = yi0.e(1800, 0, vkf.b, 2);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

        @c0d(c = "com.sportygames.piggybash.presentation.component.reaction.ReactionTrayKt$FloatingReaction$1$1$1$2", f = "ReactionTray.kt", l = {212}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wd0<Float, ij0> wd0Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(0.0f);
                    gzg0 gzg0VarE = yi0.e(1800, 0, null, 6);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
        public a(wd0<Float, ij0> wd0Var, float f, wd0<Float, ij0> wd0Var2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = wd0Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new C0853a(this.b, this.c, null), 3);
            return ej5.c(v5bVar, null, null, new b(this.d, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m240(Function0<Unit> function0, wd0<Float, ij0> wd0Var, float f, wd0<Float, ij0> wd0Var2, v1b<? super m240> v1bVar) {
        super(2, v1bVar);
        this.b = function0;
        this.c = wd0Var;
        this.d = f;
        this.e = wd0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m240(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m240) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(this.c, this.d, this.e, null);
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
        this.b.invoke();
        return Unit.a;
    }
}
