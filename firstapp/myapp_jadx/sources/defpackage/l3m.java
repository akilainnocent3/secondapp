package defpackage;

import android.content.Context;
import com.sportybet.android.home.SplashActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class l3m implements aoy {
    public final /* synthetic */ m3m a;

    public l3m(m3m m3mVar) {
        this.a = m3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        m3m m3mVar = this.a;
        if (m3mVar.c) {
            return;
        }
        m3mVar.c = true;
        ((gdb0) m3mVar.generatedComponent()).e2((SplashActivity) m3mVar);
    }
}
