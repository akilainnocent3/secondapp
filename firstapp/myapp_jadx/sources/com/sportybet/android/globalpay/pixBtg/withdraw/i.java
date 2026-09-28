package com.sportybet.android.globalpay.pixBtg.withdraw;

import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import defpackage.abk;
import defpackage.c0d;
import defpackage.c100;
import defpackage.d0e;
import defpackage.ej5;
import defpackage.f600;
import defpackage.fsa0;
import defpackage.gd10;
import defpackage.ib5;
import defpackage.id10;
import defpackage.k5k;
import defpackage.kw40;
import defpackage.l48;
import defpackage.lw40;
import defpackage.mgk;
import defpackage.o8i0;
import defpackage.ojd;
import defpackage.p610;
import defpackage.pjd;
import defpackage.sc10;
import defpackage.sd10;
import defpackage.sg8;
import defpackage.shl;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vhn;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.yak;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$loadRequiredData$1", f = "PixBtgWithdrawViewModel.kt", l = {312, 327, 341, 346}, m = "invokeSuspend", v = 2)
public final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public pjd a;
    public ojd b;
    public ojd c;
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ h i;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$loadRequiredData$1$bankAccountsDeferred$1", f = "PixBtgWithdrawViewModel.kt", l = {309}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends List<? extends p610>>>, Object> {
        public int a;
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = hVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends List<? extends p610>>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yak yakVar = this.b.e;
                this.a = 1;
                objA = yakVar.a(true, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$loadRequiredData$1$channelDeferred$1", f = "PixBtgWithdrawViewModel.kt", l = {303}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super zi50<? extends ChannelData>>, Object> {
        public int a;
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = hVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends ChannelData>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                abk abkVar = this.b.b;
                f600 f600Var = f600.WITHDRAW;
                this.a = 1;
                objA = abkVar.a(f600Var, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$loadRequiredData$1$cpfDeferred$1", f = "PixBtgWithdrawViewModel.kt", l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super zi50<? extends String>>, Object> {
        public int a;
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = hVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends String>> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                mgk mgkVar = this.b.d;
                this.a = 1;
                objA = mgkVar.a(this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$loadRequiredData$1$getDepositHistoryStatusDeferred$1", f = "PixBtgWithdrawViewModel.kt", l = {305}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super zi50<? extends DepositHistoryStatusData>>, Object> {
        public int a;
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = hVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends DepositHistoryStatusData>> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                k5k k5kVar = this.b.c;
                this.a = 1;
                objA = k5kVar.a(this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, v1b<? super i> v1bVar) {
        super(2, v1bVar);
        this.i = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i iVar = new i(this.i, v1bVar);
        iVar.f = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    /* JADX WARN: Code duplicated, block: B:36:0x010e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x011e A[LOOP:3: B:40:0x011e->B:98:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139 A[LOOP:4: B:47:0x0139->B:100:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:54:0x015c A[PHI: r2 r12
      0x015c: PHI (r2v22 java.lang.Object) = (r2v19 java.lang.Object), (r2v43 java.lang.Object) binds: [B:52:0x0159, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r12v4 ojd) = (r12v3 ojd), (r12v8 ojd) binds: [B:52:0x0159, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fa A[LOOP:1: B:80:0x01f4->B:82:0x01fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0242  */
    /* JADX WARN: Code duplicated, block: B:89:0x0248  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        pjd pjdVarA;
        ojd ojdVarA;
        Object objQ;
        ojd ojdVar;
        Object objAwait;
        Object obj2;
        Throwable thA;
        Object objAwait2;
        DepositHistoryStatusData depositHistoryStatusData;
        int state;
        Object value;
        Object value2;
        Object obj3;
        Throwable thA2;
        String str;
        Object objAwait3;
        Object obj4;
        String str2;
        Object obj5;
        Throwable thA3;
        List<p610> list;
        sc10 sc10Var;
        String str3;
        vhn vhnVar;
        ArrayList arrayList;
        Object value3;
        String str4;
        h hVar = this.i;
        wwd0 wwd0Var = hVar.D;
        v5b v5bVar = (v5b) this.f;
        y5b y5bVar = y5b.a;
        int i = this.e;
        if (i == 0) {
            uj50.b(obj);
            pjd pjdVarA2 = ej5.a(v5bVar, null, new b(hVar, null), 3);
            pjdVarA = ej5.a(v5bVar, null, new d(hVar, null), 3);
            pjd pjdVarA3 = ej5.a(v5bVar, null, new c(hVar, null), 3);
            ojdVarA = ej5.a(v5bVar, null, new a(hVar, null), 3);
            this.f = v5bVar;
            this.a = pjdVarA;
            this.b = pjdVarA3;
            this.c = ojdVarA;
            this.e = 1;
            objQ = pjdVarA2.q(this);
            if (objQ != y5bVar) {
                ojdVar = pjdVarA3;
            }
            return y5bVar;
        }
        if (i == 1) {
            ojd ojdVar2 = this.c;
            ojdVar = this.b;
            pjdVarA = this.a;
            uj50.b(obj);
            ojdVarA = ojdVar2;
            objQ = obj;
        } else {
            if (i == 2) {
                ojd ojdVar3 = this.c;
                ojdVar = this.b;
                uj50.b(obj);
                ojdVarA = ojdVar3;
                objAwait = obj;
                obj2 = ((zi50) objAwait).a;
                thA = zi50.a(obj2);
                if (thA != null) {
                    hVar.A1(thA);
                    return Unit.a;
                }
                if (!(obj2 instanceof zi50.b)) {
                    depositHistoryStatusData = (DepositHistoryStatusData) obj2;
                    state = depositHistoryStatusData.getState();
                    d0e[] d0eVarArr = d0e.a;
                    if (state == 92) {
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, e.f.a));
                        return Unit.a;
                    }
                    if (depositHistoryStatusData.getState() != 93) {
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, e.C0241e.a));
                        return Unit.a;
                    }
                }
                this.f = null;
                this.a = null;
                this.b = null;
                this.c = ojdVarA;
                this.e = 3;
                objAwait2 = ojdVar.await(this);
                if (objAwait2 != y5bVar) {
                    obj3 = ((zi50) objAwait2).a;
                    thA2 = zi50.a(obj3);
                    if (thA2 != null) {
                        hVar.A1(thA2);
                        return Unit.a;
                    }
                    str = (String) obj3;
                    this.f = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = str;
                    this.e = 4;
                    objAwait3 = ojdVarA.await(this);
                    if (objAwait3 != y5bVar) {
                        obj4 = objAwait3;
                        str2 = str;
                    }
                }
                return y5bVar;
            }
            if (i == 3) {
                ojd ojdVar4 = this.c;
                uj50.b(obj);
                ojdVarA = ojdVar4;
                objAwait2 = obj;
                obj3 = ((zi50) objAwait2).a;
                thA2 = zi50.a(obj3);
                if (thA2 != null) {
                    hVar.A1(thA2);
                    return Unit.a;
                }
                str = (String) obj3;
                this.f = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = str;
                this.e = 4;
                objAwait3 = ojdVarA.await(this);
                if (objAwait3 != y5bVar) {
                    obj4 = objAwait3;
                    str2 = str;
                }
                return y5bVar;
            }
            if (i != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.d;
            uj50.b(obj);
            obj4 = obj;
        }
        obj5 = ((zi50) obj4).a;
        thA3 = zi50.a(obj5);
        if (thA3 == null) {
            hVar.A1(thA3);
            return Unit.a;
        }
        list = (List) obj5;
        sc10Var = hVar.C;
        str3 = (String) sc10Var.a.b("pix_btg_withdraw_selected_bank_account_id");
        if (str3 == null && (list == null || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.g(((p610) it.next()).a, str3)) {
                        hVar.C1(str3, list);
                    }
                } else if (list.size() == 1) {
                    hVar.C1(((p610) CollectionsKt.T(list)).a, list);
                } else if (str3 != null) {
                    sc10Var.a.e(null, "pix_btg_withdraw_selected_bank_account_id");
                }
            }
        } else if (list.size() == 1) {
            hVar.C1(((p610) CollectionsKt.T(list)).a, list);
        } else if (str3 != null) {
            sc10Var.a.e(null, "pix_btg_withdraw_selected_bank_account_id");
        }
        vhnVar = new vhn(hVar.F, str2, list);
        wwd0 wwd0Var2 = hVar.G;
        wwd0Var2.getClass();
        wwd0Var2.k(null, vhnVar);
        arrayList = new ArrayList(l48.r(list, 10));
        for (p610 p610Var : list) {
            arrayList.add(new kw40(p610Var.a, p610Var.e, fsa0.c(p610Var.g), true, false));
        }
        do {
            value3 = wwd0Var.getValue();
            str4 = vhnVar.b;
            str4.getClass();
        } while (!wwd0Var.g(value3, new e.c(new shl(fsa0.d(3, 2, str4), new lw40(6, arrayList), 23), 59)));
        return Unit.a;
        Object obj6 = ((zi50) objQ).a;
        Throwable thA4 = zi50.a(obj6);
        if (thA4 != null) {
            hVar.A1(thA4);
            return Unit.a;
        }
        if (!(obj6 instanceof zi50.b)) {
            String strValueOf = String.valueOf(((ChannelData) obj6).getId());
            strValueOf.getClass();
            c100 c100VarA = sg8.a(Integer.parseInt(strValueOf));
            if (c100VarA == null) {
                hVar.A1(new Throwable("Unknown Channel ID"));
                return Unit.a;
            }
            hVar.F = c100VarA;
        }
        hVar.B1();
        hVar.y1(new id10(hVar, null));
        hVar.y1(new gd10(hVar, null));
        ej5.c(o8i0.d(hVar), null, null, new k(hVar, null), 3);
        ej5.c(o8i0.d(hVar), null, null, new sd10(hVar, null), 3);
        this.f = null;
        this.a = null;
        this.b = ojdVar;
        this.c = ojdVarA;
        this.e = 2;
        objAwait = pjdVarA.await(this);
        if (objAwait != y5bVar) {
            obj2 = ((zi50) objAwait).a;
            thA = zi50.a(obj2);
            if (thA != null) {
                hVar.A1(thA);
                return Unit.a;
            }
            if (!(obj2 instanceof zi50.b)) {
                depositHistoryStatusData = (DepositHistoryStatusData) obj2;
                state = depositHistoryStatusData.getState();
                d0e[] d0eVarArr2 = d0e.a;
                if (state == 92) {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, e.f.a));
                    return Unit.a;
                }
                if (depositHistoryStatusData.getState() != 93) {
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, e.C0241e.a));
                    return Unit.a;
                }
            }
            this.f = null;
            this.a = null;
            this.b = null;
            this.c = ojdVarA;
            this.e = 3;
            objAwait2 = ojdVar.await(this);
            if (objAwait2 != y5bVar) {
                obj3 = ((zi50) objAwait2).a;
                thA2 = zi50.a(obj3);
                if (thA2 != null) {
                    hVar.A1(thA2);
                    return Unit.a;
                }
                str = (String) obj3;
                this.f = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = str;
                this.e = 4;
                objAwait3 = ojdVarA.await(this);
                if (objAwait3 != y5bVar) {
                    obj4 = objAwait3;
                    str2 = str;
                    obj5 = ((zi50) obj4).a;
                    thA3 = zi50.a(obj5);
                    if (thA3 == null) {
                        hVar.A1(thA3);
                        return Unit.a;
                    }
                    list = (List) obj5;
                    sc10Var = hVar.C;
                    str3 = (String) sc10Var.a.b("pix_btg_withdraw_selected_bank_account_id");
                    if (str3 == null) {
                        if (list.size() == 1) {
                            hVar.C1(((p610) CollectionsKt.T(list)).a, list);
                        } else if (str3 != null) {
                            sc10Var.a.e(null, "pix_btg_withdraw_selected_bank_account_id");
                        }
                    } else if (list.size() == 1) {
                        hVar.C1(((p610) CollectionsKt.T(list)).a, list);
                    } else if (str3 != null) {
                        sc10Var.a.e(null, "pix_btg_withdraw_selected_bank_account_id");
                    }
                    vhnVar = new vhn(hVar.F, str2, list);
                    wwd0 wwd0Var3 = hVar.G;
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, vhnVar);
                    arrayList = new ArrayList(l48.r(list, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new kw40(p610Var.a, p610Var.e, fsa0.c(p610Var.g), true, false));
                    }
                    do {
                        value3 = wwd0Var.getValue();
                        str4 = vhnVar.b;
                        str4.getClass();
                    } while (!wwd0Var.g(value3, new e.c(new shl(fsa0.d(3, 2, str4), new lw40(6, arrayList), 23), 59)));
                    return Unit.a;
                }
            }
        }
        return y5bVar;
    }
}
