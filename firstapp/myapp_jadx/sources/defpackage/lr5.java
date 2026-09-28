package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class lr5 extends qlr implements Function0<Unit> {
    public final /* synthetic */ kr5 a;
    public final /* synthetic */ mr5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr5(kr5 kr5Var, mr5 mr5Var) {
        super(0);
        this.a = kr5Var;
        this.b = mr5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.G.invoke(this.b);
        return Unit.a;
    }
}
