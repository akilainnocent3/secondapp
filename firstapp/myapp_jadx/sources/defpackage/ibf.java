package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ibf implements Function1<a7l, Unit> {
    public final /* synthetic */ fcf a;
    public final /* synthetic */ int b;

    public ibf(int i, fcf fcfVar) {
        this.a = fcfVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7l a7lVar2 = a7lVar;
        a7lVar2.getClass();
        a7lVar2.f(this.a.f.get(this.b).d().floatValue());
        return Unit.a;
    }
}
