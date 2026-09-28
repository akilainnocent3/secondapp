package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$9", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s3e extends tje0 implements Function2<xyx, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3e(u3e u3eVar, v1b<? super s3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s3e s3eVar = new s3e(this.b, v1bVar);
        s3eVar.a = obj;
        return s3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xyx xyxVar, v1b<? super Unit> v1bVar) {
        return ((s3e) create(xyxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        xyx xyxVar = (xyx) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lke lkeVar = this.b.i;
        if (lkeVar != null) {
            ow.b(lkeVar.e.c, xyxVar);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
