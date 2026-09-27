package androidx.leanback.widget;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class j2 extends a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f12714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12716e;

    public j2() {
        this(s3.a.j.U);
    }

    public static float k(TextView textView, Paint paint) {
        if (paint.getTextSize() != textView.getTextSize()) {
            paint.setTextSize(textView.getTextSize());
        }
        if (paint.getTypeface() != textView.getTypeface()) {
            paint.setTypeface(textView.getTypeface());
        }
        return paint.descent();
    }

    @Override // androidx.leanback.widget.a2
    public void c(a2.a aVar, Object obj) {
        r0 r0VarB = obj == null ? null : ((h2) obj).b();
        a aVar2 = (a) aVar;
        if (r0VarB == null) {
            RowHeaderView rowHeaderView = aVar2.f12720f;
            if (rowHeaderView != null) {
                rowHeaderView.setText((CharSequence) null);
            }
            TextView textView = aVar2.f12721g;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            aVar.f12292a.setContentDescription(null);
            if (this.f12715d) {
                aVar.f12292a.setVisibility(8);
                return;
            }
            return;
        }
        RowHeaderView rowHeaderView2 = aVar2.f12720f;
        if (rowHeaderView2 != null) {
            rowHeaderView2.setText(r0VarB.d());
        }
        if (aVar2.f12721g != null) {
            if (TextUtils.isEmpty(r0VarB.b())) {
                aVar2.f12721g.setVisibility(8);
            } else {
                aVar2.f12721g.setVisibility(0);
            }
            aVar2.f12721g.setText(r0VarB.b());
        }
        aVar.f12292a.setContentDescription(r0VarB.a());
        aVar.f12292a.setVisibility(0);
    }

    @Override // androidx.leanback.widget.a2
    public a2.a e(ViewGroup viewGroup) {
        a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f12713b, viewGroup, false));
        if (this.f12716e) {
            p(aVar, 0.0f);
        }
        return aVar;
    }

    @Override // androidx.leanback.widget.a2
    public void f(a2.a aVar) {
        a aVar2 = (a) aVar;
        RowHeaderView rowHeaderView = aVar2.f12720f;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f12721g;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.f12716e) {
            p(aVar2, 0.0f);
        }
    }

    public int l(a aVar) {
        int paddingBottom = aVar.f12292a.getPaddingBottom();
        View view = aVar.f12292a;
        return view instanceof TextView ? paddingBottom + ((int) k((TextView) view, this.f12714c)) : paddingBottom;
    }

    public boolean m() {
        return this.f12715d;
    }

    public void n(a aVar) {
        if (this.f12716e) {
            View view = aVar.f12292a;
            float f10 = aVar.f12719e;
            view.setAlpha(f10 + (aVar.f12717c * (1.0f - f10)));
        }
    }

    public void o(boolean z10) {
        this.f12715d = z10;
    }

    public final void p(a aVar, float f10) {
        aVar.f12717c = f10;
        n(aVar);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public j2(int i10) {
        this(i10, true);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public j2(int i10, boolean z10) {
        this.f12714c = new Paint(1);
        this.f12713b = i10;
        this.f12716e = z10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12718d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f12719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public RowHeaderView f12720f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f12721g;

        public a(View view) {
            super(view);
            this.f12720f = (RowHeaderView) view.findViewById(s3.a.h.f128698b2);
            this.f12721g = (TextView) view.findViewById(s3.a.h.f128702c2);
            e();
        }

        public final float d() {
            return this.f12717c;
        }

        public void e() {
            RowHeaderView rowHeaderView = this.f12720f;
            if (rowHeaderView != null) {
                this.f12718d = rowHeaderView.getCurrentTextColor();
            }
            this.f12719e = this.f12292a.getResources().getFraction(s3.a.g.f128681a, 1, 1);
        }

        @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
        public a(RowHeaderView rowHeaderView) {
            super(rowHeaderView);
            this.f12720f = rowHeaderView;
            e();
        }
    }
}
