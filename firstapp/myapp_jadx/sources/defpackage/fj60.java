package defpackage;

import android.view.View;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fj60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fj60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ij60) obj).h();
                break;
            default:
                int i2 = SwipeBetActivity.Q;
                ((SwipeBetActivity) obj).finish();
                break;
        }
    }
}
