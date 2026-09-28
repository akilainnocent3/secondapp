package com.sportybet.android.globalpay.mobileMoney;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.deposit.intouch.NonSuccessfulInTouchDeposit;
import com.sportybet.android.gp.tz.R;
import defpackage.abe;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.c100;
import defpackage.d100;
import defpackage.da;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.gpp;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.jvd0;
import defpackage.ku90;
import defpackage.l48;
import defpackage.lk50;
import defpackage.lx5;
import defpackage.lyh;
import defpackage.lyz;
import defpackage.m2g;
import defpackage.m4k;
import defpackage.mox;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.n52;
import defpackage.nen;
import defpackage.nng;
import defpackage.o8i0;
import defpackage.osa0;
import defpackage.psm;
import defpackage.pu0;
import defpackage.qqe0;
import defpackage.rdd0;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.vtu;
import defpackage.vyv;
import defpackage.wwd0;
import defpackage.wyv;
import defpackage.x1b;
import defpackage.xwd0;
import defpackage.xyv;
import defpackage.y5b;
import defpackage.y9k;
import defpackage.ys00;
import defpackage.yyv;
import defpackage.z600;
import defpackage.zi50;
import defpackage.zyv;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/globalpay/mobileMoney/c;", "Lj8i0;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final ku90<com.sportybet.android.globalpay.mobileMoney.b> A;
    public final ku90 B;
    public final wwd0 C;
    public final wwd0 D;
    public final v340 E;
    public final wwd0 F;
    public final v340 G;
    public final wwd0 H;
    public final v340 I;
    public final wwd0 J;
    public final v340 K;
    public final wwd0 L;
    public final v340 M;
    public final wwd0 N;
    public final v340 O;
    public mox P;
    public jvd0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final abe a;
    public final nen b;
    public final m4k c;
    public final uqm d;
    public final y9k e;
    public final qqe0 f;
    public final lyz i;
    public final d100 v;
    public final psm w;
    public final rdd0 y;
    public final ResourceUiText z;

    @c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel$emitSideEffect$1", f = "MobileMoneyDepositViewModel.kt", l = {252}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.android.globalpay.mobileMoney.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.sportybet.android.globalpay.mobileMoney.b bVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sportybet.android.globalpay.mobileMoney.b> ku90Var = c.this.A;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public c(abe abeVar, nen nenVar, m4k m4kVar, uqm uqmVar, y9k y9kVar, qqe0 qqe0Var, lyz lyzVar, d100 d100Var, psm psmVar, rdd0 rdd0Var) {
        nenVar.getClass();
        uqmVar.getClass();
        lyzVar.getClass();
        d100Var.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.a = abeVar;
        this.b = nenVar;
        this.c = m4kVar;
        this.d = uqmVar;
        this.e = y9kVar;
        this.f = qqe0Var;
        this.i = lyzVar;
        this.v = d100Var;
        this.w = psmVar;
        this.y = rdd0Var;
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__top_up_now);
        this.z = resourceUiText;
        ku90<com.sportybet.android.globalpay.mobileMoney.b> ku90Var = new ku90<>();
        this.A = ku90Var;
        this.B = ku90Var;
        this.C = xwd0.a(null);
        wwd0 wwd0VarA = xwd0.a(null);
        this.D = wwd0VarA;
        this.E = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.F = wwd0VarA2;
        this.G = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.H = wwd0VarA3;
        this.I = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(resourceUiText);
        this.J = wwd0VarA4;
        this.K = e1i.b(wwd0VarA4);
        wwd0 wwd0VarA5 = xwd0.a(m2g.a);
        this.L = wwd0VarA5;
        this.M = e1i.b(wwd0VarA5);
        wwd0 wwd0VarA6 = xwd0.a(new a(0));
        this.N = wwd0VarA6;
        this.O = e1i.b(wwd0VarA6);
        z600.a().b();
        ej5.c(o8i0.d(this), null, null, new vyv(this, null), 3);
        ej5.c(o8i0.d(this), null, null, new d(this, null), 3);
    }

    public static String C1(String str, String str2) {
        return lx5.a("+", str, " ", vtu.a(str2));
    }

    public final void A1(com.sportybet.android.globalpay.mobileMoney.b bVar) {
        ej5.c(o8i0.d(this), null, null, new b(bVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable B1(x1b x1bVar) {
        wyv wyvVar;
        if (x1bVar instanceof wyv) {
            wyvVar = (wyv) x1bVar;
            int i = wyvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wyvVar.c = i - Integer.MIN_VALUE;
            } else {
                wyvVar = new wyv(this, x1bVar);
            }
        } else {
            wyvVar = new wyv(this, x1bVar);
        }
        Object objP = wyvVar.a;
        y5b y5bVar = y5b.a;
        int i2 = wyvVar.c;
        if (i2 == 0) {
            uj50.b(objP);
            lyh<lk50<List<UserPhone>>> lyhVarY = this.i.y(new pu0.a(0));
            wyvVar.c = 1;
            objP = bm50.p(lyhVarY, wyvVar);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objP);
        }
        lk50 lk50Var = (lk50) objP;
        if (!(lk50Var instanceof lk50.c)) {
            return null;
        }
        Iterable<UserPhone> iterable = (Iterable) ((lk50.c) lk50Var).a;
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        for (UserPhone userPhone : iterable) {
            arrayList.add(new ys00(userPhone, C1(userPhone.getPhoneCountryCode(), userPhone.getPhone())));
        }
        return arrayList;
    }

    public final String D1() {
        mox moxVar = ((a) this.N.getValue()).e;
        String strValueOf = moxVar != null ? String.valueOf(moxVar.c) : null;
        return strValueOf == null ? "" : strValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object E1(x1b x1bVar) {
        xyv xyvVar;
        Object next;
        wwd0 wwd0Var;
        Object value;
        if (x1bVar instanceof xyv) {
            xyvVar = (xyv) x1bVar;
            int i = xyvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xyvVar.c = i - Integer.MIN_VALUE;
            } else {
                xyvVar = new xyv(this, x1bVar);
            }
        } else {
            xyvVar = new xyv(this, x1bVar);
        }
        Object objB1 = xyvVar.a;
        Object obj = y5b.a;
        int i2 = xyvVar.c;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(objB1);
            xyvVar.c = 1;
            objB1 = B1(xyvVar);
            if (objB1 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB1);
        }
        List list = (List) objB1;
        if (list == null) {
            this.C.setValue(g.b.a);
            return Boolean.FALSE;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ys00) next).a.isDefault());
        ys00 ys00Var = (ys00) next;
        if (ys00Var == null) {
            for (Object obj3 : list) {
                if (((ys00) obj3).a.isPrimary()) {
                    obj2 = obj3;
                    break;
                }
            }
            ys00Var = (ys00) obj2;
        }
        ys00 ys00Var2 = ys00Var;
        do {
            wwd0Var = this.N;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, a.a((a) value, list, ys00Var2, false, 0, null, false, false, false, false, 508)));
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object F1(String str, String str2, boolean z, x1b x1bVar) {
        yyv yyvVar;
        String str3;
        String str4;
        Object objB1;
        boolean z2;
        Object next;
        Object value;
        Object next2;
        if (x1bVar instanceof yyv) {
            yyvVar = (yyv) x1bVar;
            int i = yyvVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyvVar.f = i - Integer.MIN_VALUE;
            } else {
                yyvVar = new yyv(this, x1bVar);
            }
        } else {
            yyvVar = new yyv(this, x1bVar);
        }
        Object obj = yyvVar.d;
        y5b y5bVar = y5b.a;
        int i2 = yyvVar.f;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            str3 = str;
            yyvVar.a = str3;
            str4 = str2;
            yyvVar.b = str4;
            yyvVar.c = z;
            yyvVar.f = 1;
            objB1 = B1(yyvVar);
            if (objB1 == y5bVar) {
                return y5bVar;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = yyvVar.c;
            str4 = yyvVar.b;
            String str5 = yyvVar.a;
            uj50.b(obj);
            objB1 = obj;
            str3 = str5;
        }
        List listJ0 = (List) objB1;
        wwd0 wwd0Var = this.N;
        if (listJ0 == null) {
            List<ys00> list = ((a) wwd0Var.getValue()).a;
            UserPhone userPhone = new UserPhone(str4, str3, false, z2);
            listJ0 = CollectionsKt.j0(list, new ys00(userPhone, C1(userPhone.getPhoneCountryCode(), userPhone.getPhone())));
        }
        List list2 = listJ0;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((ys00) next).a.getPhone(), str4));
        ys00 ys00Var = (ys00) next;
        if (ys00Var == null) {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((ys00) next2).a.isDefault());
            ys00Var = (ys00) next2;
            if (ys00Var == null) {
                for (Object obj3 : list2) {
                    if (((ys00) obj3).a.isPrimary()) {
                        obj2 = obj3;
                        break;
                    }
                }
                ys00Var = (ys00) obj2;
            }
        }
        ys00 ys00Var2 = ys00Var;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, a.a((a) value, list2, ys00Var2, false, 0, null, false, false, false, false, 508)));
        x1();
        return Unit.a;
    }

    public final void G1(mox moxVar) {
        while (true) {
            wwd0 wwd0Var = this.N;
            Object value = wwd0Var.getValue();
            mox moxVar2 = moxVar;
            if (wwd0Var.g(value, a.a((a) value, null, null, false, 0, moxVar2, false, false, false, false, 495))) {
                A1(new com.sportybet.android.globalpay.mobileMoney.b.e(String.valueOf(moxVar2.c)));
                return;
            }
            moxVar = moxVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H1(String str, String str2, x1b x1bVar) {
        zyv zyvVar;
        if (x1bVar instanceof zyv) {
            zyvVar = (zyv) x1bVar;
            int i = zyvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zyvVar.c = i - Integer.MIN_VALUE;
            } else {
                zyvVar = new zyv(this, x1bVar);
            }
        } else {
            zyvVar = new zyv(this, x1bVar);
        }
        Object objT = zyvVar.a;
        y5b y5bVar = y5b.a;
        int i2 = zyvVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objT);
                zi50.a aVar = zi50.b;
                lyz lyzVar = this.i;
                zyvVar.c = 1;
                objT = lyzVar.t(str, str2, zyvVar);
                if (objT == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objT);
            }
            n52.c((BaseResponse) objT);
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
            return unit;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    public final void I1() {
        osa0.a(this.S && !this.R, this.F, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[RETURN] */
    public final void x1() {
        da daVarA;
        mox moxVar;
        ys00 ys00Var = ((a) this.N.getValue()).b;
        Object obj = null;
        String phone = ys00Var != null ? ys00Var.a.getPhone() : null;
        if (phone != null) {
            this.a.getClass();
            daVarA = abe.a(phone);
        } else {
            daVarA = null;
        }
        List list = (List) this.L.getValue();
        if (daVarA != null) {
            for (Object obj2 : list) {
                mox moxVar2 = (mox) obj2;
                int iOrdinal = daVarA.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return;
                    }
                    int i = moxVar2.c;
                    c100 c100Var = c100.e;
                    if (i == 35002 || i == 36002) {
                        obj = obj2;
                        break;
                    }
                } else {
                    int i2 = moxVar2.c;
                    c100 c100Var2 = c100.e;
                    if (i2 == 35001 || i2 == 36001) {
                        obj = obj2;
                        break;
                    }
                }
            }
            moxVar = (mox) obj;
            if (moxVar == null) {
                moxVar = (mox) CollectionsKt.firstOrNull(list);
                if (moxVar == null) {
                    return;
                }
            }
        } else {
            moxVar = (mox) CollectionsKt.firstOrNull(list);
            if (moxVar == null) {
                return;
            }
        }
        G1(moxVar);
    }

    public final void y1(String str, NonSuccessfulInTouchDeposit.Status status) {
        String phoneNumber;
        String strD1 = D1();
        Double dH = kotlin.text.b.h(str);
        if (dH != null) {
            double dDoubleValue = dH.doubleValue();
            ys00 ys00Var = ((a) this.N.getValue()).b;
            if (ys00Var == null || (phoneNumber = ys00Var.a.getPhone()) == null) {
                phoneNumber = this.d.getPhoneNumber();
            }
            String str2 = phoneNumber;
            str2.getClass();
            this.b.b(strD1, dDoubleValue, str2, status);
        }
    }

    public final void z1(Function0<Unit> function0) {
        Integer intOrNull = StringsKt.toIntOrNull(D1());
        c100 c100Var = c100.e;
        if ((intOrNull != null && intOrNull.intValue() == 35002) || (intOrNull != null && intOrNull.intValue() == 35001)) {
            function0.invoke();
        }
    }

    public static final class a {
        public final List<ys00> a;
        public final ys00 b;
        public final boolean c;
        public final int d;
        public final mox e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public a(List<ys00> list, ys00 ys00Var, boolean z, int i, mox moxVar, boolean z2, boolean z3, boolean z4, boolean z5) {
            list.getClass();
            this.a = list;
            this.b = ys00Var;
            this.c = z;
            this.d = i;
            this.e = moxVar;
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = z5;
        }

        public static a a(a aVar, List list, ys00 ys00Var, boolean z, int i, mox moxVar, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
            if ((i2 & 1) != 0) {
                list = aVar.a;
            }
            List list2 = list;
            if ((i2 & 2) != 0) {
                ys00Var = aVar.b;
            }
            ys00 ys00Var2 = ys00Var;
            if ((i2 & 4) != 0) {
                z = aVar.c;
            }
            boolean z6 = z;
            if ((i2 & 8) != 0) {
                i = aVar.d;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                moxVar = aVar.e;
            }
            mox moxVar2 = moxVar;
            boolean z7 = (i2 & 32) != 0 ? aVar.f : z2;
            boolean z8 = (i2 & 64) != 0 ? aVar.g : z3;
            boolean z9 = (i2 & 128) != 0 ? aVar.h : z4;
            boolean z10 = (i2 & 256) != 0 ? aVar.i : z5;
            aVar.getClass();
            list2.getClass();
            return new a(list2, ys00Var2, z6, i3, moxVar2, z7, z8, z9, z10);
        }

        public final ys00 b() {
            Object next;
            Iterator<T> it = this.a.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((ys00) next).a.isPrimary()) {
                    return (ys00) next;
                }
            }
            next = null;
            return (ys00) next;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && Intrinsics.g(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            ys00 ys00Var = this.b;
            int iA = gpp.a(this.d, mtg0.a((iHashCode + (ys00Var == null ? 0 : ys00Var.hashCode())) * 31, 31, this.c), 31);
            mox moxVar = this.e;
            return Boolean.hashCode(this.i) + mtg0.a(mtg0.a(mtg0.a((iA + (moxVar != null ? moxVar.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderUiState(userPhones=");
            sb.append(this.a);
            sb.append(", selectedPhone=");
            sb.append(this.b);
            sb.append(", multiPhoneEnabled=");
            sb.append(this.c);
            sb.append(", maxPhoneCount=");
            sb.append(this.d);
            sb.append(", selectedNetwork=");
            sb.append(this.e);
            sb.append(", isNetworkSelectorVisible=");
            sb.append(this.f);
            sb.append(", isPhoneSheetVisible=");
            nng.a(", showMultipleNumbersInfoDialog=", ", showMultipleNumbersLearnMoreDialog=", sb, this.g, this.h);
            return mq0.a(sb, this.i, ")");
        }

        public a(int i) {
            this(m2g.a, null, false, 0, null, false, false, false, false);
        }

        public a() {
            this(0);
        }
    }
}
