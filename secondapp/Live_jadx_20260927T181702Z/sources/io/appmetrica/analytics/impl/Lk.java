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
public final class Lk extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Lk[] f96119b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mk[] f96120a;

    public Lk() {
        a();
    }

    public static Lk[] b() {
        if (f96119b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96119b == null) {
                        f96119b = new Lk[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96119b;
    }

    public final Lk a() {
        this.f96120a = Mk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Mk[] mkArr = this.f96120a;
        if (mkArr != null && mkArr.length > 0) {
            int i10 = 0;
            while (true) {
                Mk[] mkArr2 = this.f96120a;
                if (i10 >= mkArr2.length) {
                    break;
                }
                Mk mk2 = mkArr2[i10];
                if (mk2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, mk2) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Mk[] mkArr = this.f96120a;
        if (mkArr != null && mkArr.length > 0) {
            int i10 = 0;
            while (true) {
                Mk[] mkArr2 = this.f96120a;
                if (i10 >= mkArr2.length) {
                    break;
                }
                Mk mk2 = mkArr2[i10];
                if (mk2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, mk2);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                Mk[] mkArr = this.f96120a;
                int length = mkArr == null ? 0 : mkArr.length;
                int i10 = repeatedFieldArrayLength + length;
                Mk[] mkArr2 = new Mk[i10];
                if (length != 0) {
                    System.arraycopy(mkArr, 0, mkArr2, 0, length);
                }
                while (length < i10 - 1) {
                    Mk mk2 = new Mk();
                    mkArr2[length] = mk2;
                    codedInputByteBufferNano.readMessage(mk2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Mk mk3 = new Mk();
                mkArr2[length] = mk3;
                codedInputByteBufferNano.readMessage(mk3);
                this.f96120a = mkArr2;
            }
        }
        return this;
    }

    public static Lk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Lk().mergeFrom(codedInputByteBufferNano);
    }

    public static Lk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Lk) MessageNano.mergeFrom(new Lk(), bArr);
    }
}
