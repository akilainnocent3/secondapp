package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class r implements ns.c, Serializable {

    @dr.l1(version = "1.1")
    public static final Object NO_RECEIVER = a.f102768b;

    @dr.l1(version = sc.k.f129877g)
    private final boolean isTopLevel;

    @dr.l1(version = sc.k.f129877g)
    private final String name;

    @dr.l1(version = sc.k.f129877g)
    private final Class owner;

    @dr.l1(version = "1.1")
    protected final Object receiver;
    private transient ns.c reflected;

    @dr.l1(version = sc.k.f129877g)
    private final String signature;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @dr.l1(version = "1.2")
    public static class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f102768b = new a();

        public final Object g() throws ObjectStreamException {
            return f102768b;
        }
    }

    public r() {
        this(NO_RECEIVER);
    }

    @Override // ns.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ns.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @dr.l1(version = "1.1")
    public ns.c compute() {
        ns.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        ns.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    public abstract ns.c computeReflected();

    @Override // ns.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @dr.l1(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // ns.c
    public String getName() {
        return this.name;
    }

    public ns.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? m1.g(cls) : m1.d(cls);
    }

    @Override // ns.c
    public List<ns.n> getParameters() {
        return getReflected().getParameters();
    }

    @dr.l1(version = "1.1")
    public ns.c getReflected() {
        ns.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new cs.s();
    }

    @Override // ns.c
    public ns.s getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ns.c
    @dr.l1(version = "1.1")
    public List<ns.t> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ns.c
    @dr.l1(version = "1.1")
    public ns.w getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ns.c
    @dr.l1(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ns.c
    @dr.l1(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ns.c
    @dr.l1(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // ns.c, ns.i
    @dr.l1(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @dr.l1(version = "1.1")
    public r(Object obj) {
        this(obj, null, null, null, false);
    }

    @dr.l1(version = sc.k.f129877g)
    public r(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
