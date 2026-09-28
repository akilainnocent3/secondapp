package defpackage;

import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qyr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qyr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((uyr) obj).E.e());
            case 1:
                final clw clwVar = (clw) obj;
                PopupWindow popupWindow = new PopupWindow(clwVar.b.a, -1, clwVar.a);
                popupWindow.setFocusable(true);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: blw
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        clw clwVar2 = clwVar;
                        clwVar2.b.b.setEnabled(true);
                        clwVar2.d.invoke();
                    }
                });
                return popupWindow;
            case 2:
                ((m410) obj).J0();
                return Unit.a;
            default:
                return Integer.valueOf(((zzr) obj).h());
        }
    }
}
