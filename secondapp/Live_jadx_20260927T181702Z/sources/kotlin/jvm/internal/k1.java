package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class k1 extends r implements ns.o {
    private final boolean syntheticJavaProperty;

    public k1() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.r
    public ns.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            return getOwner().equals(k1Var.getOwner()) && getName().equals(k1Var.getName()) && getSignature().equals(k1Var.getSignature()) && m0.g(getBoundReceiver(), k1Var.getBoundReceiver());
        }
        if (obj instanceof ns.o) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // ns.o
    @dr.l1(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // ns.o
    @dr.l1(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        ns.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + m1.f102753b;
    }

    @Override // kotlin.jvm.internal.r
    @dr.l1(version = "1.1")
    public ns.o getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (ns.o) super.getReflected();
    }

    @dr.l1(version = "1.1")
    public k1(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @dr.l1(version = sc.k.f129877g)
    public k1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }
}
