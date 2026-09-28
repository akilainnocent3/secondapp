package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchMyFavoriteViewModel$onAddSettingsPopupGone$1", f = "PreMatchMyFavoriteViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class wh20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yh20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh20(yh20 yh20Var, v1b<? super wh20> v1bVar) {
        super(2, v1bVar);
        this.b = yh20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wh20(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wh20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mzw mzwVar = this.b.a;
            this.a = 1;
            if (mzwVar.a(this) == y5bVar) {
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
