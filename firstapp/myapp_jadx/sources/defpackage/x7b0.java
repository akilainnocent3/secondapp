package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x7b0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7b0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b8b0 b8b0Var = (b8b0) obj;
                b8b0Var.g0 = 1;
                fm1 fm1Var = (fm1) b8b0Var.a;
                if (fm1Var == null) {
                    return null;
                }
                fm1Var.z1();
                return Unit.a;
            default:
                ((Function1) obj).invoke(qve0.e.a);
                return Unit.a;
        }
    }
}
