package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.globalpay.AvailableChannel;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sporty.android.core.model.pocket.globalpay.TypeData;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class v800 {
    public final b3k a;
    public final n800 b;
    public final w900 c;
    public final wwd0 d;
    public final f1i e;
    public final wwd0 f;
    public final f1i g;
    public final ku90<Integer> h;
    public final wwd0 i;
    public final ku90<n990> j;
    public final ku90<Unit> k;
    public boolean l;
    public et7 m;
    public final ConcurrentHashMap<Integer, ztw<Integer>> n;

    public v800(b3k b3kVar, n800 n800Var, w900 w900Var) {
        w900Var.getClass();
        this.a = b3kVar;
        this.b = n800Var;
        this.c = w900Var;
        wwd0 wwd0VarA = xwd0.a(null);
        this.d = wwd0VarA;
        this.e = new f1i(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.f = wwd0VarA2;
        this.g = new f1i(wwd0VarA2);
        this.h = new ku90<>();
        this.i = xwd0.a(Boolean.TRUE);
        this.j = new ku90<>();
        this.k = new ku90<>();
        this.l = true;
        this.n = new ConcurrentHashMap<>();
    }

    public final void a(o800 o800Var) {
        w900 w900Var = this.c;
        w900Var.getClass();
        ArrayList arrayList = w900Var.e;
        if (arrayList == null) {
            itf0.a aVar = itf0.a;
            aVar.q("DepositTabSelection");
            aVar.a("onSelectedFromOuterTabs: outer tab not found", new Object[0]);
            return;
        }
        int iIndexOf = arrayList.indexOf(o800Var);
        ztw<Integer> ztwVar = this.n.get(Integer.valueOf(iIndexOf));
        if (ztwVar != null) {
            w900Var.a(iIndexOf, ztwVar.getValue().intValue());
            return;
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q("DepositTabSelection");
        aVar2.a("onSelectedFromOuterTabs: inner tab index not found for outerTabIndex: " + iIndexOf, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, o2g] */
    public final Object b(f600 f600Var, x1b x1bVar) throws Throwable {
        u800 u800Var;
        Object objA;
        Object obj;
        Object obj2;
        ?? K;
        Object obj3;
        Throwable th;
        Object objC;
        UiText resourceUiText;
        UiText uiTextA;
        f600 f600Var2 = f600Var;
        if (x1bVar instanceof u800) {
            u800Var = (u800) x1bVar;
            int i = u800Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u800Var.d = i - Integer.MIN_VALUE;
            } else {
                u800Var = new u800(this, x1bVar);
            }
        } else {
            u800Var = new u800(this, x1bVar);
        }
        Object obj4 = u800Var.b;
        y5b y5bVar = y5b.a;
        int i2 = u800Var.d;
        Throwable th2 = null;
        if (i2 == 0) {
            uj50.b(obj4);
            u800Var.a = f600Var2;
            u800Var.d = 1;
            objA = this.a.a(f600Var2, u800Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f600Var2 = u800Var.a;
            uj50.b(obj4);
            objA = ((zi50) obj4).a;
        }
        zi50.a aVar = zi50.b;
        boolean z = objA instanceof zi50.b;
        if (z) {
            obj = objA;
        } else {
            AvailableChannel availableChannel = (AvailableChannel) objA;
            this.d.setValue(availableChannel);
            List<TypeData> types = availableChannel.getTypes();
            n800 n800Var = this.b;
            m800 m800Var = n800Var.b;
            types.getClass();
            int i3 = 10;
            ArrayList arrayList = new ArrayList(l48.r(types, 10));
            for (TypeData typeData : types) {
                if (n800Var.a.O() || typeData.getHasPrimaryChannels()) {
                    obj3 = objA;
                    th = th2;
                    List<ChannelData> channels = typeData.getChannels();
                    if (channels != null) {
                        ArrayList arrayList2 = new ArrayList(l48.r(channels, 10));
                        for (Iterator it = channels.iterator(); it.hasNext(); it = it) {
                            ChannelData channelData = (ChannelData) it.next();
                            channelData.getClass();
                            int id = channelData.getId();
                            c100 c100Var = c100.e;
                            if (id == 33001) {
                                StringUiText stringUiText = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.int_provider_1_voucher);
                            } else if (id == 33003) {
                                StringUiText stringUiText2 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.int_provider_sporty_bet_voucher);
                            } else if (id == 35001 || id == 36001 || id == 35002 || id == 36002) {
                                StringUiText stringUiText3 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.page_payment__mobile_money);
                            } else {
                                String name = channelData.getName();
                                name.getClass();
                                if (name.equals("Ewallet")) {
                                    StringUiText stringUiText4 = vch0.a;
                                    resourceUiText = new ResourceUiText(R.string.page_payment__e_wallet);
                                } else {
                                    StringUiText stringUiText5 = vch0.a;
                                    resourceUiText = new StringUiText(name);
                                }
                            }
                            arrayList2.add(new o800(resourceUiText, new o800.b(a.c(new o800.a(new StringUiText(""), channelData, false))), typeData));
                        }
                        objC = arrayList2;
                    } else {
                        objC = th;
                    }
                    if (objC == null) {
                        objC = m2g.a;
                    }
                } else {
                    UiText uiTextB = m800Var.b(typeData);
                    List<ChannelData> channels2 = typeData.getChannels();
                    if (channels2 == null) {
                        channels2 = m2g.a;
                    }
                    ArrayList arrayList3 = new ArrayList(l48.r(channels2, i3));
                    for (ChannelData channelData2 : channels2) {
                        Throwable th3 = th2;
                        channelData2.getClass();
                        psm psmVar = m800Var.a;
                        if ((!psmVar.F() && !psmVar.v()) || (uiTextA = m800.a(channelData2.getId())) == null) {
                            uiTextA = vch0.d(channelData2.getName());
                        }
                        Map<Integer, d800> map = r67.a;
                        int id2 = channelData2.getId();
                        c100 c100Var2 = c100.e;
                        Object obj5 = objA;
                        arrayList3.add(new o800.a(uiTextA, channelData2, id2 == 34001 || channelData2.getId() == 31004));
                        th2 = th3;
                        objA = obj5;
                    }
                    obj3 = objA;
                    th = th2;
                    objC = a.c(new o800(uiTextB, new o800.b(arrayList3), typeData));
                }
                arrayList.add(objC);
                th2 = th;
                objA = obj3;
                i3 = 10;
            }
            obj = objA;
            Throwable th4 = th2;
            ArrayList arrayListS = l48.s(arrayList);
            wwd0 wwd0Var = this.f;
            List list = (List) wwd0Var.getValue();
            ConcurrentHashMap<Integer, ztw<Integer>> concurrentHashMap = this.n;
            if (list != null) {
                ArrayList arrayList4 = new ArrayList();
                int i4 = 0;
                for (Object obj6 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw th4;
                    }
                    o800 o800Var = (o800) obj6;
                    ztw<Integer> ztwVar = concurrentHashMap.get(Integer.valueOf(i4));
                    Object pair = ztwVar != null ? new Pair(o800Var.c.getName(), ztwVar) : th4;
                    if (pair != null) {
                        arrayList4.add(pair);
                    }
                    i4 = i5;
                }
                K = kpu.k(arrayList4);
            } else {
                K = th4;
            }
            if (K == 0) {
                K = o2g.a;
                K.getClass();
            }
            concurrentHashMap.clear();
            int size = arrayListS.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                Object obj7 = arrayListS.get(i7);
                i7++;
                int i8 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw th4;
                }
                o800 o800Var2 = (o800) obj7;
                ztw<Integer> ztwVarA = (ztw) K.get(o800Var2.c.getName());
                Integer numValueOf = Integer.valueOf(i6);
                if (ztwVarA == null || ztwVarA.getValue().intValue() > b.j(o800Var2.b.a)) {
                    ztwVarA = xwd0.a(0);
                }
                concurrentHashMap.put(numValueOf, ztwVarA);
                i6 = i8;
            }
            wwd0Var.k(th4, arrayListS);
            et7 et7Var = this.m;
            if (et7Var != null) {
                w900 w900Var = this.c;
                w900Var.getClass();
                f600Var2.getClass();
                w900Var.d = f600Var2;
                w900Var.e = arrayListS;
                w900Var.f = et7Var;
            }
        }
        if (z) {
            obj2 = obj;
        } else {
            zi50.a aVar2 = zi50.b;
            obj2 = Boolean.TRUE;
        }
        return zi50.a(obj2) == null ? obj2 : Boolean.FALSE;
    }
}
