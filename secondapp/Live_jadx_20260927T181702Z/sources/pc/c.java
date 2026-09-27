package pc;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f120668d = "ContentLengthStream";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f120669e = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f120670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120671c;

    public c(@NonNull InputStream inputStream, long j10) {
        super(inputStream);
        this.f120670b = j10;
    }

    @NonNull
    public static InputStream b(@NonNull InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @NonNull
    public static InputStream c(@NonNull InputStream inputStream, @Nullable String str) {
        return b(inputStream, d(str));
    }

    public static int d(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            if (!Log.isLoggable(f120668d, 3)) {
                return -1;
            }
            Log.d(f120668d, "failed to parse content length header: " + str, e10);
            return -1;
        }
    }

    public final int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f120671c += i10;
            return i10;
        }
        if (this.f120670b - ((long) this.f120671c) <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f120670b + ", but read: " + this.f120671c);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f120670b - ((long) this.f120671c), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        return a(super.read(bArr, i10, i11));
    }
}
