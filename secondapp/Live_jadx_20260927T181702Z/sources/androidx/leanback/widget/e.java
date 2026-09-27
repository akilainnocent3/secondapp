package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f12457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f12458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2[] f12459c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a extends a2 {
        @Override // androidx.leanback.widget.a2
        public void c(a2.a aVar, Object obj) {
            androidx.leanback.widget.d dVar = (androidx.leanback.widget.d) obj;
            b bVar = (b) aVar;
            bVar.f12460c = dVar;
            Drawable drawableB = dVar.b();
            if (drawableB != null) {
                bVar.f12292a.setPaddingRelative(bVar.f12292a.getResources().getDimensionPixelSize(s3.a.e.f128560h), 0, bVar.f12292a.getResources().getDimensionPixelSize(s3.a.e.f128555g), 0);
            } else {
                int dimensionPixelSize = bVar.f12292a.getResources().getDimensionPixelSize(s3.a.e.f128545e);
                bVar.f12292a.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
            if (bVar.f12462e == 1) {
                bVar.f12461d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableB, (Drawable) null);
            } else {
                bVar.f12461d.setCompoundDrawablesWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        @Override // androidx.leanback.widget.a2
        public void f(a2.a aVar) {
            b bVar = (b) aVar;
            bVar.f12461d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            bVar.f12292a.setPadding(0, 0, 0, 0);
            bVar.f12460c = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.leanback.widget.d f12460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Button f12461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12462e;

        public b(View view, int i10) {
            super(view);
            this.f12461d = (Button) view.findViewById(s3.a.h.Q0);
            this.f12462e = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends a {
        @Override // androidx.leanback.widget.e.a, androidx.leanback.widget.a2
        public void c(a2.a aVar, Object obj) {
            super.c(aVar, obj);
            ((b) aVar).f12461d.setText(((androidx.leanback.widget.d) obj).d());
        }

        @Override // androidx.leanback.widget.a2
        public a2.a e(ViewGroup viewGroup) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(s3.a.j.f128817a, viewGroup, false), viewGroup.getLayoutDirection());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends a {
        @Override // androidx.leanback.widget.e.a, androidx.leanback.widget.a2
        public void c(a2.a aVar, Object obj) {
            super.c(aVar, obj);
            androidx.leanback.widget.d dVar = (androidx.leanback.widget.d) obj;
            b bVar = (b) aVar;
            CharSequence charSequenceD = dVar.d();
            CharSequence charSequenceE = dVar.e();
            if (TextUtils.isEmpty(charSequenceD)) {
                bVar.f12461d.setText(charSequenceE);
                return;
            }
            if (TextUtils.isEmpty(charSequenceE)) {
                bVar.f12461d.setText(charSequenceD);
                return;
            }
            bVar.f12461d.setText(((Object) charSequenceD) + IOUtils.LINE_SEPARATOR_UNIX + ((Object) charSequenceE));
        }

        @Override // androidx.leanback.widget.a2
        public a2.a e(ViewGroup viewGroup) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(s3.a.j.f128819b, viewGroup, false), viewGroup.getLayoutDirection());
        }
    }

    public e() {
        c cVar = new c();
        this.f12457a = cVar;
        d dVar = new d();
        this.f12458b = dVar;
        this.f12459c = new a2[]{cVar, dVar};
    }

    @Override // androidx.leanback.widget.b2
    public a2 a(Object obj) {
        return TextUtils.isEmpty(((androidx.leanback.widget.d) obj).e()) ? this.f12457a : this.f12458b;
    }

    @Override // androidx.leanback.widget.b2
    public a2[] b() {
        return this.f12459c;
    }
}
