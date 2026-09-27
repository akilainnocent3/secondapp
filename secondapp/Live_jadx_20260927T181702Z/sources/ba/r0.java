package ba;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(28)
public class r0 {
    @NonNull
    public static TracingController a() {
        return TracingController.getInstance();
    }

    @NonNull
    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }

    @NonNull
    public static Looper c(@NonNull WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean d(@NonNull TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(@NonNull TracingController tracingController, @NonNull aa.n nVar) {
        tracingController.start(h0.a().addCategories(nVar.b()).addCategories((Collection<String>) nVar.a()).setTracingMode(nVar.c()).build());
    }

    public static boolean g(@NonNull TracingController tracingController, @Nullable OutputStream outputStream, @NonNull Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
