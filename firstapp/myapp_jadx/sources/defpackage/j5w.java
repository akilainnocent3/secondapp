package defpackage;

import java.io.EOFException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes8.dex */
public final class j5w<T> implements y2b<T, RequestBody> {
    public static final MediaType b = MediaType.get("application/json; charset=UTF-8");
    public final ybp<T> a;

    public j5w(ybp ybpVar) {
        this.a = ybpVar;
    }

    @Override // defpackage.y2b
    public final RequestBody convert(Object obj) throws EOFException {
        lb5 lb5Var = new lb5();
        this.a.c(new ifp(lb5Var), obj);
        return RequestBody.create(b, lb5Var.B0(lb5Var.b));
    }
}
