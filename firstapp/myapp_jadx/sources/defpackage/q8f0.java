package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q8f0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q8f0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((ytw) obj2).setValue(ijf0Var);
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
                    vtw<spg0> vtwVar2 = xqj0Var.m;
                    if (vtwVar2 == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    vpg0.b(vtwVar2, aqg0.a.c);
                }
                return Unit.a;
        }
    }
}
