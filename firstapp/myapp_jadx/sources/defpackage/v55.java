package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v55 implements z8w {
    public final /* synthetic */ j590 a;
    public final /* synthetic */ Function0<Float> b;

    public v55(j590 j590Var, Function0<Float> function0) {
        this.a = j590Var;
        this.b = function0;
    }

    @Override // defpackage.z8w
    public final biv c(t tVar, List<? extends List<? extends vhv>> list, long j) {
        Integer numValueOf;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        final int i2 = kxa.i(j);
        final int iH = kxa.h(j);
        long jB = kxa.b(0, 0, 0, 0, 10, j);
        final ArrayList arrayList2 = new ArrayList(list4.size());
        int size = list4.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((vhv) list4.get(i3)).d0(jB));
        }
        final ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList3.add(((vhv) list2.get(i4)).d0(jB));
        }
        if (!arrayList3.isEmpty()) {
            numValueOf = Integer.valueOf(((y) arrayList3.get(0)).b);
            int size3 = arrayList3.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((y) arrayList3.get(i)).b);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i == size3) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        long jB2 = kxa.b(0, 0, 0, iH - iIntValue, 7, jB);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList4.add(((vhv) list3.get(i5)).d0(jB2));
        }
        final ArrayList arrayList5 = new ArrayList(list5.size());
        int size5 = list5.size();
        for (int i6 = 0; i6 < size5; i6++) {
            arrayList5.add(((vhv) list5.get(i6)).d0(jB));
        }
        final j590 j590Var = this.a;
        final Function0<Float> function0 = this.b;
        return t.z1(tVar, i2, iH, new Function1() { // from class: u55
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer numValueOf3;
                Integer numValueOf4;
                Integer numValueOf5;
                int iB;
                y.a aVar = (y.a) obj;
                ArrayList arrayList6 = arrayList2;
                if (!arrayList6.isEmpty()) {
                    numValueOf3 = Integer.valueOf(((y) arrayList6.get(0)).a);
                    int size6 = arrayList6.size() - 1;
                    if (1 <= size6) {
                        int i7 = 1;
                        while (true) {
                            Integer numValueOf6 = Integer.valueOf(((y) arrayList6.get(i7)).a);
                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                numValueOf3 = numValueOf6;
                            }
                            if (i7 == size6) {
                                break;
                            }
                            i7++;
                        }
                    }
                } else {
                    numValueOf3 = null;
                }
                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                int i8 = i2;
                int iMax = Math.max(0, (i8 - iIntValue2) / 2);
                ArrayList arrayList7 = arrayList5;
                if (!arrayList7.isEmpty()) {
                    numValueOf4 = Integer.valueOf(((y) arrayList7.get(0)).a);
                    int size7 = arrayList7.size() - 1;
                    if (1 <= size7) {
                        int i9 = 1;
                        while (true) {
                            Integer numValueOf7 = Integer.valueOf(((y) arrayList7.get(i9)).a);
                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf7;
                            }
                            if (i9 == size7) {
                                break;
                            }
                            i9++;
                        }
                    }
                } else {
                    numValueOf4 = null;
                }
                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                if (!arrayList7.isEmpty()) {
                    numValueOf5 = Integer.valueOf(((y) arrayList7.get(0)).b);
                    int size8 = arrayList7.size() - 1;
                    if (1 <= size8) {
                        int i10 = 1;
                        while (true) {
                            Integer numValueOf8 = Integer.valueOf(((y) arrayList7.get(i10)).b);
                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                numValueOf5 = numValueOf8;
                            }
                            if (i10 == size8) {
                                break;
                            }
                            i10++;
                        }
                    }
                } else {
                    numValueOf5 = null;
                }
                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                int i11 = (i8 - iIntValue3) / 2;
                int iOrdinal = j590Var.c().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iB = iH;
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    iB = ycv.b(((Number) function0.invoke()).floatValue());
                }
                int i12 = iB - iIntValue4;
                ArrayList arrayList8 = arrayList4;
                int size9 = arrayList8.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    y.a.A(aVar, (y) arrayList8.get(i13), 0, iIntValue);
                }
                ArrayList arrayList9 = arrayList3;
                int size10 = arrayList9.size();
                for (int i14 = 0; i14 < size10; i14++) {
                    y.a.A(aVar, (y) arrayList9.get(i14), 0, 0);
                }
                int size11 = arrayList6.size();
                for (int i15 = 0; i15 < size11; i15++) {
                    y.a.A(aVar, (y) arrayList6.get(i15), iMax, 0);
                }
                int size12 = arrayList7.size();
                for (int i16 = 0; i16 < size12; i16++) {
                    y.a.A(aVar, (y) arrayList7.get(i16), i11, i12);
                }
                return Unit.a;
            }
        });
    }
}
