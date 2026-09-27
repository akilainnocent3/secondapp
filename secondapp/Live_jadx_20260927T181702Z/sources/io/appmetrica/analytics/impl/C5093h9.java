package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5093h9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f97494d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f97495e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f97496f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f97497g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f97498h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f97499i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f97500j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f97501k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f97502l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f97503m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f97504n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f97505o = 11;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f97506p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile C5093h9[] f97507q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f97508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5067g9 f97509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5041f9[] f97510c;

    public C5093h9() {
        a();
    }

    public static C5093h9[] b() {
        if (f97507q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97507q == null) {
                        f97507q = new C5093h9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97507q;
    }

    public final C5093h9 a() {
        this.f97508a = 0L;
        this.f97509b = null;
        this.f97510c = C5041f9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f97508a) + super.computeSerializedSize();
        C5067g9 c5067g9 = this.f97509b;
        if (c5067g9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c5067g9);
        }
        C5041f9[] c5041f9Arr = this.f97510c;
        if (c5041f9Arr != null && c5041f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5041f9[] c5041f9Arr2 = this.f97510c;
                if (i10 >= c5041f9Arr2.length) {
                    break;
                }
                C5041f9 c5041f9 = c5041f9Arr2[i10];
                if (c5041f9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c5041f9) + iComputeUInt64Size;
                }
                i10++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f97508a);
        C5067g9 c5067g9 = this.f97509b;
        if (c5067g9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5067g9);
        }
        C5041f9[] c5041f9Arr = this.f97510c;
        if (c5041f9Arr != null && c5041f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5041f9[] c5041f9Arr2 = this.f97510c;
                if (i10 >= c5041f9Arr2.length) {
                    break;
                }
                C5041f9 c5041f9 = c5041f9Arr2[i10];
                if (c5041f9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5041f9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5093h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f97508a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f97509b == null) {
                    this.f97509b = new C5067g9();
                }
                codedInputByteBufferNano.readMessage(this.f97509b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5041f9[] c5041f9Arr = this.f97510c;
                int length = c5041f9Arr == null ? 0 : c5041f9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5041f9[] c5041f9Arr2 = new C5041f9[i10];
                if (length != 0) {
                    System.arraycopy(c5041f9Arr, 0, c5041f9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5041f9 c5041f9 = new C5041f9();
                    c5041f9Arr2[length] = c5041f9;
                    codedInputByteBufferNano.readMessage(c5041f9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5041f9 c5041f10 = new C5041f9();
                c5041f9Arr2[length] = c5041f10;
                codedInputByteBufferNano.readMessage(c5041f10);
                this.f97510c = c5041f9Arr2;
            }
        }
        return this;
    }

    public static C5093h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5093h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5093h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5093h9) MessageNano.mergeFrom(new C5093h9(), bArr);
    }
}
