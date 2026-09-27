package pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a0("POOL")
    public static final Queue<e> f120675d = o.g(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f120676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f120677c;

    public static void d() {
        synchronized (f120675d) {
            while (true) {
                try {
                    Queue<e> queue = f120675d;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NonNull
    public static e i(@NonNull InputStream inputStream) {
        e eVarPoll;
        Queue<e> queue = f120675d;
        synchronized (queue) {
            eVarPoll = queue.poll();
        }
        if (eVarPoll == null) {
            eVarPoll = new e();
        }
        eVarPoll.k(inputStream);
        return eVarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f120676b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f120676b.close();
    }

    @Nullable
    public IOException h() {
        return this.f120677c;
    }

    public void k(@NonNull InputStream inputStream) {
        this.f120676b = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f120676b.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f120676b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f120676b.read();
        } catch (IOException e10) {
            this.f120677c = e10;
            throw e10;
        }
    }

    public void release() {
        this.f120677c = null;
        this.f120676b = null;
        Queue<e> queue = f120675d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f120676b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f120676b.skip(j10);
        } catch (IOException e10) {
            this.f120677c = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f120676b.read(bArr);
        } catch (IOException e10) {
            this.f120677c = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f120676b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f120677c = e10;
            throw e10;
        }
    }
}
