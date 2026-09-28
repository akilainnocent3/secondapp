package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ksr extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ List<Function2<a, Integer, Unit>> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ksr(List<? extends Function2<? super a, ? super Integer, Unit>> list) {
        super(2);
        this.a = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            List<Function2<a, Integer, Unit>> list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Function2<a, Integer, Unit> function2 = list.get(i);
                int iHashCode = Long.hashCode(aVar2.m());
                yka.k.getClass();
                yka.a.e eVar = yka.a.c;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(eVar);
                } else {
                    aVar2.p();
                }
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                }
                function2.invoke(aVar2, 0);
                aVar2.s();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
