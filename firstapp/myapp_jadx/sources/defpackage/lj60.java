package defpackage;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lj60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lj60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wz.a("popup_action", "Sporty Hero", "game limit", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                ((kj60) obj).invoke();
                break;
            default:
                SwipeBetActivity swipeBetActivity = (SwipeBetActivity) obj;
                int i2 = SwipeBetActivity.Q;
                swipeBetActivity.getClass();
                qqe qqeVar = qqe.a;
                new AccelerateInterpolator();
                swipeBetActivity.c.G.j = new kke0(qqe.b, r.d.DEFAULT_DRAG_ANIMATION_DURATION, new AccelerateInterpolator());
                CardStackView cardStackView = swipeBetActivity.b;
                if (cardStackView.getLayoutManager() instanceof CardStackLayoutManager) {
                    cardStackView.s0(((CardStackLayoutManager) cardStackView.getLayoutManager()).H.f + 1);
                }
                break;
        }
    }
}
