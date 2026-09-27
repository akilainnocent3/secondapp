package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5344r8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5344r8[] f98224e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f98225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5066g8 f98226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f98227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5220m8 f98228d;

    public C5344r8() {
        a();
    }

    public static C5344r8[] b() {
        if (f98224e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98224e == null) {
                        f98224e = new C5344r8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98224e;
    }

    public final C5344r8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f98225a = bArr;
        this.f98226b = null;
        this.f98227c = bArr;
        this.f98228d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f98225a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f98225a);
        }
        C5066g8 c5066g8 = this.f98226b;
        if (c5066g8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5066g8);
        }
        if (!Arrays.equals(this.f98227c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f98227c);
        }
        C5220m8 c5220m8 = this.f98228d;
        return c5220m8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c5220m8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f98225a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f98225a);
        }
        C5066g8 c5066g8 = this.f98226b;
        if (c5066g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5066g8);
        }
        if (!Arrays.equals(this.f98227c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f98227c);
        }
        C5220m8 c5220m8 = this.f98228d;
        if (c5220m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5220m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5344r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f98225a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f98226b == null) {
                    this.f98226b = new C5066g8();
                }
                codedInputByteBufferNano.readMessage(this.f98226b);
            } else if (tag == 26) {
                this.f98227c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f98228d == null) {
                    this.f98228d = new C5220m8();
                }
                codedInputByteBufferNano.readMessage(this.f98228d);
            }
        }
        return this;
    }

    public static C5344r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5344r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5344r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5344r8) MessageNano.mergeFrom(new C5344r8(), bArr);
    }
}
