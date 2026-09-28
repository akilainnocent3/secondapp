package defpackage;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.r;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;
import com.sportygames.commons.models.GiftItem;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hj60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ij60 ij60Var = (ij60) obj;
                try {
                    op5.a.getClass();
                    String str = op5.c;
                    if (str == null) {
                        str = "";
                    }
                    wz.a("FBGSelected", krh0.e(str), "true");
                    String strValueOf = String.valueOf(ij60Var.b.w.getText());
                    StringBuilder sb = new StringBuilder();
                    int length = strValueOf.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = strValueOf.charAt(i2);
                        if (Character.isDigit(cCharAt) || cCharAt == '.') {
                            sb.append(cCharAt);
                        }
                    }
                    double d = Double.parseDouble(sb.toString());
                    gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> gajVar = ij60Var.c;
                    xi60.a aVar = ij60Var.d;
                    if (aVar != null) {
                        gajVar.invoke(aVar.a, Double.valueOf(d), Boolean.TRUE);
                        return;
                    } else {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                SwipeBetActivity swipeBetActivity = (SwipeBetActivity) obj;
                int i3 = SwipeBetActivity.Q;
                swipeBetActivity.getClass();
                qqe qqeVar = qqe.a;
                new AccelerateInterpolator();
                swipeBetActivity.c.G.j = new kke0(qqe.a, r.d.DEFAULT_DRAG_ANIMATION_DURATION, new AccelerateInterpolator());
                CardStackView cardStackView = swipeBetActivity.b;
                if (cardStackView.getLayoutManager() instanceof CardStackLayoutManager) {
                    cardStackView.s0(((CardStackLayoutManager) cardStackView.getLayoutManager()).H.f + 1);
                    return;
                }
                return;
        }
    }
}
