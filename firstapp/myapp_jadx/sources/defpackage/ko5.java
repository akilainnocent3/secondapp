package defpackage;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class ko5 implements Function1<Throwable, Unit> {
    public final /* synthetic */ MediaPlayer a;

    public ko5(mo5 mo5Var, MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        MediaPlayer mediaPlayer = this.a;
        try {
            zi50.a aVar = zi50.b;
            mediaPlayer.release();
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        return Unit.a;
    }
}
