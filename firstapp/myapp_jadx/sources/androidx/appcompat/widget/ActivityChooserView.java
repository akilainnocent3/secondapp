package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import defpackage.cc;
import defpackage.dl30;
import defpackage.fui;
import defpackage.fyf0;
import defpackage.ib5;
import defpackage.mc;
import defpackage.r6i0;
import defpackage.sb90;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {
    public final f a;
    public final g b;
    public final View c;
    public final FrameLayout d;
    public final ImageView e;
    public final FrameLayout f;
    public cc i;
    public final b v;
    public ListPopupWindow w;
    public PopupWindow.OnDismissListener y;
    public boolean z;

    public static class InnerLayout extends LinearLayout {
        public static final int[] a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            fyf0 fyf0VarE = fyf0.e(context, attributeSet, a);
            setBackgroundDrawable(fyf0VarE.b(0));
            fyf0VarE.g();
        }
    }

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.a.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ActionMenuPresenter actionMenuPresenter;
            j.a aVar;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.b()) {
                if (!activityChooserView.isShown()) {
                    activityChooserView.getListPopupWindow().dismiss();
                    return;
                }
                activityChooserView.getListPopupWindow().a();
                cc ccVar = activityChooserView.i;
                if (ccVar == null || (actionMenuPresenter = ccVar.a) == null || (aVar = actionMenuPresenter.e) == null) {
                    return;
                }
                aVar.d(actionMenuPresenter.c);
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    public class d extends fui {
        public d(FrameLayout frameLayout) {
            super(frameLayout);
        }

        @Override // defpackage.fui
        public final sb90 b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // defpackage.fui
        public final boolean c() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.b() || !activityChooserView.z) {
                return true;
            }
            activityChooserView.a.getClass();
            ib5.a("No data model. Did you call #setDataModel?");
            return false;
        }

        @Override // defpackage.fui
        public final boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.a.getClass();
            throw null;
        }
    }

    public class f extends BaseAdapter {
        public f() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == null || view.getId() != com.sportybet.android.gp.tz.R.id.list_item) {
                view = LayoutInflater.from(activityChooserView.getContext()).inflate(com.sportybet.android.gp.tz.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            activityChooserView.getContext().getPackageManager();
            throw null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            f fVar = activityChooserView.a;
            if (view == activityChooserView.f) {
                activityChooserView.a();
                fVar.getClass();
                throw null;
            }
            if (view != activityChooserView.d) {
                throw new IllegalArgumentException();
            }
            fVar.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            ActionMenuPresenter actionMenuPresenter;
            androidx.appcompat.view.menu.f fVar;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            PopupWindow.OnDismissListener onDismissListener = activityChooserView.y;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            cc ccVar = activityChooserView.i;
            if (ccVar == null || (actionMenuPresenter = ccVar.a) == null || (fVar = actionMenuPresenter.c) == null) {
                return;
            }
            fVar.c(false);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((f) adapterView.getAdapter()).getClass();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.a();
            activityChooserView.a.getClass();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f) {
                throw new IllegalArgumentException();
            }
            activityChooserView.a.getClass();
            throw null;
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new a();
        this.v = new b();
        int[] iArr = dl30.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        r6i0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(com.sportybet.android.gp.tz.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        g gVar = new g();
        this.b = gVar;
        View viewFindViewById = findViewById(com.sportybet.android.gp.tz.R.id.activity_chooser_view_content);
        this.c = viewFindViewById;
        viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(com.sportybet.android.gp.tz.R.id.default_activity_button);
        this.f = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(com.sportybet.android.gp.tz.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(com.sportybet.android.gp.tz.R.id.image);
        this.e = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.abc_config_prefDialogWidth));
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.v);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().O.isShowing();
    }

    public mc getDataModel() {
        this.a.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.w == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.w = listPopupWindow;
            listPopupWindow.m(this.a);
            ListPopupWindow listPopupWindow2 = this.w;
            listPopupWindow2.D = this;
            listPopupWindow2.N = true;
            listPopupWindow2.O.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.w;
            g gVar = this.b;
            listPopupWindow3.E = gVar;
            listPopupWindow3.O.setOnDismissListener(gVar);
        }
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.getClass();
        this.z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.v);
        }
        if (b()) {
            a();
        }
        this.z = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.c;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(mc mcVar) {
        f fVar = this.a;
        ActivityChooserView.this.a.getClass();
        fVar.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.z) {
                return;
            }
            fVar.getClass();
            ib5.a("No data model. Did you call #setDataModel?");
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.e.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    public void setProvider(cc ccVar) {
        this.i = ccVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }
}
