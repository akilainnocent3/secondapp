package defpackage;

import android.widget.PopupWindow;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBar;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pmf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pmf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((smf) obj).dismiss();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(igm.d.j.a);
                return Unit.a;
            default:
                final sky skyVar = (sky) obj;
                pid0 pid0Var = skyVar.b;
                PopupWindow popupWindow = new PopupWindow(pid0Var.a, -1, skyVar.a);
                popupWindow.setFocusable(true);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: pky
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        sky skyVar2 = skyVar;
                        skyVar2.b.b.setEnabled(true);
                        skyVar2.d.invoke();
                    }
                });
                for (MultiMakerOddsRangeSeekBar multiMakerOddsRangeSeekBar : b.k(pid0Var.e, pid0Var.f)) {
                    vz1 vz1Var = new vz1();
                    vz1Var.a = skyVar;
                    multiMakerOddsRangeSeekBar.setOnRangeChangedListener(vz1Var);
                }
                return popupWindow;
        }
    }
}
