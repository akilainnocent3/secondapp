package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d9p extends CancellationException {
    public final transient m9p a;

    public d9p(String str, Throwable th, m9p m9pVar) {
        super(str);
        this.a = m9pVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d9p)) {
            return false;
        }
        d9p d9pVar = (d9p) obj;
        if (!Intrinsics.g(d9pVar.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = d9pVar.a;
        if (obj2 == null) {
            obj2 = kxx.a;
        }
        Object obj3 = this.a;
        if (obj3 == null) {
            obj3 = kxx.a;
        }
        return Intrinsics.g(obj2, obj3) && Intrinsics.g(d9pVar.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.a;
        if (obj == null) {
            obj = kxx.a;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.a;
        if (obj == null) {
            obj = kxx.a;
        }
        sb.append(obj);
        return sb.toString();
    }
}
