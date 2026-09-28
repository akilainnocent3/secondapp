package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d3f0 implements z8w {
    public final /* synthetic */ e3f0 a;

    public d3f0(e3f0 e3f0Var) {
        this.a = e3f0Var;
    }

    @Override // defpackage.z8w
    public final biv c(t tVar, List<? extends List<? extends vhv>> list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i = kxa.i(j);
        int size = list2.size();
        final bq40 bq40Var = new bq40();
        if (size > 0) {
            bq40Var.a = i / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf = Integer.valueOf(Math.max(((vhv) list2.get(i2)).x(bq40Var.a), numValueOf.intValue()));
        }
        final int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new z1f0(tVar.u1(bq40Var.a) * i3, tVar.u1(bq40Var.a), ((g7f) wl8.d(new g7f(tVar.u1(Math.min(((vhv) list2.get(i3)).b0(iIntValue), bq40Var.a)) - (w1f0.b * 2.0f)), new g7f(24.0f))).a));
        }
        ((x5a0) this.a.a).setValue(arrayList2);
        final ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            vhv vhvVar = (vhv) list2.get(i4);
            int i5 = bq40Var.a;
            arrayList3.add(vhvVar.d0(kxa.a(i5, i5, iIntValue, iIntValue)));
        }
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i6 = 0; i6 < size4; i6++) {
            arrayList4.add(((vhv) list3.get(i6)).d0(kxa.b(0, 0, 0, 0, 11, j)));
        }
        final ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i7 = 0; i7 < size5; i7++) {
            vhv vhvVar2 = (vhv) list4.get(i7);
            int i8 = bq40Var.a;
            arrayList5.add(vhvVar2.d0(kxa.a(i8, i8, 0, iIntValue)));
        }
        return t.z1(tVar, i, iIntValue, new Function1() { // from class: c3f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i9;
                y.a aVar = (y.a) obj;
                ArrayList arrayList6 = arrayList3;
                int size6 = arrayList6.size();
                for (int i10 = 0; i10 < size6; i10++) {
                    y.a.A(aVar, (y) arrayList6.get(i10), bq40Var.a * i10, 0);
                }
                ArrayList arrayList7 = arrayList4;
                int size7 = arrayList7.size();
                int i11 = 0;
                while (true) {
                    i9 = iIntValue;
                    if (i11 >= size7) {
                        break;
                    }
                    y yVar = (y) arrayList7.get(i11);
                    y.a.A(aVar, yVar, 0, i9 - yVar.b);
                    i11++;
                }
                ArrayList arrayList8 = arrayList5;
                int size8 = arrayList8.size();
                for (int i12 = 0; i12 < size8; i12++) {
                    y yVar2 = (y) arrayList8.get(i12);
                    y.a.A(aVar, yVar2, 0, i9 - yVar2.b);
                }
                return Unit.a;
            }
        });
    }
}
