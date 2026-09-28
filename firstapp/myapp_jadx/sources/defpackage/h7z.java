package defpackage;

import com.sporty.android.platform.features.newotp.model.OtpAuthenticationData;
import com.sporty.android.platform.features.newotp.model.OtpSelectionGroup;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$initOTPFlow$1", f = "OtpSelectorViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h7z extends tje0 implements gaj<OtpSelectionGroup, String, v1b<? super OtpAuthenticationData>, Object> {
    public /* synthetic */ OtpSelectionGroup a;
    public /* synthetic */ String b;

    @Override // defpackage.gaj
    public final Object invoke(OtpSelectionGroup otpSelectionGroup, String str, v1b<? super OtpAuthenticationData> v1bVar) {
        h7z h7zVar = new h7z(3, v1bVar);
        h7zVar.a = otpSelectionGroup;
        h7zVar.b = str;
        return h7zVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        OtpSelectionGroup otpSelectionGroup = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new OtpAuthenticationData(otpSelectionGroup, str);
    }
}
