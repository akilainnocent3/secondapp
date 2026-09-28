package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gnn {
    public static final a a = a.a;

    public static final class a extends qlr implements Function1<knn, Unit> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(knn knnVar) {
            return Unit.a;
        }
    }

    public static final d a(d dVar, Function1<? super knn, Unit> function1, d dVar2) {
        fnn fnnVar = new fnn(function1);
        return dVar.n(fnnVar).n(dVar2).n(fnnVar.c);
    }
}
