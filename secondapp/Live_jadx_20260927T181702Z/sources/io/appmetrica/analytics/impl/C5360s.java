package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5360s extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f98255l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f98256m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f98257n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f98258o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f98259p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f98260q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f98261r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f98262s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile C5360s[] f98263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static byte[] f98264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile boolean f98265v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f98266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f98267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f98268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f98270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f98271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f98272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f98273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f98274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f98275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f98276k;

    public C5360s() {
        if (!f98265v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f98265v) {
                        f98264u = InternalNano.bytesDefaultValue("manual");
                        f98265v = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a();
    }

    public static C5360s[] b() {
        if (f98263t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98263t == null) {
                        f98263t = new C5360s[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98263t;
    }

    public final C5360s a() {
        this.f98266a = (byte[]) f98264u.clone();
        this.f98267b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f98268c = bArr;
        this.f98269d = 0;
        this.f98270e = bArr;
        this.f98271f = bArr;
        this.f98272g = bArr;
        this.f98273h = bArr;
        this.f98274i = bArr;
        this.f98275j = bArr;
        this.f98276k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f98266a, f98264u)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f98266a);
        }
        r rVar = this.f98267b;
        if (rVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f98268c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f98268c);
        }
        int i10 = this.f98269d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        if (!Arrays.equals(this.f98270e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f98270e);
        }
        if (!Arrays.equals(this.f98271f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f98271f);
        }
        if (!Arrays.equals(this.f98272g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f98272g);
        }
        if (!Arrays.equals(this.f98273h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f98273h);
        }
        if (!Arrays.equals(this.f98274i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f98274i);
        }
        if (!Arrays.equals(this.f98275j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f98275j);
        }
        return !Arrays.equals(this.f98276k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f98276k) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f98266a, f98264u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f98266a);
        }
        r rVar = this.f98267b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f98268c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f98268c);
        }
        int i10 = this.f98269d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        if (!Arrays.equals(this.f98270e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f98270e);
        }
        if (!Arrays.equals(this.f98271f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f98271f);
        }
        if (!Arrays.equals(this.f98272g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f98272g);
        }
        if (!Arrays.equals(this.f98273h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f98273h);
        }
        if (!Arrays.equals(this.f98274i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f98274i);
        }
        if (!Arrays.equals(this.f98275j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f98275j);
        }
        if (!Arrays.equals(this.f98276k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f98276k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5360s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5360s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5360s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f98266a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f98267b == null) {
                        this.f98267b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f98267b);
                    break;
                case 26:
                    this.f98268c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f98269d = int32;
                            break;
                    }
                    break;
                case 42:
                    this.f98270e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f98271f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f98272g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f98273h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f98274i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f98275j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f98276k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5360s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5360s) MessageNano.mergeFrom(new C5360s(), bArr);
    }
}
