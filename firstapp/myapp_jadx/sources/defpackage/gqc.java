package defpackage;

import android.net.Uri;
import com.twilio.voice.VoiceURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gqc {
    public static final /* synthetic */ int j = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    public static final class a {
        public Uri a;
        public long b;
        public int c;
        public byte[] d;
        public Map<String, String> e;
        public long f;
        public long g;
        public String h;
        public int i;

        public final gqc a() {
            ly0.h(this.a, "The uri must be set.");
            return new gqc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    static {
        ojv.a("media3.datasource");
    }

    public gqc(Uri uri, long j2, int i, byte[] bArr, Map map, long j3, long j4, String str, int i2) {
        ly0.b(j2 + j3 >= 0);
        ly0.b(j3 >= 0);
        ly0.b(j4 > 0 || j4 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j2;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j3;
        this.g = j4;
        this.h = str;
        this.i = i2;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        return aVar;
    }

    public final gqc b(long j2, long j3) {
        if (j2 == 0 && this.g == j3) {
            return this;
        }
        return new gqc(this.a, this.b, this.c, this.d, this.e, this.f + j2, j3, this.h, this.i);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.c;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = VoiceURLConnection.METHOD_TYPE_POST;
        } else {
            if (i != 3) {
                fm20.a();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return zk1.a(this.i, "]", sb);
    }
}
