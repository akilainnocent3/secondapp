package defpackage;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class hs60 extends qlr implements Function0<Boolean> {
    public final /* synthetic */ ClassLoader a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs60(ClassLoader classLoader) {
        super(0);
        this.a = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0083  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        ls60.a.getClass();
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        Method method = clsLoadClass.getMethod("getBounds", null);
        Method method2 = clsLoadClass.getMethod("getType", null);
        Method method3 = clsLoadClass.getMethod("getState", null);
        method.getClass();
        if (method.getReturnType().equals(tgp.b(jq40.a(Rect.class))) && Modifier.isPublic(method.getModifiers())) {
            method2.getClass();
            Class cls = Integer.TYPE;
            if (method2.getReturnType().equals(tgp.b(jq40.a(cls))) && Modifier.isPublic(method2.getModifiers())) {
                method3.getClass();
                if (method3.getReturnType().equals(tgp.b(jq40.a(cls))) && Modifier.isPublic(method3.getModifiers())) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
