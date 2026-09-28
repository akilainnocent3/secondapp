package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ky8 {
    public static final op8 a = new op8(636288403, b.a, false);
    public static final op8 b = new op8(-1357803046, a.a, false);

    public static final class a implements jaj<tef0, bef0, Function0<? extends urr>, androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

        @Override // defpackage.jaj
        public final Unit l(tef0 tef0Var, bef0 bef0Var, Function0<? extends urr> function0, androidx.compose.runtime.a aVar, Integer num) {
            int i;
            tef0 tef0Var2 = tef0Var;
            bef0 bef0Var2 = bef0Var;
            Function0<? extends urr> function1 = function0;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i = ((iIntValue & 8) == 0 ? aVar2.M(tef0Var2) : aVar2.A(tef0Var2) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= (iIntValue & 64) == 0 ? aVar2.M(bef0Var2) : aVar2.A(bef0Var2) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i |= aVar2.A(function1) ? 256 : 128;
            }
            if (aVar2.q(i & 1, (i & 1171) != 1170)) {
                vhd.c(tef0Var2, bef0Var2, function1, aVar2, i & 1022);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class b implements jaj<tef0, bef0, Function0<? extends urr>, androidx.compose.runtime.a, Integer, Unit> {
        public static final b a = new b();

        @Override // defpackage.jaj
        public final Unit l(tef0 tef0Var, bef0 bef0Var, Function0<? extends urr> function0, androidx.compose.runtime.a aVar, Integer num) {
            int i;
            tef0 tef0Var2 = tef0Var;
            bef0 bef0Var2 = bef0Var;
            Function0<? extends urr> function1 = function0;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i = ((iIntValue & 8) == 0 ? aVar2.M(tef0Var2) : aVar2.A(tef0Var2) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= (iIntValue & 64) == 0 ? aVar2.M(bef0Var2) : aVar2.A(bef0Var2) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i |= aVar2.A(function1) ? 256 : 128;
            }
            if (aVar2.q(i & 1, (i & 1171) != 1170)) {
                vhd.c(tef0Var2, bef0Var2, function1, aVar2, i & 1022);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
