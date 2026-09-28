package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vkk0 extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkk0(x4l x4lVar) {
        super(x4lVar);
        sl0<GoogleSignInOptions> sl0Var = m41.a;
        hm20.i(x4lVar, "GoogleApiClient must not be null");
        hm20.i(sl0Var, "Api must not be null");
    }
}
