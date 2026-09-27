package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5303pg extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f98139e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f98140f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f98141g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C5303pg[] f98142h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f98144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f98145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98146d;

    public C5303pg() {
        a();
    }

    public static C5303pg[] b() {
        if (f98142h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98142h == null) {
                        f98142h = new C5303pg[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98142h;
    }

    public final C5303pg a() {
        this.f98143a = "";
        this.f98144b = 0L;
        this.f98145c = 0L;
        this.f98146d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f98143a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f98143a);
        }
        long j10 = this.f98144b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f98145c;
        if (j11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i10 = this.f98146d;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f98143a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f98143a);
        }
        long j10 = this.f98144b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f98145c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i10 = this.f98146d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5303pg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f98143a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f98144b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f98145c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f98146d = int32;
                }
            }
        }
        return this;
    }

    public static C5303pg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5303pg().mergeFrom(codedInputByteBufferNano);
    }

    public static C5303pg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5303pg) MessageNano.mergeFrom(new C5303pg(), bArr);
    }
}
