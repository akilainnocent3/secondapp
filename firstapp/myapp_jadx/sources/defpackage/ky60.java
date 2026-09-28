package defpackage;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes8.dex */
public final class ky60<T> implements y2b<T, RequestBody> {
    public static final ky60<Object> a = new ky60<>();
    public static final MediaType b = MediaType.get("text/plain; charset=UTF-8");

    @Override // defpackage.y2b
    public final RequestBody convert(Object obj) {
        return RequestBody.create(b, String.valueOf(obj));
    }
}
