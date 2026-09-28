package defpackage;

import android.content.Context;
import com.sportybet.android.game.activity.SportyGameLobbyDummyActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class q3m implements aoy {
    public final /* synthetic */ r3m a;

    public q3m(r3m r3mVar) {
        this.a = r3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        r3m r3mVar = this.a;
        if (r3mVar.c) {
            return;
        }
        r3mVar.c = true;
        ((nob0) r3mVar.generatedComponent()).x0((SportyGameLobbyDummyActivity) r3mVar);
    }
}
