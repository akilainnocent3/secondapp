package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class O extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile O[] f99038d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f99039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f99040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f99041c;

    public O() {
        a();
    }

    public static O[] b() {
        if (f99038d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f99038d == null) {
                        f99038d = new O[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f99038d;
    }

    public final O a() {
        this.f99039a = true;
        this.f99040b = 5L;
        this.f99041c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f99039a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        long j10 = this.f99040b;
        if (j10 != 5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j10);
        }
        String[] strArr = this.f99041c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i10 = 0;
        int iComputeStringSizeNoTag = 0;
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f99041c;
            if (i10 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i11;
            }
            String str = strArr2[i10];
            if (str != null) {
                i11++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f99039a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        long j10 = this.f99040b;
        if (j10 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        String[] strArr = this.f99041c;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f99041c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f99039a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f99040b = codedInputByteBufferNano.readInt64();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f99041c;
                int length = strArr == null ? 0 : strArr.length;
                int i10 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i10];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i10 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f99041c = strArr2;
            }
        }
        return this;
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
