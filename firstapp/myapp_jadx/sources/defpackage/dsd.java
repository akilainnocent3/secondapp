package defpackage;

import com.appsflyer.internal.y;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import com.sportybet.android.basepay.data.CommonConfigRepository;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class dsd extends CommonConfigRepository<Map<Integer, ? extends xrd>> implements yrd {
    public ng50<Map<Integer, xrd>> a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yrd
    public final Object a(x1b x1bVar) {
        bsd bsdVar;
        if (x1bVar instanceof bsd) {
            bsdVar = (bsd) x1bVar;
            int i = bsdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bsdVar.c = i - Integer.MIN_VALUE;
            } else {
                bsdVar = new bsd(this, x1bVar);
            }
        } else {
            bsdVar = new bsd(this, x1bVar);
        }
        Object config = bsdVar.a;
        y5b y5bVar = y5b.a;
        int i2 = bsdVar.c;
        if (i2 == 0) {
            uj50.b(config);
            ng50<Map<Integer, xrd>> ng50Var = this.a;
            if (ng50Var instanceof ng50.b) {
                return ng50Var;
            }
            bsdVar.c = 1;
            config = getConfig(bsdVar);
            if (config == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(config);
        }
        ng50<Map<Integer, xrd>> ng50Var2 = (ng50) config;
        this.a = ng50Var2;
        return ng50Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yrd
    public final Object b(x1b x1bVar) {
        csd csdVar;
        if (x1bVar instanceof csd) {
            csdVar = (csd) x1bVar;
            int i = csdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                csdVar.d = i - Integer.MIN_VALUE;
            } else {
                csdVar = new csd(this, x1bVar);
            }
        } else {
            csdVar = new csd(this, x1bVar);
        }
        Object config = csdVar.b;
        y5b y5bVar = y5b.a;
        int i2 = csdVar.d;
        if (i2 == 0) {
            uj50.b(config);
            csdVar.a = this;
            csdVar.d = 1;
            config = getConfig(csdVar);
            if (config == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = csdVar.a;
            uj50.b(config);
        }
        this.a = (ng50) config;
        return Unit.a;
    }

    @Override // com.sportybet.android.basepay.data.CommonConfigRepository
    public final List<dc8.a> buildParams() {
        return b.k(new dc8.a("pocket", "deposit.bounty.quickInput"), new dc8.a("pocket", "deposit.bounty.range"), new dc8.a("pocket", "deposit.range.free.threshold"));
    }

    @Override // com.sportybet.android.basepay.data.CommonConfigRepository
    public final Map<Integer, ? extends xrd> convert(Object obj) throws Exception {
        tcp tcpVarJ;
        tcp tcpVarJ2;
        String strF;
        String str;
        String str2;
        obj.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bcp bcpVarC = qva.c(new eal().j(obj)).c();
        String strF2 = dc8.f(0, bcpVarC, null);
        if (strF2 == null || strF2.length() == 0) {
            y.a("No quick items");
            return null;
        }
        String strF3 = dc8.f(1, bcpVarC, null);
        if (strF3 == null || strF3.length() == 0) {
            y.a("No ranges");
            return null;
        }
        tcp tcpVarC = qva.c(dc8.f(2, bcpVarC, ""));
        xdp xdpVarD = qva.c(strF2).d();
        Object objF = new eal().f(strF3, new asd().getType());
        objF.getClass();
        for (Map.Entry entry : ((Map) objF).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            if (!list.isEmpty()) {
                ArrayList arrayListR = CollectionsKt.R(list);
                if (arrayListR.size() != list.size()) {
                    y.a("Unexpected structure of ranges");
                    return null;
                }
                xdp xdpVar = xdpVarD.a.containsKey(String.valueOf(iIntValue)) ? xdpVarD : null;
                if (xdpVar != null && (tcpVarJ = xdpVar.j(String.valueOf(iIntValue))) != null) {
                    if (!(tcpVarJ instanceof xdp)) {
                        tcpVarJ = null;
                    }
                    if (tcpVarJ != null) {
                        xdp xdpVarD2 = tcpVarJ.d();
                        if (!xdpVarD2.a.containsKey("quickInputItems")) {
                            xdpVarD2 = null;
                        }
                        if (xdpVarD2 != null && (tcpVarJ2 = xdpVarD2.j("quickInputItems")) != null) {
                            Object objC = new eal().c(new yep(tcpVarJ2), TypeToken.get(new zrd().getType()));
                            objC.getClass();
                            List list2 = (List) objC;
                            if (list2.isEmpty()) {
                                continue;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list2) {
                                    QuickInputItem quickInputItem = (QuickInputItem) obj2;
                                    if (quickInputItem != null && (str = quickInputItem.text) != null && str.length() != 0 && (str2 = quickInputItem.btnText) != null && str2.length() != 0) {
                                        arrayList.add(obj2);
                                    }
                                }
                                if (arrayList.size() != list2.size()) {
                                    y.a("Unexpected structure of quick input items");
                                    return null;
                                }
                                try {
                                    strF = tcpVarC.d().j(String.valueOf(iIntValue)).f();
                                } catch (Exception unused) {
                                    strF = "0";
                                }
                                Integer numValueOf = Integer.valueOf(iIntValue);
                                ArrayList arrayListR2 = CollectionsKt.R(arrayList);
                                strF.getClass();
                                linkedHashMap.put(numValueOf, new xrd(arrayListR2, arrayListR, strF));
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
