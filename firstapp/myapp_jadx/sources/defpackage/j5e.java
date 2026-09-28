package defpackage;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.sportybet.android.account.confirm.activity.NameBvnActivity;
import com.sportybet.feature.payment.impl.deposit.presentation.adapter.DepositOthersAdapter;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j5e implements OnItemClickListener, wie.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ j5e(Object obj) {
        this.a = obj;
    }

    @Override // wie.a
    public void d() {
        NameBvnActivity nameBvnActivity = (NameBvnActivity) this.a;
        NameBvnActivity.a aVar = NameBvnActivity.D;
        nameBvnActivity.M1();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        DepositOthersAdapter._init_$lambda$1((DepositOthersAdapter) this.a, baseQuickAdapter, view, i);
    }
}
