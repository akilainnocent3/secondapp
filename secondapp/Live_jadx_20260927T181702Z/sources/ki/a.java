package ki;

import android.graphics.Typeface;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f102406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0969a f102407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102408c;

    /* JADX INFO: renamed from: ki.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0969a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0969a interfaceC0969a, Typeface typeface) {
        this.f102406a = typeface;
        this.f102407b = interfaceC0969a;
    }

    @Override // ki.f
    public void a(int i10) {
        d(this.f102406a);
    }

    @Override // ki.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f102408c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f102408c) {
            return;
        }
        this.f102407b.a(typeface);
    }
}
