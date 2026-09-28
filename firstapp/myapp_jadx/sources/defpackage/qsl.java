package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qsl extends py1 {
    public boolean a = false;

    public qsl() {
        addOnContextAvailableListener(new psl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((utn) generatedComponent()).o0((InstantRacingEventActivity) this);
    }
}
