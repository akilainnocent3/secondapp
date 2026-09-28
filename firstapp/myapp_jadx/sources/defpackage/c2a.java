package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c2a {
    public static final op8 a = new op8(-1759434350, a.a, false);

    public static final class a extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (!aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
