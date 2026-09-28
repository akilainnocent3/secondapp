package defpackage;

import com.sportybet.android.instantwin.presentation.racingrace.InstantRacingRaceActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ssl extends py1 {
    public boolean a = false;

    public ssl() {
        addOnContextAvailableListener(new rsl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((a0o) generatedComponent()).S1((InstantRacingRaceActivity) this);
    }
}
