package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.sportybet.android.gp.tz.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class blc<T extends View, Z> implements d5f0<Z> {
    public final a a;
    public final T b;

    public static final class a {
        public static Integer d;
        public final View a;
        public final ArrayList b = new ArrayList();
        public ViewTreeObserverOnPreDrawListenerC0130a c;

        /* JADX INFO: renamed from: blc$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0130a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> a;

            public ViewTreeObserverOnPreDrawListenerC0130a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.a.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.b;
                    View view = aVar.a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i = 0;
                        int iA = aVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = aVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iA <= 0 && iA != Integer.MIN_VALUE) || (iA2 <= 0 && iA2 != Integer.MIN_VALUE)) {
                            return true;
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            ((gx90) obj).d(iA, iA2);
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.c);
                        }
                        aVar.c = null;
                        arrayList.clear();
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        public final int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            View view = this.a;
            if (view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            Integer numValueOf = d;
            if (numValueOf == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                gm20.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                numValueOf = Integer.valueOf(Math.max(point.x, point.y));
                d = numValueOf;
            }
            return numValueOf.intValue();
        }
    }

    public blc(T t) {
        this.b = t;
        this.a = new a(t);
    }

    @Override // defpackage.d5f0
    public final ca50 a() {
        Object tag = this.b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof ca50) {
                return (ca50) tag;
            }
            hb5.a("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.d5f0
    public final void d(pv90 pv90Var) {
        this.a.b.remove(pv90Var);
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
        a aVar = this.a;
        ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.c);
        }
        aVar.c = null;
        aVar.b.clear();
    }

    @Override // defpackage.d5f0
    public final void i(pv90 pv90Var) throws Throwable {
        a aVar = this.a;
        ArrayList arrayList = aVar.b;
        View view = aVar.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = aVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = aVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            pv90Var.d(iA, iA2);
            return;
        }
        if (!arrayList.contains(pv90Var)) {
            arrayList.add(pv90Var);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0130a viewTreeObserverOnPreDrawListenerC0130a = new a.ViewTreeObserverOnPreDrawListenerC0130a(aVar);
            aVar.c = viewTreeObserverOnPreDrawListenerC0130a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0130a);
        }
    }

    @Override // defpackage.d5f0
    public final void j(ca50 ca50Var) {
        this.b.setTag(R.id.glide_custom_view_target_tag, ca50Var);
    }

    public final String toString() {
        return "Target for: " + this.b;
    }

    @Override // defpackage.gbs
    public final void b() {
    }

    @Override // defpackage.gbs
    public final void c() {
    }

    @Override // defpackage.gbs
    public final void onDestroy() {
    }

    @Override // defpackage.d5f0
    public final void g(Drawable drawable) {
    }
}
