package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5119i9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5119i9[] f97571e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f97574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f97575d;

    public C5119i9() {
        a();
    }

    public static C5119i9[] b() {
        if (f97571e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97571e == null) {
                        f97571e = new C5119i9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97571e;
    }

    public final C5119i9 a() {
        this.f97572a = 0;
        this.f97573b = 0;
        this.f97574c = "";
        this.f97575d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f97572a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f97573b;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i11);
        }
        if (!this.f97574c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f97574c);
        }
        boolean z10 = this.f97575d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f97572a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f97573b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        if (!this.f97574c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f97574c);
        }
        boolean z10 = this.f97575d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5119i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f97572a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f97573b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f97574c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97575d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5119i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5119i9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5119i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5119i9) MessageNano.mergeFrom(new C5119i9(), bArr);
    }
}
