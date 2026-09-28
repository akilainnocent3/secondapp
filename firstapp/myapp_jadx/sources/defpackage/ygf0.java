package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ygf0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nhf0 nhf0Var = (nhf0) obj;
        String str = nhf0Var.g.b;
        long j = nhf0Var.f;
        int i = ulf0.c;
        int iA = j020.a((int) (j & 4294967295L), str);
        if (iA != -1) {
            return new dmd(0, iA - ((int) (nhf0Var.f & 4294967295L)));
        }
        return null;
    }
}
