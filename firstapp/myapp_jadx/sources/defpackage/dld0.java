package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class dld0 {
    public static final /* synthetic */ int a = 0;

    static {
        Object bVar;
        Object bVar2;
        Exception exc = new Exception();
        String simpleName = bdk0.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            zi50.a aVar = zi50.b;
            bVar = pz1.class.getCanonicalName();
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            bVar2 = dld0.class.getCanonicalName();
        } catch (Throwable th2) {
            zi50.a aVar3 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        if (zi50.a(bVar2) != null) {
            bVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
