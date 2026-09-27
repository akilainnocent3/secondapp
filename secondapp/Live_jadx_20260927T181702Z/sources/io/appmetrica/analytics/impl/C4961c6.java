package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4961c6 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4961c6[] f97061f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f97063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4909a6[] f97064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4961c6 f97065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4961c6[] f97066e;

    public C4961c6() {
        a();
    }

    public static C4961c6[] b() {
        if (f97061f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97061f == null) {
                        f97061f = new C4961c6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97061f;
    }

    public final C4961c6 a() {
        this.f97062a = "";
        this.f97063b = "";
        this.f97064c = C4909a6.b();
        this.f97065d = null;
        this.f97066e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f97062a) + super.computeSerializedSize();
        if (!this.f97063b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f97063b);
        }
        C4909a6[] c4909a6Arr = this.f97064c;
        int i10 = 0;
        if (c4909a6Arr != null && c4909a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4909a6[] c4909a6Arr2 = this.f97064c;
                if (i11 >= c4909a6Arr2.length) {
                    break;
                }
                C4909a6 c4909a6 = c4909a6Arr2[i11];
                if (c4909a6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c4909a6) + iComputeStringSize;
                }
                i11++;
            }
        }
        C4961c6 c4961c6 = this.f97065d;
        if (c4961c6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c4961c6);
        }
        C4961c6[] c4961c6Arr = this.f97066e;
        if (c4961c6Arr != null && c4961c6Arr.length > 0) {
            while (true) {
                C4961c6[] c4961c6Arr2 = this.f97066e;
                if (i10 >= c4961c6Arr2.length) {
                    break;
                }
                C4961c6 c4961c7 = c4961c6Arr2[i10];
                if (c4961c7 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c4961c7) + iComputeStringSize;
                }
                i10++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f97062a);
        if (!this.f97063b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f97063b);
        }
        C4909a6[] c4909a6Arr = this.f97064c;
        int i10 = 0;
        if (c4909a6Arr != null && c4909a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4909a6[] c4909a6Arr2 = this.f97064c;
                if (i11 >= c4909a6Arr2.length) {
                    break;
                }
                C4909a6 c4909a6 = c4909a6Arr2[i11];
                if (c4909a6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4909a6);
                }
                i11++;
            }
        }
        C4961c6 c4961c6 = this.f97065d;
        if (c4961c6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4961c6);
        }
        C4961c6[] c4961c6Arr = this.f97066e;
        if (c4961c6Arr != null && c4961c6Arr.length > 0) {
            while (true) {
                C4961c6[] c4961c6Arr2 = this.f97066e;
                if (i10 >= c4961c6Arr2.length) {
                    break;
                }
                C4961c6 c4961c7 = c4961c6Arr2[i10];
                if (c4961c7 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4961c7);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4961c6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4961c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4961c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97062a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f97063b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4909a6[] c4909a6Arr = this.f97064c;
                int length = c4909a6Arr == null ? 0 : c4909a6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4909a6[] c4909a6Arr2 = new C4909a6[i10];
                if (length != 0) {
                    System.arraycopy(c4909a6Arr, 0, c4909a6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4909a6 c4909a6 = new C4909a6();
                    c4909a6Arr2[length] = c4909a6;
                    codedInputByteBufferNano.readMessage(c4909a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4909a6 c4909a7 = new C4909a6();
                c4909a6Arr2[length] = c4909a7;
                codedInputByteBufferNano.readMessage(c4909a7);
                this.f97064c = c4909a6Arr2;
            } else if (tag == 34) {
                if (this.f97065d == null) {
                    this.f97065d = new C4961c6();
                }
                codedInputByteBufferNano.readMessage(this.f97065d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C4961c6[] c4961c6Arr = this.f97066e;
                int length2 = c4961c6Arr == null ? 0 : c4961c6Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                C4961c6[] c4961c6Arr2 = new C4961c6[i11];
                if (length2 != 0) {
                    System.arraycopy(c4961c6Arr, 0, c4961c6Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    C4961c6 c4961c6 = new C4961c6();
                    c4961c6Arr2[length2] = c4961c6;
                    codedInputByteBufferNano.readMessage(c4961c6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4961c6 c4961c7 = new C4961c6();
                c4961c6Arr2[length2] = c4961c7;
                codedInputByteBufferNano.readMessage(c4961c7);
                this.f97066e = c4961c6Arr2;
            }
        }
        return this;
    }

    public static C4961c6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4961c6) MessageNano.mergeFrom(new C4961c6(), bArr);
    }
}
