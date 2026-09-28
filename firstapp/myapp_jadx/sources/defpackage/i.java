package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final rl5 a;
    public static final rl5 b;
    public static final rl5 c;
    public static final rl5 d;
    public static final rl5 e;

    static {
        rl5 rl5Var = rl5.d;
        a = rl5.a.c("/");
        b = rl5.a.c("\\");
        c = rl5.a.c("/\\");
        d = rl5.a.c(".");
        e = rl5.a.c("..");
    }

    public static final cxz a(cxz cxzVar, cxz cxzVar2, boolean z) {
        cxzVar2.getClass();
        if (c(cxzVar2) != -1 || cxzVar2.h() != null) {
            return cxzVar2;
        }
        rl5 rl5VarB = b(cxzVar);
        if (rl5VarB == null && (rl5VarB = b(cxzVar2)) == null) {
            rl5VarB = f(cxz.b);
        }
        lb5 lb5Var = new lb5();
        lb5Var.c0(cxzVar.a);
        if (lb5Var.b > 0) {
            lb5Var.c0(rl5VarB);
        }
        lb5Var.c0(cxzVar2.a);
        return d(lb5Var, z);
    }

    public static final rl5 b(cxz cxzVar) {
        rl5 rl5Var = cxzVar.a;
        rl5 rl5Var2 = a;
        if (rl5.h(rl5Var, rl5Var2) != -1) {
            return rl5Var2;
        }
        rl5 rl5Var3 = cxzVar.a;
        rl5 rl5Var4 = b;
        if (rl5.h(rl5Var3, rl5Var4) != -1) {
            return rl5Var4;
        }
        return null;
    }

    public static final int c(cxz cxzVar) {
        rl5 rl5Var = cxzVar.a;
        if (rl5Var.d() != 0) {
            if (rl5Var.j(0) != 47) {
                if (rl5Var.j(0) == 92) {
                    if (rl5Var.d() > 2 && rl5Var.j(1) == 92) {
                        rl5 rl5Var2 = b;
                        rl5Var2.getClass();
                        int iF = rl5Var.f(2, rl5Var2.i());
                        return iF == -1 ? rl5Var.d() : iF;
                    }
                } else if (rl5Var.d() > 2 && rl5Var.j(1) == 58 && rl5Var.j(2) == 92) {
                    char cJ = (char) rl5Var.j(0);
                    if ('a' <= cJ && cJ < '{') {
                        return 3;
                    }
                    if ('A' <= cJ && cJ < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113 A[EDGE_INSN: B:100:0x0113->B:82:0x0113 BREAK  A[LOOP:1: B:54:0x00ae->B:113:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    public static final cxz d(lb5 lb5Var, boolean z) throws EOFException {
        rl5 rl5Var;
        long j;
        char cM;
        boolean z2;
        ArrayList arrayList;
        boolean zN0;
        rl5 rl5Var2;
        int size;
        int i;
        long jS;
        rl5 rl5VarB0;
        rl5 rl5Var3;
        lb5 lb5Var2 = new lb5();
        rl5 rl5VarE = null;
        int i2 = 0;
        while (true) {
            if (!lb5Var.y(0L, a)) {
                rl5Var = b;
                if (!lb5Var.y(0L, rl5Var)) {
                    break;
                }
            }
            byte b2 = lb5Var.readByte();
            if (rl5VarE == null) {
                rl5VarE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && Intrinsics.g(rl5VarE, rl5Var);
        rl5 rl5Var4 = c;
        if (!z3) {
            if (i2 > 0) {
                rl5VarE.getClass();
                lb5Var2.c0(rl5VarE);
            } else {
                long jS2 = lb5Var.S(rl5Var4);
                if (rl5VarE == null) {
                    rl5VarE = jS2 == -1 ? f(cxz.b) : e(lb5Var.m(jS2));
                }
                if (Intrinsics.g(rl5VarE, rl5Var) && lb5Var.b >= 2) {
                    j = -1;
                    if (lb5Var.m(1L) == 58 && (('a' <= (cM = (char) lb5Var.m(0L)) && cM < '{') || ('A' <= cM && cM < '['))) {
                        if (jS2 == 2) {
                            lb5Var2.write(lb5Var, 3L);
                        } else {
                            lb5Var2.write(lb5Var, 2L);
                        }
                    }
                } else {
                    j = -1;
                }
                Unit unit = Unit.a;
            }
            if (lb5Var2.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList = new ArrayList();
            while (true) {
                zN0 = lb5Var.N0();
                rl5Var2 = d;
                if (!zN0) {
                    break;
                }
                jS = lb5Var.S(rl5Var4);
                if (jS == j) {
                    rl5VarB0 = lb5Var.B0(lb5Var.b);
                } else {
                    rl5VarB0 = lb5Var.B0(jS);
                    lb5Var.readByte();
                }
                rl5Var3 = e;
                if (Intrinsics.g(rl5VarB0, rl5Var3)) {
                    if (z2 || !arrayList.isEmpty()) {
                        if (z || (!z2 && (arrayList.isEmpty() || Intrinsics.g(CollectionsKt.b0(arrayList), rl5Var3)))) {
                            arrayList.add(rl5VarB0);
                        } else if (!z3 || arrayList.size() != 1) {
                            p48.D(arrayList);
                        }
                    }
                } else if (Intrinsics.g(rl5VarB0, rl5Var2) && !Intrinsics.g(rl5VarB0, rl5.d)) {
                    arrayList.add(rl5VarB0);
                }
            }
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                if (i > 0) {
                    lb5Var2.c0(rl5VarE);
                }
                lb5Var2.c0((rl5) arrayList.get(i));
            }
            if (lb5Var2.b == 0) {
                lb5Var2.c0(rl5Var2);
            }
            return new cxz(lb5Var2.B0(lb5Var2.b));
        }
        rl5VarE.getClass();
        lb5Var2.c0(rl5VarE);
        lb5Var2.c0(rl5VarE);
        j = -1;
        if (lb5Var2.b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zN0 = lb5Var.N0();
            rl5Var2 = d;
            if (!zN0) {
                break;
                break;
            }
            jS = lb5Var.S(rl5Var4);
            if (jS == j) {
                rl5VarB0 = lb5Var.B0(lb5Var.b);
            } else {
                rl5VarB0 = lb5Var.B0(jS);
                lb5Var.readByte();
            }
            rl5Var3 = e;
            if (Intrinsics.g(rl5VarB0, rl5Var3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(rl5VarB0);
            } else if (Intrinsics.g(rl5VarB0, rl5Var2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                lb5Var2.c0(rl5VarE);
            }
            lb5Var2.c0((rl5) arrayList.get(i));
        }
        if (lb5Var2.b == 0) {
            lb5Var2.c0(rl5Var2);
        }
        return new cxz(lb5Var2.B0(lb5Var2.b));
    }

    public static final rl5 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        hb5.a(hce0.a(b2, "not a directory separator: "));
        return null;
    }

    public static final rl5 f(String str) {
        if (Intrinsics.g(str, "/")) {
            return a;
        }
        if (Intrinsics.g(str, "\\")) {
            return b;
        }
        hb5.a(inm.a("not a directory separator: ", str));
        return null;
    }
}
