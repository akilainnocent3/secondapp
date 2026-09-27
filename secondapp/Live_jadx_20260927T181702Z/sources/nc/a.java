package nc;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<Drawable> f116419a;

    /* JADX INFO: renamed from: nc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class C1069a implements f<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f<Drawable> f116420a;

        public C1069a(f<Drawable> fVar) {
            this.f116420a = fVar;
        }

        @Override // nc.f
        public boolean a(R r10, f.a aVar) {
            return this.f116420a.a(new BitmapDrawable(aVar.getView().getResources(), a.this.b(r10)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f116419a = gVar;
    }

    @Override // nc.g
    public f<R> a(tb.a aVar, boolean z10) {
        return new C1069a(this.f116419a.a(aVar, z10));
    }

    public abstract Bitmap b(R r10);
}
