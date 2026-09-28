package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qfx implements Function2<a, Integer, Unit> {
    public final /* synthetic */ et60 a;
    public final /* synthetic */ op8 b;

    public qfx(et60 et60Var, op8 op8Var) {
        this.a = et60Var;
        this.b = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        if ((num.intValue() & 3) == 2 && aVar2.j()) {
            aVar2.G();
        } else {
            ip5.b(this.a, this.b, aVar2, 0);
        }
        return Unit.a;
    }
}
