package defpackage;

import com.sportygames.compose.chat.data.model.ChatListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.ChatSocketViewModel$subscribeToTopic$topic$1$1$1", f = "ChatSocketViewModel.kt", l = {145}, m = "invokeSuspend", v = 1)
public final class wg7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xg7 b;
    public final /* synthetic */ ChatListResponse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg7(xg7 xg7Var, ChatListResponse chatListResponse, v1b<? super wg7> v1bVar) {
        super(2, v1bVar);
        this.b = xg7Var;
        this.c = chatListResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wg7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wg7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.d;
            this.a = 1;
            if (b390Var.emit(this.c, this) == y5bVar) {
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
