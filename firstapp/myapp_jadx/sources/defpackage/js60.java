package defpackage;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class js60 extends qlr implements Function0<Boolean> {
    public final /* synthetic */ ClassLoader a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js60(ClassLoader classLoader) {
        super(0);
        this.a = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0041  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        ls60.a.getClass();
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (Modifier.isPublic(method.getModifiers())) {
            method2.getClass();
            if (Modifier.isPublic(method2.getModifiers())) {
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
