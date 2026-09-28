package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jv8 {
    public static final op8 a = new op8(954879418, b.a, false);
    public static final op8 b = new op8(1918065384, a.a, false);

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

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

    public static final class b implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public static final b a = new b();

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
