package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class od7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c7i0 c7i0Var = (c7i0) obj;
                c7i0Var.getClass();
                ((td7) obj2).s0(c7i0Var);
                return Unit.a;
            default:
                xqj0 xqj0Var = (xqj0) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType.equals(AlertDialogCallbackType.Negative.a)) {
                    vtw<m480> vtwVar = xqj0Var.n;
                    if (vtwVar == null) {
                        Intrinsics.n("securityUiEventFlow");
                        throw null;
                    }
                    vtwVar.a(m480.b.a);
                }
                return Unit.a;
        }
    }
}
