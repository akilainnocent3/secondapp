package androidx.compose.ui.layout;

import defpackage.biv;
import defpackage.kxa;
import defpackage.oxa;
import defpackage.qlr;
import defpackage.tsr;
import defpackage.vhv;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends tsr.e {
    public static final a0 b = new a0("Undefined intrinsics block and it is required");

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
            y.a.C(aVar, this.a, 0, 0);
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
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                y.a.C(aVar2, (y) arrayList.get(i), 0, 0);
            }
            return Unit.a;
        }
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        int size = list.size();
        if (size == 0) {
            return t.z1(tVar, kxa.k(j), kxa.j(j), a.a);
        }
        if (size == 1) {
            y yVarD0 = list.get(0).d0(j);
            return t.z1(tVar, oxa.g(yVarD0.a, j), oxa.f(yVarD0.b, j), new b(yVarD0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            y yVarD1 = list.get(i).d0(j);
            iMax = Math.max(yVarD1.a, iMax);
            iMax2 = Math.max(yVarD1.b, iMax2);
            arrayList.add(yVarD1);
        }
        return t.z1(tVar, oxa.g(iMax, j), oxa.f(iMax2, j), new c(arrayList));
    }
}
