package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bkf0 implements Executor {
    public final /* synthetic */ Choreographer a;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.a.postFrameCallback(new Choreographer.FrameCallback() { // from class: ckf0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
