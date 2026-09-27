package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5245n8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5245n8[] f97962c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4989d8 f97963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4989d8[] f97964b;

    public C5245n8() {
        a();
    }

    public static C5245n8[] b() {
        if (f97962c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97962c == null) {
                        f97962c = new C5245n8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97962c;
    }

    public final C5245n8 a() {
        this.f97963a = null;
        this.f97964b = C4989d8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4989d8 c4989d8 = this.f97963a;
        if (c4989d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4989d8);
        }
        C4989d8[] c4989d8Arr = this.f97964b;
        if (c4989d8Arr != null && c4989d8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4989d8[] c4989d8Arr2 = this.f97964b;
                if (i10 >= c4989d8Arr2.length) {
                    break;
                }
                C4989d8 c4989d9 = c4989d8Arr2[i10];
                if (c4989d9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4989d9) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4989d8 c4989d8 = this.f97963a;
        if (c4989d8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4989d8);
        }
        C4989d8[] c4989d8Arr = this.f97964b;
        if (c4989d8Arr != null && c4989d8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4989d8[] c4989d8Arr2 = this.f97964b;
                if (i10 >= c4989d8Arr2.length) {
                    break;
                }
                C4989d8 c4989d9 = c4989d8Arr2[i10];
                if (c4989d9 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4989d9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5245n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f97963a == null) {
                    this.f97963a = new C4989d8();
                }
                codedInputByteBufferNano.readMessage(this.f97963a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4989d8[] c4989d8Arr = this.f97964b;
                int length = c4989d8Arr == null ? 0 : c4989d8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4989d8[] c4989d8Arr2 = new C4989d8[i10];
                if (length != 0) {
                    System.arraycopy(c4989d8Arr, 0, c4989d8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4989d8 c4989d8 = new C4989d8();
                    c4989d8Arr2[length] = c4989d8;
                    codedInputByteBufferNano.readMessage(c4989d8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4989d8 c4989d9 = new C4989d8();
                c4989d8Arr2[length] = c4989d9;
                codedInputByteBufferNano.readMessage(c4989d9);
                this.f97964b = c4989d8Arr2;
            }
        }
        return this;
    }

    public static C5245n8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5245n8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5245n8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5245n8) MessageNano.mergeFrom(new C5245n8(), bArr);
    }
}
