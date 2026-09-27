package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5508xm extends MessageNano {
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 1;
    public static volatile C5508xm[] G;
    public C5458vm A;
    public C5408tm[] B;
    public C5358rm C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f98597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f98598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f98599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f98600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f98601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f98602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5334qm[] f98603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5383sm f98604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f98605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f98606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f98607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f98608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f98609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f98610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C5483wm f98611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f98612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f98613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f98614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f98615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f98616u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C5433um f98617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f98618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f98619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C5309pm f98620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C5284om f98621z;

    public C5508xm() {
        a();
    }

    public static C5508xm[] b() {
        if (G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (G == null) {
                        G = new C5508xm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return G;
    }

    public final C5508xm a() {
        this.f98596a = "";
        this.f98597b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f98598c = strArr;
        this.f98599d = "";
        this.f98600e = "";
        this.f98601f = strArr;
        this.f98602g = strArr;
        this.f98603h = C5334qm.b();
        this.f98604i = null;
        this.f98605j = "";
        this.f98606k = "";
        this.f98607l = "";
        this.f98608m = false;
        this.f98609n = "";
        this.f98610o = strArr;
        this.f98611p = null;
        this.f98612q = false;
        this.f98613r = "";
        this.f98614s = 0L;
        this.f98615t = 0L;
        this.f98616u = false;
        this.f98617v = null;
        this.f98618w = 600;
        this.f98619x = 1;
        this.f98620y = null;
        this.f98621z = null;
        this.A = null;
        this.B = C5408tm.b();
        this.C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f98596a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f98596a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f98597b) + iComputeSerializedSize;
        String[] strArr = this.f98598c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int iComputeStringSizeNoTag = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f98598c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    i12++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i11++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i12;
        }
        if (!this.f98599d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f98599d);
        }
        if (!this.f98600e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f98600e);
        }
        String[] strArr3 = this.f98601f;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f98601f;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    i14++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i13++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i14;
        }
        String[] strArr5 = this.f98602g;
        if (strArr5 != null && strArr5.length > 0) {
            int i15 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr6 = this.f98602g;
                if (i15 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i15];
                if (str3 != null) {
                    i16++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i15++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i16;
        }
        C5334qm[] c5334qmArr = this.f98603h;
        if (c5334qmArr != null && c5334qmArr.length > 0) {
            int i17 = 0;
            while (true) {
                C5334qm[] c5334qmArr2 = this.f98603h;
                if (i17 >= c5334qmArr2.length) {
                    break;
                }
                C5334qm c5334qm = c5334qmArr2[i17];
                if (c5334qm != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c5334qm) + iComputeInt64Size;
                }
                i17++;
            }
        }
        C5383sm c5383sm = this.f98604i;
        if (c5383sm != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c5383sm);
        }
        if (!this.f98605j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f98605j);
        }
        if (!this.f98606k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f98606k);
        }
        if (!this.f98607l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f98607l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f98608m) + iComputeInt64Size;
        if (!this.f98609n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f98609n);
        }
        String[] strArr7 = this.f98610o;
        if (strArr7 != null && strArr7.length > 0) {
            int i18 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr8 = this.f98610o;
                if (i18 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i18];
                if (str4 != null) {
                    i19++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i18++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i19;
        }
        C5483wm c5483wm = this.f98611p;
        if (c5483wm != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c5483wm);
        }
        boolean z10 = this.f98612q;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        if (!this.f98613r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f98613r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f98615t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f98614s) + iComputeBoolSize;
        boolean z11 = this.f98616u;
        if (z11) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z11);
        }
        C5433um c5433um = this.f98617v;
        if (c5433um != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c5433um);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f98619x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f98618w) + iComputeInt64Size2;
        C5309pm c5309pm = this.f98620y;
        if (c5309pm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c5309pm);
        }
        C5284om c5284om = this.f98621z;
        if (c5284om != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c5284om);
        }
        C5458vm c5458vm = this.A;
        if (c5458vm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c5458vm);
        }
        C5408tm[] c5408tmArr = this.B;
        if (c5408tmArr != null && c5408tmArr.length > 0) {
            while (true) {
                C5408tm[] c5408tmArr2 = this.B;
                if (i10 >= c5408tmArr2.length) {
                    break;
                }
                C5408tm c5408tm = c5408tmArr2[i10];
                if (c5408tm != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c5408tm) + iComputeInt32Size;
                }
                i10++;
            }
        }
        C5358rm c5358rm = this.C;
        return c5358rm != null ? CodedOutputByteBufferNano.computeMessageSize(32, c5358rm) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f98596a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f98596a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f98597b);
        String[] strArr = this.f98598c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f98598c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i11++;
            }
        }
        if (!this.f98599d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f98599d);
        }
        if (!this.f98600e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f98600e);
        }
        String[] strArr3 = this.f98601f;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f98601f;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i12++;
            }
        }
        String[] strArr5 = this.f98602g;
        if (strArr5 != null && strArr5.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f98602g;
                if (i13 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i13];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i13++;
            }
        }
        C5334qm[] c5334qmArr = this.f98603h;
        if (c5334qmArr != null && c5334qmArr.length > 0) {
            int i14 = 0;
            while (true) {
                C5334qm[] c5334qmArr2 = this.f98603h;
                if (i14 >= c5334qmArr2.length) {
                    break;
                }
                C5334qm c5334qm = c5334qmArr2[i14];
                if (c5334qm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c5334qm);
                }
                i14++;
            }
        }
        C5383sm c5383sm = this.f98604i;
        if (c5383sm != null) {
            codedOutputByteBufferNano.writeMessage(9, c5383sm);
        }
        if (!this.f98605j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f98605j);
        }
        if (!this.f98606k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f98606k);
        }
        if (!this.f98607l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f98607l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f98608m);
        if (!this.f98609n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f98609n);
        }
        String[] strArr7 = this.f98610o;
        if (strArr7 != null && strArr7.length > 0) {
            int i15 = 0;
            while (true) {
                String[] strArr8 = this.f98610o;
                if (i15 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i15];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i15++;
            }
        }
        C5483wm c5483wm = this.f98611p;
        if (c5483wm != null) {
            codedOutputByteBufferNano.writeMessage(16, c5483wm);
        }
        boolean z10 = this.f98612q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        if (!this.f98613r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f98613r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f98614s);
        codedOutputByteBufferNano.writeInt64(22, this.f98615t);
        boolean z11 = this.f98616u;
        if (z11) {
            codedOutputByteBufferNano.writeBool(23, z11);
        }
        C5433um c5433um = this.f98617v;
        if (c5433um != null) {
            codedOutputByteBufferNano.writeMessage(24, c5433um);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f98618w);
        codedOutputByteBufferNano.writeInt32(26, this.f98619x);
        C5309pm c5309pm = this.f98620y;
        if (c5309pm != null) {
            codedOutputByteBufferNano.writeMessage(27, c5309pm);
        }
        C5284om c5284om = this.f98621z;
        if (c5284om != null) {
            codedOutputByteBufferNano.writeMessage(29, c5284om);
        }
        C5458vm c5458vm = this.A;
        if (c5458vm != null) {
            codedOutputByteBufferNano.writeMessage(30, c5458vm);
        }
        C5408tm[] c5408tmArr = this.B;
        if (c5408tmArr != null && c5408tmArr.length > 0) {
            while (true) {
                C5408tm[] c5408tmArr2 = this.B;
                if (i10 >= c5408tmArr2.length) {
                    break;
                }
                C5408tm c5408tm = c5408tmArr2[i10];
                if (c5408tm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c5408tm);
                }
                i10++;
            }
        }
        C5358rm c5358rm = this.C;
        if (c5358rm != null) {
            codedOutputByteBufferNano.writeMessage(32, c5358rm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5508xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5508xm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5508xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f98596a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f98597b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f98598c;
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
                    this.f98598c = strArr2;
                    break;
                case 34:
                    this.f98599d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f98600e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f98601f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i11];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f98601f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f98602g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i12 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i12];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i12 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f98602g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C5334qm[] c5334qmArr = this.f98603h;
                    int length4 = c5334qmArr == null ? 0 : c5334qmArr.length;
                    int i13 = repeatedFieldArrayLength4 + length4;
                    C5334qm[] c5334qmArr2 = new C5334qm[i13];
                    if (length4 != 0) {
                        System.arraycopy(c5334qmArr, 0, c5334qmArr2, 0, length4);
                    }
                    while (length4 < i13 - 1) {
                        C5334qm c5334qm = new C5334qm();
                        c5334qmArr2[length4] = c5334qm;
                        codedInputByteBufferNano.readMessage(c5334qm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C5334qm c5334qm2 = new C5334qm();
                    c5334qmArr2[length4] = c5334qm2;
                    codedInputByteBufferNano.readMessage(c5334qm2);
                    this.f98603h = c5334qmArr2;
                    break;
                case 74:
                    if (this.f98604i == null) {
                        this.f98604i = new C5383sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f98604i);
                    break;
                case 82:
                    this.f98605j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f98606k = codedInputByteBufferNano.readString();
                    break;
                case androidx.constraintlayout.widget.g.S1 /* 98 */:
                    this.f98607l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f98608m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f98609n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f98610o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i14 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i14];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i14 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f98610o = strArr8;
                    break;
                case 130:
                    if (this.f98611p == null) {
                        this.f98611p = new C5483wm();
                    }
                    codedInputByteBufferNano.readMessage(this.f98611p);
                    break;
                case 136:
                    this.f98612q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f98613r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f98614s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f98615t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f98616u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f98617v == null) {
                        this.f98617v = new C5433um();
                    }
                    codedInputByteBufferNano.readMessage(this.f98617v);
                    break;
                case 200:
                    this.f98618w = codedInputByteBufferNano.readInt32();
                    break;
                case INVALID_BID_PAYLOAD_VALUE:
                    this.f98619x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f98620y == null) {
                        this.f98620y = new C5309pm();
                    }
                    codedInputByteBufferNano.readMessage(this.f98620y);
                    break;
                case 234:
                    if (this.f98621z == null) {
                        this.f98621z = new C5284om();
                    }
                    codedInputByteBufferNano.readMessage(this.f98621z);
                    break;
                case 242:
                    if (this.A == null) {
                        this.A = new C5458vm();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C5408tm[] c5408tmArr = this.B;
                    int length6 = c5408tmArr == null ? 0 : c5408tmArr.length;
                    int i15 = repeatedFieldArrayLength6 + length6;
                    C5408tm[] c5408tmArr2 = new C5408tm[i15];
                    if (length6 != 0) {
                        System.arraycopy(c5408tmArr, 0, c5408tmArr2, 0, length6);
                    }
                    while (length6 < i15 - 1) {
                        C5408tm c5408tm = new C5408tm();
                        c5408tmArr2[length6] = c5408tm;
                        codedInputByteBufferNano.readMessage(c5408tm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C5408tm c5408tm2 = new C5408tm();
                    c5408tmArr2[length6] = c5408tm2;
                    codedInputByteBufferNano.readMessage(c5408tm2);
                    this.B = c5408tmArr2;
                    break;
                case r7.i1.d.HandlerC1208d.f123894i /* 258 */:
                    if (this.C == null) {
                        this.C = new C5358rm();
                    }
                    codedInputByteBufferNano.readMessage(this.C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5508xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5508xm) MessageNano.mergeFrom(new C5508xm(), bArr);
    }
}
