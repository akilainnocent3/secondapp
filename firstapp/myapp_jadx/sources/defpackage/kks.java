package defpackage;

import android.content.Context;
import com.sportybet.android.auth.AccountHelperEntryPoint;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class kks implements AccountHelperEntryPoint {
    public static final kks b = new kks();
    public final /* synthetic */ AccountHelperEntryPointImpl a = new AccountHelperEntryPointImpl();

    public final boolean a(Context context) {
        context.getClass();
        return this.a.getAccountHelper().isLogin() && context.getSharedPreferences("live_event", 0).getBoolean(b("liveEventNotificationFeatureAvailable"), false);
    }

    public final String b(String str) {
        return tug.a(str, "/", this.a.getAccountHelper().getUserId());
    }

    @Override // com.sportybet.android.auth.AccountHelperEntryPoint
    public final uqm getAccountHelper() {
        return this.a.getAccountHelper();
    }
}
