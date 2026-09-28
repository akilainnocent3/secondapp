package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$10", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g3e extends tje0 implements Function2<lod, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3e b;
    public final /* synthetic */ tud c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3e(u3e u3eVar, tud tudVar, v1b<? super g3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
        this.c = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g3e g3eVar = new g3e(this.b, this.c, v1bVar);
        g3eVar.a = obj;
        return g3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lod lodVar, v1b<? super Unit> v1bVar) {
        return ((g3e) create(lodVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lod lodVar = (lod) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lke lkeVar = this.b.i;
        if (lkeVar != null) {
            ow.a(lkeVar.e.c, lodVar, this.c.d.f());
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
