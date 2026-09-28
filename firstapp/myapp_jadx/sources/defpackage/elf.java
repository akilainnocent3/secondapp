package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class elf {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static final void a(rn8 rn8Var, aqe0 aqe0Var, aqe0 aqe0Var2) {
        mlf glfVar;
        rn8Var.getClass();
        aqe0Var.getClass();
        View decorView = rn8Var.getWindow().getDecorView();
        decorView.getClass();
        Function1<Resources, Boolean> function1 = aqe0Var.d;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = function1.invoke(resources).booleanValue();
        Function1<Resources, Boolean> function2 = aqe0Var2.d;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = function2.invoke(resources2).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            glfVar = new klf();
        } else if (i >= 29) {
            glfVar = new jlf();
        } else if (i >= 28) {
            glfVar = new ilf();
        } else {
            glfVar = i >= 26 ? new glf() : new flf();
        }
        mlf mlfVar = glfVar;
        Window window = rn8Var.getWindow();
        window.getClass();
        mlfVar.a(aqe0Var, aqe0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = rn8Var.getWindow();
        window2.getClass();
        mlfVar.b(window2);
    }

    public static void b(rn8 rn8Var, aqe0 aqe0Var, int i) {
        int i2 = i & 1;
        ype0 ype0Var = ype0.a;
        if (i2 != 0) {
            ype0Var.getClass();
            aqe0Var = new aqe0(0, 0, 0, ype0Var);
        }
        ype0Var.getClass();
        a(rn8Var, aqe0Var, new aqe0(a, b, 0, ype0Var));
    }
}
