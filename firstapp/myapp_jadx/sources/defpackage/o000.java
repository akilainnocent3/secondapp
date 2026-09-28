package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.PayBaseViewModel$observeAndSetUserBalance$1", f = "PayBaseViewModel.kt", l = {321}, m = "invokeSuspend", v = 2)
public final class o000 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n000 b;

    public static final /* synthetic */ class a extends saj implements Function1<Long, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Long l) {
            return ((xsm) this.receiver).g(l.longValue());
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ n000 a;

        public b(n000 n000Var) {
            this.a = n000Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            wu1 wu1Var = (wu1) obj;
            n000 n000Var = this.a;
            n000Var.O1().c().f = wu1Var.a;
            qxd0<UiText> qxd0VarD1 = n000Var.D1();
            if (qxd0VarD1 != null) {
                qxd0VarD1.a(wu1Var.b);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(n000 n000Var, v1b<? super o000> v1bVar) {
        super(2, v1bVar);
        this.b = n000Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o000(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o000) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            n000 n000Var = this.b;
            w9e w9eVar = n000Var.d;
            dae daeVar = new dae(w9eVar.d.h(pu0.b.a), new a(1, n000Var.a, xsm.class, "formatWithoutSymbol", "formatWithoutSymbol(J)Ljava/lang/String;", 0));
            b bVar = new b(n000Var);
            this.a = 1;
            if (daeVar.collect(bVar, this) == y5bVar) {
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
