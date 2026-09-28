package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fr60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fr60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                View view = (View) obj;
                view.getClass();
                ((Function1) obj2).invoke(view);
                return Unit.a;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ypa0 ypa0Var = b8b0Var.J;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                ypa0Var.J1(ypa0Var.y1().d);
                SharedPreferences.Editor editor = b8b0Var.X;
                String str = QWvyvNzGsBpRT.hkEKcHkKjNtO;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean(str, true);
                    }
                } else if (editor != null) {
                    editor.putBoolean(str, false);
                }
                SharedPreferences.Editor editor2 = b8b0Var.X;
                if (editor2 != null) {
                    editor2.apply();
                }
                return Unit.a;
        }
    }
}
