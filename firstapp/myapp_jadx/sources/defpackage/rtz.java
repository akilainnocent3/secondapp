package defpackage;

import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity$initViewModel$1$3", f = "PartnerWithdrawRequestDetailsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rtz extends tje0 implements Function2<wgn, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PartnerWithdrawRequestDetailsActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtz(PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity, v1b<? super rtz> v1bVar) {
        super(2, v1bVar);
        this.b = partnerWithdrawRequestDetailsActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rtz rtzVar = new rtz(this.b, v1bVar);
        rtzVar.a = obj;
        return rtzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wgn wgnVar, v1b<? super Unit> v1bVar) {
        return ((rtz) create(wgnVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wgn wgnVar = (wgn) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(wgnVar, wgn.c.a);
        PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity = this.b;
        if (zG) {
            md mdVar = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar.w.setVisibility(0);
            md mdVar2 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar2.v.setVisibility(8);
        } else if (Intrinsics.g(wgnVar, wgn.b.a)) {
            md mdVar3 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar3.w.setVisibility(8);
            md mdVar4 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar4.v.setVisibility(8);
        } else {
            if (!(wgnVar instanceof wgn.a)) {
                uhc.a();
                return null;
            }
            md mdVar5 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar5.w.setVisibility(0);
            md mdVar6 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar6.v.c(((wgn.a) wgnVar).a.e(partnerWithdrawRequestDetailsActivity));
        }
        return Unit.a;
    }
}
