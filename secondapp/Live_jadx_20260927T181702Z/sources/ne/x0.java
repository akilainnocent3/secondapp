package ne;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g
@he.f({"javax.inject.Named"})
public final class x0 implements he.c<w0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Context> f116541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<String> f116542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr.c<Integer> f116543c;

    public x0(cr.c<Context> cVar, cr.c<String> cVar2, cr.c<Integer> cVar3) {
        this.f116541a = cVar;
        this.f116542b = cVar2;
        this.f116543c = cVar3;
    }

    public static x0 a(cr.c<Context> cVar, cr.c<String> cVar2, cr.c<Integer> cVar3) {
        return new x0(cVar, cVar2, cVar3);
    }

    public static w0 c(Context context, String str, int i10) {
        return new w0(context, str, i10);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 get() {
        return c(this.f116541a.get(), this.f116542b.get(), this.f116543c.get().intValue());
    }
}
