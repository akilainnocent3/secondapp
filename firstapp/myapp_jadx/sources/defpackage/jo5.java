package defpackage;

import android.media.MediaPlayer;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class jo5 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ bc6 a;
    public final /* synthetic */ MediaPlayer b;

    public jo5(bc6 bc6Var, mo5 mo5Var, MediaPlayer mediaPlayer) {
        this.a = bc6Var;
        this.b = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        zi50.a aVar = zi50.b;
        this.a.resumeWith(Boolean.FALSE);
        try {
            this.b.release();
            Unit unit = Unit.a;
            return true;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
            return true;
        }
    }
}
