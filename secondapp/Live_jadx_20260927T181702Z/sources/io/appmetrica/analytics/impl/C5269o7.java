package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5269o7 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile C5269o7[] f98011k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f98013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f98014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f98018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f98019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f98020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f98021j;

    public C5269o7() {
        a();
    }

    public static C5269o7[] b() {
        if (f98011k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98011k == null) {
                        f98011k = new C5269o7[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98011k;
    }

    public final C5269o7 a() {
        this.f98012a = -1;
        this.f98013b = -1.0d;
        this.f98014c = -1.0d;
        this.f98015d = -1;
        this.f98016e = -1;
        this.f98017f = -1;
        this.f98018g = -1;
        this.f98019h = -1L;
        this.f98020i = "";
        this.f98021j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f98012a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (Double.doubleToLongBits(this.f98013b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f98013b);
        }
        if (Double.doubleToLongBits(this.f98014c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f98014c);
        }
        int i11 = this.f98015d;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i11);
        }
        int i12 = this.f98016e;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i12);
        }
        int i13 = this.f98017f;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
        }
        int i14 = this.f98018g;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i14);
        }
        long j10 = this.f98019h;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j10);
        }
        if (!this.f98020i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f98020i);
        }
        return !this.f98021j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.f98021j) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f98012a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (Double.doubleToLongBits(this.f98013b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f98013b);
        }
        if (Double.doubleToLongBits(this.f98014c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f98014c);
        }
        int i11 = this.f98015d;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i11);
        }
        int i12 = this.f98016e;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i12);
        }
        int i13 = this.f98017f;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        int i14 = this.f98018g;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i14);
        }
        long j10 = this.f98019h;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j10);
        }
        if (!this.f98020i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f98020i);
        }
        if (!this.f98021j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f98021j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5269o7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5269o7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5269o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f98012a = int32;
                    }
                    break;
                case 17:
                    this.f98013b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f98014c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f98015d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f98016e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f98017f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f98018g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f98019h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f98020i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f98021j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5269o7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5269o7) MessageNano.mergeFrom(new C5269o7(), bArr);
    }
}
