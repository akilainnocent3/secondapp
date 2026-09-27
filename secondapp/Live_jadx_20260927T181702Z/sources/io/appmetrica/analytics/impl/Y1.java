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
public final class Y1 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Y1[] f96786d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X1[] f96787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W1 f96788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f96789c;

    public Y1() {
        a();
    }

    public static Y1[] b() {
        if (f96786d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96786d == null) {
                        f96786d = new Y1[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96786d;
    }

    public final Y1 a() {
        this.f96787a = X1.b();
        this.f96788b = null;
        this.f96789c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        X1[] x1Arr = this.f96787a;
        int i10 = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                X1[] x1Arr2 = this.f96787a;
                if (i11 >= x1Arr2.length) {
                    break;
                }
                X1 x10 = x1Arr2[i11];
                if (x10 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, x10) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        W1 w10 = this.f96788b;
        if (w10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, w10);
        }
        String[] strArr = this.f96789c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f96789c;
            if (i10 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i12;
            }
            String str = strArr2[i10];
            if (str != null) {
                i12++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        X1[] x1Arr = this.f96787a;
        int i10 = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                X1[] x1Arr2 = this.f96787a;
                if (i11 >= x1Arr2.length) {
                    break;
                }
                X1 x10 = x1Arr2[i11];
                if (x10 != null) {
                    codedOutputByteBufferNano.writeMessage(1, x10);
                }
                i11++;
            }
        }
        W1 w10 = this.f96788b;
        if (w10 != null) {
            codedOutputByteBufferNano.writeMessage(2, w10);
        }
        String[] strArr = this.f96789c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f96789c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                X1[] x1Arr = this.f96787a;
                int length = x1Arr == null ? 0 : x1Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                X1[] x1Arr2 = new X1[i10];
                if (length != 0) {
                    System.arraycopy(x1Arr, 0, x1Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    X1 x10 = new X1();
                    x1Arr2[length] = x10;
                    codedInputByteBufferNano.readMessage(x10);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                X1 x11 = new X1();
                x1Arr2[length] = x11;
                codedInputByteBufferNano.readMessage(x11);
                this.f96787a = x1Arr2;
            } else if (tag == 18) {
                if (this.f96788b == null) {
                    this.f96788b = new W1();
                }
                codedInputByteBufferNano.readMessage(this.f96788b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f96789c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i11];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f96789c = strArr2;
            }
        }
        return this;
    }

    public static Y1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y1().mergeFrom(codedInputByteBufferNano);
    }

    public static Y1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y1) MessageNano.mergeFrom(new Y1(), bArr);
    }
}
