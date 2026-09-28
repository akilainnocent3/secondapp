package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class zoq implements aiv {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public zoq(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        list.getClass();
        final y yVarD0 = ((vhv) CollectionsKt.T(list)).d0(kxa.b(0, 0, 0, ycv.b(this.a), 3, j));
        final int iB = ycv.b(this.b);
        return t.z1(tVar, yVarD0.a, iB, new Function1() { // from class: yoq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                aVar.getClass();
                y yVar = yVarD0;
                aVar.s(yVar, 0, iB - yVar.b, 0.0f);
                return Unit.a;
            }
        });
    }
}
