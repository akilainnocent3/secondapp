package okhttp3;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.avg;
import defpackage.cc5;
import defpackage.ib5;
import defpackage.kb5;
import defpackage.lb5;
import defpackage.rl5;
import defpackage.sxf0;
import defpackage.t2z;
import defpackage.y740;
import defpackage.zpa0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0003\u0015\u0016\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0017"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lcc5;", "source", "", "boundary", "<init>", "(Lcc5;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Companion", "PartSource", "Part", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final t2z w;
    public final cc5 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String boundary;
    public final rl5 c;
    public final rl5 d;
    public int e;
    public boolean f;
    public boolean i;
    public PartSource v;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lt2z;", "afterBoundaryOptions", "Lt2z;", "getAfterBoundaryOptions", "()Lt2z;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t2z getAfterBoundaryOptions() {
            return MultipartReader.w;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lcc5;", "body", "<init>", "(Lokhttp3/Headers;Lcc5;)V", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "a", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "b", "Lcc5;", "()Lcc5;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Part implements Closeable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Headers headers;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final cc5 body;

        public Part(Headers headers, cc5 cc5Var) {
            headers.getClass();
            cc5Var.getClass();
            this.headers = headers;
            this.body = cc5Var;
        }

        /* JADX INFO: renamed from: body, reason: from getter */
        public final cc5 getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lzpa0;", "<init>", "(Lokhttp3/MultipartReader;)V", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "Llb5;", "sink", "", "byteCount", "read", "(Llb5;J)J", "Lsxf0;", "timeout", "()Lsxf0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class PartSource implements zpa0 {
        public final sxf0 a = new sxf0();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            MultipartReader multipartReader = MultipartReader.this;
            if (Intrinsics.g(multipartReader.v, this)) {
                multipartReader.v = null;
            }
        }

        @Override // defpackage.zpa0
        public long read(lb5 sink, long byteCount) {
            sink.getClass();
            if (byteCount < 0) {
                kb5.a(avg.a(byteCount, "byteCount < 0: "));
                return 0L;
            }
            MultipartReader multipartReader = MultipartReader.this;
            if (!Intrinsics.g(multipartReader.v, this)) {
                ib5.a("closed");
                return 0L;
            }
            sxf0 a = multipartReader.a.getA();
            long c = a.getC();
            sxf0.Companion companion = sxf0.INSTANCE;
            sxf0 sxf0Var = this.a;
            long c2 = sxf0Var.getC();
            long c3 = a.getC();
            companion.getClass();
            if (c2 == 0 || (c3 != 0 && c2 >= c3)) {
                c2 = c3;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            a.timeout(c2, timeUnit);
            if (!a.getA()) {
                if (sxf0Var.getA()) {
                    a.deadlineNanoTime(sxf0Var.deadlineNanoTime());
                }
                try {
                    long jD = multipartReader.d(byteCount);
                    return jD == 0 ? -1L : multipartReader.a.read(sink, jD);
                } finally {
                    a.timeout(c, timeUnit);
                    if (sxf0Var.getA()) {
                        a.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = a.deadlineNanoTime();
            if (sxf0Var.getA()) {
                a.deadlineNanoTime(Math.min(a.deadlineNanoTime(), sxf0Var.deadlineNanoTime()));
            }
            try {
                long jD2 = multipartReader.d(byteCount);
                return jD2 == 0 ? -1L : multipartReader.a.read(sink, jD2);
            } finally {
                a.timeout(c, timeUnit);
                if (sxf0Var.getA()) {
                    a.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // defpackage.zpa0
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public sxf0 getA() {
            return this.a;
        }
    }

    static {
        int i = t2z.d;
        rl5 rl5Var = rl5.d;
        w = t2z.a.b(rl5.a.c("\r\n"), rl5.a.c("--"), rl5.a.c(" "), rl5.a.c("\t"));
    }

    public MultipartReader(cc5 cc5Var, String str) {
        cc5Var.getClass();
        str.getClass();
        this.a = cc5Var;
        this.boundary = str;
        lb5 lb5Var = new lb5();
        lb5Var.z0("--");
        lb5Var.z0(str);
        this.c = lb5Var.B0(lb5Var.b);
        lb5 lb5Var2 = new lb5();
        lb5Var2.z0("\r\n--");
        lb5Var2.z0(str);
        this.d = lb5Var2.B0(lb5Var2.b);
    }

    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f) {
            return;
        }
        this.f = true;
        this.v = null;
        this.a.close();
    }

    public final long d(long j) throws EOFException {
        cc5 cc5Var = this.a;
        long jMin = Math.min(cc5Var.e().b, j) + 1;
        long jK = cc5Var.K(jMin, this.d);
        if (jK != -1) {
            return jK;
        }
        if (cc5Var.e().b >= jMin) {
            return Math.min(jMin, j);
        }
        throw new EOFException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[LOOP:1: B:12:0x0023->B:14:0x002d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0031 A[EDGE_INSN: B:51:0x0031->B:15:0x0031 BREAK  A[LOOP:1: B:12:0x0023->B:14:0x002d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
    public final Part nextPart() throws ProtocolException, EOFException {
        long jD;
        if (this.f) {
            ib5.a("closed");
            return null;
        }
        if (this.i) {
            return null;
        }
        int i = this.e;
        cc5 cc5Var = this.a;
        if (i == 0) {
            rl5 rl5Var = this.c;
            if (cc5Var.y(0L, rl5Var)) {
                cc5Var.skip(rl5Var.d());
            } else {
                while (true) {
                    jD = d(8192L);
                    if (jD != 0) {
                        break;
                    }
                    cc5Var.skip(jD);
                }
                cc5Var.skip(this.d.d());
            }
        } else {
            while (true) {
                jD = d(8192L);
                if (jD != 0) {
                    break;
                    break;
                }
                cc5Var.skip(jD);
            }
            cc5Var.skip(this.d.d());
        }
        boolean z = false;
        while (true) {
            int iH0 = cc5Var.H0(w);
            if (iH0 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iH0 == 0) {
                this.e++;
                Headers headers = new HeadersReader(cc5Var).readHeaders();
                PartSource partSource = new PartSource();
                this.v = partSource;
                return new Part(headers, new y740(partSource));
            }
            if (iH0 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.e == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.i = true;
                return null;
            }
            if (iH0 == 2 || iH0 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws ProtocolException {
        String strParameter;
        responseBody.getClass();
        cc5 d = responseBody.getD();
        MediaType b = responseBody.getB();
        if (b != null && (strParameter = b.parameter("boundary")) != null) {
            this(d, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
