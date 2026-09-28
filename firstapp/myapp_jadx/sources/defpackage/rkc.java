package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.dedicatedteampage.article.ui.player.CustomMedia3PlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rkc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rkc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                Context context = (Context) obj;
                context.getClass();
                final CustomMedia3PlayerView customMedia3PlayerView = new CustomMedia3PlayerView(context, null, 6, 0);
                customMedia3PlayerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                PlayerView playerView = (PlayerView) customMedia3PlayerView.findViewById(R.id.player_view);
                if (playerView != null) {
                    exoPlayer.n(true);
                    playerView.setPlayer(exoPlayer);
                    playerView.setUseController(true);
                    playerView.setKeepScreenOn(true);
                }
                customMedia3PlayerView.post(new Runnable() { // from class: wkc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomMedia3PlayerView customMedia3PlayerView2 = customMedia3PlayerView;
                        customMedia3PlayerView2.requestLayout();
                        customMedia3PlayerView2.invalidate();
                    }
                });
                return customMedia3PlayerView;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new i9r.h(ijf0Var));
                return Unit.a;
        }
    }
}
