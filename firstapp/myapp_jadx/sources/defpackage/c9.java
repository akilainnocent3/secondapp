package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class c9 extends SimpleResponseWrapper<Boolean> {
    public final /* synthetic */ d9 a;

    public c9(d9 d9Var) {
        this.a = d9Var;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("check api fail %s", th != null ? th.toString() : "");
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(Boolean bool) {
        if (bool.booleanValue()) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_ACCOUNT);
            aVar.a("API : showAccountLockedAlertDialog", new Object[0]);
            this.a.d();
        }
    }
}
