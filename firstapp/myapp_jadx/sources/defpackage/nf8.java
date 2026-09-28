package defpackage;

import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nf8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nf8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                qc qcVar = ((CommonMobileMoneyWithdrawActivity) obj2).d;
                if (qcVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ProgressButton progressButton = qcVar.I;
                bool.getClass();
                progressButton.setLoading(bool.booleanValue());
                return Unit.a;
            default:
                ytw ytwVar = (ytw) obj2;
                ((Boolean) obj).getClass();
                ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                return Unit.a;
        }
    }
}
