package fk;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class g0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f84785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.k f84786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f84787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ck.a f84788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f84789e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(nk.k kVar, Thread thread, Throwable th2);
    }

    public g0(a aVar, nk.k kVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ck.a aVar2) {
        this.f84785a = aVar;
        this.f84786b = kVar;
        this.f84787c = uncaughtExceptionHandler;
        this.f84788d = aVar2;
    }

    public boolean a() {
        return this.f84789e.get();
    }

    public final boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            ck.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            ck.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f84788d.c()) {
            return true;
        }
        ck.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:577)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:603)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f84789e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f84785a.a(this.f84786b, thread, th2);
                } else {
                    ck.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f84787c != null) {
                    ck.g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f84787c.uncaughtException(thread, th2);
                } else {
                    ck.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e10) {
                ck.g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f84787c == null) {
                    ck.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.f84789e.set(false);
        } catch (Throwable th3) {
            if (this.f84787c != null) {
                ck.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f84787c.uncaughtException(thread, th2);
            } else {
                ck.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f84789e.set(false);
            throw th3;
        }
    }
}
