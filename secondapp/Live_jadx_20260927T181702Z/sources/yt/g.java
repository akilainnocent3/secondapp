package yt;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f159889b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f159890c = new g(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, i.g<?, ?>> f159891a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f159892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f159893b;

        public a(Object obj, int i10) {
            this.f159892a = obj;
            this.f159893b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f159892a == aVar.f159892a && this.f159893b == aVar.f159893b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f159892a) * 65535) + this.f159893b;
        }
    }

    public g() {
        this.f159891a = new HashMap();
    }

    public static g c() {
        return f159890c;
    }

    public static g d() {
        return new g();
    }

    public final void a(i.g<?, ?> gVar) {
        this.f159891a.put(new a(gVar.b(), gVar.d()), gVar);
    }

    public <ContainingType extends q> i.g<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return (i.g) this.f159891a.get(new a(containingtype, i10));
    }

    public g(boolean z10) {
        this.f159891a = Collections.EMPTY_MAP;
    }
}
