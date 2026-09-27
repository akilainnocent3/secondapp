package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4912a9 extends MessageNano {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f96922j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f96923k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f96924l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C4912a9[] f96925m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f96926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f96927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f96928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f96931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f96933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f96934i;

    public C4912a9() {
        a();
    }

    public static C4912a9[] b() {
        if (f96925m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96925m == null) {
                        f96925m = new C4912a9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96925m;
    }

    public final C4912a9 a() {
        this.f96926a = 0.0d;
        this.f96927b = 0.0d;
        this.f96928c = 0L;
        this.f96929d = 0;
        this.f96930e = 0;
        this.f96931f = 0;
        this.f96932g = 0;
        this.f96933h = 0;
        this.f96934i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f96927b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f96926a) + super.computeSerializedSize();
        long j10 = this.f96928c;
        if (j10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j10);
        }
        int i10 = this.f96929d;
        if (i10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i10);
        }
        int i11 = this.f96930e;
        if (i11 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i11);
        }
        int i12 = this.f96931f;
        if (i12 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i12);
        }
        int i13 = this.f96932g;
        if (i13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        int i14 = this.f96933h;
        if (i14 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i14);
        }
        return !this.f96934i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f96934i) + iComputeDoubleSize : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f96926a);
        codedOutputByteBufferNano.writeDouble(2, this.f96927b);
        long j10 = this.f96928c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j10);
        }
        int i10 = this.f96929d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i10);
        }
        int i11 = this.f96930e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        int i12 = this.f96931f;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i12);
        }
        int i13 = this.f96932g;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        int i14 = this.f96933h;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i14);
        }
        if (!this.f96934i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f96934i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4912a9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4912a9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4912a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 9) {
                this.f96926a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f96927b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f96928c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f96929d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f96930e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f96931f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f96932g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f96933h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96934i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4912a9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4912a9) MessageNano.mergeFrom(new C4912a9(), bArr);
    }
}
