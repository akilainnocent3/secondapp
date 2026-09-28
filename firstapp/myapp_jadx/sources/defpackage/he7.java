package defpackage;

import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.common.data.CustomException;
import com.sporty.android.common.data.CustomExceptionType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class he7 extends fte<bi50<DefaultCommand>> {
    public final /* synthetic */ be7 a;
    public final /* synthetic */ int b;

    public he7(be7 be7Var, int i) {
        this.a = be7Var;
        this.b = i;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("SPORTY_CHAT");
        aVar.p(th, "Failed to remove a message", new Object[0]);
        mpe0 mpe0Var = ljs.a;
        LogProcess logProcess = LogProcess.DELETING_MESSAGE;
        be7 be7Var = this.a;
        ljs.c(logProcess, be7Var.V, null, th, 12);
        be7Var.E1(th);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        ArrayList arrayList;
        bi50 bi50Var = (bi50) obj;
        bi50Var.getClass();
        if (!bi50Var.a.getIsSuccessful()) {
            onError(new CustomException(CustomExceptionType.ERROR, ui8.c(bi50Var.c)));
            return;
        }
        be7 be7Var = this.a;
        int i = this.b;
        synchronized (be7Var) {
            try {
                ssw<List<ChatMessage>> sswVar = be7Var.O;
                List<ChatMessage> listD = sswVar.d();
                if (listD != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : listD) {
                        if (((ChatMessage) obj2).getMessageNo() != i) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                sswVar.j(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        mpe0 mpe0Var = ljs.a;
        ljs.b(LogProcess.DELETING_MESSAGE, LogStatus.SUCCESS, this.a.V);
    }
}
