package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z4f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z4f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(v4f.d);
                return Unit.a;
            default:
                rj60 rj60Var = (rj60) obj;
                Function0<Unit> function0 = rj60Var.b;
                if (function0 == null) {
                    Intrinsics.n("dismissListener");
                    throw null;
                }
                function0.invoke();
                rj60Var.dismiss();
                return Unit.a;
        }
    }
}
