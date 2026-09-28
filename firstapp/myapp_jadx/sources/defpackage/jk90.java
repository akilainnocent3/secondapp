package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jk90 extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ bc6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk90(bc6 bc6Var) {
        super(1);
        this.a = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        zi50.a aVar = zi50.b;
        Unit unit = Unit.a;
        this.a.resumeWith(unit);
        return unit;
    }
}
