package ba;

import androidx.annotation.NonNull;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewCookieManagerBoundaryInterface f20917a;

    public f1(@NonNull WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f20917a = webViewCookieManagerBoundaryInterface;
    }

    @NonNull
    public List<String> a(@NonNull String str) {
        return this.f20917a.getCookieInfo(str);
    }
}
