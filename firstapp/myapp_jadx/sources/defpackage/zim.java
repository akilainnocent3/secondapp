package defpackage;

import android.accounts.Account;
import com.sporty.android.core.model.patron.KycHintExtra;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$homeKycHintState$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zim extends tje0 implements jaj<Account, Integer, Integer, KycHintExtra, v1b<? super zsp>, Object> {
    public /* synthetic */ Account a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public /* synthetic */ KycHintExtra d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Account account = this.a;
        int i = this.b;
        int i2 = this.c;
        KycHintExtra kycHintExtra = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return account == null ? new zsp(null, 7) : btp.a(i, i2, kycHintExtra.getRejectTitle(), kycHintExtra.getRejectReason());
    }

    @Override // defpackage.jaj
    public final Object l(Account account, Integer num, Integer num2, KycHintExtra kycHintExtra, v1b<? super zsp> v1bVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        zim zimVar = new zim(5, v1bVar);
        zimVar.a = account;
        zimVar.b = iIntValue;
        zimVar.c = iIntValue2;
        zimVar.d = kycHintExtra;
        return zimVar.invokeSuspend(Unit.a);
    }
}
