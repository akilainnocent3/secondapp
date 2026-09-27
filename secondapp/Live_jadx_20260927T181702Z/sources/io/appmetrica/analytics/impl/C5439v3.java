package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5439v3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5439v3[] f98430c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5489x3 f98431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98432b;

    public C5439v3() {
        a();
    }

    public static C5439v3[] b() {
        if (f98430c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98430c == null) {
                        f98430c = new C5439v3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98430c;
    }

    public final C5439v3 a() {
        this.f98431a = null;
        this.f98432b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5489x3 c5489x3 = this.f98431a;
        if (c5489x3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5489x3);
        }
        int i10 = this.f98432b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5489x3 c5489x3 = this.f98431a;
        if (c5489x3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5489x3);
        }
        int i10 = this.f98432b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5439v3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f98431a == null) {
                    this.f98431a = new C5489x3();
                }
                codedInputByteBufferNano.readMessage(this.f98431a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f98432b = int32;
                }
            }
        }
        return this;
    }

    public static C5439v3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5439v3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5439v3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5439v3) MessageNano.mergeFrom(new C5439v3(), bArr);
    }
}
