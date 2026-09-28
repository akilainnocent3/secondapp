package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class noe extends qlr implements Function0<Unit> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ twa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noe(ytw ytwVar, twa twaVar) {
        super(0);
        this.a = ytwVar;
        this.b = twaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ytw ytwVar = this.a;
        ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
        this.b.d = true;
        return Unit.a;
    }
}
