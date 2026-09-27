package qv;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@IgnoreJRERequirement
public final class c extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final c f122952a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f122953b = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends ClassValue<ds.l<? super Throwable, ? extends Throwable>> {
        @Override // java.lang.ClassValue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ds.l<Throwable, Throwable> computeValue(Class<?> cls) {
            kotlin.jvm.internal.m0.n(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return u.g(cls);
        }
    }

    @Override // qv.k
    @oy.l
    public ds.l<Throwable, Throwable> a(@oy.l Class<? extends Throwable> cls) {
        return (ds.l) f122953b.get(cls);
    }
}
