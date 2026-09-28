package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k3c extends qlr implements Function1<a7l, Unit> {
    public final /* synthetic */ twd0<Float> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3c(dtg0.d dVar) {
        super(1);
        this.a = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7lVar.b(this.a.getValue().floatValue());
        return Unit.a;
    }
}
