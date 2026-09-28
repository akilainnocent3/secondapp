package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kgn {
    public static final egn.a a(final egn egnVar, float f, float f2, final cgn cgnVar, String str, a aVar, int i, int i2) {
        final Float fValueOf = Float.valueOf(f);
        final Float fValueOf2 = Float.valueOf(f2);
        int i3 = i & 1022;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 57344) | (i4 & 458752);
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (objY == obj) {
            objY = new egn.a(egnVar, fValueOf, fValueOf2, cgnVar);
            aVar.r(objY);
        }
        final egn.a aVar2 = (egn.a) objY;
        boolean z = ((((i5 & 112) ^ 48) > 32 && aVar.A(fValueOf)) || (i5 & 48) == 32) | ((((i5 & 896) ^ 384) > 256 && aVar.A(fValueOf2)) || (i5 & 384) == 256) | ((((57344 & i5) ^ 24576) > 16384 && aVar.A(cgnVar)) || (i5 & 24576) == 16384);
        Object objY2 = aVar.y();
        if (z || objY2 == obj) {
            objY2 = new Function0() { // from class: hgn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    egn.a aVar3 = aVar2;
                    Float f3 = aVar3.a;
                    Float f4 = fValueOf;
                    boolean zEquals = f4.equals(f3);
                    Float f5 = fValueOf2;
                    if (!zEquals || !f5.equals(aVar3.b)) {
                        aVar3.a = f4;
                        aVar3.b = f5;
                        cgn cgnVar2 = cgnVar;
                        aVar3.d = cgnVar2;
                        aVar3.e = new g5f0<>(cgnVar2, gjs.b, f4, f5, null);
                        ((x5a0) aVar3.w.b).setValue(Boolean.TRUE);
                        aVar3.f = false;
                        aVar3.i = true;
                    }
                    return Unit.a;
                }
            };
            aVar.r(objY2);
        }
        use useVar = xvf.a;
        aVar.t((Function0) objY2);
        boolean zA = aVar.A(egnVar);
        Object objY3 = aVar.y();
        if (zA || objY3 == obj) {
            objY3 = new Function1() { // from class: ign
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    egn egnVar2 = egnVar;
                    duw<egn.a<?, ?>> duwVar = egnVar2.a;
                    egn.a aVar3 = aVar2;
                    duwVar.b(aVar3);
                    ((x5a0) egnVar2.b).setValue(Boolean.TRUE);
                    return new jgn(egnVar2, aVar3);
                }
            };
            aVar.r(objY3);
        }
        xvf.c(aVar2, (Function1) objY3, aVar);
        return aVar2;
    }

    public static final egn b(String str, a aVar, int i) {
        Object objY = aVar.y();
        if (objY == a.C0041a.a) {
            objY = new egn();
            aVar.r(objY);
        }
        egn egnVar = (egn) objY;
        egnVar.a(0, aVar);
        return egnVar;
    }
}
