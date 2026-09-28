package defpackage;

import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public interface nxg0 {
    lyh<lk50<Unit>> J();

    default Object c1(f7z f7zVar, g7z.a aVar, g7z g7zVar) {
        return bm50.a(r0i.a(z(), new kxg0(this, f7zVar, null))).collect(new lxg0(aVar), g7zVar);
    }

    default lyh e0(boolean z, f7z f7zVar) {
        return z ? new mxg0(J()) : (lyh) f7zVar.invoke();
    }

    lyh<CheckIsTrustedDeviceResponse> z();
}
