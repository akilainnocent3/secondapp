package defpackage;

import com.sporty.android.common.uievent.CustomAlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class oi8 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ oi8(q1c0 q1c0Var) {
        this.b = q1c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CustomAlertDialogCallbackType customAlertDialogCallbackType = (CustomAlertDialogCallbackType) obj;
                customAlertDialogCallbackType.getClass();
                Function1<CustomAlertDialogCallbackType, Unit> function1 = ((a.j) obj2).h;
                if (function1 != null) {
                    function1.invoke(customAlertDialogCallbackType);
                }
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    q1c0Var.G2(iIntValue, w3c0Var.e, w3c0Var.d);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oi8(a.j jVar, e eVar) {
        this.b = jVar;
    }
}
