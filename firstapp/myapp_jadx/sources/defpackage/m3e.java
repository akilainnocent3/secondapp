package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$3", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m3e extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3e(u3e u3eVar, v1b<? super m3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m3e m3eVar = new m3e(this.b, v1bVar);
        m3eVar.a = ((Boolean) obj).booleanValue();
        return m3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((m3e) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        u3e u3eVar = this.b;
        lke lkeVar = u3eVar.i;
        if (z) {
            if (lkeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            lkeVar.e.i.setError(sn5.d(u3eVar, R.string.page_payment__please_enter_a_valid_card_number, new Object[0]));
        } else {
            if (lkeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            lkeVar.e.i.setError(null);
        }
        return Unit.a;
    }
}
