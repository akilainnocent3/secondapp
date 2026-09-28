package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.betpanel.LNBetPanelKt$LNBetPanel$2$4$1$1", f = "LNBetPanel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r1q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ m2q a;
    public final /* synthetic */ ytw<m2q> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1q(m2q m2qVar, ytw<m2q> ytwVar, v1b<? super r1q> v1bVar) {
        super(2, v1bVar);
        this.a = m2qVar;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r1q(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r1q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        m2q m2qVar = this.a;
        if (m2qVar.s) {
            this.b.setValue(m2qVar);
        }
        return Unit.a;
    }
}
