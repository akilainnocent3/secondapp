package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity;
import com.sportybet.plugin.realsports.sportssoccer.expandview.TimeFilterPopupView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ni30 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ni30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2<? super xvf0, ? super Boolean, Unit> function2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = QuickMarketOptionActivity.B;
                ((QuickMarketOptionActivity) obj).finish();
                break;
            case 1:
                View.OnClickListener onClickListener = ((aw70.b) obj).b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            default:
                TimeFilterPopupView timeFilterPopupView = (TimeFilterPopupView) obj;
                xvf0 xvf0Var = timeFilterPopupView.d;
                if (xvf0Var != null && (function2 = timeFilterPopupView.b) != null) {
                    function2.invoke(xvf0Var, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
