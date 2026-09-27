package sg.bigo.ads.common.v;

import android.app.KeyguardManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import sg.bigo.ads.common.f.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f133445a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f133446b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f133447c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f133448d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f133449e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f133450f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f133451g = f133445a;

    public static boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null) {
            return false;
        }
        while (true) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams)) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    layoutParams = null;
                    break;
                }
                view = (View) parent;
            } else {
                layoutParams = (WindowManager.LayoutParams) layoutParams2;
                break;
            }
        }
        if (layoutParams == null) {
            return false;
        }
        int i10 = layoutParams.type;
        return i10 == 2002 || i10 == 2003 || i10 == 2006 || i10 == 2007 || i10 == 2010 || i10 == 2038;
    }

    public final int a() {
        int i10;
        int iC = b.c();
        if (iC != 1) {
            i10 = iC != 2 ? f133445a : f133449e;
        } else {
            i10 = f133446b;
        }
        this.f133451g = i10;
        return this.f133451g;
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) view.getContext().getSystemService("keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isKeyguardLocked();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
