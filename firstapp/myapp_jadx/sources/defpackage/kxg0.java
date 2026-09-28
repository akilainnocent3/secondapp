package defpackage;

import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.platform.features.newotp.model.AuthenticationMethodData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.trusteddevices.TrustedDeviceManager$executeTrustedDeviceAuthFlow$2", f = "TrustedDeviceManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kxg0 extends tje0 implements Function2<CheckIsTrustedDeviceResponse, v1b<? super lyh<? extends AuthenticationMethodData>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nxg0 b;
    public final /* synthetic */ f7z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxg0(nxg0 nxg0Var, f7z f7zVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = nxg0Var;
        this.c = f7zVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kxg0 kxg0Var = new kxg0(this.b, this.c, v1bVar);
        kxg0Var.a = obj;
        return kxg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CheckIsTrustedDeviceResponse checkIsTrustedDeviceResponse, v1b<? super lyh<? extends AuthenticationMethodData>> v1bVar) {
        return ((kxg0) create(checkIsTrustedDeviceResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CheckIsTrustedDeviceResponse checkIsTrustedDeviceResponse = (CheckIsTrustedDeviceResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return this.b.e0(checkIsTrustedDeviceResponse.isTrustedDevice(), this.c);
    }
}
