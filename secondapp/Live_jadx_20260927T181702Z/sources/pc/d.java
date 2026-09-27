package pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class d extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Queue<d> f120672d = o.g(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f120673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f120674c;

    public static void d() {
        while (true) {
            Queue<d> queue = f120672d;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @NonNull
    public static d i(@NonNull InputStream inputStream) {
        d dVarPoll;
        Queue<d> queue = f120672d;
        synchronized (queue) {
            dVarPoll = queue.poll();
        }
        if (dVarPoll == null) {
            dVarPoll = new d();
        }
        dVarPoll.k(inputStream);
        return dVarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f120673b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f120673b.close();
    }

    @Nullable
    public IOException h() {
        return this.f120674c;
    }

    public void k(@NonNull InputStream inputStream) {
        this.f120673b = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f120673b.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f120673b.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f120673b.read(bArr);
        } catch (IOException e10) {
            this.f120674c = e10;
            return -1;
        }
    }

    public void release() {
        this.f120674c = null;
        this.f120673b = null;
        Queue<d> queue = f120672d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f120673b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f120673b.skip(j10);
        } catch (IOException e10) {
            this.f120674c = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f120673b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f120674c = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f120673b.read();
        } catch (IOException e10) {
            this.f120674c = e10;
            return -1;
        }
    }
}
