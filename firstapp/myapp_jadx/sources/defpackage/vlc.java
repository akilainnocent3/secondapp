package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class vlc implements uhh0 {
    public final jrm a;
    public final mjf b;
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

    public vlc(jrm jrmVar, mjf mjfVar) {
        jrmVar.getClass();
        mjfVar.getClass();
        this.a = jrmVar;
        this.b = mjfVar;
        rhh0 rhh0Var = rhh0.a;
        this.c = wi80.b(phh0.a);
    }

    @Override // defpackage.uhh0
    public final String a(String str, String str2, phh0 phh0Var, boolean z) {
        if (str2 != null && str != null && d(str, str2, z)) {
            slc.a.getClass();
            String str3 = slc.b;
            if (str2.equals(str3) || str2.equals(slc.d)) {
                int i = phh0Var == null ? -1 : a.a[phh0Var.ordinal()];
                if (i == -1) {
                    return str3;
                }
                if (i == 1) {
                    return slc.d;
                }
                if (i != 2) {
                    uhc.a();
                    return null;
                }
            }
        }
        return str2;
    }

    @Override // defpackage.uhh0
    public final rhh0 b() {
        return rhh0.b;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    @Override // defpackage.uhh0
    public final dih0 c(Selection selection) {
        ph80 ph80Var;
        Set setA;
        String str;
        Sport sport;
        String str2 = null;
        if (selection == null || !rlc.b(selection)) {
            return null;
        }
        ph80 ph80Var2 = new ph80();
        if (rlc.b(selection) && !rlc.c(selection)) {
            ph80Var2.add(phh0.a);
        }
        ph80 ph80VarA = wi80.a(ph80Var2);
        ph80 ph80Var3 = new ph80();
        if (rlc.e(selection)) {
            ph80Var3.add(phh0.a);
        }
        ph80 ph80VarA2 = wi80.a(ph80Var3);
        phh0 phh0Var = phh0.a;
        if (ph80VarA2.a.containsKey(phh0Var)) {
            jrm jrmVar = this.a;
            int iOrdinal = jrmVar.K0().ordinal();
            if (iOrdinal == 0) {
                ph80Var = new ph80();
                if (!rlc.c(selection)) {
                    ph80Var.add(phh0Var);
                }
                setA = wi80.a(ph80Var);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                ph80Var = new ph80();
                if (!rlc.c(selection)) {
                    ph80Var.add(phh0Var);
                }
                setA = wi80.a(ph80Var);
            } else {
                ph80 ph80Var4 = new ph80();
                Event event = selection.a;
                String str3 = (event == null || (sport = event.sport) == null) ? null : sport.id;
                if (rlc.b(selection)) {
                    slc.a.getClass();
                    str = slc.d;
                } else {
                    str = null;
                }
                if (rlc.b(selection)) {
                    slc.a.getClass();
                    str2 = slc.e;
                }
                if (str3 != null && str != null) {
                    Market market = selection.b;
                    boolean z = false;
                    if (market != null && market.product == 3) {
                        z = true;
                    }
                    if (jrmVar.g(str3, str, str2, true ^ z)) {
                        ph80Var4.add(phh0Var);
                    }
                }
                setA = wi80.a(ph80Var4);
            }
        } else {
            setA = t3g.a;
        }
        Set set = setA;
        ph80 ph80Var5 = new ph80();
        if (rlc.d(selection) && !rlc.c(selection)) {
            ph80Var5.add(phh0Var);
        }
        return new dih0(rhh0.b, ph80VarA, ph80VarA2, set, wi80.a(ph80Var5));
    }

    @Override // defpackage.uhh0
    public final boolean d(String str, String str2, boolean z) {
        return this.b.b(ckf.d, str, str2, z);
    }

    @Override // defpackage.uhh0
    public final Set<phh0> e() {
        return this.c;
    }
}
