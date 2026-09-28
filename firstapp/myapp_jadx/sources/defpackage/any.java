package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {121}, m = "invokeSuspend")
public final class any extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public yp40 a;
    public int b;
    public final /* synthetic */ qm20 c;
    public final /* synthetic */ Function2<lyh<sr1>, v1b<? super Unit>, Object> d;
    public final /* synthetic */ bny e;

    @c0d(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<myh<? super sr1>, Throwable, v1b<? super Unit>, Object> {
        public final /* synthetic */ yp40 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yp40 yp40Var, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.a = yp40Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super sr1> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new a(this.a, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.a = true;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public any(qm20 qm20Var, Function2 function2, bny bnyVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = qm20Var;
        this.d = function2;
        this.e = bnyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new any(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((any) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        yp40 yp40Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (this.c.a) {
                yp40 yp40Var2 = new yp40();
                wzh wzhVar = new wzh(izh.a(this.e.b), new a(yp40Var2, null));
                this.a = yp40Var2;
                this.b = 1;
                if (this.d.invoke(wzhVar, this) == y5bVar) {
                    return y5bVar;
                }
                yp40Var = yp40Var2;
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yp40Var = this.a;
        uj50.b(obj);
        if (!yp40Var.a) {
            ib5.a("You must collect the progress flow");
            return null;
        }
        return Unit.a;
    }
}
