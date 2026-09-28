package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x520 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x520(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m420 m420Var = (m420) obj;
                m420Var.getClass();
                return Boolean.valueOf(Intrinsics.g(m420Var.b, (String) obj2));
            default:
                zxq zxqVar = (zxq) obj;
                zxqVar.getClass();
                ((Function1) obj2).invoke(zxqVar);
                return Unit.a;
        }
    }
}
