package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class xf implements aiv {
    public final /* synthetic */ int a;

    public xf(int i) {
        this.a = i;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        int i;
        list.getClass();
        final int iY0 = tVar.y0(8.0f);
        final int iY1 = tVar.y0(8.0f);
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((vhv) it.next()).a0(kxa.h(j))));
        }
        Integer num = (Integer) CollectionsKt.e0(arrayList);
        int iIntValue = num != null ? num.intValue() : 0;
        int i2 = kxa.i(j);
        final bq40 bq40Var = new bq40();
        bq40Var.a = this.a;
        while (true) {
            i = bq40Var.a;
            if (i <= 1 || (i2 - ((i - 1) * iY0)) / i >= iIntValue) {
                break;
            }
            bq40Var.a = i - 1;
        }
        final int i3 = (i2 - ((i - 1) * iY0)) / i;
        final ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
        for (vhv vhvVar : list) {
            if (i3 < 0) {
                ykn.a("width must be >= 0");
            }
            arrayList2.add(vhvVar.d0(oxa.h(i3, i3, 0, Reader.READ_DONE)));
        }
        int size = arrayList2.size();
        int i4 = bq40Var.a;
        int i5 = ((size + i4) - 1) / i4;
        y yVar = (y) CollectionsKt.firstOrNull(arrayList2);
        final int i6 = yVar != null ? yVar.b : 0;
        return t.z1(tVar, i2, ((i5 - 1) * iY1) + (i5 * i6), new Function1() { // from class: wf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                aVar.getClass();
                ArrayList arrayList3 = arrayList2;
                int size2 = arrayList3.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList3.get(i8);
                    i8++;
                    int i9 = i7 + 1;
                    if (i7 < 0) {
                        b.q();
                        throw null;
                    }
                    int i10 = bq40Var.a;
                    y.a.A(aVar, (y) obj2, (i3 + iY0) * (i7 % i10), (i6 + iY1) * (i7 / i10));
                    i7 = i9;
                }
                return Unit.a;
            }
        });
    }
}
