package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5445v9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5445v9[] f98457e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f98458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f98461d;

    public C5445v9() {
        a();
    }

    public static C5445v9[] b() {
        if (f98457e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98457e == null) {
                        f98457e = new C5445v9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98457e;
    }

    public final C5445v9 a() {
        this.f98458a = false;
        this.f98459b = 0;
        this.f98460c = 0;
        this.f98461d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f98460c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f98459b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f98458a) + super.computeSerializedSize();
        int[] iArr = this.f98461d;
        if (iArr == null || iArr.length <= 0) {
            return iComputeUInt32Size;
        }
        int i10 = 0;
        int iComputeInt32SizeNoTag = 0;
        while (true) {
            int[] iArr2 = this.f98461d;
            if (i10 >= iArr2.length) {
                return iComputeUInt32Size + iComputeInt32SizeNoTag + iArr2.length;
            }
            iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i10]);
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f98458a);
        codedOutputByteBufferNano.writeUInt32(2, this.f98459b);
        codedOutputByteBufferNano.writeUInt32(3, this.f98460c);
        int[] iArr = this.f98461d;
        if (iArr != null && iArr.length > 0) {
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.f98461d;
                if (i10 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i10]);
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5445v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f98458a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f98459b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 24) {
                this.f98460c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f98461d;
                int length = iArr == null ? 0 : iArr.length;
                int i10 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i10];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i10 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f98461d = iArr2;
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i11 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i11++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f98461d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i12 = i11 + length2;
                int[] iArr4 = new int[i12];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i12) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f98461d = iArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            }
        }
        return this;
    }

    public static C5445v9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5445v9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5445v9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5445v9) MessageNano.mergeFrom(new C5445v9(), bArr);
    }
}
