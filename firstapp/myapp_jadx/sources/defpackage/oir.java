package defpackage;

import androidx.media3.ui.PlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oir implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlayerView playerView = (PlayerView) obj;
        playerView.getClass();
        playerView.setPlayer(null);
        return Unit.a;
    }
}
