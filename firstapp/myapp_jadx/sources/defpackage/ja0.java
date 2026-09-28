package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ja0 implements aiv {
    public static final ja0 a = new ja0();

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar) {
            super(1);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a.A(aVar, this.a, 0, 0);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ ArrayList a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a aVar2 = aVar;
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    y.a.A(aVar2, (y) arrayList.get(i), 0, 0);
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            return Unit.a;
        }
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        int size = list.size();
        if (size == 0) {
            return t.z1(tVar, 0, 0, a.a);
        }
        if (size == 1) {
            y yVarD0 = list.get(0).d0(j);
            return t.z1(tVar, yVarD0.a, yVarD0.b, new b(yVarD0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            y yVarD1 = list.get(i).d0(j);
            iMax = Math.max(iMax, yVarD1.a);
            iMax2 = Math.max(iMax2, yVarD1.b);
            arrayList.add(yVarD1);
        }
        return t.z1(tVar, iMax, iMax2, new c(arrayList));
    }
}
