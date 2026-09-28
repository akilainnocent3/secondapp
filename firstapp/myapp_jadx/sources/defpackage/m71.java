package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m71 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        fb1 fb1Var = (fb1) this.receiver;
        t91 t91Var = (t91) fb1Var.X.getValue();
        if (!(t91Var instanceof t91.e) || ((t91.e) t91Var).c != l91.Ongoing.a) {
            fb1Var.A1(l91.Ongoing);
        }
        return Unit.a;
    }
}
