package defpackage;

import androidx.compose.animation.j;
import androidx.compose.animation.k;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o290 extends qlr implements Function1<y.a, Unit> {
    public final /* synthetic */ j a;
    public final /* synthetic */ y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o290(j jVar, y yVar) {
        super(1);
        this.a = jVar;
        this.b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y.a aVar) {
        y.a aVar2 = aVar;
        j jVar = this.a;
        boolean zA = jVar.E.d().a();
        k kVar = jVar.E;
        y yVar = this.b;
        if (!zA) {
            lk40 lk40VarA = kVar.g().a();
            if (lk40VarA != null) {
                urr urrVarF1 = aVar2.f1();
                long jA = 0;
                if (urrVarF1 != null) {
                    jA = jwo.a(gly.e(lk40VarA.e(), jVar.p2().M(urrVarF1, 0L)));
                }
                aVar2.s(yVar, (int) (jA >> 32), (int) (4294967295L & jA), 0.0f);
            } else {
                aVar2.s(yVar, 0, 0, 0.0f);
            }
        } else if (kVar.d().a() || !jVar.E.g().b()) {
            aVar2.s(yVar, 0, 0, 0.0f);
        }
        return Unit.a;
    }
}
