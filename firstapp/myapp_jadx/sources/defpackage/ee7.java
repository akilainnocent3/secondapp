package defpackage;

import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.common.data.CustomException;
import com.sporty.android.common.data.CustomExceptionType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ee7 extends fte<bi50<List<ChatMessage>>> {
    public final /* synthetic */ LinkedHashMap a;
    public final /* synthetic */ be7 b;
    public final /* synthetic */ boolean c;

    public ee7(be7 be7Var, LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = be7Var;
        this.c = z;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        be7 be7Var = this.b;
        be7Var.A.j(Boolean.FALSE);
        if (!(th instanceof CustomException) || ((CustomException) th).getType() != CustomExceptionType.ABORT) {
            itf0.a aVar = itf0.a;
            aVar.q("SPORTY_CHAT");
            aVar.p(th, "getNewChatMessages()", new Object[0]);
            be7Var.E1(th);
        }
        be7Var.x1(be7Var.z1(new ArrayList(), true), this.c);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50 bi50Var = (bi50) obj;
        bi50Var.getClass();
        Response response = bi50Var.a;
        ResponseBody responseBody = bi50Var.c;
        boolean isSuccessful = response.getIsSuccessful();
        be7 be7Var = this.b;
        if (!isSuccessful) {
            mpe0 mpe0Var = ljs.a;
            ljs.c(LogProcess.LOAD_MESSAGES, be7Var.V, null, new CustomException(null, ui8.c(responseBody), 1, null), 12);
            onError(new CustomException(CustomExceptionType.ERROR, ui8.c(responseBody)));
            return;
        }
        String strValueOf = String.valueOf(be7Var.X);
        LinkedHashMap linkedHashMap = this.a;
        linkedHashMap.put("messageCount", strValueOf);
        mpe0 mpe0Var2 = ljs.a;
        ljs.a(LogProcess.LOAD_MESSAGES, LogStatus.SUCCESS, be7Var.V, linkedHashMap);
        List list = (List) bi50Var.b;
        be7Var.x1(list != null ? be7Var.z1(list, true) : null, this.c);
        be7Var.A.j(Boolean.FALSE);
    }
}
