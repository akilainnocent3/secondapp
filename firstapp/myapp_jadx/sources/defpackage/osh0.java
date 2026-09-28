package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.UtilsKt", f = "Utils.kt", l = {13, 15}, m = "retryWithExponentialBackoffPolicy", v = 2)
public final class osh0<T> extends x1b {
    public long a;
    public long b;
    public Function1 c;
    public Function1 d;
    public /* synthetic */ Object e;
    public int f;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return oni.a(0L, null, null, this);
    }
}
