package defpackage;

import android.media.MediaPlayer;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class io5 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ bc6 a;
    public final /* synthetic */ MediaPlayer b;

    public io5(bc6 bc6Var, mo5 mo5Var, MediaPlayer mediaPlayer) {
        this.a = bc6Var;
        this.b = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zi50.a aVar = zi50.b;
        this.a.resumeWith(Boolean.TRUE);
        try {
            this.b.release();
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }
}
