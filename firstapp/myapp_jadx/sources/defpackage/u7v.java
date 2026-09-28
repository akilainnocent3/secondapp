package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class u7v implements tse {
    public final /* synthetic */ dq40 a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ t7v c;

    public u7v(dq40 dq40Var, ExoPlayer exoPlayer, t7v t7vVar) {
        this.a = dq40Var;
        this.b = exoPlayer;
        this.c = t7vVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        c9p c9pVar = (c9p) this.a.a;
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        this.b.W(this.c);
    }
}
