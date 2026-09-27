package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5133io extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5133io[] f97592e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f97593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f97594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f97595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f97596d;

    public C5133io() {
        a();
    }

    public static C5133io[] b() {
        if (f97592e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97592e == null) {
                        f97592e = new C5133io[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97592e;
    }

    public final C5133io a() {
        this.f97593a = WireFormatNano.EMPTY_BYTES;
        this.f97594b = 0.0d;
        this.f97595c = 0.0d;
        this.f97596d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f97593a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f97593a);
        }
        if (Double.doubleToLongBits(this.f97594b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f97594b);
        }
        if (Double.doubleToLongBits(this.f97595c) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f97595c);
        }
        boolean z10 = this.f97596d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f97593a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f97593a);
        }
        if (Double.doubleToLongBits(this.f97594b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f97594b);
        }
        if (Double.doubleToLongBits(this.f97595c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f97595c);
        }
        boolean z10 = this.f97596d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5133io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97593a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f97594b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f97595c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97596d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5133io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5133io().mergeFrom(codedInputByteBufferNano);
    }

    public static C5133io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5133io) MessageNano.mergeFrom(new C5133io(), bArr);
    }
}
