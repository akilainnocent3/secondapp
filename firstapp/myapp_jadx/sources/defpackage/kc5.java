package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.BuildAndGoBetHistoryHandlerImpl$init$1", f = "BuildAndGoBetHistoryHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kc5 extends tje0 implements Function2<vbo, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mc5 b;
    public final /* synthetic */ et7 c;
    public final /* synthetic */ String d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.BuildAndGoBetHistoryHandlerImpl$init$1$1", f = "BuildAndGoBetHistoryHandlerImpl.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ mc5 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ vbo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc5 mc5Var, String str, vbo vboVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = mc5Var;
            this.c = str;
            this.d = vboVar;
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
                vbo vboVar = this.d;
                vbo.a aVar = vboVar.a;
                vbo.b bVar = vboVar.b;
                this.a = 1;
                if (this.b.k(this.c, aVar, bVar, this) == y5bVar) {
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
    public kc5(mc5 mc5Var, et7 et7Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = mc5Var;
        this.c = et7Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kc5 kc5Var = new kc5(this.b, this.c, this.d, v1bVar);
        kc5Var.a = obj;
        return kc5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vbo vboVar, v1b<? super Unit> v1bVar) {
        return ((kc5) create(vboVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vbo vboVar = (vbo) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mc5 mc5Var = this.b;
        jvd0 jvd0Var = mc5Var.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        mc5Var.d = ej5.c(this.c, null, null, new a(mc5Var, this.d, vboVar, null), 3);
        return Unit.a;
    }
}
