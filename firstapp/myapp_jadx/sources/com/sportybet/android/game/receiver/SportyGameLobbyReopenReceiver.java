package com.sportybet.android.game.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.azm;
import defpackage.s3m;
import defpackage.wae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/game/receiver/SportyGameLobbyReopenReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "sportygame"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyGameLobbyReopenReceiver extends s3m {
    public azm c;

    @Override // defpackage.s3m, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        super.onReceive(context, intent);
        if (intent == null || (action = intent.getAction()) == null || !"com.sportybet.android.game.REOPEN_GAME_LOBBY".equals(action)) {
            return;
        }
        azm azmVar = this.c;
        if (azmVar != null) {
            azmVar.d(wae.GAMES_LOBBY);
        } else {
            Intrinsics.n("router");
            throw null;
        }
    }
}
