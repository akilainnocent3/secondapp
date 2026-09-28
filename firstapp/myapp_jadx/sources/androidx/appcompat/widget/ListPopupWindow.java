package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import defpackage.dl30;
import defpackage.eis;
import defpackage.qef;
import defpackage.sb90;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements sb90 {
    public static final Method P;
    public static final Method Q;
    public int A;
    public final int B;
    public d C;
    public View D;
    public AdapterView.OnItemClickListener E;
    public AdapterView.OnItemSelectedListener F;
    public final g G;
    public final f H;
    public final e I;
    public final c J;
    public final Handler K;
    public final Rect L;
    public Rect M;
    public boolean N;
    public final PopupWindow O;
    public final Context a;
    public ListAdapter b;
    public qef c;
    public final int d;
    public int e;
    public int f;
    public int i;
    public final int v;
    public boolean w;
    public boolean y;
    public boolean z;

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            qef qefVar = ListPopupWindow.this.c;
            if (qefVar != null) {
                qefVar.setListSelectionHidden(true);
                qefVar.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.O.isShowing()) {
                listPopupWindow.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            g gVar = listPopupWindow.G;
            PopupWindow popupWindow = listPopupWindow.O;
            if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
                return;
            }
            listPopupWindow.K.removeCallbacks(gVar);
            gVar.run();
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            g gVar = listPopupWindow.G;
            Handler handler = listPopupWindow.K;
            PopupWindow popupWindow = listPopupWindow.O;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && popupWindow != null && popupWindow.isShowing() && x >= 0 && x < popupWindow.getWidth() && y >= 0 && y < popupWindow.getHeight()) {
                handler.postDelayed(gVar, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            handler.removeCallbacks(gVar);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            qef qefVar = listPopupWindow.c;
            if (qefVar == null || !qefVar.isAttachedToWindow() || listPopupWindow.c.getCount() <= listPopupWindow.c.getChildCount() || listPopupWindow.c.getChildCount() > listPopupWindow.B) {
                return;
            }
            listPopupWindow.O.setInputMethodMode(2);
            listPopupWindow.a();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                P = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = -2;
        this.e = -2;
        this.v = 1002;
        this.A = 0;
        this.B = Reader.READ_DONE;
        this.G = new g();
        this.H = new f();
        this.I = new e();
        this.J = new c();
        this.L = new Rect();
        this.a = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dl30.q, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.w = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, 0);
        appCompatPopupWindow.a(context, attributeSet, i);
        this.O = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    @Override // defpackage.sb90
    public final void a() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        qef qefVar;
        qef qefVar2 = this.c;
        Context context = this.a;
        PopupWindow popupWindow = this.O;
        if (qefVar2 == null) {
            qef qefVarQ = q(context, !this.N);
            this.c = qefVarQ;
            qefVarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.E);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new eis(this));
            this.c.setOnScrollListener(this.I);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.F;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.L;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.w) {
                this.i = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = a.a(popupWindow, this.D, this.i, popupWindow.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.v);
        if (popupWindow.isShowing()) {
            if (this.D.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.D.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        popupWindow.setWidth(i5 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(i5 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                int i6 = width;
                View view = this.D;
                int i7 = this.f;
                int i8 = this.i;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                popupWindow.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.D.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = P;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.H);
        if (this.z) {
            popupWindow.setOverlapAnchor(this.y);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.M);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            b.a(popupWindow, this.M);
        }
        popupWindow.showAsDropDown(this.D, this.f, this.i, this.A);
        this.c.setSelection(-1);
        if ((!this.N || this.c.isInTouchMode()) && (qefVar = this.c) != null) {
            qefVar.setListSelectionHidden(true);
            qefVar.requestLayout();
        }
        if (this.N) {
            return;
        }
        this.K.post(this.J);
    }

    @Override // defpackage.sb90
    public final boolean b() {
        return this.O.isShowing();
    }

    public final int c() {
        return this.f;
    }

    @Override // defpackage.sb90
    public final void dismiss() {
        PopupWindow popupWindow = this.O;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.c = null;
        this.K.removeCallbacks(this.G);
    }

    public final void e(int i) {
        this.f = i;
    }

    public final Drawable g() {
        return this.O.getBackground();
    }

    public final void i(int i) {
        this.i = i;
        this.w = true;
    }

    public final int l() {
        if (this.w) {
            return this.i;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        d dVar = this.C;
        if (dVar == null) {
            this.C = new d();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.C);
        }
        qef qefVar = this.c;
        if (qefVar != null) {
            qefVar.setAdapter(this.b);
        }
    }

    @Override // defpackage.sb90
    public final qef o() {
        return this.c;
    }

    public final void p(Drawable drawable) {
        this.O.setBackgroundDrawable(drawable);
    }

    public qef q(Context context, boolean z) {
        return new qef(context, z);
    }

    public final void r(int i) {
        Drawable background = this.O.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.L;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }
}
