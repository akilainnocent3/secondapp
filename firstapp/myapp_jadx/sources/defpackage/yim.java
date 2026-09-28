package defpackage;

import android.accounts.Account;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$homeBalanceUiState$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yim extends tje0 implements jaj<AssetsInfo, Integer, Boolean, Account, v1b<? super rbm>, Object> {
    public /* synthetic */ AssetsInfo a;
    public /* synthetic */ int b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Account d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AssetsInfo assetsInfo = this.a;
        int i = this.b;
        boolean z = this.c;
        Account account = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (account == null) {
            assetsInfo = null;
        }
        return new rbm(assetsInfo, i, z);
    }

    @Override // defpackage.jaj
    public final Object l(AssetsInfo assetsInfo, Integer num, Boolean bool, Account account, v1b<? super rbm> v1bVar) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        yim yimVar = new yim(5, v1bVar);
        yimVar.a = assetsInfo;
        yimVar.b = iIntValue;
        yimVar.c = zBooleanValue;
        yimVar.d = account;
        return yimVar.invokeSuspend(Unit.a);
    }
}
