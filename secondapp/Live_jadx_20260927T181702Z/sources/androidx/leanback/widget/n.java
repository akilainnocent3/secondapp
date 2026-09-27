package androidx.leanback.widget;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class n extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f12809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f12810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2[] f12811c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f12812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f12813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f12814e;

        public a(View view) {
            super(view);
            this.f12812c = (ImageView) view.findViewById(s3.a.h.H0);
            this.f12813d = (TextView) view.findViewById(s3.a.h.P0);
            this.f12814e = view.findViewById(s3.a.h.f128785y);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends a2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12815b;

        public b(int i10) {
            this.f12815b = i10;
        }

        @Override // androidx.leanback.widget.a2
        public void c(a2.a aVar, Object obj) {
            d dVar = (d) obj;
            a aVar2 = (a) aVar;
            aVar2.f12812c.setImageDrawable(dVar.b());
            if (aVar2.f12813d != null) {
                if (dVar.b() == null) {
                    aVar2.f12813d.setText(dVar.d());
                } else {
                    aVar2.f12813d.setText((CharSequence) null);
                }
            }
            CharSequence charSequenceD = TextUtils.isEmpty(dVar.e()) ? dVar.d() : dVar.e();
            if (TextUtils.equals(aVar2.f12814e.getContentDescription(), charSequenceD)) {
                return;
            }
            aVar2.f12814e.setContentDescription(charSequenceD);
            aVar2.f12814e.sendAccessibilityEvent(32768);
        }

        @Override // androidx.leanback.widget.a2
        public a2.a e(ViewGroup viewGroup) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f12815b, viewGroup, false));
        }

        @Override // androidx.leanback.widget.a2
        public void f(a2.a aVar) {
            a aVar2 = (a) aVar;
            aVar2.f12812c.setImageDrawable(null);
            TextView textView = aVar2.f12813d;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            aVar2.f12814e.setContentDescription(null);
        }

        @Override // androidx.leanback.widget.a2
        public void j(a2.a aVar, View.OnClickListener onClickListener) {
            ((a) aVar).f12814e.setOnClickListener(onClickListener);
        }
    }

    public n() {
        b bVar = new b(s3.a.j.f128829g);
        this.f12809a = bVar;
        this.f12810b = new b(s3.a.j.f128831h);
        this.f12811c = new a2[]{bVar};
    }

    @Override // androidx.leanback.widget.b2
    public a2 a(Object obj) {
        return this.f12809a;
    }

    @Override // androidx.leanback.widget.b2
    public a2[] b() {
        return this.f12811c;
    }

    public a2 c() {
        return this.f12809a;
    }

    public a2 d() {
        return this.f12810b;
    }
}
