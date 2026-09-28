package defpackage;

import com.sportygames.chat.remote.models.LeaveRequest;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.ResultChatWrapper;
import com.sportygames.commons.remote.model.StatusChat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.viewmodels.ChatViewModel$leaveGroup$1", f = "ChatViewModel.kt", l = {74}, m = "invokeSuspend", v = 1)
public final class ph7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sh7 b;
    public final /* synthetic */ LeaveRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph7(sh7 sh7Var, LeaveRequest leaveRequest, v1b<? super ph7> v1bVar) {
        super(2, v1bVar);
        this.b = sh7Var;
        this.c = leaveRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ph7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ph7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        sh7 sh7Var = this.b;
        ssw<LoadingStateChat<ChatListResponse>> sswVar = sh7Var.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingStateChat<>(StatusChat.RUNNING, null, null, null));
            xc7 xc7Var = sh7Var.a;
            this.a = 1;
            xc7Var.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new h52(new tc7(this.c, null), null), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ResultChatWrapper resultChatWrapper = (ResultChatWrapper) obj;
        if (resultChatWrapper instanceof ResultChatWrapper.Success) {
            sswVar.j(new LoadingStateChat<>(StatusChat.SUCCESS, ((ResultChatWrapper.Success) resultChatWrapper).getValue(), null, null));
        } else if (resultChatWrapper instanceof ResultChatWrapper.NetworkError) {
            sswVar.j(new LoadingStateChat<>(StatusChat.FAILED, null, null, (ResultChatWrapper.NetworkError) resultChatWrapper));
        } else {
            StatusChat statusChat = StatusChat.FAILED;
            resultChatWrapper.getClass();
            sswVar.j(new LoadingStateChat<>(statusChat, null, (ResultChatWrapper.GenericError) resultChatWrapper, null));
        }
        return Unit.a;
    }
}
