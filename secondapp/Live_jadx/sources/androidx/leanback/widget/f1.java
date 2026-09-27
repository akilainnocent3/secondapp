package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f1 extends a2 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f12521c;

        public a(View view) {
            super(view);
            this.f12521c = (ImageView) view.findViewById(s3.a.h.f128691a);
        }

        public ImageView d() {
            return this.f12521c;
        }
    }

    @Override // androidx.leanback.widget.a2
    public void c(a2.a aVar, Object obj) {
        ((a) aVar).d().setImageDrawable(((g1.a) obj).a());
    }

    @Override // androidx.leanback.widget.a2
    public a2.a e(ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(s3.a.j.W, viewGroup, false));
    }

    @Override // androidx.leanback.widget.a2
    public void f(a2.a aVar) {
    }
}
