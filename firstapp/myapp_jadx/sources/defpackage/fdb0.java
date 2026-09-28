package defpackage;

import android.content.Intent;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.home.SplashActivity;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class fdb0<T> implements myh {
    public final /* synthetic */ SplashActivity a;

    public fdb0(SplashActivity splashActivity) {
        this.a = splashActivity;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        SplashActivity splashActivity = this.a;
        yrh0.s(splashActivity, new Intent(null, splashActivity.v, splashActivity, MainActivity.class), true);
        splashActivity.overridePendingTransition(0, 0);
        splashActivity.finish();
        return Unit.a;
    }
}
