package defpackage;

import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.common.data.CustomException;
import com.sporty.android.common.data.CustomExceptionType;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fe7 extends fte<bi50<List<ChatMessage>>> {
    public final /* synthetic */ be7 a;
    public final /* synthetic */ LinkedHashMap b;

    public fe7(be7 be7Var, LinkedHashMap linkedHashMap) {
        this.a = be7Var;
        this.b = linkedHashMap;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("SPORTY_CHAT");
        aVar.p(th, "Failed to get old chat list", new Object[0]);
        mpe0 mpe0Var = ljs.a;
        LogProcess logProcess = LogProcess.LOAD_MESSAGES;
        be7 be7Var = this.a;
        ljs.c(logProcess, be7Var.V, this.b, th, 8);
        be7Var.z.j(Boolean.FALSE);
        be7Var.E1(th);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50 bi50Var = (bi50) obj;
        bi50Var.getClass();
        if (!bi50Var.a.getIsSuccessful()) {
            onError(new CustomException(CustomExceptionType.ERROR, ui8.c(bi50Var.c)));
            return;
        }
        be7 be7Var = this.a;
        be7Var.z.j(Boolean.FALSE);
        String strValueOf = String.valueOf(be7Var.X);
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put("messageCount", strValueOf);
        mpe0 mpe0Var = ljs.a;
        ljs.a(LogProcess.LOAD_MESSAGES, LogStatus.SUCCESS, be7Var.V, linkedHashMap);
        List list = (List) bi50Var.b;
        be7Var.x1(list != null ? be7Var.z1(list, false) : null, false);
        if (list == null || !list.isEmpty()) {
            return;
        }
        be7Var.B.j(Boolean.TRUE);
    }
}
