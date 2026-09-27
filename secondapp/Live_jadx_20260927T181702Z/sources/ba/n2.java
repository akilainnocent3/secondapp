package ba;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n2 implements WebViewRendererClientBoundaryInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f20976d = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.b0 f20978c;

    @SuppressLint({"LambdaLast"})
    public n2(@Nullable Executor executor, @Nullable aa.b0 b0Var) {
        this.f20977b = executor;
        this.f20978c = b0Var;
    }

    @Nullable
    public aa.b0 c() {
        return this.f20978c;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return f20976d;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(@NonNull final WebView webView, @NonNull InvocationHandler invocationHandler) {
        final r2 r2VarD = r2.d(invocationHandler);
        final aa.b0 b0Var = this.f20978c;
        Executor executor = this.f20977b;
        if (executor == null) {
            b0Var.a(webView, r2VarD);
        } else {
            executor.execute(new Runnable() { // from class: ba.l2
                @Override // java.lang.Runnable
                public final void run() {
                    b0Var.a(webView, r2VarD);
                }
            });
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(@NonNull final WebView webView, @NonNull InvocationHandler invocationHandler) {
        final r2 r2VarD = r2.d(invocationHandler);
        final aa.b0 b0Var = this.f20978c;
        Executor executor = this.f20977b;
        if (executor == null) {
            b0Var.b(webView, r2VarD);
        } else {
            executor.execute(new Runnable() { // from class: ba.m2
                @Override // java.lang.Runnable
                public final void run() {
                    b0Var.b(webView, r2VarD);
                }
            });
        }
    }
}
