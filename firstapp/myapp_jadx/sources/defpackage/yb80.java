package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class yb80 extends saj implements Function2<Long, dc80, dc80> {
    public static final yb80 a = new yb80(2, cc80.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final dc80 invoke(Long l, dc80 dc80Var) {
        int i = cc80.a;
        return new dc80(l.longValue(), dc80Var, 0);
    }
}
