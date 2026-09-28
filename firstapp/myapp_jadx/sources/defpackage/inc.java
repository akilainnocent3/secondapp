package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class inc {
    public static final void a(final TimePickerItem timePickerItem, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1974642387);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(timePickerItem) : bVarI.A(timePickerItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = com.sporty.android.book.presentation.sportsmenu.time.a.a(context, false);
                bVarI.r(objY);
            }
            final List list = (List) objY;
            d dVarG = j.g(j.A(d.a.b, null, 3), 1.0f);
            umz umzVar = new umz(12.0f, 16.0f, 12.0f, 16.0f);
            boolean zA = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(timePickerItem))) | bVarI.A(list) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: dnc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final List list2 = list;
                        int size = list2.size();
                        final TimePickerItem timePickerItem2 = timePickerItem;
                        final Function1 function2 = function1;
                        szr.f(szrVar, size, null, new op8(-1933929601, new iaj() { // from class: fnc
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2;
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gwr) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar3.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    final TimePickerItem timePickerItem3 = (TimePickerItem) list2.get(iIntValue);
                                    d.a aVar4 = d.a.b;
                                    TimePickerItem timePickerItem4 = timePickerItem2;
                                    final Function1 function3 = function2;
                                    a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                    if (timePickerItem4 == null || !timePickerItem4.isSameAs(timePickerItem3)) {
                                        aVar3.N(-1004986616);
                                        d dVarA = j.a(aVar4, 100.0f, 34.0f);
                                        String name = timePickerItem3.getName();
                                        boolean zM = aVar3.M(function3) | aVar3.A(timePickerItem3);
                                        Object objY3 = aVar3.y();
                                        if (zM || objY3 == c0042a2) {
                                            objY3 = new Function0() { // from class: hnc
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function3.invoke(timePickerItem3);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar3.r(objY3);
                                        }
                                        w280.a(3078, 4, aVar3, dVarA, name, (Function0) objY3, false, true);
                                        aVar2 = aVar3;
                                        aVar2.H();
                                    } else {
                                        aVar3.N(-1005334870);
                                        d dVarA2 = j.a(aVar4, 100.0f, 34.0f);
                                        aVar2 = aVar3;
                                        String name2 = timePickerItem3.getName();
                                        boolean zM2 = aVar2.M(function3);
                                        Object objY4 = aVar2.y();
                                        if (zM2 || objY4 == c0042a2) {
                                            objY4 = new gnc(0, function3);
                                            aVar2.r(objY4);
                                        }
                                        hr20.a(dVarA2, null, name2, false, true, false, (Function0) objY4, aVar2, 24582, 42);
                                        aVar2.H();
                                    }
                                    ty0.a(aVar2, j.w(aVar4, 8.0f));
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, true), 6);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            aur.b(dVarG, null, umzVar, null, null, null, false, null, (Function1) objY2, bVarI, 390, 506);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: enc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    inc.a(timePickerItem, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
