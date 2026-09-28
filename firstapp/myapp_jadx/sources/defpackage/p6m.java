package defpackage;

import android.content.Context;
import com.sportybet.android.crash.UserCrashNoticeActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class p6m implements aoy {
    public final /* synthetic */ q6m a;

    public p6m(q6m q6mVar) {
        this.a = q6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        q6m q6mVar = this.a;
        if (q6mVar.c) {
            return;
        }
        q6mVar.c = true;
        ((poh0) q6mVar.generatedComponent()).a0((UserCrashNoticeActivity) q6mVar);
    }
}
