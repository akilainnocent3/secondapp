package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public final class gcv {
    public static z4b a(int i) {
        if (i != 0) {
            return i != 1 ? new k060() : new glc();
        }
        return new k060();
    }

    public static void b(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof fcv) {
            ((fcv) background).r(f);
        }
    }

    public static void c(View view, fcv fcvVar) {
        jwf jwfVar = fcvVar.b.c;
        if (jwfVar == null || !jwfVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        fcv.c cVar = fcvVar.b;
        if (cVar.m != elevation) {
            cVar.m = elevation;
            fcvVar.D();
        }
    }

    public static void d(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof fcv) {
            c(viewGroup, (fcv) background);
        }
    }
}
