package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o02 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o02(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                boolean z = ((AlertDialogCallbackType) obj) instanceof AlertDialogCallbackType.Positive;
                ku90<spg0> ku90Var = ((m02) obj2).v;
                if (z) {
                    vpg0.a(ku90Var);
                } else {
                    vpg0.b(ku90Var, aqg0.e.c);
                }
                return Unit.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                mke mkeVar = ((kab0) obj2).m0;
                if (mkeVar == null) {
                    return null;
                }
                mkeVar.S0(iIntValue);
                return Unit.a;
        }
    }
}
