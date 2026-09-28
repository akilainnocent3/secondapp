package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyViewModel$1", f = "VirtualLobbyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class nli0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hmi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nli0(v1b v1bVar, hmi0 hmi0Var) {
        super(2, v1bVar);
        this.c = hmi0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nli0 nli0Var = new nli0(v1bVar, this.c);
        nli0Var.b = obj;
        return nli0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((nli0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<lli0> ku90Var = this.c.z;
            lli0.e eVar = new lli0.e(uiText);
            this.b = null;
            this.a = 1;
            if (ku90Var.a.emit(eVar, this) == y5bVar) {
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
