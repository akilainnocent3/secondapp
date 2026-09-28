package defpackage;

import android.content.Context;
import androidx.transition.nfj.CaBJCMnsV;
import com.google.protobuf.Reader;
import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.common.ui.model.GiftItem;
import com.sportygames.common.ui.model.PromotionGiftsResponse;
import com.sportygames.newcms.CMSRes;
import com.sportygames.wheelanddeal.model.WDAutoSpinConfigModel;
import com.sportygames.wheelanddeal.model.WDRiskAmountModel;
import com.sportygames.wheelanddeal.model.WDUserInfoModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class yui0 extends j8i0 {
    public boolean A;
    public final wwd0 B;
    public final wwd0 C;
    public final wwd0 D;
    public final v340 E;
    public final v340 F;
    public final v340 G;
    public final v340 H;
    public final wwd0 I;
    public final wwd0 J;
    public final wwd0 K;
    public final wwd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final wwd0 R;
    public final wwd0 S;
    public final wwd0 T;
    public final v340 U;
    public final wwd0 V;
    public final v340 W;
    public final wwd0 X;
    public final v340 Y;
    public final wwd0 Z;
    public final Context a;
    public final wwd0 a0;
    public final com.sportygames.newcms.d b;
    public final wwd0 b0;
    public final en20 c;
    public final v340 c0;
    public final kh8 d;
    public final v340 d0;
    public final kti0 e;
    public final vmy f;
    public final pp5 i;
    public final String v;
    public final odd w;
    public final eal y;
    public int z;

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$1", f = "WDViewModel.kt", l = {497}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: yui0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$1$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C1364a extends tje0 implements Function2<qqi0, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ yui0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1364a(yui0 yui0Var, v1b<? super C1364a> v1bVar) {
                super(2, v1bVar);
                this.b = yui0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1364a c1364a = new C1364a(this.b, v1bVar);
                c1364a.a = obj;
                return c1364a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qqi0 qqi0Var, v1b<? super Unit> v1bVar) {
                return ((C1364a) create(qqi0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object value;
                qqi0 qqi0Var = (qqi0) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                wwd0 wwd0Var = this.b.M;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, ijf0.b((ijf0) value, String.valueOf(qqi0Var.b.getDefaultSpin()), 0L, 6)));
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                lyh lyhVarC = ozh.c(new g1i(yui0Var.O, new C1364a(yui0Var, null)), yui0Var.w);
                this.a = 1;
                if (kzh.a(lyhVarC, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$spinModeDataState$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a0 extends tje0 implements iaj<nui0, if2, ijf0, v1b<? super oui0>, Object> {
        public /* synthetic */ nui0 a;
        public /* synthetic */ if2 b;
        public /* synthetic */ ijf0 c;

        public a0(v1b<? super a0> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(nui0 nui0Var, if2 if2Var, ijf0 ijf0Var, v1b<? super oui0> v1bVar) {
            a0 a0Var = yui0.this.new a0(v1bVar);
            a0Var.a = nui0Var;
            a0Var.b = if2Var;
            a0Var.c = ijf0Var;
            return a0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            zoi0 bVar;
            int iIntValue;
            nui0 nui0Var = this.a;
            if2 if2Var = this.b;
            ijf0 ijf0Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yui0 yui0Var = yui0.this;
            WDRiskAmountModel wDRiskAmountModelE1 = yui0Var.E1();
            Double dH = kotlin.text.b.h(if2Var.getText());
            double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
            if (if2Var instanceof if2.a) {
                bVar = new zoi0.a(((if2.a) if2Var).a, Math.abs(dDoubleValue - wDRiskAmountModelE1.getMinAmount()) > 1.0E-6d, dDoubleValue > wDRiskAmountModelE1.getMinAmount(), dDoubleValue < wDRiskAmountModelE1.getMaxAmount(), dDoubleValue < wDRiskAmountModelE1.getMaxAmount());
            } else {
                if (!(if2Var instanceof if2.b)) {
                    uhc.a();
                    return null;
                }
                bVar = new zoi0.b(((if2.b) if2Var).a);
            }
            String strD1 = yui0.D1(String.valueOf(wDRiskAmountModelE1.getMaxAmount()));
            strD1.getClass();
            String strD2 = yui0.D1(String.valueOf(wDRiskAmountModelE1.getMinAmount()));
            strD2.getClass();
            yoi0 yoi0Var = new yoi0(strD1, strD2, bVar);
            if (nui0Var == nui0.a) {
                return new oui0.b(yoi0Var);
            }
            WDAutoSpinConfigModel wDAutoSpinConfigModel = ((qqi0) yui0Var.O.getValue()).b;
            nk0 nk0Var = ijf0Var.a;
            if (Intrinsics.g(nk0Var.b, "∞")) {
                iIntValue = Reader.READ_DONE;
            } else {
                Integer intOrNull = StringsKt.toIntOrNull(nk0Var.b);
                iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            }
            return new oui0.a(yoi0Var, new yoi0(String.valueOf(wDAutoSpinConfigModel.getMaxSpin()), String.valueOf(wDAutoSpinConfigModel.getMinSpin()), new zoi0.a(ijf0Var, iIntValue != wDAutoSpinConfigModel.getMinSpin(), iIntValue > wDAutoSpinConfigModel.getMinSpin(), iIntValue <= wDAutoSpinConfigModel.getMaxSpin(), true ^ Intrinsics.g(nk0Var.b, "∞"))));
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$2", f = "WDViewModel.kt", l = {513}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$2$1", f = "WDViewModel.kt", l = {505}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements gaj<qqi0, oti0, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ qqi0 b;
            public /* synthetic */ oti0 c;
            public final /* synthetic */ yui0 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yui0 yui0Var, v1b<? super a> v1bVar) {
                super(3, v1bVar);
                this.d = yui0Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(qqi0 qqi0Var, oti0 oti0Var, v1b<? super Unit> v1bVar) {
                a aVar = new a(this.d, v1bVar);
                aVar.b = qqi0Var;
                aVar.c = oti0Var;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String strD1;
                String strValueOf;
                qqi0 qqi0Var = this.b;
                oti0 oti0Var = this.c;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    WDRiskAmountModel wDRiskAmountModel = qqi0Var.a.get(oti0Var);
                    if (wDRiskAmountModel == null || (strValueOf = String.valueOf(wDRiskAmountModel.getDefaultAmount())) == null || (strD1 = yui0.D1(strValueOf)) == null) {
                        strD1 = "0.00";
                    }
                    wwd0 wwd0Var = this.d.L;
                    int length = strD1.length();
                    if2.a aVar = new if2.a(new ijf0(strD1, vlf0.a(length, length), 4));
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVar);
                    if (Unit.a == y5bVar) {
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

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                lyh lyhVarC = ozh.c(new n1i(yui0Var.O, yui0Var.P, new a(yui0Var, null)), yui0Var.w);
                this.a = 1;
                if (kzh.a(lyhVarC, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$state$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b0 extends tje0 implements iaj<hzs, xri0.a, ari0, v1b<? super pui0>, Object> {
        public /* synthetic */ hzs a;
        public /* synthetic */ xri0.a b;
        public /* synthetic */ ari0 c;

        @Override // defpackage.iaj
        public final Object d(hzs hzsVar, xri0.a aVar, ari0 ari0Var, v1b<? super pui0> v1bVar) {
            b0 b0Var = new b0(4, v1bVar);
            b0Var.a = hzsVar;
            b0Var.b = aVar;
            b0Var.c = ari0Var;
            return b0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hzs hzsVar = this.a;
            xri0 bVar = this.b;
            ari0 ari0Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!Intrinsics.g(hzsVar, hzs.a.a)) {
                if (!(hzsVar instanceof hzs.b)) {
                    uhc.a();
                    return null;
                }
                bVar = new xri0.b(((hzs.b) hzsVar).a);
            }
            return new pui0(bVar, ari0Var);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$3", f = "WDViewModel.kt", l = {519}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$3$1", f = "WDViewModel.kt", l = {517, 518}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<wsi0, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ yui0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yui0 yui0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = yui0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(wsi0 wsi0Var, v1b<? super Unit> v1bVar) {
                return ((a) create(wsi0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
            
                if (kotlin.Unit.a == r1) goto L15;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.b
                    wsi0 r0 = (defpackage.wsi0) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r7.a
                    r3 = 0
                    yui0 r4 = r7.c
                    r5 = 2
                    r6 = 1
                    if (r2 == 0) goto L21
                    if (r2 == r6) goto L1d
                    if (r2 != r5) goto L17
                    defpackage.uj50.b(r8)
                    goto L4a
                L17:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r7)
                    return r3
                L1d:
                    defpackage.uj50.b(r8)
                    goto L34
                L21:
                    defpackage.uj50.b(r8)
                    wwd0 r8 = r4.a0
                    hsi0$a r2 = hsi0.a.a
                    r7.b = r0
                    r7.a = r6
                    r8.setValue(r2)
                    kotlin.Unit r8 = kotlin.Unit.a
                    if (r8 != r1) goto L34
                    goto L49
                L34:
                    wwd0 r8 = r4.Z
                    gzo$a r2 = new gzo$a
                    r2.<init>(r0)
                    r7.b = r3
                    r7.a = r5
                    r8.getClass()
                    r8.k(r3, r2)
                    kotlin.Unit r7 = kotlin.Unit.a
                    if (r7 != r1) goto L4a
                L49:
                    return r1
                L4a:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: yui0.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                lyh lyhVarC = ozh.c(new g1i(yui0Var.Y, new a(yui0Var, null)), yui0Var.w);
                this.a = 1;
                if (kzh.a(lyhVarC, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a(CaBJCMnsV.ZqjTfoxZflA);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$turboState$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c0 extends tje0 implements iaj<Boolean, Boolean, Boolean, v1b<? super tui0>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        @Override // defpackage.iaj
        public final Object d(Boolean bool, Boolean bool2, Boolean bool3, v1b<? super tui0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            boolean zBooleanValue3 = bool3.booleanValue();
            c0 c0Var = new c0(4, v1bVar);
            c0Var.a = zBooleanValue;
            c0Var.b = zBooleanValue2;
            c0Var.c = zBooleanValue3;
            return c0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            boolean z3 = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return (z3 || !z2) ? new tui0(true, z) : new tui0(false, z);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$4", f = "WDViewModel.kt", l = {523}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$4$1", f = "WDViewModel.kt", l = {526, 531, 537, 538, 541, 548, 558, 561, 564, 572}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<mqi0, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ yui0 c;

            /* JADX INFO: renamed from: yui0$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$4$1$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C1365a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ mqi0 a;
                public final /* synthetic */ yui0 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1365a(mqi0 mqi0Var, yui0 yui0Var, v1b<? super C1365a> v1bVar) {
                    super(2, v1bVar);
                    this.a = mqi0Var;
                    this.b = yui0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1365a(this.a, this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1365a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    boolean z = ((mqi0.c) this.a).a;
                    yui0 yui0Var = this.b;
                    if (z) {
                        yui0Var.L1(eyi0.v0.t0);
                    } else {
                        yui0Var.L1(eyi0.v0.q0);
                    }
                    return Unit.a;
                }
            }

            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$4$1$2", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ yui0 a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(yui0 yui0Var, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.a = yui0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.a, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    this.a.L1(eyi0.v0.r0);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yui0 yui0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = yui0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(mqi0 mqi0Var, v1b<? super Unit> v1bVar) {
                return ((a) create(mqi0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:43:0x012b  */
            /* JADX WARN: Code duplicated, block: B:44:0x0130  */
            /* JADX WARN: Code duplicated, block: B:48:0x0145  */
            /* JADX WARN: Code duplicated, block: B:52:0x0155  */
            /* JADX WARN: Code duplicated, block: B:55:0x016b  */
            /* JADX WARN: Code duplicated, block: B:58:0x0197  */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
            
                if (kotlin.Unit.a == r7) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
            
                if (kotlin.Unit.a == r7) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x014e, code lost:
            
                if (r1.A1() == r7) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01a1, code lost:
            
                if (r1.A1() == r7) goto L60;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 454
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yui0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                wwd0 wwd0Var = yui0Var.Q;
                a aVar = new a(yui0Var, null);
                this.a = 1;
                if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$wheelPanelState$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d0 extends tje0 implements jaj<gzo, mqi0, hsi0, Float, v1b<? super mvi0>, Object> {
        public /* synthetic */ gzo a;
        public /* synthetic */ hsi0 b;
        public /* synthetic */ float c;

        public d0(v1b<? super d0> v1bVar) {
            super(5, v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nvi0 bVar;
            Integer numA;
            String str;
            Float fI;
            gzo gzoVar = this.a;
            hsi0 hsi0Var = this.b;
            float f = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ovi0 ovi0Var = (ovi0) yui0.this.X.getValue();
            if ((gzoVar instanceof gzo.b) || (gzoVar instanceof gzo.a)) {
                nvi0.a aVar = nvi0.a.a;
                uf00<gsi0> uf00Var = gzoVar.a().d;
                ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                for (gsi0 gsi0Var : uf00Var) {
                    Integer numA2 = hsi0Var.a();
                    arrayList.add(gsi0.a(gsi0Var, numA2 != null && numA2.intValue() == gsi0Var.a));
                }
                return new mvi0(ovi0Var, aVar, a4h.f(arrayList), hsi0Var);
            }
            float fFloatValue = 0.0f;
            if (gzoVar instanceof gzo.d) {
                gzo.d dVar = (gzo.d) gzoVar;
                ovi0 ovi0Var2 = dVar.b;
                ovi0.a aVar2 = ovi0Var2 instanceof ovi0.a ? (ovi0.a) ovi0Var2 : null;
                if (aVar2 != null && f >= 0.0f) {
                    ovi0.b bVar2 = new ovi0.b(ovi0Var.a(), aVar2.b, f + 720.0f);
                    nvi0.a aVar3 = nvi0.a.a;
                    uf00<gsi0> uf00Var2 = dVar.d.d;
                    ArrayList arrayList2 = new ArrayList(l48.r(uf00Var2, 10));
                    for (gsi0 gsi0Var2 : uf00Var2) {
                        Integer numA3 = hsi0Var.a();
                        arrayList2.add(gsi0.a(gsi0Var2, numA3 != null && numA3.intValue() == gsi0Var2.a));
                    }
                    return new mvi0(bVar2, aVar3, a4h.f(arrayList2), hsi0Var);
                }
            } else {
                if (!(gzoVar instanceof gzo.c)) {
                    uhc.a();
                    return null;
                }
                gzo.c cVar = (gzo.c) gzoVar;
                if2.b bVar3 = cVar.f;
                mqi0.c cVar2 = cVar.a;
                wsi0 wsi0Var = cVar.c;
                gsi0 gsi0Var3 = (gsi0) CollectionsKt.V(cVar2.c, wsi0Var.b);
                if (gsi0Var3 != null) {
                    ovi0.a aVar4 = new ovi0.a(ovi0Var.a(), cVar.b % 360.0f);
                    if (cVar2.a) {
                        long j = gsi0Var3.c;
                        float f2 = gsi0Var3.b;
                        float f3 = (float) cVar2.b;
                        if (bVar3 != null && (str = bVar3.a) != null && (fI = kotlin.text.b.i(str)) != null) {
                            fFloatValue = fI.floatValue();
                        }
                        bVar = new nvi0.b(j, f2, f3 - fFloatValue, bVar3 != null ? bVar3.a : null);
                    } else {
                        bVar = nvi0.a.a;
                    }
                    uf00<gsi0> uf00Var3 = wsi0Var.d;
                    ArrayList arrayList3 = new ArrayList(l48.r(uf00Var3, 10));
                    for (gsi0 gsi0Var4 : uf00Var3) {
                        int i = gsi0Var4.a;
                        arrayList3.add(gsi0.a(gsi0Var4, i == gsi0Var3.a || ((numA = hsi0Var.a()) != null && i == numA.intValue())));
                    }
                    return new mvi0(aVar4, bVar, a4h.f(arrayList3), hsi0Var);
                }
            }
            return null;
        }

        @Override // defpackage.jaj
        public final Object l(gzo gzoVar, mqi0 mqi0Var, hsi0 hsi0Var, Float f, v1b<? super mvi0> v1bVar) {
            float fFloatValue = f.floatValue();
            d0 d0Var = yui0.this.new d0(v1bVar);
            d0Var.a = gzoVar;
            d0Var.b = hsi0Var;
            d0Var.c = fFloatValue;
            return d0Var.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$5", f = "WDViewModel.kt", l = {594}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$5$1", f = "WDViewModel.kt", l = {582, 584}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<gzo, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ yui0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yui0 yui0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = yui0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(gzo gzoVar, v1b<? super Unit> v1bVar) {
                return ((a) create(gzoVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0044  */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
            
                if (kotlin.Unit.a == r3) goto L19;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    yui0 r0 = r9.c
                    wwd0 r1 = r0.L
                    java.lang.Object r2 = r9.b
                    gzo r2 = (defpackage.gzo) r2
                    y5b r3 = defpackage.y5b.a
                    int r4 = r9.a
                    r5 = 0
                    r6 = 2
                    r7 = 1
                    if (r4 == 0) goto L23
                    if (r4 == r7) goto L1f
                    if (r4 != r6) goto L19
                    defpackage.uj50.b(r10)
                    goto L73
                L19:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r9)
                    return r5
                L1f:
                    defpackage.uj50.b(r10)
                    goto L3c
                L23:
                    defpackage.uj50.b(r10)
                    boolean r10 = r2 instanceof gzo.c
                    if (r10 == 0) goto L73
                    wwd0 r10 = r0.N
                    gzo$c r2 = (gzo.c) r2
                    uui0 r2 = r2.d
                    r9.b = r5
                    r9.a = r7
                    r10.setValue(r2)
                    kotlin.Unit r10 = kotlin.Unit.a
                    if (r10 != r3) goto L3c
                    goto L72
                L3c:
                    java.lang.Object r10 = r1.getValue()
                    boolean r10 = r10 instanceof if2.b
                    if (r10 == 0) goto L73
                    if2$a r10 = new if2$a
                    ijf0 r2 = new ijf0
                    com.sportygames.wheelanddeal.model.WDRiskAmountModel r0 = r0.E1()
                    double r7 = r0.getDefaultAmount()
                    java.lang.String r0 = java.lang.String.valueOf(r7)
                    java.lang.String r0 = defpackage.yui0.D1(r0)
                    r0.getClass()
                    r7 = 0
                    r4 = 6
                    r2.<init>(r0, r7, r4)
                    r10.<init>(r2)
                    r9.b = r5
                    r9.a = r6
                    r1.getClass()
                    r1.k(r5, r10)
                    kotlin.Unit r9 = kotlin.Unit.a
                    if (r9 != r3) goto L73
                L72:
                    return r3
                L73:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: yui0.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                lyh lyhVarC = ozh.c(new g1i(yui0Var.Z, new a(yui0Var, null)), yui0Var.w);
                this.a = 1;
                if (kzh.a(lyhVarC, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$wheelPanelState$2", f = "WDViewModel.kt", l = {306}, m = "invokeSuspend", v = 1)
    public static final class e0 extends tje0 implements Function2<mvi0, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public e0(v1b<? super e0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e0 e0Var = yui0.this.new e0(v1bVar);
            e0Var.b = obj;
            return e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mvi0 mvi0Var, v1b<? super Unit> v1bVar) {
            return ((e0) create(mvi0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mvi0 mvi0Var = (mvi0) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = yui0.this.X;
                ovi0 ovi0Var = mvi0Var.a;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(ovi0Var);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$6", f = "WDViewModel.kt", l = {616}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$6$1", f = "WDViewModel.kt", l = {602}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<hzs, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ yui0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yui0 yui0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = yui0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hzs hzsVar, v1b<? super Unit> v1bVar) {
                return ((a) create(hzsVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                yui0 yui0Var = this.c;
                v340 v340Var = yui0Var.E;
                hzs hzsVar = (hzs) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    if (Intrinsics.g(hzsVar, hzs.a.a) && !((Boolean) yui0Var.H.a.getValue()).booleanValue()) {
                        wwd0 wwd0Var = yui0Var.T;
                        com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var.a.getValue();
                        eyi0 eyi0Var = eyi0.v0;
                        ari0.a aVar = new ari0.a(bVar.b(eyi0Var.v, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(eyi0Var.u, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(eyi0Var.t, ""), new bri0.x(false), new bri0.x(true));
                        this.b = null;
                        this.a = 1;
                        wwd0Var.getClass();
                        wwd0Var.k(null, aVar);
                        if (Unit.a == y5bVar) {
                            return y5bVar;
                        }
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

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                lyh lyhVarC = ozh.c(new g1i(yui0Var.J, new a(yui0Var, null)), yui0Var.w);
                this.a = 1;
                if (kzh.a(lyhVarC, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$7", f = "WDViewModel.kt", l = {629}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$7$2", f = "WDViewModel.kt", l = {622}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<nui0, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ yui0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yui0 yui0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = yui0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(nui0 nui0Var, v1b<? super Unit> v1bVar) {
                return ((a) create(nui0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    yui0 yui0Var = this.b;
                    WDRiskAmountModel wDRiskAmountModelE1 = yui0Var.E1();
                    wwd0 wwd0Var = yui0Var.L;
                    String strD1 = yui0.D1(String.valueOf(wDRiskAmountModelE1.getDefaultAmount()));
                    strD1.getClass();
                    if2.a aVar = new if2.a(new ijf0(strD1, 0L, 6));
                    this.a = 1;
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVar);
                    if (Unit.a == y5bVar) {
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

        public static final class b implements lyh<nui0> {
            public final /* synthetic */ lyh a;
            public final /* synthetic */ yui0 b;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;
                public final /* synthetic */ yui0 b;

                /* JADX INFO: renamed from: yui0$g$b$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$7$invokeSuspend$$inlined$filter$1$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class C1366a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1366a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(myh myhVar, yui0 yui0Var) {
                    this.a = myhVar;
                    this.b = yui0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C1366a c1366a;
                    if (v1bVar instanceof C1366a) {
                        c1366a = (C1366a) v1bVar;
                        int i = c1366a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1366a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1366a = new C1366a(v1bVar);
                        }
                    } else {
                        c1366a = new C1366a(v1bVar);
                    }
                    Object obj2 = c1366a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1366a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (this.b.L.getValue() instanceof if2.b) {
                            c1366a.b = 1;
                            if (this.a.emit(obj, c1366a) == y5bVar) {
                                return y5bVar;
                            }
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

            public b(wwd0 wwd0Var, yui0 yui0Var) {
                this.a = wwd0Var;
                this.b = yui0Var;
            }

            @Override // defpackage.lyh
            public final Object collect(myh<? super nui0> myhVar, v1b v1bVar) {
                Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                lyh lyhVarC = ozh.c(new g1i(new b(yui0Var.b0, yui0Var), new a(yui0Var, null)), yui0Var.w);
                this.a = 1;
                if (kzh.a(lyhVarC, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$controlPanelState$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements gaj<dpi0, Boolean, v1b<? super Pair<? extends dpi0, ? extends Boolean>>, Object> {
        public /* synthetic */ dpi0 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(dpi0 dpi0Var, Boolean bool, v1b<? super Pair<? extends dpi0, ? extends Boolean>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            h hVar = new h(3, v1bVar);
            hVar.a = dpi0Var;
            hVar.b = zBooleanValue;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            dpi0 dpi0Var = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(dpi0Var, Boolean.valueOf(z));
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$controlPanelState$2", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements kaj<oui0, wsi0, Boolean, tui0, Pair<? extends dpi0, ? extends Boolean>, v1b<? super zqi0>, Object> {
        public /* synthetic */ oui0 a;
        public /* synthetic */ wsi0 b;
        public /* synthetic */ boolean c;
        public /* synthetic */ tui0 d;
        public /* synthetic */ Pair e;

        public i(v1b<? super i> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(oui0 oui0Var, wsi0 wsi0Var, Boolean bool, tui0 tui0Var, Pair<? extends dpi0, ? extends Boolean> pair, v1b<? super zqi0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            i iVar = yui0.this.new i(v1bVar);
            iVar.a = oui0Var;
            iVar.b = wsi0Var;
            iVar.c = zBooleanValue;
            iVar.d = tui0Var;
            iVar.e = pair;
            return iVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            oui0 oui0Var = this.a;
            wsi0 wsi0Var = this.b;
            boolean z = this.c;
            tui0 tui0Var = this.d;
            Pair pair = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            dpi0 dpi0Var = (dpi0) pair.a;
            boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
            int i = wsi0Var.e;
            oti0 oti0Var = wsi0Var.a;
            String strValueOf = String.valueOf(i);
            yui0 yui0Var = yui0.this;
            v340 v340Var = yui0Var.U;
            v340 v340Var2 = yui0Var.W;
            int i2 = wsi0Var.e;
            return new zqi0(z, oui0Var, new vri0(strValueOf, yui0.H1(v340Var2, new Integer(i2)) != null, yui0.F1(v340Var2, new Integer(i2)) != null), new vri0(((com.sportygames.newcms.b) yui0Var.E.a.getValue()).b(oti0Var.b, ""), yui0.H1(v340Var, oti0Var) != null, yui0.F1(v340Var, oti0Var) != null), dpi0Var, tui0Var, zBooleanValue);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$handleEvent$15", f = "WDViewModel.kt", l = {978}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new j(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yui0 yui0Var = yui0.this;
                en20 en20Var = yui0Var.c;
                boolean z = !((Boolean) yui0Var.F.a.getValue()).booleanValue();
                this.a = 1;
                if (en20Var.a("key - wheel and deal turbo mode", z, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$handleEvent$18", f = "WDViewModel.kt", l = {1035}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ bri0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(bri0 bri0Var, v1b<? super k> v1bVar) {
            super(2, v1bVar);
            this.c = bri0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yui0.this.new k(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                en20 en20Var = yui0.this.c;
                boolean z = ((bri0.x) this.c).a;
                this.a = 1;
                if (en20Var.a("key-WD-one-tap-bet", z, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$handleEvent$19", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements Function2<mk50<? extends List<? extends CommonGameDetails>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ bri0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(bri0 bri0Var, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.c = bri0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = yui0.this.new l(this.c, v1bVar);
            lVar.a = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mk50<? extends List<? extends CommonGameDetails>> mk50Var, v1b<? super Unit> v1bVar) {
            return ((l) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            iwg bVar;
            mk50 mk50Var = (mk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(mk50Var, mk50.b.a)) {
                bVar = iwg.a.a;
            } else {
                mk50.c cVar = mk50Var instanceof mk50.c ? (mk50.c) mk50Var : null;
                bVar = new iwg.b(cVar != null ? (List) cVar.a : null);
            }
            wwd0 wwd0Var = yui0.this.T;
            ari0.e eVar = new ari0.e(null, bVar, ((bri0.i) this.c).a);
            wwd0Var.getClass();
            wwd0Var.k(null, eVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$hasGiftButton$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends tje0 implements gaj<nui0, PromotionGiftsResponse, v1b<? super Boolean>, Object> {
        public /* synthetic */ nui0 a;
        public /* synthetic */ PromotionGiftsResponse b;

        @Override // defpackage.gaj
        public final Object invoke(nui0 nui0Var, PromotionGiftsResponse promotionGiftsResponse, v1b<? super Boolean> v1bVar) {
            m mVar = new m(3, v1bVar);
            mVar.a = nui0Var;
            mVar.b = promotionGiftsResponse;
            return mVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001c  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            List<GiftItem> entityList;
            nui0 nui0Var = this.a;
            PromotionGiftsResponse promotionGiftsResponse = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (nui0Var == nui0.a && (entityList = promotionGiftsResponse.getEntityList()) != null) {
                z = entityList.isEmpty() ^ true;
            }
            return Boolean.valueOf(z);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$isPanelEdit$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class n extends tje0 implements iaj<gzo, mqi0, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ gzo a;
        public /* synthetic */ mqi0 b;
        public /* synthetic */ boolean c;

        @Override // defpackage.iaj
        public final Object d(gzo gzoVar, mqi0 mqi0Var, Boolean bool, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            n nVar = new n(4, v1bVar);
            nVar.a = gzoVar;
            nVar.b = mqi0Var;
            nVar.c = zBooleanValue;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            gzo gzoVar = this.a;
            mqi0 mqi0Var = this.b;
            boolean z = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(((gzoVar instanceof gzo.d) || (gzoVar instanceof gzo.b) || (mqi0Var instanceof mqi0.b) || !z) ? false : true);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$loadedState$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends tje0 implements gaj<kui0, nri0, v1b<? super Pair<? extends kui0, ? extends nri0>>, Object> {
        public /* synthetic */ kui0 a;
        public /* synthetic */ nri0 b;

        @Override // defpackage.gaj
        public final Object invoke(kui0 kui0Var, nri0 nri0Var, v1b<? super Pair<? extends kui0, ? extends nri0>> v1bVar) {
            o oVar = new o(3, v1bVar);
            oVar.a = kui0Var;
            oVar.b = nri0Var;
            return oVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kui0 kui0Var = this.a;
            nri0 nri0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(kui0Var, nri0Var);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$loadedState$2", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements kaj<mvi0, uui0, zqi0, Boolean, Pair<? extends kui0, ? extends nri0>, v1b<? super xri0.a>, Object> {
        public /* synthetic */ mvi0 a;
        public /* synthetic */ uui0 b;
        public /* synthetic */ zqi0 c;
        public /* synthetic */ boolean d;
        public /* synthetic */ Pair e;

        public p(v1b<? super p> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(mvi0 mvi0Var, uui0 uui0Var, zqi0 zqi0Var, Boolean bool, Pair<? extends kui0, ? extends nri0> pair, v1b<? super xri0.a> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            p pVar = yui0.this.new p(v1bVar);
            pVar.a = mvi0Var;
            pVar.b = uui0Var;
            pVar.c = zqi0Var;
            pVar.d = zBooleanValue;
            pVar.e = pair;
            return pVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mvi0 mvi0Var = this.a;
            uui0 uui0Var = this.b;
            zqi0 zqi0Var = this.c;
            boolean z = this.d;
            Pair pair = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new xri0.a(mvi0Var, zqi0Var, (kui0) pair.a, (nri0) pair.b, z, uui0Var, (WDUserInfoModel) yui0.this.I.getValue());
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$newWheelAngle$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class q extends tje0 implements gaj<gzo, mqi0, v1b<? super Float>, Object> {
        public /* synthetic */ gzo a;

        public q(v1b<? super q> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(gzo gzoVar, mqi0 mqi0Var, v1b<? super Float> v1bVar) {
            q qVar = yui0.this.new q(v1bVar);
            qVar.a = gzoVar;
            return qVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            gzo gzoVar = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            float fI1 = -1.0f;
            if (gzoVar instanceof gzo.d) {
                gzo.d dVar = (gzo.d) gzoVar;
                ovi0 ovi0Var = dVar.b;
                ovi0.a aVar = ovi0Var instanceof ovi0.a ? (ovi0.a) ovi0Var : null;
                if (aVar == null) {
                    return new Float(-1.0f);
                }
                fI1 = yui0.I1(aVar, dVar.a);
            }
            return new Float(fI1);
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$riskList$2", f = "WDViewModel.kt", l = {178}, m = "invokeSuspend", v = 1)
    public static final class r extends tje0 implements Function2<uf00<? extends oti0>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public r(v1b<? super r> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            r rVar = yui0.this.new r(v1bVar);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(uf00<? extends oti0> uf00Var, v1b<? super Unit> v1bVar) {
            return ((r) create(uf00Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var = yui0.this.P;
            uf00 uf00Var = (uf00) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (uf00Var.contains(wwd0Var.getValue())) {
                    return Unit.a;
                }
                oti0 oti0Var = oti0.d;
                if (!uf00Var.contains(oti0Var)) {
                    oti0Var = null;
                }
                if (oti0Var == null) {
                    oti0Var = (oti0) CollectionsKt.firstOrNull(uf00Var);
                }
                if (oti0Var != null) {
                    this.b = null;
                    this.a = 1;
                    wwd0Var.getClass();
                    wwd0Var.k(null, oti0Var);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
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

    public static final class s<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((oti0) t).ordinal()).compareTo(Integer.valueOf(((oti0) t2).ordinal()));
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$segmentList$2", f = "WDViewModel.kt", l = {190}, m = "invokeSuspend", v = 1)
    public static final class t extends tje0 implements Function2<uf00<? extends Integer>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public t(v1b<? super t> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            t tVar = yui0.this.new t(v1bVar);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(uf00<? extends Integer> uf00Var, v1b<? super Unit> v1bVar) {
            return ((t) create(uf00Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var = yui0.this.V;
            uf00 uf00Var = (uf00) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (uf00Var.contains(wwd0Var.getValue())) {
                    return Unit.a;
                }
                Integer num = new Integer(30);
                if (!uf00Var.contains(new Integer(num.intValue()))) {
                    num = null;
                }
                if (num == null) {
                    num = (Integer) CollectionsKt.firstOrNull(uf00Var);
                }
                if (num != null) {
                    Integer num2 = new Integer(num.intValue());
                    this.b = null;
                    this.a = 1;
                    wwd0Var.getClass();
                    wwd0Var.k(null, num2);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
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

    public static final class u<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((Number) t).intValue()).compareTo(Integer.valueOf(((Number) t2).intValue()));
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$selectedPayout$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class v extends tje0 implements iaj<uf00<? extends wsi0>, oti0, Integer, v1b<? super wsi0>, Object> {
        public /* synthetic */ uf00 a;
        public /* synthetic */ oti0 b;
        public /* synthetic */ int c;

        @Override // defpackage.iaj
        public final Object d(uf00<? extends wsi0> uf00Var, oti0 oti0Var, Integer num, v1b<? super wsi0> v1bVar) {
            int iIntValue = num.intValue();
            v vVar = new v(4, v1bVar);
            vVar.a = uf00Var;
            vVar.b = oti0Var;
            vVar.c = iIntValue;
            return vVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            uf00 uf00Var = this.a;
            oti0 oti0Var = this.b;
            int i = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Iterator<E> it = uf00Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                wsi0 wsi0Var = (wsi0) next;
                if (wsi0Var.e == i && wsi0Var.a == oti0Var) {
                    break;
                }
            }
            wsi0 wsi0Var2 = (wsi0) next;
            return wsi0Var2 == null ? new wsi0(0) : wsi0Var2;
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$selectedPayout$2", f = "WDViewModel.kt", l = {203}, m = "invokeSuspend", v = 1)
    public static final class w extends tje0 implements Function2<wsi0, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public w(v1b<? super w> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            w wVar = yui0.this.new w(v1bVar);
            wVar.b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wsi0 wsi0Var, v1b<? super Unit> v1bVar) {
            return ((w) create(wsi0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wsi0 wsi0Var = (wsi0) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = yui0.this.X;
                uf00<gsi0> uf00Var = wsi0Var.b;
                ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                Iterator<gsi0> it = uf00Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j58(it.next().c));
                }
                ovi0.a aVar = new ovi0.a(a4h.f(arrayList), 360.0f - ((360.0f / wsi0Var.b.size()) / 2.0f));
                this.b = null;
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
                if (Unit.a == y5bVar) {
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

    public static final class x implements lyh<uf00<? extends oti0>> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: yui0$x$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$special$$inlined$map$1$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1367a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1367a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1367a c1367a;
                if (v1bVar instanceof C1367a) {
                    c1367a = (C1367a) v1bVar;
                    int i = c1367a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1367a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1367a = new C1367a(v1bVar);
                    }
                } else {
                    c1367a = new C1367a(v1bVar);
                }
                Object obj2 = c1367a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1367a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    uf00 uf00Var = (uf00) obj;
                    ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                    Iterator<E> it = uf00Var.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((wsi0) it.next()).a);
                    }
                    uf00 uf00VarF = a4h.f(CollectionsKt.r0(CollectionsKt.A0(CollectionsKt.D0(arrayList)), new s()));
                    c1367a.b = 1;
                    if (this.a.emit(uf00VarF, c1367a) == y5bVar) {
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

        public x(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends oti0>> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    public static final class y implements lyh<uf00<? extends Integer>> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: yui0$y$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$special$$inlined$map$2$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1368a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1368a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1368a c1368a;
                if (v1bVar instanceof C1368a) {
                    c1368a = (C1368a) v1bVar;
                    int i = c1368a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1368a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1368a = new C1368a(v1bVar);
                    }
                } else {
                    c1368a = new C1368a(v1bVar);
                }
                Object obj2 = c1368a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1368a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    uf00 uf00Var = (uf00) obj;
                    ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                    Iterator<E> it = uf00Var.iterator();
                    while (it.hasNext()) {
                        bki0.a(((wsi0) it.next()).e, arrayList);
                    }
                    uf00 uf00VarF = a4h.f(CollectionsKt.r0(CollectionsKt.A0(CollectionsKt.D0(arrayList)), new u()));
                    c1368a.b = 1;
                    if (this.a.emit(uf00VarF, c1368a) == y5bVar) {
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

        public y(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends Integer>> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$spinButtonState$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class z extends tje0 implements kaj<Boolean, nui0, Boolean, if2, ijf0, v1b<? super dpi0>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ nui0 b;
        public /* synthetic */ boolean c;
        public /* synthetic */ if2 d;
        public /* synthetic */ ijf0 e;

        public z(v1b<? super z> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(Boolean bool, nui0 nui0Var, Boolean bool2, if2 if2Var, ijf0 ijf0Var, v1b<? super dpi0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            z zVar = yui0.this.new z(v1bVar);
            zVar.a = zBooleanValue;
            zVar.b = nui0Var;
            zVar.c = zBooleanValue2;
            zVar.d = if2Var;
            zVar.e = ijf0Var;
            return zVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0035  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            nui0 nui0Var = this.b;
            boolean z2 = this.c;
            if2 if2Var = this.d;
            ijf0 ijf0Var = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yui0 yui0Var = yui0.this;
            WDRiskAmountModel wDRiskAmountModelE1 = yui0Var.E1();
            Double dH = kotlin.text.b.h(if2Var.getText());
            Integer num = null;
            if (dH != null) {
                double dDoubleValue = dH.doubleValue();
                double minAmount = wDRiskAmountModelE1.getMinAmount();
                if (dDoubleValue > wDRiskAmountModelE1.getMaxAmount() || minAmount > dDoubleValue) {
                    dH = null;
                }
            } else {
                dH = null;
            }
            boolean z3 = false;
            boolean z4 = dH != null;
            if (nui0Var == nui0.a) {
                return !z ? dpi0.c.a : new dpi0.b(z4);
            }
            String str = ijf0Var.a.b;
            if (Intrinsics.g(str, "∞")) {
                str = "2147483647";
            }
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull != null && intOrNull.intValue() >= ((qqi0) yui0Var.O.getValue()).b.getMinSpin()) {
                num = intOrNull;
            }
            boolean z5 = num != null;
            if (!z) {
                return z2 ? dpi0.e.a : dpi0.d.a;
            }
            if (z4 && z5) {
                z3 = true;
            }
            return new dpi0.a(z3);
        }
    }

    public yui0(Context context, com.sportygames.newcms.d dVar, en20 en20Var, kh8 kh8Var, kti0 kti0Var, vmy vmyVar, pp5 pp5Var, String str) {
        context.getClass();
        dVar.getClass();
        en20Var.getClass();
        kh8Var.getClass();
        kti0Var.getClass();
        vmyVar.getClass();
        pp5Var.getClass();
        this.a = context;
        this.b = dVar;
        this.c = en20Var;
        this.d = kh8Var;
        this.e = kti0Var;
        this.f = vmyVar;
        this.i = pp5Var;
        this.v = str;
        pfd pfdVar = fse.a;
        odd oddVar = odd.b;
        this.w = oddVar;
        this.y = new eal();
        this.z = -1;
        wwd0 wwd0VarA = xwd0.a(new PromotionGiftsResponse(m2g.a, 0, 0, 0));
        this.B = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(nri0.a.a);
        this.C = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(new com.sportygames.newcms.b(0));
        this.D = wwd0VarA3;
        this.E = e1i.b(wwd0VarA3);
        lyh lyhVarC = ozh.c(en20Var.getBooleanByFlow("key - wheel and deal turbo mode", false), oddVar);
        et7 et7VarD = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, bool);
        this.F = v340VarE;
        lyh lyhVarC2 = ozh.c(en20Var.getBooleanByFlow("key-WD-music", true), oddVar);
        et7 et7VarD2 = o8i0.d(this);
        Boolean bool2 = Boolean.TRUE;
        v340 v340VarE2 = e1i.e(lyhVarC2, et7VarD2, kwd0Var, bool2);
        this.G = e1i.e(ozh.c(en20Var.getBooleanByFlow("key-WD-sound", true), oddVar), o8i0.d(this), kwd0Var, bool2);
        this.H = e1i.e(ozh.c(en20Var.getBooleanByFlow("key-WD-one-tap-bet", false), oddVar), o8i0.d(this), kwd0Var, bool);
        this.I = xwd0.a(new WDUserInfoModel(null, null, 3, null));
        wwd0 wwd0VarA4 = xwd0.a(new hzs.b(0.0f));
        this.J = wwd0VarA4;
        n1a0 n1a0Var = n1a0.c;
        wwd0 wwd0VarA5 = xwd0.a(n1a0Var);
        this.K = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(new if2.a(new ijf0((String) null, 0L, 7)));
        this.L = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(new ijf0((String) null, 0L, 7));
        this.M = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(new uui0(0));
        this.N = wwd0VarA8;
        this.O = xwd0.a(new qqi0(0));
        wwd0 wwd0VarA9 = xwd0.a(oti0.d);
        this.P = wwd0VarA9;
        wwd0 wwd0VarA10 = xwd0.a(mqi0.a.a);
        this.Q = wwd0VarA10;
        wwd0 wwd0VarA11 = xwd0.a(kui0.c.a);
        this.R = wwd0VarA11;
        wwd0 wwd0VarA12 = xwd0.a(bool2);
        this.S = wwd0VarA12;
        ari0.c cVar = ari0.c.a;
        wwd0 wwd0VarA13 = xwd0.a(cVar);
        this.T = wwd0VarA13;
        this.U = e1i.e(ozh.c(new g1i(new x(wwd0VarA5), new r(null)), oddVar), o8i0.d(this), kwd0Var, n1a0Var);
        wwd0 wwd0VarA14 = xwd0.a(0);
        this.V = wwd0VarA14;
        this.W = e1i.e(ozh.c(new g1i(new y(wwd0VarA5), new t(null)), oddVar), o8i0.d(this), kwd0Var, n1a0Var);
        this.X = xwd0.a(new ovi0.a(n1a0.c, 0.0f));
        v340 v340VarE3 = e1i.e(ozh.c(new g1i(r1i.a(wwd0VarA5, wwd0VarA9, wwd0VarA14, new v(4, null)), new w(null)), oddVar), o8i0.d(this), kwd0Var, new wsi0(0));
        this.Y = v340VarE3;
        wwd0 wwd0VarA15 = xwd0.a(new gzo.a((wsi0) v340VarE3.a.getValue()));
        this.Z = wwd0VarA15;
        wwd0 wwd0VarA16 = xwd0.a(hsi0.a.a);
        this.a0 = wwd0VarA16;
        v340 v340VarE4 = e1i.e(ozh.c(new g1i(new f1i(r1i.b(wwd0VarA15, wwd0VarA10, wwd0VarA16, e1i.e(ozh.c(new n1i(wwd0VarA15, wwd0VarA10, new q(null)), oddVar), o8i0.d(this), kwd0Var, Float.valueOf(-1.0f)), new d0(null))), new e0(null)), oddVar), o8i0.d(this), kwd0Var, new mvi0(0));
        wwd0 wwd0VarA17 = xwd0.a(nui0.a);
        this.b0 = wwd0VarA17;
        v340 v340VarE5 = e1i.e(ozh.c(new n1i(wwd0VarA17, wwd0VarA, new m(3, null)), oddVar), o8i0.d(this), kwd0Var, bool);
        v340 v340VarE6 = e1i.e(ozh.c(r1i.a(wwd0VarA17, wwd0VarA6, wwd0VarA7, new a0(null)), oddVar), o8i0.d(this), kwd0Var, new oui0.b(new yoi0(0)));
        v340 v340VarE7 = e1i.e(ozh.c(r1i.a(wwd0VarA15, wwd0VarA10, wwd0VarA12, new n(4, null)), oddVar), o8i0.d(this), kwd0Var, bool2);
        v340 v340VarE8 = e1i.e(ozh.c(r1i.c(v340VarE7, wwd0VarA17, wwd0VarA12, wwd0VarA6, wwd0VarA7, new z(null)), oddVar), o8i0.d(this), kwd0Var, new dpi0.b(true));
        this.c0 = v340VarE8;
        this.d0 = e1i.e(r1i.a(wwd0VarA4, e1i.e(r1i.c(v340VarE4, wwd0VarA8, e1i.e(ozh.c(r1i.c(v340VarE6, v340VarE3, v340VarE7, e1i.e(ozh.c(r1i.a(v340VarE, wwd0VarA12, v340VarE7, new c0(4, null)), oddVar), o8i0.d(this), kwd0Var, new tui0(0)), new n1i(v340VarE8, v340VarE5, new h(3, null)), new i(null)), oddVar), o8i0.d(this), kwd0Var, new zqi0(0)), v340VarE2, new n1i(wwd0VarA11, wwd0VarA2, new o(3, null)), new p(null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new xri0.a(0)), wwd0VarA13, new b0(4, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new pui0(new xri0.b(0.0f), cVar));
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
        ej5.c(o8i0.d(this), null, null, new d(null), 3);
        ej5.c(o8i0.d(this), null, null, new e(null), 3);
        ej5.c(o8i0.d(this), null, null, new f(null), 3);
        ej5.c(o8i0.d(this), null, null, new g(null), 3);
    }

    public static String D1(String str) {
        Double dH = kotlin.text.b.h(str);
        return BigDecimal.valueOf(dH != null ? dH.doubleValue() : 0.0d).setScale(2, RoundingMode.DOWN).toPlainString();
    }

    public static Object F1(v340 v340Var, Object obj) {
        uf00 uf00Var = (uf00) v340Var.a.getValue();
        int iIndexOf = uf00Var.indexOf(obj);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return CollectionsKt.V(numValueOf.intValue() + 1, uf00Var);
        }
        return null;
    }

    public static Object H1(v340 v340Var, Object obj) {
        uf00 uf00Var = (uf00) v340Var.a.getValue();
        int iIndexOf = uf00Var.indexOf(obj);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return CollectionsKt.V(numValueOf.intValue() - 1, uf00Var);
        }
        return null;
    }

    public static float I1(ovi0 ovi0Var, mqi0.c cVar) {
        ovi0.a aVar = ovi0Var instanceof ovi0.a ? (ovi0.a) ovi0Var : null;
        if (aVar == null) {
            return 0.0f;
        }
        uf00<j58> uf00Var = aVar.a;
        float size = 360.0f / uf00Var.size();
        int size2 = uf00Var.size() - cVar.c;
        lx30.INSTANCE.getClass();
        float fD = ((size * size2) - (((lx30.b.d() * 0.8f) + 0.099999994f) * size)) % 360.0f;
        return fD < aVar.b ? fD + 360.0f : fD;
    }

    public static void M1(wwd0 wwd0Var, String str) {
        Object value;
        if2 bVar;
        do {
            value = wwd0Var.getValue();
            if2 if2Var = (if2) value;
            if (if2Var instanceof if2.a) {
                ijf0 ijf0Var = ((if2.a) if2Var).a;
                int length = str.length();
                bVar = new if2.a(ijf0.b(ijf0Var, str, vlf0.a(length, length), 4));
            } else {
                if (!(if2Var instanceof if2.b)) {
                    uhc.a();
                    return;
                }
                String str2 = ((if2.b) if2Var).b;
                str.getClass();
                str2.getClass();
                bVar = new if2.b(str, str2);
            }
        } while (!wwd0Var.g(value, bVar));
    }

    public static void N1(wwd0 wwd0Var, String str) {
        Object value;
        int length;
        do {
            value = wwd0Var.getValue();
            length = str.length();
        } while (!wwd0Var.g(value, ijf0.b((ijf0) value, str, vlf0.a(length, length), 4)));
    }

    public final Unit A1() {
        if (this.b0.getValue() == nui0.b) {
            wwd0 wwd0Var = this.M;
            Integer intOrNull = StringsKt.toIntOrNull(((ijf0) wwd0Var.getValue()).a.b);
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            if (iIntValue > 0) {
                ijf0 ijf0VarB = ijf0.b((ijf0) wwd0Var.getValue(), String.valueOf(iIntValue - 1), 0L, 6);
                wwd0Var.getClass();
                wwd0Var.k(null, ijf0VarB);
                Unit unit = Unit.a;
                y5b y5bVar = y5b.a;
                return unit;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e2 A[PHI: r10
      0x00e2: PHI (r10v3 java.lang.Throwable) = (r10v0 java.lang.Throwable), (r10v0 java.lang.Throwable), (r10v25 java.lang.Throwable) binds: [B:34:0x00a2, B:36:0x00de, B:18:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x0220  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (kotlin.Unit.a == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
    
        if (kotlin.Unit.a == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018f, code lost:
    
        if (kotlin.Unit.a == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cd, code lost:
    
        if (kotlin.Unit.a == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0208, code lost:
    
        if (kotlin.Unit.a == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021a, code lost:
    
        if (kotlin.Unit.a == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0254, code lost:
    
        if (kotlin.Unit.a == r1) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B1(java.lang.Throwable r10, defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yui0.B1(java.lang.Throwable, x1b):java.lang.Object");
    }

    public final void C1() {
        if (this.A) {
            return;
        }
        this.A = true;
        kzh.d(ozh.c(new g1i(zm8.a(kee.a(new hvi0(this, null))), new ivi0(this, null)), this.w), o8i0.d(this));
    }

    public final WDRiskAmountModel E1() {
        WDRiskAmountModel wDRiskAmountModel = ((qqi0) this.O.getValue()).a.get(this.P.getValue());
        return wDRiskAmountModel == null ? new WDRiskAmountModel(0.0d, 0.0d, 0.0d, 0.0d, 15, null) : wDRiskAmountModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G1(String[] strArr, x1b x1bVar) {
        jvi0 jvi0Var;
        if (x1bVar instanceof jvi0) {
            jvi0Var = (jvi0) x1bVar;
            int i2 = jvi0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jvi0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                jvi0Var = new jvi0(this, x1bVar);
            }
        } else {
            jvi0Var = new jvi0(this, x1bVar);
        }
        Object obj = jvi0Var.b;
        y5b y5bVar = y5b.a;
        int i3 = jvi0Var.d;
        if (i3 == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            kvi0 kvi0Var = new kvi0(this, null);
            jvi0Var.a = strArr;
            jvi0Var.d = 1;
            if (ej5.d(wclVar, kvi0Var, jvi0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strArr = jvi0Var.a;
            uj50.b(obj);
        }
        or60 or60Var = new or60(new lvi0(this, strArr, null));
        pfd pfdVar2 = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    /* JADX WARN: Code duplicated, block: B:221:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:245:0x065d  */
    public final void J1(bri0 bri0Var) {
        uf00 uf00VarF;
        Object value;
        ijf0 ijf0Var;
        int iIntValue;
        Object value2;
        if2 aVar;
        double dDoubleValue;
        gsi0 next;
        int i2;
        eyi0 eyi0Var;
        String strA;
        boolean zEquals = bri0Var.equals(bri0.d.a);
        v340 v340Var = this.W;
        wwd0 wwd0Var = this.V;
        if (zEquals) {
            L1(eyi0.v0.o0);
            Integer num = (Integer) F1(v340Var, wwd0Var.getValue());
            if (num != null) {
                Integer numValueOf = Integer.valueOf(num.intValue());
                wwd0Var.getClass();
                wwd0Var.k(null, numValueOf);
                return;
            }
            return;
        }
        if (bri0Var.equals(bri0.u.a)) {
            L1(eyi0.v0.o0);
            Integer num2 = (Integer) H1(v340Var, wwd0Var.getValue());
            if (num2 != null) {
                Integer numValueOf2 = Integer.valueOf(num2.intValue());
                wwd0Var.getClass();
                wwd0Var.k(null, numValueOf2);
                return;
            }
            return;
        }
        boolean zEquals2 = bri0Var.equals(bri0.c.a);
        v340 v340Var2 = this.U;
        wwd0 wwd0Var2 = this.P;
        if (zEquals2) {
            L1(eyi0.v0.o0);
            oti0 oti0Var = (oti0) F1(v340Var2, wwd0Var2.getValue());
            if (oti0Var != null) {
                wwd0Var2.getClass();
                wwd0Var2.k(null, oti0Var);
                return;
            }
            return;
        }
        if (bri0Var.equals(bri0.t.a)) {
            L1(eyi0.v0.o0);
            oti0 oti0Var2 = (oti0) H1(v340Var2, wwd0Var2.getValue());
            if (oti0Var2 != null) {
                wwd0Var2.getClass();
                wwd0Var2.k(null, oti0Var2);
                return;
            }
            return;
        }
        boolean z2 = bri0Var instanceof bri0.z;
        wwd0 wwd0Var3 = this.b0;
        if (z2) {
            nui0 nui0Var = ((bri0.z) bri0Var).a;
            wwd0Var3.getClass();
            wwd0Var3.k(null, nui0Var);
            return;
        }
        boolean z3 = bri0Var instanceof bri0.c0;
        wwd0 wwd0Var4 = this.L;
        if (z3) {
            ijf0 ijf0Var2 = ((bri0.c0) bri0Var).a;
            String strY1 = y1(ijf0Var2.a.b, null);
            if (strY1 != null) {
                if2.a aVar2 = new if2.a(ijf0.b(ijf0Var2, strY1, 0L, 6));
                wwd0Var4.getClass();
                wwd0Var4.k(null, aVar2);
                return;
            }
            return;
        }
        if (bri0Var.equals(bri0.a.a)) {
            L1(eyi0.v0.n0);
            if (kotlin.text.b.h(((if2) wwd0Var4.getValue()).getText()) == null) {
                String strD1 = D1(String.valueOf(E1().getMinAmount()));
                strD1.getClass();
                M1(wwd0Var4, strD1);
                return;
            } else {
                String strY2 = y1(((if2) wwd0Var4.getValue()).getText(), new Function1() { // from class: wui0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Double.valueOf(this.a.E1().getStepAmount() + ((Double) obj).doubleValue());
                    }
                });
                if (strY2 != null) {
                    M1(wwd0Var4, strY2);
                    Unit unit = Unit.a;
                    return;
                }
                return;
            }
        }
        int i3 = 1;
        if (bri0Var.equals(bri0.r.a)) {
            L1(eyi0.v0.n0);
            String strY3 = y1(((if2) wwd0Var4.getValue()).getText(), new u1y(this, 1));
            if (strY3 != null) {
                M1(wwd0Var4, strY3);
                Unit unit2 = Unit.a;
                return;
            }
            return;
        }
        if (bri0Var.equals(bri0.n.a)) {
            L1(eyi0.v0.n0);
            String strD2 = D1(String.valueOf(E1().getMaxAmount()));
            strD2.getClass();
            M1(wwd0Var4, strD2);
            Unit unit3 = Unit.a;
            return;
        }
        if (bri0Var.equals(bri0.p.a)) {
            L1(eyi0.v0.n0);
            String strD3 = D1(String.valueOf(E1().getMinAmount()));
            strD3.getClass();
            M1(wwd0Var4, strD3);
            Unit unit4 = Unit.a;
            return;
        }
        boolean z4 = bri0Var instanceof bri0.d0;
        wwd0 wwd0Var5 = this.M;
        if (z4) {
            ijf0 ijf0Var3 = ((bri0.d0) bri0Var).a;
            String strZ1 = z1(ijf0Var3.a.b, null);
            if (strZ1 != null) {
                ijf0 ijf0VarB = ijf0.b(ijf0Var3, strZ1, 0L, 6);
                wwd0Var5.getClass();
                wwd0Var5.k(null, ijf0VarB);
                return;
            }
            return;
        }
        boolean zEquals3 = bri0Var.equals(bri0.b.a);
        wwd0 wwd0Var6 = this.O;
        if (zEquals3) {
            L1(eyi0.v0.o0);
            if (StringsKt.toIntOrNull(((ijf0) wwd0Var5.getValue()).a.b) == null) {
                N1(wwd0Var5, String.valueOf(((qqi0) wwd0Var6.getValue()).b.getMinSpin()));
                return;
            }
            Integer intOrNull = StringsKt.toIntOrNull(((ijf0) wwd0Var5.getValue()).a.b);
            if ((intOrNull != null ? intOrNull.intValue() : 0) >= ((qqi0) wwd0Var6.getValue()).b.getMaxSpin()) {
                N1(wwd0Var5, "∞");
                Unit unit5 = Unit.a;
                return;
            }
            String strZ2 = z1(((ijf0) wwd0Var5.getValue()).a.b, new pht(this, i3));
            if (strZ2 != null) {
                N1(wwd0Var5, strZ2);
                Unit unit6 = Unit.a;
                return;
            }
            return;
        }
        if (bri0Var.equals(bri0.s.a)) {
            L1(eyi0.v0.o0);
            if (Intrinsics.g(((ijf0) wwd0Var5.getValue()).a.b, "∞")) {
                N1(wwd0Var5, String.valueOf(((qqi0) wwd0Var6.getValue()).b.getMaxSpin()));
                Unit unit7 = Unit.a;
                return;
            }
            String strZ3 = z1(((ijf0) wwd0Var5.getValue()).a.b, new Function1() { // from class: xui0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(((Integer) obj).intValue() - ((qqi0) this.a.O.getValue()).b.getStepSpin());
                }
            });
            if (strZ3 != null) {
                N1(wwd0Var5, strZ3);
                Unit unit8 = Unit.a;
                return;
            }
            return;
        }
        if (bri0Var.equals(bri0.o.a)) {
            L1(eyi0.v0.o0);
            N1(wwd0Var5, "∞");
            Unit unit9 = Unit.a;
            return;
        }
        if (bri0Var.equals(bri0.q.a)) {
            L1(eyi0.v0.o0);
            N1(wwd0Var5, String.valueOf(((qqi0) wwd0Var6.getValue()).b.getMinSpin()));
            Unit unit10 = Unit.a;
            return;
        }
        boolean z5 = bri0Var instanceof bri0.e;
        wwd0 wwd0Var7 = this.N;
        wwd0 wwd0Var8 = this.T;
        if (z5) {
            boolean z6 = this.c0.a.getValue() instanceof dpi0.d;
            wwd0 wwd0Var9 = this.S;
            if (z6) {
                Boolean bool = Boolean.TRUE;
                wwd0Var9.getClass();
                wwd0Var9.k(null, bool);
                return;
            }
            if (!((bri0.e) bri0Var).a || ((Boolean) this.H.a.getValue()).booleanValue()) {
                wwd0Var8.setValue(ari0.c.a);
                Integer intOrNull2 = StringsKt.toIntOrNull(((ijf0) wwd0Var5.getValue()).a.b);
                this.z = intOrNull2 != null ? intOrNull2.intValue() : -1;
                if (wwd0Var3.getValue() == nui0.b) {
                    Boolean bool2 = Boolean.FALSE;
                    wwd0Var9.getClass();
                    wwd0Var9.k(null, bool2);
                }
                L1(eyi0.v0.p0);
                x1();
                Unit unit11 = Unit.a;
                return;
            }
            String str = ((uui0) wwd0Var7.getValue()).a;
            Double dH = kotlin.text.b.h(((if2) wwd0Var4.getValue()).getText());
            String strD4 = D1(String.valueOf(dH != null ? dH.doubleValue() : 0.0d));
            int iOrdinal = ((nui0) wwd0Var3.getValue()).ordinal();
            v340 v340Var3 = this.E;
            if (iOrdinal == 0) {
                com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var3.a.getValue();
                eyi0Var = eyi0.v0;
                CMSRes cMSRes = eyi0Var.w;
                strD4.getClass();
                strA = bVar.a(cMSRes, str, strD4);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                if (Intrinsics.g(((ijf0) wwd0Var5.getValue()).a.b, "∞")) {
                    com.sportygames.newcms.b bVar2 = (com.sportygames.newcms.b) v340Var3.a.getValue();
                    eyi0Var = eyi0.v0;
                    CMSRes cMSRes2 = eyi0Var.y;
                    strD4.getClass();
                    strA = bVar2.a(cMSRes2, str, strD4);
                } else {
                    com.sportygames.newcms.b bVar3 = (com.sportygames.newcms.b) v340Var3.a.getValue();
                    eyi0Var = eyi0.v0;
                    CMSRes cMSRes3 = eyi0Var.x;
                    String str2 = ((ijf0) wwd0Var5.getValue()).a.b;
                    strD4.getClass();
                    strA = bVar3.a(cMSRes3, str2, str, strD4);
                }
            }
            ari0.a aVar3 = new ari0.a(strA, ((com.sportygames.newcms.b) v340Var3.a.getValue()).b(eyi0Var.F, ""), ((com.sportygames.newcms.b) v340Var3.a.getValue()).b(eyi0Var.G, ""), bri0.h.a, new bri0.e(false));
            wwd0Var8.getClass();
            wwd0Var8.k(null, aVar3);
            return;
        }
        boolean z7 = bri0Var instanceof bri0.a0;
        v340 v340Var4 = this.Y;
        if (z7) {
            mqi0 mqi0Var = (mqi0) this.Q.getValue();
            mqi0.c cVar = mqi0Var instanceof mqi0.c ? (mqi0.c) mqi0Var : null;
            if (cVar == null) {
                return;
            }
            if (cVar.a) {
                L1(eyi0.v0.t0);
            } else {
                L1(eyi0.v0.q0);
            }
            float f2 = ((bri0.a0) bri0Var).a % 360.0f;
            wsi0 wsi0Var = (wsi0) v340Var4.a.getValue();
            uui0 uui0Var = cVar.e;
            nui0 nui0Var2 = (nui0) wwd0Var3.getValue();
            Object value3 = wwd0Var4.getValue();
            gzo.c cVar2 = new gzo.c(cVar, f2, wsi0Var, uui0Var, nui0Var2, value3 instanceof if2.b ? (if2.b) value3 : null);
            wwd0 wwd0Var10 = this.Z;
            wwd0Var10.getClass();
            wwd0Var10.k(null, cVar2);
            K1();
            Unit unit12 = Unit.a;
            return;
        }
        boolean zEquals4 = bri0Var.equals(bri0.g.a);
        odd oddVar = this.w;
        if (zEquals4) {
            L1(eyi0.v0.u0);
            ej5.c(o8i0.d(this), oddVar, null, new j(null), 2);
            return;
        }
        boolean z8 = bri0Var instanceof bri0.v;
        wwd0 wwd0Var11 = this.a0;
        if (z8) {
            Integer numA = ((hsi0) wwd0Var11.getValue()).a();
            int i4 = ((bri0.v) bri0Var).a;
            if (numA != null && numA.intValue() == i4) {
                wwd0Var11.setValue(hsi0.a.a);
                return;
            }
            Iterator<gsi0> it = ((wsi0) v340Var4.a.getValue()).d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.a != i4);
            gsi0 gsi0Var = next;
            if (gsi0Var == null) {
                return;
            }
            uf00<gsi0> uf00Var = ((wsi0) v340Var4.a.getValue()).b;
            if (uf00Var == null || !uf00Var.isEmpty()) {
                Iterator<gsi0> it2 = uf00Var.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    if (it2.next().a == i4 && (i5 = i5 + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
                i2 = i5;
            } else {
                i2 = 0;
            }
            Double dH2 = kotlin.text.b.h(((if2) wwd0Var4.getValue()).getText());
            double dDoubleValue2 = (dH2 != null ? dH2.doubleValue() : 0.0d) * ((double) gsi0Var.b);
            int i6 = gsi0Var.a;
            long j2 = gsi0Var.c;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('/');
            sb.append(((wsi0) v340Var4.a.getValue()).e);
            hsi0.b bVar4 = new hsi0.b(((uui0) wwd0Var7.getValue()).a + ' ' + D1(String.valueOf(dDoubleValue2)), sb.toString(), i6, j2);
            wwd0Var11.getClass();
            wwd0Var11.k(null, bVar4);
            return;
        }
        if (bri0Var.equals(bri0.w.a)) {
            wwd0Var11.setValue(hsi0.a.a);
            return;
        }
        if (bri0Var instanceof bri0.b0) {
            this.R.setValue(((bri0.b0) bri0Var).a);
            return;
        }
        if (bri0Var.equals(bri0.k.a)) {
            double minAmount = WDRiskAmountModel.copy$default(E1(), 0.0d, 0.0d, 0.0d, 0.0d, 15, null).getMinAmount();
            do {
                value2 = wwd0Var4.getValue();
                aVar = (if2) value2;
                if (aVar instanceof if2.a) {
                    if2.a aVar4 = (if2.a) aVar;
                    ijf0 ijf0Var4 = aVar4.a;
                    Double dH3 = kotlin.text.b.h(aVar4.b);
                    if (dH3 == null) {
                        dDoubleValue = minAmount;
                    } else {
                        if (dH3.doubleValue() < minAmount) {
                            dH3 = null;
                        }
                        if (dH3 != null) {
                            dDoubleValue = dH3.doubleValue();
                        } else {
                            dDoubleValue = minAmount;
                        }
                    }
                    String strD5 = D1(String.valueOf(dDoubleValue));
                    strD5.getClass();
                    aVar = new if2.a(ijf0.b(ijf0Var4, strD5, 0L, 6));
                } else if (!(aVar instanceof if2.b)) {
                    uhc.a();
                    return;
                }
            } while (!wwd0Var4.g(value2, aVar));
            Unit unit13 = Unit.a;
            return;
        }
        if (bri0Var.equals(bri0.l.a)) {
            if (Intrinsics.g(((ijf0) wwd0Var5.getValue()).a.b, "∞")) {
                return;
            }
            int minSpin = ((qqi0) wwd0Var6.getValue()).b.getMinSpin();
            do {
                value = wwd0Var5.getValue();
                ijf0Var = (ijf0) value;
                Integer intOrNull3 = StringsKt.toIntOrNull(ijf0Var.a.b);
                if (intOrNull3 == null) {
                    iIntValue = minSpin;
                } else {
                    if (intOrNull3.intValue() < minSpin) {
                        intOrNull3 = null;
                    }
                    if (intOrNull3 != null) {
                        iIntValue = intOrNull3.intValue();
                    } else {
                        iIntValue = minSpin;
                    }
                }
            } while (!wwd0Var5.g(value, ijf0.b(ijf0Var, String.valueOf(iIntValue), 0L, 6)));
            Unit unit14 = Unit.a;
            return;
        }
        if (bri0Var instanceof bri0.x) {
            wwd0Var8.setValue(ari0.c.a);
            av7.a aVar5 = av7.a;
            av7.a(oddVar, new k(bri0Var, null));
            return;
        }
        if (bri0Var.equals(bri0.h.a)) {
            wwd0Var8.setValue(ari0.c.a);
            return;
        }
        if (bri0Var instanceof bri0.i) {
            kzh.d(new g1i(em50.a(this.d.a(this.v)), new l(bri0Var, null)), o8i0.d(this));
            return;
        }
        if (bri0Var.equals(bri0.m.a)) {
            wwd0Var8.setValue(ari0.c.a);
            this.A = false;
            C1();
            Unit unit15 = Unit.a;
            return;
        }
        boolean zEquals5 = bri0Var.equals(bri0.y.a);
        wwd0 wwd0Var12 = this.C;
        if (zEquals5) {
            WDRiskAmountModel wDRiskAmountModelE1 = E1();
            List<GiftItem> entityList = ((PromotionGiftsResponse) this.B.getValue()).getEntityList();
            if (entityList == null || (uf00VarF = a4h.f(entityList)) == null) {
                uf00VarF = n1a0.c;
            }
            nri0.b bVar5 = new nri0.b(uf00VarF, wDRiskAmountModelE1.getMaxAmount(), wDRiskAmountModelE1.getMinAmount(), wDRiskAmountModelE1.getMaxAmount());
            wwd0Var12.getClass();
            wwd0Var12.k(null, bVar5);
            return;
        }
        if (bri0Var.equals(bri0.f.a)) {
            String strD6 = D1(String.valueOf(E1().getDefaultAmount()));
            strD6.getClass();
            int length = strD6.length();
            if2.a aVar6 = new if2.a(new ijf0(strD6, vlf0.a(length, length), 4));
            wwd0Var4.getClass();
            wwd0Var4.k(null, aVar6);
            return;
        }
        if (bri0Var.equals(bri0.j.a)) {
            wwd0Var12.setValue(nri0.a.a);
            return;
        }
        if (!(bri0Var instanceof bri0.e0)) {
            uhc.a();
            return;
        }
        bri0.e0 e0Var = (bri0.e0) bri0Var;
        String strD7 = D1(String.valueOf(e0Var.b));
        strD7.getClass();
        if2.b bVar6 = new if2.b(strD7, e0Var.a.getGiftId());
        wwd0Var4.getClass();
        wwd0Var4.k(null, bVar6);
        wwd0Var12.setValue(nri0.a.a);
    }

    public final void K1() {
        int i2;
        wwd0 wwd0Var = this.M;
        Integer intOrNull = StringsKt.toIntOrNull(((ijf0) wwd0Var.getValue()).a.b);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        wwd0 wwd0Var2 = this.S;
        if (!((Boolean) wwd0Var2.getValue()).booleanValue() && this.b0.getValue() != nui0.a && (iIntValue > 0 || Intrinsics.g(((ijf0) wwd0Var.getValue()).a.b, "∞"))) {
            x1();
            return;
        }
        if (iIntValue <= 0 && (i2 = this.z) > 0) {
            N1(wwd0Var, String.valueOf(i2));
        }
        Boolean bool = Boolean.TRUE;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
    }

    public final void L1(CMSRes cMSRes) {
        if (((Boolean) this.G.a.getValue()).booleanValue()) {
            ((com.sportygames.newcms.b) this.E.a.getValue()).c(cMSRes);
        }
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        ((com.sportygames.newcms.b) this.E.a.getValue()).d();
    }

    public final void x1() {
        Long l2 = this.b0.getValue() == nui0.b ? 1000L : null;
        wwd0 wwd0Var = this.L;
        Object value = wwd0Var.getValue();
        if2.b bVar = value instanceof if2.b ? (if2.b) value : null;
        lyh zui0Var = bVar != null ? new zui0(this.e.f()) : new gzh(this.B.getValue());
        Double dH = kotlin.text.b.h(((if2) wwd0Var.getValue()).getText());
        double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
        kzh.d(ozh.c(new g1i(em50.a(new s78(new g1i(new gzh(Boolean.TRUE), new cvi0(l2, null)), r0i.a(new avi0(this.e.a((oti0) this.P.getValue(), ((Number) this.V.getValue()).intValue(), dDoubleValue, ((wsi0) this.Y.a.getValue()).c, bVar != null ? bVar.b : null, bVar != null ? Double.valueOf(dDoubleValue) : null)), new bvi0(this, zui0Var, null)), new dvi0(3, null))), new evi0(this, null)), this.w), o8i0.d(this));
    }

    public final String y1(String str, Function1<? super Double, Double> function1) {
        String strValueOf;
        if (kotlin.text.c.u(str, "-", false)) {
            return null;
        }
        String str2 = (String) CollectionsKt.V(1, StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null));
        if ((str2 != null ? str2.length() : 0) > 2) {
            return null;
        }
        if (kotlin.text.c.u(str, "0", false)) {
            Character chH = wae0.H(str);
            if (chH == null || (strValueOf = String.valueOf(chH.charValue())) == null) {
                strValueOf = ".";
            }
            if (!strValueOf.equals(".")) {
                return null;
            }
        }
        if (kotlin.text.c.u(str, ".", false)) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        Double dH = kotlin.text.b.h(kotlin.text.c.k(str, ".", false) ? str.concat("0") : str);
        if (dH == null) {
            return null;
        }
        double dDoubleValue = dH.doubleValue();
        if (function1 != null) {
            dDoubleValue = function1.invoke(dH).doubleValue();
            str = D1(String.valueOf(dDoubleValue));
        }
        WDRiskAmountModel wDRiskAmountModel = ((qqi0) this.O.getValue()).a.get(this.P.getValue());
        if (wDRiskAmountModel == null) {
            return null;
        }
        if (dDoubleValue > wDRiskAmountModel.getMaxAmount()) {
            return D1(String.valueOf(wDRiskAmountModel.getMaxAmount()));
        }
        return (dDoubleValue >= wDRiskAmountModel.getMinAmount() || function1 == null) ? str : D1(String.valueOf(wDRiskAmountModel.getMinAmount()));
    }

    public final String z1(String str, Function1<? super Integer, Integer> function1) {
        Integer intOrNull;
        if (str.length() == 0 || str.equals("∞")) {
            return str;
        }
        String strP = StringsKt.M(str, "∞", false) ? kotlin.text.c.p(str, "∞", "", false) : str;
        if ((kotlin.text.c.u(strP, "0", false) && str.length() > 1) || kotlin.text.c.u(strP, "-", false) || (intOrNull = StringsKt.toIntOrNull(strP)) == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        if (function1 != null) {
            iIntValue = function1.invoke(intOrNull).intValue();
            strP = String.valueOf(iIntValue);
        }
        WDAutoSpinConfigModel wDAutoSpinConfigModel = ((qqi0) this.O.getValue()).b;
        if (iIntValue > wDAutoSpinConfigModel.getMaxSpin()) {
            return String.valueOf(wDAutoSpinConfigModel.getMaxSpin());
        }
        return (iIntValue >= wDAutoSpinConfigModel.getMinSpin() || function1 == null) ? strP : String.valueOf(wDAutoSpinConfigModel.getMinSpin());
    }
}
