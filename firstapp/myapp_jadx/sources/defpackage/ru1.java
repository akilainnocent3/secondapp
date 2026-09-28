package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ru1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ru1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((ytw) obj2).setValue(Integer.valueOf((int) (urrVar.a() >> 32)));
                return Unit.a;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = b8b0Var.X;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("SPIN_DA_BOTTLE_SOUND", true);
                    }
                    ypa0 ypa0Var = b8b0Var.J;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    ypa0Var.y1().d = true;
                } else {
                    if (editor != null) {
                        editor.putBoolean("SPIN_DA_BOTTLE_SOUND", false);
                    }
                    ypa0 ypa0Var2 = b8b0Var.J;
                    if (ypa0Var2 == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    ypa0Var2.y1().d = false;
                }
                SharedPreferences.Editor editor2 = b8b0Var.X;
                if (editor2 != null) {
                    editor2.apply();
                }
                ypa0 ypa0Var3 = b8b0Var.J;
                if (ypa0Var3 != null) {
                    ypa0Var3.J1(ypa0Var3.y1().d);
                    return Unit.a;
                }
                Intrinsics.n("soundViewModel");
                throw null;
        }
    }
}
