package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95032c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f95033d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f95034e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile d[] f95035f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c[] f95036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f95037b;

    public d() {
        a();
    }

    public static d[] b() {
        if (f95035f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95035f == null) {
                        f95035f = new d[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95035f;
    }

    public final d a() {
        this.f95036a = c.b();
        this.f95037b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        c[] cVarArr = this.f95036a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                c[] cVarArr2 = this.f95036a;
                if (i10 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i10];
                if (cVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, cVar) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f95037b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        c[] cVarArr = this.f95036a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                c[] cVarArr2 = this.f95036a;
                if (i10 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i10];
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, cVar);
                }
                i10++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f95037b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                c[] cVarArr = this.f95036a;
                int length = cVarArr == null ? 0 : cVarArr.length;
                int i10 = repeatedFieldArrayLength + length;
                c[] cVarArr2 = new c[i10];
                if (length != 0) {
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    c cVar = new c();
                    cVarArr2[length] = cVar;
                    codedInputByteBufferNano.readMessage(cVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                c cVar2 = new c();
                cVarArr2[length] = cVar2;
                codedInputByteBufferNano.readMessage(cVar2);
                this.f95036a = cVarArr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f95037b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static d b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new d().mergeFrom(codedInputByteBufferNano);
    }

    public static d a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (d) MessageNano.mergeFrom(new d(), bArr);
    }
}
