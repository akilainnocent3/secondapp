package defpackage;

import com.sportygames.chat.remote.models.RainDetailInfoResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.ResultChatWrapper;
import com.sportygames.commons.remote.model.StatusChat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.chat.viewmodels.RainViewModel$getRainDetailInfo$1", f = "RainViewModel.kt", l = {117}, m = "invokeSuspend", v = 1)
public final class rw30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lw30 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw30(lw30 lw30Var, String str, v1b<? super rw30> v1bVar) {
        super(2, v1bVar);
        this.b = lw30Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rw30(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rw30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lw30 lw30Var = this.b;
        ssw<LoadingStateChat<HTTPResponse<RainDetailInfoResponse>>> sswVar = lw30Var.f;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingStateChat<>(StatusChat.RUNNING, null, null, null));
            xc7 xc7Var = lw30Var.b;
            this.a = 1;
            xc7Var.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new h52(new rc7(this.c, null), null), this);
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
            sswVar.j(new LoadingStateChat<>(StatusChat.FAILED, null, resultChatWrapper instanceof ResultChatWrapper.GenericError ? (ResultChatWrapper.GenericError) resultChatWrapper : null, null));
        }
        return Unit.a;
    }
}
