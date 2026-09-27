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
public final class S5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile S5[] f96441d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4935b6 f96442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4935b6[] f96443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f96444c;

    public S5() {
        a();
    }

    public static S5[] b() {
        if (f96441d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96441d == null) {
                        f96441d = new S5[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96441d;
    }

    public final S5 a() {
        this.f96442a = null;
        this.f96443b = C4935b6.b();
        this.f96444c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4935b6 c4935b6 = this.f96442a;
        if (c4935b6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4935b6);
        }
        C4935b6[] c4935b6Arr = this.f96443b;
        if (c4935b6Arr != null && c4935b6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4935b6[] c4935b6Arr2 = this.f96443b;
                if (i10 >= c4935b6Arr2.length) {
                    break;
                }
                C4935b6 c4935b7 = c4935b6Arr2[i10];
                if (c4935b7 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4935b7) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return !this.f96444c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f96444c) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4935b6 c4935b6 = this.f96442a;
        if (c4935b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4935b6);
        }
        C4935b6[] c4935b6Arr = this.f96443b;
        if (c4935b6Arr != null && c4935b6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4935b6[] c4935b6Arr2 = this.f96443b;
                if (i10 >= c4935b6Arr2.length) {
                    break;
                }
                C4935b6 c4935b7 = c4935b6Arr2[i10];
                if (c4935b7 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4935b7);
                }
                i10++;
            }
        }
        if (!this.f96444c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f96444c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f96442a == null) {
                    this.f96442a = new C4935b6();
                }
                codedInputByteBufferNano.readMessage(this.f96442a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4935b6[] c4935b6Arr = this.f96443b;
                int length = c4935b6Arr == null ? 0 : c4935b6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4935b6[] c4935b6Arr2 = new C4935b6[i10];
                if (length != 0) {
                    System.arraycopy(c4935b6Arr, 0, c4935b6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4935b6 c4935b6 = new C4935b6();
                    c4935b6Arr2[length] = c4935b6;
                    codedInputByteBufferNano.readMessage(c4935b6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4935b6 c4935b7 = new C4935b6();
                c4935b6Arr2[length] = c4935b7;
                codedInputByteBufferNano.readMessage(c4935b7);
                this.f96443b = c4935b6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96444c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }
}
