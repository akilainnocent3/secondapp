package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class i90 extends wrz {
    public final dsw c;

    public i90(Function0 function0, dsw dswVar) {
        wrz wrzVar;
        List<Object> list;
        super(2, (function0 == null || (wrzVar = (wrz) function0.invoke()) == null || (list = wrzVar.a) == null) ? new ArrayList() : new ArrayList(list));
        this.c = dswVar;
    }

    @Override // defpackage.wrz
    public final Object a(dq7 dq7Var) {
        return dq7Var.equals(jq40.a(vu60.class)) ? dv60.a(this.c) : super.a(dq7Var);
    }
}
