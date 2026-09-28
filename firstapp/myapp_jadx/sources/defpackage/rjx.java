package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import com.sportygames.commons.views.NavigationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rjx implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rjx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                NavigationActivity navigationActivity = (NavigationActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    int i2 = NavigationActivity.y;
                    navigationActivity.setResult(106);
                    SharedPreferences.Editor editor = navigationActivity.d;
                    if (editor != null) {
                        editor.putBoolean("EVEN_ODD_SOUND", true);
                    }
                    navigationActivity.A1().y1().d = true;
                } else {
                    SharedPreferences.Editor editor2 = navigationActivity.d;
                    if (editor2 != null) {
                        editor2.putBoolean("EVEN_ODD_SOUND", false);
                    }
                    navigationActivity.A1().y1().d = false;
                }
                SharedPreferences.Editor editor3 = navigationActivity.d;
                if (editor3 != null) {
                    editor3.apply();
                }
                navigationActivity.A1().J1(navigationActivity.A1().y1().d);
                Intent intent = new Intent("soundOnOff");
                intent.putExtra("state-change", zBooleanValue);
                fdt.a(navigationActivity).c(intent);
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ((foa0) obj2).y.j(f1e0Var.c);
                break;
        }
        return Unit.a;
    }
}
