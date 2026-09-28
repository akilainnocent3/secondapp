package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class sep extends l3 {
    public final wdp f;
    public final pd80 i;
    public int v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sep(wbp wbpVar, wdp wdpVar, String str, pd80 pd80Var) {
        super(wbpVar, wdpVar, str);
        wbpVar.getClass();
        this.f = wdpVar;
        this.i = pd80Var;
    }

    @Override // defpackage.l3, defpackage.b5d
    public final boolean D() {
        return !this.w && super.D();
    }

    @Override // defpackage.uex
    public String P(pd80 pd80Var, int i) {
        pd80Var.getClass();
        wbp wbpVar = this.c;
        rdp.d(wbpVar, pd80Var);
        String strE = pd80Var.e(i);
        if (this.e.e && !V().a.keySet().contains(strE)) {
            sae saeVar = wbpVar.c;
            qdp qdpVar = new qdp(0, pd80Var, wbpVar);
            ConcurrentHashMap concurrentHashMap = saeVar.a;
            Map map = (Map) concurrentHashMap.get(pd80Var);
            Object obj = null;
            sae.a<Map<String, Integer>> aVar = rdp.a;
            Object objInvoke = map != null ? map.get(aVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = qdpVar.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(pd80Var);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(pd80Var, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : V().a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strE;
    }

    @Override // defpackage.l3
    public scp T(String str) {
        str.getClass();
        return (scp) kpu.c(str, V());
    }

    @Override // defpackage.l3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public wdp V() {
        return this.f;
    }

    @Override // defpackage.l3, defpackage.dma
    public void b(pd80 pd80Var) {
        Set setE;
        pd80Var.getClass();
        wbp wbpVar = this.c;
        if (rdp.c(wbpVar, pd80Var) || (pd80Var.getKind() instanceof f120)) {
            return;
        }
        rdp.d(wbpVar, pd80Var);
        if (this.e.e) {
            Set setA = fz9.a(pd80Var);
            Map map = (Map) wbpVar.c.a.get(pd80Var);
            Object obj = map != null ? map.get(rdp.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = t3g.a;
            }
            setE = yi80.e(setA, setKeySet);
        } else {
            setE = fz9.a(pd80Var);
        }
        for (String str : V().a.keySet()) {
            if (!setE.contains(str) && !Intrinsics.g(str, this.d)) {
                StringBuilder sbA = he.a("Encountered an unknown key '", str, "' at element: ");
                sbA.append(S());
                sbA.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbA.append((Object) jdp.g(-1, V().toString()));
                throw jdp.d(-1, sbA.toString());
            }
        }
    }

    @Override // defpackage.dma
    public int v(pd80 pd80Var) {
        pd80Var.getClass();
        while (this.v < pd80Var.d()) {
            int i = this.v;
            this.v = i + 1;
            String strP = P(pd80Var, i);
            strP.getClass();
            int i2 = this.v - 1;
            this.w = false;
            if (!V().containsKey(strP)) {
                boolean z = (this.c.a.b || pd80Var.i(i2) || !pd80Var.g(i2).b()) ? false : true;
                this.w = z;
                if (z) {
                }
            }
            this.e.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.l3, defpackage.b5d
    public final dma c(pd80 pd80Var) {
        pd80Var.getClass();
        pd80 pd80Var2 = this.i;
        if (pd80Var == pd80Var2) {
            scp scpVarU = U();
            String strH = pd80Var2.h();
            if (scpVarU instanceof wdp) {
                return new sep(this.c, (wdp) scpVarU, this.d, pd80Var2);
            }
            throw jdp.c(-1, scpVarU.toString(), "Expected " + jq40.a(wdp.class).k() + ", but had " + jq40.a(scpVarU.getClass()).k() + " as the serialized body of " + strH + oAudzpbdOhCI.XhCtPFVcvkkPn + S());
        }
        return super.c(pd80Var);
    }

    public /* synthetic */ sep(wbp wbpVar, wdp wdpVar, String str, int i) {
        this(wbpVar, wdpVar, (i & 4) != 0 ? null : str, (pd80) null);
    }
}
