package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class eke implements Function1<Integer, Object> {
    public final /* synthetic */ qcn a;

    public eke(qcn qcnVar) {
        this.a = qcnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        this.a.get(num.intValue());
        return null;
    }
}
