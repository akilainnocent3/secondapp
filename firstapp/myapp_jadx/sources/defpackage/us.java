package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class us implements aiv {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public us(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void b(ArrayList arrayList, bq40 bq40Var, t tVar, float f, ArrayList arrayList2, ArrayList arrayList3, bq40 bq40Var2, ArrayList arrayList4, bq40 bq40Var3, bq40 bq40Var4) {
        if (!arrayList.isEmpty()) {
            bq40Var.a = tVar.y0(f) + bq40Var.a;
        }
        arrayList.add(0, CollectionsKt.A0(arrayList2));
        arrayList3.add(Integer.valueOf(bq40Var2.a));
        arrayList4.add(Integer.valueOf(bq40Var.a));
        bq40Var.a += bq40Var2.a;
        bq40Var3.a = Math.max(bq40Var3.a, bq40Var4.a);
        arrayList2.clear();
        bq40Var4.a = 0;
        bq40Var2.a = 0;
    }

    @Override // defpackage.aiv
    public final biv c(final t tVar, List<? extends vhv> list, long j) {
        y yVar;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        bq40 bq40Var = new bq40();
        bq40 bq40Var2 = new bq40();
        ArrayList arrayList4 = new ArrayList();
        bq40 bq40Var3 = new bq40();
        bq40 bq40Var4 = new bq40();
        int size = list.size();
        int i = 0;
        while (i < size) {
            y yVarD0 = list.get(i).d0(j);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i2 = size;
            float f = this.a;
            if (zIsEmpty) {
                yVar = yVarD0;
            } else {
                ArrayList arrayList5 = arrayList;
                bq40 bq40Var5 = bq40Var2;
                if (tVar.y0(f) + bq40Var3.a + yVarD0.a <= kxa.i(j)) {
                    arrayList = arrayList5;
                    bq40Var2 = bq40Var5;
                    yVar = yVarD0;
                } else {
                    bq40Var2 = bq40Var5;
                    yVar = yVarD0;
                    arrayList = arrayList5;
                    b(arrayList, bq40Var2, tVar, this.b, arrayList4, arrayList2, bq40Var4, arrayList3, bq40Var, bq40Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                bq40Var3.a = tVar.y0(f) + bq40Var3.a;
            }
            arrayList4.add(yVar);
            bq40Var3.a += yVar.a;
            bq40Var4.a = Math.max(bq40Var4.a, yVar.b);
            i++;
            size = i2;
        }
        if (!arrayList4.isEmpty()) {
            b(arrayList, bq40Var2, tVar, this.b, arrayList4, arrayList2, bq40Var4, arrayList3, bq40Var, bq40Var3);
        }
        final int iMax = Math.max(bq40Var.a, kxa.k(j));
        int iMax2 = Math.max(bq40Var2.a, kxa.j(j));
        final float f2 = this.a;
        return t.z1(tVar, iMax, iMax2, new Function1() { // from class: ts
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                t tVar2;
                y.a aVar = (y.a) obj;
                ArrayList arrayList6 = arrayList;
                int size2 = arrayList6.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    List list2 = (List) arrayList6.get(i3);
                    int size3 = list2.size();
                    int[] iArr = new int[size3];
                    int i4 = 0;
                    while (true) {
                        tVar2 = tVar;
                        if (i4 >= size3) {
                            break;
                        }
                        iArr[i4] = ((y) list2.get(i4)).a + (i4 < list2.size() + (-1) ? tVar2.y0(f2) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size3];
                    if (tVar2.getLayoutDirection() == asr.a) {
                        int i5 = 0;
                        for (int i6 = 0; i6 < size3; i6++) {
                            i5 += iArr[i6];
                        }
                        int i7 = iMax - i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size3) {
                            int i10 = iArr[i8];
                            iArr2[i9] = i7;
                            i7 += i10;
                            i8++;
                            i9++;
                        }
                    } else {
                        int i11 = 0;
                        for (int i12 = size3 - 1; -1 < i12; i12--) {
                            int i13 = iArr[i12];
                            iArr2[i12] = i11;
                            i11 += i13;
                        }
                    }
                    int size4 = list2.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        aVar.s((y) list2.get(i14), iArr2[i14], ((Number) arrayList3.get(i3)).intValue(), 0.0f);
                    }
                }
                return Unit.a;
            }
        });
    }
}
