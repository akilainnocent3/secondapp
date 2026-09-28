package com.sportybet.android.instantwin.presentation.buildandgo;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.buildandgo.c;
import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.a6a0;
import defpackage.aiv;
import defpackage.bjb0;
import defpackage.c0d;
import defpackage.cb0;
import defpackage.cb40;
import defpackage.cc0;
import defpackage.cf5;
import defpackage.chp;
import defpackage.cmm;
import defpackage.dpz;
import defpackage.dvd0;
import defpackage.eqz;
import defpackage.fe5;
import defpackage.g75;
import defpackage.g78;
import defpackage.gh5;
import defpackage.gly;
import defpackage.hlh0;
import defpackage.ht;
import defpackage.i78;
import defpackage.iaj;
import defpackage.ib5;
import defpackage.igf0;
import defpackage.ih5;
import defpackage.ir40;
import defpackage.jh10;
import defpackage.jh5;
import defpackage.jxo;
import defpackage.kh5;
import defpackage.kw0;
import defpackage.lib0;
import defpackage.mg5;
import defpackage.mh5;
import defpackage.myh;
import defpackage.n30;
import defpackage.n95;
import defpackage.ne00;
import defpackage.ng5;
import defpackage.ngs;
import defpackage.nh5;
import defpackage.ni5;
import defpackage.nzj;
import defpackage.oh5;
import defpackage.oib0;
import defpackage.op8;
import defpackage.or60;
import defpackage.pp8;
import defpackage.prd0;
import defpackage.qcn;
import defpackage.qhb0;
import defpackage.qyd0;
import defpackage.sg5;
import defpackage.shb0;
import defpackage.tg5;
import defpackage.tje0;
import defpackage.tsr;
import defpackage.twd0;
import defpackage.uj50;
import defpackage.ute;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.ved;
import defpackage.vh10;
import defpackage.whl;
import defpackage.wyh;
import defpackage.x3g;
import defpackage.xa80;
import defpackage.xc5;
import defpackage.xvf;
import defpackage.y5b;
import defpackage.yka;
import defpackage.ysa;
import defpackage.ytw;
import defpackage.zpz;
import defpackage.zs;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoScreenKt$EndlessCarouselSlider$2$1", f = "BuildAndGoScreen.kt", l = {341}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zpz b;
        public final /* synthetic */ int c;
        public final /* synthetic */ List<cf5> d;

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.buildandgo.c$a$a, reason: collision with other inner class name */
        public static final class C0260a<T> implements myh {
            public final /* synthetic */ zpz a;
            public final /* synthetic */ int b;
            public final /* synthetic */ List<cf5> c;

            public C0260a(zpz zpzVar, int i, List list) {
                this.a = zpzVar;
                this.b = i;
                this.c = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Pair pair = (Pair) obj;
                int iIntValue = ((Number) pair.a).intValue();
                if (!((Boolean) pair.b).booleanValue()) {
                    zpz zpzVar = this.a;
                    if (iIntValue == 0) {
                        return zpz.v(this.b, v1bVar, zpzVar);
                    }
                    if (iIntValue == this.c.size() - 1) {
                        return zpz.v(1, v1bVar, zpzVar);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zpz zpzVar, int i, List list, v1b v1bVar) {
            super(2, v1bVar);
            this.b = zpzVar;
            this.c = i;
            this.d = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                zpz zpzVar = this.b;
                or60 or60VarC = n95.c(new oh5(zpzVar, 0));
                C0260a c0260a = new C0260a(zpzVar, this.c, this.d);
                this.a = 1;
                if (or60VarC.collect(c0260a, this) == y5bVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ni5 ni5Var, final String str, final fe5 fe5Var, final ysa ysaVar, final Sports sports, final TaxConfig taxConfig, final qcn qcnVar, final boolean z, final ytw ytwVar, final ytw ytwVar2, final ytw ytwVar3, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str2;
        TaxConfig taxConfig2;
        ytw ytwVar4;
        final Function1 function2;
        final Function1 function3;
        int i3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        boolean z2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        boolean z3;
        boolean z4;
        boolean z5;
        final ni5 ni5Var2 = ni5Var;
        ni5Var2.getClass();
        str.getClass();
        sports.getClass();
        taxConfig.getClass();
        ytwVar.getClass();
        ytwVar2.getClass();
        ytwVar3.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1086614794);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(ni5Var2) : bVarI.A(ni5Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= bVarI.M(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(fe5Var) : bVarI.A(fe5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(ysaVar) : bVarI.A(ysaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? bVarI.M(sports) : bVarI.A(sports) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            taxConfig2 = taxConfig;
            i2 |= bVarI.A(taxConfig2) ? 131072 : 65536;
        } else {
            taxConfig2 = taxConfig;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.b(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            ytwVar4 = ytwVar;
            i2 |= bVarI.M(ytwVar4) ? 67108864 : 33554432;
        } else {
            ytwVar4 = ytwVar;
        }
        if ((i & 805306368) == 0) {
            i2 |= bVarI.M(ytwVar2) ? 536870912 : 268435456;
        }
        int i4 = i2;
        int i5 = 6 | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a3 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a3) {
                objY = new mg5();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (qcnVar == null || qcnVar.isEmpty()) {
                ni5Var2 = ni5Var;
                function3 = function1;
                i3 = 32;
                bVarI.N(649798030);
                boolean z6 = (i5 & 112) == 32;
                Object objY2 = bVarI.y();
                c0042a = c0042a3;
                if (z6 || objY2 == c0042a) {
                    objY2 = new cc0(function3, 1);
                    bVarI.r(objY2);
                }
                x3g.a((Function0) objY2, bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(649927207);
                ni5Var2 = ni5Var;
                boolean z7 = ni5Var2.e;
                int i6 = i5 & 112;
                boolean z8 = i6 == 32;
                Object objY3 = bVarI.y();
                if (z8 || objY3 == c0042a3) {
                    objY3 = new mh5(function1, 0);
                    bVarI.r(objY3);
                }
                Function0 function0 = (Function0) objY3;
                boolean z9 = i6 == 32;
                Object objY4 = bVarI.y();
                if (z9 || objY4 == c0042a3) {
                    objY4 = new ng5(0, function1);
                    bVarI.r(objY4);
                }
                Function0 function4 = (Function0) objY4;
                String str3 = ni5Var2.c;
                BigDecimal bigDecimal = ni5Var2.b;
                boolean z10 = i6 == 32;
                Object objY5 = bVarI.y();
                if (z10 || objY5 == c0042a3) {
                    objY5 = new Function1() { // from class: og5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str4 = (String) obj;
                            if (str4 == null) {
                                str4 = "";
                            }
                            d.o oVar = new d.o(str4);
                            Function1 function5 = function1;
                            function5.invoke(oVar);
                            function5.invoke(d.a.c.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                Function1 function5 = (Function1) objY5;
                boolean z11 = (i6 == 32) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && bVarI.A(ni5Var2)));
                Object objY6 = bVarI.y();
                if (z11 || objY6 == c0042a3) {
                    objY6 = new Function2() { // from class: pg5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            cf5 cf5Var = (cf5) obj;
                            BetBuilderInRound betBuilderInRound = (BetBuilderInRound) obj2;
                            cf5Var.getClass();
                            boolean z12 = ni5Var2.e;
                            Function1 function6 = function1;
                            if (z12) {
                                function6.invoke(new d.k(cf5Var, betBuilderInRound));
                                return Unit.a;
                            }
                            function6.invoke(d.j.c.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY6);
                }
                i3 = 32;
                c(z7, qcnVar, taxConfig2, sports, fe5Var, function0, function4, str3, str2, bigDecimal, function5, (Function2) objY6, ytwVar4, ytwVar2, ytwVar3, function1, bVarI, (cf5.d << 3) | ((i4 >> 15) & 112) | ((i4 >> 9) & 896) | (Sports.$stable << 9) | ((i4 >> 3) & 7168) | ((i4 << 6) & 57344) | ((i4 << 21) & 234881024), ((i4 >> 18) & 8064) | 24576 | ((i5 << 12) & 458752));
                function3 = function1;
                bVarI = bVarI;
                bVarI.X(false);
                c0042a = c0042a3;
            }
            if (ysaVar == null || ni5Var2.h == null) {
                bVarI.N(652111746);
                bVarI.X(false);
            } else {
                bVarI.N(651342946);
                jh10 jh10Var = ni5Var2.f;
                int i7 = i5 & 112;
                boolean z12 = i7 == i3;
                Object objY7 = bVarI.y();
                if (z12 || objY7 == c0042a) {
                    objY7 = new Function0() { // from class: qg5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function3.invoke(d.b.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY7);
                }
                Function0 function6 = (Function0) objY7;
                boolean z13 = i7 == i3;
                Object objY8 = bVarI.y();
                if (z13 || objY8 == c0042a) {
                    objY8 = new Function0() { // from class: rg5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function3.invoke(d.j.b.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY8);
                }
                Function0 function7 = (Function0) objY8;
                boolean z14 = (i7 == i3) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && bVarI.A(ni5Var2)));
                Object objY9 = bVarI.y();
                if (z14 || objY9 == c0042a) {
                    objY9 = new sg5(0, ni5Var2, function3);
                    bVarI.r(objY9);
                }
                Function0 function8 = (Function0) objY9;
                boolean z15 = i7 == i3;
                Object objY10 = bVarI.y();
                if (z15 || objY10 == c0042a) {
                    objY10 = new cb0(function3, 1);
                    bVarI.r(objY10);
                }
                xc5.a(ysaVar, jh10Var, function6, function7, function8, (Function0) objY10, bVarI, (i4 >> 9) & 14);
                bVarI.X(false);
            }
            zs zsVar = ni5Var2.a;
            String strG = null;
            zs.b bVar = zsVar instanceof zs.b ? (zs.b) zsVar : null;
            if (bVar == null) {
                bVarI.N(652208279);
                bVarI.X(false);
                z3 = false;
                function2 = function3;
                c0042a2 = c0042a;
            } else {
                bVarI.N(652208280);
                boolean z16 = (i5 & 112) == i3;
                Object objY11 = bVarI.y();
                if (z16 || objY11 == c0042a) {
                    objY11 = new Function0() { // from class: wg5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function3.invoke(d.g.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY11);
                }
                Function0 function9 = (Function0) objY11;
                UiText uiText = bVar.a;
                if (uiText == null) {
                    bVarI.N(743296972);
                    z2 = false;
                } else {
                    z2 = false;
                    bVarI.N(-668759339);
                    strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                }
                bVarI.X(z2);
                if (strG == null) {
                    strG = OdQr.hxCSlNkUyP;
                }
                UiText uiText2 = bVar.b;
                uiText2.getClass();
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                String strG2 = uiText2.g((Context) bVarI.O(qyd0Var));
                UiText uiText3 = bVar.c;
                uiText3.getClass();
                String strG3 = uiText3.g((Context) bVarI.O(qyd0Var));
                op8 op8VarB = pp8.b(678610221, new gh5(bVar, 0), bVarI);
                function2 = function1;
                androidx.compose.runtime.b bVar2 = bVarI;
                c0042a2 = c0042a;
                nzj.b(null, strG, strG2, null, null, null, strG3, null, null, null, op8VarB, function9, function9, function9, bVar2, 0, 6, 953);
                bVarI = bVar2;
                Unit unit = Unit.a;
                z3 = false;
                bVarI.X(false);
            }
            if (z) {
                bVarI.N(653203349);
                int i8 = ni5Var2.k;
                if (i8 != 0) {
                    if (i8 != 1) {
                        bVarI.N(653892386);
                        bVarI.X(z3);
                        Unit unit2 = Unit.a;
                    } else {
                        bVarI.N(1406556194);
                        long j = ((gly) ytwVar2.getValue()).a;
                        int i9 = (int) (((jxo) ytwVar3.getValue()).a >> i3);
                        int i10 = i5 & 112;
                        boolean z17 = i10 == i3;
                        Object objY12 = bVarI.y();
                        if (z17 || objY12 == c0042a2) {
                            objY12 = new jh5(function2, 0);
                            bVarI.r(objY12);
                        }
                        Function0 function10 = (Function0) objY12;
                        boolean z18 = i10 == i3;
                        Object objY13 = bVarI.y();
                        if (z18 || objY13 == c0042a2) {
                            z5 = false;
                            objY13 = new kh5(function2, 0 == true ? 1 : 0);
                            bVarI.r(objY13);
                        } else {
                            z5 = false;
                        }
                        androidx.compose.runtime.b bVar3 = bVarI;
                        vh10.b(j, i9, function10, (Function0) objY13, bVar3, 0);
                        bVarI = bVar3;
                        bVarI.X(z5);
                        Unit unit3 = Unit.a;
                    }
                    z4 = false;
                } else {
                    bVarI.N(1406546308);
                    long j2 = ((gly) ytwVar.getValue()).a;
                    int i11 = i5 & 112;
                    boolean z19 = i11 == i3;
                    Object objY14 = bVarI.y();
                    if (z19 || objY14 == c0042a2) {
                        objY14 = new Function0() { // from class: hh5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function2.invoke(d.q.a);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY14);
                    }
                    Function0 function11 = (Function0) objY14;
                    boolean z20 = i11 == i3;
                    Object objY15 = bVarI.y();
                    if (z20 || objY15 == c0042a2) {
                        z4 = false;
                        objY15 = new ih5(function2, 0 == true ? 1 : 0);
                        bVarI.r(objY15);
                    } else {
                        z4 = false;
                    }
                    androidx.compose.runtime.b bVar4 = bVarI;
                    ir40.b(j2, function11, (Function0) objY15, bVar4, 0);
                    bVarI = bVar4;
                    bVarI.X(z4);
                    Unit unit4 = Unit.a;
                }
                bVarI.X(z4);
            } else {
                bVarI.N(653902306);
                bVarI.X(z3);
            }
            bVarI.X(true);
        } else {
            function2 = function1;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function1 function12 = function2;
            eVarZ.d = new Function2() { // from class: lh5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    c.a(ni5Var2, str, fe5Var, ysaVar, sports, taxConfig, qcnVar, z, ytwVar, ytwVar2, ytwVar3, function12, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01de A[PHI: r15
      0x01de: PHI (r15v24 boolean) = (r15v21 boolean), (r15v25 boolean) binds: [B:90:0x01dc, B:87:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final Sports sports, qcn qcnVar, f fVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        boolean z;
        boolean z2;
        final qcn qcnVar2 = qcnVar;
        final f fVar2 = fVar;
        androidx.compose.runtime.b bVarI = aVar.i(1584622769);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(sports) : bVarI.A(sports) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(qcnVar2) : bVarI.A(qcnVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(fVar2) : bVarI.A(fVar2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            ytw ytwVarC = wyh.c(fVar2.I, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(fVar2.C, bVarI, 0, 7);
            ytw ytwVarC3 = wyh.c(fVar2.e.e, bVarI, 0, 7);
            ytw ytwVarC4 = wyh.c(fVar2.d.d, bVarI, 0, 7);
            TaxConfig taxConfig = (TaxConfig) wyh.b(fVar2.G, TaxConfig.INSTANCE.getDefault(), bVarI, 0, 14).getValue();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new gly(0L));
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(new gly(0L));
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(new jxo(0L));
                bVarI.r(objY3);
            }
            ytw ytwVar3 = (ytw) objY3;
            String str = ((ni5) ytwVarC.getValue()).d;
            int i3 = i2 & 896;
            boolean zM = bVarI.M(ytwVarC) | (i3 == 256 || ((i2 & 512) != 0 && bVarI.A(fVar2)));
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = new com.sportybet.android.instantwin.presentation.buildandgo.a(fVar2, ytwVarC, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, str, (Function2) objY4);
            jh10 jh10Var = ((ni5) ytwVarC.getValue()).f;
            boolean zM2 = bVarI.M(ytwVarC) | (i3 == 256 || ((i2 & 512) != 0 && bVarI.A(fVar2)));
            Object objY5 = bVarI.y();
            if (zM2 || objY5 == c0042a) {
                objY5 = new b(fVar2, ytwVarC, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, jh10Var, (Function2) objY5);
            int i4 = ((ni5) ytwVarC.getValue()).k;
            long j = ((gly) ytwVar.getValue()).a;
            boolean zE = bVarI.e(((gly) ytwVar2.getValue()).a) | bVarI.d(i4) | bVarI.e(j) | bVarI.e(((jxo) ytwVar3.getValue()).a);
            Object objY6 = bVarI.y();
            if (zE || objY6 == c0042a) {
                int i5 = ((ni5) ytwVarC.getValue()).k;
                if (i5 != 0) {
                    z = true;
                    if (i5 == 1 && Float.intBitsToFloat((int) (4294967295L & ((gly) ytwVar2.getValue()).a)) > 0.0f && ((int) (((jxo) ytwVar3.getValue()).a >> 32)) > 0) {
                        z2 = ((ni5) ytwVarC.getValue()).j ? z : false;
                    }
                    objY6 = Boolean.valueOf(z2);
                    bVarI.r(objY6);
                } else {
                    z = true;
                    if (Float.intBitsToFloat((int) (4294967295L & ((gly) ytwVar.getValue()).a)) > 0.0f) {
                        if (((ni5) ytwVarC.getValue()).j) {
                        }
                    }
                    objY6 = Boolean.valueOf(z2);
                    bVarI.r(objY6);
                }
                objY6 = Boolean.valueOf(z2);
                bVarI.r(objY6);
            } else {
                z = true;
            }
            boolean zBooleanValue = ((Boolean) objY6).booleanValue();
            ni5 ni5Var = (ni5) ytwVarC.getValue();
            String str2 = (String) ytwVarC2.getValue();
            fe5 fe5Var = (fe5) ytwVarC3.getValue();
            ysa ysaVar = (ysa) ytwVarC4.getValue();
            if (i3 != 256 && ((i2 & 512) == 0 || !bVarI.A(fVar2))) {
                z = false;
            }
            Object objY7 = bVarI.y();
            if (z || objY7 == c0042a) {
                objY7 = new nh5(1, fVar2, f.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/buildandgo/BuildAndGoUiAction;)V", 0);
                bVarI.r(objY7);
            }
            bVar = bVarI;
            qcnVar2 = qcnVar;
            a(ni5Var, str2, fe5Var, ysaVar, sports, taxConfig, qcnVar2, zBooleanValue, ytwVar, ytwVar2, ytwVar3, (Function1) ((chp) objY7), bVar, 905969664 | ni5.l | (Sports.$stable << 12) | ((i2 << 12) & 57344) | (cf5.d << 18) | ((i2 << 15) & 3670016));
        } else {
            bVar = bVarI;
            fVar2 = fVar2;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dh5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    c.b(sports, qcnVar2, fVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final qcn<cf5> qcnVar, final TaxConfig taxConfig, final Sports sports, final fe5 fe5Var, final Function0<Unit> function0, final Function0<Unit> function1, final String str, final String str2, final BigDecimal bigDecimal, final Function1<? super String, Unit> function2, final Function2<? super cf5, ? super BetBuilderInRound, Unit> function3, final ytw<gly> ytwVar, final ytw<gly> ytwVar2, final ytw<jxo> ytwVar3, final Function1<? super d, Unit> function4, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        TaxConfig taxConfig2;
        Function0<Unit> function5;
        int i4;
        androidx.compose.runtime.b bVar;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function6;
        androidx.compose.runtime.e eVar;
        Object objA;
        String strA;
        androidx.compose.runtime.b bVarI = aVar.i(-1877719170);
        if ((i & 6) == 0) {
            z2 = z;
            i3 = (bVarI.b(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            taxConfig2 = taxConfig;
            i3 |= bVarI.A(taxConfig2) ? 256 : 128;
        } else {
            taxConfig2 = taxConfig;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? bVarI.M(sports) : bVarI.A(sports) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? bVarI.M(fe5Var) : bVarI.A(fe5Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            function5 = function0;
            i3 |= bVarI.A(function5) ? 131072 : 65536;
        } else {
            function5 = function0;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.M(str) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.M(str2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.M(bigDecimal) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.A(function2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.M(ytwVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.M(ytwVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.M(ytwVar3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.A(function4) ? 131072 : 65536;
        }
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            if (qcnVar.isEmpty()) {
                androidx.compose.runtime.e eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                }
                final boolean z3 = z2;
                final TaxConfig taxConfig3 = taxConfig2;
                final Function0<Unit> function7 = function5;
                function6 = new Function2() { // from class: yg5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        c.c(z3, qcnVar, taxConfig3, sports, fe5Var, function7, function1, str, str2, bigDecimal, function2, function3, ytwVar, ytwVar2, ytwVar3, function4, (a) obj, iA, iA2);
                        return Unit.a;
                    }
                };
                eVar = eVarZ;
            } else {
                final BigDecimal bigDecimal2 = new BigDecimal(sports.getMinStake());
                final BigDecimal bigDecimal3 = new BigDecimal(sports.getMaxStake());
                boolean z4 = (i3 & 112) == 32 || ((i3 & 64) != 0 && bVarI.M(qcnVar));
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (z4 || objY == c0042a) {
                    if (qcnVar.size() == 1) {
                        objA = qcnVar;
                    } else {
                        ngs ngsVarB = kotlin.collections.a.b();
                        ngsVarB.add(CollectionsKt.b0(qcnVar));
                        ngsVarB.addAll(qcnVar);
                        ngsVarB.add(CollectionsKt.T(qcnVar));
                        objA = kotlin.collections.a.a(ngsVarB);
                    }
                    bVarI.r(objA);
                    objY = objA;
                }
                final List list = (List) objY;
                int size = list.size() - 2;
                boolean zA = bVarI.A(list);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: zg5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(list.size());
                        }
                    };
                    bVarI.r(objY2);
                }
                final ved vedVarB = eqz.b(1, (Function0) objY2, bVarI, 6, 2);
                boolean z5 = (234881024 & i3) == 67108864;
                Object objY3 = bVarI.y();
                if (z5 || objY3 == c0042a) {
                    objY3 = a6a0.b(new Function0() { // from class: ah5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String string;
                            BigDecimal bigDecimal4 = bigDecimal2;
                            BigDecimal bigDecimal5 = bigDecimal3;
                            BigDecimal bigDecimal6 = bigDecimal;
                            String strP = YAzniTbXHYQ.PErgjNBvi;
                            String str3 = str2;
                            if (str3 != null && (string = StringsKt.t0(str3).toString()) != null) {
                                strP = kotlin.text.c.p(string, ",", strP, false);
                            }
                            if (strP.length() == 0 || strP.equals("0")) {
                                return prd0.c;
                            }
                            if (strP.equals(".")) {
                                return prd0.b;
                            }
                            try {
                                BigDecimal bigDecimal7 = new BigDecimal(strP);
                                if (bigDecimal7.compareTo(bigDecimal4) < 0) {
                                    return prd0.c;
                                }
                                if (bigDecimal7.compareTo(bigDecimal5) > 0) {
                                    return prd0.d;
                                }
                                return (bigDecimal7.compareTo(bigDecimal6) <= 0 || bigDecimal6.compareTo(BigDecimal.ZERO) <= 0) ? prd0.a : prd0.e;
                            } catch (Exception unused) {
                                return prd0.f;
                            }
                        }
                    });
                    bVarI.r(objY3);
                }
                prd0 prd0Var = (prd0) ((twd0) objY3).getValue();
                int i5 = (Sports.$stable << 3) | ((i3 >> 6) & 112);
                int iOrdinal = prd0Var.ordinal();
                if (iOrdinal == 0) {
                    bVarI.N(-285000855);
                    bVarI.X(false);
                    strA = "";
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    bVarI.N(-1117569767);
                    strA = cb40.a(R.string.component_betslip__please_enter_a_value_no_less_than_vmount, new Object[]{bjb0.Y(new BigDecimal(sports.getMinStake()))}, bVarI);
                    bVarI.X(false);
                } else if (iOrdinal == 3) {
                    bVarI.N(-1117562124);
                    strA = cb40.a(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, new Object[]{bjb0.Y(new BigDecimal(sports.getMaxStake()))}, bVarI);
                    bVarI.X(false);
                } else if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw igf0.a(bVarI, -1117574317, false);
                    }
                    bVarI.N(-285000855);
                    bVarI.X(false);
                    strA = "";
                } else {
                    bVarI.N(-1117554545);
                    strA = cb40.a(R.string.page_instant_virtual__less_balanc, new Object[0], bVarI);
                    bVarI.X(false);
                }
                boolean z6 = ((((i5 & 112) ^ 48) > 32 && bVarI.M(sports)) || (i5 & 48) == 32) | ((((i5 & 14) ^ 6) > 4 && bVarI.d(prd0Var.ordinal())) || (i5 & 6) == 4);
                Object objY4 = bVarI.y();
                if (z6 || objY4 == c0042a) {
                    objY4 = new dvd0(strA, prd0Var == prd0.a, prd0Var == prd0.e || prd0Var == prd0.d);
                    bVarI.r(objY4);
                }
                final dvd0 dvd0Var = (dvd0) objY4;
                boolean zM = bVarI.M(vedVarB) | bVarI.d(size) | bVarI.A(list);
                Object objY5 = bVarI.y();
                if (zM || objY5 == c0042a) {
                    objY5 = new a(vedVarB, size, list, null);
                    bVarI.r(objY5);
                }
                xvf.e(bVarI, vedVarB, (Function2) objY5);
                androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarJ = h.j(j.i(j.g(aVar2, 1.0f), 157.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                bVar = bVarI;
                dpz.a(8.0f, 0, 197040, 16344, null, pp8.b(-2057763259, new iaj() { // from class: bh5
                    @Override // defpackage.iaj
                    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj2).intValue();
                        a aVar4 = (a) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        ((opz) obj).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                        }
                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            cf5 cf5Var = (cf5) list.get(iIntValue);
                            boolean z7 = iIntValue == vedVarB.k();
                            EventInRound eventInRound = cf5Var.b;
                            wf5 wf5Var = cf5Var.c;
                            Function2 function8 = function3;
                            boolean zM2 = aVar4.M(function8) | aVar4.A(cf5Var);
                            Object objY6 = aVar4.y();
                            if (zM2 || objY6 == a.C0041a.a) {
                                objY6 = new fh5(function8, cf5Var, 0);
                                aVar4.r(objY6);
                            }
                            kf5.a(z, eventInRound, wf5Var, dvd0Var, taxConfig, sports, fe5Var, function0, function1, str, str2, (Function1) objY6, function2, z7 ? ytwVar : null, z7 ? ytwVar2 : null, z7 ? ytwVar3 : null, function4, aVar4, (EventInRound.$stable << 3) | (Sports.$stable << 15));
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVar), null, null, h.a(2, 20.0f, 0.0f), null, vedVarB, null, null, bVar, j.g(aVar2, 1.0f), null, false);
                bVar.X(true);
            }
            eVar.d = function6;
        }
        bVar = bVarI;
        bVar.G();
        androidx.compose.runtime.e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            function6 = new Function2() { // from class: ch5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    c.c(z, qcnVar, taxConfig, sports, fe5Var, function0, function1, str, str2, bigDecimal, function2, function3, ytwVar, ytwVar2, ytwVar3, function4, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
            eVar = eVarZ2;
            eVar.d = function6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final Sports sports, final qcn qcnVar, final f fVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        sports.getClass();
        fVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1552164876);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(sports) : bVarI.A(sports) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(fVar) : bVarI.A(fVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            ytw ytwVarC = wyh.c(fVar.I, bVarI, 0, 7);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new tg5();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ute.b(null, ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(oib0.a)).A, bVarI, 0, 1);
            int i3 = i2 & 896;
            boolean z = i3 == 256 || ((i2 & 512) != 0 && bVarI.A(fVar));
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function0() { // from class: ug5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        fVar.y1(d.C0263d.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            whl.a((Function0) objY2, bVarI, 0);
            b(sports, qcnVar, fVar, bVarI, Sports.$stable | (i2 & 14) | (cf5.d << 3) | (i2 & 112) | 512 | i3);
            if (((ni5) ytwVarC.getValue()).i) {
                bVarI.N(-1727183048);
                boolean z2 = i3 == 256 || ((i2 & 512) != 0 && bVarI.A(fVar));
                Object objY3 = bVarI.y();
                if (z2 || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: vg5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            fVar.y1(d.h.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                cmm.a((Function0) objY3, bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-1727040820);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xg5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    c.d(sports, qcnVar, fVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final Sports sports, final qcn qcnVar, final f fVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        sports.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2107400424);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(sports) : bVarI.A(sports) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(fVar) : bVarI.A(fVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            b(sports, qcnVar, fVar, bVarI, (i2 & 896) | Sports.$stable | (i2 & 14) | (cf5.d << 3) | (i2 & 112) | 512);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: eh5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    c.e(sports, qcnVar, fVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
