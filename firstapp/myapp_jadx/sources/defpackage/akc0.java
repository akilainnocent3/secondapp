package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class akc0 {
    public static final Set<Integer> i = ay0.V(new Integer[]{Integer.valueOf(ErrorCode.INVALID), 19107, 19112, Integer.valueOf(ErrorCode.ROUND_IS_SETTLED)});
    public final mgc0 a;
    public final uqm b;
    public final mgb0 c;
    public final wwd0 d = xwd0.a(Long.valueOf(System.currentTimeMillis()));
    public et7 e;
    public final wwd0 f;
    public final xjc0 g;
    public final yjc0 h;

    public akc0(mgc0 mgc0Var, uqm uqmVar, mgb0 mgb0Var) {
        this.a = mgc0Var;
        this.b = uqmVar;
        this.c = mgb0Var;
        wwd0 wwd0VarA = xwd0.a(bkc0.b.a);
        this.f = wwd0VarA;
        this.g = new xjc0(wwd0VarA);
        this.h = new yjc0(wwd0VarA);
    }

    public final pjc0 a() {
        Object value = this.f.getValue();
        bkc0.c cVar = value instanceof bkc0.c ? (bkc0.c) value : null;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd A[LOOP:2: B:40:0x00bd->B:94:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d A[LOOP:1: B:72:0x014d->B:92:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:76:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188 A[LOOP:3: B:81:0x0188->B:96:?, LOOP_START] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, x1b x1bVar) {
        rjc0 rjc0Var;
        Object objH;
        Object value;
        Object objJ;
        Object value2;
        Throwable thA;
        Object value3;
        imc0 imc0Var;
        Object objE;
        Object obj;
        imc0 imc0Var2;
        Object value4;
        BetBuilderConfig betBuilderConfig;
        Serializable serializableD;
        BetBuilderConfig betBuilderConfig2;
        Pair pair;
        hcc0 hcc0Var;
        uhc0 uhc0Var;
        BetBuilderConfig betBuilderConfig3;
        imc0 imc0Var3;
        hcc0 hcc0Var2;
        uhc0 uhc0Var2;
        Object objG;
        imc0 imc0Var4;
        hcc0 hcc0Var3;
        Object obj2;
        BetBuilderConfig betBuilderConfig4;
        kdc0 kdc0Var;
        Object value5;
        Throwable thA2;
        Object value6;
        if (x1bVar instanceof rjc0) {
            rjc0Var = (rjc0) x1bVar;
            int i2 = rjc0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rjc0Var.v = i2 - Integer.MIN_VALUE;
            } else {
                rjc0Var = new rjc0(this, x1bVar);
            }
        } else {
            rjc0Var = new rjc0(this, x1bVar);
        }
        Object obj3 = rjc0Var.f;
        Serializable serializable = y5b.a;
        int i3 = rjc0Var.v;
        mgc0 mgc0Var = this.a;
        wwd0 wwd0Var = this.f;
        kdc0 kdc0Var2 = null;
        if (i3 == 0) {
            uj50.b(obj3);
            rjc0Var.a = str;
            rjc0Var.v = 1;
            objH = mgc0Var.h(rjc0Var);
            if (objH != serializable) {
            }
            return serializable;
        }
        if (i3 == 1) {
            str = rjc0Var.a;
            uj50.b(obj3);
            objH = ((zi50) obj3).a;
        } else {
            if (i3 == 2) {
                str = rjc0Var.a;
                uj50.b(obj3);
                objJ = ((zi50) obj3).a;
                thA = zi50.a(objJ);
                if (thA == null) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, new bkc0.a(new qjc0.a(thA))));
                    return Unit.a;
                }
                imc0Var = (imc0) objJ;
                if (!imc0Var.a) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, new bkc0.a(qjc0.c.a)));
                    return Unit.a;
                }
                rjc0Var.a = null;
                rjc0Var.b = imc0Var;
                rjc0Var.v = 3;
                objE = mgc0Var.e(16, rjc0Var, str);
                if (objE != serializable) {
                    obj = objE;
                    imc0Var2 = imc0Var;
                    zi50.a aVar = zi50.b;
                    if (obj instanceof zi50.b) {
                        obj = null;
                    }
                    betBuilderConfig = (BetBuilderConfig) obj;
                    if (!this.c.isLogin()) {
                        pair = new Pair(null, uhc0.a);
                        betBuilderConfig2 = betBuilderConfig;
                        hcc0Var = (hcc0) pair.a;
                        uhc0Var = (uhc0) pair.b;
                        if (uhc0Var == uhc0.a) {
                            rjc0Var.a = null;
                            rjc0Var.b = imc0Var2;
                            rjc0Var.c = betBuilderConfig2;
                            rjc0Var.d = hcc0Var;
                            rjc0Var.e = uhc0Var;
                            rjc0Var.v = 5;
                            objG = mgc0Var.g(rjc0Var);
                            if (objG != serializable) {
                                imc0Var4 = imc0Var2;
                                hcc0Var3 = hcc0Var;
                                obj2 = objG;
                                betBuilderConfig4 = betBuilderConfig2;
                                uhc0Var2 = uhc0Var;
                            }
                        } else {
                            betBuilderConfig3 = betBuilderConfig2;
                            imc0Var3 = imc0Var2;
                            hcc0Var2 = hcc0Var;
                            uhc0Var2 = uhc0Var;
                        }
                        kdc0Var = kdc0Var2;
                        do {
                            value5 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
                        return Unit.a;
                    }
                    rjc0Var.a = null;
                    rjc0Var.b = imc0Var2;
                    rjc0Var.c = betBuilderConfig;
                    rjc0Var.v = 4;
                    serializableD = d(rjc0Var);
                    if (serializableD != serializable) {
                        obj3 = serializableD;
                        betBuilderConfig2 = betBuilderConfig;
                        pair = (Pair) obj3;
                        if (pair == null) {
                            return Unit.a;
                        }
                        hcc0Var = (hcc0) pair.a;
                        uhc0Var = (uhc0) pair.b;
                        if (uhc0Var == uhc0.a) {
                            rjc0Var.a = null;
                            rjc0Var.b = imc0Var2;
                            rjc0Var.c = betBuilderConfig2;
                            rjc0Var.d = hcc0Var;
                            rjc0Var.e = uhc0Var;
                            rjc0Var.v = 5;
                            objG = mgc0Var.g(rjc0Var);
                            if (objG != serializable) {
                                imc0Var4 = imc0Var2;
                                hcc0Var3 = hcc0Var;
                                obj2 = objG;
                                betBuilderConfig4 = betBuilderConfig2;
                                uhc0Var2 = uhc0Var;
                            }
                        } else {
                            betBuilderConfig3 = betBuilderConfig2;
                            imc0Var3 = imc0Var2;
                            hcc0Var2 = hcc0Var;
                            uhc0Var2 = uhc0Var;
                        }
                        kdc0Var = kdc0Var2;
                        do {
                            value5 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
                        return Unit.a;
                    }
                }
                return serializable;
            }
            if (i3 == 3) {
                imc0Var2 = rjc0Var.b;
                uj50.b(obj3);
                obj = ((zi50) obj3).a;
                zi50.a aVar2 = zi50.b;
                if (obj instanceof zi50.b) {
                    obj = null;
                }
                betBuilderConfig = (BetBuilderConfig) obj;
                if (!this.c.isLogin()) {
                    pair = new Pair(null, uhc0.a);
                    betBuilderConfig2 = betBuilderConfig;
                    hcc0Var = (hcc0) pair.a;
                    uhc0Var = (uhc0) pair.b;
                    if (uhc0Var == uhc0.a) {
                        rjc0Var.a = null;
                        rjc0Var.b = imc0Var2;
                        rjc0Var.c = betBuilderConfig2;
                        rjc0Var.d = hcc0Var;
                        rjc0Var.e = uhc0Var;
                        rjc0Var.v = 5;
                        objG = mgc0Var.g(rjc0Var);
                        if (objG != serializable) {
                            imc0Var4 = imc0Var2;
                            hcc0Var3 = hcc0Var;
                            obj2 = objG;
                            betBuilderConfig4 = betBuilderConfig2;
                            uhc0Var2 = uhc0Var;
                        }
                    } else {
                        betBuilderConfig3 = betBuilderConfig2;
                        imc0Var3 = imc0Var2;
                        hcc0Var2 = hcc0Var;
                        uhc0Var2 = uhc0Var;
                    }
                    kdc0Var = kdc0Var2;
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
                    return Unit.a;
                }
                rjc0Var.a = null;
                rjc0Var.b = imc0Var2;
                rjc0Var.c = betBuilderConfig;
                rjc0Var.v = 4;
                serializableD = d(rjc0Var);
                if (serializableD != serializable) {
                    obj3 = serializableD;
                    betBuilderConfig2 = betBuilderConfig;
                    pair = (Pair) obj3;
                    if (pair == null) {
                        return Unit.a;
                    }
                    hcc0Var = (hcc0) pair.a;
                    uhc0Var = (uhc0) pair.b;
                    if (uhc0Var == uhc0.a) {
                        rjc0Var.a = null;
                        rjc0Var.b = imc0Var2;
                        rjc0Var.c = betBuilderConfig2;
                        rjc0Var.d = hcc0Var;
                        rjc0Var.e = uhc0Var;
                        rjc0Var.v = 5;
                        objG = mgc0Var.g(rjc0Var);
                        if (objG != serializable) {
                            imc0Var4 = imc0Var2;
                            hcc0Var3 = hcc0Var;
                            obj2 = objG;
                            betBuilderConfig4 = betBuilderConfig2;
                            uhc0Var2 = uhc0Var;
                        }
                    } else {
                        betBuilderConfig3 = betBuilderConfig2;
                        imc0Var3 = imc0Var2;
                        hcc0Var2 = hcc0Var;
                        uhc0Var2 = uhc0Var;
                    }
                    kdc0Var = kdc0Var2;
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
                    return Unit.a;
                }
                return serializable;
            }
            if (i3 == 4) {
                betBuilderConfig2 = rjc0Var.c;
                imc0Var2 = rjc0Var.b;
                uj50.b(obj3);
                pair = (Pair) obj3;
                if (pair == null) {
                    return Unit.a;
                }
                hcc0Var = (hcc0) pair.a;
                uhc0Var = (uhc0) pair.b;
                if (uhc0Var == uhc0.a) {
                    rjc0Var.a = null;
                    rjc0Var.b = imc0Var2;
                    rjc0Var.c = betBuilderConfig2;
                    rjc0Var.d = hcc0Var;
                    rjc0Var.e = uhc0Var;
                    rjc0Var.v = 5;
                    objG = mgc0Var.g(rjc0Var);
                    if (objG != serializable) {
                        imc0Var4 = imc0Var2;
                        hcc0Var3 = hcc0Var;
                        obj2 = objG;
                        betBuilderConfig4 = betBuilderConfig2;
                        uhc0Var2 = uhc0Var;
                    }
                    return serializable;
                }
                betBuilderConfig3 = betBuilderConfig2;
                imc0Var3 = imc0Var2;
                hcc0Var2 = hcc0Var;
                uhc0Var2 = uhc0Var;
                kdc0Var = kdc0Var2;
                do {
                    value5 = wwd0Var.getValue();
                } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
                return Unit.a;
            }
            if (i3 != 5) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uhc0Var2 = rjc0Var.e;
            hcc0Var3 = rjc0Var.d;
            betBuilderConfig4 = rjc0Var.c;
            imc0Var4 = rjc0Var.b;
            uj50.b(obj3);
            obj2 = ((zi50) obj3).a;
        }
        thA2 = zi50.a(obj2);
        if (thA2 != null) {
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, new bkc0.a(new qjc0.a(thA2))));
            return Unit.a;
        }
        kdc0Var2 = (kdc0) obj2;
        hcc0Var2 = hcc0Var3;
        betBuilderConfig3 = betBuilderConfig4;
        imc0Var3 = imc0Var4;
        kdc0Var = kdc0Var2;
        do {
            value5 = wwd0Var.getValue();
        } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
        return Unit.a;
        Throwable thA3 = zi50.a(objH);
        if (thA3 != null) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new bkc0.a(new qjc0.a(thA3))));
            return Unit.a;
        }
        if (!((agc0) objH).a) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new bkc0.a(qjc0.b.a)));
            return Unit.a;
        }
        rjc0Var.a = str;
        rjc0Var.v = 2;
        objJ = mgc0Var.j(true, rjc0Var);
        if (objJ != serializable) {
            thA = zi50.a(objJ);
            if (thA == null) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, new bkc0.a(new qjc0.a(thA))));
                return Unit.a;
            }
            imc0Var = (imc0) objJ;
            if (!imc0Var.a) {
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, new bkc0.a(qjc0.c.a)));
                return Unit.a;
            }
            rjc0Var.a = null;
            rjc0Var.b = imc0Var;
            rjc0Var.v = 3;
            objE = mgc0Var.e(16, rjc0Var, str);
            if (objE != serializable) {
                obj = objE;
                imc0Var2 = imc0Var;
                zi50.a aVar3 = zi50.b;
                if (obj instanceof zi50.b) {
                    obj = null;
                }
                betBuilderConfig = (BetBuilderConfig) obj;
                if (!this.c.isLogin()) {
                    pair = new Pair(null, uhc0.a);
                    betBuilderConfig2 = betBuilderConfig;
                    hcc0Var = (hcc0) pair.a;
                    uhc0Var = (uhc0) pair.b;
                    if (uhc0Var == uhc0.a) {
                        rjc0Var.a = null;
                        rjc0Var.b = imc0Var2;
                        rjc0Var.c = betBuilderConfig2;
                        rjc0Var.d = hcc0Var;
                        rjc0Var.e = uhc0Var;
                        rjc0Var.v = 5;
                        objG = mgc0Var.g(rjc0Var);
                        if (objG != serializable) {
                            imc0Var4 = imc0Var2;
                            hcc0Var3 = hcc0Var;
                            obj2 = objG;
                            betBuilderConfig4 = betBuilderConfig2;
                            uhc0Var2 = uhc0Var;
                            thA2 = zi50.a(obj2);
                            if (thA2 != null) {
                                do {
                                    value6 = wwd0Var.getValue();
                                } while (!wwd0Var.g(value6, new bkc0.a(new qjc0.a(thA2))));
                                return Unit.a;
                            }
                            kdc0Var2 = (kdc0) obj2;
                            hcc0Var2 = hcc0Var3;
                            betBuilderConfig3 = betBuilderConfig4;
                            imc0Var3 = imc0Var4;
                        }
                    } else {
                        betBuilderConfig3 = betBuilderConfig2;
                        imc0Var3 = imc0Var2;
                        hcc0Var2 = hcc0Var;
                        uhc0Var2 = uhc0Var;
                    }
                    kdc0Var = kdc0Var2;
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
                    return Unit.a;
                }
                rjc0Var.a = null;
                rjc0Var.b = imc0Var2;
                rjc0Var.c = betBuilderConfig;
                rjc0Var.v = 4;
                serializableD = d(rjc0Var);
                if (serializableD != serializable) {
                    obj3 = serializableD;
                    betBuilderConfig2 = betBuilderConfig;
                    pair = (Pair) obj3;
                    if (pair == null) {
                        return Unit.a;
                    }
                    hcc0Var = (hcc0) pair.a;
                    uhc0Var = (uhc0) pair.b;
                    if (uhc0Var == uhc0.a) {
                        rjc0Var.a = null;
                        rjc0Var.b = imc0Var2;
                        rjc0Var.c = betBuilderConfig2;
                        rjc0Var.d = hcc0Var;
                        rjc0Var.e = uhc0Var;
                        rjc0Var.v = 5;
                        objG = mgc0Var.g(rjc0Var);
                        if (objG != serializable) {
                            imc0Var4 = imc0Var2;
                            hcc0Var3 = hcc0Var;
                            obj2 = objG;
                            betBuilderConfig4 = betBuilderConfig2;
                            uhc0Var2 = uhc0Var;
                            thA2 = zi50.a(obj2);
                            if (thA2 != null) {
                                do {
                                    value6 = wwd0Var.getValue();
                                } while (!wwd0Var.g(value6, new bkc0.a(new qjc0.a(thA2))));
                                return Unit.a;
                            }
                            kdc0Var2 = (kdc0) obj2;
                            hcc0Var2 = hcc0Var3;
                            betBuilderConfig3 = betBuilderConfig4;
                            imc0Var3 = imc0Var4;
                        }
                    } else {
                        betBuilderConfig3 = betBuilderConfig2;
                        imc0Var3 = imc0Var2;
                        hcc0Var2 = hcc0Var;
                        uhc0Var2 = uhc0Var;
                    }
                    kdc0Var = kdc0Var2;
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, new bkc0.c(new pjc0(imc0Var3, imc0Var3.g, hcc0Var2, betBuilderConfig3, kdc0Var), uhc0Var2)));
                    return Unit.a;
                }
            }
        }
        return serializable;
    }

    public final void c() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            ((Number) value).longValue();
        } while (!wwd0Var.g(value, Long.valueOf(System.currentTimeMillis())));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(x1b x1bVar) {
        vjc0 vjc0Var;
        Object objF;
        wwd0 wwd0Var;
        Object value;
        if (x1bVar instanceof vjc0) {
            vjc0Var = (vjc0) x1bVar;
            int i2 = vjc0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vjc0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                vjc0Var = new vjc0(this, x1bVar);
            }
        } else {
            vjc0Var = new vjc0(this, x1bVar);
        }
        Object obj = vjc0Var.a;
        y5b y5bVar = y5b.a;
        int i3 = vjc0Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            vjc0Var.c = 1;
            objF = this.a.f(vjc0Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objF = ((zi50) obj).a;
        }
        Throwable thA = zi50.a(objF);
        if (thA == null) {
            hcc0 hcc0Var = (hcc0) objF;
            List<icc0> list = hcc0Var != null ? hcc0Var.b : null;
            return new Pair(hcc0Var, (list == null || list.isEmpty()) ? uhc0.a : uhc0.b);
        }
        SprThrowable sprThrowable = thA instanceof SprThrowable ? (SprThrowable) thA : null;
        if (CollectionsKt.M(i, sprThrowable != null ? new Integer(sprThrowable.getD()) : null)) {
            return new Pair(null, uhc0.a);
        }
        qjc0.a aVar = new qjc0.a(thA);
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new bkc0.a(aVar)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(AccountInfo accountInfo, x1b x1bVar) {
        zjc0 zjc0Var;
        if (x1bVar instanceof zjc0) {
            zjc0Var = (zjc0) x1bVar;
            int i2 = zjc0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zjc0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                zjc0Var = new zjc0(this, x1bVar);
            }
        } else {
            zjc0Var = new zjc0(this, x1bVar);
        }
        Object obj = zjc0Var.a;
        y5b y5bVar = y5b.a;
        int i3 = zjc0Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            if (accountInfo == null) {
                return Unit.a;
            }
            String lastAccessToken = this.b.getLastAccessToken();
            if (lastAccessToken == null || lastAccessToken.length() == 0) {
                return Unit.a;
            }
            zjc0Var.c = 1;
            if (this.a.m(lastAccessToken, zjc0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            Object obj2 = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        return Unit.a;
    }
}
