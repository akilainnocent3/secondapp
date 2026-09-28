package okhttp3;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.avg;
import defpackage.cc5;
import defpackage.fae;
import defpackage.i08;
import defpackage.lb5;
import defpackage.rl5;
import defpackage.rtg;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u0003¨\u0006 "}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "Lcc5;", "source", "()Lcc5;", "", "bytes", "()[B", "Lrl5;", "byteString", "()Lrl5;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ResponseBody EMPTY;
    public BomAwareReader a;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lcc5;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lcc5;Ljava/nio/charset/Charset;)V", "", "cbuf", "", AnalyticsParam.EVENT_STATUS_OFF, "len", "read", "([CII)I", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {
        public final cc5 a;
        public final Charset b;
        public boolean c;
        public InputStreamReader d;

        public BomAwareReader(cc5 cc5Var, Charset charset) {
            cc5Var.getClass();
            charset.getClass();
            this.a = cc5Var;
            this.b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.c = true;
            InputStreamReader inputStreamReader = this.d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            cbuf.getClass();
            if (this.c) {
                i08.a("Stream closed");
                return 0;
            }
            InputStreamReader inputStreamReader = this.d;
            if (inputStreamReader == null) {
                cc5 cc5Var = this.a;
                inputStreamReader = new InputStreamReader(cc5Var.I1(), _UtilJvmKt.readBomAsCharset(cc5Var, this.b));
                this.d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lrl5;", "(Lrl5;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lcc5;", "", "contentLength", "(Lcc5;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lrl5;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLcc5;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, cc5 cc5Var, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(cc5Var, mediaType, j);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            str.getClass();
            Pair<Charset, MediaType> pairChooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = pairChooseCharset.a;
            MediaType mediaType2 = pairChooseCharset.b;
            lb5 lb5Var = new lb5();
            charset.getClass();
            lb5Var.n0(str, 0, str.length(), charset);
            return create(lb5Var, mediaType2, lb5Var.b);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, rl5 rl5Var, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(rl5Var, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            lb5 lb5Var = new lb5();
            lb5Var.m104write(bArr, 0, bArr.length);
            return create(lb5Var, mediaType, bArr.length);
        }

        public final ResponseBody create(rl5 rl5Var, MediaType mediaType) {
            rl5Var.getClass();
            lb5 lb5Var = new lb5();
            lb5Var.c0(rl5Var);
            return create(lb5Var, mediaType, rl5Var.d());
        }

        public final ResponseBody create(final cc5 cc5Var, final MediaType mediaType, final long j) {
            cc5Var.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long getC() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType getB() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public cc5 getD() {
                    return cc5Var;
                }
            };
        }

        @fae
        public final ResponseBody create(MediaType contentType, String content) {
            content.getClass();
            return create(content, contentType);
        }

        @fae
        public final ResponseBody create(MediaType contentType, byte[] content) {
            content.getClass();
            return create(content, contentType);
        }

        @fae
        public final ResponseBody create(MediaType contentType, rl5 content) {
            content.getClass();
            return create(content, contentType);
        }

        @fae
        public final ResponseBody create(MediaType contentType, long contentLength, cc5 content) {
            content.getClass();
            return create(content, contentType, contentLength);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, rl5.d, (MediaType) null, 1, (Object) null);
    }

    public static final ResponseBody create(cc5 cc5Var, MediaType mediaType, long j) {
        return INSTANCE.create(cc5Var, mediaType, j);
    }

    public final InputStream byteStream() {
        return getD().I1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final rl5 byteString() throws IOException {
        long jContentLength = getC();
        rl5 th = null;
        if (jContentLength > 2147483647L) {
            i08.a(avg.a(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        cc5 cc5VarSource = getD();
        try {
            rl5 rl5VarL1 = cc5VarSource.l1();
            try {
                cc5VarSource.close();
            } catch (Throwable th2) {
                th = th2;
            }
            rl5 rl5Var = th;
            th = rl5VarL1;
            th = rl5Var;
        } catch (Throwable th3) {
            th = th3;
            if (cc5VarSource != null) {
                try {
                    cc5VarSource.close();
                } catch (Throwable th4) {
                    rtg.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int iD = th.d();
        if (jContentLength == -1 || jContentLength == iD) {
            return th;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] bytes() throws IOException {
        long jContentLength = getC();
        byte[] th = null;
        if (jContentLength > 2147483647L) {
            i08.a(avg.a(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        cc5 cc5VarSource = getD();
        try {
            byte[] bArrL0 = cc5VarSource.L0();
            try {
                cc5VarSource.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrL0;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (cc5VarSource != null) {
                try {
                    cc5VarSource.close();
                } catch (Throwable th4) {
                    rtg.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    public final Reader charStream() {
        BomAwareReader bomAwareReader = this.a;
        if (bomAwareReader != null) {
            return bomAwareReader;
        }
        BomAwareReader bomAwareReader2 = new BomAwareReader(getD(), Internal.charsetOrUtf8(getB()));
        this.a = bomAwareReader2;
        return bomAwareReader2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.closeQuietly(getD());
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long getC();

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType getB();

    /* JADX INFO: renamed from: source */
    public abstract cc5 getD();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final String string() {
        cc5 cc5VarSource = getD();
        String th = null;
        try {
            String strI1 = cc5VarSource.i1(_UtilJvmKt.readBomAsCharset(cc5VarSource, Internal.charsetOrUtf8(getB())));
            try {
                cc5VarSource.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strI1;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (cc5VarSource != null) {
                try {
                    cc5VarSource.close();
                } catch (Throwable th4) {
                    rtg.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    public static final ResponseBody create(rl5 rl5Var, MediaType mediaType) {
        return INSTANCE.create(rl5Var, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @fae
    public static final ResponseBody create(MediaType mediaType, long j, cc5 cc5Var) {
        return INSTANCE.create(mediaType, j, cc5Var);
    }

    @fae
    public static final ResponseBody create(MediaType mediaType, rl5 rl5Var) {
        return INSTANCE.create(mediaType, rl5Var);
    }

    @fae
    public static final ResponseBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @fae
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
