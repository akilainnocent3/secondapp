package defpackage;

import android.view.View;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.widget.StakeLayout;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e5j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hpa0 hpa0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((u6j) obj).q0(null);
                break;
            default:
                StakeLayout stakeLayout = (StakeLayout) obj;
                int i2 = StakeLayout.S;
                GameActivity.c cVar = stakeLayout.I;
                if (cVar != null && (hpa0Var = GameActivity.this.B) != null) {
                    hpa0Var.b();
                }
                stakeLayout.M.setText("");
                stakeLayout.H();
                if (stakeLayout.L.getVisibility() == 0) {
                    stakeLayout.L.setVisibility(8);
                }
                break;
        }
    }
}
