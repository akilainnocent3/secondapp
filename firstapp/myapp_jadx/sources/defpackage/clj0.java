package defpackage;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawConfirmDialogFragment$initViewModel$1$2", f = "WithdrawConfirmDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class clj0 extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ elj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clj0(elj0 elj0Var, v1b<? super clj0> v1bVar) {
        super(2, v1bVar);
        this.b = elj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        clj0 clj0Var = new clj0(this.b, v1bVar);
        clj0Var.a = obj;
        return clj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
        return ((clj0) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tzs tzsVar = (tzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(tzsVar, tzs.b.a);
        elj0 elj0Var = this.b;
        if (zG) {
            fme fmeVar = elj0Var.i;
            if (fmeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            b330.a(fmeVar.e, c330.b.a);
            fme fmeVar2 = elj0Var.i;
            if (fmeVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar2.d.setEnabled(false);
            elj0.a aVar = elj0Var.v;
            if (aVar != null) {
                aVar.f(true);
            }
            Dialog dialog = elj0Var.getDialog();
            if (dialog != null) {
                dialog.setCanceledOnTouchOutside(false);
            }
            Dialog dialog2 = elj0Var.getDialog();
            if (dialog2 != null) {
                dialog2.setCancelable(false);
            }
        } else {
            if (!Intrinsics.g(tzsVar, tzs.a.a)) {
                uhc.a();
                return null;
            }
            fme fmeVar3 = elj0Var.i;
            if (fmeVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            b330.a(fmeVar3.e, new c330.a(null, true));
            fme fmeVar4 = elj0Var.i;
            if (fmeVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar4.d.setEnabled(true);
            elj0.a aVar2 = elj0Var.v;
            if (aVar2 != null) {
                aVar2.f(false);
            }
            Dialog dialog3 = elj0Var.getDialog();
            if (dialog3 != null) {
                dialog3.setCanceledOnTouchOutside(true);
            }
            Dialog dialog4 = elj0Var.getDialog();
            if (dialog4 != null) {
                dialog4.setCancelable(true);
            }
        }
        return Unit.a;
    }
}
