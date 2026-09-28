package defpackage;

import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.views.ChatActivity$showCashoutError$1", f = "ChatActivity.kt", l = {1283}, m = "invokeSuspend", v = 1)
public final class s97 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ChatActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s97(ChatActivity chatActivity, v1b<? super s97> v1bVar) {
        super(2, v1bVar);
        this.b = chatActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s97(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s97) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(3000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ha7 ha7Var = (ha7) this.b.a;
        if (ha7Var != null) {
            ha7Var.X.setFadeOut();
        }
        return Unit.a;
    }
}
