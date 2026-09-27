package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Wf extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f96701e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f96702f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96703g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Wf[] f96704h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f96705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f96706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f96707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96708d;

    public Wf() {
        a();
    }

    public static Wf[] b() {
        if (f96704h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96704h == null) {
                        f96704h = new Wf[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96704h;
    }

    public final Wf a() {
        this.f96705a = WireFormatNano.EMPTY_BYTES;
        this.f96706b = 0L;
        this.f96707c = 0L;
        this.f96708d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f96705a) + super.computeSerializedSize();
        long j10 = this.f96706b;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f96707c;
        if (j11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i10 = this.f96708d;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i10) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f96705a);
        long j10 = this.f96706b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f96707c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i10 = this.f96708d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Wf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96705a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f96706b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f96707c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f96708d = int32;
                }
            }
        }
        return this;
    }

    public static Wf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Wf().mergeFrom(codedInputByteBufferNano);
    }

    public static Wf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Wf) MessageNano.mergeFrom(new Wf(), bArr);
    }
}
