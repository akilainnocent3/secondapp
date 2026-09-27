package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class x2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f7476h = "TooltipPopup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f7478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f7479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f7480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f7481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f7482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f7483g;

    public x2(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f7480d = layoutParams;
        this.f7481e = new Rect();
        this.f7482f = new int[2];
        this.f7483g = new int[2];
        this.f7477a = context;
        View viewInflate = LayoutInflater.from(context).inflate(m.a.j.B, (ViewGroup) null);
        this.f7478b = viewInflate;
        this.f7479c = (TextView) viewInflate.findViewById(m.a.g.I);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = m.a.l.f105833e;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public final void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f7477a.getResources().getDimensionPixelOffset(m.a.e.Q0);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f7477a.getResources().getDimensionPixelOffset(m.a.e.P0);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f7477a.getResources().getDimensionPixelOffset(z10 ? m.a.e.T0 : m.a.e.S0);
        View viewB = b(view);
        if (viewB == null) {
            Log.e(f7476h, "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f7481e);
        Rect rect = this.f7481e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f7477a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f7481e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f7483g);
        view.getLocationOnScreen(this.f7482f);
        int[] iArr = this.f7482f;
        int i13 = iArr[0];
        int[] iArr2 = this.f7483g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f7478b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f7478b.getMeasuredHeight();
        int i15 = this.f7482f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f7481e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f7477a.getSystemService("window")).removeView(this.f7478b);
        }
    }

    public boolean d() {
        return this.f7478b.getParent() != null;
    }

    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f7479c.setText(charSequence);
        a(view, i10, i11, z10, this.f7480d);
        ((WindowManager) this.f7477a.getSystemService("window")).addView(this.f7478b, this.f7480d);
    }
}
