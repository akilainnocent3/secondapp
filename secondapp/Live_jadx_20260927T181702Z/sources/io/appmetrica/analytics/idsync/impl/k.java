package io.appmetrica.analytics.idsync.impl;

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
public final class k extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k[] f95476c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f95477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[][] f95478b;

    public k() {
        a();
    }

    public static k[] b() {
        if (f95476c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95476c == null) {
                        f95476c = new k[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95476c;
    }

    public final k a() {
        this.f95477a = WireFormatNano.EMPTY_BYTES;
        this.f95478b = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f95477a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f95477a);
        }
        byte[][] bArr = this.f95478b;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i10 = 0;
        int iComputeBytesSizeNoTag = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f95478b;
            if (i10 >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i11;
            }
            byte[] bArr3 = bArr2[i10];
            if (bArr3 != null) {
                i11++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f95477a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f95477a);
        }
        byte[][] bArr = this.f95478b;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            while (true) {
                byte[][] bArr2 = this.f95478b;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(2, bArr3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f95477a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                byte[][] bArr = this.f95478b;
                int length = bArr == null ? 0 : bArr.length;
                int i10 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i10][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i10 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f95478b = bArr2;
            }
        }
        return this;
    }

    public static k b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new k().mergeFrom(codedInputByteBufferNano);
    }

    public static k a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (k) MessageNano.mergeFrom(new k(), bArr);
    }
}
