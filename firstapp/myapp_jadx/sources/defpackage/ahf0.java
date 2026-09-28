package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ahf0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nhf0 nhf0Var = (nhf0) obj;
        Integer numB = nhf0Var.b();
        if (numB == null) {
            return null;
        }
        int iIntValue = numB.intValue();
        long j = nhf0Var.f;
        int i = ulf0.c;
        return new dmd(((int) (j & 4294967295L)) - iIntValue, 0);
    }
}
