package a9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f4052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<l9.i, dr.w2> f4053b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @cs.k
    public c2(@oy.l String sql) {
        this(sql, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.m0.p(sql, "sql");
    }

    public static final dr.w2 c(l9.i it) {
        kotlin.jvm.internal.m0.p(it, "it");
        return dr.w2.f79517a;
    }

    public static final dr.w2 d(ds.l lVar, l9.i it) {
        kotlin.jvm.internal.m0.p(it, "it");
        lVar.invoke(new h(it));
        return dr.w2.f79517a;
    }

    @oy.l
    public final ds.l<l9.i, dr.w2> e() {
        return this.f4053b;
    }

    @oy.l
    public final String f() {
        return this.f4052a;
    }

    @cs.k
    public c2(@oy.l String sql, @oy.l final ds.l<? super l9.i, dr.w2> onBindStatement) {
        kotlin.jvm.internal.m0.p(sql, "sql");
        kotlin.jvm.internal.m0.p(onBindStatement, "onBindStatement");
        this.f4052a = sql;
        this.f4053b = new ds.l() { // from class: a9.a2
            @Override // ds.l
            public final Object invoke(Object obj) {
                return c2.d(onBindStatement, (l9.i) obj);
            }
        };
    }

    public /* synthetic */ c2(String str, ds.l lVar, int i10, kotlin.jvm.internal.x xVar) {
        this(str, (i10 & 2) != 0 ? new ds.l() { // from class: a9.b2
            @Override // ds.l
            public final Object invoke(Object obj) {
                return c2.c((l9.i) obj);
            }
        } : lVar);
    }
}
