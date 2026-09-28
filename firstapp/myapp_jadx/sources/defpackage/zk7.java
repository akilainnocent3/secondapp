package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zk7 implements Function1 {
    public final /* synthetic */ cl7 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double d = (Double) obj;
        d.getClass();
        Function1<? super Double, Unit> function1 = this.a.d;
        if (function1 != null) {
            function1.invoke(d);
            return Unit.a;
        }
        Intrinsics.n("betChipAddListener");
        throw null;
    }
}
