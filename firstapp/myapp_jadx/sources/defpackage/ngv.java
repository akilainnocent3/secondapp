package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$bindAccountInfoState$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ngv extends tje0 implements iaj<AccountInfo, so1, ThemeConfig, v1b<? super bxg0<? extends AccountInfo, ? extends so1, ? extends ThemeConfig>>, Object> {
    public /* synthetic */ AccountInfo a;
    public /* synthetic */ so1 b;
    public /* synthetic */ ThemeConfig c;

    @Override // defpackage.iaj
    public final Object d(AccountInfo accountInfo, so1 so1Var, ThemeConfig themeConfig, v1b<? super bxg0<? extends AccountInfo, ? extends so1, ? extends ThemeConfig>> v1bVar) {
        ngv ngvVar = new ngv(4, v1bVar);
        ngvVar.a = accountInfo;
        ngvVar.b = so1Var;
        ngvVar.c = themeConfig;
        return ngvVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AccountInfo accountInfo = this.a;
        so1 so1Var = this.b;
        ThemeConfig themeConfig = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new bxg0(accountInfo, so1Var, themeConfig);
    }
}
