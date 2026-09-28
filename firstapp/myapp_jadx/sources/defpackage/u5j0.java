package defpackage;

import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$welcomeRewardBannerState$1", f = "WelcomeRewardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u5j0 extends tje0 implements iaj<NonFtdEngagement, Boolean, x1k0, v1b<? super NonFtdEngagement>, Object> {
    public /* synthetic */ NonFtdEngagement a;
    public /* synthetic */ boolean b;
    public /* synthetic */ x1k0 c;

    @Override // defpackage.iaj
    public final Object d(NonFtdEngagement nonFtdEngagement, Boolean bool, x1k0 x1k0Var, v1b<? super NonFtdEngagement> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        u5j0 u5j0Var = new u5j0(4, v1bVar);
        u5j0Var.a = nonFtdEngagement;
        u5j0Var.b = zBooleanValue;
        u5j0Var.c = x1k0Var;
        return u5j0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        NonFtdEngagement nonFtdEngagement = this.a;
        boolean z = this.b;
        x1k0 x1k0Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return NonFtdEngagement.copy$default(nonFtdEngagement, nonFtdEngagement.getEnabled() && !z && (x1k0Var instanceof x1k0.a), null, null, null, 14, null);
    }
}
