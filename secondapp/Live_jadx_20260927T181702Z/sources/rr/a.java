package rr;

import dr.i1;
import dr.j1;
import dr.l1;
import dr.w2;
import java.io.Serializable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
public abstract class a implements or.f<Object>, e, Serializable {

    @oy.m
    private final or.f<Object> completion;

    public a(@oy.m or.f<Object> fVar) {
        this.completion = fVar;
    }

    @oy.l
    public or.f<w2> create(@oy.l or.f<?> completion) {
        m0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @oy.m
    public e getCallerFrame() {
        or.f<Object> fVar = this.completion;
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return null;
    }

    @oy.m
    public final or.f<Object> getCompletion() {
        return this.completion;
    }

    @oy.m
    public StackTraceElement getStackTraceElement() {
        return g.e(this);
    }

    @oy.m
    public abstract Object invokeSuspend(@oy.l Object obj);

    @Override // or.f
    public final void resumeWith(@oy.l Object obj) {
        or.f<Object> fVar = this;
        while (true) {
            h.b(fVar);
            a aVar = (a) fVar;
            or.f<Object> fVar2 = aVar.completion;
            m0.m(fVar2);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == qr.d.l()) {
                    return;
                }
                i1.a aVar2 = i1.f79460c;
                obj = i1.b(objInvokeSuspend);
            } catch (Throwable th2) {
                i1.a aVar3 = i1.f79460c;
                obj = i1.b(j1.a(th2));
            }
            aVar.releaseIntercepted();
            if (!(fVar2 instanceof a)) {
                fVar2.resumeWith(obj);
                return;
            }
            fVar = fVar2;
        }
    }

    @oy.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @oy.l
    public or.f<w2> create(@oy.m Object obj, @oy.l or.f<?> completion) {
        m0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
