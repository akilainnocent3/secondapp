package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.sportybet.android.portal.FeaturedView;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface ba5 {
    void addAccountUpdatedListener(bb bbVar);

    String c();

    String d();

    int e();

    i1z f();

    String g();

    String getCountryCode();

    String getLanguageCode();

    void h(xae xaeVar, Bundle bundle);

    zag i();

    boolean isSideLoading(Context context);

    void j();

    xnh0 k();

    lob0 l();

    void logEvent(String str, Bundle bundle);

    void logNonFatalException(Throwable th, Map<String, String> map);

    void m();

    Object n(x1b x1bVar);

    void o(String str);

    FeaturedView p(juj jujVar, Context context, ibs ibsVar);

    void removeAccountUpdatedListener(bb bbVar);
}
