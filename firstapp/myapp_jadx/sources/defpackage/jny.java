package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class jny implements OnBackAnimationCallback {
    public final /* synthetic */ trp a;
    public final /* synthetic */ dny b;
    public final /* synthetic */ eny c;
    public final /* synthetic */ fny d;

    public jny(trp trpVar, dny dnyVar, eny enyVar, fny fnyVar) {
        this.a = trpVar;
        this.b = dnyVar;
        this.c = enyVar;
        this.d = fnyVar;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new sr1(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new sr1(backEvent));
    }
}
