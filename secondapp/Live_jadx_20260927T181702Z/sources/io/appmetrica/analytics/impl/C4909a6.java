package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4909a6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4909a6[] f96912g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f96913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f96914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f96916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f96918f;

    public C4909a6() {
        a();
    }

    public static C4909a6[] b() {
        if (f96912g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96912g == null) {
                        f96912g = new C4909a6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96912g;
    }

    public final C4909a6 a() {
        this.f96913a = "";
        this.f96914b = "";
        this.f96915c = -1;
        this.f96916d = "";
        this.f96917e = false;
        this.f96918f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f96913a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f96913a);
        }
        if (!this.f96914b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f96914b);
        }
        int i10 = this.f96915c;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i10);
        }
        if (!this.f96916d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f96916d);
        }
        boolean z10 = this.f96917e;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i11 = this.f96918f;
        return i11 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f96913a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f96913a);
        }
        if (!this.f96914b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f96914b);
        }
        int i10 = this.f96915c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i10);
        }
        if (!this.f96916d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f96916d);
        }
        boolean z10 = this.f96917e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i11 = this.f96918f;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4909a6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4909a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4909a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96913a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f96914b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f96915c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f96916d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f96917e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96918f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static C4909a6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4909a6) MessageNano.mergeFrom(new C4909a6(), bArr);
    }
}
