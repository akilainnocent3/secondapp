package defpackage;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;
import com.sportybet.plugin.swipebet.widget.CustomCardView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vza0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vza0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CustomCardView.a aVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Snackbar) obj).b(3);
                break;
            default:
                int i2 = SwipeBetActivity.Q;
                CustomCardView customCardView = (CustomCardView) ((SwipeBetActivity) obj).c.U0();
                if (customCardView != null && (aVar = customCardView.w) != null) {
                    ((ug6) aVar).a();
                    break;
                }
                break;
        }
    }
}
