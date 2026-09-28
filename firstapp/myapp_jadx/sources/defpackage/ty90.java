package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ty90 extends qlr implements Function1<a7l, Unit> {
    public final /* synthetic */ Function0<Boolean> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty90(Function0<Boolean> function0) {
        super(1);
        this.a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7lVar.l(this.a.invoke().booleanValue());
        return Unit.a;
    }
}
