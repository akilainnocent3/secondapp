package a5;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.u0(extension = 31, version = 7)
public final class m extends UploadDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3747c;

    public m(byte[] bArr) {
        this.f3746b = bArr;
    }

    public long getLength() {
        return this.f3746b.length;
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int iMin = Math.min(byteBuffer.remaining(), this.f3746b.length - this.f3747c);
        byteBuffer.put(this.f3746b, this.f3747c, iMin);
        this.f3747c += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.f3747c = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
