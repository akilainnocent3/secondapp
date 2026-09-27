package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5082go extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f97469e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f97470f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f97471g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f97472h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C5082go[] f97473i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f97474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5108ho f97476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5133io f97477d;

    public C5082go() {
        a();
    }

    public static C5082go[] b() {
        if (f97473i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97473i == null) {
                        f97473i = new C5082go[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97473i;
    }

    public final C5082go a() {
        this.f97474a = WireFormatNano.EMPTY_BYTES;
        this.f97475b = 0;
        this.f97476c = null;
        this.f97477d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f97475b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f97474a) + super.computeSerializedSize();
        C5108ho c5108ho = this.f97476c;
        if (c5108ho != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c5108ho);
        }
        C5133io c5133io = this.f97477d;
        return c5133io != null ? CodedOutputByteBufferNano.computeMessageSize(4, c5133io) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f97474a);
        codedOutputByteBufferNano.writeInt32(2, this.f97475b);
        C5108ho c5108ho = this.f97476c;
        if (c5108ho != null) {
            codedOutputByteBufferNano.writeMessage(3, c5108ho);
        }
        C5133io c5133io = this.f97477d;
        if (c5133io != null) {
            codedOutputByteBufferNano.writeMessage(4, c5133io);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5082go mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97474a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f97475b = int32;
                }
            } else if (tag == 26) {
                if (this.f97476c == null) {
                    this.f97476c = new C5108ho();
                }
                codedInputByteBufferNano.readMessage(this.f97476c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f97477d == null) {
                    this.f97477d = new C5133io();
                }
                codedInputByteBufferNano.readMessage(this.f97477d);
            }
        }
        return this;
    }

    public static C5082go b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5082go().mergeFrom(codedInputByteBufferNano);
    }

    public static C5082go a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5082go) MessageNano.mergeFrom(new C5082go(), bArr);
    }
}
