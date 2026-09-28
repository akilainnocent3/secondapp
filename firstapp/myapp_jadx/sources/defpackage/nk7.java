package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nk7 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lb80.h((pb80) obj, 1);
                return Unit.a;
            default:
                nhf0 nhf0Var = (nhf0) obj;
                Integer numD = nhf0Var.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j = nhf0Var.f;
                int i = ulf0.c;
                return new dmd(((int) (j & 4294967295L)) - iIntValue, 0);
        }
    }
}
