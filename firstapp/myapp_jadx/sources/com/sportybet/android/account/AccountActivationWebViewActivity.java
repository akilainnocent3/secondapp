package com.sportybet.android.account;

import android.os.Bundle;
import com.sporty.android.core.model.account.AccountActivationData;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel;
import defpackage.g8;
import defpackage.haj;
import defpackage.lfy;
import defpackage.paj;
import defpackage.psm;
import defpackage.pwx;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/account/AccountActivationWebViewActivity;", "Lcom/sportybet/plugin/webcontainer/activities/WebViewActivity;", "Lpwx;", "Lzux;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AccountActivationWebViewActivity extends com.sportybet.android.account.a implements pwx, zux {
    public static final /* synthetic */ int c = 0;
    public psm b;

    public static final class a implements lfy, paj {
        public final /* synthetic */ g8 a;

        public a(g8 g8Var) {
            this.a = g8Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.r1k
    public final boolean onBackPressedCompat() {
        psm psmVar = this.b;
        if (psmVar != null) {
            WebViewActivityUtils.onAccountActivationResult(new AccountActivationData("CLOSE", psmVar.P(), null, null, null, null, 60, null));
            return true;
        }
        Intrinsics.n("countryManger");
        throw null;
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebViewViewModel webViewViewModel = this.webViewViewModel;
        if (webViewViewModel != null) {
            webViewViewModel.getAccountActivationResult().f(this, new a(new g8(this)));
        }
    }
}
