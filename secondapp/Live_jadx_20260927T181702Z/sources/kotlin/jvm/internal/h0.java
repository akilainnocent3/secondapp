package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class h0 extends r implements f0, ns.i {
    private final int arity;

    @dr.l1(version = sc.k.f129877g)
    private final int flags;

    public h0(int i10) {
        this(i10, r.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.r
    @dr.l1(version = "1.1")
    public ns.c computeReflected() {
        return m1.c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return getName().equals(h0Var.getName()) && getSignature().equals(h0Var.getSignature()) && this.flags == h0Var.flags && this.arity == h0Var.arity && m0.g(getBoundReceiver(), h0Var.getBoundReceiver()) && m0.g(getOwner(), h0Var.getOwner());
        }
        if (obj instanceof ns.i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f0
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // ns.i
    @dr.l1(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ns.i
    @dr.l1(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ns.i
    @dr.l1(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ns.i
    @dr.l1(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.r, ns.c, ns.i
    @dr.l1(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ns.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + m1.f102753b;
    }

    @dr.l1(version = "1.1")
    public h0(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.r
    @dr.l1(version = "1.1")
    public ns.i getReflected() {
        return (ns.i) super.getReflected();
    }

    @dr.l1(version = sc.k.f129877g)
    public h0(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
