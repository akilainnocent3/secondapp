package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zgf0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nhf0 nhf0Var = (nhf0) obj;
        Integer numC = nhf0Var.c();
        if (numC == null) {
            return null;
        }
        int iIntValue = numC.intValue();
        long j = nhf0Var.f;
        int i = ulf0.c;
        return new dmd(0, iIntValue - ((int) (j & 4294967295L)));
    }
}
