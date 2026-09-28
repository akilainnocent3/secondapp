package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class t8e0 extends b3 implements ncp {
    public final wbp c;
    public final u7k0 d;
    public final v9e0 e;
    public final y3l f;
    public int i;
    public a v;
    public final vcp w;

    public static final class a {
        public String a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8e0(wbp wbpVar, u7k0 u7k0Var, v9e0 v9e0Var, pd80 pd80Var, a aVar) {
        super(0);
        pd80Var.getClass();
        this.c = wbpVar;
        this.d = u7k0Var;
        this.e = v9e0Var;
        this.f = wbpVar.b;
        this.i = -1;
        this.v = aVar;
        this.w = wbpVar.a.b ? null : new vcp(pd80Var);
    }

    @Override // defpackage.b3, defpackage.b5d
    public final String A() {
        return this.e.i();
    }

    @Override // defpackage.b3, defpackage.b5d
    public final int B(pd80 pd80Var) {
        pd80Var.getClass();
        v9e0 v9e0Var = this.e;
        return rdp.b(pd80Var, this.c, v9e0Var.i(), " at path ".concat(v9e0Var.b.a()));
    }

    @Override // defpackage.b3, defpackage.b5d
    public final boolean D() {
        boolean z;
        vcp vcpVar = this.w;
        if (!(vcpVar != null ? vcpVar.b : false)) {
            v9e0 v9e0Var = this.e;
            int iR = v9e0Var.r(v9e0Var.s());
            int length = v9e0Var.n().length() - iR;
            if (length >= 4 && iR != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || uzh.a(v9e0Var.n().charAt(iR + 4)) != 0) {
                            v9e0Var.a = iR + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == v9e0Var.n().charAt(iR + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final byte F() {
        v9e0 v9e0Var = this.e;
        long jH = v9e0Var.h();
        byte b = (byte) jH;
        if (jH == b) {
            return b;
        }
        v9e0.l(v9e0Var, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.b3, defpackage.dma
    public final void b(pd80 pd80Var) {
        pd80Var.getClass();
        if (pd80Var.d() == 0 && rdp.c(this.c, pd80Var)) {
            while (v(pd80Var) != -1) {
            }
        }
        v9e0 v9e0Var = this.e;
        if (v9e0Var.t()) {
            jdp.e(v9e0Var, "");
            throw null;
        }
        v9e0Var.g(this.d.b);
        aep aepVar = v9e0Var.b;
        int i = aepVar.c;
        int[] iArr = aepVar.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            aepVar.c = i;
        }
        if (i != -1) {
            aepVar.c = i - 1;
        }
    }

    @Override // defpackage.b3, defpackage.b5d
    public final dma c(pd80 pd80Var) {
        pd80Var.getClass();
        wbp wbpVar = this.c;
        u7k0 u7k0VarB = v7k0.b(wbpVar, pd80Var);
        v9e0 v9e0Var = this.e;
        aep aepVar = v9e0Var.b;
        int i = aepVar.c + 1;
        aepVar.c = i;
        if (i == aepVar.a.length) {
            aepVar.b();
        }
        aepVar.a[i] = pd80Var;
        v9e0Var.g(u7k0VarB.a);
        if (v9e0Var.p() == 4) {
            v9e0.l(v9e0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = u7k0VarB.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new t8e0(wbpVar, u7k0VarB, v9e0Var, pd80Var, this.v);
        }
        return (this.d == u7k0VarB && wbpVar.a.b) ? this : new t8e0(wbpVar, u7k0VarB, v9e0Var, pd80Var, this.v);
    }

    @Override // defpackage.dma
    public final y3l d() {
        return this.f;
    }

    @Override // defpackage.ncp
    public final scp h() {
        return new bfp(this.c.a, this.e).a();
    }

    @Override // defpackage.b3, defpackage.b5d
    public final int k() {
        v9e0 v9e0Var = this.e;
        long jH = v9e0Var.h();
        int i = (int) jH;
        if (jH == i) {
            return i;
        }
        v9e0.l(v9e0Var, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final b5d l(pd80 pd80Var) {
        pd80Var.getClass();
        return v8e0.a(pd80Var) ? new ocp(this.e, this.c) : this;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final long o() {
        return this.e.h();
    }

    @Override // defpackage.b3, defpackage.b5d
    public final short p() {
        v9e0 v9e0Var = this.e;
        long jH = v9e0Var.h();
        short s = (short) jH;
        if (jH == s) {
            return s;
        }
        v9e0.l(v9e0Var, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final float q() {
        v9e0 v9e0Var = this.e;
        String strJ = v9e0Var.j();
        try {
            float f = Float.parseFloat(strJ);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            jdp.h(v9e0Var, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            v9e0.l(v9e0Var, zdf0.a('\'', "Failed to parse type 'float' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.b3, defpackage.b5d
    public final double s() {
        v9e0 v9e0Var = this.e;
        String strJ = v9e0Var.j();
        try {
            double d = Double.parseDouble(strJ);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            jdp.h(v9e0Var, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            v9e0.l(v9e0Var, zdf0.a('\'', "Failed to parse type 'double' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.b3, defpackage.b5d
    public final boolean t() {
        boolean z;
        boolean z2;
        v9e0 v9e0Var = this.e;
        int iS = v9e0Var.s();
        String str = v9e0Var.e;
        if (iS == str.length()) {
            v9e0.l(v9e0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iS) == '\"') {
            iS++;
            z = true;
        } else {
            z = false;
        }
        int iR = v9e0Var.r(iS);
        if (iR >= str.length() || iR == -1) {
            v9e0.l(v9e0Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iR + 1;
        int iCharAt = str.charAt(iR) | ' ';
        if (iCharAt == 102) {
            v9e0Var.c(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                v9e0.l(v9e0Var, "Expected valid boolean literal prefix, but had '" + v9e0Var.j() + '\'', 0, null, 6);
                throw null;
            }
            v9e0Var.c(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (v9e0Var.a == str.length()) {
            v9e0.l(v9e0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(v9e0Var.a) == '\"') {
            v9e0Var.a++;
            return z2;
        }
        v9e0.l(v9e0Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final char u() {
        v9e0 v9e0Var = this.e;
        String strJ = v9e0Var.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        v9e0.l(v9e0Var, zdf0.a('\'', "Expected single char, but got '", strJ), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x023b A[EDGE_INSN: B:123:0x023b->B:124:0x023c BREAK  A[LOOP:0: B:46:0x0090->B:103:0x01c5]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dma
    public final int v(pd80 pd80Var) {
        byte b;
        v9e0 v9e0Var = this.e;
        aep aepVar = v9e0Var.b;
        String str = v9e0Var.e;
        pd80Var.getClass();
        u7k0 u7k0Var = this.d;
        int iOrdinal = u7k0Var.ordinal();
        char c = ':';
        int i = 0;
        zT = false;
        boolean zT = false;
        byte b2 = 1;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zT2 = v9e0Var.t();
            while (true) {
                boolean zB = v9e0Var.b();
                vcp vcpVar = this.w;
                if (zB) {
                    String strD = v9e0Var.d();
                    v9e0Var.g(c);
                    wbp wbpVar = this.c;
                    int iA = rdp.a(pd80Var, wbpVar, strD);
                    byte b3 = b2;
                    if (iA != -3) {
                        if (vcpVar != null) {
                            cwf cwfVar = vcpVar.a;
                            if (iA < 64) {
                                cwfVar.c |= 1 << iA;
                            } else {
                                int i3 = (iA >>> 6) - 1;
                                long[] jArr = cwfVar.d;
                                jArr[i3] = jArr[i3] | (1 << (iA & 63));
                            }
                        }
                        i2 = iA;
                        break;
                    }
                    if (!rdp.c(wbpVar, pd80Var)) {
                        a aVar = this.v;
                        if (aVar == null || !Intrinsics.g(aVar.a, strD)) {
                            int i4 = aepVar.c;
                            int[] iArr = aepVar.b;
                            if (iArr[i4] == -2) {
                                iArr[i4] = -1;
                                i4--;
                                aepVar.c = i4;
                            }
                            if (i4 != -1) {
                                aepVar.c = i4 - 1;
                            }
                            int iV = StringsKt.V(6, v9e0Var.n().subSequence(0, v9e0Var.a).toString(), strD);
                            StringBuilder sbA = ml5.a(iV, "Encountered an unknown key '", strD, "' at offset ", " at path: ");
                            sbA.append(aepVar.a());
                            sbA.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                            sbA.append((Object) jdp.g(iV, str));
                            throw new pcp(sbA.toString());
                        }
                        aVar.a = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bP = v9e0Var.p();
                    if (bP == 8 || bP == 6) {
                        while (true) {
                            byte bP2 = v9e0Var.p();
                            b = b3;
                            if (bP2 == b) {
                                v9e0Var.d();
                            } else {
                                if (bP2 == 8 || bP2 == 6) {
                                    arrayList.add(Byte.valueOf(bP2));
                                } else if (bP2 == 9) {
                                    if (((Number) CollectionsKt.b0(arrayList)).byteValue() != 8) {
                                        throw jdp.c(v9e0Var.a, str, "found ] instead of } at path: " + aepVar);
                                    }
                                    p48.C(arrayList);
                                } else if (bP2 == 7) {
                                    if (((Number) CollectionsKt.b0(arrayList)).byteValue() != 6) {
                                        throw jdp.c(v9e0Var.a, str, "found } instead of ] at path: " + aepVar);
                                    }
                                    p48.C(arrayList);
                                } else if (bP2 == 10) {
                                    v9e0.l(v9e0Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                v9e0Var.e();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                            b3 = b;
                        }
                    } else {
                        v9e0Var.j();
                        b = b3;
                    }
                    zT2 = v9e0Var.t();
                    b2 = b;
                    c = ':';
                } else if (!zT2) {
                    if (vcpVar == null) {
                        i2 = -1;
                        break;
                    }
                    cwf cwfVar2 = vcpVar.a;
                    vcp.a aVar2 = cwfVar2.b;
                    pd80 pd80Var2 = cwfVar2.a;
                    int iD = pd80Var2.d();
                    while (true) {
                        long j = cwfVar2.c;
                        long j2 = -1;
                        if (j == -1) {
                            if (iD <= 64) {
                                i2 = -1;
                                break;
                            }
                            long[] jArr2 = cwfVar2.d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i >= length) {
                                    i2 = -1;
                                    break;
                                }
                                int i5 = i + 1;
                                int i6 = i5 * 64;
                                long j3 = jArr2[i];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        int i7 = iNumberOfTrailingZeros + i6;
                                        if (((Boolean) aVar2.invoke(pd80Var2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i7;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i] = j3;
                                        i = i5;
                                        j2 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            cwfVar2.c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) aVar2.invoke(pd80Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i2 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    jdp.f(v9e0Var);
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zT3 = v9e0Var.t();
            if (v9e0Var.b()) {
                int i8 = this.i;
                if (i8 != -1 && !zT3) {
                    v9e0.l(v9e0Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i8 + 1;
                this.i = i2;
            } else if (zT3) {
                jdp.e(v9e0Var, "array");
                throw null;
            }
        } else {
            int i9 = this.i;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                v9e0Var.g(':');
            } else if (i9 != -1) {
                zT = v9e0Var.t();
            }
            if (v9e0Var.b()) {
                if (objArr != false) {
                    int i10 = this.i;
                    int i11 = v9e0Var.a;
                    if (i10 == -1) {
                        if (zT) {
                            v9e0.l(v9e0Var, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else if (!zT) {
                        v9e0.l(v9e0Var, "Expected comma after the key-value pair", i11, null, 4);
                        throw null;
                    }
                }
                i2 = this.i + 1;
                this.i = i2;
            } else if (zT) {
                jdp.f(v9e0Var);
                throw null;
            }
        }
        if (u7k0Var != u7k0.MAP) {
            aepVar.b[aepVar.c] = i2;
        }
        return i2;
    }

    @Override // defpackage.b3, defpackage.dma
    public final <T> T y(pd80 pd80Var, int i, tae<? extends T> taeVar, T t) {
        aep aepVar = this.e.b;
        pd80Var.getClass();
        taeVar.getClass();
        boolean z = this.d == u7k0.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = aepVar.b;
            int i2 = aepVar.c;
            if (iArr[i2] == -2) {
                aepVar.a[i2] = aep.a.a;
            }
        }
        T t2 = (T) z(taeVar);
        if (z) {
            int[] iArr2 = aepVar.b;
            int i3 = aepVar.c;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                aepVar.c = i4;
                if (i4 == aepVar.a.length) {
                    aepVar.b();
                }
            }
            Object[] objArr = aepVar.a;
            int i5 = aepVar.c;
            objArr[i5] = t2;
            aepVar.b[i5] = -2;
        }
        return t2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011b  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x011c, please report this as an issue */
    @Override // defpackage.b5d
    public final <T> T z(tae<? extends T> taeVar) {
        String message;
        wbp wbpVar = this.c;
        v9e0 v9e0Var = this.e;
        aep aepVar = v9e0Var.b;
        taeVar.getClass();
        try {
            if (!(taeVar instanceof q4)) {
                return taeVar.deserialize(this);
            }
            String strB = g120.b(wbpVar, ((q4) taeVar).getDescriptor());
            String strO = v9e0Var.o(strB);
            String strB2 = null;
            if (strO != null) {
                try {
                    tae taeVarD = byx.d((q4) taeVar, this, strO);
                    a aVar = new a();
                    aVar.a = strB;
                    this.v = aVar;
                    return (T) taeVarD.deserialize(this);
                } catch (ee80 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strC0 = StringsKt.c0(StringsKt.n0('\n', message2), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = "";
                    int iS = StringsKt.S(message3, '\n', 0, 6);
                    if (iS != -1) {
                        strSubstring = message3.substring(iS + 1, message3.length());
                    }
                    v9e0.l(v9e0Var, strC0, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strB3 = g120.b(wbpVar, ((q4) taeVar).getDescriptor());
            scp scpVarH = h();
            String strH = ((q4) taeVar).getDescriptor().h();
            if (!(scpVarH instanceof wdp)) {
                throw jdp.c(-1, scpVarH.toString(), "Expected " + jq40.a(wdp.class).k() + ", but had " + jq40.a(scpVarH.getClass()).k() + " as the serialized body of " + strH + " at element: " + aepVar.a());
            }
            wdp wdpVar = (wdp) scpVarH;
            scp scpVar = (scp) wdpVar.get(strB3);
            if (scpVar != null) {
                bep bepVarD = ucp.d(scpVar);
                if (!(bepVarD instanceof sdp)) {
                    strB2 = bepVarD.b();
                }
            }
            try {
                return (T) a54.a(wbpVar, strB3, wdpVar, byx.d((q4) taeVar, this, strB2));
            } catch (ee80 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw jdp.c(-1, wdpVar.toString(), message4);
            }
            message = e.getMessage();
            message.getClass();
            if (StringsKt.M(message, "at path", false)) {
                throw e;
            }
            throw new uqv(e.a, e.getMessage() + " at path: " + aepVar.a(), e);
        } catch (uqv e3) {
            message = e3.getMessage();
            message.getClass();
            if (StringsKt.M(message, "at path", false)) {
                throw e3;
            }
            throw new uqv(e3.a, e3.getMessage() + " at path: " + aepVar.a(), e3);
        }
    }
}
