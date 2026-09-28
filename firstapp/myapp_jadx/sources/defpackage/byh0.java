package defpackage;

import com.sportybet.android.account.mfa.Verify2FAFragment;
import com.sportybet.android.sportypin.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class byh0 implements e.a {
    public final /* synthetic */ Verify2FAFragment a;

    public byh0(Verify2FAFragment verify2FAFragment) {
        this.a = verify2FAFragment;
    }

    @Override // com.sportybet.android.sportypin.e.a
    public final void onDismiss() {
        tyi tyiVar = this.a.B;
        if (tyiVar != null) {
            tyiVar.v.b();
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // com.sportybet.android.sportypin.e.a
    public final void a() {
    }
}
