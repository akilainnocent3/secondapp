package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.bookingcode.domain.smartremix.CheckSmartRemixEligibilityUseCase", f = "CheckSmartRemixEligibilityUseCase.kt", l = {15}, m = "invoke", v = 2)
public final class fj7 extends x1b {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gj7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj7(gj7 gj7Var, x1b x1bVar) {
        super(x1bVar);
        this.c = gj7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this, null, null);
    }
}
