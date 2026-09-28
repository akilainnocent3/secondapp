package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity;
import com.sportybet.plugin.realsports.sportssoccer.expandview.TimeFilterPopupView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oi30 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ oi30(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                int i2 = QuickMarketOptionActivity.B;
                ((QuickMarketOptionActivity) callback).finish();
                break;
            default:
                Function2<? super xvf0, ? super Boolean, Unit> function2 = ((TimeFilterPopupView) callback).b;
                if (function2 != null) {
                    function2.invoke(xvf0.a(), Boolean.TRUE);
                }
                break;
        }
    }
}
