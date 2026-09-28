package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ActionBarContextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nq0 implements zmy {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public nq0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        boolean z;
        l8j0 l8j0VarF;
        int iB;
        int iC;
        boolean z2;
        int color;
        int iD = l8j0Var.d();
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        Context context = appCompatDelegateImpl.z;
        int iD2 = l8j0Var.d();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.K;
        int i = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.K.getLayoutParams();
            boolean z3 = true;
            if (appCompatDelegateImpl.K.isShown()) {
                if (appCompatDelegateImpl.s0 == null) {
                    appCompatDelegateImpl.s0 = new Rect();
                    appCompatDelegateImpl.t0 = new Rect();
                }
                Rect rect = appCompatDelegateImpl.s0;
                Rect rect2 = appCompatDelegateImpl.t0;
                rect.set(l8j0Var.b(), l8j0Var.d(), l8j0Var.c(), l8j0Var.a());
                ViewGroup viewGroup = appCompatDelegateImpl.Q;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = gai0.a;
                    gai0.a.a(viewGroup, rect, rect2);
                } else {
                    if (!gai0.a) {
                        gai0.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            gai0.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                gai0.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", LGxrN.qFZoQlFdolSwn);
                        }
                    }
                    Method method = gai0.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = appCompatDelegateImpl.Q;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                l8j0 l8j0VarA = r6i0.e.a(viewGroup2);
                if (l8j0VarA == null) {
                    iB = 0;
                } else {
                    iB = l8j0VarA.b();
                }
                if (l8j0VarA == null) {
                    iC = 0;
                } else {
                    iC = l8j0VarA.c();
                }
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && appCompatDelegateImpl.S == null) {
                    View view2 = new View(context);
                    appCompatDelegateImpl.S = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    appCompatDelegateImpl.Q.addView(appCompatDelegateImpl.S, -1, layoutParams);
                } else {
                    View view3 = appCompatDelegateImpl.S;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            appCompatDelegateImpl.S.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = appCompatDelegateImpl.S;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = appCompatDelegateImpl.S;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!appCompatDelegateImpl.X && z3) {
                    iD2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                appCompatDelegateImpl.K.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view6 = appCompatDelegateImpl.S;
        if (view6 != null) {
            if (z) {
                i = 0;
            }
            view6.setVisibility(i);
        }
        if (iD != iD2) {
            l8j0VarF = l8j0Var.f(l8j0Var.b(), iD2, l8j0Var.c(), l8j0Var.a());
        } else {
            l8j0VarF = l8j0Var;
        }
        return r6i0.k(view, l8j0VarF);
    }
}
