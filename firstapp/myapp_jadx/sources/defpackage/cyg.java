package defpackage;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.sportybet.feature.payment.impl.paybill.PaybillListAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cyg implements bjs.a, OnItemClickListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ cyg(Object obj) {
        this.a = obj;
    }

    @Override // bjs.a
    public void invoke(Object obj) {
        ((so10.c) obj).V((o4c) this.a);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        PaybillListAdapter._init_$lambda$0((PaybillListAdapter) this.a, baseQuickAdapter, view, i);
    }
}
