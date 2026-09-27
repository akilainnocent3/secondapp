package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5334qm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5334qm[] f98207c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f98209b;

    public C5334qm() {
        a();
    }

    public static C5334qm[] b() {
        if (f98207c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98207c == null) {
                        f98207c = new C5334qm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98207c;
    }

    public final C5334qm a() {
        this.f98208a = "";
        this.f98209b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f98208a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f98208a);
        }
        String[] strArr = this.f98209b;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i10 = 0;
        int iComputeStringSizeNoTag = 0;
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f98209b;
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
        if (!this.f98208a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f98208a);
        }
        String[] strArr = this.f98209b;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f98209b;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5334qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f98208a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f98209b;
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
                this.f98209b = strArr2;
            }
        }
        return this;
    }

    public static C5334qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5334qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5334qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5334qm) MessageNano.mergeFrom(new C5334qm(), bArr);
    }
}
