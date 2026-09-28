package defpackage;

import java.util.Objects;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public class tom extends RuntimeException {
    public final int a;
    public final String b;
    public final transient bi50<?> c;

    public tom(bi50<?> bi50Var) {
        Objects.requireNonNull(bi50Var, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        Response response = bi50Var.a;
        sb.append(response.code());
        sb.append(" ");
        sb.append(response.message());
        super(sb.toString());
        this.a = response.code();
        this.b = response.message();
        this.c = bi50Var;
    }
}
