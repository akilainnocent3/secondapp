package io.appmetrica.analytics.billing.impl;

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
public final class v extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v[] f95063e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f95064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f95065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f95067d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f95063e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95063e == null) {
                        f95063e = new v[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95063e;
    }

    public final v a() {
        this.f95064a = 0L;
        this.f95065b = null;
        this.f95066c = 0;
        this.f95067d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f95064a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        w wVar = this.f95065b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i10 = this.f95066c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        return !Arrays.equals(this.f95067d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f95067d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f95064a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        w wVar = this.f95065b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i10 = this.f95066c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f95067d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f95067d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f95064a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f95065b == null) {
                    this.f95065b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f95065b);
            } else if (tag == 24) {
                this.f95066c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f95067d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
