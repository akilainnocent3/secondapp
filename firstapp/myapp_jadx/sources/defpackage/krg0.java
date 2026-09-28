package defpackage;

import com.sportybet.android.payment.security.nameconfirm.bvn.presentation.activity.TransferBvnActivity;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class krg0 implements a92.a {
    public final /* synthetic */ TransferBvnActivity a;

    public krg0(TransferBvnActivity transferBvnActivity) {
        this.a = transferBvnActivity;
    }

    @Override // a92.a
    public final void L() {
        TransferBvnActivity.a aVar = TransferBvnActivity.A;
        TransferBvnActivity transferBvnActivity = this.a;
        transferBvnActivity.setResult(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS);
        transferBvnActivity.finish();
    }

    @Override // a92.a
    public final void p() {
    }
}
