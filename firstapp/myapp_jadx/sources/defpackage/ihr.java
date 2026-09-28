package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamTicketViewKt$LNStreamTicketView$1$1$1", f = "LNStreamTicketView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ihr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ khr b;
    public final /* synthetic */ ytw<khr> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihr(boolean z, khr khrVar, ytw<khr> ytwVar, v1b<? super ihr> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = khrVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ihr(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ihr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.a) {
            float f = jhr.b;
            this.c.setValue(this.b);
        }
        return Unit.a;
    }
}
