package or;

import dr.f1;
import dr.i1;
import dr.l1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@f1
@l1(version = "1.3")
public final class n<T> implements f<T>, rr.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f119537c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<n<?>, Object> f119538d = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "result");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final f<T> f119539b;

    @oy.m
    private volatile Object result;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }

        public static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@oy.l f<? super T> delegate, @oy.m Object obj) {
        m0.p(delegate, "delegate");
        this.f119539b = delegate;
        this.result = obj;
    }

    @f1
    @oy.m
    public final Object b() throws Throwable {
        Object obj = this.result;
        qr.a aVar = qr.a.UNDECIDED;
        if (obj == aVar) {
            if (h0.b.a(f119538d, this, aVar, qr.d.l())) {
                return qr.d.l();
            }
            obj = this.result;
        }
        if (obj == qr.a.RESUMED) {
            return qr.d.l();
        }
        if (obj instanceof i1.b) {
            throw ((i1.b) obj).f79462b;
        }
        return obj;
    }

    @Override // rr.e
    @oy.m
    public rr.e getCallerFrame() {
        f<T> fVar = this.f119539b;
        if (fVar instanceof rr.e) {
            return (rr.e) fVar;
        }
        return null;
    }

    @Override // or.f
    @oy.l
    public j getContext() {
        return this.f119539b.getContext();
    }

    @Override // rr.e
    @oy.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // or.f
    public void resumeWith(@oy.l Object obj) {
        while (true) {
            Object obj2 = this.result;
            qr.a aVar = qr.a.UNDECIDED;
            if (obj2 == aVar) {
                if (h0.b.a(f119538d, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != qr.d.l()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (h0.b.a(f119538d, this, qr.d.l(), qr.a.RESUMED)) {
                    this.f119539b.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @oy.l
    public String toString() {
        return "SafeContinuation for " + this.f119539b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @f1
    public n(@oy.l f<? super T> delegate) {
        this(delegate, qr.a.UNDECIDED);
        m0.p(delegate, "delegate");
    }
}
