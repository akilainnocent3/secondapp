package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.gift.GiftGroupType;
import com.sporty.android.core.model.gift.GiftUpType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class mi90 {
    public final ku90<xi90> A;
    public final ui90 a;
    public final vxk b;
    public final kvk c;
    public v340 d;
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;
    public final wwd0 k;
    public final wwd0 l;
    public final wwd0 m;
    public final wwd0 n;
    public final wwd0 o;
    public final wwd0 p;
    public final wwd0 q;
    public final wwd0 r;
    public final wwd0 s;
    public final wwd0 t;
    public final wwd0 u;
    public final wwd0 v;
    public final b390 w;
    public final t340 x;
    public final ku90<Unit> y;
    public final b390 z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OrderBetType.values().length];
            try {
                iArr[OrderBetType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderBetType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public mi90(ui90 ui90Var, pq7 pq7Var, vxk vxkVar, kvk kvkVar) {
        ui90Var.getClass();
        this.a = ui90Var;
        this.b = vxkVar;
        this.c = kvkVar;
        this.e = xwd0.a(null);
        this.f = xwd0.a(null);
        Boolean bool = Boolean.FALSE;
        this.g = xwd0.a(bool);
        this.h = xwd0.a(bool);
        this.i = xwd0.a("1");
        this.j = xwd0.a("0");
        this.k = xwd0.a(bool);
        this.l = xwd0.a(bool);
        this.m = xwd0.a(cwk.g);
        m2g m2gVar = m2g.a;
        this.n = xwd0.a(m2gVar);
        this.o = xwd0.a(m2gVar);
        this.p = xwd0.a(m2gVar);
        this.q = xwd0.a(yi90.c);
        this.r = xwd0.a(ipk.a);
        this.s = xwd0.a(bool);
        this.t = xwd0.a(bool);
        this.u = xwd0.a(cyk.a.a);
        this.v = xwd0.a(bool);
        b390 b390VarB = d390.b(0, 1, null, 5);
        this.w = b390VarB;
        this.x = e1i.a(b390VarB);
        this.y = new ku90<>();
        this.z = d390.b(0, 1, null, 5);
        this.A = new ku90<>();
    }

    public final void a(smk.c cVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        boolean zG = Intrinsics.g(cVar, smk.c.d.a);
        wwd0 wwd0Var = this.v;
        if (zG) {
            do {
                value4 = wwd0Var.getValue();
                ((Boolean) value4).getClass();
            } while (!wwd0Var.g(value4, Boolean.TRUE));
            return;
        }
        if (Intrinsics.g(cVar, smk.c.a.a)) {
            do {
                value3 = wwd0Var.getValue();
                ((Boolean) value3).getClass();
            } while (!wwd0Var.g(value3, Boolean.FALSE));
            return;
        }
        boolean zG2 = Intrinsics.g(cVar, smk.c.e.a);
        wwd0 wwd0Var2 = this.t;
        if (zG2) {
            do {
                value2 = wwd0Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!wwd0Var2.g(value2, Boolean.TRUE));
        } else if (Intrinsics.g(cVar, smk.c.b.a)) {
            do {
                value = wwd0Var2.getValue();
                ((Boolean) value).getClass();
            } while (!wwd0Var2.g(value, Boolean.FALSE));
        } else if (Intrinsics.g(cVar, smk.c.C1097c.a)) {
            this.a.c();
        } else {
            uhc.a();
        }
    }

    public final void b(wi90 wi90Var) {
        if (wi90Var.equals(wi90.a.a)) {
            this.z.a(smk.c.C1097c.a);
            return;
        }
        if (wi90Var instanceof wi90.b) {
            d(null, null, null);
            wi90.b bVar = (wi90.b) wi90Var;
            c(new yxk.e(bVar.a, bVar.b, bVar.c, bVar.d));
        } else {
            if (!(wi90Var instanceof wi90.c)) {
                uhc.a();
                return;
            }
            wi90.c cVar = (wi90.c) wi90Var;
            d(cVar.a, cVar.b, cVar.c);
            c(new yxk.e(cVar.d, cVar.e, cVar.f, cVar.g));
        }
    }

    public final void c(yxk.e eVar) {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        wwd0 wwd0Var3;
        Object value3;
        wwd0 wwd0Var4;
        Object value4;
        String str = eVar.a;
        String str2 = eVar.b;
        boolean z = eVar.c;
        boolean z2 = eVar.d;
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, str));
        do {
            wwd0Var2 = this.j;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, str2));
        do {
            wwd0Var3 = this.k;
            value3 = wwd0Var3.getValue();
            ((Boolean) value3).getClass();
        } while (!wwd0Var3.g(value3, Boolean.valueOf(z)));
        do {
            wwd0Var4 = this.l;
            value4 = wwd0Var4.getValue();
            ((Boolean) value4).getClass();
        } while (!wwd0Var4.g(value4, Boolean.valueOf(z2)));
        this.b.a(eVar);
    }

    public final void d(String str, String str2, Boolean bool) {
        Object next;
        cyk bVar;
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        wwd0 wwd0Var3;
        Object value3;
        wwd0 wwd0Var4 = this.n;
        Iterator it = ((Iterable) wwd0Var4.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((GiftDetails) next).getGiftId(), str));
        GiftDetails giftDetails = (GiftDetails) next;
        if (giftDetails == null && (giftDetails = (GiftDetails) CollectionsKt.firstOrNull((List) wwd0Var4.getValue())) == null) {
            return;
        }
        BigDecimal bigDecimalB = p54.b(new BigDecimal(giftDetails.getCurrentBalance()));
        BigDecimal bigDecimal = str2 != null ? new BigDecimal(c.p(str2, ",", "", false)) : bigDecimalB;
        if (bigDecimal.compareTo(bigDecimalB) == 0) {
            bVar = cyk.a.a;
        } else {
            String plainString = bigDecimal.toPlainString();
            plainString.getClass();
            bVar = new cyk.b(new ijf0(plainString, 0L, 6), vch0.a);
        }
        do {
            wwd0Var = this.u;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bVar));
        do {
            wwd0Var2 = this.e;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, giftDetails));
        do {
            wwd0Var3 = this.s;
            value3 = wwd0Var3.getValue();
            ((Boolean) value3).getClass();
        } while (!wwd0Var3.g(value3, Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v36, types: [m2g] */
    public final void e(lk50<? extends List<GiftGroup>> lk50Var, OrderBetType orderBetType, boolean z, boolean z2, boolean z3, cwk cwkVar, boolean z4) {
        Object value;
        wwd0 wwd0Var;
        Object value2;
        wwd0 wwd0Var2;
        Object value3;
        wwd0 wwd0Var3;
        Object value4;
        Object value5;
        Iterator it;
        int i;
        ?? K;
        boolean z5;
        boolean z6;
        Object value6;
        Object value7;
        lk50<? extends List<GiftGroup>> lk50Var2 = lk50Var;
        cwk cwkVar2 = cwkVar;
        wwd0 wwd0Var4 = this.f;
        if (z4) {
            do {
                value7 = wwd0Var4.getValue();
            } while (!wwd0Var4.g(value7, ej90.e));
        }
        boolean z7 = lk50Var2 instanceof lk50.b;
        wwd0 wwd0Var5 = this.r;
        if (z7) {
            do {
                value6 = wwd0Var5.getValue();
            } while (!wwd0Var5.g(value6, ipk.a));
        } else if (lk50Var2 instanceof lk50.a) {
            do {
                value = wwd0Var5.getValue();
            } while (!wwd0Var5.g(value, ipk.c));
        } else {
            if (!(lk50Var2 instanceof lk50.c)) {
                uhc.a();
                return;
            }
            while (true) {
                Object value8 = wwd0Var5.getValue();
                if (wwd0Var5.g(value8, ipk.b)) {
                    break;
                }
                lk50Var2 = lk50Var;
                cwkVar2 = cwkVar;
            }
        }
        Iterable iterable = (z && (lk50Var2 instanceof lk50.c)) ? (List) ((lk50.c) lk50Var2).a : m2g.a;
        int i2 = a.a[orderBetType.ordinal()];
        int i3 = 1;
        bz3 bz3Var = (i2 == 1 || i2 != 2) ? bz3.SINGLE : bz3.MULTIPLE;
        iterable.getClass();
        cwkVar2.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            GiftGroup giftGroup = (GiftGroup) it2.next();
            for (GiftDetails giftDetails : giftGroup.getGifts()) {
                if (giftDetails.shouldVerifyBvn()) {
                    it = it2;
                } else {
                    it = it2;
                    if (giftDetails.getKind() != i3) {
                        i = 2;
                        if (giftDetails.getKind() == 2 || giftDetails.getKind() == 3) {
                        }
                        it2 = it;
                        cwkVar2 = cwkVar;
                        i3 = 1;
                    } else {
                        i = 2;
                    }
                    int iOrdinal = bz3Var.ordinal();
                    if (iOrdinal == 0) {
                        K = b.k(Integer.valueOf(OrderBetType.ALL.getValue()), Integer.valueOf(OrderBetType.SINGLE.getValue()));
                    } else if (iOrdinal == 1) {
                        K = b.l(Integer.valueOf(OrderBetType.ALL.getValue()), Integer.valueOf(OrderBetType.MULTIPLE.getValue()));
                        if (z2) {
                            K.add(Integer.valueOf(OrderBetType.FLEX.getValue()));
                        }
                        if (z3) {
                            K.add(Integer.valueOf(OrderBetType.ONE_CUT.getValue()));
                        }
                    } else {
                        if (iOrdinal != i) {
                            uhc.a();
                            return;
                        }
                        K = m2g.a;
                    }
                    List<Integer> betTypeScopes = giftDetails.getBetTypeScopes();
                    if (betTypeScopes != null && betTypeScopes.isEmpty()) {
                        z5 = false;
                        break;
                    }
                    Iterator it3 = betTypeScopes.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (K.contains(Integer.valueOf(((Number) it3.next()).intValue()))) {
                                z5 = true;
                                break;
                            }
                        } else {
                            z5 = false;
                            break;
                        }
                    }
                    List<Integer> upTypes = giftDetails.getUpTypes();
                    if (upTypes == null || upTypes.contains(Integer.valueOf(GiftUpType.NO_LIMIT.getValue()))) {
                        z6 = true;
                    } else if (upTypes.contains(Integer.valueOf(GiftUpType.LEAST_ONE_ONE_UP.getValue()))) {
                        if (cwkVar2.a && cwkVar2.c) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else if (upTypes.contains(Integer.valueOf(GiftUpType.ALL_ONE_UP.getValue()))) {
                        z6 = cwkVar2.e;
                    } else {
                        if (upTypes.contains(Integer.valueOf(GiftUpType.LEAST_ONE_TWO_UP.getValue()))) {
                            if (cwkVar2.b && cwkVar2.d) {
                                z6 = true;
                            }
                        } else if (upTypes.contains(Integer.valueOf(GiftUpType.ALL_TWO_UP.getValue()))) {
                            z6 = cwkVar2.f;
                        }
                        z6 = false;
                    }
                    boolean z8 = z5;
                    boolean z9 = giftDetails.getKind() == 3;
                    boolean z10 = giftDetails.getUsableTime() > jCurrentTimeMillis;
                    boolean z11 = giftDetails.getExpireTime() <= jCurrentTimeMillis;
                    boolean z12 = z9;
                    boolean z13 = giftGroup.getType() == GiftGroupType.USABLE.getValue();
                    if (z10) {
                        arrayList2.add(giftDetails);
                    } else if (!z13) {
                        arrayList3.add(giftDetails);
                    } else if (z11) {
                        arrayList3.add(giftDetails);
                    } else if (z8 && z6 && z12) {
                        arrayList.add(giftDetails);
                    } else {
                        arrayList3.add(giftDetails);
                    }
                    it2 = it;
                    cwkVar2 = cwkVar;
                    i3 = 1;
                }
                arrayList3.add(giftDetails);
                it2 = it;
                cwkVar2 = cwkVar;
                i3 = 1;
            }
            cwkVar2 = cwkVar;
        }
        o48.v(new mq7(new jq7()), arrayList);
        o48.v(new nq7(new kq7()), arrayList3);
        o48.v(new oq7(new lq7()), arrayList2);
        do {
            wwd0Var = this.n;
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, arrayList));
        do {
            wwd0Var2 = this.o;
            value3 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value3, arrayList2));
        do {
            wwd0Var3 = this.p;
            value4 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value4, arrayList3));
        ej90 ej90Var = new ej90((GiftDetails) CollectionsKt.firstOrNull(arrayList), (ipk) wwd0Var5.getValue(), (List) wwd0Var.getValue(), ((Boolean) this.s.getValue()).booleanValue() && ((Boolean) this.h.getValue()).booleanValue());
        do {
            value5 = wwd0Var4.getValue();
        } while (!wwd0Var4.g(value5, ej90Var));
    }
}
