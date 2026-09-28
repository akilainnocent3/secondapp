package defpackage;

import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.common.data.CustomException;
import com.sporty.android.common.data.CustomExceptionType;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ge7 extends fte<bi50<ResponseBody>> {
    public final /* synthetic */ be7 a;

    public ge7(be7 be7Var) {
        this.a = be7Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("SPORTY_CHAT");
        aVar.o(th);
        mpe0 mpe0Var = ljs.a;
        ljs.c(LogProcess.LEAVE_CHAT_ROOM, this.a.V, null, th, 12);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50 bi50Var = (bi50) obj;
        bi50Var.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("SPORTY_CHAT");
        Response response = bi50Var.a;
        aVar.l("leaveChatroom() success: " + response.getIsSuccessful(), new Object[0]);
        if (!response.getIsSuccessful()) {
            onError(new CustomException(CustomExceptionType.ERROR, ui8.c(bi50Var.c)));
        } else {
            mpe0 mpe0Var = ljs.a;
            ljs.b(LogProcess.LEAVE_CHAT_ROOM, LogStatus.SUCCESS, this.a.V);
        }
    }
}
