package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5320q8 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5320q8[] f98182d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f98183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f98184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5344r8 f98185c;

    public C5320q8() {
        a();
    }

    public static C5320q8[] b() {
        if (f98182d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98182d == null) {
                        f98182d = new C5320q8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98182d;
    }

    public final C5320q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f98183a = bArr;
        this.f98184b = bArr;
        this.f98185c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f98183a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f98183a);
        }
        if (!Arrays.equals(this.f98184b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f98184b);
        }
        C5344r8 c5344r8 = this.f98185c;
        return c5344r8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, c5344r8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f98183a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f98183a);
        }
        if (!Arrays.equals(this.f98184b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f98184b);
        }
        C5344r8 c5344r8 = this.f98185c;
        if (c5344r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5344r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5320q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f98183a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f98184b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f98185c == null) {
                    this.f98185c = new C5344r8();
                }
                codedInputByteBufferNano.readMessage(this.f98185c);
            }
        }
        return this;
    }

    public static C5320q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5320q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5320q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5320q8) MessageNano.mergeFrom(new C5320q8(), bArr);
    }
}
