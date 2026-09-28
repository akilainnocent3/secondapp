package com.sportybet.android.game.activity;

import android.os.Bundle;
import defpackage.hzm;
import defpackage.r3m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/game/activity/SportyGameLobbyDummyActivity;", "Lfq0;", "<init>", "()V", "sportygame"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyGameLobbyDummyActivity extends r3m {
    public hzm d;

    @Override // defpackage.r3m, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hzm hzmVar = this.d;
        if (hzmVar == null) {
            Intrinsics.n("agent");
            throw null;
        }
        hzmVar.a(getIntent().getExtras());
        finish();
    }
}
