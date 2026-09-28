package defpackage;

import com.sportygames.vip.data.TurboUsageCountResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ix2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ix2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((use) obj).getClass();
                return new jx2.e((ga60) obj2);
            default:
                qub0 qub0Var = (qub0) obj2;
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    return Unit.a;
                }
                try {
                    TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) new eal().e(str, TurboUsageCountResponse.class);
                    if (turboUsageCountResponse == null) {
                        return Unit.a;
                    }
                    if (qub0Var.S3()) {
                        qub0Var.p3 = turboUsageCountResponse;
                        return Unit.a;
                    }
                    qub0Var.p3 = null;
                    ((x5a0) gci0.c).setValue(turboUsageCountResponse);
                    qub0Var.s4();
                    qub0Var.R3(turboUsageCountResponse);
                    return Unit.a;
                } catch (Exception unused) {
                }
                break;
        }
    }
}
