package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity$initViewModel$1$5", f = "PartnerWithdrawRequestDetailsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ttz extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PartnerWithdrawRequestDetailsActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttz(PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity, v1b<? super ttz> v1bVar) {
        super(2, v1bVar);
        this.b = partnerWithdrawRequestDetailsActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ttz ttzVar = new ttz(this.b, v1bVar);
        ttzVar.a = obj;
        return ttzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((ttz) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity = this.b;
        e eVar = partnerWithdrawRequestDetailsActivity.d;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        md mdVar = partnerWithdrawRequestDetailsActivity.e;
        if (mdVar != null) {
            eVar.c(aVar, partnerWithdrawRequestDetailsActivity, mdVar.a, null);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
