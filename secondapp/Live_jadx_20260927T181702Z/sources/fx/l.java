package fx;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BufferedSource.kt\nokio/internal/-BufferedSource\n*L\n1#1,649:1\n88#2:650\n85#2:683\n85#2:685\n73#2:745\n73#2:771\n82#2:810\n76#2:821\n88#2:1014\n73#2:1029\n85#2:1133\n242#3,32:651\n277#3,10:686\n290#3,18:696\n412#3,2:714\n110#3:716\n414#3:717\n112#3,18:718\n311#3,9:736\n320#3,15:746\n338#3,10:761\n348#3,3:772\n346#3,25:775\n374#3,10:800\n384#3:811\n382#3,9:812\n391#3,7:822\n389#3,20:829\n652#3,60:849\n715#3,56:909\n773#3:965\n776#3:966\n777#3,6:968\n787#3,7:974\n797#3,6:984\n805#3,5:990\n837#3,6:995\n847#3:1001\n848#3,11:1003\n859#3,5:1015\n868#3,9:1020\n878#3,61:1030\n603#3:1091\n606#3:1092\n607#3,5:1094\n614#3:1099\n617#3,7:1100\n626#3,20:1107\n418#3:1127\n421#3,5:1128\n426#3,10:1134\n437#3,7:1144\n442#3,2:1151\n943#3:1153\n944#3,87:1155\n1034#3,48:1242\n573#3:1290\n580#3,21:1291\n1085#3,7:1312\n1095#3,7:1319\n1105#3,4:1326\n1112#3,8:1330\n1123#3,10:1338\n1136#3,14:1348\n447#3,35:1362\n513#3,40:1397\n556#3:1437\n558#3,13:1439\n1153#3:1452\n1204#3:1453\n1205#3,39:1455\n1246#3,2:1494\n1248#3,4:1497\n1255#3,3:1501\n1259#3,4:1505\n110#3:1509\n1263#3,22:1510\n112#3,18:1532\n1338#3,2:1550\n1341#3:1553\n110#3:1554\n1342#3,50:1555\n112#3,18:1605\n1401#3,12:1623\n1416#3,32:1635\n1451#3,12:1667\n1466#3,18:1679\n1488#3:1697\n1489#3:1699\n1494#3,34:1700\n1#4:684\n1#4:967\n1#4:1002\n1#4:1093\n1#4:1154\n1#4:1438\n1#4:1454\n1#4:1496\n1#4:1504\n1#4:1552\n1#4:1698\n26#5,3:981\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:650\n197#1:683\n235#1:685\n261#1:745\n264#1:771\n267#1:810\n267#1:821\n337#1:1014\n340#1:1029\n376#1:1133\n181#1:651,32\n252#1:686,10\n255#1:696,18\n258#1:714,2\n258#1:716\n258#1:717\n258#1:718,18\n261#1:736,9\n261#1:746,15\n264#1:761,10\n264#1:772,3\n264#1:775,25\n267#1:800,10\n267#1:811\n267#1:812,9\n267#1:822,7\n267#1:829,20\n279#1:849,60\n282#1:909,56\n284#1:965\n287#1:966\n287#1:968,6\n289#1:974,7\n294#1:984,6\n297#1:990,5\n331#1:995,6\n337#1:1001\n337#1:1003,11\n337#1:1015,5\n340#1:1020,9\n340#1:1030,61\n342#1:1091\n345#1:1092\n345#1:1094,5\n347#1:1099\n350#1:1100,7\n353#1:1107,20\n373#1:1127\n376#1:1128,5\n376#1:1134,10\n378#1:1144,7\n381#1:1151,2\n386#1:1153\n386#1:1155,87\n389#1:1242,48\n412#1:1290\n418#1:1291,21\n439#1:1312,7\n443#1:1319,7\n445#1:1326,4\n447#1:1330,8\n451#1:1338,10\n455#1:1348,14\n459#1:1362,35\n462#1:1397,40\n465#1:1437\n465#1:1439,13\n467#1:1452\n467#1:1453\n467#1:1455,39\n469#1:1494,2\n469#1:1497,4\n480#1:1501,3\n480#1:1505,4\n480#1:1509\n480#1:1510,22\n480#1:1532,18\n496#1:1550,2\n496#1:1553\n496#1:1554\n496#1:1555,50\n496#1:1605,18\n506#1:1623,12\n576#1:1635,32\n578#1:1667,12\n586#1:1679,18\n594#1:1697\n594#1:1699\n596#1:1700,34\n287#1:967\n337#1:1002\n345#1:1093\n386#1:1154\n465#1:1438\n467#1:1454\n469#1:1496\n480#1:1504\n496#1:1552\n594#1:1698\n291#1:981,3\n*E\n"})
public final class l implements n, m, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    @oy.m
    public y0 f85645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85646c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,649:1\n1549#2:650\n1550#2:652\n1554#2:653\n1555#2,68:655\n1626#2:723\n1627#2,32:725\n1659#2,18:758\n1680#2:776\n1681#2,18:778\n1703#2:796\n1705#2,7:798\n1#3:651\n1#3:654\n1#3:724\n1#3:777\n1#3:797\n85#4:757\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n636#1:650\n636#1:652\n638#1:653\n638#1:655,68\n640#1:723\n640#1:725,32\n640#1:758,18\n642#1:776\n642#1:778,18\n645#1:796\n645#1:798,7\n636#1:651\n638#1:654\n640#1:724\n642#1:777\n645#1:797\n640#1:757\n*E\n"})
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cs.g
        @oy.m
        public l f85647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @cs.g
        public boolean f85648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.m
        public y0 f85649d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @cs.g
        @oy.m
        public byte[] f85651f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @cs.g
        public long f85650e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @cs.g
        public int f85652g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @cs.g
        public int f85653h = -1;

        public final long a(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i10).toString());
            }
            if (i10 > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i10).toString());
            }
            l lVar = this.f85647b;
            if (lVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f85648c) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = lVar.size();
            y0 y0VarA0 = lVar.A0(i10);
            int i11 = 8192 - y0VarA0.f85742c;
            y0VarA0.f85742c = 8192;
            long j10 = i11;
            lVar.o0(size + j10);
            l(y0VarA0);
            this.f85650e = size;
            this.f85651f = y0VarA0.f85740a;
            this.f85652g = 8192 - i11;
            this.f85653h = 8192;
            return j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f85647b == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f85647b = null;
            l(null);
            this.f85650e = -1L;
            this.f85651f = null;
            this.f85652g = -1;
            this.f85653h = -1;
        }

        @oy.m
        public final y0 d() {
            return this.f85649d;
        }

        public final int h() {
            long j10 = this.f85650e;
            l lVar = this.f85647b;
            kotlin.jvm.internal.m0.m(lVar);
            if (j10 == lVar.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f85650e;
            return k(j11 == -1 ? 0L : j11 + ((long) (this.f85653h - this.f85652g)));
        }

        public final long i(long j10) {
            l lVar = this.f85647b;
            if (lVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f85648c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = lVar.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (j11 > 0) {
                    y0 y0Var = lVar.f85645b;
                    kotlin.jvm.internal.m0.m(y0Var);
                    y0 y0Var2 = y0Var.f85746g;
                    kotlin.jvm.internal.m0.m(y0Var2);
                    int i10 = y0Var2.f85742c;
                    long j12 = i10 - y0Var2.f85741b;
                    if (j12 > j11) {
                        y0Var2.f85742c = i10 - ((int) j11);
                        break;
                    }
                    lVar.f85645b = y0Var2.b();
                    z0.d(y0Var2);
                    j11 -= j12;
                }
                l(null);
                this.f85650e = j10;
                this.f85651f = null;
                this.f85652g = -1;
                this.f85653h = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    y0 y0VarA0 = lVar.A0(1);
                    int iMin = (int) Math.min(j13, 8192 - y0VarA0.f85742c);
                    y0VarA0.f85742c += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        l(y0VarA0);
                        this.f85650e = size;
                        this.f85651f = y0VarA0.f85740a;
                        int i11 = y0VarA0.f85742c;
                        this.f85652g = i11 - iMin;
                        this.f85653h = i11;
                        z10 = false;
                    }
                }
            }
            lVar.o0(j10);
            return size;
        }

        public final int k(long j10) {
            y0 y0VarC;
            l lVar = this.f85647b;
            if (lVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > lVar.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + lVar.size());
            }
            if (j10 == -1 || j10 == lVar.size()) {
                l(null);
                this.f85650e = j10;
                this.f85651f = null;
                this.f85652g = -1;
                this.f85653h = -1;
                return -1;
            }
            long size = lVar.size();
            y0 y0VarD = lVar.f85645b;
            long j11 = 0;
            if (d() != null) {
                long j12 = this.f85650e;
                int i10 = this.f85652g;
                y0 y0VarD2 = d();
                kotlin.jvm.internal.m0.m(y0VarD2);
                long j13 = j12 - ((long) (i10 - y0VarD2.f85741b));
                if (j13 > j10) {
                    y0VarC = y0VarD;
                    y0VarD = d();
                    size = j13;
                } else {
                    y0VarC = d();
                    j11 = j13;
                }
            } else {
                y0VarC = y0VarD;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    kotlin.jvm.internal.m0.m(y0VarC);
                    int i11 = y0VarC.f85742c;
                    int i12 = y0VarC.f85741b;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    y0VarC = y0VarC.f85745f;
                }
            } else {
                while (size > j10) {
                    kotlin.jvm.internal.m0.m(y0VarD);
                    y0VarD = y0VarD.f85746g;
                    kotlin.jvm.internal.m0.m(y0VarD);
                    size -= (long) (y0VarD.f85742c - y0VarD.f85741b);
                }
                j11 = size;
                y0VarC = y0VarD;
            }
            if (this.f85648c) {
                kotlin.jvm.internal.m0.m(y0VarC);
                if (y0VarC.f85743d) {
                    y0 y0VarF = y0VarC.f();
                    if (lVar.f85645b == y0VarC) {
                        lVar.f85645b = y0VarF;
                    }
                    y0VarC = y0VarC.c(y0VarF);
                    y0 y0Var = y0VarC.f85746g;
                    kotlin.jvm.internal.m0.m(y0Var);
                    y0Var.b();
                }
            }
            l(y0VarC);
            this.f85650e = j10;
            kotlin.jvm.internal.m0.m(y0VarC);
            this.f85651f = y0VarC.f85740a;
            int i13 = y0VarC.f85741b + ((int) (j10 - j11));
            this.f85652g = i13;
            int i14 = y0VarC.f85742c;
            this.f85653h = i14;
            return i14 - i13;
        }

        public final void l(@oy.m y0 y0Var) {
            this.f85649d = y0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends OutputStream {
        public c() {
        }

        public String toString() {
            return l.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            l.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            kotlin.jvm.internal.m0.p(data, "data");
            l.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ l D(l lVar, l lVar2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return lVar.p(lVar2, j10);
    }

    public static /* synthetic */ l E(l lVar, l lVar2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return lVar.q(lVar2, j10, j11);
    }

    public static /* synthetic */ l F(l lVar, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = lVar.f85646c - j12;
        }
        return lVar.y(outputStream, j12, j11);
    }

    public static /* synthetic */ l F1(l lVar, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = lVar.f85646c;
        }
        return lVar.y1(outputStream, j10);
    }

    public static /* synthetic */ a e0(l lVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = i.g();
        }
        return lVar.d0(aVar);
    }

    public static /* synthetic */ a n0(l lVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = i.g();
        }
        return lVar.m0(aVar);
    }

    @oy.l
    public final y0 A0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        y0 y0Var = this.f85645b;
        if (y0Var != null) {
            kotlin.jvm.internal.m0.m(y0Var);
            y0 y0Var2 = y0Var.f85746g;
            kotlin.jvm.internal.m0.m(y0Var2);
            return (y0Var2.f85742c + i10 > 8192 || !y0Var2.f85744e) ? y0Var2.c(z0.e()) : y0Var2;
        }
        y0 y0VarE = z0.e();
        this.f85645b = y0VarE;
        y0VarE.f85746g = y0VarE;
        y0VarE.f85745f = y0VarE;
        return y0VarE;
    }

    @Override // fx.n
    public long A1(@oy.l o bytes, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        return z1(bytes, j10, Long.MAX_VALUE);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public l M(@oy.l o byteString) {
        kotlin.jvm.internal.m0.p(byteString, "byteString");
        byteString.y0(this, 0, byteString.k0());
        return this;
    }

    @Override // fx.n
    public long C1(@oy.l b1 sink) throws IOException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.T1(this, size);
        }
        return size;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public l X(@oy.l o byteString, int i10, int i11) {
        kotlin.jvm.internal.m0.p(byteString, "byteString");
        byteString.y0(this, i10, i11);
        return this;
    }

    public final o G(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        y0 y0Var = this.f85645b;
        if (y0Var != null) {
            byte[] bArr = y0Var.f85740a;
            int i10 = y0Var.f85741b;
            messageDigest.update(bArr, i10, y0Var.f85742c - i10);
            y0 y0Var2 = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var2);
            while (y0Var2 != y0Var) {
                byte[] bArr2 = y0Var2.f85740a;
                int i11 = y0Var2.f85741b;
                messageDigest.update(bArr2, i11, y0Var2.f85742c - i11);
                y0Var2 = y0Var2.f85745f;
                kotlin.jvm.internal.m0.m(y0Var2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m0.o(bArrDigest, "digest(...)");
        return new o(bArrDigest);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public l R(@oy.l d1 source, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return this;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public l writeUtf8(@oy.l String string) {
        kotlin.jvm.internal.m0.p(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public l write(@oy.l byte[] source) {
        kotlin.jvm.internal.m0.p(source, "source");
        return write(source, 0, source.length);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public l write(@oy.l byte[] source, int i10, int i11) {
        kotlin.jvm.internal.m0.p(source, "source");
        long j10 = i11;
        i.e(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            y0 y0VarA0 = A0(1);
            int iMin = Math.min(i12 - i10, 8192 - y0VarA0.f85742c);
            int i13 = i10 + iMin;
            fr.q.v0(source, y0VarA0.f85740a, y0VarA0.f85742c, i10, i13);
            y0VarA0.f85742c += iMin;
            i10 = i13;
        }
        o0(size() + j10);
        return this;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public l writeUtf8(@oy.l String string, int i10, int i11) {
        char cCharAt;
        kotlin.jvm.internal.m0.p(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                y0 y0VarA0 = A0(1);
                byte[] bArr = y0VarA0.f85740a;
                int i12 = y0VarA0.f85742c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = y0VarA0.f85742c;
                int i15 = (i12 + i10) - i14;
                y0VarA0.f85742c = i14 + i15;
                o0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    y0 y0VarA1 = A0(2);
                    byte[] bArr2 = y0VarA1.f85740a;
                    int i16 = y0VarA1.f85742c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    y0VarA1.f85742c = i16 + 2;
                    o0(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    y0 y0VarA2 = A0(3);
                    byte[] bArr3 = y0VarA2.f85740a;
                    int i17 = y0VarA2.f85742c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    y0VarA2.f85742c = i17 + 3;
                    o0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        y0 y0VarA3 = A0(4);
                        byte[] bArr4 = y0VarA3.f85740a;
                        int i20 = y0VarA3.f85742c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        y0VarA3.f85742c = i20 + 4;
                        o0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // fx.m
    public long K(@oy.l d1 source) throws IOException {
        kotlin.jvm.internal.m0.p(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public l writeUtf8CodePoint(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            y0 y0VarA0 = A0(2);
            byte[] bArr = y0VarA0.f85740a;
            int i11 = y0VarA0.f85742c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            y0VarA0.f85742c = i11 + 2;
            o0(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            y0 y0VarA1 = A0(3);
            byte[] bArr2 = y0VarA1.f85740a;
            int i12 = y0VarA1.f85742c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            y0VarA1.f85742c = i12 + 3;
            o0(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + i.u(i10));
        }
        y0 y0VarA2 = A0(4);
        byte[] bArr3 = y0VarA2.f85740a;
        int i13 = y0VarA2.f85742c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        y0VarA2.f85742c = i13 + 4;
        o0(size() + 4);
        return this;
    }

    @cs.j(name = "getByte")
    public final byte L(long j10) {
        i.e(size(), j10, 1L);
        y0 y0Var = this.f85645b;
        if (y0Var == null) {
            kotlin.jvm.internal.m0.m(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                y0Var = y0Var.f85746g;
                kotlin.jvm.internal.m0.m(y0Var);
                size -= (long) (y0Var.f85742c - y0Var.f85741b);
            }
            kotlin.jvm.internal.m0.m(y0Var);
            return y0Var.f85740a[(int) ((((long) y0Var.f85741b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (y0Var.f85742c - y0Var.f85741b)) + j11;
            if (j12 > j10) {
                kotlin.jvm.internal.m0.m(y0Var);
                return y0Var.f85740a[(int) ((((long) y0Var.f85741b) + j10) - j11)];
            }
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
            j11 = j12;
        }
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public l writeByte(int i10) {
        y0 y0VarA0 = A0(1);
        byte[] bArr = y0VarA0.f85740a;
        int i11 = y0VarA0.f85742c;
        y0VarA0.f85742c = i11 + 1;
        bArr[i11] = (byte) i10;
        o0(size() + 1);
        return this;
    }

    public final o N(String str, o oVar) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(oVar.O(), str));
            y0 y0Var = this.f85645b;
            if (y0Var != null) {
                byte[] bArr = y0Var.f85740a;
                int i10 = y0Var.f85741b;
                mac.update(bArr, i10, y0Var.f85742c - i10);
                y0 y0Var2 = y0Var.f85745f;
                kotlin.jvm.internal.m0.m(y0Var2);
                while (y0Var2 != y0Var) {
                    byte[] bArr2 = y0Var2.f85740a;
                    int i11 = y0Var2.f85741b;
                    mac.update(bArr2, i11, y0Var2.f85742c - i11);
                    y0Var2 = y0Var2.f85745f;
                    kotlin.jvm.internal.m0.m(y0Var2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.m0.o(bArrDoFinal, "doFinal(...)");
            return new o(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @oy.l
    public final o O(@oy.l o key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return N("HmacSHA1", key);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public l writeDecimalLong(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iI0 = gx.a.i0(j10);
        if (z10) {
            iI0++;
        }
        y0 y0VarA0 = A0(iI0);
        byte[] bArr = y0VarA0.f85740a;
        int i10 = y0VarA0.f85742c + iI0;
        while (j10 != 0) {
            long j11 = 10;
            i10--;
            bArr[i10] = gx.a.j0()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        y0VarA0.f85742c += iI0;
        o0(size() + ((long) iI0));
        return this;
    }

    @oy.l
    public final o S(@oy.l o key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return N("HmacSHA256", key);
    }

    @Override // fx.b1
    public void T1(@oy.l l source, long j10) {
        y0 y0Var;
        kotlin.jvm.internal.m0.p(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        i.e(source.size(), 0L, j10);
        while (j10 > 0) {
            y0 y0Var2 = source.f85645b;
            kotlin.jvm.internal.m0.m(y0Var2);
            int i10 = y0Var2.f85742c;
            y0 y0Var3 = source.f85645b;
            kotlin.jvm.internal.m0.m(y0Var3);
            if (j10 < i10 - y0Var3.f85741b) {
                y0 y0Var4 = this.f85645b;
                if (y0Var4 != null) {
                    kotlin.jvm.internal.m0.m(y0Var4);
                    y0Var = y0Var4.f85746g;
                } else {
                    y0Var = null;
                }
                if (y0Var != null && y0Var.f85744e) {
                    if ((((long) y0Var.f85742c) + j10) - ((long) (y0Var.f85743d ? 0 : y0Var.f85741b)) <= 8192) {
                        y0 y0Var5 = source.f85645b;
                        kotlin.jvm.internal.m0.m(y0Var5);
                        y0Var5.g(y0Var, (int) j10);
                        source.o0(source.size() - j10);
                        o0(size() + j10);
                        return;
                    }
                }
                y0 y0Var6 = source.f85645b;
                kotlin.jvm.internal.m0.m(y0Var6);
                source.f85645b = y0Var6.e((int) j10);
            }
            y0 y0Var7 = source.f85645b;
            kotlin.jvm.internal.m0.m(y0Var7);
            long j11 = y0Var7.f85742c - y0Var7.f85741b;
            source.f85645b = y0Var7.b();
            y0 y0Var8 = this.f85645b;
            if (y0Var8 == null) {
                this.f85645b = y0Var7;
                y0Var7.f85746g = y0Var7;
                y0Var7.f85745f = y0Var7;
            } else {
                kotlin.jvm.internal.m0.m(y0Var8);
                y0 y0Var9 = y0Var8.f85746g;
                kotlin.jvm.internal.m0.m(y0Var9);
                y0Var9.c(y0Var7).a();
            }
            source.o0(source.size() - j11);
            o0(size() + j11);
            j10 -= j11;
        }
    }

    @oy.l
    public final o U(@oy.l o key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return N("HmacSHA512", key);
    }

    @oy.l
    public final o W() {
        return G("MD5");
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public l writeHexadecimalUnsignedLong(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        y0 y0VarA0 = A0(i10);
        byte[] bArr = y0VarA0.f85740a;
        int i11 = y0VarA0.f85742c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = gx.a.j0()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        y0VarA0.f85742c += i10;
        o0(size() + ((long) i10));
        return this;
    }

    @oy.l
    @cs.k
    public final a Y() {
        return e0(this, null, 1, null);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public l writeInt(int i10) {
        y0 y0VarA0 = A0(4);
        byte[] bArr = y0VarA0.f85740a;
        int i11 = y0VarA0.f85742c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        y0VarA0.f85742c = i11 + 4;
        o0(size() + 4);
        return this;
    }

    @Override // fx.n
    public long b0(@oy.l o targetBytes, long j10) {
        int i10;
        int i11;
        kotlin.jvm.internal.m0.p(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        y0 y0Var = this.f85645b;
        if (y0Var == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                y0Var = y0Var.f85746g;
                kotlin.jvm.internal.m0.m(y0Var);
                size -= (long) (y0Var.f85742c - y0Var.f85741b);
            }
            if (targetBytes.k0() == 2) {
                byte bV = targetBytes.v(0);
                byte bV2 = targetBytes.v(1);
                while (size < size()) {
                    byte[] bArr = y0Var.f85740a;
                    i10 = (int) ((((long) y0Var.f85741b) + j10) - size);
                    int i12 = y0Var.f85742c;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (y0Var.f85742c - y0Var.f85741b);
                            y0Var = y0Var.f85745f;
                            kotlin.jvm.internal.m0.m(y0Var);
                            j10 = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bV || b10 == bV2) {
                                i11 = y0Var.f85741b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrO = targetBytes.O();
                while (size < size()) {
                    byte[] bArr2 = y0Var.f85740a;
                    i10 = (int) ((((long) y0Var.f85741b) + j10) - size);
                    int i13 = y0Var.f85742c;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrO.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrO[i14]) {
                                    i11 = y0Var.f85741b;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (y0Var.f85742c - y0Var.f85741b);
                            y0Var = y0Var.f85745f;
                            kotlin.jvm.internal.m0.m(y0Var);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (y0Var.f85742c - y0Var.f85741b)) + size;
            if (j11 > j10) {
                break;
            }
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
            size = j11;
        }
        if (targetBytes.k0() == 2) {
            byte bV3 = targetBytes.v(0);
            byte bV4 = targetBytes.v(1);
            while (size < size()) {
                byte[] bArr3 = y0Var.f85740a;
                i10 = (int) ((((long) y0Var.f85741b) + j10) - size);
                int i15 = y0Var.f85742c;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (y0Var.f85742c - y0Var.f85741b);
                        y0Var = y0Var.f85745f;
                        kotlin.jvm.internal.m0.m(y0Var);
                        j10 = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bV3 || b12 == bV4) {
                            i11 = y0Var.f85741b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrO2 = targetBytes.O();
            while (size < size()) {
                byte[] bArr4 = y0Var.f85740a;
                i10 = (int) ((((long) y0Var.f85741b) + j10) - size);
                int i16 = y0Var.f85742c;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrO2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrO2[i17]) {
                                i11 = y0Var.f85741b;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (y0Var.f85742c - y0Var.f85741b);
                        y0Var = y0Var.f85745f;
                        kotlin.jvm.internal.m0.m(y0Var);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @oy.l
    @cs.k
    public final a d0(@oy.l a unsafeCursor) {
        kotlin.jvm.internal.m0.p(unsafeCursor, "unsafeCursor");
        return gx.a.u(this, unsafeCursor);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public l writeIntLe(int i10) {
        return writeInt(i.n(i10));
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (size() != lVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        y0 y0Var2 = lVar.f85645b;
        kotlin.jvm.internal.m0.m(y0Var2);
        int i10 = y0Var.f85741b;
        int i11 = y0Var2.f85741b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(y0Var.f85742c - i10, y0Var2.f85742c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (y0Var.f85740a[i10] != y0Var2.f85740a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == y0Var.f85742c) {
                y0Var = y0Var.f85745f;
                kotlin.jvm.internal.m0.m(y0Var);
                i10 = y0Var.f85741b;
            }
            if (i11 == y0Var2.f85742c) {
                y0Var2 = y0Var2.f85745f;
                kotlin.jvm.internal.m0.m(y0Var2);
                i11 = y0Var2.f85741b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // fx.n
    public boolean exhausted() {
        return this.f85646c == 0;
    }

    @oy.l
    public final l f0(@oy.l InputStream input) throws IOException {
        kotlin.jvm.internal.m0.p(input, "input");
        j0(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // fx.n
    public boolean f1(long j10, @oy.l o bytes, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        return i11 >= 0 && j10 >= 0 && ((long) i11) + j10 <= size() && i10 >= 0 && i10 + i11 <= bytes.k0() && (i11 == 0 || gx.a.l(this, bytes, j10, j10 + 1, i10, i11) != -1);
    }

    @oy.l
    public final l g0(@oy.l InputStream input, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(input, "input");
        if (j10 >= 0) {
            j0(input, j10, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // fx.n
    public int h0(@oy.l r0 options) throws EOFException {
        kotlin.jvm.internal.m0.p(options, "options");
        int iO0 = gx.a.o0(this, options, false, 2, null);
        if (iO0 == -1) {
            return -1;
        }
        skip(options.g()[iO0].k0());
        return iO0;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public l writeLong(long j10) {
        y0 y0VarA0 = A0(8);
        byte[] bArr = y0VarA0.f85740a;
        int i10 = y0VarA0.f85742c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        y0VarA0.f85742c = i10 + 8;
        o0(size() + 8);
        return this;
    }

    public int hashCode() {
        y0 y0Var = this.f85645b;
        if (y0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = y0Var.f85742c;
            for (int i12 = y0Var.f85741b; i12 < i11; i12++) {
                i10 = (i10 * 31) + y0Var.f85740a[i12];
            }
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
        } while (y0Var != this.f85645b);
        return i10;
    }

    @cs.j(name = "-deprecated_getByte")
    @dr.o(level = dr.q.ERROR, message = "moved to operator function", replaceWith = @dr.g1(expression = "this[index]", imports = {}))
    public final byte i(long j10) {
        return L(j10);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public l writeLongLe(long j10) {
        return writeLong(i.o(j10));
    }

    @Override // fx.n
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // fx.n
    @oy.l
    public InputStream inputStream() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final void j0(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            y0 y0VarA0 = A0(1);
            int i10 = inputStream.read(y0VarA0.f85740a, y0VarA0.f85742c, (int) Math.min(j10, 8192 - y0VarA0.f85742c));
            if (i10 == -1) {
                if (y0VarA0.f85741b == y0VarA0.f85742c) {
                    this.f85645b = y0VarA0.b();
                    z0.d(y0VarA0);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            y0VarA0.f85742c += i10;
            long j11 = i10;
            this.f85646c += j11;
            j10 -= j11;
        }
    }

    @Override // fx.n
    public boolean j1(long j10, @oy.l o bytes) {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        return f1(j10, bytes, 0, bytes.k0());
    }

    @cs.j(name = "-deprecated_size")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @dr.g1(expression = "size", imports = {}))
    public final long k() {
        return this.f85646c;
    }

    public final void l() throws EOFException {
        skip(size());
    }

    @oy.l
    @cs.k
    public final a l0() {
        return n0(this, null, 1, null);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public l writeShort(int i10) {
        y0 y0VarA0 = A0(2);
        byte[] bArr = y0VarA0.f85740a;
        int i11 = y0VarA0.f85742c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        y0VarA0.f85742c = i11 + 2;
        o0(size() + 2);
        return this;
    }

    @oy.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public l clone() {
        return o();
    }

    @oy.l
    @cs.k
    public final a m0(@oy.l a unsafeCursor) {
        kotlin.jvm.internal.m0.p(unsafeCursor, "unsafeCursor");
        return gx.a.H(this, unsafeCursor);
    }

    public final long n() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        y0 y0Var2 = y0Var.f85746g;
        kotlin.jvm.internal.m0.m(y0Var2);
        int i10 = y0Var2.f85742c;
        return (i10 >= 8192 || !y0Var2.f85744e) ? size : size - ((long) (i10 - y0Var2.f85741b));
    }

    @oy.l
    public final l o() {
        l lVar = new l();
        if (size() == 0) {
            return lVar;
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        y0 y0VarD = y0Var.d();
        lVar.f85645b = y0VarD;
        y0VarD.f85746g = y0VarD;
        y0VarD.f85745f = y0VarD;
        for (y0 y0Var2 = y0Var.f85745f; y0Var2 != y0Var; y0Var2 = y0Var2.f85745f) {
            y0 y0Var3 = y0VarD.f85746g;
            kotlin.jvm.internal.m0.m(y0Var3);
            kotlin.jvm.internal.m0.m(y0Var2);
            y0Var3.c(y0Var2.d());
        }
        lVar.o0(size());
        return lVar;
    }

    public final void o0(long j10) {
        this.f85646c = j10;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public l writeShortLe(int i10) {
        return writeShort(i.p((short) i10));
    }

    @Override // fx.m
    @oy.l
    public OutputStream outputStream() {
        return new c();
    }

    @oy.l
    public final l p(@oy.l l out, long j10) {
        kotlin.jvm.internal.m0.p(out, "out");
        return q(out, j10, this.f85646c - j10);
    }

    @oy.l
    public final o p0() {
        return G("SHA-1");
    }

    @Override // fx.n
    @oy.l
    public n peek() {
        return n0.e(new u0(this));
    }

    @oy.l
    public final l q(@oy.l l out, long j10, long j11) {
        kotlin.jvm.internal.m0.p(out, "out");
        long j12 = j10;
        i.e(size(), j12, j11);
        if (j11 != 0) {
            out.o0(out.size() + j11);
            y0 y0Var = this.f85645b;
            while (true) {
                kotlin.jvm.internal.m0.m(y0Var);
                int i10 = y0Var.f85742c;
                int i11 = y0Var.f85741b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                y0Var = y0Var.f85745f;
            }
            y0 y0Var2 = y0Var;
            long j13 = j11;
            while (j13 > 0) {
                kotlin.jvm.internal.m0.m(y0Var2);
                y0 y0VarD = y0Var2.d();
                int i12 = y0VarD.f85741b + ((int) j12);
                y0VarD.f85741b = i12;
                y0VarD.f85742c = Math.min(i12 + ((int) j13), y0VarD.f85742c);
                y0 y0Var3 = out.f85645b;
                if (y0Var3 == null) {
                    y0VarD.f85746g = y0VarD;
                    y0VarD.f85745f = y0VarD;
                    out.f85645b = y0VarD;
                } else {
                    kotlin.jvm.internal.m0.m(y0Var3);
                    y0 y0Var4 = y0Var3.f85746g;
                    kotlin.jvm.internal.m0.m(y0Var4);
                    y0Var4.c(y0VarD);
                }
                j13 -= (long) (y0VarD.f85742c - y0VarD.f85741b);
                y0Var2 = y0Var2.f85745f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public l writeString(@oy.l String string, int i10, int i11, @oy.l Charset charset) {
        kotlin.jvm.internal.m0.p(string, "string");
        kotlin.jvm.internal.m0.p(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.m0.g(charset, cv.g.f77202b)) {
            return writeUtf8(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @oy.l
    @cs.k
    public final l r(@oy.l OutputStream out) throws IOException {
        kotlin.jvm.internal.m0.p(out, "out");
        return F(this, out, 0L, 0L, 6, null);
    }

    @Override // fx.n
    public long r1(@oy.l o targetBytes) {
        kotlin.jvm.internal.m0.p(targetBytes, "targetBytes");
        return b0(targetBytes, 0L);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@oy.l ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        y0 y0Var = this.f85645b;
        if (y0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), y0Var.f85742c - y0Var.f85741b);
        sink.put(y0Var.f85740a, y0Var.f85741b, iMin);
        int i10 = y0Var.f85741b + iMin;
        y0Var.f85741b = i10;
        this.f85646c -= (long) iMin;
        if (i10 == y0Var.f85742c) {
            this.f85645b = y0Var.b();
            z0.d(y0Var);
        }
        return iMin;
    }

    @Override // fx.n
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        int i10 = y0Var.f85741b;
        int i11 = y0Var.f85742c;
        int i12 = i10 + 1;
        byte b10 = y0Var.f85740a[i10];
        o0(size() - 1);
        if (i12 != i11) {
            y0Var.f85741b = i12;
            return b10;
        }
        this.f85645b = y0Var.b();
        z0.d(y0Var);
        return b10;
    }

    @Override // fx.n
    @oy.l
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // fx.n
    @oy.l
    public o readByteString() {
        return readByteString(size());
    }

    @Override // fx.n
    public long readDecimalLong() throws EOFException {
        long j10;
        byte b10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            y0 y0Var = this.f85645b;
            kotlin.jvm.internal.m0.m(y0Var);
            byte[] bArr = y0Var.f85740a;
            int i11 = y0Var.f85741b;
            int i12 = y0Var.f85742c;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                this.f85645b = y0Var.b();
                z0.d(y0Var);
            } else {
                y0Var.f85741b = i11;
            }
            if (z11 || this.f85645b == null) {
                o0(size() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (size() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + i.t(L(j10)));
            }
            j11 = j10;
        }
        l lVarWriteByte = new l().writeDecimalLong(j12).writeByte(b10);
        if (!z10) {
            lVarWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + lVarWriteByte.readUtf8());
    }

    @Override // fx.n
    public void readFully(@oy.l byte[] sink) throws EOFException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // fx.n
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            y0 y0Var = this.f85645b;
            kotlin.jvm.internal.m0.m(y0Var);
            byte[] bArr = y0Var.f85740a;
            int i12 = y0Var.f85741b;
            int i13 = y0Var.f85742c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + i.t(b10));
                    }
                    i10 = b10 + l3.a.f103493v7;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new l().writeHexadecimalUnsignedLong(j10).writeByte(b10).readUtf8());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f85645b = y0Var.b();
                z0.d(y0Var);
            } else {
                y0Var.f85741b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f85645b != null);
        o0(size() - ((long) i11));
        return j10;
    }

    @Override // fx.n
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        int i10 = y0Var.f85741b;
        int i11 = y0Var.f85742c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = y0Var.f85740a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        o0(size() - 4);
        if (i14 != i11) {
            y0Var.f85741b = i14;
            return i15;
        }
        this.f85645b = y0Var.b();
        z0.d(y0Var);
        return i15;
    }

    @Override // fx.n
    public int readIntLe() throws EOFException {
        return i.n(readInt());
    }

    @Override // fx.n
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        int i10 = y0Var.f85741b;
        int i11 = y0Var.f85742c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = y0Var.f85740a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        o0(size() - 8);
        if (i13 != i11) {
            y0Var.f85741b = i13;
            return j11;
        }
        this.f85645b = y0Var.b();
        z0.d(y0Var);
        return j11;
    }

    @Override // fx.n
    public long readLongLe() throws EOFException {
        return i.o(readLong());
    }

    @Override // fx.n
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        int i10 = y0Var.f85741b;
        int i11 = y0Var.f85742c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = y0Var.f85740a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        o0(size() - 2);
        if (i14 == i11) {
            this.f85645b = y0Var.b();
            z0.d(y0Var);
        } else {
            y0Var.f85741b = i14;
        }
        return (short) i15;
    }

    @Override // fx.n
    public short readShortLe() throws EOFException {
        return i.p(readShort());
    }

    @Override // fx.n
    @oy.l
    public String readString(@oy.l Charset charset) {
        kotlin.jvm.internal.m0.p(charset, "charset");
        return readString(this.f85646c, charset);
    }

    @Override // fx.n
    @oy.l
    public String readUtf8() {
        return readString(this.f85646c, cv.g.f77202b);
    }

    @Override // fx.n
    public int readUtf8CodePoint() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte bL = L(0L);
        if ((bL & 128) == 0) {
            i10 = bL & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bL & 224) == 192) {
            i10 = bL & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bL & 240) == 224) {
            i10 = bL & zi.c.f161639q;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bL & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bL & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + i.t(bL) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bL2 = L(j11);
            if ((bL2 & l3.a.f103436o7) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bL2 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Override // fx.n
    @oy.m
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return gx.a.l0(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // fx.n
    @oy.l
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // fx.n
    public boolean request(long j10) {
        return this.f85646c >= j10;
    }

    @Override // fx.n
    public void require(long j10) throws EOFException {
        if (this.f85646c < j10) {
            throw new EOFException();
        }
    }

    @Override // fx.n
    public void s1(@oy.l l sink, long j10) throws EOFException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        if (size() >= j10) {
            sink.T1(this, j10);
        } else {
            sink.T1(this, size());
            throw new EOFException();
        }
    }

    @cs.j(name = "size")
    public final long size() {
        return this.f85646c;
    }

    @Override // fx.n
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            y0 y0Var = this.f85645b;
            if (y0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, y0Var.f85742c - y0Var.f85741b);
            long j11 = iMin;
            o0(size() - j11);
            j10 -= j11;
            int i10 = y0Var.f85741b + iMin;
            y0Var.f85741b = i10;
            if (i10 == y0Var.f85742c) {
                this.f85645b = y0Var.b();
                z0.d(y0Var);
            }
        }
    }

    @oy.l
    @cs.k
    public final l t(@oy.l OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(out, "out");
        return F(this, out, j10, 0L, 4, null);
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public l writeString(@oy.l String string, @oy.l Charset charset) {
        kotlin.jvm.internal.m0.p(string, "string");
        kotlin.jvm.internal.m0.p(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // fx.d1
    @oy.l
    public g1 timeout() {
        return g1.f85601f;
    }

    @oy.l
    public String toString() {
        return y0().toString();
    }

    @Override // fx.n
    public long u0(@oy.l o bytes) throws IOException {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        return A1(bytes, 0L);
    }

    @oy.l
    public final o v0() {
        return G(to.c.algoTypeS2);
    }

    @oy.l
    public final o w0() {
        return G("SHA-512");
    }

    @oy.l
    @cs.k
    public final l w1(@oy.l OutputStream out) throws IOException {
        kotlin.jvm.internal.m0.p(out, "out");
        return F1(this, out, 0L, 2, null);
    }

    @Override // fx.n
    @oy.m
    public <T> T x0(@oy.l h1<T> options) throws IOException {
        kotlin.jvm.internal.m0.p(options, "options");
        int iH0 = h0(options.g());
        if (iH0 == -1) {
            return null;
        }
        return options.get(iH0);
    }

    @oy.l
    @cs.k
    public final l y(@oy.l OutputStream out, long j10, long j11) throws IOException {
        kotlin.jvm.internal.m0.p(out, "out");
        long j12 = j10;
        i.e(this.f85646c, j12, j11);
        if (j11 != 0) {
            y0 y0Var = this.f85645b;
            while (true) {
                kotlin.jvm.internal.m0.m(y0Var);
                int i10 = y0Var.f85742c;
                int i11 = y0Var.f85741b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                y0Var = y0Var.f85745f;
            }
            y0 y0Var2 = y0Var;
            long j13 = j11;
            while (j13 > 0) {
                kotlin.jvm.internal.m0.m(y0Var2);
                int i12 = (int) (((long) y0Var2.f85741b) + j12);
                int iMin = (int) Math.min(y0Var2.f85742c - i12, j13);
                out.write(y0Var2.f85740a, i12, iMin);
                j13 -= (long) iMin;
                y0Var2 = y0Var2.f85745f;
                j12 = 0;
            }
        }
        return this;
    }

    @oy.l
    public final o y0() {
        if (size() <= 2147483647L) {
            return z0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @oy.l
    @cs.k
    public final l y1(@oy.l OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(out, "out");
        i.e(this.f85646c, 0L, j10);
        y0 y0Var = this.f85645b;
        long j11 = j10;
        while (j11 > 0) {
            kotlin.jvm.internal.m0.m(y0Var);
            int iMin = (int) Math.min(j11, y0Var.f85742c - y0Var.f85741b);
            out.write(y0Var.f85740a, y0Var.f85741b, iMin);
            int i10 = y0Var.f85741b + iMin;
            y0Var.f85741b = i10;
            long j12 = iMin;
            this.f85646c -= j12;
            j11 -= j12;
            if (i10 == y0Var.f85742c) {
                y0 y0VarB = y0Var.b();
                this.f85645b = y0VarB;
                z0.d(y0Var);
                y0Var = y0VarB;
            }
        }
        return this;
    }

    @oy.l
    public final o z0(int i10) {
        if (i10 == 0) {
            return o.f85659g;
        }
        i.e(size(), 0L, i10);
        y0 y0Var = this.f85645b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.m0.m(y0Var);
            int i14 = y0Var.f85742c;
            int i15 = y0Var.f85741b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            y0Var = y0Var.f85745f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        y0 y0Var2 = this.f85645b;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.m0.m(y0Var2);
            bArr[i16] = y0Var2.f85740a;
            i11 += y0Var2.f85742c - y0Var2.f85741b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = y0Var2.f85741b;
            y0Var2.f85743d = true;
            i16++;
            y0Var2 = y0Var2.f85745f;
        }
        return new a1(bArr, iArr);
    }

    @Override // fx.n
    public long z1(@oy.l o bytes, long j10, long j11) throws IOException {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        return gx.a.m(this, bytes, j10, j11, 0, 0, 24, null);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,649:1\n73#2:650\n85#2:651\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:650\n136#1:651\n*E\n"})
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(l.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (l.this.size() > 0) {
                return l.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return l.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            kotlin.jvm.internal.m0.p(sink, "sink");
            return l.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // fx.n
    public long indexOf(byte b10, long j10) {
        return indexOf(b10, j10, Long.MAX_VALUE);
    }

    @Override // fx.n
    @oy.l
    public byte[] readByteArray(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // fx.n
    @oy.l
    public o readByteString(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new o(readByteArray(j10));
        }
        o oVarZ0 = z0((int) j10);
        skip(j10);
        return oVarZ0;
    }

    @Override // fx.n
    @oy.l
    public String readString(long j10, @oy.l Charset charset) throws EOFException {
        kotlin.jvm.internal.m0.p(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f85646c < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        y0 y0Var = this.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        int i10 = y0Var.f85741b;
        if (((long) i10) + j10 > y0Var.f85742c) {
            return new String(readByteArray(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(y0Var.f85740a, i10, i11, charset);
        int i12 = y0Var.f85741b + i11;
        y0Var.f85741b = i12;
        this.f85646c -= j10;
        if (i12 == y0Var.f85742c) {
            this.f85645b = y0Var.b();
            z0.d(y0Var);
        }
        return str;
    }

    @Override // fx.n
    @oy.l
    public String readUtf8(long j10) throws EOFException {
        return readString(j10, cv.g.f77202b);
    }

    @Override // fx.n
    @oy.l
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return gx.a.l0(this, jIndexOf);
        }
        if (j11 < size() && L(j11 - 1) == 13 && L(j11) == 10) {
            return gx.a.l0(this, j11);
        }
        l lVar = new l();
        q(lVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + lVar.readByteString().A() + cv.z0.F);
    }

    @Override // fx.n
    public long indexOf(byte b10, long j10, long j11) {
        y0 y0Var;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (y0Var = this.f85645b) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                y0Var = y0Var.f85746g;
                kotlin.jvm.internal.m0.m(y0Var);
                size -= (long) (y0Var.f85742c - y0Var.f85741b);
            }
            while (size < j11) {
                byte[] bArr = y0Var.f85740a;
                int iMin = (int) Math.min(y0Var.f85742c, (((long) y0Var.f85741b) + j11) - size);
                i10 = (int) ((((long) y0Var.f85741b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (y0Var.f85742c - y0Var.f85741b);
                y0Var = y0Var.f85745f;
                kotlin.jvm.internal.m0.m(y0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (y0Var.f85742c - y0Var.f85741b)) + size;
            if (j12 > j10) {
                break;
            }
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = y0Var.f85740a;
            int iMin2 = (int) Math.min(y0Var.f85742c, (((long) y0Var.f85741b) + j11) - size);
            i10 = (int) ((((long) y0Var.f85741b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (y0Var.f85742c - y0Var.f85741b);
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - y0Var.f85741b)) + size;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@oy.l ByteBuffer source) throws IOException {
        kotlin.jvm.internal.m0.p(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            y0 y0VarA0 = A0(1);
            int iMin = Math.min(i10, 8192 - y0VarA0.f85742c);
            source.get(y0VarA0.f85740a, y0VarA0.f85742c, iMin);
            i10 -= iMin;
            y0VarA0.f85742c += iMin;
        }
        this.f85646c += (long) iRemaining;
        return iRemaining;
    }

    @Override // fx.n
    public int read(@oy.l byte[] sink) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // fx.n
    public int read(@oy.l byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        i.e(sink.length, i10, i11);
        y0 y0Var = this.f85645b;
        if (y0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, y0Var.f85742c - y0Var.f85741b);
        byte[] bArr = y0Var.f85740a;
        int i12 = y0Var.f85741b;
        fr.q.v0(bArr, sink, i10, i12, i12 + iMin);
        y0Var.f85741b += iMin;
        o0(size() - ((long) iMin));
        if (y0Var.f85741b == y0Var.f85742c) {
            this.f85645b = y0Var.b();
            z0.d(y0Var);
        }
        return iMin;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public l emit() {
        return this;
    }

    @Override // fx.m
    @oy.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public l emitCompleteSegments() {
        return this;
    }

    @Override // fx.n, fx.m
    @oy.l
    public l buffer() {
        return this;
    }

    @Override // fx.d1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // fx.m, fx.b1, java.io.Flushable
    public void flush() {
    }

    @Override // fx.n, fx.m
    @oy.l
    public l getBuffer() {
        return this;
    }

    @Override // fx.d1
    public long read(@oy.l l sink, long j10) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.T1(this, j10);
        return j10;
    }
}
