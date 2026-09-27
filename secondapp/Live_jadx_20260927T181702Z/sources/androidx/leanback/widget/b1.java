package androidx.leanback.widget;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b1 extends h2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i1 f12333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f12334h;

    public b1(r0 r0Var, i1 i1Var) {
        super(r0Var);
        this.f12333g = i1Var;
        k();
    }

    private void k() {
        if (this.f12333g == null) {
            throw new IllegalArgumentException("ObjectAdapter cannot be null");
        }
    }

    public final i1 h() {
        return this.f12333g;
    }

    public CharSequence i() {
        CharSequence charSequence = this.f12334h;
        if (charSequence != null) {
            return charSequence;
        }
        r0 r0VarB = b();
        if (r0VarB == null) {
            return null;
        }
        CharSequence charSequenceA = r0VarB.a();
        return charSequenceA != null ? charSequenceA : r0VarB.d();
    }

    public void j(CharSequence charSequence) {
        this.f12334h = charSequence;
    }

    public b1(long j10, r0 r0Var, i1 i1Var) {
        super(j10, r0Var);
        this.f12333g = i1Var;
        k();
    }

    public b1(i1 i1Var) {
        this.f12333g = i1Var;
        k();
    }
}
