package com.sportybet.android.game.activity;

import android.accounts.Account;
import android.os.Bundle;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.game.activity.SportyGameRouterActivity;
import defpackage.hzm;
import defpackage.inm;
import defpackage.itf0;
import defpackage.tit;
import defpackage.u3m;
import defpackage.w8;
import defpackage.x6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/game/activity/SportyGameRouterActivity;", "Lw52;", "<init>", "()V", "sportygame"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyGameRouterActivity extends u3m {
    public hzm i;

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    @Override // defpackage.iml, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SPORTY_GAME);
            aVar.n(inm.a("unsupported action: ", getIntent().getAction()), new Object[0]);
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -1294150664) {
                if (iHashCode != -833893452 || !action.equals("destination_register")) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_SPORTY_GAME);
                    aVar2.n(inm.a("unsupported action: ", getIntent().getAction()), new Object[0]);
                } else if (getAccountHelper().getAccount() == null) {
                    getAccountHelper().demandNewAccount(this, new tit() { // from class: pob0
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            SportyGameRouterActivity sportyGameRouterActivity = this.a;
                            hzm hzmVar = sportyGameRouterActivity.i;
                            if (hzmVar != null) {
                                hzmVar.a(sportyGameRouterActivity.getIntent().getExtras());
                            } else {
                                Intrinsics.n("agent");
                                throw null;
                            }
                        }
                    }, x6.a("KEY_RETURN_TO_CALLER_AFTER_REGISTER", true));
                }
            } else if (action.equals("destination_login")) {
                w8 w8Var = new w8() { // from class: v52
                    @Override // defpackage.w8
                    public final void a(AccountInfo accountInfo, String str, String str2) {
                        int i = w52.e;
                        if (accountInfo == null) {
                            Bundle bundleA = x6.a("KEY_RETURN_TO_CALLER_AFTER_REGISTER", true);
                            SportyGameRouterActivity sportyGameRouterActivity = this.a;
                            sportyGameRouterActivity.getAccountHelper().demandAccount(sportyGameRouterActivity, null, bundleA);
                        }
                    }
                };
                if (getAccountHelper().getAccount() != null) {
                    getAccountHelper().loadAccountInfo(w8Var);
                } else {
                    w8Var.a(null, null, null);
                }
            } else {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_SPORTY_GAME);
                aVar3.n(inm.a("unsupported action: ", getIntent().getAction()), new Object[0]);
            }
        }
        finish();
    }
}
