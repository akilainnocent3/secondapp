package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u2 extends qv.f0 implements o1, h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2 f100895e;

    @oy.l
    public final v2 C() {
        v2 v2Var = this.f100895e;
        if (v2Var != null) {
            return v2Var;
        }
        kotlin.jvm.internal.m0.S("job");
        return null;
    }

    public abstract boolean D();

    public abstract void E(@oy.m Throwable th2);

    public final void F(@oy.l v2 v2Var) {
        this.f100895e = v2Var;
    }

    @Override // jv.o1
    public void a() {
        C().t1(this);
    }

    @Override // jv.h2
    @oy.m
    public a3 c() {
        return null;
    }

    @Override // jv.h2
    public boolean isActive() {
        return true;
    }

    @Override // qv.f0
    @oy.l
    public String toString() {
        return x0.a(this) + '@' + x0.b(this) + "[job@" + x0.b(C()) + fw.b.f85385l;
    }
}
