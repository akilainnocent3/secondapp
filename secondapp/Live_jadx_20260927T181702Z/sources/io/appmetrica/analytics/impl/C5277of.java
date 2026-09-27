package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5277of extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98067c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f98068d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f98069e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f98070f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5277of[] f98071g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5227mf f98072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5252nf[] f98073b;

    public C5277of() {
        a();
    }

    public static C5277of[] b() {
        if (f98071g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98071g == null) {
                        f98071g = new C5277of[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98071g;
    }

    public final C5277of a() {
        this.f98072a = null;
        this.f98073b = C5252nf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5227mf c5227mf = this.f98072a;
        if (c5227mf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5227mf);
        }
        C5252nf[] c5252nfArr = this.f98073b;
        if (c5252nfArr != null && c5252nfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5252nf[] c5252nfArr2 = this.f98073b;
                if (i10 >= c5252nfArr2.length) {
                    break;
                }
                C5252nf c5252nf = c5252nfArr2[i10];
                if (c5252nf != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5252nf) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5227mf c5227mf = this.f98072a;
        if (c5227mf != null) {
            codedOutputByteBufferNano.writeMessage(1, c5227mf);
        }
        C5252nf[] c5252nfArr = this.f98073b;
        if (c5252nfArr != null && c5252nfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5252nf[] c5252nfArr2 = this.f98073b;
                if (i10 >= c5252nfArr2.length) {
                    break;
                }
                C5252nf c5252nf = c5252nfArr2[i10];
                if (c5252nf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5252nf);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5277of mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f98072a == null) {
                    this.f98072a = new C5227mf();
                }
                codedInputByteBufferNano.readMessage(this.f98072a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5252nf[] c5252nfArr = this.f98073b;
                int length = c5252nfArr == null ? 0 : c5252nfArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5252nf[] c5252nfArr2 = new C5252nf[i10];
                if (length != 0) {
                    System.arraycopy(c5252nfArr, 0, c5252nfArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5252nf c5252nf = new C5252nf();
                    c5252nfArr2[length] = c5252nf;
                    codedInputByteBufferNano.readMessage(c5252nf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5252nf c5252nf2 = new C5252nf();
                c5252nfArr2[length] = c5252nf2;
                codedInputByteBufferNano.readMessage(c5252nf2);
                this.f98073b = c5252nfArr2;
            }
        }
        return this;
    }

    public static C5277of b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5277of().mergeFrom(codedInputByteBufferNano);
    }

    public static C5277of a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5277of) MessageNano.mergeFrom(new C5277of(), bArr);
    }
}
