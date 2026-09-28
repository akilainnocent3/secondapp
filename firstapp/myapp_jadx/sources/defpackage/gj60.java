package defpackage;

import android.view.View;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gj60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gj60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ij60) obj).c();
                break;
            default:
                SwipeBetActivity swipeBetActivity = (SwipeBetActivity) obj;
                int i2 = SwipeBetActivity.Q;
                swipeBetActivity.E.setVisibility(8);
                swipeBetActivity.J = true;
                ile0 ile0Var = swipeBetActivity.H;
                if (ile0Var != null) {
                    ile0Var.y1();
                }
                break;
        }
    }
}
