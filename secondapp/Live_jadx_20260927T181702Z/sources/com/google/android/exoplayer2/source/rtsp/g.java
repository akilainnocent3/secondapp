package com.google.android.exoplayer2.source.rtsp;

import ah.v0;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.media3.session.ij;
import cj.v6;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Charset f49061h = zi.f.f161720c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f49062i = "RtspMessageChannel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f49063j = 554;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f49064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f49065c = new v0("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, b> f49066d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0453g f49067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f49068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f49069g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void g(byte[] bArr);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(List<String> list, Exception exc);

        void b(List<String> list);

        void c(Exception exc);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f49071d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f49072e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f49073f = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f49074a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49075b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f49076c;

        public static byte[] d(byte b10, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b10, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b11 = dataInputStream.readByte();
                bArr[1] = b11;
                byteArrayOutputStream.write(b11);
            }
        }

        public final v6<String> a(byte[] bArr) {
            eh.a.i(this.f49075b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f49074a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, g.f49061h) : new String(bArr, 0, bArr.length - 2, g.f49061h));
            v6<String> v6VarU = v6.u(this.f49074a);
            e();
            return v6VarU;
        }

        @Nullable
        public final v6<String> b(byte[] bArr) throws d4 {
            eh.a.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, g.f49061h);
            this.f49074a.add(str);
            int i10 = this.f49075b;
            if (i10 == 1) {
                if (!h.f(str)) {
                    return null;
                }
                this.f49075b = 2;
                return null;
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            long jG = h.g(str);
            if (jG != -1) {
                this.f49076c = jG;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f49076c > 0) {
                this.f49075b = 3;
                return null;
            }
            v6<String> v6VarU = v6.u(this.f49074a);
            e();
            return v6VarU;
        }

        public v6<String> c(byte b10, DataInputStream dataInputStream) throws IOException {
            v6<String> v6VarB = b(d(b10, dataInputStream));
            while (v6VarB == null) {
                if (this.f49075b == 3) {
                    long j10 = this.f49076c;
                    if (j10 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iE = lj.l.e(j10);
                    eh.a.i(iE != -1);
                    byte[] bArr = new byte[iE];
                    dataInputStream.readFully(bArr, 0, iE);
                    v6VarB = a(bArr);
                } else {
                    v6VarB = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return v6VarB;
        }

        public final void e() {
            this.f49074a.clear();
            this.f49075b = 1;
            this.f49076c = 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class f implements v0.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte f49077e = 36;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f49078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f49079b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f49080c;

        public f(InputStream inputStream) {
            this.f49078a = new DataInputStream(inputStream);
        }

        public final void a() throws IOException {
            int unsignedByte = this.f49078a.readUnsignedByte();
            int unsignedShort = this.f49078a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f49078a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) g.this.f49066d.get(Integer.valueOf(unsignedByte));
            if (bVar == null || g.this.f49069g) {
                return;
            }
            bVar.g(bArr);
        }

        public final void b(byte b10) throws IOException {
            if (g.this.f49069g) {
                return;
            }
            g.this.f49064b.b(this.f49079b.c(b10, this.f49078a));
        }

        @Override // ah.v0.e
        public void cancelLoad() {
            this.f49080c = true;
        }

        @Override // ah.v0.e
        public void load() throws IOException {
            while (!this.f49080c) {
                byte b10 = this.f49078a.readByte();
                if (b10 == 36) {
                    a();
                } else {
                    b(b10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class C0453g implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OutputStream f49082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HandlerThread f49083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f49084d;

        public C0453g(OutputStream outputStream) {
            this.f49082b = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f49083c = handlerThread;
            handlerThread.start();
            this.f49084d = new Handler(handlerThread.getLooper());
        }

        public static /* synthetic */ void a(C0453g c0453g, byte[] bArr, List list) {
            c0453g.getClass();
            try {
                c0453g.f49082b.write(bArr);
            } catch (Exception e10) {
                if (g.this.f49069g) {
                    return;
                }
                g.this.f49064b.a(list, e10);
            }
        }

        public void b(final List<String> list) {
            final byte[] bArrB = h.b(list);
            this.f49084d.post(new Runnable() { // from class: jg.t
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.rtsp.g.C0453g.a(this.f100437b, bArrB, list);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f49084d;
            HandlerThread handlerThread = this.f49083c;
            Objects.requireNonNull(handlerThread);
            handler.post(new ij(handlerThread));
            try {
                this.f49083c.join();
            } catch (InterruptedException unused) {
                this.f49083c.interrupt();
            }
        }
    }

    public g(d dVar) {
        this.f49064b = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f49069g) {
            return;
        }
        try {
            C0453g c0453g = this.f49067e;
            if (c0453g != null) {
                c0453g.close();
            }
            this.f49065c.j();
            Socket socket = this.f49068f;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f49069g = true;
        }
    }

    public void d(Socket socket) throws IOException {
        this.f49068f = socket;
        this.f49067e = new C0453g(socket.getOutputStream());
        this.f49065c.l(new f(socket.getInputStream()), new c(), 0);
    }

    public void h(int i10, b bVar) {
        this.f49066d.put(Integer.valueOf(i10), bVar);
    }

    public void i(List<String> list) {
        eh.a.k(this.f49067e);
        this.f49067e.b(list);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class c implements v0.b<f> {
        public c() {
        }

        @Override // ah.v0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v0.c P(f fVar, long j10, long j11, IOException iOException, int i10) {
            if (!g.this.f49069g) {
                g.this.f49064b.c(iOException);
            }
            return v0.f5387k;
        }

        @Override // ah.v0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void K(f fVar, long j10, long j11) {
        }

        @Override // ah.v0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void r(f fVar, long j10, long j11, boolean z10) {
        }
    }
}
