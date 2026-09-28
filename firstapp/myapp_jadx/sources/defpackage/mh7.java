package defpackage;

import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.ResultChatWrapper;
import com.sportygames.commons.remote.model.StatusChat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.viewmodels.ChatViewModel$getMessages$1", f = "ChatViewModel.kt", l = {116}, m = "invokeSuspend", v = 1)
public final class mh7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sh7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh7(sh7 sh7Var, String str, String str2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = sh7Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mh7(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mh7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        sh7 sh7Var = this.b;
        ssw<LoadingStateChat<List<ChatListResponse>>> sswVar = sh7Var.d;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingStateChat<>(StatusChat.RUNNING, null, null, null));
            xc7 xc7Var = sh7Var.a;
            this.a = 1;
            xc7Var.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new h52(new oc7(this.c, this.d, null), null), this);
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
