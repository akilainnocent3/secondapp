package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5489x3 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5489x3[] f98560b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5464w3[] f98561a;

    public C5489x3() {
        a();
    }

    public static C5489x3[] b() {
        if (f98560b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98560b == null) {
                        f98560b = new C5489x3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98560b;
    }

    public final C5489x3 a() {
        this.f98561a = C5464w3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5464w3[] c5464w3Arr = this.f98561a;
        if (c5464w3Arr != null && c5464w3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5464w3[] c5464w3Arr2 = this.f98561a;
                if (i10 >= c5464w3Arr2.length) {
                    break;
                }
                C5464w3 c5464w3 = c5464w3Arr2[i10];
                if (c5464w3 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5464w3) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5464w3[] c5464w3Arr = this.f98561a;
        if (c5464w3Arr != null && c5464w3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5464w3[] c5464w3Arr2 = this.f98561a;
                if (i10 >= c5464w3Arr2.length) {
                    break;
                }
                C5464w3 c5464w3 = c5464w3Arr2[i10];
                if (c5464w3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5464w3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5489x3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5464w3[] c5464w3Arr = this.f98561a;
                int length = c5464w3Arr == null ? 0 : c5464w3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5464w3[] c5464w3Arr2 = new C5464w3[i10];
                if (length != 0) {
                    System.arraycopy(c5464w3Arr, 0, c5464w3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5464w3 c5464w3 = new C5464w3();
                    c5464w3Arr2[length] = c5464w3;
                    codedInputByteBufferNano.readMessage(c5464w3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5464w3 c5464w4 = new C5464w3();
                c5464w3Arr2[length] = c5464w4;
                codedInputByteBufferNano.readMessage(c5464w4);
                this.f98561a = c5464w3Arr2;
            }
        }
        return this;
    }

    public static C5489x3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5489x3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5489x3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5489x3) MessageNano.mergeFrom(new C5489x3(), bArr);
    }
}
