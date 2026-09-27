package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5041f9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile C5041f9[] T = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f97335t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f97336u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f97337v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f97338w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f97339x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f97340y = 13;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f97341z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f97342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f97343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f97345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f97346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4912a9 f97347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5015e9 f97348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f97349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f97350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f97351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f97352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f97353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f97354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f97355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f97356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f97357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f97358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f97359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C4990d9[] f97360s;

    public C5041f9() {
        a();
    }

    public static C5041f9[] b() {
        if (T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (T == null) {
                        T = new C5041f9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return T;
    }

    public final C5041f9 a() {
        this.f97342a = 0L;
        this.f97343b = 0L;
        this.f97344c = 0;
        this.f97345d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f97346e = bArr;
        this.f97347f = null;
        this.f97348g = null;
        this.f97349h = "";
        this.f97350i = 0;
        this.f97351j = 0;
        this.f97352k = -1;
        this.f97353l = bArr;
        this.f97354m = -1;
        this.f97355n = 0L;
        this.f97356o = 0L;
        this.f97357p = 0;
        this.f97358q = false;
        this.f97359r = 1L;
        this.f97360s = C4990d9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f97344c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f97343b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f97342a) + super.computeSerializedSize();
        if (!this.f97345d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f97345d);
        }
        byte[] bArr = this.f97346e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f97346e);
        }
        C4912a9 c4912a9 = this.f97347f;
        if (c4912a9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4912a9);
        }
        C5015e9 c5015e9 = this.f97348g;
        if (c5015e9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c5015e9);
        }
        if (!this.f97349h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f97349h);
        }
        int i10 = this.f97350i;
        if (i10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i10);
        }
        int i11 = this.f97351j;
        if (i11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i11);
        }
        int i12 = this.f97352k;
        if (i12 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i12);
        }
        if (!Arrays.equals(this.f97353l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f97353l);
        }
        int i13 = this.f97354m;
        if (i13 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i13);
        }
        long j10 = this.f97355n;
        if (j10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j10);
        }
        long j11 = this.f97356o;
        if (j11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j11);
        }
        int i14 = this.f97357p;
        if (i14 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i14);
        }
        boolean z10 = this.f97358q;
        if (z10) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z10);
        }
        long j12 = this.f97359r;
        if (j12 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j12);
        }
        C4990d9[] c4990d9Arr = this.f97360s;
        if (c4990d9Arr != null && c4990d9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C4990d9[] c4990d9Arr2 = this.f97360s;
                if (i15 >= c4990d9Arr2.length) {
                    break;
                }
                C4990d9 c4990d9 = c4990d9Arr2[i15];
                if (c4990d9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c4990d9) + iComputeUInt32Size;
                }
                i15++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f97342a);
        codedOutputByteBufferNano.writeUInt64(2, this.f97343b);
        codedOutputByteBufferNano.writeUInt32(3, this.f97344c);
        if (!this.f97345d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f97345d);
        }
        byte[] bArr = this.f97346e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f97346e);
        }
        C4912a9 c4912a9 = this.f97347f;
        if (c4912a9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4912a9);
        }
        C5015e9 c5015e9 = this.f97348g;
        if (c5015e9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c5015e9);
        }
        if (!this.f97349h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f97349h);
        }
        int i10 = this.f97350i;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i10);
        }
        int i11 = this.f97351j;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i11);
        }
        int i12 = this.f97352k;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i12);
        }
        if (!Arrays.equals(this.f97353l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f97353l);
        }
        int i13 = this.f97354m;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i13);
        }
        long j10 = this.f97355n;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j10);
        }
        long j11 = this.f97356o;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j11);
        }
        int i14 = this.f97357p;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i14);
        }
        boolean z10 = this.f97358q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(23, z10);
        }
        long j12 = this.f97359r;
        if (j12 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j12);
        }
        C4990d9[] c4990d9Arr = this.f97360s;
        if (c4990d9Arr != null && c4990d9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C4990d9[] c4990d9Arr2 = this.f97360s;
                if (i15 >= c4990d9Arr2.length) {
                    break;
                }
                C4990d9 c4990d9 = c4990d9Arr2[i15];
                if (c4990d9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c4990d9);
                }
                i15++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5041f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5041f9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5041f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f97342a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f97343b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f97344c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f97345d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f97346e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f97347f == null) {
                        this.f97347f = new C4912a9();
                    }
                    codedInputByteBufferNano.readMessage(this.f97347f);
                    break;
                case 58:
                    if (this.f97348g == null) {
                        this.f97348g = new C5015e9();
                    }
                    codedInputByteBufferNano.readMessage(this.f97348g);
                    break;
                case 66:
                    this.f97349h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f97350i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f97351j = int32;
                    }
                    break;
                case 104:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == -1 || int33 == 0 || int33 == 1) {
                        this.f97352k = int33;
                    }
                    break;
                case 114:
                    this.f97353l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int34 = codedInputByteBufferNano.readInt32();
                    if (int34 == -1 || int34 == 0 || int34 == 1) {
                        this.f97354m = int34;
                    }
                    break;
                case 128:
                    this.f97355n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f97356o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int35 = codedInputByteBufferNano.readInt32();
                    if (int35 == 0 || int35 == 1 || int35 == 2) {
                        this.f97357p = int35;
                    }
                    break;
                case 184:
                    this.f97358q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f97359r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C4990d9[] c4990d9Arr = this.f97360s;
                    int length = c4990d9Arr == null ? 0 : c4990d9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4990d9[] c4990d9Arr2 = new C4990d9[i10];
                    if (length != 0) {
                        System.arraycopy(c4990d9Arr, 0, c4990d9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4990d9 c4990d9 = new C4990d9();
                        c4990d9Arr2[length] = c4990d9;
                        codedInputByteBufferNano.readMessage(c4990d9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4990d9 c4990d10 = new C4990d9();
                    c4990d9Arr2[length] = c4990d10;
                    codedInputByteBufferNano.readMessage(c4990d10);
                    this.f97360s = c4990d9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5041f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5041f9) MessageNano.mergeFrom(new C5041f9(), bArr);
    }
}
