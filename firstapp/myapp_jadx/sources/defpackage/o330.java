package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o330 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hpp.b bVar = (hpp.b) obj;
        bVar.a = 6000;
        Float fValueOf = Float.valueOf(90.0f);
        bVar.a(300, fValueOf).b = e6w.b;
        bVar.a(1500, fValueOf);
        Float fValueOf2 = Float.valueOf(180.0f);
        bVar.a(1800, fValueOf2);
        bVar.a(3000, fValueOf2);
        Float fValueOf3 = Float.valueOf(270.0f);
        bVar.a(3300, fValueOf3);
        bVar.a(4500, fValueOf3);
        Float fValueOf4 = Float.valueOf(360.0f);
        bVar.a(4800, fValueOf4);
        bVar.a(6000, fValueOf4);
        return Unit.a;
    }
}
