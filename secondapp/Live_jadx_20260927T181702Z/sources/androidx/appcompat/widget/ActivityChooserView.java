package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements androidx.appcompat.widget.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f6731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f6732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f6733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f6734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f6735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f6736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f6737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f2.b f6739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DataSetObserver f6740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f6741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t1 f6742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PopupWindow.OnDismissListener f6743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6747s;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f6748b = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            l2 l2VarF = l2.F(context, attributeSet, f6748b);
            setBackgroundDrawable(l2VarF.h(0));
            l2VarF.I();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f6730b.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f6730b.notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                f2.b bVar = ActivityChooserView.this.f6739k;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends View.AccessibilityDelegate {
        public c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            g2.n0.r2(accessibilityNodeInfo).g1(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends i1 {
        public d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.i1
        public s.f b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.i1
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.i1
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends BaseAdapter {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f6754h = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f6755i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f6756j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f6757k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f6758l = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.widget.c f6759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6760c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f6763f;

        public f() {
        }

        public int a() {
            return this.f6759b.f();
        }

        public androidx.appcompat.widget.c b() {
            return this.f6759b;
        }

        public ResolveInfo c() {
            return this.f6759b.h();
        }

        public int d() {
            return this.f6759b.j();
        }

        public boolean e() {
            return this.f6761d;
        }

        public int f() {
            int i10 = this.f6760c;
            this.f6760c = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i11 = 0; i11 < count; i11++) {
                view = getView(i11, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f6760c = i10;
            return iMax;
        }

        public void g(androidx.appcompat.widget.c cVar) {
            androidx.appcompat.widget.c cVarB = ActivityChooserView.this.f6730b.b();
            if (cVarB != null && ActivityChooserView.this.isShown()) {
                cVarB.unregisterObserver(ActivityChooserView.this.f6740l);
            }
            this.f6759b = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f6740l);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iF = this.f6759b.f();
            if (!this.f6761d && this.f6759b.h() != null) {
                iF--;
            }
            int iMin = Math.min(iF, this.f6760c);
            return this.f6763f ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f6761d && this.f6759b.h() != null) {
                i10++;
            }
            return this.f6759b.e(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return (this.f6763f && i10 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(m.a.j.f105760h, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(m.a.g.f105727s0)).setText(ActivityChooserView.this.getContext().getString(m.a.k.f105783e));
                return viewInflate;
            }
            if (view == null || view.getId() != m.a.g.H) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(m.a.j.f105760h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(m.a.g.E);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(m.a.g.f105727s0)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f6761d && i10 == 0 && this.f6762e) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i10) {
            if (this.f6760c != i10) {
                this.f6760c = i10;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z10, boolean z11) {
            if (this.f6761d == z10 && this.f6762e == z11) {
                return;
            }
            this.f6761d = z10;
            this.f6762e = z11;
            notifyDataSetChanged();
        }

        public void j(boolean z10) {
            if (this.f6763f != z10) {
                this.f6763f = z10;
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f6743o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f6736h) {
                if (view != activityChooserView.f6734f) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f6744p = false;
                activityChooserView.d(activityChooserView.f6745q);
                return;
            }
            activityChooserView.a();
            Intent intentB = ActivityChooserView.this.f6730b.b().b(ActivityChooserView.this.f6730b.b().g(ActivityChooserView.this.f6730b.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            f2.b bVar = ActivityChooserView.this.f6739k;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f6744p) {
                if (i10 > 0) {
                    activityChooserView.f6730b.b().r(i10);
                    return;
                }
                return;
            }
            if (!activityChooserView.f6730b.e()) {
                i10++;
            }
            Intent intentB = ActivityChooserView.this.f6730b.b().b(i10);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f6736h) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f6730b.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f6744p = true;
                activityChooserView2.d(activityChooserView2.f6745q);
            }
            return true;
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f6741m);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().isShowing();
    }

    public boolean c() {
        if (b() || !this.f6746r) {
            return false;
        }
        this.f6744p = false;
        d(this.f6745q);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void d(int i10) {
        if (this.f6730b.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f6741m);
        ?? r10 = this.f6736h.getVisibility() == 0 ? 1 : 0;
        int iA = this.f6730b.a();
        if (i10 == Integer.MAX_VALUE || iA <= i10 + r10) {
            this.f6730b.j(false);
            this.f6730b.h(i10);
        } else {
            this.f6730b.j(true);
            this.f6730b.h(i10 - 1);
        }
        t1 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.isShowing()) {
            return;
        }
        if (this.f6744p || r10 == 0) {
            this.f6730b.i(true, r10);
        } else {
            this.f6730b.i(false, false);
        }
        listPopupWindow.setContentWidth(Math.min(this.f6730b.f(), this.f6738j));
        listPopupWindow.show();
        f2.b bVar = this.f6739k;
        if (bVar != null) {
            bVar.m(true);
        }
        listPopupWindow.getListView().setContentDescription(getContext().getString(m.a.k.f105784f));
        listPopupWindow.getListView().setSelector(new ColorDrawable(0));
    }

    public void e() {
        if (this.f6730b.getCount() > 0) {
            this.f6734f.setEnabled(true);
        } else {
            this.f6734f.setEnabled(false);
        }
        int iA = this.f6730b.a();
        int iD = this.f6730b.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.f6736h.setVisibility(0);
            ResolveInfo resolveInfoC = this.f6730b.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f6737i.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.f6747s != 0) {
                this.f6736h.setContentDescription(getContext().getString(this.f6747s, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.f6736h.setVisibility(8);
        }
        if (this.f6736h.getVisibility() == 0) {
            this.f6732d.setBackgroundDrawable(this.f6733e);
        } else {
            this.f6732d.setBackgroundDrawable(null);
        }
    }

    @k.y0({k.y0.a.LIBRARY})
    public androidx.appcompat.widget.c getDataModel() {
        return this.f6730b.b();
    }

    public t1 getListPopupWindow() {
        if (this.f6742n == null) {
            t1 t1Var = new t1(getContext());
            this.f6742n = t1Var;
            t1Var.setAdapter(this.f6730b);
            this.f6742n.setAnchorView(this);
            this.f6742n.setModal(true);
            this.f6742n.setOnItemClickListener(this.f6731c);
            this.f6742n.setOnDismissListener(this.f6731c);
        }
        return this.f6742n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.c cVarB = this.f6730b.b();
        if (cVarB != null) {
            cVarB.registerObserver(this.f6740l);
        }
        this.f6746r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVarB = this.f6730b.b();
        if (cVarB != null) {
            cVarB.unregisterObserver(this.f6740l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f6741m);
        }
        if (b()) {
            a();
        }
        this.f6746r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f6732d.layout(0, 0, i12 - i10, i13 - i11);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        View view = this.f6732d;
        if (this.f6736h.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.c.a
    @k.y0({k.y0.a.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.c cVar) {
        this.f6730b.g(cVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f6747s = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f6735g.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f6735g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f6745q = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f6743o = onDismissListener;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setProvider(f2.b bVar) {
        this.f6739k = bVar;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6740l = new a();
        this.f6741m = new b();
        this.f6745q = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.a.m.Q, i10, 0);
        f2.z1.E1(this, context, m.a.m.Q, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        this.f6745q = typedArrayObtainStyledAttributes.getInt(m.a.m.S, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(m.a.m.R);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(m.a.j.f105759g, (ViewGroup) this, true);
        g gVar = new g();
        this.f6731c = gVar;
        View viewFindViewById = findViewById(m.a.g.f105716n);
        this.f6732d = viewFindViewById;
        this.f6733e = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(m.a.g.f105738y);
        this.f6736h = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        this.f6737i = (ImageView) frameLayout.findViewById(m.a.g.F);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(m.a.g.A);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f6734f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(m.a.g.F);
        this.f6735g = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f6730b = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f6738j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(m.a.e.f105632x));
    }
}
