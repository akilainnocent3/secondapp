package defpackage;

import androidx.compose.animation.n;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h490 extends qlr implements Function1<y.a, Unit> {
    public final /* synthetic */ t a;
    public final /* synthetic */ n b;
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h490(t tVar, n nVar, y yVar) {
        super(1);
        this.a = tVar;
        this.b = nVar;
        this.c = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y.a aVar) {
        y.a aVar2 = aVar;
        urr urrVarF1 = aVar2.f1();
        if (urrVarF1 != null) {
            boolean zQ0 = this.a.q0();
            n nVar = this.b;
            if (zQ0) {
                nVar.v = urrVarF1;
            } else {
                nVar.i = urrVarF1;
            }
        }
        aVar2.s(this.c, 0, 0, 0.0f);
        return Unit.a;
    }
}
