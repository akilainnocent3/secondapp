package defpackage;

import com.sportygames.newcms.CMSRes;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class u03 extends j8i0 {
    public final k5b a;
    public final gl7 b;
    public final wwd0 c;
    public final v340 d;
    public final ju90<uz2> e;
    public final t340 f;

    @c0d(c = "com.sportygames.component.chip.betslider.BetSliderViewModel$amountState$1", f = "BetSliderViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements iaj<s03, wz2, CMSRes, v1b<? super vz2>, Object> {
        public /* synthetic */ s03 a;
        public /* synthetic */ wz2 b;
        public /* synthetic */ CMSRes c;

        public a(v1b<? super a> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(s03 s03Var, wz2 wz2Var, CMSRes cMSRes, v1b<? super vz2> v1bVar) {
            a aVar = u03.this.new a(v1bVar);
            aVar.a = s03Var;
            aVar.b = wz2Var;
            aVar.c = cMSRes;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            yj60 aVar;
            s03 s03Var = this.a;
            wz2 wz2Var = this.b;
            CMSRes cMSRes = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            double dDoubleValue = s03Var.c.doubleValue();
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.ENGLISH));
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String str = decimalFormat.format(dDoubleValue);
            str.getClass();
            boolean z = s03Var.d;
            if (z) {
                aVar = new yj60.a();
            } else {
                aVar = cMSRes != null ? new yj60.b.a(cMSRes) : null;
            }
            return new vz2(str, wz2Var, z, aVar);
        }
    }

    @c0d(c = "com.sportygames.component.chip.betslider.BetSliderViewModel$sliderState$1", f = "BetSliderViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements gaj<s03, CMSRes, v1b<? super t03>, Object> {
        public /* synthetic */ s03 a;
        public /* synthetic */ CMSRes b;

        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(s03 s03Var, CMSRes cMSRes, v1b<? super t03> v1bVar) {
            b bVar = u03.this.new b(v1bVar);
            bVar.a = s03Var;
            bVar.b = cMSRes;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object bVar2;
            Object bVar3;
            Number num;
            s03 s03Var = this.a;
            CMSRes cMSRes = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BigDecimal bigDecimal = s03Var.c;
            boolean z = s03Var.d;
            BigDecimal bigDecimal2 = s03Var.h;
            BigDecimal bigDecimal3 = s03Var.a;
            BigDecimal bigDecimal4 = s03Var.g;
            try {
                zi50.a aVar = zi50.b;
                BigDecimal bigDecimalSubtract = bigDecimal4.subtract(bigDecimal3);
                bigDecimalSubtract.getClass();
                BigDecimal bigDecimal5 = skd0.b;
                BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal2, RoundingMode.HALF_EVEN);
                bigDecimalDivide.getClass();
                BigDecimal scale = bigDecimalDivide.setScale(0, RoundingMode.CEILING);
                scale.getClass();
                bVar = new skd0(scale);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            skd0 skd0Var = (skd0) bVar;
            BigDecimal bigDecimal6 = skd0Var != null ? skd0Var.a : null;
            int iIntValue = bigDecimal6 != null ? bigDecimal6.intValue() : 0;
            try {
                BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal3);
                bigDecimalSubtract2.getClass();
                BigDecimal bigDecimal7 = skd0.b;
                BigDecimal bigDecimalDivide2 = bigDecimalSubtract2.divide(bigDecimal2, RoundingMode.HALF_EVEN);
                bigDecimalDivide2.getClass();
                bVar2 = new skd0(bigDecimalDivide2);
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            if (bVar2 instanceof zi50.b) {
                bVar2 = null;
            }
            skd0 skd0Var2 = (skd0) bVar2;
            BigDecimal bigDecimal8 = skd0Var2 != null ? skd0Var2.a : null;
            if (bigDecimal8 == null) {
                bigDecimal8 = skd0.b;
            }
            if (!z && bigDecimal8.compareTo(skd0.b) > 0) {
                BigDecimal bigDecimalMultiply = bigDecimal8.multiply(bigDecimal2);
                bigDecimalMultiply.getClass();
                BigDecimal bigDecimalAdd = bigDecimal3.add(bigDecimalMultiply);
                bigDecimalAdd.getClass();
                if (bigDecimalAdd.compareTo(bigDecimal4) >= 0) {
                    num = new Integer(iIntValue);
                } else {
                    try {
                        bVar3 = bigDecimal8.setScale(0, RoundingMode.HALF_UP);
                    } catch (Throwable th3) {
                        zi50.a aVar4 = zi50.b;
                        bVar3 = new zi50.b(th3);
                    }
                    num = (BigDecimal) (bVar3 instanceof zi50.b ? null : bVar3);
                    if (num == null) {
                        num = new Integer(0);
                    }
                }
            } else {
                num = new Integer(0);
            }
            return new t03(!z, fl7.a(bigDecimal3.doubleValue()), fl7.a(bigDecimal4.doubleValue()), num.floatValue(), new Pair(new Float(0.0f), new Float(iIntValue)), iIntValue - 1, cMSRes);
        }
    }

    public static final class c implements lyh<CMSRes> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ u03 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ u03 b;

            /* JADX INFO: renamed from: u03$c$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.component.chip.betslider.BetSliderViewModel$special$$inlined$map$1$2", f = "BetSliderViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1157a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1157a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, u03 u03Var) {
                this.a = myhVar;
                this.b = u03Var;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x009e  */
            /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1157a c1157a;
                BigDecimal bigDecimal;
                CMSRes cMSResB;
                gl7 gl7Var = this.b.b;
                if (v1bVar instanceof C1157a) {
                    c1157a = (C1157a) v1bVar;
                    int i = c1157a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1157a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1157a = new C1157a(v1bVar);
                    }
                } else {
                    c1157a = new C1157a(v1bVar);
                }
                Object obj2 = c1157a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1157a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    s03 s03Var = (s03) obj;
                    qcn<skd0> qcnVar = s03Var.f;
                    BigDecimal bigDecimal2 = s03Var.c;
                    if (qcnVar.isEmpty()) {
                        cMSResB = gl7Var.b(bigDecimal2);
                    } else {
                        Iterator<skd0> it = qcnVar.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                                break;
                            }
                            if (it.next().a.compareTo(bigDecimal2) > 0) {
                                break;
                            }
                            i3++;
                        }
                        Integer num = new Integer(i3);
                        if (num.intValue() < 0) {
                            num = null;
                        }
                        if (num == null) {
                            skd0 skd0Var = (skd0) CollectionsKt.d0(qcnVar);
                            bigDecimal = skd0Var != null ? skd0Var.a : null;
                            if (bigDecimal != null) {
                                bigDecimal2 = bigDecimal;
                            }
                        } else {
                            skd0 skd0Var2 = (skd0) CollectionsKt.V(Math.max(num.intValue() - 1, 0), qcnVar);
                            BigDecimal bigDecimal3 = skd0Var2 != null ? skd0Var2.a : null;
                            skd0 skd0Var3 = bigDecimal3 != null ? new skd0(bigDecimal3) : null;
                            BigDecimal bigDecimal4 = skd0Var3 != null ? skd0Var3.a : null;
                            if (bigDecimal4 != null) {
                                bigDecimal2 = bigDecimal4;
                            } else {
                                skd0 skd0Var4 = (skd0) CollectionsKt.d0(qcnVar);
                                if (skd0Var4 != null) {
                                }
                                if (bigDecimal != null) {
                                    bigDecimal2 = bigDecimal;
                                }
                            }
                        }
                        cMSResB = gl7Var.b(bigDecimal2);
                    }
                    c1157a.b = 1;
                    if (this.a.emit(cMSResB, c1157a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public c(wwd0 wwd0Var, u03 u03Var) {
            this.a = wwd0Var;
            this.b = u03Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super CMSRes> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar, this.b), v1bVar);
            return y5b.a;
        }
    }

    public static final class d implements lyh<wz2> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ u03 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ u03 b;

            /* JADX INFO: renamed from: u03$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.component.chip.betslider.BetSliderViewModel$special$$inlined$map$2$2", f = "BetSliderViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1158a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1158a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, u03 u03Var) {
                this.a = myhVar;
                this.b = u03Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1158a c1158a;
                if (v1bVar instanceof C1158a) {
                    c1158a = (C1158a) v1bVar;
                    int i = c1158a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1158a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1158a = new C1158a(v1bVar);
                    }
                } else {
                    c1158a = new C1158a(v1bVar);
                }
                Object obj2 = c1158a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1158a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    s03 s03Var = (s03) obj;
                    Object aVar = (s03Var.e.compareTo(s03Var.a) >= 0 || s03Var.d) ? wz2.b.a : new wz2.a(this.b.b.e());
                    c1158a.b = 1;
                    if (this.a.emit(aVar, c1158a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public d(wwd0 wwd0Var, u03 u03Var) {
            this.a = wwd0Var;
            this.b = u03Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super wz2> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar, this.b), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.component.chip.betslider.BetSliderViewModel$state$1", f = "BetSliderViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements gaj<vz2, t03, v1b<? super myo>, Object> {
        public /* synthetic */ vz2 a;
        public /* synthetic */ t03 b;

        @Override // defpackage.gaj
        public final Object invoke(vz2 vz2Var, t03 t03Var, v1b<? super myo> v1bVar) {
            e eVar = new e(3, v1bVar);
            eVar.a = vz2Var;
            eVar.b = t03Var;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            vz2 vz2Var = this.a;
            t03 t03Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new myo(t03Var, vz2Var);
        }
    }

    public u03(k5b k5bVar, gl7 gl7Var) {
        k5bVar.getClass();
        gl7Var.getClass();
        this.a = k5bVar;
        this.b = gl7Var;
        wwd0 wwd0VarA = xwd0.a(new s03());
        this.c = wwd0VarA;
        v340 v340VarY1 = y1(new c(wwd0VarA, this), null);
        this.d = y1(new n1i(y1(r1i.a(wwd0VarA, y1(new d(wwd0VarA, this), wz2.b.a), v340VarY1, new a(null)), new vz2(0)), y1(new n1i(wwd0VarA, v340VarY1, new b(null)), new t03(0)), new e(3, null)), new myo(0));
        ju90<uz2> ju90Var = new ju90<>();
        this.e = ju90Var;
        this.f = e1i.a(ju90Var);
    }

    public final void x1(xz2 xz2Var) {
        Object bVar;
        boolean z = xz2Var instanceof xz2.b;
        wwd0 wwd0Var = this.c;
        if (z) {
            wwd0Var.setValue(((xz2.b) xz2Var).a);
            return;
        }
        if (!(xz2Var instanceof xz2.a)) {
            uhc.a();
            return;
        }
        BigDecimal bigDecimal = ((s03) wwd0Var.getValue()).g;
        BigDecimal bigDecimal2 = ((s03) wwd0Var.getValue()).a;
        BigDecimal bigDecimal3 = ((s03) wwd0Var.getValue()).h;
        BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(((xz2.a) xz2Var).a));
        try {
            zi50.a aVar = zi50.b;
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
            bigDecimalSubtract.getClass();
            BigDecimal bigDecimal5 = skd0.b;
            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal3, RoundingMode.HALF_EVEN);
            bigDecimalDivide.getClass();
            BigDecimal scale = bigDecimalDivide.setScale(0, RoundingMode.CEILING);
            scale.getClass();
            bVar = new skd0(scale);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        skd0 skd0Var = (skd0) bVar;
        BigDecimal bigDecimal6 = skd0Var != null ? skd0Var.a : null;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(f.e(bigDecimal4.setScale(0, RoundingMode.HALF_UP).intValue(), 0, bigDecimal6 != null ? bigDecimal6.intValue() : 0));
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimal7 = skd0.b;
        BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(bigDecimal3);
        bigDecimalMultiply.getClass();
        BigDecimal bigDecimalAdd = bigDecimal2.add(bigDecimalMultiply);
        bigDecimalAdd.getClass();
        skd0 skd0Var2 = new skd0(bigDecimalAdd);
        skd0 skd0Var3 = new skd0(bigDecimal);
        if (skd0Var2.compareTo(skd0Var3) > 0) {
            skd0Var2 = skd0Var3;
        }
        this.e.a(new uz2.a(skd0Var2.a));
    }

    public final v340 y1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.a), o8i0.d(this), q490.a.a, obj);
    }
}
