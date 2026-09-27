package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5220m8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5220m8[] f97891c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5195l8[] f97892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97893b;

    public C5220m8() {
        a();
    }

    public static C5220m8[] b() {
        if (f97891c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97891c == null) {
                        f97891c = new C5220m8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97891c;
    }

    public final C5220m8 a() {
        this.f97892a = C5195l8.b();
        this.f97893b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5195l8[] c5195l8Arr = this.f97892a;
        if (c5195l8Arr != null && c5195l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5195l8[] c5195l8Arr2 = this.f97892a;
                if (i10 >= c5195l8Arr2.length) {
                    break;
                }
                C5195l8 c5195l8 = c5195l8Arr2[i10];
                if (c5195l8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5195l8) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        int i11 = this.f97893b;
        return i11 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5195l8[] c5195l8Arr = this.f97892a;
        if (c5195l8Arr != null && c5195l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5195l8[] c5195l8Arr2 = this.f97892a;
                if (i10 >= c5195l8Arr2.length) {
                    break;
                }
                C5195l8 c5195l8 = c5195l8Arr2[i10];
                if (c5195l8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5195l8);
                }
                i10++;
            }
        }
        int i11 = this.f97893b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5220m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5195l8[] c5195l8Arr = this.f97892a;
                int length = c5195l8Arr == null ? 0 : c5195l8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5195l8[] c5195l8Arr2 = new C5195l8[i10];
                if (length != 0) {
                    System.arraycopy(c5195l8Arr, 0, c5195l8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5195l8 c5195l8 = new C5195l8();
                    c5195l8Arr2[length] = c5195l8;
                    codedInputByteBufferNano.readMessage(c5195l8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5195l8 c5195l9 = new C5195l8();
                c5195l8Arr2[length] = c5195l9;
                codedInputByteBufferNano.readMessage(c5195l9);
                this.f97892a = c5195l8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97893b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5220m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5220m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5220m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5220m8) MessageNano.mergeFrom(new C5220m8(), bArr);
    }
}
