package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sportybet.android.instantwin.presentation.bethistory2.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p8e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p8e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                boolean z = alertDialogCallbackType instanceof AlertDialogCallbackType.Positive;
                vtw<spg0> vtwVar = ((f9e) obj2).r;
                if (z) {
                    if (vtwVar == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    int i2 = vpg0.a;
                    vtwVar.a(spg0.b.a);
                } else {
                    if (vtwVar == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    vpg0.b(vtwVar, aqg0.e.c);
                }
                return Unit.a;
            default:
                ((Boolean) obj).booleanValue();
                ((Function1) obj2).invoke(a.o.a);
                return Unit.a;
        }
    }
}
