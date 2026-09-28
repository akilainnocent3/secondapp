package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ks60 extends qlr implements Function0<Boolean> {
    public final /* synthetic */ ClassLoader a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks60(ClassLoader classLoader) {
        super(0);
        this.a = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
        ls60.a.getClass();
        ClassLoader classLoader = this.a;
        Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
        declaredMethod.getClass();
        clsLoadClass.getClass();
        return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass) && Modifier.isPublic(declaredMethod.getModifiers()));
    }
}
