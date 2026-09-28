package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
public final class ick0 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = cxz.b;
        cxz cxzVarA = cxz.a.a("/");
        LinkedHashMap linkedHashMapG = kpu.g(new Pair(cxzVarA, new bck0(cxzVarA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (bck0 bck0Var : CollectionsKt.r0(arrayList, new hck0())) {
            if (((bck0) linkedHashMapG.put(bck0Var.a, bck0Var)) == null) {
                while (true) {
                    cxz cxzVar = bck0Var.a;
                    cxz cxzVarC = cxzVar.c();
                    if (cxzVarC == null) {
                        break;
                    }
                    bck0 bck0Var2 = (bck0) linkedHashMapG.get(cxzVarC);
                    if (bck0Var2 != null) {
                        bck0Var2.q.add(cxzVar);
                        break;
                    }
                    bck0 bck0Var3 = new bck0(cxzVarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapG.put(cxzVarC, bck0Var3);
                    bck0Var3.q.add(cxzVar);
                    bck0Var = bck0Var3;
                }
            }
        }
        return linkedHashMapG;
    }

    public static final String b(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String string = Integer.toString(i, CharsKt.checkRadix(16));
        string.getClass();
        sb.append(string);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ba A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #14 {all -> 0x0157, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:70:0x0156, B:66:0x014f, B:73:0x015b, B:101:0x01ba, B:104:0x01c9, B:99:0x01b5, B:111:0x01d5, B:114:0x01e1, B:115:0x01e8, B:116:0x01e9, B:117:0x01ec, B:118:0x01ed, B:119:0x0202, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:108:0x01cd, B:109:0x01d2, B:63:0x0148, B:96:0x01ae, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:53:0x0135, B:49:0x012e, B:56:0x0139, B:57:0x013e, B:58:0x013f, B:46:0x0127), top: B:151:0x000d, inners: #4, #9, #12, #13 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01c9 A[Catch: all -> 0x0157, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0157, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:70:0x0156, B:66:0x014f, B:73:0x015b, B:101:0x01ba, B:104:0x01c9, B:99:0x01b5, B:111:0x01d5, B:114:0x01e1, B:115:0x01e8, B:116:0x01e9, B:117:0x01ec, B:118:0x01ed, B:119:0x0202, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:108:0x01cd, B:109:0x01d2, B:63:0x0148, B:96:0x01ae, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:53:0x0135, B:49:0x012e, B:56:0x0139, B:57:0x013e, B:58:0x013f, B:46:0x0127), top: B:151:0x000d, inners: #4, #9, #12, #13 }] */
    public static final cck0 c(cxz cxzVar, blh blhVar, Function1<? super bck0, Boolean> function1) {
        y740 y740Var;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        blhVar.getClass();
        bkh bkhVarOpenReadOnly = blhVar.openReadOnly(cxzVar);
        try {
            long size = bkhVarOpenReadOnly.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + bkhVarOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                y740 y740Var2 = new y740(bkhVarOpenReadOnly.l(j));
                try {
                    if (y740Var2.f() == 101010256) {
                        int iL = y740Var2.l() & 65535;
                        int iL2 = y740Var2.l() & 65535;
                        long jL = y740Var2.l() & 65535;
                        if (jL != (y740Var2.l() & 65535) || iL != 0 || iL2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        y740Var2.skip(4L);
                        long jF = ((long) y740Var2.f()) & 4294967295L;
                        int iL3 = y740Var2.l() & 65535;
                        ibg ibgVar = new ibg(iL3, jL, jF);
                        y740Var2.m(iL3);
                        y740Var2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            y740 y740Var3 = new y740(bkhVarOpenReadOnly.l(j3));
                            try {
                                if (y740Var3.f() == 117853008) {
                                    int iF = y740Var3.f();
                                    long jG = y740Var3.g();
                                    if (y740Var3.f() != 1 || iF != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    y740 y740Var4 = new y740(bkhVarOpenReadOnly.l(jG));
                                    try {
                                        int iF2 = y740Var4.f();
                                        if (iF2 != 101075792) {
                                            throw new IOException("bad zip: expected " + b(101075792) + " but was " + b(iF2));
                                        }
                                        y740Var4.skip(12L);
                                        int iF3 = y740Var4.f();
                                        int iF4 = y740Var4.f();
                                        long jG2 = y740Var4.g();
                                        if (jG2 != y740Var4.g() || iF3 != 0 || iF4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        y740Var4.skip(8L);
                                        ibg ibgVar2 = new ibg(iL3, jG2, y740Var4.g());
                                        try {
                                            Unit unit = Unit.a;
                                            try {
                                                y740Var4.close();
                                                th4 = null;
                                            } catch (Throwable th5) {
                                                th4 = th5;
                                            }
                                            ibgVar = ibgVar2;
                                        } catch (Throwable th6) {
                                            th3 = th6;
                                            ibgVar = ibgVar2;
                                            try {
                                                y740Var4.close();
                                                Unit unit2 = Unit.a;
                                            } catch (Throwable th7) {
                                                rtg.a(th3, th7);
                                            }
                                            th4 = th3;
                                        }
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th8) {
                                        th3 = th8;
                                    }
                                }
                                Unit unit3 = Unit.a;
                                try {
                                    y740Var3.close();
                                    th2 = null;
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                try {
                                    y740Var3.close();
                                    Unit unit4 = Unit.a;
                                } catch (Throwable th11) {
                                    rtg.a(th10, th11);
                                }
                                th2 = th10;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        y740 y740Var5 = new y740(bkhVarOpenReadOnly.l(ibgVar.b));
                        try {
                            long j4 = ibgVar.a;
                            while (j2 < j4) {
                                bck0 bck0VarD = d(y740Var5);
                                y740Var = y740Var5;
                                try {
                                    if (bck0VarD.h >= ibgVar.b) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (function1.invoke(bck0VarD).booleanValue()) {
                                        arrayList.add(bck0VarD);
                                    }
                                    j2++;
                                    y740Var5 = y740Var;
                                } catch (Throwable th12) {
                                    th = th12;
                                    th = th;
                                    try {
                                        y740Var.close();
                                        Unit unit5 = Unit.a;
                                    } catch (Throwable th13) {
                                        rtg.a(th, th13);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    cck0 cck0Var = new cck0(cxzVar, blhVar, a(arrayList));
                                    try {
                                        bkhVarOpenReadOnly.close();
                                        Unit unit6 = Unit.a;
                                    } catch (Throwable unused) {
                                    }
                                    return cck0Var;
                                }
                            }
                            y740 y740Var6 = y740Var5;
                            Unit unit7 = Unit.a;
                            try {
                                y740Var6.close();
                                th = null;
                            } catch (Throwable th14) {
                                th = th14;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            y740Var = y740Var5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        cck0 cck0Var2 = new cck0(cxzVar, blhVar, a(arrayList));
                        bkhVarOpenReadOnly.close();
                        Unit unit8 = Unit.a;
                        return cck0Var2;
                    }
                    y740Var2.close();
                    j--;
                } catch (Throwable th16) {
                    y740Var2.close();
                    throw th16;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th17) {
            if (bkhVarOpenReadOnly == null) {
                throw th17;
            }
            try {
                bkhVarOpenReadOnly.close();
                Unit unit9 = Unit.a;
                throw th17;
            } catch (Throwable th18) {
                rtg.a(th17, th18);
                throw th17;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bck0 d(final y740 y740Var) throws IOException {
        int iF = y740Var.f();
        if (iF != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iF));
        }
        y740Var.skip(4L);
        short sL = y740Var.l();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            i08.a("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        int iL = y740Var.l() & 65535;
        int iL2 = y740Var.l() & 65535;
        int iL3 = y740Var.l() & 65535;
        long jF = ((long) y740Var.f()) & 4294967295L;
        final cq40 cq40Var = new cq40();
        cq40Var.a = ((long) y740Var.f()) & 4294967295L;
        final cq40 cq40Var2 = new cq40();
        cq40Var2.a = ((long) y740Var.f()) & 4294967295L;
        int iL4 = y740Var.l() & 65535;
        int iL5 = y740Var.l() & 65535;
        int iL6 = y740Var.l() & 65535;
        y740Var.skip(8L);
        final cq40 cq40Var3 = new cq40();
        cq40Var3.a = ((long) y740Var.f()) & 4294967295L;
        String strM = y740Var.m(iL4);
        if (StringsKt.N(strM, (char) 0)) {
            i08.a("bad zip: filename contains 0x00");
            return null;
        }
        long j = cq40Var2.a == 4294967295L ? 8L : 0L;
        if (cq40Var.a == 4294967295L) {
            j += 8;
        }
        if (cq40Var3.a == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final dq40 dq40Var = new dq40();
        final dq40 dq40Var2 = new dq40();
        final dq40 dq40Var3 = new dq40();
        final yp40 yp40Var = new yp40();
        e(y740Var, iL5, new Function2() { // from class: fck0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                final y740 y740Var2 = y740Var;
                if (iIntValue == 1) {
                    yp40 yp40Var2 = yp40Var;
                    if (yp40Var2.a) {
                        i08.a("bad zip: zip64 extra repeated");
                        return null;
                    }
                    yp40Var2.a = true;
                    if (jLongValue < j2) {
                        i08.a("bad zip: zip64 extra too short");
                        return null;
                    }
                    cq40 cq40Var4 = cq40Var2;
                    long jG = cq40Var4.a;
                    if (jG == 4294967295L) {
                        jG = y740Var2.g();
                    }
                    cq40Var4.a = jG;
                    cq40 cq40Var5 = cq40Var;
                    cq40Var5.a = cq40Var5.a == 4294967295L ? y740Var2.g() : 0L;
                    cq40 cq40Var6 = cq40Var3;
                    cq40Var6.a = cq40Var6.a == 4294967295L ? y740Var2.g() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        i08.a("bad zip: NTFS extra too short");
                        return null;
                    }
                    y740Var2.skip(4L);
                    int i2 = (int) (jLongValue - 4);
                    final dq40 dq40Var4 = dq40Var;
                    final dq40 dq40Var5 = dq40Var2;
                    final dq40 dq40Var6 = dq40Var3;
                    ick0.e(y740Var2, i2, new Function2() { // from class: gck0
                        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Long] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) throws IOException {
                            int iIntValue2 = ((Integer) obj3).intValue();
                            long jLongValue2 = ((Long) obj4).longValue();
                            if (iIntValue2 == 1) {
                                dq40 dq40Var7 = dq40Var4;
                                if (dq40Var7.a != 0) {
                                    i08.a("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                    return null;
                                }
                                if (jLongValue2 != 24) {
                                    i08.a("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                    return null;
                                }
                                y740 y740Var3 = y740Var2;
                                dq40Var7.a = Long.valueOf(y740Var3.g());
                                dq40Var5.a = Long.valueOf(y740Var3.g());
                                dq40Var6.a = Long.valueOf(y740Var3.g());
                            }
                            return Unit.a;
                        }
                    });
                }
                return Unit.a;
            }
        });
        if (j2 > 0 && !yp40Var.a) {
            i08.a("bad zip: zip64 extra required but absent");
            return null;
        }
        String strM2 = y740Var.m(iL6);
        String str = cxz.b;
        return new bck0(cxz.a.a("/").e(strM), c.k(strM, "/", false), strM2, jF, cq40Var.a, cq40Var2.a, iL, cq40Var3.a, iL3, iL2, (Long) dq40Var.a, (Long) dq40Var2.a, (Long) dq40Var3.a, 57344);
    }

    public static final void e(y740 y740Var, int i, Function2 function2) throws IOException {
        lb5 lb5Var = y740Var.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                i08.a("bad zip: truncated header in extra field");
                return;
            }
            int iL = y740Var.l() & 65535;
            long jL = ((long) y740Var.l()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < jL) {
                i08.a("bad zip: truncated value in extra field");
                return;
            }
            y740Var.q0(jL);
            long j3 = lb5Var.b;
            function2.invoke(Integer.valueOf(iL), Long.valueOf(jL));
            long j4 = (lb5Var.b + jL) - j3;
            if (j4 < 0) {
                i08.a(hce0.a(iL, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    lb5Var.skip(j4);
                }
                j = j2 - jL;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bck0 f(final y740 y740Var, bck0 bck0Var) {
        int iF = y740Var.f();
        if (iF != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iF));
        }
        y740Var.skip(2L);
        short sL = y740Var.l();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            i08.a("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        y740Var.skip(18L);
        long jL = ((long) y740Var.l()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iL = y740Var.l() & 65535;
        y740Var.skip(jL);
        if (bck0Var == null) {
            y740Var.skip(iL);
            return null;
        }
        final dq40 dq40Var = new dq40();
        final dq40 dq40Var2 = new dq40();
        final dq40 dq40Var3 = new dq40();
        e(y740Var, iL, new Function2() { // from class: eck0
            /* JADX WARN: Type inference failed for: r13v11, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r13v13, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r13v9, types: [T, java.lang.Integer] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        i08.a("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    y740 y740Var2 = y740Var;
                    byte b = y740Var2.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        i08.a("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    if (z) {
                        dq40Var.a = Integer.valueOf(y740Var2.f());
                    }
                    if (z2) {
                        dq40Var2.a = Integer.valueOf(y740Var2.f());
                    }
                    if (z3) {
                        dq40Var3.a = Integer.valueOf(y740Var2.f());
                    }
                }
                return Unit.a;
            }
        });
        return new bck0(bck0Var.a, bck0Var.b, bck0Var.c, bck0Var.d, bck0Var.e, bck0Var.f, bck0Var.g, bck0Var.h, bck0Var.i, bck0Var.j, bck0Var.k, bck0Var.l, bck0Var.m, (Integer) dq40Var.a, (Integer) dq40Var2.a, (Integer) dq40Var3.a);
    }
}
