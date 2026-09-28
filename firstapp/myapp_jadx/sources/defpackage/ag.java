package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.domain.AddBiometricOtpOptionUseCase", f = "AddBiometricOtpOptionUseCase.kt", l = {14}, m = "invoke", v = 2)
public final class ag extends x1b {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(bg bgVar, x1b x1bVar) {
        super(x1bVar);
        this.c = bgVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
