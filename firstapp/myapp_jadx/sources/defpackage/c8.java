package defpackage;

import android.content.Intent;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.plugin.realsports.home.KycRejectBottomSheetActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c8 implements j7g.a, ysp.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ c8(Object obj) {
        this.a = obj;
    }

    @Override // j7g.a
    public void a() {
        e8 e8Var = (e8) this.a;
        ohp<Object>[] ohpVarArr = e8.z;
        ((u7) e8Var.v.getValue()).a.j("CUSTOMER_SERVICE");
    }

    @Override // ysp.a
    public void b(zsp zspVar) {
        TxListActivity txListActivity = (TxListActivity) this.a;
        int i = TxListActivity.K;
        zspVar.getClass();
        boolean zA = atp.a(zspVar);
        KycSource kycSource = zA ? KycSource.TRANSACTION_RESUBMIT : KycSource.VERIFY;
        if (zA) {
            eup eupVar = eup.HOME;
        }
        if (zA) {
            eup eupVar2 = eup.HOME;
        }
        osp.p pVar = zA ? new osp.p(eup.TRANSACTION) : null;
        kycSource.getClass();
        if (pVar != null) {
            o7h0.B1(txListActivity.A1(), pVar, new kfw(1), 2);
        }
        String str = zspVar.c;
        Intent intent = new Intent(txListActivity, (Class<?>) KycRejectBottomSheetActivity.class);
        intent.putExtra("reject_reason", str);
        intent.putExtra("source", kycSource.getValue());
        txListActivity.startActivity(intent);
    }
}
