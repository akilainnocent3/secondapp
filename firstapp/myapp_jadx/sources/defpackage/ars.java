package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ars extends qlr implements Function0<Unit> {
    public final /* synthetic */ brs<Object, Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ars(brs<Object, Object> brsVar) {
        super(0);
        this.a = brsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.n(true);
        return Unit.a;
    }
}
