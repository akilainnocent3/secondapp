package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class btj implements Function1 {
    public final /* synthetic */ fuj a;
    public final /* synthetic */ Long b;

    public /* synthetic */ btj(fuj fujVar, Long l) {
        this.a = fujVar;
        this.b = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1e0 f1e0Var = (f1e0) obj;
        f1e0Var.getClass();
        fuj fujVar = this.a;
        LinkedHashMap linkedHashMap = fujVar.v;
        Long lValueOf = Long.valueOf(this.b.longValue());
        String str = f1e0Var.c;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put(lValueOf, str);
        fujVar.w.j(new HashMap<>(fujVar.v));
        return Unit.a;
    }
}
