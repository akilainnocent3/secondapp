package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.router.Sender;
import com.sportybet.tech.uibus.UIRouter;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fbh0 {
    public final List<UIRouter> a;

    public fbh0(tcn tcnVar) {
        kjw kjwVar = new kjw(1);
        tcnVar.getClass();
        this.a = CollectionsKt.r0(tcnVar, new ul8(kjwVar));
    }

    public final UIRouter a(boolean z, Uri uri) {
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return null;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        for (UIRouter uIRouter : this.a) {
            if (!z || !uIRouter.isGenericUri()) {
                if (uIRouter.verifyUri(uri, scheme, host)) {
                    return uIRouter;
                }
            }
        }
        return null;
    }

    public final void b(Uri uri) {
        Bundle bundle;
        Throwable th;
        Bundle bundle2 = null;
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                bundle = new Bundle();
                try {
                    for (String str : queryParameterNames) {
                        String queryParameter = uri.getQueryParameter(str);
                        if (queryParameter != null) {
                            bundle.putString(str, queryParameter);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_UI_ROUTER);
                    aVar.o(th);
                }
                bundle2 = bundle;
            }
        } catch (Throwable th3) {
            bundle = null;
            th = th3;
        }
        d(uri, bundle2, Sender.UNKNOWN);
    }

    public final void c(String str, Bundle bundle) {
        f(str, bundle, Sender.UNKNOWN);
    }

    public final boolean d(Uri uri, Bundle bundle, Sender sender) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_UI_ROUTER);
        aVar.a("Verifying uri: %s", uri);
        UIRouter uIRouterA = a(false, uri);
        if (uIRouterA != null) {
            aVar.q(MyLog.TAG_UI_ROUTER);
            aVar.a("Verified by " + uIRouterA.getClass().getSimpleName() + ", uri: " + uri, new Object[0]);
            if (uIRouterA.openUri(uri, uri.getScheme(), uri.getHost(), bundle, sender)) {
                aVar.q(MyLog.TAG_UI_ROUTER);
                aVar.a("Opened by " + uIRouterA.getClass().getSimpleName() + ", uri: " + uri + ", bundle: " + bundle + ", sender: " + sender, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final boolean e(String str) {
        return f(str, null, Sender.UNKNOWN);
    }

    public final boolean f(String str, Bundle bundle, Sender sender) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!str.contains("://")) {
            str = "http://".concat(str);
        }
        return d(Uri.parse(str), bundle, sender);
    }

    public final void g(String str) {
        f(o7d.a(wae.SHARE) + "?hideCopy=true&linkUrl=" + str, null, Sender.UNKNOWN);
    }

    public final boolean h(boolean z, Uri uri) {
        return a(z, uri) != null;
    }
}
