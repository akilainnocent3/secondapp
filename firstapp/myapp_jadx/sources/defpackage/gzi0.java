package defpackage;

import android.text.TextUtils;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class gzi0 {
    public final aoh0 a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lgzi0$a;", "", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a {
        gzi0 x();
    }

    public gzi0(aoh0 aoh0Var) {
        this.a = aoh0Var;
    }

    public final void a(WebView webView) {
        webView.getClass();
        String userAgentString = webView.getSettings().getUserAgentString();
        String str = (String) this.a.d.getValue();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        userAgentString.getClass();
        if (StringsKt.M(userAgentString, str.substring(0, Math.min(str.length(), 10)), false)) {
            return;
        }
        webView.getSettings().setUserAgentString(userAgentString + " " + str);
    }
}
