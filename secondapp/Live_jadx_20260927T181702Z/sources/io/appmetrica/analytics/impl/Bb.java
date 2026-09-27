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
public final class Bb extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Bb[] f95606f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f95607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f95608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f95610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f95611e;

    public Bb() {
        a();
    }

    public static Bb[] b() {
        if (f95606f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95606f == null) {
                        f95606f = new Bb[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95606f;
    }

    public final Bb a() {
        this.f95607a = "";
        this.f95608b = "";
        this.f95609c = false;
        this.f95610d = "";
        this.f95611e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f95607a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f95607a);
        }
        if (!this.f95608b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f95608b);
        }
        boolean z10 = this.f95609c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z10);
        }
        if (!this.f95610d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f95610d);
        }
        return !this.f95611e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f95611e) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f95607a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f95607a);
        }
        if (!this.f95608b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f95608b);
        }
        boolean z10 = this.f95609c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(22, z10);
        }
        if (!this.f95610d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f95610d);
        }
        if (!this.f95611e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f95611e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Bb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Bb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f95607a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f95608b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f95609c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f95610d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f95611e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Bb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Bb) MessageNano.mergeFrom(new Bb(), bArr);
    }
}
