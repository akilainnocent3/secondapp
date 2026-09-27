package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5118i8 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C5118i8[] f97565f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f97566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f97567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5220m8 f97568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5143j8[] f97569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97570e;

    public C5118i8() {
        a();
    }

    public static C5118i8[] b() {
        if (f97565f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97565f == null) {
                        f97565f = new C5118i8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97565f;
    }

    public final C5118i8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f97566a = bArr;
        this.f97567b = bArr;
        this.f97568c = null;
        this.f97569d = C5143j8.b();
        this.f97570e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f97566a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f97566a);
        }
        if (!Arrays.equals(this.f97567b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f97567b);
        }
        C5220m8 c5220m8 = this.f97568c;
        if (c5220m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5220m8);
        }
        C5143j8[] c5143j8Arr = this.f97569d;
        if (c5143j8Arr != null && c5143j8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5143j8[] c5143j8Arr2 = this.f97569d;
                if (i10 >= c5143j8Arr2.length) {
                    break;
                }
                C5143j8 c5143j8 = c5143j8Arr2[i10];
                if (c5143j8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c5143j8) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        int i11 = this.f97570e;
        return i11 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f97566a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f97566a);
        }
        if (!Arrays.equals(this.f97567b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f97567b);
        }
        C5220m8 c5220m8 = this.f97568c;
        if (c5220m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5220m8);
        }
        C5143j8[] c5143j8Arr = this.f97569d;
        if (c5143j8Arr != null && c5143j8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5143j8[] c5143j8Arr2 = this.f97569d;
                if (i10 >= c5143j8Arr2.length) {
                    break;
                }
                C5143j8 c5143j8 = c5143j8Arr2[i10];
                if (c5143j8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c5143j8);
                }
                i10++;
            }
        }
        int i11 = this.f97570e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5118i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5118i8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5118i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97566a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f97567b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f97568c == null) {
                    this.f97568c = new C5220m8();
                }
                codedInputByteBufferNano.readMessage(this.f97568c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C5143j8[] c5143j8Arr = this.f97569d;
                int length = c5143j8Arr == null ? 0 : c5143j8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5143j8[] c5143j8Arr2 = new C5143j8[i10];
                if (length != 0) {
                    System.arraycopy(c5143j8Arr, 0, c5143j8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5143j8 c5143j8 = new C5143j8();
                    c5143j8Arr2[length] = c5143j8;
                    codedInputByteBufferNano.readMessage(c5143j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5143j8 c5143j9 = new C5143j8();
                c5143j8Arr2[length] = c5143j9;
                codedInputByteBufferNano.readMessage(c5143j9);
                this.f97569d = c5143j8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97570e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5118i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5118i8) MessageNano.mergeFrom(new C5118i8(), bArr);
    }
}
