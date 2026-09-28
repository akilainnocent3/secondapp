package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wvy implements uhh0 {
    public final jrm a;
    public final iuy b;
    public final Set<phh0> c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k53.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                k53.a aVar = k53.b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                k53.a aVar2 = k53.b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[phh0.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                phh0 phh0Var = phh0.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
        }
    }

    public wvy(jrm jrmVar, iuy iuyVar) {
        jrmVar.getClass();
        iuyVar.getClass();
        this.a = jrmVar;
        this.b = iuyVar;
        rhh0 rhh0Var = rhh0.a;
        this.c = ay0.V(new phh0[]{phh0.a, phh0.b});
    }

    @Override // defpackage.uhh0
    public final String a(String str, String str2, phh0 phh0Var, boolean z) {
        avy avyVar;
        int i = phh0Var == null ? -1 : a.a[phh0Var.ordinal()];
        if (i == -1) {
            avyVar = avy.c;
        } else if (i == 1) {
            avyVar = avy.a;
        } else {
            if (i != 2) {
                uhc.a();
                return null;
            }
            avyVar = avy.b;
        }
        uvy uvyVarE = this.b.e();
        if (str != null && str2 != null && tvy.a(uvyVarE, str, str2)) {
            int iOrdinal = vuy.a(uvyVarE).ordinal();
            String str3 = (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? "1" : null;
            if (str3 != null) {
                int iOrdinal2 = avyVar.ordinal();
                if (iOrdinal2 != 0) {
                    return iOrdinal2 != 1 ? str3 : "60100";
                }
                return "60200";
            }
        }
        return str2;
    }

    @Override // defpackage.uhh0
    public final rhh0 b() {
        return rhh0.a;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    @Override // defpackage.uhh0
    public final dih0 c(Selection selection) {
        ph80 ph80Var;
        phh0 phh0Var;
        phh0 phh0Var2;
        Set setA;
        Sport sport;
        if (selection == null || (!u7u.e(selection) && !u7u.f(selection))) {
            return null;
        }
        ph80 ph80Var2 = new ph80();
        if (u7u.e(selection) && !selection.n()) {
            ph80Var2.add(phh0.a);
        }
        if (u7u.f(selection) && !selection.n()) {
            ph80Var2.add(phh0.b);
        }
        ph80 ph80VarA = wi80.a(ph80Var2);
        ph80 ph80Var3 = new ph80();
        if (u7u.h(selection)) {
            ph80Var3.add(phh0.a);
        }
        if (u7u.i(selection)) {
            ph80Var3.add(phh0.b);
        }
        ph80 ph80VarA2 = wi80.a(ph80Var3);
        if (selection.n()) {
            setA = t3g.a;
        } else {
            jrm jrmVar = this.a;
            int iOrdinal = jrmVar.K0().ordinal();
            if (iOrdinal == 0) {
                ph80Var = new ph80();
                phh0Var = phh0.a;
                if (ph80VarA2.a.containsKey(phh0Var)) {
                    ph80Var.add(phh0Var);
                }
                phh0Var2 = phh0.b;
                if (ph80VarA2.a.containsKey(phh0Var2)) {
                    ph80Var.add(phh0Var2);
                }
                setA = wi80.a(ph80Var);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                ph80Var = new ph80();
                phh0Var = phh0.a;
                if (ph80VarA2.a.containsKey(phh0Var)) {
                    ph80Var.add(phh0Var);
                }
                phh0Var2 = phh0.b;
                if (ph80VarA2.a.containsKey(phh0Var2)) {
                    ph80Var.add(phh0Var2);
                }
                setA = wi80.a(ph80Var);
            } else {
                ph80 ph80Var4 = new ph80();
                Event event = selection.a;
                String str = (event == null || (sport = event.sport) == null) ? null : sport.id;
                Market market = selection.b;
                boolean z = false;
                if (market != null && market.product == 3) {
                    z = true;
                }
                boolean z2 = true ^ z;
                String str2 = market != null ? market.specifier : null;
                String str3 = u7u.e(selection) ? "60200" : null;
                String str4 = u7u.f(selection) ? "60100" : null;
                phh0 phh0Var3 = phh0.a;
                if (ph80VarA2.a.containsKey(phh0Var3) && str != null && str3 != null && jrmVar.g(str, str3, str2, z2)) {
                    ph80Var4.add(phh0Var3);
                }
                phh0 phh0Var4 = phh0.b;
                if (ph80VarA2.a.containsKey(phh0Var4) && str != null && str4 != null && jrmVar.g(str, str4, str2, z2)) {
                    ph80Var4.add(phh0Var4);
                }
                setA = wi80.a(ph80Var4);
            }
        }
        Set set = setA;
        ph80 ph80Var5 = new ph80();
        if (u7u.g(selection) && !selection.n()) {
            ph80Var5.add(phh0.a);
        }
        if (u7u.j(selection) && !selection.n()) {
            ph80Var5.add(phh0.b);
        }
        return new dih0(rhh0.a, ph80VarA, ph80VarA2, set, wi80.a(ph80Var5));
    }

    @Override // defpackage.uhh0
    public final boolean d(String str, String str2, boolean z) {
        return tvy.a(this.b.e(), str, str2);
    }

    @Override // defpackage.uhh0
    public final Set<phh0> e() {
        return this.c;
    }
}
