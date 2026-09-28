package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.components.JetAnimationKt$JetAnimation$2$1", f = "JetAnimation.kt", l = {}, m = "invokeSuspend", v = 1)
public final class u8p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ v5b a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ wd0<Float, ij0> e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float i;

    @c0d(c = "com.sportygames.sportyjet.components.JetAnimationKt$JetAnimation$2$1$1", f = "JetAnimation.kt", l = {122}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, float f, float f2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = f2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Float f = new Float(this.c + this.d);
                gzg0 gzg0VarE = yi0.e(530, 0, null, 6);
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

    @c0d(c = "com.sportygames.sportyjet.components.JetAnimationKt$JetAnimation$2$1$2", f = "JetAnimation.kt", l = {128}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd0<Float, ij0> wd0Var, float f, float f2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = f2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, v1bVar);
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
                Float f = new Float(this.c - (this.d * 0.1f));
                gzg0 gzg0VarE = yi0.e(530, 0, null, 6);
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
    public u8p(v5b v5bVar, wd0<Float, ij0> wd0Var, float f, float f2, wd0<Float, ij0> wd0Var2, float f3, float f4, v1b<? super u8p> v1bVar) {
        super(2, v1bVar);
        this.a = v5bVar;
        this.b = wd0Var;
        this.c = f;
        this.d = f2;
        this.e = wd0Var2;
        this.f = f3;
        this.i = f4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u8p(this.a, this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u8p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        a aVar = new a(this.b, this.c, this.d, null);
        v5b v5bVar = this.a;
        ej5.c(v5bVar, null, null, aVar, 3);
        ej5.c(v5bVar, null, null, new b(this.e, this.f, this.i, null), 3);
        return Unit.a;
    }
}
