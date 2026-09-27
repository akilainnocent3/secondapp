package ft;

import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e0<T> implements d0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<wt.c, T> f85249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final nu.f f85250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final nu.h<wt.c, T> f85251d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends o0 implements ds.l<wt.c, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e0<T> f85252g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0<T> e0Var) {
            super(1);
            this.f85252g = e0Var;
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(wt.c it) {
            m0.o(it, "it");
            return (T) wt.e.a(it, this.f85252g.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@oy.l Map<wt.c, ? extends T> states) {
        m0.p(states, "states");
        this.f85249b = states;
        nu.f fVar = new nu.f("Java nullability annotation states");
        this.f85250c = fVar;
        nu.h<wt.c, T> hVarC = fVar.c(new a(this));
        m0.o(hVarC, "storageManager.createMem…cificFqname(states)\n    }");
        this.f85251d = hVarC;
    }

    @Override // ft.d0
    @oy.m
    public T a(@oy.l wt.c fqName) {
        m0.p(fqName, "fqName");
        return this.f85251d.invoke(fqName);
    }

    @oy.l
    public final Map<wt.c, T> b() {
        return this.f85249b;
    }
}
