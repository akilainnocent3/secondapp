package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5244n7 extends MessageNano {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile C5244n7[] f97943s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f97945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f97946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f97947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5269o7 f97948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f97949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f97950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f97951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f97952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f97953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f97954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f97955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f97956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f97957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f97958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f97959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f97960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f97961r;

    public C5244n7() {
        a();
    }

    public static C5244n7[] b() {
        if (f97943s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97943s == null) {
                        f97943s = new C5244n7[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97943s;
    }

    public final C5244n7 a() {
        this.f97944a = -1;
        this.f97945b = "";
        this.f97946c = "";
        this.f97947d = -1L;
        this.f97948e = null;
        this.f97949f = "";
        this.f97950g = "";
        this.f97951h = -1L;
        this.f97952i = -1;
        this.f97953j = -1;
        this.f97954k = "";
        this.f97955l = -1;
        this.f97956m = "";
        this.f97957n = -1;
        this.f97958o = -1;
        this.f97959p = -1;
        this.f97960q = -1;
        this.f97961r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f97944a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (!this.f97945b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f97945b);
        }
        if (!this.f97946c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f97946c);
        }
        long j10 = this.f97947d;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j10);
        }
        C5269o7 c5269o7 = this.f97948e;
        if (c5269o7 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5269o7);
        }
        if (!this.f97949f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f97949f);
        }
        if (!this.f97950g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f97950g);
        }
        long j11 = this.f97951h;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j11);
        }
        int i11 = this.f97952i;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f97953j;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        if (!this.f97954k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f97954k);
        }
        int i13 = this.f97955l;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i13);
        }
        if (!this.f97956m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f97956m);
        }
        int i14 = this.f97957n;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i14);
        }
        int i15 = this.f97958o;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i15);
        }
        int i16 = this.f97959p;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i16);
        }
        int i17 = this.f97960q;
        if (i17 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i17);
        }
        return !Arrays.equals(this.f97961r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f97961r) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f97944a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!this.f97945b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f97945b);
        }
        if (!this.f97946c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f97946c);
        }
        long j10 = this.f97947d;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j10);
        }
        C5269o7 c5269o7 = this.f97948e;
        if (c5269o7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5269o7);
        }
        if (!this.f97949f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f97949f);
        }
        if (!this.f97950g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f97950g);
        }
        long j11 = this.f97951h;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j11);
        }
        int i11 = this.f97952i;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f97953j;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        if (!this.f97954k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f97954k);
        }
        int i13 = this.f97955l;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i13);
        }
        if (!this.f97956m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f97956m);
        }
        int i14 = this.f97957n;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i14);
        }
        int i15 = this.f97958o;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i15);
        }
        int i16 = this.f97959p;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i16);
        }
        int i17 = this.f97960q;
        if (i17 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i17);
        }
        if (!Arrays.equals(this.f97961r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f97961r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5244n7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5244n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5244n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f97944a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f97945b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f97946c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f97947d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f97948e == null) {
                        this.f97948e = new C5269o7();
                    }
                    codedInputByteBufferNano.readMessage(this.f97948e);
                    break;
                case 50:
                    this.f97949f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f97950g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f97951h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f97952i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f97953j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f97954k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f97955l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f97956m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f97957n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f97958o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f97959p = int32;
                    }
                    break;
                case 136:
                    this.f97960q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f97961r = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5244n7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5244n7) MessageNano.mergeFrom(new C5244n7(), bArr);
    }
}
