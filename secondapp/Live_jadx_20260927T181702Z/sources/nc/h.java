package nc;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f116432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f<R> f116433b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f116434a;

        public a(Animation animation) {
            this.f116434a = animation;
        }

        @Override // nc.k.a
        public Animation a(Context context) {
            return this.f116434a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f116435a;

        public b(int i10) {
            this.f116435a = i10;
        }

        @Override // nc.k.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f116435a);
        }
    }

    public h(Animation animation) {
        this(new a(animation));
    }

    @Override // nc.g
    public f<R> a(tb.a aVar, boolean z10) {
        if (aVar == tb.a.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f116433b == null) {
            this.f116433b = new k(this.f116432a);
        }
        return this.f116433b;
    }

    public h(int i10) {
        this(new b(i10));
    }

    public h(k.a aVar) {
        this.f116432a = aVar;
    }
}
