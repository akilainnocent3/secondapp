package e9;

import dr.w2;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final ds.l<m9.e, w2> f80592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, int i11, @l ds.l<? super m9.e, w2> migrateCallback) {
        super(i10, i11);
        m0.p(migrateCallback, "migrateCallback");
        this.f80592c = migrateCallback;
    }

    @Override // e9.c
    public void b(@l m9.e db2) {
        m0.p(db2, "db");
        this.f80592c.invoke(db2);
    }

    @l
    public final ds.l<m9.e, w2> c() {
        return this.f80592c;
    }
}
