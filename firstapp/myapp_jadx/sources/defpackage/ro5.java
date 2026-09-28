package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ro5 implements Function1 {
    public final /* synthetic */ to5 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ro5(to5 to5Var, ArrayList arrayList, Function1 function1) {
        this.a = to5Var;
        this.b = arrayList;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HashMap map = (HashMap) obj;
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(odd.b), null, null, new to5.a.C1141a(this.a, map, this.b, this.c, null), 3);
        return Unit.a;
    }
}
