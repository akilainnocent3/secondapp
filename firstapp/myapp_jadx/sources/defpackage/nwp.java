package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnwp;", "Lj8i0;", "a", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nwp extends j8i0 {
    public final wwd0 A;
    public final ku90<lwp> B;
    public final v340 C;
    public final oh a;
    public final ikh0 b;
    public final odd c;
    public final x0r d;
    public final wwd0 e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;
    public final wwd0 w;
    public final wwd0 y;
    public final wwd0 z;

    public static final class a {
        public final boolean a;
        public final boolean b;
        public final qcn<kxq> c;
        public final qcn<Integer> d;
        public final int e;

        public a(boolean z, boolean z2, uf00 uf00Var, uf00 uf00Var2, int i) {
            uf00Var.getClass();
            uf00Var2.getClass();
            this.a = z;
            this.b = z2;
            this.c = uf00Var;
            this.d = uf00Var2;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shu.a(this.d, shu.a(this.c, mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
        }

        public final String toString() {
            StringBuilder sbA = cwz.a("NumberPanelState(cold=", ", hot=", ", numbers=", this.a, this.b);
            sbA.append(this.c);
            sbA.append(", selectedNumber=");
            sbA.append(this.d);
            sbA.append(", userPickCount=");
            return zk1.a(this.e, ")", sbA);
        }
    }

    public nwp(vu60 vu60Var, oh ohVar, ikh0 ikh0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        Object bVar;
        vu60Var.getClass();
        this.a = ohVar;
        this.b = ikh0Var;
        this.c = oddVar;
        try {
            zi50.a aVar = zi50.b;
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            bVar = (x0r) fnf.a(vu60Var, jq40.a(x0r.class), o2gVar);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            String str = (String) vu60Var.b("lotteryId");
            String str2 = str == null ? "" : str;
            Integer num = (Integer) vu60Var.b(AnalyticsParam.EVENT_PARAM_ID);
            String str3 = (String) vu60Var.b("name");
            String str4 = str3 == null ? "" : str3;
            List<Integer> listQ = (List) vu60Var.b("mainNumbers");
            if (listQ == null) {
                int[] iArr = (int[]) vu60Var.b("mainNumbers");
                listQ = iArr != null ? ay0.Q(iArr) : null;
                if (listQ == null) {
                    listQ = m2g.a;
                }
            }
            List<Integer> list = listQ;
            Boolean bool = (Boolean) vu60Var.b("isAdd");
            bVar = new x0r(str2, num, str4, list, bool != null ? bool.booleanValue() : true);
        }
        x0r x0rVar = (x0r) bVar;
        this.d = x0rVar;
        wwd0 wwd0VarA = xwd0.a(x0rVar.d);
        this.e = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(lk50.b.a);
        this.f = wwd0VarA2;
        rwp rwpVar = new rwp(wwd0VarA2);
        qxp qxpVar = new qxp();
        lyh lyhVarC = ozh.c(rwpVar, this.c);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, qxpVar);
        this.i = v340VarE;
        wwd0 wwd0VarA3 = xwd0.a(Boolean.TRUE);
        this.v = wwd0VarA3;
        Boolean bool2 = Boolean.FALSE;
        wwd0 wwd0VarA4 = xwd0.a(bool2);
        this.w = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(bool2);
        this.y = wwd0VarA5;
        String str5 = x0rVar.c;
        int length = str5.length();
        wwd0 wwd0VarA6 = xwd0.a(new ijf0(str5, vlf0.a(length, length), 4));
        this.z = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(bool2);
        this.A = wwd0VarA7;
        l1i l1iVarB = r1i.b(v340VarE, wwd0VarA, wwd0VarA4, wwd0VarA5, new qwp(this, null));
        this.B = new ku90<>();
        m1i m1iVarC = r1i.c(wwd0VarA3, v340VarE, l1iVarB, wwd0VarA6, wwd0VarA7, new swp(this, null));
        StringUiText stringUiText = vch0.a;
        this.C = e1i.e(ozh.c(m1iVarC, this.c), o8i0.d(this), kwd0Var, new mwp.b(stringUiText, false, false, n1a0.c, f8r.a.a, stringUiText));
    }

    public final void x1(pvp pvpVar) {
        Object value;
        List list;
        Object value2;
        List list2;
        if (pvpVar instanceof pvp.d) {
            this.f.setValue(((pvp.d) pvpVar).a);
            return;
        }
        if (pvpVar.equals(pvp.b.a)) {
            this.B.a(new lwp.a(new nvp.f(3, (uf00) null)));
            return;
        }
        boolean z = pvpVar instanceof pvp.h;
        wwd0 wwd0Var = this.e;
        if (z) {
            zxq zxqVar = ((pvp.h) pvpVar).a;
            if (zxqVar instanceof ip60.a) {
                do {
                    value2 = wwd0Var.getValue();
                    list2 = (List) value2;
                    int i = ((ip60.a) zxqVar).b;
                    if (!list2.contains(Integer.valueOf(i))) {
                        ArrayList arrayList = new ArrayList(list2);
                        arrayList.add(Integer.valueOf(i));
                        list2 = arrayList;
                    }
                } while (!wwd0Var.g(value2, list2));
                return;
            }
            if (zxqVar instanceof ip60.d) {
                do {
                    value = wwd0Var.getValue();
                    list = (List) value;
                    int i2 = ((ip60.d) zxqVar).b;
                    if (list.contains(Integer.valueOf(i2))) {
                        ArrayList arrayList2 = new ArrayList(list);
                        arrayList2.remove(Integer.valueOf(i2));
                        list = arrayList2;
                    }
                } while (!wwd0Var.g(value, list));
                return;
            }
            return;
        }
        if (pvpVar instanceof pvp.e) {
            osa0.a(((pvp.e) pvpVar).a, this.w, null);
            return;
        }
        if (pvpVar instanceof pvp.f) {
            osa0.a(((pvp.f) pvpVar).a, this.y, null);
            return;
        }
        if (pvpVar.equals(pvp.a.a)) {
            Boolean bool = Boolean.FALSE;
            wwd0 wwd0Var2 = this.v;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool);
            return;
        }
        boolean zEquals = pvpVar.equals(pvp.c.a);
        wwd0 wwd0Var3 = this.z;
        if (!zEquals) {
            if (!(pvpVar instanceof pvp.g)) {
                uhc.a();
                return;
            }
            ijf0 ijf0Var = ((pvp.g) pvpVar).a;
            if (ijf0Var.a.b.length() <= 64) {
                wwd0Var3.getClass();
                wwd0Var3.k(null, ijf0Var);
                return;
            }
            return;
        }
        x0r x0rVar = this.d;
        boolean z2 = x0rVar.e;
        String str = x0rVar.a;
        odd oddVar = this.c;
        v340 v340Var = this.i;
        if (z2) {
            String str2 = ((ijf0) wwd0Var3.getValue()).a.b;
            if (StringsKt.U(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = x0rVar.c;
            }
            kzh.d(ozh.c(new g1i(this.a.a(str, str2, a4h.f((Iterable) wwd0Var.getValue()), ((qxp) v340Var.a.getValue()).a), new owp(this, null)), oddVar), o8i0.d(this));
            return;
        }
        Integer num = x0rVar.b;
        if (num != null) {
            int iIntValue = num.intValue();
            String str3 = ((ijf0) wwd0Var3.getValue()).a.b;
            qcn<tsq> qcnVar = ((qxp) v340Var.a.getValue()).a;
            uf00 uf00VarF = a4h.f((Iterable) wwd0Var.getValue());
            ikh0 ikh0Var = this.b;
            ikh0Var.getClass();
            str.getClass();
            str3.getClass();
            uf00VarF.getClass();
            qcnVar.getClass();
            a7q a7qVar = ikh0Var.a;
            List listQ0 = CollectionsKt.q0(uf00VarF);
            listQ0.getClass();
            kzh.d(ozh.c(new g1i(new xzh(r0i.f(bm50.a(new fkh0(new or60(new z6q(a7qVar, iIntValue, str3, listQ0, null)))), new ekh0(null, ikh0Var, str, qcnVar)), new gkh0(2, null)), new twp(this, null)), oddVar), o8i0.d(this));
        }
    }
}
