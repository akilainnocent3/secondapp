package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.data.repository.ResetPasswordRepoImpl", f = "ResetPasswordRepoImpl.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "checkIsPasswordResetForced", v = 2)
public final class lc50 extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nc50 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc50(nc50 nc50Var, x1b x1bVar) {
        super(x1bVar);
        this.c = nc50Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
