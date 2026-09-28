package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vq8 {
    public static final op8 a = new op8(657782987, d.a, false);
    public static final op8 b = new op8(-1270442071, a.a, false);
    public static final op8 c;

    public static final class a implements gaj<e160, androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

        @Override // defpackage.gaj
        public final Unit invoke(e160 e160Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (!aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class b implements gaj<e160, androidx.compose.runtime.a, Integer, Unit> {
        public static final b a = new b();

        @Override // defpackage.gaj
        public final Unit invoke(e160 e160Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (!aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public static final c a = new c();

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

    public static final class d implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public static final d a = new d();

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

    static {
        new op8(575301698, c.a, false);
        c = new op8(-643931612, b.a, false);
    }
}
