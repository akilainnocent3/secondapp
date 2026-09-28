package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class ga60 extends j8i0 {
    public final wwd0 a;
    public final wwd0 b;
    public final wwd0 c;
    public final ju90<ea60> d;
    public final t340 e;
    public final v340 f;

    @c0d(c = "com.sportygames.speedybingo.presentation.betpanel.SBBetPanelViewModel$1", f = "SBBetPanelViewModel.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<fa60, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = ga60.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fa60 fa60Var, v1b<? super Unit> v1bVar) {
            return ((a) create(fa60Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fa60 fa60Var = (fa60) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.b = null;
                this.a = 1;
                if (ga60.this.z1(fa60Var) == y5bVar) {
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

    public static final class b implements Function1<skd0, skd0> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final skd0 invoke(skd0 skd0Var) {
            BigDecimal bigDecimal = skd0Var.a;
            bigDecimal.getClass();
            ga60 ga60Var = ga60.this;
            BigDecimal bigDecimalAdd = bigDecimal.add(((fa60) ga60Var.a.getValue()).e);
            bigDecimalAdd.getClass();
            BigDecimal bigDecimal2 = skd0.b;
            BigDecimal bigDecimalY1 = ga60Var.y1(bigDecimalAdd);
            if (bigDecimalY1 != null) {
                return new skd0(bigDecimalY1);
            }
            return null;
        }
    }

    public static final class c implements Function1<skd0, skd0> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final skd0 invoke(skd0 skd0Var) {
            BigDecimal bigDecimal = skd0Var.a;
            bigDecimal.getClass();
            ga60 ga60Var = ga60.this;
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(((fa60) ga60Var.a.getValue()).e);
            bigDecimalSubtract.getClass();
            BigDecimal bigDecimal2 = skd0.b;
            BigDecimal bigDecimalY1 = ga60Var.y1(bigDecimalSubtract);
            if (bigDecimalY1 != null) {
                return new skd0(bigDecimalY1);
            }
            return null;
        }
    }

    public static final class d implements Function1<skd0, skd0> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final skd0 invoke(skd0 skd0Var) {
            skd0Var.a.getClass();
            BigDecimal bigDecimal = ((fa60) ga60.this.a.getValue()).c;
            if (bigDecimal != null) {
                return new skd0(bigDecimal);
            }
            return null;
        }
    }

    public static final class e implements Function1<skd0, skd0> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final skd0 invoke(skd0 skd0Var) {
            skd0Var.a.getClass();
            BigDecimal bigDecimal = ((fa60) ga60.this.a.getValue()).d;
            if (bigDecimal != null) {
                return new skd0(bigDecimal);
            }
            return null;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.betpanel.SBBetPanelViewModel$state$1", f = "SBBetPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements iaj<fa60, hyo, xw2, v1b<? super zw2>, Object> {
        public /* synthetic */ fa60 a;
        public /* synthetic */ hyo b;
        public /* synthetic */ xw2 c;

        @Override // defpackage.iaj
        public final Object d(fa60 fa60Var, hyo hyoVar, xw2 xw2Var, v1b<? super zw2> v1bVar) {
            f fVar = new f(4, v1bVar);
            fVar.a = fa60Var;
            fVar.b = hyoVar;
            fVar.c = xw2Var;
            return fVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0091  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:99:0x00af A[SYNTHETIC] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            boolean z;
            boolean z2;
            sw aVar;
            Object bVar2;
            boolean zEquals;
            d860 d860Var;
            fa60 fa60Var = this.a;
            hyo hyoVar = this.b;
            xw2 xw2Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            fa60Var.getClass();
            BigDecimal bigDecimal = fa60Var.c;
            BigDecimal bigDecimal2 = fa60Var.d;
            hyoVar.getClass();
            qcn<skd0> qcnVar = fa60Var.f;
            ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
            Iterator<skd0> it = qcnVar.iterator();
            while (true) {
                boolean z3 = true;
                BigDecimal bigDecimal3 = null;
                if (!it.hasNext()) {
                    uf00 uf00VarF = a4h.f(arrayList);
                    if (hyoVar instanceof hyo.b) {
                        aVar = new sw.b(new omn.b(tkd0.a(((hyo.b) hyoVar).b, (4 & 2) != 0, (4 & 4) != 0)));
                    } else {
                        if (!(hyoVar instanceof hyo.a)) {
                            uhc.a();
                            return null;
                        }
                        hyo.a aVar2 = (hyo.a) hyoVar;
                        String text = aVar2.a.getText();
                        text.getClass();
                        DecimalFormat decimalFormat = new DecimalFormat();
                        decimalFormat.setParseBigDecimal(true);
                        try {
                            zi50.a aVar3 = zi50.b;
                            bVar = decimalFormat.parse(text);
                        } catch (Throwable th) {
                            zi50.a aVar4 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        if (bVar instanceof zi50.b) {
                            bVar = null;
                        }
                        Number number = (Number) bVar;
                        if (number != null) {
                            BigDecimal bigDecimal4 = number instanceof BigDecimal ? (BigDecimal) number : null;
                            if (bigDecimal4 != null) {
                                BigDecimal bigDecimal5 = skd0.b;
                                bigDecimal3 = bigDecimal4;
                            }
                        }
                        omn omnVar = aVar2.a;
                        boolean z4 = !(bigDecimal3 != null && bigDecimal3.compareTo(bigDecimal2) == 0);
                        boolean z5 = !(bigDecimal3 != null && bigDecimal3.compareTo(bigDecimal) == 0);
                        if (bigDecimal3 == null) {
                            z = false;
                        } else {
                            z = bigDecimal3.compareTo(bigDecimal) < 0;
                        }
                        if (bigDecimal3 == null) {
                            z2 = false;
                        } else {
                            z2 = bigDecimal3.compareTo(bigDecimal2) > 0;
                        }
                        aVar = new sw.a(omnVar, z4, z5, z, z2);
                    }
                    return new zw2(uf00VarF, aVar, tkd0.a(bigDecimal2, (4 & 2) != 0, (4 & 4) != 0), tkd0.a(bigDecimal, (4 & 2) != 0, (4 & 4) != 0), fa60Var.i, fa60Var.h, xw2Var);
                }
                BigDecimal bigDecimal6 = it.next().a;
                String strA = tkd0.a(bigDecimal6, (4 & 2) != 0, (4 & 4) != 0);
                if (hyoVar instanceof hyo.a) {
                    try {
                        zi50.a aVar5 = zi50.b;
                        bVar2 = new skd0(new BigDecimal(((hyo.a) hyoVar).a.getText()));
                    } catch (Throwable th2) {
                        zi50.a aVar6 = zi50.b;
                        bVar2 = new zi50.b(th2);
                    }
                    if (bVar2 instanceof zi50.b) {
                        bVar2 = null;
                    }
                    skd0 skd0Var = (skd0) bVar2;
                    BigDecimal bigDecimal7 = skd0Var != null ? skd0Var.a : null;
                    if (bigDecimal7 != null) {
                        zEquals = Integer.valueOf(bigDecimal7.compareTo(bigDecimal6)).equals(0);
                    }
                    d860Var = fa60Var.a;
                    if (d860Var instanceof d860.a) {
                        if (bigDecimal6.compareTo(bigDecimal2) >= 0 || bigDecimal6.compareTo(bigDecimal) > 0) {
                        }
                        arrayList.add(new ez2(strA, zEquals, z3));
                    } else if (!(d860Var instanceof d860.b)) {
                        uhc.a();
                        return null;
                    }
                    z3 = false;
                    arrayList.add(new ez2(strA, zEquals, z3));
                } else if (!(hyoVar instanceof hyo.b)) {
                    uhc.a();
                    return null;
                }
                zEquals = false;
                d860Var = fa60Var.a;
                if (d860Var instanceof d860.a) {
                    if (bigDecimal6.compareTo(bigDecimal2) >= 0) {
                    }
                    arrayList.add(new ez2(strA, zEquals, z3));
                } else if (!(d860Var instanceof d860.b)) {
                    uhc.a();
                    return null;
                }
                z3 = false;
                arrayList.add(new ez2(strA, zEquals, z3));
            }
        }
    }

    public ga60(k5b k5bVar) {
        k5bVar.getClass();
        wwd0 wwd0VarA = xwd0.a(new fa60());
        this.a = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new hyo.a(new omn.b("0")));
        this.b = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(xw2.c.a);
        this.c = wwd0VarA3;
        ju90<ea60> ju90Var = new ju90<>();
        this.d = ju90Var;
        this.e = e1i.a(ju90Var);
        k1i k1iVarA = r1i.a(wwd0VarA, wwd0VarA2, wwd0VarA3, new f(4, null));
        this.f = e1i.e(ozh.c(k1iVarA, k5bVar), o8i0.d(this), q490.a.a, new zw2(0));
        kzh.d(new g1i(wwd0VarA, new a(null)), o8i0.d(this));
    }

    public final void x1(yw2 yw2Var) {
        Object bVar;
        yw2Var.getClass();
        boolean z = yw2Var instanceof yw2.m;
        wwd0 wwd0Var = this.a;
        wwd0 wwd0Var2 = this.b;
        if (z) {
            ijf0 ijf0Var = ((yw2.m) yw2Var).a;
            BigDecimal bigDecimal = ((fa60) wwd0Var.getValue()).c;
            wwd0Var2.getClass();
            bigDecimal.getClass();
            nk0 nk0Var = ijf0Var.a;
            if (StringsKt.M(nk0Var.b, "-", false)) {
                return;
            }
            String str = nk0Var.b;
            if (kotlin.text.c.u(str, ".", false)) {
                return;
            }
            Character chH = wae0.H(str);
            if ((chH == null || chH.charValue() != '.') && kotlin.text.c.u(str, "0", false) && str.length() > 1) {
                String strW0 = StringsKt.w0(str, '0');
                int length = strW0.length();
                ijf0Var = new ijf0(strW0, vlf0.a(length, length), 4);
            }
            if (StringsKt.U(ijf0Var.a.b)) {
                ijf0Var = new ijf0("0", vlf0.a(1, 1), 4);
            }
            String str2 = ijf0Var.a.b;
            try {
                zi50.a aVar = zi50.b;
                bVar = new skd0(new BigDecimal(str2));
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            skd0 skd0Var = (skd0) bVar;
            BigDecimal bigDecimal2 = skd0Var != null ? skd0Var.a : null;
            if (bigDecimal2 != null) {
                skd0 skd0Var2 = new skd0(bigDecimal2);
                if (bigDecimal2.scale() > 2) {
                    skd0Var2 = null;
                }
                BigDecimal bigDecimal3 = skd0Var2 != null ? skd0Var2.a : null;
                if (bigDecimal3 == null) {
                    return;
                }
                if (bigDecimal3.compareTo(bigDecimal) <= 0) {
                    wwd0Var2.setValue(new hyo.a(new omn.a(ijf0Var)));
                    return;
                }
                String strA = tkd0.a(bigDecimal, (4 & 2) != 0, (4 & 4) != 0);
                int length2 = strA.length();
                wwd0Var2.setValue(new hyo.a(new omn.a(new ijf0(strA, vlf0.a(length2, length2), 4))));
                return;
            }
            return;
        }
        if (yw2Var instanceof yw2.k) {
            BigDecimal bigDecimalB = q760.b(((yw2.k) yw2Var).a);
            if (bigDecimalB != null) {
                hyo.a aVarC = q760.c(bigDecimalB);
                wwd0Var2.getClass();
                wwd0Var2.k(null, aVarC);
                return;
            }
            return;
        }
        if (yw2Var.equals(yw2.a.a)) {
            q760.d(wwd0Var2, new b());
            return;
        }
        if (yw2Var.equals(yw2.l.a)) {
            q760.d(wwd0Var2, new c());
            return;
        }
        if (yw2Var.equals(yw2.i.a)) {
            q760.d(wwd0Var2, new d());
            return;
        }
        if (yw2Var.equals(yw2.j.a)) {
            q760.d(wwd0Var2, new e());
            return;
        }
        if (yw2Var.equals(yw2.f.a)) {
            wwd0Var2.getClass();
            q760.a(wwd0Var2);
            return;
        }
        if (yw2Var.equals(yw2.h.a)) {
            wwd0Var2.getClass();
            q760.a(wwd0Var2);
            return;
        }
        if (yw2Var.equals(yw2.e.a)) {
            hyo hyoVar = (hyo) wwd0Var2.getValue();
            boolean z2 = hyoVar instanceof hyo.b;
            ju90<ea60> ju90Var = this.d;
            if (z2) {
                hyo.b bVar2 = (hyo.b) hyoVar;
                ju90Var.a(new ea60.a(new d860.b(bVar2.a, bVar2.b)));
                return;
            }
            if (!(hyoVar instanceof hyo.a)) {
                uhc.a();
                return;
            }
            BigDecimal bigDecimalB2 = q760.b(((hyo.a) hyoVar).a.getText());
            if (bigDecimalB2 == null) {
                hyo.a aVarC2 = q760.c(((fa60) wwd0Var.getValue()).b);
                wwd0Var2.getClass();
                wwd0Var2.k(null, aVarC2);
                return;
            }
            BigDecimal bigDecimal4 = ((fa60) wwd0Var.getValue()).d;
            BigDecimal bigDecimal5 = ((fa60) wwd0Var.getValue()).c;
            bigDecimal4.getClass();
            bigDecimal5.getClass();
            if (bigDecimalB2.compareTo(bigDecimal4) >= 0 && bigDecimalB2.compareTo(bigDecimal5) <= 0) {
                ju90Var.a(new ea60.a(new d860.a(bigDecimalB2)));
                return;
            }
            hyo.a aVarC3 = q760.c(y1(bigDecimalB2));
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVarC3);
            return;
        }
        boolean zEquals = yw2Var.equals(yw2.c.a);
        wwd0 wwd0Var3 = this.c;
        if (zEquals) {
            xw2.a aVar3 = new xw2.a(((fa60) wwd0Var.getValue()).g, ((fa60) wwd0Var.getValue()).c.doubleValue(), ((fa60) wwd0Var.getValue()).d.doubleValue(), ((fa60) wwd0Var.getValue()).b.doubleValue());
            wwd0Var3.getClass();
            wwd0Var3.k(null, aVar3);
            return;
        }
        if (yw2Var.equals(yw2.d.a)) {
            wwd0Var3.setValue(xw2.b.a);
            return;
        }
        if (yw2Var.equals(yw2.g.a)) {
            wwd0Var3.setValue(xw2.c.a);
            return;
        }
        if (!(yw2Var instanceof yw2.n)) {
            if (!yw2Var.equals(yw2.b.a)) {
                uhc.a();
                return;
            }
            BigDecimal bigDecimal6 = ((fa60) wwd0Var.getValue()).b;
            bigDecimal6.getClass();
            hyo.a aVar4 = new hyo.a(new omn.b(tkd0.a(bigDecimal6, (4 & 2) != 0, (4 & 4) != 0)));
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar4);
            return;
        }
        yw2.n nVar = (yw2.n) yw2Var;
        GiftItem giftItem = nVar.a;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(nVar.b);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimal7 = skd0.b;
        hyo.b bVar3 = new hyo.b(giftItem, bigDecimalValueOf);
        wwd0Var2.getClass();
        wwd0Var2.k(null, bVar3);
        wwd0Var3.setValue(xw2.c.a);
    }

    public final BigDecimal y1(BigDecimal bigDecimal) {
        wwd0 wwd0Var = this.a;
        if (bigDecimal.compareTo(((fa60) wwd0Var.getValue()).d) < 0) {
            return ((fa60) wwd0Var.getValue()).d;
        }
        return bigDecimal.compareTo(((fa60) wwd0Var.getValue()).c) > 0 ? ((fa60) wwd0Var.getValue()).c : bigDecimal;
    }

    public final Unit z1(fa60 fa60Var) {
        Object bVar;
        d860 d860Var = fa60Var.a;
        if (d860Var instanceof d860.a) {
            BigDecimal bigDecimal = ((d860.a) d860Var).a;
            bigDecimal.getClass();
            bVar = new hyo.a(new omn.b(tkd0.a(bigDecimal, (4 & 2) != 0, (4 & 4) != 0)));
        } else {
            if (!(d860Var instanceof d860.b)) {
                uhc.a();
                return null;
            }
            d860.b bVar2 = (d860.b) d860Var;
            bVar = new hyo.b(bVar2.a, bVar2.b);
        }
        wwd0 wwd0Var = this.b;
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }
}
