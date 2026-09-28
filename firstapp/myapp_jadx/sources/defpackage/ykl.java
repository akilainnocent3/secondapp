package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ykl extends qlr implements Function1<Object, j8i0> {
    public final /* synthetic */ Function1<Object, j8i0> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ykl(Function1<Object, ? extends j8i0> function1) {
        super(1);
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j8i0 invoke(Object obj) {
        return this.a.invoke(obj);
    }
}
