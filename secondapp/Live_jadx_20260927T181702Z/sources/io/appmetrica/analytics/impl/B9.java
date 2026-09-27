package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class B9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95596c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f95597d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f95598e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f95599f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95600g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f95601h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f95602i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile B9[] f95603j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f95605b;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (f95603j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95603j == null) {
                        f95603j = new B9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95603j;
    }

    public final B9 a() {
        this.f95604a = 0;
        this.f95605b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f95604a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        return !Arrays.equals(this.f95605b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f95605b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f95604a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!Arrays.equals(this.f95605b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f95605b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f95604a = int32;
                            break;
                    }
                } else if (tag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f95605b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public static B9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
