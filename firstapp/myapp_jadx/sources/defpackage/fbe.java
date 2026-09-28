package defpackage;

import com.sportybet.core.domain.model.b;
import com.sportybet.core.domain.model.c;
import com.sportybet.core.segmentation.HomeSegment;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fbe {
    public final l580 a;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HomeSegment.values().length];
            try {
                iArr[HomeSegment.Sports.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeSegment.SportsDominant.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeSegment.Games.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeSegment.GamesDominant.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public fbe(l580 l580Var) {
        l580Var.getClass();
        this.a = l580Var;
    }

    public final Object a(List list, x1b x1bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 0;
        if (list.isEmpty()) {
            itf0.a aVar = itf0.a;
            aVar.q("GiftNavigation");
            aVar.n("Empty categories, falling back to segmentation", new Object[0]);
            return b(x1bVar);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((c04) it.next()) instanceof b) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((c04) it2.next()) instanceof c) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                }
                if (((c04) it3.next()) instanceof com.sportybet.core.domain.model.a) {
                    z3 = true;
                    break;
                }
            }
        } else {
            z3 = false;
            break;
        }
        boolean z4 = z2 || z3;
        List listK = kotlin.collections.b.k(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        if (listK == null || !listK.isEmpty()) {
            Iterator it4 = listK.iterator();
            while (it4.hasNext()) {
                if (((Boolean) it4.next()).booleanValue() && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        }
        if (i == 1) {
            return new wpk.a(list);
        }
        return (z || !z4) ? b(x1bVar) : new wpk.a(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        gbe gbeVar;
        if (x1bVar instanceof gbe) {
            gbeVar = (gbe) x1bVar;
            int i = gbeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbeVar.c = i - Integer.MIN_VALUE;
            } else {
                gbeVar = new gbe(this, x1bVar);
            }
        } else {
            gbeVar = new gbe(this, x1bVar);
        }
        Object objC = gbeVar.a;
        y5b y5bVar = y5b.a;
        int i2 = gbeVar.c;
        if (i2 == 0) {
            uj50.b(objC);
            hbe hbeVar = new hbe(this, null);
            gbeVar.c = 1;
            objC = vxf0.c(3000L, hbeVar, gbeVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        HomeSegment homeSegment = (HomeSegment) objC;
        int i3 = homeSegment == null ? -1 : a.a[homeSegment.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return wpk.c.a;
        }
        if (i3 == 3 || i3 == 4) {
            return wpk.b.a;
        }
        itf0.a aVar = itf0.a;
        aVar.q("GiftNavigation");
        aVar.n("Segment not loaded after timeout, defaulting to Sport", new Object[0]);
        return wpk.c.a;
    }
}
