package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zb20 implements tit {
    public final /* synthetic */ PreMatchEventActivity a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ zb20(PreMatchEventActivity preMatchEventActivity, Function0 function0) {
        this.a = preMatchEventActivity;
        this.b = function0;
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        int i = PreMatchEventActivity.a2;
        final PreMatchEventActivity preMatchEventActivity = this.a;
        String lastNickName = preMatchEventActivity.getAccountHelper().getLastNickName();
        final Function0 function0 = this.b;
        if (lastNickName != null) {
            function0.invoke();
        } else {
            preMatchEventActivity.getAccountHelper().loadAccountInfo(new w8() { // from class: zc20
                @Override // defpackage.w8
                public final void a(AccountInfo accountInfo, String str, String str2) {
                    int i2 = PreMatchEventActivity.a2;
                    if (!TextUtils.isEmpty(str)) {
                        function0.invoke();
                        return;
                    }
                    PreMatchEventActivity preMatchEventActivity2 = preMatchEventActivity;
                    hsx hsxVar = preMatchEventActivity2.C0;
                    if (hsxVar == null) {
                        str<hsx> strVar = preMatchEventActivity2.H;
                        if (strVar == null) {
                            Intrinsics.n("nickNameDialogLazy");
                            throw null;
                        }
                        hsxVar = strVar.get();
                        preMatchEventActivity2.C0 = hsxVar;
                    }
                    if (hsxVar != null) {
                        hsxVar.b();
                    }
                }
            });
        }
    }
}
