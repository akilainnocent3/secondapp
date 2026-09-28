package defpackage;

import com.sportygames.chat.remote.models.LeaveRequest;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.repositories.ChatRepository$leave$2", f = "ChatRepository.kt", l = {51}, m = "invokeSuspend", v = 1)
public final class tc7 extends tje0 implements Function1<v1b<? super ChatListResponse>, Object> {
    public int a;
    public final /* synthetic */ LeaveRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc7(LeaveRequest leaveRequest, v1b<? super tc7> v1bVar) {
        super(1, v1bVar);
        this.b = leaveRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new tc7(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super ChatListResponse> v1bVar) {
        return ((tc7) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        ka7 ka7VarD = on0.d();
        this.a = 1;
        Object objC = ka7VarD.c(this.b, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
