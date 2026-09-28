package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zi60 implements Function1 {
    public final /* synthetic */ ij60 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        ij60 ij60Var = this.a;
        xi60.a aVar = ij60Var.d;
        ao80 ao80Var = ij60Var.b;
        if (aVar == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        aVar.n = str;
        ao80Var.w.setText(str);
        ao80Var.w.setSelection(str.length());
        return Unit.a;
    }
}
