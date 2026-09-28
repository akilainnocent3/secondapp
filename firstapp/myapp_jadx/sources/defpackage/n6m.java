package defpackage;

import android.content.Context;
import com.sportybet.android.crash.UserCrashActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class n6m implements aoy {
    public final /* synthetic */ o6m a;

    public n6m(o6m o6mVar) {
        this.a = o6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        o6m o6mVar = this.a;
        if (o6mVar.c) {
            return;
        }
        o6mVar.c = true;
        ((moh0) o6mVar.generatedComponent()).x2((UserCrashActivity) o6mVar);
    }
}
