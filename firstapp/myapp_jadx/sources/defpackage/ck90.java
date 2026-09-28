package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ck90 implements aiv {
    public static final ck90 a = new ck90();

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            y yVarD0 = list.get(i).d0(j);
            iMax = Math.max(iMax, yVarD0.a);
            iMax2 = Math.max(iMax2, yVarD0.b);
            arrayList.add(yVarD0);
        }
        return t.z1(tVar, iMax, iMax2, new Function1() { // from class: bk90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aVar.s((y) arrayList2.get(i2), 0, 0, 0.0f);
                }
                return Unit.a;
            }
        });
    }
}
