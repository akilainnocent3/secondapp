package aa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ba.c2;
import ba.e0;
import ba.g2;
import ba.h2;
import ba.i2;
import ba.j2;
import ba.o2;
import ba.r0;
import ba.r2;
import ba.y1;
import ba.z0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import k.g1;
import k.y0;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f4608a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f4609b = Uri.parse("");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        @g1
        void onComplete(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        @g1
        void onPostMessage(@NonNull WebView webView, @NonNull r rVar, @NonNull Uri uri, boolean z10, @NonNull c cVar);
    }

    @Deprecated
    @k.d
    public static void A(@NonNull List<String> list, @Nullable ValueCallback<Boolean> valueCallback) {
        z(new HashSet(list), valueCallback);
    }

    @g1
    public static void B(@NonNull WebView webView, @Nullable b0 b0Var) {
        ba.a.h hVar = g2.O;
        if (hVar.c()) {
            z0.e(webView, b0Var);
        } else {
            if (!hVar.d()) {
                throw g2.a();
            }
            c(webView);
            l(webView).o(null, b0Var);
        }
    }

    @g1
    @SuppressLint({"LambdaLast"})
    public static void C(@NonNull WebView webView, @NonNull Executor executor, @NonNull b0 b0Var) {
        ba.a.h hVar = g2.O;
        if (hVar.c()) {
            z0.f(webView, executor, b0Var);
        } else {
            if (!hVar.d()) {
                throw g2.a();
            }
            c(webView);
            l(webView).o(executor, b0Var);
        }
    }

    @k.d
    public static void D(@NonNull Context context, @Nullable ValueCallback<Boolean> valueCallback) {
        ba.a.f fVar = g2.f20928e;
        if (fVar.c()) {
            e0.f(context, valueCallback);
        } else {
            if (!fVar.d()) {
                throw g2.a();
            }
            h().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    @NonNull
    @g1
    public static j a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set) {
        if (g2.V.d()) {
            return l(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw g2.a();
    }

    @g1
    public static void b(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull b bVar) {
        if (!g2.U.d()) {
            throw g2.a();
        }
        l(webView).b(str, (String[]) set.toArray(new String[0]), bVar);
    }

    public static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper looperC = r0.c(webView);
        if (looperC == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperC + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + gi.j.f86771d);
    }

    public static WebViewProviderBoundaryInterface d(WebView webView) {
        return h().createWebView(webView);
    }

    @NonNull
    @g1
    public static s[] e(@NonNull WebView webView) {
        ba.a.b bVar = g2.E;
        if (bVar.c()) {
            return c2.l(ba.b.c(webView));
        }
        if (!bVar.d()) {
            throw g2.a();
        }
        c(webView);
        return l(webView).c();
    }

    @Nullable
    @k.d
    @y0({y0.a.LIBRARY})
    public static PackageInfo f() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ba.x.a();
        }
        try {
            return i();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    @k.d
    public static PackageInfo g(@NonNull Context context) {
        PackageInfo packageInfoF = f();
        return packageInfoF != null ? packageInfoF : j(context);
    }

    public static j2 h() {
        return h2.d();
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo i() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo j(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", null).invoke(null, null) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @NonNull
    @g1
    public static d k(@NonNull WebView webView) {
        if (g2.f20925c0.d()) {
            return l(webView).d();
        }
        throw g2.a();
    }

    public static i2 l(WebView webView) {
        return new i2(d(webView));
    }

    @NonNull
    @k.d
    public static Uri m() {
        ba.a.f fVar = g2.f20938j;
        if (fVar.c()) {
            return e0.b();
        }
        if (fVar.d()) {
            return h().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw g2.a();
    }

    @NonNull
    @k.d
    public static String n() {
        if (g2.X.d()) {
            return h().getStatics().getVariationsHeader();
        }
        throw g2.a();
    }

    @Nullable
    @g1
    public static WebChromeClient o(@NonNull WebView webView) {
        ba.a.e eVar = g2.I;
        if (eVar.c()) {
            return ba.x.c(webView);
        }
        if (!eVar.d()) {
            throw g2.a();
        }
        c(webView);
        return l(webView).e();
    }

    @NonNull
    @g1
    public static WebViewClient p(@NonNull WebView webView) {
        ba.a.e eVar = g2.H;
        if (eVar.c()) {
            return ba.x.d(webView);
        }
        if (!eVar.d()) {
            throw g2.a();
        }
        c(webView);
        return l(webView).f();
    }

    @Nullable
    @g1
    public static a0 q(@NonNull WebView webView) {
        ba.a.h hVar = g2.J;
        if (hVar.c()) {
            WebViewRenderProcess webViewRenderProcessB = z0.b(webView);
            if (webViewRenderProcessB != null) {
                return r2.c(webViewRenderProcessB);
            }
            return null;
        }
        if (!hVar.d()) {
            throw g2.a();
        }
        c(webView);
        return l(webView).g();
    }

    @Nullable
    @g1
    public static b0 r(@NonNull WebView webView) {
        ba.a.h hVar = g2.O;
        if (!hVar.c()) {
            if (!hVar.d()) {
                throw g2.a();
            }
            c(webView);
            return l(webView).h();
        }
        WebViewRenderProcessClient webViewRenderProcessClientC = z0.c(webView);
        if (webViewRenderProcessClientC == null || !(webViewRenderProcessClientC instanceof o2)) {
            return null;
        }
        return ((o2) webViewRenderProcessClientC).a();
    }

    @g1
    public static boolean s(@NonNull WebView webView) {
        if (g2.f20931f0.d()) {
            return l(webView).j();
        }
        throw g2.a();
    }

    @k.d
    public static boolean t() {
        if (g2.R.d()) {
            return h().getStatics().isMultiProcessEnabled();
        }
        throw g2.a();
    }

    @g1
    public static void u(@NonNull WebView webView, long j10, @NonNull a aVar) {
        ba.a.b bVar = g2.f20920a;
        if (bVar.c()) {
            ba.b.i(webView, j10, aVar);
        } else {
            if (!bVar.d()) {
                throw g2.a();
            }
            c(webView);
            l(webView).i(j10, aVar);
        }
    }

    @g1
    public static void v(@NonNull WebView webView, @NonNull r rVar, @NonNull Uri uri) {
        if (f4608a.equals(uri)) {
            uri = f4609b;
        }
        ba.a.b bVar = g2.F;
        if (bVar.c() && rVar.e() == 0) {
            ba.b.j(webView, c2.g(rVar), uri);
        } else {
            if (!bVar.d() || !y1.a(rVar.e())) {
                throw g2.a();
            }
            c(webView);
            l(webView).k(rVar, uri);
        }
    }

    @g1
    public static void w(@NonNull WebView webView, @NonNull String str) {
        if (!g2.U.d()) {
            throw g2.a();
        }
        l(webView).l(str);
    }

    @g1
    public static void x(@NonNull WebView webView, boolean z10) {
        if (!g2.f20931f0.d()) {
            throw g2.a();
        }
        l(webView).m(z10);
    }

    @g1
    public static void y(@NonNull WebView webView, @NonNull String str) {
        if (!g2.f20925c0.d()) {
            throw g2.a();
        }
        l(webView).n(str);
    }

    @k.d
    public static void z(@NonNull Set<String> set, @Nullable ValueCallback<Boolean> valueCallback) {
        ba.a.f fVar = g2.f20936i;
        ba.a.f fVar2 = g2.f20934h;
        if (fVar.d()) {
            h().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.c()) {
            e0.d(arrayList, valueCallback);
        } else {
            if (!fVar2.d()) {
                throw g2.a();
            }
            h().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }
}
