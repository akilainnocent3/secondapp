package defpackage;

import androidx.recyclerview.widget.r;
import java.util.Objects;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class bi50<T> {
    public final Response a;
    public final T b;
    public final ResponseBody c;

    public bi50(Response response, T t, ResponseBody responseBody) {
        this.a = response;
        this.b = t;
        this.c = responseBody;
    }

    public static <T> bi50<T> a(T t) {
        return b(t, new Response.Builder().code(r.d.DEFAULT_DRAG_ANIMATION_DURATION).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> bi50<T> b(T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.getIsSuccessful()) {
            return new bi50<>(response, t, null);
        }
        hb5.a("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
