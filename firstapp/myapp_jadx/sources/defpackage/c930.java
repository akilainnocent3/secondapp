package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.compose.ui.util.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {167}, m = "invokeSuspend", v = 2)
public final class c930 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d930 b;
    public final /* synthetic */ float c;

    @c0d(c = "com.sporty.android.compose.ui.util.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {168}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d930 b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d930 d930Var, float f, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = d930Var;
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                d930 d930Var = this.b;
                float fJ = ((t5a0) d930Var.e).j();
                ucg ucgVar = new ucg(d930Var);
                this.a = 1;
                if (sje0.c(fJ, this.c, 0.0f, null, ucgVar, this, 12) == y5bVar) {
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
    public c930(d930 d930Var, float f, v1b<? super c930> v1bVar) {
        super(2, v1bVar);
        this.b = d930Var;
        this.c = f;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c930(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c930) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            d930 d930Var = this.b;
            puw puwVar = d930Var.i;
            a aVar = new a(d930Var, this.c, null);
            this.a = 1;
            if (puw.a(puwVar, aVar, this) == y5bVar) {
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
