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
public final class W1 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96638c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f96639d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f96640e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f96641f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96642g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f96643h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f96644i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f96645j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f96646k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f96647l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile W1[] f96648m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96650b;

    public W1() {
        a();
    }

    public static W1[] b() {
        if (f96648m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96648m == null) {
                        f96648m = new W1[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96648m;
    }

    public final W1 a() {
        this.f96649a = 0;
        this.f96650b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f96650b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f96649a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f96649a);
        codedOutputByteBufferNano.writeInt32(3, this.f96650b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 16) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f96649a = int32;
                            break;
                    }
                } else if (tag != 24) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == -1 || int33 == 0 || int33 == 1) {
                        this.f96650b = int33;
                    }
                }
            }
        }
        return this;
    }

    public static W1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W1().mergeFrom(codedInputByteBufferNano);
    }

    public static W1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W1) MessageNano.mergeFrom(new W1(), bArr);
    }
}
