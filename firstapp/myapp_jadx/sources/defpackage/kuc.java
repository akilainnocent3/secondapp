package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kuc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kuc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                nk0 nk0Var = new nk0((String) obj2);
                ohp<Object>[] ohpVarArr = lb80.a;
                pb80Var.b(hb80.A, a.c(nk0Var));
                lb80.h(pb80Var, 0);
                return Unit.a;
            default:
                nn40 nn40Var = (nn40) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ypa0 ypa0Var = nn40Var.z;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                ypa0Var.J1(ypa0Var.y1().d);
                SharedPreferences.Editor editor = nn40Var.R;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("ONE_TAP", true);
                    }
                } else if (editor != null) {
                    editor.putBoolean("ONE_TAP", false);
                }
                SharedPreferences.Editor editor2 = nn40Var.R;
                if (editor2 != null) {
                    editor2.apply();
                }
                return Unit.a;
        }
    }
}
