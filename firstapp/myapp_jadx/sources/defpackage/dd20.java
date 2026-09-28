package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.pingpong.components.SHKeypadContainer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dd20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                RecyclerView recyclerView = preMatchEventActivity.U;
                if (recyclerView != null) {
                    recyclerView.s0(0);
                }
                ConsecutiveScrollerLayout consecutiveScrollerLayout = preMatchEventActivity.q1;
                if (consecutiveScrollerLayout != null) {
                    consecutiveScrollerLayout.post(new ivj(preMatchEventActivity, 1));
                }
                break;
            default:
                int i2 = SHKeypadContainer.F;
                ((Function1) obj).invoke(8);
                break;
        }
    }
}
