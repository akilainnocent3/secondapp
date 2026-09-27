package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5159jo extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5159jo[] f97673b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5082go[] f97674a;

    public C5159jo() {
        a();
    }

    public static C5159jo[] b() {
        if (f97673b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97673b == null) {
                        f97673b = new C5159jo[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97673b;
    }

    public final C5159jo a() {
        this.f97674a = C5082go.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5082go[] c5082goArr = this.f97674a;
        if (c5082goArr != null && c5082goArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5082go[] c5082goArr2 = this.f97674a;
                if (i10 >= c5082goArr2.length) {
                    break;
                }
                C5082go c5082go = c5082goArr2[i10];
                if (c5082go != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5082go) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5082go[] c5082goArr = this.f97674a;
        if (c5082goArr != null && c5082goArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5082go[] c5082goArr2 = this.f97674a;
                if (i10 >= c5082goArr2.length) {
                    break;
                }
                C5082go c5082go = c5082goArr2[i10];
                if (c5082go != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5082go);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5159jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5082go[] c5082goArr = this.f97674a;
                int length = c5082goArr == null ? 0 : c5082goArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5082go[] c5082goArr2 = new C5082go[i10];
                if (length != 0) {
                    System.arraycopy(c5082goArr, 0, c5082goArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5082go c5082go = new C5082go();
                    c5082goArr2[length] = c5082go;
                    codedInputByteBufferNano.readMessage(c5082go);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5082go c5082go2 = new C5082go();
                c5082goArr2[length] = c5082go2;
                codedInputByteBufferNano.readMessage(c5082go2);
                this.f97674a = c5082goArr2;
            }
        }
        return this;
    }

    public static C5159jo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5159jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C5159jo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5159jo) MessageNano.mergeFrom(new C5159jo(), bArr);
    }
}
