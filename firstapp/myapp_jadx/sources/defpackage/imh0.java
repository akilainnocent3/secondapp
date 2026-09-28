package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class imh0 {

    public static final class a implements Function1<jmh0, Unit> {
        public final /* synthetic */ Function2<Integer, jmh0, Unit> a;
        public final /* synthetic */ int b;

        public a(int i, Function2 function2) {
            this.a = function2;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(jmh0 jmh0Var) {
            jmh0 jmh0Var2 = jmh0Var;
            jmh0Var2.getClass();
            this.a.invoke(Integer.valueOf(this.b), jmh0Var2);
            return Unit.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ ol9 a;
        public final /* synthetic */ List b;

        public b(ol9 ol9Var, List list) {
            this.a = ol9Var;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
        }
    }

    public static final class c implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public c(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class d implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function2 b;

        public d(List list, Function2 function2) {
            this.a = list;
            this.b = function2;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            boolean z = true;
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                jmh0 jmh0Var = (jmh0) this.a.get(iIntValue);
                aVar2.N(-509065704);
                androidx.compose.ui.d dVarA = androidx.compose.ui.platform.d.a(h.f(androidx.compose.ui.d.a.b, ((cjb0) aVar2.O(ejb0.a)).c), "android:id/game_item");
                Function2 function2 = this.b;
                boolean zM = aVar2.M(function2);
                if ((((i & 112) ^ 48) <= 32 || !aVar2.d(iIntValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z2 = zM | z;
                Object objY = aVar2.y();
                if (z2 || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new a(iIntValue, function2);
                    aVar2.r(objY);
                }
                wjj.a(dVarA, jmh0Var, (Function1) objY, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final androidx.compose.ui.d dVar, tmz tmzVar, final List<jmh0> list, final Function2<? super Integer, ? super jmh0, Unit> function2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        tmz tmzVar2;
        int i3;
        final tmz tmzVar3;
        list.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2115481434);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            tmzVar2 = tmzVar;
        } else {
            tmzVar2 = tmzVar;
            i3 = (bVarI.M(tmzVar2) ? 32 : 16) | i;
        }
        int i5 = i3 | (bVarI.M(list) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            tmz umzVar = i4 != 0 ? new umz(0.0f, 0.0f, 0.0f, 0.0f) : tmzVar2;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new emh0();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = xa80.b(dVar, false, (Function1) objY);
            boolean z = ((i5 & 896) == 256) | ((i5 & 7168) == 2048);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function1() { // from class: fmh0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        ol9 ol9Var = new ol9(1);
                        List list2 = list;
                        szrVar.d(list2.size(), new imh0.b(ol9Var, list2), new imh0.c(list2), new op8(2039820996, new imh0.d(list2, function2), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            tmz tmzVar4 = umzVar;
            aur.b(dVarB, null, tmzVar4, null, null, null, false, null, (Function1) objY2, bVarI, (i5 << 3) & 896, 506);
            tmzVar3 = tmzVar4;
        } else {
            bVarI.G();
            tmzVar3 = tmzVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gmh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    imh0.a(dVar, tmzVar3, list, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
