package ba;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20958a = "org.chromium.support_lib_glue.SupportLibReflectionUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20959b = "createWebViewProviderFactory";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u2 f20960a = new u2(h2.d().getWebkitToCompatConverter());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j2 f20961a = h2.a();
    }

    @NonNull
    public static j2 a() {
        try {
            return new k2((WebViewProviderFactoryBoundaryInterface) my.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new h1();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static InvocationHandler b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName(f20958a, false, e()).getDeclaredMethod(f20959b, null).invoke(null, null);
    }

    @NonNull
    public static u2 c() {
        return a.f20960a;
    }

    @NonNull
    public static j2 d() {
        return b.f20961a;
    }

    @NonNull
    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? r0.b() : f().getClass().getClassLoader();
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
