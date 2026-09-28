package okhttp3.internal.http1;

import defpackage.cc5;
import kotlin.Metadata;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Lcc5;", "source", "<init>", "(Lcc5;)V", "", "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "a", "Lcc5;", "getSource", "()Lcc5;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeadersReader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final cc5 source;
    public long b;

    public HeadersReader(cc5 cc5Var) {
        cc5Var.getClass();
        this.source = cc5Var;
        this.b = 262144L;
    }

    public final cc5 getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() {
        String strM = this.source.M(this.b);
        this.b -= (long) strM.length();
        return strM;
    }
}
