package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s4w implements Function1<Long, Object> {
    public final /* synthetic */ Function1<Long, Object> a;

    /* JADX WARN: Multi-variable type inference failed */
    public s4w(Function1<? super Long, Object> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Long l) {
        return this.a.invoke(Long.valueOf(l.longValue() / 1000000));
    }
}
