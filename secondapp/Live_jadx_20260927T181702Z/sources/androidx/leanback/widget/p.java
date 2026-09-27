package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class p extends a2 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f0 f12821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f0.d f12822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12823e;

        public a(View view) {
            super(view);
        }

        public f0 d() {
            return this.f12821c;
        }

        public f0.d e() {
            return this.f12822d;
        }

        public boolean f() {
            return this.f12823e;
        }

        public void g(boolean z10) {
            this.f12823e = z10;
        }
    }

    @Override // androidx.leanback.widget.a2
    public void c(a2.a aVar, Object obj) {
        q qVar = (q) obj;
        ImageView imageView = (ImageView) aVar.f12292a;
        imageView.setImageDrawable(qVar.o());
        a aVar2 = (a) aVar;
        if (k(aVar2, qVar)) {
            if (aVar2.f()) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = qVar.o().getIntrinsicWidth();
                layoutParams.height = qVar.o().getIntrinsicHeight();
                if (imageView.getMaxWidth() > 0 || imageView.getMaxHeight() > 0) {
                    float maxHeight = 1.0f;
                    float maxWidth = (imageView.getMaxWidth() <= 0 || layoutParams.width <= imageView.getMaxWidth()) ? 1.0f : imageView.getMaxWidth() / layoutParams.width;
                    if (imageView.getMaxHeight() > 0 && layoutParams.height > imageView.getMaxHeight()) {
                        maxHeight = imageView.getMaxHeight() / layoutParams.height;
                    }
                    float fMin = Math.min(maxWidth, maxHeight);
                    layoutParams.width = (int) (layoutParams.width * fMin);
                    layoutParams.height = (int) (layoutParams.height * fMin);
                }
                imageView.setLayoutParams(layoutParams);
            }
            aVar2.f12821c.U(aVar2.f12822d);
        }
    }

    @Override // androidx.leanback.widget.a2
    public a2.a e(ViewGroup viewGroup) {
        View viewL = l(viewGroup);
        a aVar = new a(viewL);
        ViewGroup.LayoutParams layoutParams = viewL.getLayoutParams();
        aVar.g(layoutParams.width == -2 && layoutParams.height == -2);
        return aVar;
    }

    public boolean k(a aVar, q qVar) {
        return (qVar == null || qVar.o() == null) ? false : true;
    }

    public View l(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(s3.a.j.f128840o, viewGroup, false);
    }

    public void m(a aVar, f0.d dVar, f0 f0Var) {
        aVar.f12822d = dVar;
        aVar.f12821c = f0Var;
    }

    @Override // androidx.leanback.widget.a2
    public void f(a2.a aVar) {
    }
}
