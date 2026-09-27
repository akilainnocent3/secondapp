package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5514y3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98640c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f98641d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f98642e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f98643f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5514y3[] f98644g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5439v3 f98645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5439v3[] f98646b;

    public C5514y3() {
        a();
    }

    public static C5514y3[] b() {
        if (f98644g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98644g == null) {
                        f98644g = new C5514y3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98644g;
    }

    public final C5514y3 a() {
        this.f98645a = null;
        this.f98646b = C5439v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5439v3 c5439v3 = this.f98645a;
        if (c5439v3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5439v3);
        }
        C5439v3[] c5439v3Arr = this.f98646b;
        if (c5439v3Arr != null && c5439v3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5439v3[] c5439v3Arr2 = this.f98646b;
                if (i10 >= c5439v3Arr2.length) {
                    break;
                }
                C5439v3 c5439v4 = c5439v3Arr2[i10];
                if (c5439v4 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5439v4) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5439v3 c5439v3 = this.f98645a;
        if (c5439v3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5439v3);
        }
        C5439v3[] c5439v3Arr = this.f98646b;
        if (c5439v3Arr != null && c5439v3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5439v3[] c5439v3Arr2 = this.f98646b;
                if (i10 >= c5439v3Arr2.length) {
                    break;
                }
                C5439v3 c5439v4 = c5439v3Arr2[i10];
                if (c5439v4 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5439v4);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5514y3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f98645a == null) {
                    this.f98645a = new C5439v3();
                }
                codedInputByteBufferNano.readMessage(this.f98645a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5439v3[] c5439v3Arr = this.f98646b;
                int length = c5439v3Arr == null ? 0 : c5439v3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5439v3[] c5439v3Arr2 = new C5439v3[i10];
                if (length != 0) {
                    System.arraycopy(c5439v3Arr, 0, c5439v3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5439v3 c5439v3 = new C5439v3();
                    c5439v3Arr2[length] = c5439v3;
                    codedInputByteBufferNano.readMessage(c5439v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5439v3 c5439v4 = new C5439v3();
                c5439v3Arr2[length] = c5439v4;
                codedInputByteBufferNano.readMessage(c5439v4);
                this.f98646b = c5439v3Arr2;
            }
        }
        return this;
    }

    public static C5514y3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5514y3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5514y3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5514y3) MessageNano.mergeFrom(new C5514y3(), bArr);
    }
}
