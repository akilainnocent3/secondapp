package defpackage;

import com.sportygames.compose.chat.data.model.LeaveRequest;
import com.sportygames.compose.chat.data.model.SendMessageRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class ic7 implements hc7 {
    public final ba7 a;

    public ic7(ba7 ba7Var) {
        ba7Var.getClass();
        this.a = ba7Var;
    }

    @Override // defpackage.hc7
    public final Object a(String str, String str2, lc7 lc7Var) {
        return this.a.b(str, str2, lc7Var);
    }

    @Override // defpackage.hc7
    public final Object b(LeaveRequest leaveRequest, sc7 sc7Var) {
        return this.a.d(leaveRequest, sc7Var);
    }

    @Override // defpackage.hc7
    public final Object c(String str, String str2, nc7 nc7Var) {
        return this.a.a(str, str2, "150", "1", "false", nc7Var);
    }

    @Override // defpackage.hc7
    public final Object d(SendMessageRequest sendMessageRequest, uc7 uc7Var) {
        return this.a.c(sendMessageRequest, uc7Var);
    }
}
