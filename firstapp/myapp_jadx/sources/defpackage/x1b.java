package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lx1b;", "Lpz1;", "Lv1b;", "", "completion", "Lkotlin/coroutines/CoroutineContext;", "_context", "<init>", "(Lv1b;Lkotlin/coroutines/CoroutineContext;)V", "(Lv1b;)V", "intercepted", "()Lv1b;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "Lv1b;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class x1b extends pz1 {
    private final CoroutineContext _context;
    private transient v1b<Object> intercepted;

    public x1b(v1b<Object> v1bVar) {
        this(v1bVar, v1bVar != null ? v1bVar.getContext() : null);
    }

    @Override // defpackage.v1b
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final v1b<Object> intercepted() {
        v1b<Object> v1bVarY = this.intercepted;
        if (v1bVarY == null) {
            d dVar = (d) getContext().get(d.n);
            v1bVarY = dVar != null ? dVar.Y(this) : this;
            this.intercepted = v1bVarY;
        }
        return v1bVarY;
    }

    @Override // defpackage.pz1
    public void releaseIntercepted() {
        v1b<?> v1bVar = this.intercepted;
        if (v1bVar != null && v1bVar != this) {
            CoroutineContext.Element element = getContext().get(d.n);
            element.getClass();
            ((d) element).c0(v1bVar);
        }
        this.intercepted = cn8.a;
    }

    public x1b(v1b<Object> v1bVar, CoroutineContext coroutineContext) {
        super(v1bVar);
        this._context = coroutineContext;
    }
}
