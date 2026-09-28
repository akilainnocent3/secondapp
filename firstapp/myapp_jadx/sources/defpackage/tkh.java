package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "readScope")
public final class tkh<R> extends x1b {
    public vkh a;
    public okh b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vkh<Object> e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkh(vkh vkhVar, x1b x1bVar) {
        super(x1bVar);
        this.e = vkhVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
