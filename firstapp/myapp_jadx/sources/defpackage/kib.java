package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kib implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                return Unit.a;
            default:
                nhf0 nhf0Var = (nhf0) obj;
                Integer numA = nhf0Var.a();
                if (numA == null) {
                    return null;
                }
                int iIntValue = numA.intValue();
                long j = nhf0Var.f;
                int i = ulf0.c;
                return new dmd(0, iIntValue - ((int) (j & 4294967295L)));
        }
    }
}
