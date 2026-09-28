package defpackage;

import com.sportygames.compose.chat.data.model.ChatListResponse;
import com.sportygames.compose.chat.data.model.LeaveRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.ChatRepository$leave$2", f = "ChatRepository.kt", l = {54}, m = "invokeSuspend", v = 1)
public final class sc7 extends tje0 implements Function1<v1b<? super ChatListResponse>, Object> {
    public int a;
    public final /* synthetic */ wc7 b;
    public final /* synthetic */ LeaveRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc7(wc7 wc7Var, LeaveRequest leaveRequest, v1b<? super sc7> v1bVar) {
        super(1, v1bVar);
        this.b = wc7Var;
        this.c = leaveRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new sc7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super ChatListResponse> v1bVar) {
        return ((sc7) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        hc7 hc7Var = this.b.b;
        this.a = 1;
        Object objB = hc7Var.b(this.c, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
