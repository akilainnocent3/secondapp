package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5144j9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5144j9[] f97621e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f97622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f97624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f97625d;

    public C5144j9() {
        a();
    }

    public static C5144j9[] b() {
        if (f97621e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97621e == null) {
                        f97621e = new C5144j9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97621e;
    }

    public final C5144j9 a() {
        this.f97622a = 0L;
        this.f97623b = 0;
        this.f97624c = 0L;
        this.f97625d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f97623b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f97622a) + super.computeSerializedSize();
        long j10 = this.f97624c;
        if (j10 != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j10);
        }
        boolean z10 = this.f97625d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSInt32Size : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f97622a);
        codedOutputByteBufferNano.writeSInt32(2, this.f97623b);
        long j10 = this.f97624c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j10);
        }
        boolean z10 = this.f97625d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5144j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f97622a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f97623b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f97624c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97625d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5144j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5144j9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5144j9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5144j9) MessageNano.mergeFrom(new C5144j9(), bArr);
    }
}
