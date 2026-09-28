package defpackage;

import android.widget.PopupWindow;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class avb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ avb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((bwb) obj).V1();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(xgq.a.a);
                return Unit.a;
            case 2:
                int i2 = MatchEventActivity.a0;
                ((MatchEventActivity) obj).I1().I.b();
                return Unit.a;
            case 3:
                final dxf0 dxf0Var = (dxf0) obj;
                PopupWindow popupWindow = new PopupWindow(dxf0Var.b.a, -1, dxf0Var.a);
                popupWindow.setFocusable(true);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: cxf0
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        lew lewVar = dxf0Var.d;
                        if (lewVar != null) {
                            lewVar.invoke();
                        }
                    }
                });
                return popupWindow;
            default:
                tak0 tak0Var = (tak0) obj;
                iju ijuVar = tak0Var.i;
                if (ijuVar != null) {
                    ijuVar.a();
                }
                tak0Var.dismiss();
                return Unit.a;
        }
    }
}
