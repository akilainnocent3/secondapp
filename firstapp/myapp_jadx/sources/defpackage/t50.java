package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t50 extends qlr implements Function1<use, tse> {
    public final /* synthetic */ ate a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(ate ateVar) {
        super(1);
        this.a = ateVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final tse invoke(use useVar) {
        return new s50(this.a);
    }
}
