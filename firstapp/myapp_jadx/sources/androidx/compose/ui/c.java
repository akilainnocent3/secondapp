package androidx.compose.ui;

import defpackage.gaj;
import defpackage.knn;
import defpackage.qlr;
import defpackage.y8h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a extends qlr implements Function1<d.b, Boolean> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(d.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    public static final class b extends qlr implements Function2<d, d.b, d> {
        public final /* synthetic */ androidx.compose.runtime.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.runtime.a aVar) {
            super(2);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final d invoke(d dVar, d.b bVar) {
            d dVar2 = dVar;
            d.b bVarB = bVar;
            if (bVarB instanceof androidx.compose.ui.b) {
                gaj<d, androidx.compose.runtime.a, Integer, d> gajVar = ((androidx.compose.ui.b) bVarB).c;
                y8h0.d(3, gajVar);
                d.a aVar = d.a.b;
                androidx.compose.runtime.a aVar2 = this.a;
                bVarB = c.b(aVar2, gajVar.invoke(aVar, aVar2, 0));
            }
            return dVar2.n(bVarB);
        }
    }

    public static final d a(d dVar, Function1<? super knn, Unit> function1, gaj<? super d, ? super androidx.compose.runtime.a, ? super Integer, ? extends d> gajVar) {
        return dVar.n(new androidx.compose.ui.b(function1, gajVar));
    }

    public static final d b(androidx.compose.runtime.a aVar, d dVar) {
        if (dVar.c(a.a)) {
            return dVar;
        }
        aVar.x(1219399079);
        d dVar2 = (d) dVar.b(d.a.b, new b(aVar));
        aVar.L();
        return dVar2;
    }

    public static final d c(androidx.compose.runtime.a aVar, d dVar) {
        aVar.N(439770924);
        d dVarB = b(aVar, dVar);
        aVar.H();
        return dVarB;
    }
}
