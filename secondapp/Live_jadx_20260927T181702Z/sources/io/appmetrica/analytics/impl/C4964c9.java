package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4964c9 extends MessageNano {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C4964c9[] f97069n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f97071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f97072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f97074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f97075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f97076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f97077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f97078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f97079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f97080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C4938b9[] f97081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f97082m;

    public C4964c9() {
        a();
    }

    public static C4964c9[] b() {
        if (f97069n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97069n == null) {
                        f97069n = new C4964c9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97069n;
    }

    public final C4964c9 a() {
        this.f97070a = "";
        this.f97071b = "";
        this.f97072c = "";
        this.f97073d = 0;
        this.f97074e = "";
        this.f97075f = "";
        this.f97076g = false;
        this.f97077h = 0;
        this.f97078i = "";
        this.f97079j = "";
        this.f97080k = 0;
        this.f97081l = C4938b9.b();
        this.f97082m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f97070a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f97070a);
        }
        if (!this.f97071b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f97071b);
        }
        if (!this.f97072c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f97072c);
        }
        int i10 = this.f97073d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        if (!this.f97074e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f97074e);
        }
        if (!this.f97075f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f97075f);
        }
        boolean z10 = this.f97076g;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        int i11 = this.f97077h;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i11);
        }
        if (!this.f97078i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f97078i);
        }
        if (!this.f97079j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f97079j);
        }
        int i12 = this.f97080k;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i12);
        }
        C4938b9[] c4938b9Arr = this.f97081l;
        if (c4938b9Arr != null && c4938b9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4938b9[] c4938b9Arr2 = this.f97081l;
                if (i13 >= c4938b9Arr2.length) {
                    break;
                }
                C4938b9 c4938b9 = c4938b9Arr2[i13];
                if (c4938b9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c4938b9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return !this.f97082m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f97082m) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f97070a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f97070a);
        }
        if (!this.f97071b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f97071b);
        }
        if (!this.f97072c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f97072c);
        }
        int i10 = this.f97073d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        if (!this.f97074e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f97074e);
        }
        if (!this.f97075f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f97075f);
        }
        boolean z10 = this.f97076g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        int i11 = this.f97077h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i11);
        }
        if (!this.f97078i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f97078i);
        }
        if (!this.f97079j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f97079j);
        }
        int i12 = this.f97080k;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i12);
        }
        C4938b9[] c4938b9Arr = this.f97081l;
        if (c4938b9Arr != null && c4938b9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4938b9[] c4938b9Arr2 = this.f97081l;
                if (i13 >= c4938b9Arr2.length) {
                    break;
                }
                C4938b9 c4938b9 = c4938b9Arr2[i13];
                if (c4938b9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c4938b9);
                }
                i13++;
            }
        }
        if (!this.f97082m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f97082m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4964c9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4964c9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4964c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f97070a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f97071b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f97072c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f97073d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f97074e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f97075f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f97076g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f97077h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f97078i = codedInputByteBufferNano.readString();
                    break;
                case jj.c.f100514f /* 170 */:
                    this.f97079j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f97080k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C4938b9[] c4938b9Arr = this.f97081l;
                    int length = c4938b9Arr == null ? 0 : c4938b9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4938b9[] c4938b9Arr2 = new C4938b9[i10];
                    if (length != 0) {
                        System.arraycopy(c4938b9Arr, 0, c4938b9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4938b9 c4938b9 = new C4938b9();
                        c4938b9Arr2[length] = c4938b9;
                        codedInputByteBufferNano.readMessage(c4938b9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4938b9 c4938b10 = new C4938b9();
                    c4938b9Arr2[length] = c4938b10;
                    codedInputByteBufferNano.readMessage(c4938b10);
                    this.f97081l = c4938b9Arr2;
                    break;
                case 194:
                    this.f97082m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C4964c9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4964c9) MessageNano.mergeFrom(new C4964c9(), bArr);
    }
}
