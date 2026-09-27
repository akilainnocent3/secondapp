package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5408tm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5408tm[] f98377c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f98379b;

    public C5408tm() {
        a();
    }

    public static C5408tm[] b() {
        if (f98377c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98377c == null) {
                        f98377c = new C5408tm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98377c;
    }

    public final C5408tm a() {
        this.f98378a = "";
        this.f98379b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f98378a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f98378a);
        }
        return !Arrays.equals(this.f98379b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f98379b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f98378a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f98378a);
        }
        if (!Arrays.equals(this.f98379b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f98379b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5408tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f98378a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f98379b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C5408tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5408tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5408tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5408tm) MessageNano.mergeFrom(new C5408tm(), bArr);
    }
}
