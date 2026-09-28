package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pr70 {
    public static final void a(d dVar, final List list, final int i, final Function1 function1, a aVar, final int i2) {
        final d dVar2;
        b bVarI = aVar.i(1248935436);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            dVar2 = aVar2;
            j3f0.b(i < 0 ? 0 : i, null, c68.a(R.color.background_cashout_card, bVarI), 0L, 12.0f, pp8.b(-508575114, new gaj() { // from class: kr70
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list2 = (List) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    list2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list2) : aVar4.A(list2) ? 4 : 2;
                    }
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int i4 = i;
                        if (i4 < 0 || i4 >= list2.size()) {
                            return Unit.a;
                        }
                        i2f0.a.a(i2f0.d((z1f0) list2.get(i4)), 0.0f, c68.a(R.color.brand_quaternary, aVar4), aVar4, 3072, 2);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), lo9.a, pp8.b(1033850998, new Function2() { // from class: lr70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                        final int i4 = 0;
                        for (Object obj3 : list2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            String str = (String) obj3;
                            boolean z = i4 == i;
                            long jA = c68.a(R.color.text_type1_primary, aVar4);
                            long jA2 = c68.a(R.color.text_type1_secondary, aVar4);
                            final Function1 function2 = function1;
                            boolean zM = aVar4.M(function2) | aVar4.d(i4);
                            Object objY = aVar4.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: nr70
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(Integer.valueOf(i4));
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY);
                            }
                            w1f0.b(z, (Function0) objY, null, false, pp8.b(1238106268, new or70(str, 0), aVar4), jA, jA2, aVar4, 24576, 300);
                            arrayList.add(Unit.a);
                            i4 = i5;
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 14376960, 10);
            bVarI = bVarI;
            ute.a(j.i(dVar2, 1.0f), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mr70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pr70.a(dVar2, list, i, function1, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
