package defpackage;

import com.sporty.android.common.network.data.UnauthorizedException;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ddh0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws UnauthorizedException {
        chain.getClass();
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.code() != 401) {
            return responseProceed;
        }
        responseProceed.close();
        StringUiText stringUiText = vch0.a;
        UnauthorizedException unauthorizedException = new UnauthorizedException(new ResourceUiText(R.string.common_functions__your_login_has_expired));
        itf0.a aVar = itf0.a;
        aVar.q("UnauthorizedException");
        aVar.a("401 Unauthorized detected - Status: 401", new Object[0]);
        throw unauthorizedException;
    }
}
