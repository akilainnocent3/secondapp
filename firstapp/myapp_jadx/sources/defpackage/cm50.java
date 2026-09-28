package defpackage;

import kotlin.jvm.functions.Function1;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.network.data.ResultsKt", f = "Results.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "waitSuccessOrThrow", v = 2)
public final class cm50<T> extends x1b {
    public Function1 a;
    public /* synthetic */ Object b;
    public int c;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return bm50.r(null, null, this);
    }
}
