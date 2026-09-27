package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5284om extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5284om[] f98085b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5259nm[] f98086a;

    public C5284om() {
        a();
    }

    public static C5284om[] b() {
        if (f98085b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98085b == null) {
                        f98085b = new C5284om[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98085b;
    }

    public final C5284om a() {
        this.f98086a = C5259nm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5259nm[] c5259nmArr = this.f98086a;
        if (c5259nmArr != null && c5259nmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5259nm[] c5259nmArr2 = this.f98086a;
                if (i10 >= c5259nmArr2.length) {
                    break;
                }
                C5259nm c5259nm = c5259nmArr2[i10];
                if (c5259nm != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5259nm) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5259nm[] c5259nmArr = this.f98086a;
        if (c5259nmArr != null && c5259nmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5259nm[] c5259nmArr2 = this.f98086a;
                if (i10 >= c5259nmArr2.length) {
                    break;
                }
                C5259nm c5259nm = c5259nmArr2[i10];
                if (c5259nm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5259nm);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5284om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5259nm[] c5259nmArr = this.f98086a;
                int length = c5259nmArr == null ? 0 : c5259nmArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5259nm[] c5259nmArr2 = new C5259nm[i10];
                if (length != 0) {
                    System.arraycopy(c5259nmArr, 0, c5259nmArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5259nm c5259nm = new C5259nm();
                    c5259nmArr2[length] = c5259nm;
                    codedInputByteBufferNano.readMessage(c5259nm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5259nm c5259nm2 = new C5259nm();
                c5259nmArr2[length] = c5259nm2;
                codedInputByteBufferNano.readMessage(c5259nm2);
                this.f98086a = c5259nmArr2;
            }
        }
        return this;
    }

    public static C5284om b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5284om().mergeFrom(codedInputByteBufferNano);
    }

    public static C5284om a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5284om) MessageNano.mergeFrom(new C5284om(), bArr);
    }
}
