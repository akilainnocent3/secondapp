package defpackage;

import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateParams;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.fragment.AddNewMobileNumberDialogFragment$initViewModel$1$1", f = "AddNewMobileNumberDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uj extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(pj pjVar, v1b<? super uj> v1bVar) {
        super(2, v1bVar);
        this.b = pjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uj ujVar = new uj(this.b, v1bVar);
        ujVar.a = obj;
        return ujVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((uj) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String userName = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pj pjVar = this.b;
        if (((j6c) pjVar.B.getValue()) == j6c.MigratePhone) {
            PhoneMigrateParams phoneMigrateParams = (PhoneMigrateParams) pjVar.C.getValue();
            userName = phoneMigrateParams != null ? phoneMigrateParams.getUserName() : null;
        }
        zui zuiVar = pjVar.y;
        if (zuiVar != null) {
            zuiVar.e.setText(sn5.d(pjVar, R.string.page_payment__multiple_mobile_numbers_for_deposit_tip_vname, userName));
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
