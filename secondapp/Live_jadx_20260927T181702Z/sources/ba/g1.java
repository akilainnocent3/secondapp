package ba;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(24)
public class g1 extends ServiceWorkerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa.k f20919a;

    public g1(@NonNull aa.k kVar) {
        this.f20919a = kVar;
    }

    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        return this.f20919a.a(webResourceRequest);
    }
}
