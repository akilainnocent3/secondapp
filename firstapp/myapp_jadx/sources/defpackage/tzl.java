package defpackage;

import android.content.Context;
import com.sportybet.android.globalpay.pixBtg.PixSuccessActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class tzl implements aoy {
    public final /* synthetic */ uzl a;

    public tzl(uzl uzlVar) {
        this.a = uzlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        uzl uzlVar = this.a;
        if (uzlVar.c) {
            return;
        }
        uzlVar.c = true;
        ((wf10) uzlVar.generatedComponent()).Z0((PixSuccessActivity) uzlVar);
    }
}
