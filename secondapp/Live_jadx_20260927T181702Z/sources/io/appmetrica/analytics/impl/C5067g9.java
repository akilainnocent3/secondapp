package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5067g9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f97408d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f97409e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f97410f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5067g9[] f97411g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5144j9 f97412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f97413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97414c;

    public C5067g9() {
        a();
    }

    public static C5067g9[] b() {
        if (f97411g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97411g == null) {
                        f97411g = new C5067g9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97411g;
    }

    public final C5067g9 a() {
        this.f97412a = null;
        this.f97413b = "";
        this.f97414c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5144j9 c5144j9 = this.f97412a;
        if (c5144j9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5144j9);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f97413b) + iComputeSerializedSize;
        int i10 = this.f97414c;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i10) + iComputeStringSize : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5144j9 c5144j9 = this.f97412a;
        if (c5144j9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5144j9);
        }
        codedOutputByteBufferNano.writeString(2, this.f97413b);
        int i10 = this.f97414c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5067g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f97412a == null) {
                    this.f97412a = new C5144j9();
                }
                codedInputByteBufferNano.readMessage(this.f97412a);
            } else if (tag == 18) {
                this.f97413b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f97414c = int32;
                }
            }
        }
        return this;
    }

    public static C5067g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5067g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5067g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5067g9) MessageNano.mergeFrom(new C5067g9(), bArr);
    }
}
