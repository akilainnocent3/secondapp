package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class bn8<R> {
    public final R a;
    public final ob6 b;
    public final gaj<Throwable, R, CoroutineContext, Unit> c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ bn8(Object obj, ob6 ob6Var, gaj gajVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : ob6Var, (gaj<? super Throwable, ? super Object, ? super CoroutineContext, Unit>) ((i & 4) != 0 ? null : gajVar), (Object) null, (i & 16) != 0 ? null : th);
    }

    public static bn8 a(bn8 bn8Var, ob6 ob6Var, Throwable th, int i) {
        R r = bn8Var.a;
        if ((i & 2) != 0) {
            ob6Var = bn8Var.b;
        }
        ob6 ob6Var2 = ob6Var;
        gaj<Throwable, R, CoroutineContext, Unit> gajVar = bn8Var.c;
        Object obj = bn8Var.d;
        if ((i & 16) != 0) {
            th = bn8Var.e;
        }
        return new bn8(r, ob6Var2, gajVar, obj, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn8)) {
            return false;
        }
        bn8 bn8Var = (bn8) obj;
        return Intrinsics.g(this.a, bn8Var.a) && Intrinsics.g(this.b, bn8Var.b) && Intrinsics.g(this.c, bn8Var.c) && Intrinsics.g(this.d, bn8Var.d) && Intrinsics.g(this.e, bn8Var.e);
    }

    public final int hashCode() {
        R r = this.a;
        int iHashCode = (r == null ? 0 : r.hashCode()) * 31;
        ob6 ob6Var = this.b;
        int iHashCode2 = (iHashCode + (ob6Var == null ? 0 : ob6Var.hashCode())) * 31;
        gaj<Throwable, R, CoroutineContext, Unit> gajVar = this.c;
        int iHashCode3 = (iHashCode2 + (gajVar == null ? 0 : gajVar.hashCode())) * 31;
        Object obj = this.d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append(this.b);
        sb.append(", onCancellation=");
        sb.append(this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        return vt5.b(sb, this.e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bn8(R r, ob6 ob6Var, gaj<? super Throwable, ? super R, ? super CoroutineContext, Unit> gajVar, Object obj, Throwable th) {
        this.a = r;
        this.b = ob6Var;
        this.c = gajVar;
        this.d = obj;
        this.e = th;
    }
}
