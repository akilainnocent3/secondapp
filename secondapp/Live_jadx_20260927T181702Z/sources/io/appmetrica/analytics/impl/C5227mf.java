package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5227mf extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C5227mf[] f97901f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f97903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f97904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f97905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97906e;

    public C5227mf() {
        a();
    }

    public static C5227mf[] b() {
        if (f97901f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97901f == null) {
                        f97901f = new C5227mf[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97901f;
    }

    public final C5227mf a() {
        this.f97902a = "";
        this.f97903b = "";
        this.f97904c = false;
        this.f97905d = false;
        this.f97906e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f97902a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f97902a);
        }
        if (!this.f97903b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f97903b);
        }
        boolean z10 = this.f97904c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z10);
        }
        boolean z11 = this.f97905d;
        if (z11) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z11);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f97906e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f97902a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f97902a);
        }
        if (!this.f97903b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f97903b);
        }
        boolean z10 = this.f97904c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(3, z10);
        }
        boolean z11 = this.f97905d;
        if (z11) {
            codedOutputByteBufferNano.writeBool(4, z11);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f97906e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5227mf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5227mf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5227mf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97902a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f97903b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f97904c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f97905d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f97906e = int32;
                }
            }
        }
        return this;
    }

    public static C5227mf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5227mf) MessageNano.mergeFrom(new C5227mf(), bArr);
    }
}
