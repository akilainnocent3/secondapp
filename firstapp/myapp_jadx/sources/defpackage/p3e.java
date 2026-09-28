package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$6", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p3e extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3e(u3e u3eVar, v1b<? super p3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p3e p3eVar = new p3e(this.b, v1bVar);
        p3eVar.a = obj;
        return p3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((p3e) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (str == null) {
            str = "";
        }
        u3e u3eVar = this.b;
        lke lkeVar = u3eVar.i;
        if (lkeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (Intrinsics.g(lkeVar.e.w.getText(), str)) {
            return Unit.a;
        }
        lke lkeVar2 = u3eVar.i;
        if (lkeVar2 != null) {
            lkeVar2.e.w.setText(str);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
