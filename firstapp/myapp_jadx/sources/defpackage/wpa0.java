package defpackage;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.viewmodels.SoundViewModel$brightenBgMusic$1", f = "SoundViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class wpa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ypa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpa0(ypa0 ypa0Var, v1b<? super wpa0> v1bVar) {
        super(2, v1bVar);
        this.a = ypa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wpa0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wpa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rk60 rk60VarY1;
        MediaPlayer mediaPlayer;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ypa0 ypa0Var = this.a;
        if (ypa0Var.a != null && ypa0Var.y1().d && (mediaPlayer = (rk60VarY1 = ypa0Var.y1()).i) != null && mediaPlayer.isPlaying()) {
            MediaPlayer mediaPlayer2 = rk60VarY1.i;
            if (mediaPlayer2 == null) {
                Intrinsics.n("infiniteSoundMediaPlayer");
                throw null;
            }
            mediaPlayer2.setVolume(0.99f, 0.99f);
        }
        return Unit.a;
    }
}
