package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class shh0 {
    public static final huy g = huy.a;
    public final jrm a;
    public final lq1 b;
    public final vhh0 c;
    public final nhh0 d;
    public final qhh0 e;
    public final thh0 f;

    public shh0(jrm jrmVar, lq1 lq1Var, vhh0 vhh0Var, nhh0 nhh0Var, qhh0 qhh0Var, thh0 thh0Var) {
        jrmVar.getClass();
        lq1Var.getClass();
        this.a = jrmVar;
        this.b = lq1Var;
        this.c = vhh0Var;
        this.d = nhh0Var;
        this.e = qhh0Var;
        this.f = thh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00fe A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00d9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127  */
    public final huy a(boolean z, Function0 function0) {
        int i;
        vhh0 vhh0Var;
        jrm jrmVar;
        int iOrdinal;
        boolean z2;
        ArrayList arrayListU;
        ArrayList arrayList;
        int size;
        int i2;
        boolean zIsEmpty;
        qhh0 qhh0Var;
        int size2;
        int i3;
        zuy zuyVarA;
        boolean z3;
        zuy zuyVar;
        int iOrdinal2;
        int size3;
        int i4;
        zuy zuyVarA2;
        dih0 dih0VarB;
        boolean z4;
        mhh0 mhh0VarA = nhh0.a(this.d);
        boolean z5 = mhh0VarA.d;
        boolean z6 = mhh0VarA.b;
        boolean z7 = mhh0VarA.a;
        huy huyVar = (huy) function0.invoke();
        if (z) {
            int iOrdinal3 = huyVar.ordinal();
            if (iOrdinal3 == 0) {
                z4 = z7;
            } else {
                if (iOrdinal3 != 1) {
                    uhc.a();
                    return null;
                }
                z4 = z6;
            }
            if (!z4) {
                i = 0;
                vhh0Var = this.c;
                jrmVar = this.a;
                if (z7) {
                    iOrdinal = huyVar.ordinal();
                    if (iOrdinal == 0) {
                        z2 = z7;
                    } else {
                        if (iOrdinal != 1) {
                            uhc.a();
                            return null;
                        }
                        z2 = z6;
                    }
                    if (!z2) {
                        if (z7) {
                            return huy.a;
                        }
                        if (z6) {
                            return huy.b;
                        }
                        arrayListU = jrmVar.U();
                        arrayList = new ArrayList();
                        size = arrayListU.size();
                        i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayListU.get(i2);
                            i2++;
                            dih0VarB = vhh0Var.b((Selection) obj);
                            if (dih0VarB != null) {
                                arrayList.add(dih0VarB);
                            }
                        }
                        zIsEmpty = arrayList.isEmpty();
                        qhh0Var = this.e;
                        if (zIsEmpty) {
                            z3 = false;
                        } else {
                            size2 = arrayList.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    Object obj2 = arrayList.get(i3);
                                    i3++;
                                    zuyVarA = qhh0Var.a(((dih0) obj2).a);
                                    if (zuyVarA != zuy.c) {
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            size3 = arrayList.size();
                            i4 = 0;
                            while (i4 < size3) {
                                Object obj3 = arrayList.get(i4);
                                i4++;
                                zuyVarA2 = qhh0Var.a(((dih0) obj3).a);
                                if (zuyVarA2 != zuy.d) {
                                }
                                i = 1;
                                break;
                            }
                        }
                        if (!z3) {
                            if (z3) {
                                zuyVar = zuy.c;
                            } else if (i != 0) {
                                zuyVar = zuy.d;
                            } else {
                                zuyVar = zuy.a;
                            }
                        } else if (z3) {
                            zuyVar = zuy.c;
                        } else if (i != 0) {
                            zuyVar = zuy.d;
                        } else {
                            zuyVar = zuy.a;
                        }
                        iOrdinal2 = zuyVar.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 2) {
                                return huy.a;
                            }
                            if (iOrdinal2 == 3) {
                                return huy.b;
                            }
                            uhc.a();
                            return null;
                        }
                    }
                } else {
                    iOrdinal = huyVar.ordinal();
                    if (iOrdinal == 0) {
                        z2 = z7;
                    } else {
                        if (iOrdinal != 1) {
                            uhc.a();
                            return null;
                        }
                        z2 = z6;
                    }
                    if (!z2) {
                        if (z7) {
                            return huy.a;
                        }
                        if (z6) {
                            return huy.b;
                        }
                        arrayListU = jrmVar.U();
                        arrayList = new ArrayList();
                        size = arrayListU.size();
                        i2 = 0;
                        while (i2 < size) {
                            Object obj4 = arrayListU.get(i2);
                            i2++;
                            dih0VarB = vhh0Var.b((Selection) obj4);
                            if (dih0VarB != null) {
                                arrayList.add(dih0VarB);
                            }
                        }
                        zIsEmpty = arrayList.isEmpty();
                        qhh0Var = this.e;
                        if (zIsEmpty) {
                            z3 = false;
                        } else {
                            size2 = arrayList.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    Object obj5 = arrayList.get(i3);
                                    i3++;
                                    zuyVarA = qhh0Var.a(((dih0) obj5).a);
                                    if (zuyVarA != zuy.c) {
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            size3 = arrayList.size();
                            i4 = 0;
                            while (i4 < size3) {
                                Object obj6 = arrayList.get(i4);
                                i4++;
                                zuyVarA2 = qhh0Var.a(((dih0) obj6).a);
                                if (zuyVarA2 != zuy.d) {
                                }
                                i = 1;
                                break;
                            }
                        }
                        if (!z3) {
                            if (z3) {
                                zuyVar = zuy.c;
                            } else if (i != 0) {
                                zuyVar = zuy.d;
                            } else {
                                zuyVar = zuy.a;
                            }
                        } else if (z3) {
                            zuyVar = zuy.c;
                        } else if (i != 0) {
                            zuyVar = zuy.d;
                        } else {
                            zuyVar = zuy.a;
                        }
                        iOrdinal2 = zuyVar.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 2) {
                                return huy.a;
                            }
                            if (iOrdinal2 == 3) {
                                return huy.b;
                            }
                            uhc.a();
                            return null;
                        }
                    }
                }
            }
        } else {
            i = 0;
            vhh0Var = this.c;
            jrmVar = this.a;
            if (z7 || !z6) {
                iOrdinal = huyVar.ordinal();
                if (iOrdinal == 0) {
                    z2 = z7;
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    z2 = z6;
                }
                if (!z2) {
                    if (z7) {
                        return huy.a;
                    }
                    if (z6) {
                        return huy.b;
                    }
                    arrayListU = jrmVar.U();
                    arrayList = new ArrayList();
                    size = arrayListU.size();
                    i2 = 0;
                    while (i2 < size) {
                        Object obj7 = arrayListU.get(i2);
                        i2++;
                        dih0VarB = vhh0Var.b((Selection) obj7);
                        if (dih0VarB != null) {
                            arrayList.add(dih0VarB);
                        }
                    }
                    zIsEmpty = arrayList.isEmpty();
                    qhh0Var = this.e;
                    if (zIsEmpty) {
                        z3 = false;
                    } else {
                        size2 = arrayList.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj8 = arrayList.get(i3);
                                i3++;
                                zuyVarA = qhh0Var.a(((dih0) obj8).a);
                                if (zuyVarA != zuy.c || zuyVarA == zuy.b) {
                                    z3 = true;
                                }
                            } else {
                                z3 = false;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        size3 = arrayList.size();
                        i4 = 0;
                        while (i4 < size3) {
                            Object obj9 = arrayList.get(i4);
                            i4++;
                            zuyVarA2 = qhh0Var.a(((dih0) obj9).a);
                            if (zuyVarA2 != zuy.d || zuyVarA2 == zuy.b) {
                                i = 1;
                                break;
                            }
                        }
                    }
                    if (!z3 && i != 0) {
                        zuyVar = zuy.b;
                    } else if (z3) {
                        zuyVar = zuy.c;
                    } else if (i != 0) {
                        zuyVar = zuy.d;
                    } else {
                        zuyVar = zuy.a;
                    }
                    iOrdinal2 = zuyVar.ordinal();
                    if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            return huy.a;
                        }
                        if (iOrdinal2 == 3) {
                            return huy.b;
                        }
                        uhc.a();
                        return null;
                    }
                }
            } else {
                boolean z8 = mhh0VarA.c;
                if (z8 && z5) {
                    ArrayList arrayListU2 = jrmVar.U();
                    int size4 = arrayListU2.size();
                    while (i < size4) {
                        Object obj10 = arrayListU2.get(i);
                        i++;
                        dih0 dih0VarB2 = vhh0Var.b((Selection) obj10);
                        if (dih0VarB2 != null) {
                            Set<phh0> set = dih0VarB2.e;
                            if (set.contains(phh0.a)) {
                                return huy.a;
                            }
                            if (set.contains(phh0.b)) {
                                return huy.b;
                            }
                        }
                    }
                } else {
                    if (z8) {
                        return huy.a;
                    }
                    if (z5) {
                        return huy.b;
                    }
                }
            }
        }
        return huyVar;
    }

    public final zuy b() {
        qhh0 qhh0Var = this.e;
        zuy zuyVarC = qhh0Var.a.c();
        if (!qhh0Var.b.d(ckf.d)) {
            return zuyVarC;
        }
        int iOrdinal = zuyVarC.ordinal();
        if (iOrdinal == 0) {
            return zuy.c;
        }
        if (iOrdinal == 1) {
            return zuy.b;
        }
        if (iOrdinal == 2) {
            return zuy.c;
        }
        if (iOrdinal == 3) {
            return zuy.b;
        }
        uhc.a();
        return null;
    }

    public final huy c() {
        String lowerCase;
        huy huyVar = g;
        huyVar.getClass();
        String string = StringsKt.t0(qq1.i(this.b, BOConfigParam.DefaultSportyInsureUpsType, "one_up")).toString();
        if (string != null) {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (Intrinsics.g(lowerCase, "one_up")) {
            return huy.a;
        }
        return Intrinsics.g(lowerCase, "two_up") ? huy.b : huyVar;
    }

    public final boolean d() {
        if (b() == zuy.a) {
            return false;
        }
        jrm jrmVar = this.a;
        if (jrmVar.D()) {
            return false;
        }
        return jrmVar.W() || jrmVar.m0();
    }
}
