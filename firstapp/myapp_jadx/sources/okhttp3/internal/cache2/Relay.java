package okhttp3.internal.cache2;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hb5;
import defpackage.i08;
import defpackage.ib5;
import defpackage.lb5;
import defpackage.rl5;
import defpackage.sxf0;
import defpackage.zpa0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 F2\u00020\u0001:\u0002GFJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0017\u0010<\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u00100R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010E\u001a\u0002028F¢\u0006\u0006\u001a\u0004\bE\u00106¨\u0006H"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "Lokhttp3/internal/concurrent/Lockable;", "", "upstreamSize", "", "commit", "(J)V", "Lrl5;", "metadata", "()Lrl5;", "Lzpa0;", "newSource", "()Lzpa0;", "Ljava/io/RandomAccessFile;", "a", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "file", "b", "Lzpa0;", "getUpstream", "setUpstream", "(Lzpa0;)V", "upstream", "c", "J", "getUpstreamPos", "()J", "setUpstreamPos", "upstreamPos", "e", "getBufferMaxSize", "bufferMaxSize", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "upstreamReader", "Llb5;", "i", "Llb5;", "getUpstreamBuffer", "()Llb5;", "upstreamBuffer", "", "v", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "complete", "w", "getBuffer", "buffer", "", "y", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "sourceCount", "isClosed", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Relay implements Lockable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final rl5 PREFIX_CLEAN;
    public static final rl5 PREFIX_DIRTY;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RandomAccessFile file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public zpa0 upstream;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long upstreamPos;
    public final rl5 d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long bufferMaxSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Thread upstreamReader;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final lb5 upstreamBuffer = new lb5();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean complete;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final lb5 buffer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public int sourceCount;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lzpa0;", "upstream", "Lrl5;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;Lzpa0;Lrl5;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", "", "SOURCE_UPSTREAM", "I", "SOURCE_FILE", "PREFIX_CLEAN", "Lrl5;", "PREFIX_DIRTY", "FILE_HEADER_SIZE", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Relay edit(File file, zpa0 upstream, rl5 metadata, long bufferMaxSize) throws IOException {
            file.getClass();
            upstream.getClass();
            metadata.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.a(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            file.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            FileOperator fileOperator = new FileOperator(channel);
            lb5 lb5Var = new lb5();
            fileOperator.read(0L, lb5Var, 32L);
            rl5 rl5Var = Relay.PREFIX_CLEAN;
            if (!Intrinsics.g(lb5Var.B0(rl5Var.d()), rl5Var)) {
                i08.a("unreadable cache file");
                return null;
            }
            long j = lb5Var.readLong();
            long j2 = lb5Var.readLong();
            lb5 lb5Var2 = new lb5();
            fileOperator.read(32 + j, lb5Var2, j2);
            return new Relay(randomAccessFile, null, j, lb5Var2.B0(lb5Var2.b), 0L, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lzpa0;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "Llb5;", "sink", "", "byteCount", "read", "(Llb5;J)J", "Lsxf0;", "timeout", "()Lsxf0;", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class RelaySource implements zpa0 {
        public final sxf0 a = new sxf0();
        public FileOperator b;
        public long c;

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            file.getClass();
            FileChannel channel = file.getChannel();
            channel.getClass();
            this.b = new FileOperator(channel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.b = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                _UtilCommonKt.closeQuietly(randomAccessFile);
            }
        }

        @Override // defpackage.zpa0
        public long read(lb5 sink, long byteCount) throws IOException {
            char c;
            sink.getClass();
            if (this.b == null) {
                ib5.a("Check failed.");
                return 0L;
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.c != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().b;
                            if (this.c < upstreamPos) {
                                c = 2;
                                break;
                            }
                            long jMin = Math.min(byteCount, relay.getUpstreamPos() - this.c);
                            relay.getBuffer().l(this.c - upstreamPos, sink, jMin);
                            this.c += jMin;
                            return jMin;
                        }
                        if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c = 1;
                                break;
                            }
                            this.a.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Relay relay2 = Relay.this;
                if (c == 2) {
                    long jMin2 = Math.min(byteCount, relay2.getUpstreamPos() - this.c);
                    FileOperator fileOperator = this.b;
                    fileOperator.getClass();
                    fileOperator.read(this.c + 32, sink, jMin2);
                    this.c += jMin2;
                    return jMin2;
                }
                try {
                    zpa0 upstream = relay2.getUpstream();
                    upstream.getClass();
                    long j = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j == -1) {
                        Relay relay3 = Relay.this;
                        relay3.commit(relay3.getUpstreamPos());
                        Relay relay4 = Relay.this;
                        synchronized (relay4) {
                            relay4.setUpstreamReader(null);
                            relay4.notifyAll();
                            Unit unit = Unit.a;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j, byteCount);
                    Relay.this.getUpstreamBuffer().l(0L, sink, jMin3);
                    this.c += jMin3;
                    FileOperator fileOperator2 = this.b;
                    fileOperator2.getClass();
                    fileOperator2.write(Relay.this.getUpstreamPos() + 32, Relay.this.getUpstreamBuffer().g(), j);
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        try {
                            relay5.getBuffer().write(relay5.getUpstreamBuffer(), j);
                            if (relay5.getBuffer().b > relay5.getBufferMaxSize()) {
                                relay5.getBuffer().skip(relay5.getBuffer().b - relay5.getBufferMaxSize());
                            }
                            relay5.setUpstreamPos(relay5.getUpstreamPos() + j);
                            Unit unit2 = Unit.a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        relay6.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th3) {
                    Relay relay7 = Relay.this;
                    synchronized (relay7) {
                        relay7.setUpstreamReader(null);
                        relay7.notifyAll();
                        Unit unit3 = Unit.a;
                        throw th3;
                    }
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
        rl5 rl5Var = rl5.d;
        PREFIX_CLEAN = rl5.a.c("OkHttp cache v1\n");
        PREFIX_DIRTY = rl5.a.c("OkHttp DIRTY :(\n");
    }

    public Relay(RandomAccessFile randomAccessFile, zpa0 zpa0Var, long j, rl5 rl5Var, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this.file = randomAccessFile;
        this.upstream = zpa0Var;
        this.upstreamPos = j;
        this.d = rl5Var;
        this.bufferMaxSize = j2;
        this.complete = this.upstream == null;
        this.buffer = new lb5();
    }

    public final void a(rl5 rl5Var, long j, long j2) throws IOException {
        lb5 lb5Var = new lb5();
        lb5Var.c0(rl5Var);
        lb5Var.h0(j);
        lb5Var.h0(j2);
        if (lb5Var.b != 32) {
            hb5.a("Failed requirement.");
            return;
        }
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(0L, lb5Var, 32L);
    }

    public final void commit(long upstreamSize) throws IOException {
        lb5 lb5Var = new lb5();
        rl5 rl5Var = this.d;
        lb5Var.c0(rl5Var);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(32 + upstreamSize, lb5Var, rl5Var.d());
        RandomAccessFile randomAccessFile2 = this.file;
        randomAccessFile2.getClass();
        randomAccessFile2.getChannel().force(false);
        a(PREFIX_CLEAN, upstreamSize, this.d.d());
        RandomAccessFile randomAccessFile3 = this.file;
        randomAccessFile3.getClass();
        randomAccessFile3.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            Unit unit = Unit.a;
        }
        zpa0 zpa0Var = this.upstream;
        if (zpa0Var != null) {
            _UtilCommonKt.closeQuietly(zpa0Var);
        }
        this.upstream = null;
    }

    public final lb5 getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final zpa0 getUpstream() {
        return this.upstream;
    }

    public final lb5 getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX INFO: renamed from: metadata, reason: from getter */
    public final rl5 getD() {
        return this.d;
    }

    public final zpa0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(zpa0 zpa0Var) {
        this.upstream = zpa0Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }
}
