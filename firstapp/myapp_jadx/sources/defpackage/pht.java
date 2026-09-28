package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pht implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pht(Object obj, int i) {
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
                git.a aVar = new git.a((ju90) obj2);
                b5 b5Var = (b5) sjj.b().c.d.a(jq40.a(b5.class), null, null);
                b5Var.addAccountUpdatedListener(aVar);
                return new git.c(b5Var, aVar);
            default:
                return Integer.valueOf(((qqi0) ((yui0) obj2).O.getValue()).b.getStepSpin() + ((Integer) obj).intValue());
        }
    }
}
