package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ls60 {
    public static final ls60 a = new ls60();
    public static final mpe0 b = hwr.b(a.a);

    public static final class a extends qlr implements Function0<WindowLayoutComponent> {
        public static final a a = new a(0);

        public static WindowLayoutComponent a() {
            ClassLoader classLoader = ls60.class.getClassLoader();
            if (classLoader != null) {
                ls60.a.getClass();
                if (ls60.b(new ks60(classLoader)) && ls60.b(new is60(classLoader)) && ls60.b(new js60(classLoader)) && ls60.b(new hs60(classLoader))) {
                    try {
                        return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                    } catch (UnsupportedOperationException unused) {
                        return null;
                    }
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ WindowLayoutComponent invoke() {
            return a();
        }
    }

    public static WindowLayoutComponent a() {
        return (WindowLayoutComponent) b.getValue();
    }

    public static boolean b(Function0 function0) {
        try {
            return ((Boolean) function0.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
