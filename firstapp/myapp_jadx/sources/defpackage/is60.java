package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class is60 extends qlr implements Function0<Boolean> {
    public final /* synthetic */ ClassLoader a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is60(ClassLoader classLoader) {
        super(0);
        this.a = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        ls60.a.getClass();
        ClassLoader classLoader = this.a;
        Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        method.getClass();
        if (Modifier.isPublic(method.getModifiers())) {
            clsLoadClass.getClass();
            if (method.getReturnType().equals(clsLoadClass)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
