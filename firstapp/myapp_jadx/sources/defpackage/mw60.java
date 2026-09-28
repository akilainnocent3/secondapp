package defpackage;

import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mw60 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mw60(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j58 j58Var;
        switch (this.a) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i = j58.n;
                uv60 uv60Var = kx60.a;
                Boolean bool = Boolean.FALSE;
                Intrinsics.g(obj2, bool);
                if (obj2 != null) {
                    j58Var = Intrinsics.g(obj2, Boolean.FALSE) ? new j58(j58.m) : new j58(r58.b(((Integer) obj2).intValue()));
                } else {
                    j58Var = null;
                }
                j58Var.getClass();
                long j = j58Var.a;
                Object obj3 = list.get(1);
                lx60 lx60Var = kx60.t;
                Intrinsics.g(obj3, bool);
                gly glyVar = obj3 != null ? (gly) lx60Var.b.invoke(obj3) : null;
                glyVar.getClass();
                long j2 = glyVar.a;
                Object obj4 = list.get(2);
                Float f = obj4 != null ? (Float) obj4 : null;
                f.getClass();
                return new ix80(f.floatValue(), j, j2);
            default:
                qhj0 qhj0Var = (qhj0) obj;
                qhj0Var.getClass();
                return new WithdrawAlertHintStatus.DropAlert.IntInfra(qhj0Var.c);
        }
    }
}
