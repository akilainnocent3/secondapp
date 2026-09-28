package defpackage;

import com.sportygames.chat.remote.models.AddGroupResponse;
import com.sportygames.chat.remote.models.SendMessageResponse;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.chat.remote.models.SendMessageRequest;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.ResultChatWrapper;
import com.sportygames.commons.remote.model.StatusChat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsh7;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sh7 extends j8i0 {
    public final xc7 a = new xc7();
    public final ssw<LoadingStateChat<AddGroupResponse>> b = new ssw<>();
    public final ssw<LoadingStateChat<ChatListResponse>> c = new ssw<>();
    public final ssw<LoadingStateChat<List<ChatListResponse>>> d = new ssw<>();
    public final ssw<LoadingStateChat<SendMessageResponse>> e = new ssw<>();

    @c0d(c = "com.sportygames.commons.chat.viewmodels.ChatViewModel$sendMessages$1", f = "ChatViewModel.kt", l = {158}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SendMessageRequest c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SendMessageRequest sendMessageRequest, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = sendMessageRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sh7.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            sh7 sh7Var = sh7.this;
            ssw<LoadingStateChat<SendMessageResponse>> sswVar = sh7Var.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingStateChat<>(StatusChat.RUNNING, null, null, null));
                xc7 xc7Var = sh7Var.a;
                this.a = 1;
                xc7Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new h52(new vc7(this.c, null), null), this);
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

    public final void x1() {
        this.e.m(new LoadingStateChat<>(StatusChat.RUNNING, null, null, null));
    }

    public final void y1(SendMessageRequest sendMessageRequest) {
        ej5.c(o8i0.d(this), null, null, new a(sendMessageRequest, null), 3);
    }
}
