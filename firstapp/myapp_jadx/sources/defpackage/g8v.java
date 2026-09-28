package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g8v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g8v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                PlayerView playerView = new PlayerView(context);
                playerView.setPlayer((so10) obj2);
                playerView.setUseController(false);
                playerView.setResizeMode(3);
                playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return playerView;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                ((String) obj).getClass();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    q1c0Var.F2(w3c0Var.d, 0);
                }
                return Unit.a;
        }
    }
}
