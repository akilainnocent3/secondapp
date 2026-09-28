package defpackage;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes4.dex */
public final class bjl0 implements Runnable {
    public final /* synthetic */ ComponentName a;
    public final /* synthetic */ wjl0 b;

    public bjl0(wjl0 wjl0Var, ComponentName componentName) {
        this.a = componentName;
        this.b = wjl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.r(this.a);
    }
}
