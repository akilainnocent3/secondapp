package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jif implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                wae waeVar = (wae) obj;
                int i = sif.k1;
                waeVar.getClass();
                sh8.c().e(o7d.a(waeVar));
                return Unit.a;
            default:
                return Integer.valueOf(-((Integer) obj).intValue());
        }
    }
}
