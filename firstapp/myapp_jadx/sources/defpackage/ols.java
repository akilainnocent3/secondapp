package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.ResultsActivity;
import com.sportybet.plugin.realsports.results.ResultChangeLeaguePanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ols implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ols(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((qls) obj).a();
                return;
            default:
                final ResultsActivity resultsActivity = (ResultsActivity) obj;
                int i2 = ResultsActivity.A;
                PopupWindow popupWindow = resultsActivity.z;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    PopupWindow popupWindow2 = new PopupWindow((View) new ResultChangeLeaguePanel(resultsActivity, resultsActivity.w, resultsActivity.e, resultsActivity.f), -1, -1, true);
                    popupWindow2.setBackgroundDrawable(new ColorDrawable(resultsActivity.getColor(R.color.spr_bg_transparent)));
                    popupWindow2.setAnimationStyle(R.style.spr_PopupAnimation);
                    popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ok50
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            resultsActivity.z = null;
                        }
                    });
                    dgd0 dgd0Var = resultsActivity.d;
                    if (dgd0Var == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    popupWindow2.showAsDropDown(dgd0Var.b);
                    resultsActivity.z = popupWindow2;
                    return;
                }
                return;
        }
    }
}
