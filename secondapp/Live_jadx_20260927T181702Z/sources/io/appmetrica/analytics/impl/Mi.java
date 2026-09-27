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
public final class Mi extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f96174f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96175g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f96176h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Mi[] f96177i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f96178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f96179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f96181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f96182e;

    public Mi() {
        a();
    }

    public static Mi[] b() {
        if (f96177i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96177i == null) {
                        f96177i = new Mi[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96177i;
    }

    public final Mi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f96178a = bArr;
        this.f96179b = 0L;
        this.f96180c = 0;
        this.f96181d = bArr;
        this.f96182e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f96178a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f96178a);
        }
        long j10 = this.f96179b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f96180c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f96181d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f96181d);
        }
        long j11 = this.f96182e;
        return j11 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f96178a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f96178a);
        }
        long j10 = this.f96179b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f96180c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f96181d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f96181d);
        }
        long j11 = this.f96182e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96178a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f96179b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f96180c = int32;
                }
            } else if (tag == 34) {
                this.f96181d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96182e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static Mi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}
