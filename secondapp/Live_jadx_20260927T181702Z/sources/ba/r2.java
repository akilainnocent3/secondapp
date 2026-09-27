package ba;

import android.webkit.WebViewRenderProcess;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class r2 extends aa.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap<WebViewRenderProcess, r2> f20988c = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebViewRendererBoundaryInterface f20989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<WebViewRenderProcess> f20990b;

    public r2(@NonNull WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f20989a = webViewRendererBoundaryInterface;
    }

    public static /* synthetic */ Object b(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        return new r2(webViewRendererBoundaryInterface);
    }

    @NonNull
    public static r2 c(@NonNull WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, r2> weakHashMap = f20988c;
        r2 r2Var = weakHashMap.get(webViewRenderProcess);
        if (r2Var != null) {
            return r2Var;
        }
        r2 r2Var2 = new r2(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, r2Var2);
        return r2Var2;
    }

    @NonNull
    public static r2 d(@NonNull InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) my.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (r2) webViewRendererBoundaryInterface.getOrCreatePeer(new Callable() { // from class: ba.q2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r2.b(webViewRendererBoundaryInterface);
            }
        });
    }

    @Override // aa.a0
    public boolean a() {
        a.h hVar = g2.K;
        if (hVar.c()) {
            WebViewRenderProcess webViewRenderProcessA = p2.a(this.f20990b.get());
            return webViewRenderProcessA != null && z0.g(webViewRenderProcessA);
        }
        if (hVar.d()) {
            return this.f20989a.terminate();
        }
        throw g2.a();
    }

    public r2(@NonNull WebViewRenderProcess webViewRenderProcess) {
        this.f20990b = new WeakReference<>(webViewRenderProcess);
    }
}
