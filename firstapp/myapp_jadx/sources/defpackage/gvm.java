package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class gvm extends cny {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ INTVerifyFragment e;
    public final /* synthetic */ e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvm(boolean z, INTVerifyFragment iNTVerifyFragment, e eVar) {
        super(true);
        this.d = z;
        this.e = iNTVerifyFragment;
        this.f = eVar;
    }

    @Override // defpackage.cny
    public final void b() {
        if (this.d) {
            yrh0.t(this.e.getContext(), MainActivity.class, true);
        } else {
            f(false);
            this.f.getOnBackPressedDispatcher().d();
        }
    }
}
