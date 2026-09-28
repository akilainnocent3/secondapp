package defpackage;

import com.sportybet.android.bvn.VerifyBvnActivity;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bzh0 implements a92.a {
    public final /* synthetic */ VerifyBvnActivity a;

    public bzh0(VerifyBvnActivity verifyBvnActivity) {
        this.a = verifyBvnActivity;
    }

    @Override // a92.a
    public final void L() {
        int i = VerifyBvnActivity.B;
        this.a.M1(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS);
    }

    @Override // a92.a
    public final void p() {
    }
}
