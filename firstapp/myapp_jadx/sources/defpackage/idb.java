package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class idb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ idb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 100) {
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new ahb(fgbVar, null), 3);
                }
                return Unit.a;
            default:
                xqj0 xqj0Var = (xqj0) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    vtw<spg0> vtwVar = xqj0Var.m;
                    if (vtwVar == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    vpg0.a(vtwVar);
                } else if (alertDialogCallbackType instanceof AlertDialogCallbackType.Negative) {
                    vtw<a> vtwVar2 = xqj0Var.l;
                    if (vtwVar2 == null) {
                        Intrinsics.n("commonUiEventFlow");
                        throw null;
                    }
                    b.c(vtwVar2, snb0.WITHDRAW);
                }
                return Unit.a;
        }
    }
}
