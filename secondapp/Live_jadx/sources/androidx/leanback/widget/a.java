package androidx.leanback.widget;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends a2 {

    /* JADX INFO: renamed from: androidx.leanback.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0078a extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f12269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f12270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f12271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f12272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f12273g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f12274h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f12275i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f12276j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f12277k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f12278l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Paint.FontMetricsInt f12279m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Paint.FontMetricsInt f12280n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Paint.FontMetricsInt f12281o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f12282p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ViewTreeObserver.OnPreDrawListener f12283q;

        /* JADX INFO: renamed from: androidx.leanback.widget.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class ViewOnLayoutChangeListenerC0079a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC0079a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                C0078a.this.d();
            }
        }

        /* JADX INFO: renamed from: androidx.leanback.widget.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements ViewTreeObserver.OnPreDrawListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (C0078a.this.f12270d.getVisibility() == 0 && C0078a.this.f12270d.getTop() > C0078a.this.f12292a.getHeight() && C0078a.this.f12269c.getLineCount() > 1) {
                    TextView textView = C0078a.this.f12269c;
                    textView.setMaxLines(textView.getLineCount() - 1);
                    return false;
                }
                int i10 = C0078a.this.f12269c.getLineCount() > 1 ? C0078a.this.f12278l : C0078a.this.f12277k;
                if (C0078a.this.f12271e.getMaxLines() != i10) {
                    C0078a.this.f12271e.setMaxLines(i10);
                    return false;
                }
                C0078a.this.i();
                return true;
            }
        }

        public C0078a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(s3.a.h.f128717g1);
            this.f12269c = textView;
            TextView textView2 = (TextView) view.findViewById(s3.a.h.f128713f1);
            this.f12270d = textView2;
            TextView textView3 = (TextView) view.findViewById(s3.a.h.f128709e1);
            this.f12271e = textView3;
            this.f12272f = view.getResources().getDimensionPixelSize(s3.a.e.f128571j0) + f(textView).ascent;
            this.f12273g = view.getResources().getDimensionPixelSize(s3.a.e.f128606q0);
            this.f12274h = view.getResources().getDimensionPixelSize(s3.a.e.f128601p0);
            this.f12275i = view.getResources().getDimensionPixelSize(s3.a.e.f128576k0);
            this.f12276j = view.getResources().getDimensionPixelSize(s3.a.e.f128556g0);
            this.f12277k = view.getResources().getInteger(s3.a.i.f128797g);
            this.f12278l = view.getResources().getInteger(s3.a.i.f128798h);
            this.f12282p = textView.getMaxLines();
            this.f12279m = f(textView);
            this.f12280n = f(textView2);
            this.f12281o = f(textView3);
            textView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0079a());
        }

        public void d() {
            if (this.f12283q != null) {
                return;
            }
            this.f12283q = new b();
            this.f12292a.getViewTreeObserver().addOnPreDrawListener(this.f12283q);
        }

        public TextView e() {
            return this.f12271e;
        }

        public final Paint.FontMetricsInt f(TextView textView) {
            Paint paint = new Paint(1);
            paint.setTextSize(textView.getTextSize());
            paint.setTypeface(textView.getTypeface());
            return paint.getFontMetricsInt();
        }

        public TextView g() {
            return this.f12270d;
        }

        public TextView h() {
            return this.f12269c;
        }

        public void i() {
            if (this.f12283q != null) {
                this.f12292a.getViewTreeObserver().removeOnPreDrawListener(this.f12283q);
                this.f12283q = null;
            }
        }
    }

    @Override // androidx.leanback.widget.a2
    public final void c(a2.a aVar, Object obj) {
        boolean z10;
        C0078a c0078a = (C0078a) aVar;
        k(c0078a, obj);
        boolean z11 = true;
        if (TextUtils.isEmpty(c0078a.f12269c.getText())) {
            c0078a.f12269c.setVisibility(8);
            z10 = false;
        } else {
            c0078a.f12269c.setVisibility(0);
            TextView textView = c0078a.f12269c;
            textView.setLineSpacing((c0078a.f12275i - textView.getLineHeight()) + c0078a.f12269c.getLineSpacingExtra(), c0078a.f12269c.getLineSpacingMultiplier());
            c0078a.f12269c.setMaxLines(c0078a.f12282p);
            z10 = true;
        }
        m(c0078a.f12269c, c0078a.f12272f);
        if (TextUtils.isEmpty(c0078a.f12270d.getText())) {
            c0078a.f12270d.setVisibility(8);
            z11 = false;
        } else {
            c0078a.f12270d.setVisibility(0);
            if (z10) {
                m(c0078a.f12270d, (c0078a.f12273g + c0078a.f12280n.ascent) - c0078a.f12279m.descent);
            } else {
                m(c0078a.f12270d, 0);
            }
        }
        if (TextUtils.isEmpty(c0078a.f12271e.getText())) {
            c0078a.f12271e.setVisibility(8);
            return;
        }
        c0078a.f12271e.setVisibility(0);
        TextView textView2 = c0078a.f12271e;
        textView2.setLineSpacing((c0078a.f12276j - textView2.getLineHeight()) + c0078a.f12271e.getLineSpacingExtra(), c0078a.f12271e.getLineSpacingMultiplier());
        if (z11) {
            m(c0078a.f12271e, (c0078a.f12274h + c0078a.f12281o.ascent) - c0078a.f12280n.descent);
        } else if (z10) {
            m(c0078a.f12271e, (c0078a.f12273g + c0078a.f12281o.ascent) - c0078a.f12279m.descent);
        } else {
            m(c0078a.f12271e, 0);
        }
    }

    @Override // androidx.leanback.widget.a2
    public void g(a2.a aVar) {
        ((C0078a) aVar).d();
        super.g(aVar);
    }

    @Override // androidx.leanback.widget.a2
    public void h(a2.a aVar) {
        ((C0078a) aVar).i();
        super.h(aVar);
    }

    public abstract void k(C0078a c0078a, Object obj);

    @Override // androidx.leanback.widget.a2
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C0078a e(ViewGroup viewGroup) {
        return new C0078a(LayoutInflater.from(viewGroup.getContext()).inflate(s3.a.j.f128833i, viewGroup, false));
    }

    public final void m(TextView textView, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = i10;
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.leanback.widget.a2
    public void f(a2.a aVar) {
    }
}
