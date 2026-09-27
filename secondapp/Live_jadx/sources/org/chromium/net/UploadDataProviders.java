package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class UploadDataProviders {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f119540a;

        public a(File file) {
            this.f119540a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel d() throws IOException {
            return new FileInputStream(this.f119540a).getChannel();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f119541a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f119541a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel d() throws IOException {
            if (this.f119541a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f119541a).getChannel();
            }
            this.f119541a.close();
            throw new IllegalArgumentException("Not a file: " + this.f119541a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f119542b;

        public /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f119542b.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.f119542b.remaining()) {
                byteBuffer.put(this.f119542b);
            } else {
                int iLimit = this.f119542b.limit();
                ByteBuffer byteBuffer2 = this.f119542b;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.f119542b);
                this.f119542b.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f119542b.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        public c(ByteBuffer byteBuffer) {
            this.f119542b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        FileChannel d() throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile FileChannel f119543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f119544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f119545d;

        public /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f119543b;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public final FileChannel d() throws IOException {
            if (this.f119543b == null) {
                synchronized (this.f119545d) {
                    try {
                        if (this.f119543b == null) {
                            this.f119543b = this.f119544c.d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f119543b;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return d().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelD = d();
            int i10 = 0;
            while (i10 == 0) {
                int i11 = fileChannelD.read(byteBuffer);
                if (i11 == -1) {
                    break;
                } else {
                    i10 += i11;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            d().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        public e(d dVar) {
            this.f119545d = new Object();
            this.f119544c = dVar;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
