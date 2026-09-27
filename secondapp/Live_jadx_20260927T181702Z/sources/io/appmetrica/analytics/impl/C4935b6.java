package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4935b6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4935b6[] f97004g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f97007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f97008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4909a6[] f97010f;

    public C4935b6() {
        a();
    }

    public static C4935b6[] b() {
        if (f97004g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97004g == null) {
                        f97004g = new C4935b6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97004g;
    }

    public final C4935b6 a() {
        this.f97005a = "";
        this.f97006b = 0;
        this.f97007c = 0L;
        this.f97008d = "";
        this.f97009e = 0;
        this.f97010f = C4909a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f97007c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f97006b) + CodedOutputByteBufferNano.computeStringSize(1, this.f97005a) + super.computeSerializedSize();
        if (!this.f97008d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f97008d);
        }
        int i10 = this.f97009e;
        if (i10 != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        C4909a6[] c4909a6Arr = this.f97010f;
        if (c4909a6Arr != null && c4909a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4909a6[] c4909a6Arr2 = this.f97010f;
                if (i11 >= c4909a6Arr2.length) {
                    break;
                }
                C4909a6 c4909a6 = c4909a6Arr2[i11];
                if (c4909a6 != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c4909a6) + iComputeSInt64Size;
                }
                i11++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f97005a);
        codedOutputByteBufferNano.writeSInt32(2, this.f97006b);
        codedOutputByteBufferNano.writeSInt64(3, this.f97007c);
        if (!this.f97008d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f97008d);
        }
        int i10 = this.f97009e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        C4909a6[] c4909a6Arr = this.f97010f;
        if (c4909a6Arr != null && c4909a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4909a6[] c4909a6Arr2 = this.f97010f;
                if (i11 >= c4909a6Arr2.length) {
                    break;
                }
                C4909a6 c4909a6 = c4909a6Arr2[i11];
                if (c4909a6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c4909a6);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4935b6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4935b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4935b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97005a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f97006b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f97007c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f97008d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f97009e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C4909a6[] c4909a6Arr = this.f97010f;
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
                this.f97010f = c4909a6Arr2;
            }
        }
        return this;
    }

    public static C4935b6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4935b6) MessageNano.mergeFrom(new C4935b6(), bArr);
    }
}
