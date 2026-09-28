package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dlt extends qlr implements Function1<pt, Unit> {
    public static final dlt a = new dlt(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(pt ptVar) {
        pt ptVar2 = ptVar;
        ptVar2.s().e = ptVar2.s().d;
        return Unit.a;
    }
}
