package defpackage;

import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity$initViewModel$1$4", f = "PartnerWithdrawRequestDetailsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class stz extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PartnerWithdrawRequestDetailsActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stz(PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity, v1b<? super stz> v1bVar) {
        super(2, v1bVar);
        this.b = partnerWithdrawRequestDetailsActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        stz stzVar = new stz(this.b, v1bVar);
        stzVar.a = obj;
        return stzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
        return ((stz) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tzs tzsVar = (tzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(tzsVar, tzs.b.a);
        PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity = this.b;
        if (zG) {
            md mdVar = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar.y.setVisibility(0);
        } else {
            if (!Intrinsics.g(tzsVar, tzs.a.a)) {
                uhc.a();
                return null;
            }
            md mdVar2 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar2.y.setVisibility(8);
        }
        return Unit.a;
    }
}
