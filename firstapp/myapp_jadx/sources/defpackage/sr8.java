package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sr8 {
    public static final op8 a = new op8(759698998, b.a, false);
    public static final op8 b = new op8(486633673, a.a, false);

    public static final class a implements gaj<Function2<? super androidx.compose.runtime.a, ? super Integer, ? extends Unit>, androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

        @Override // defpackage.gaj
        public final Unit invoke(Function2<? super androidx.compose.runtime.a, ? super Integer, ? extends Unit> function2, androidx.compose.runtime.a aVar, Integer num) {
            Function2<? super androidx.compose.runtime.a, ? super Integer, ? extends Unit> function3 = function2;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.A(function3) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                function3.invoke(aVar2, Integer.valueOf(iIntValue & 14));
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class b implements gaj<Function2<? super androidx.compose.runtime.a, ? super Integer, ? extends Unit>, androidx.compose.runtime.a, Integer, Unit> {
        public static final b a = new b();

        @Override // defpackage.gaj
        public final Unit invoke(Function2<? super androidx.compose.runtime.a, ? super Integer, ? extends Unit> function2, androidx.compose.runtime.a aVar, Integer num) {
            Function2<? super androidx.compose.runtime.a, ? super Integer, ? extends Unit> function3 = function2;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.A(function3) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                function3.invoke(aVar2, Integer.valueOf(iIntValue & 14));
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
