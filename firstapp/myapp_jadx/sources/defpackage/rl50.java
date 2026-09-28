package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.network.data.ResultsKt$convertUnitResponseAsResults$3", f = "Results.kt", l = {207}, m = "invokeSuspend", v = 2)
public final class rl50 extends tje0 implements gaj<myh<? super lk50<? extends Unit>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ UiText d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl50(UiText uiText, v1b<? super rl50> v1bVar) {
        super(3, v1bVar);
        this.d = uiText;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        rl50 rl50Var = new rl50(this.d, v1bVar);
        rl50Var.b = myhVar;
        rl50Var.c = th;
        return rl50Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText text;
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fk50 fk50Var = (fk50) (!(th instanceof fk50) ? null : th);
            if (fk50Var == null || (text = fk50Var.getText()) == null) {
                text = this.d;
            }
            lk50.a aVar = new lk50.a(th, text);
            this.b = null;
            this.c = th;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        itf0.a aVar2 = itf0.a;
        aVar2.a(e40.a(aVar2, "asResult", "Results Failure ", th), new Object[0]);
        return Unit.a;
    }
}
