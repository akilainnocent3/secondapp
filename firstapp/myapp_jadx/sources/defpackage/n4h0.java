package defpackage;

import com.sporty.android.core.model.patron.DocumentAudit;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.patron.UserCertStatusRules;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$initKycVerifyButtonState$1", f = "TxDetailsV2ViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
public final class n4h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r4h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4h0(v1b v1bVar, r4h0 r4h0Var) {
        super(2, v1bVar);
        this.b = r4h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n4h0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n4h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zsp zspVar;
        boolean z;
        NameConfirmationStatus nameConfirmationStatus;
        r4h0 r4h0Var = this.b;
        wwd0 wwd0Var = r4h0Var.H;
        psm psmVar = r4h0Var.i;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!psmVar.x() && !psmVar.n()) {
                Boolean bool = Boolean.FALSE;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                return Unit.a;
            }
            lyh<lk50<NameConfirmationStatus>> lyhVarJ0 = r4h0Var.f.j0(pu0.c.a);
            this.a = 1;
            obj = bm50.p(lyhVarJ0, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        boolean z2 = lk50Var instanceof lk50.c;
        lk50.c cVar = z2 ? (lk50.c) lk50Var : null;
        boolean zIsNgNameConfirmRequired = false;
        if (cVar == null || (nameConfirmationStatus = (NameConfirmationStatus) cVar.a) == null) {
            zspVar = new zsp(null, 7);
        } else {
            int i2 = nameConfirmationStatus.status;
            DocumentAudit documentAudit = nameConfirmationStatus.documentAudit;
            zspVar = btp.a(i2, documentAudit != null ? documentAudit.status : 0, documentAudit != null ? documentAudit.rejectTitle : null, documentAudit != null ? documentAudit.rejectReason : null);
        }
        r4h0Var.I.setValue(atp.b(zspVar, psmVar.x()));
        if (psmVar.n()) {
            lk50.c cVar2 = z2 ? (lk50.c) lk50Var : null;
            if (cVar2 != null) {
                zIsNgNameConfirmRequired = UserCertStatusRules.isNgNameConfirmRequired(((NameConfirmationStatus) cVar2.a).status);
            }
        } else {
            zsp.a aVar = zspVar.a;
            if (aVar != zsp.a.a) {
                aVar.getClass();
                z = (aVar == zsp.a.c || aVar == zsp.a.d || aVar == zsp.a.v) ? false : true;
            }
            zIsNgNameConfirmRequired = z;
        }
        osa0.a(zIsNgNameConfirmRequired, wwd0Var, null);
        return Unit.a;
    }
}
