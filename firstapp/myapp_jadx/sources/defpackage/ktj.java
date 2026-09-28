package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ktj implements Function1 {
    public final /* synthetic */ fuj a;
    public final /* synthetic */ long b;

    public /* synthetic */ ktj(fuj fujVar, long j) {
        this.a = fujVar;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1e0 f1e0Var = (f1e0) obj;
        f1e0Var.getClass();
        fuj fujVar = this.a;
        LinkedHashMap linkedHashMap = fujVar.y;
        Long lValueOf = Long.valueOf(this.b);
        String str = f1e0Var.c;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put(lValueOf, str);
        fujVar.z.j(new HashMap<>(linkedHashMap));
        return Unit.a;
    }
}
