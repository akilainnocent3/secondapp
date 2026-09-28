package defpackage;

import com.sporty.android.core.model.account.AvatarFrame;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.AvatarUseCase", f = "AvatarUseCase.kt", l = {87, 88, 89, 90, 91, 92}, m = "saveAvatar", v = 2)
public final class xo1 extends x1b {
    public String a;
    public AvatarFrame b;
    public Integer c;
    public uo1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ uo1 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo1(uo1 uo1Var, x1b x1bVar) {
        super(x1bVar);
        this.f = uo1Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(null, null, null, null, this);
    }
}
