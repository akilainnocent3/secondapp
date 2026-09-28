package defpackage;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.BiggestResponse;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class s7a {

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.components.ComposeBiggestCoefKt$Board$1$1", f = "ComposeBiggestCoef.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ m28 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m28 m28Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = m28Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            m28 m28Var = this.a;
            m28Var.getClass();
            ej5.c(o8i0.d(m28Var), null, null, new b28(m28Var, "DAILY", null), 3);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ mz1 c;
        public final /* synthetic */ String d;

        public c(List list, Function1 function1, mz1 mz1Var, String str) {
            this.a = list;
            this.b = function1;
            this.c = mz1Var;
            this.d = str;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                BiggestResponse biggestResponse = (BiggestResponse) this.a.get(iIntValue);
                aVar2.N(-635610479);
                s7a.g(biggestResponse, this.b, this.c, this.d, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final m28 m28Var, final Function1<? super String, Unit> function1, final mz1 mz1Var, final String str, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(347208384);
        int i2 = i | (bVarI.A(m28Var) ? 4 : 2) | (bVarI.A(mz1Var) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b("Day");
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            final ytw ytwVarA = ts9.a(m28Var.c, bVarI);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(m28Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new a(m28Var, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            boolean zA2 = bVarI.A(m28Var);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: q7a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        ytwVar.setValue(str2);
                        int iHashCode = str2.hashCode();
                        String str3 = "DAILY";
                        if (iHashCode == 68476) {
                            str2.equals("Day");
                        } else if (iHashCode != 2751581) {
                            if (iHashCode == 74527328 && str2.equals("Month")) {
                                str3 = "MONTHLY";
                            }
                        } else if (str2.equals("Year")) {
                            str3 = "YEARLY";
                        }
                        m28 m28Var2 = m28Var;
                        m28Var2.getClass();
                        ej5.c(o8i0.d(m28Var2), null, null, new b28(m28Var2, str3, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            final Function1 function2 = (Function1) objY3;
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            ihe0.a(j.t(androidx.compose.ui.d.a.b, ((configuration.screenWidthDp * ((mmd) bVarI.O(kna.h)).getDensity()) * 90.0f) / 100.0f, (configuration.screenHeightDp * 70) / 100), j060.c(16.0f), mz1Var.a0(), 0L, 0.0f, 0.0f, null, pp8.b(-1144711269, new Function2() { // from class: r7a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    tsr.a aVar2;
                    yka.a.C1350a c1350a;
                    final List list;
                    HTTPResponse hTTPResponse;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final mz1 mz1Var2 = mz1Var;
                        long jA0 = mz1Var2.a0();
                        zk40.a aVar4 = zk40.a;
                        d.a aVar5 = d.a.b;
                        d dVarJ = h.j(androidx.compose.foundation.a.b(aVar5, jA0, aVar4), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                        Object objY4 = aVar3.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY4 == c0042a2) {
                            objY4 = pr7.a(aVar3);
                        }
                        psw pswVar = (psw) objY4;
                        Object objY5 = aVar3.y();
                        if (objY5 == c0042a2) {
                            objY5 = new a7a();
                            aVar3.r(objY5);
                        }
                        d dVarB = androidx.compose.foundation.d.b(dVarJ, pswVar, null, false, null, (Function0) objY5, 28);
                        kw0.k kVar = kw0.c;
                        n54.a aVar6 = ht.a.n;
                        i78 i78VarA = g78.a(kVar, aVar6, aVar3, 54);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarB);
                        yka.k.getClass();
                        tsr.a aVar7 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar7);
                        } else {
                            aVar3.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar3, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        op5 op5Var = op5.a;
                        String strC = op5.c(op5Var, pwo.e(R.string.biggest_coefficients_cms, aVar3), pwo.e(R.string.biggest_coefficients, aVar3));
                        long j = j58.f;
                        lkf0.b(strC, s3w.a(h.j(j.g(aVar5, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), "biggest_coeff_title"), j, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.e(((sfd0) aVar3.O(ni60.b)).d), aVar3, 384, 0, 65016);
                        a aVar8 = aVar3;
                        s7a.d((String) ytwVar.getValue(), function2, mz1Var2, aVar8, 0);
                        s7a.f(0, aVar8);
                        d dVarA = k78.a(aVar6, h.j(j.c(j.g(aVar5, 1.0f), 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7));
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar8.m());
                        ne00 ne00VarO2 = aVar8.o();
                        d dVarC2 = c.c(aVar8, dVarA);
                        if (aVar8.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar8.D();
                        if (aVar8.g()) {
                            aVar2 = aVar7;
                            aVar8.F(aVar2);
                        } else {
                            aVar2 = aVar7;
                            aVar8.p();
                        }
                        hlh0.a(aVar8, aivVarC, bVar);
                        hlh0.a(aVar8, ne00VarO2, dVar);
                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode2))) {
                            c1350a = c1350a2;
                            j3c.a(iHashCode2, aVar8, iHashCode2, c1350a);
                        } else {
                            c1350a = c1350a2;
                        }
                        hlh0.a(aVar8, dVarC2, cVar);
                        twd0 twd0Var = ytwVarA;
                        LoadingState loadingState = (LoadingState) twd0Var.getValue();
                        Status status = loadingState != null ? loadingState.getStatus() : null;
                        int i3 = status == null ? -1 : s7a.d.a[status.ordinal()];
                        if (i3 != -1) {
                            n54 n54Var = ht.a.e;
                            if (i3 == 1) {
                                aVar8.N(-2058933769);
                                d dVarE = j.e(aVar5, 1.0f);
                                aiv aivVarC2 = g75.c(n54Var, false);
                                int iHashCode3 = Long.hashCode(aVar8.m());
                                ne00 ne00VarO3 = aVar8.o();
                                d dVarC3 = c.c(aVar8, dVarE);
                                if (aVar8.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar8.D();
                                if (aVar8.g()) {
                                    aVar8.F(aVar2);
                                } else {
                                    aVar8.p();
                                }
                                hlh0.a(aVar8, aivVarC2, bVar);
                                hlh0.a(aVar8, ne00VarO3, dVar);
                                if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar8, iHashCode3, c1350a);
                                }
                                hlh0.a(aVar8, dVarC3, cVar);
                                n8b0.a(null, aVar8, 0);
                                aVar8.s();
                                aVar8.H();
                                Unit unit2 = Unit.a;
                            } else if (i3 == 2) {
                                aVar8.N(-2058500451);
                                LoadingState loadingState2 = (LoadingState) twd0Var.getValue();
                                if (loadingState2 == null || (hTTPResponse = (HTTPResponse) loadingState2.getData()) == null || (list = (List) hTTPResponse.getData()) == null) {
                                    list = m2g.a;
                                }
                                if (list.isEmpty()) {
                                    aVar8.N(-2058338848);
                                    lkf0.b(op5.c(op5Var, pwo.e(R.string.no_data_found_cms, aVar8), "No data found"), androidx.compose.foundation.layout.d.a.b(aVar5, n54Var), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar8, 384, 0, 131064);
                                    aVar8 = aVar8;
                                    aVar8.H();
                                } else {
                                    aVar8.N(-2057850660);
                                    boolean zA3 = aVar8.A(list);
                                    final Function1 function3 = function1;
                                    boolean zM = zA3 | aVar8.M(function3) | aVar8.A(mz1Var2);
                                    final String str2 = str;
                                    boolean zM2 = zM | aVar8.M(str2);
                                    Object objY6 = aVar8.y();
                                    if (zM2 || objY6 == c0042a2) {
                                        objY6 = new Function1() { // from class: b7a
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                szr szrVar = (szr) obj3;
                                                szrVar.getClass();
                                                List list2 = list;
                                                szrVar.d(list2.size(), null, new s7a.b(list2), new op8(802480018, new s7a.c(list2, function3, mz1Var2, str2), true));
                                                return Unit.a;
                                            }
                                        };
                                        aVar8.r(objY6);
                                    }
                                    aur.a(null, null, null, false, null, null, null, false, null, (Function1) objY6, aVar8, 0, 511);
                                    aVar8.H();
                                }
                                aVar8.H();
                                Unit unit3 = Unit.a;
                            } else {
                                if (i3 != 3) {
                                    throw rg.a(1457602320, aVar8);
                                }
                                aVar8.N(-2057221112);
                                aVar8.H();
                                Unit unit4 = Unit.a;
                            }
                        } else {
                            aVar8.N(-2057161375);
                            aVar8.H();
                            Unit unit5 = Unit.a;
                        }
                        aVar8.s();
                        aVar8.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 12804096, 72);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, mz1Var, str, i) { // from class: z6a
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ mz1 c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    s7a.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-288873523);
        int i2 = (bVarI.A(function0) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarR = j.r(aVar2, 52.0f);
            i060 i060Var = j060.a;
            androidx.compose.ui.d dVarA = ls7.a(dVarR, i060Var);
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new o7a(function0, 0);
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY, 15), j58.f, i060Var);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            h9n.a(erz.a(R.drawable.close_icon_white, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(aVar2, 24.8f), null, null, 0.0f, null, bVarI, 432, 120);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: p7a
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    s7a.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, final mz1 mz1Var, final m28 m28Var, androidx.compose.runtime.a aVar, final String str, final Function0 function0) {
        int i2;
        m28Var.getClass();
        mz1Var.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1369827951);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(m28Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(mz1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            u60.a(function0, new yle(true, false, false), pp8.b(-1382965734, new Function2() { // from class: h7a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ViewParent parent = ((View) aVar2.O(AndroidCompositionLocals_androidKt.f)).getParent();
                        Window window = null;
                        if (parent != null) {
                            eme emeVar = parent instanceof eme ? (eme) parent : null;
                            if (emeVar != null) {
                                window = emeVar.getWindow();
                            }
                        }
                        boolean zA = aVar2.A(window);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new y6a(window, i3);
                            aVar2.r(objY);
                        }
                        use useVar = xvf.a;
                        aVar2.t((Function0) objY);
                        Function0 function1 = function0;
                        boolean zM = aVar2.M(function1);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new j7a(function1, 0);
                            aVar2.r(objY2);
                        }
                        s7a.e(0, mz1Var, m28Var, aVar2, str, (Function0) objY2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 9) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: i7a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s7a.c(qj40.a(i | 1), mz1Var, m28Var, (a) obj, str, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final String str, final Function1<? super String, Unit> function1, final mz1 mz1Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        i060 i060VarE;
        str.getClass();
        function1.getClass();
        mz1Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(272744031);
        int i2 = 32;
        int i3 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            List listK = kotlin.collections.b.k("Day", "Month", "Year");
            float f = 20.0f;
            androidx.compose.ui.d dVarA = ls7.a(j.i(h.i(androidx.compose.ui.d.a.b, 16.0f, 16.0f, 16.0f, 8.0f), 32.0f), j060.c(20.0f));
            long jD = r58.d(4282466625L);
            zk40.a aVar2 = zk40.a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarA, jD, aVar2);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            boolean z = true;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, 960183819, listK);
            int i4 = 0;
            while (itA.hasNext()) {
                Object next = itA.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                final String str2 = (String) next;
                boolean zG = Intrinsics.g(str2, str);
                if (i4 == 0) {
                    i060VarE = j060.e(f, 0.0f, 0.0f, f, 6);
                } else {
                    i060VarE = i4 == listK.size() + (-1) ? j060.e(0.0f, f, f, 0.0f, 9) : j060.c(0.0f);
                }
                boolean z2 = z;
                int i6 = i3;
                List list = listK;
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(d35.a(ls7.a(j.c(new LayoutWeightElement(1.0f, z2), 1.0f), i060VarE), 1.0f, mz1Var.r(), i060VarE), zG ? mz1Var.v() : mz1Var.u(), aVar2);
                boolean zM = ((i6 & 112) == i2 ? z2 : false) | bVarI.M(str2);
                Object objY = bVarI.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function0() { // from class: d7a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(str2);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                androidx.compose.ui.d dVarA2 = s3w.a(androidx.compose.foundation.d.d(dVarB2, false, null, null, (Function0) objY, 15), "biggest_coeff_" + str2);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                op5 op5Var = op5.a;
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                androidx.compose.runtime.b bVar2 = bVarI;
                lkf0.b(op5.c(op5Var, lowerCase.concat(":sg_game_name"), str2), null, r58.d(4291743438L), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.c(((sfd0) bVarI.O(ni60.b)).d), bVar2, 384, 0, 65530);
                bVar2.X(z2);
                z = z2;
                bVarI = bVar2;
                i4 = i5;
                aVar2 = aVar2;
                i3 = i6;
                listK = list;
                f = f;
                i2 = 32;
            }
            bVar = bVarI;
            bVar.X(false);
            bVar.X(z);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function1, mz1Var, i) { // from class: e7a
                public final /* synthetic */ String a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ mz1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    s7a.d(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final int i, final mz1 mz1Var, final m28 m28Var, androidx.compose.runtime.a aVar, final String str, Function0 function0) {
        Function0 function1;
        androidx.compose.runtime.b bVar;
        final ytw ytwVar;
        float f;
        float f2;
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(1951746764);
        int i2 = i | (bVarI.A(m28Var) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar2 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b("");
                bVarI.r(objY2);
            }
            ytw ytwVar3 = (ytw) objY2;
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            int i3 = configuration.screenHeightDp;
            float density = ((mmd) bVarI.O(kna.h)).getDensity();
            double d2 = ((double) configuration.screenWidthDp) * 0.9d;
            float f3 = (i3 * density) / 50.0f;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), j58.c(0.2f, j58.b), zk40.a);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = rzk.a(bVarI);
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.d.b(dVarB, (psw) objY3, null, false, null, function0, 28);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarJ = h.j(j.w(j.c(aVar2, 1.0f), (float) d2), 0.0f, f3, 0.0f, 0.0f, 13);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new k7a();
                bVarI.r(objY5);
            }
            androidx.compose.ui.d dVarB3 = androidx.compose.foundation.d.b(dVarJ, pswVar, null, false, null, (Function0) objY5, 28);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarB3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                ytwVar = ytwVar3;
                objY6 = new Function1() { // from class: l7a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        ytwVar2.setValue(Boolean.TRUE);
                        ytwVar.setValue(str2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            } else {
                ytwVar = ytwVar3;
            }
            Function1 function2 = (Function1) objY6;
            int i4 = i2 & 14;
            int i5 = i2 & 896;
            int i6 = i2 & 7168;
            bVar = bVarI;
            function1 = function0;
            a(m28Var, function2, mz1Var, str, bVar, i4 | 48 | i5 | i6);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
                f = Float.MAX_VALUE;
            } else {
                f = Float.MAX_VALUE;
                f2 = 1.0f;
            }
            ty0.a(bVar, new LayoutWeightElement(f2, true));
            b(function1, bVar, (i2 & 112) | 6);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            ty0.a(bVar, new LayoutWeightElement(1.0f > f ? f : 1.0f, true));
            bVar.X(true);
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                bVar.N(-1089191044);
                String str2 = (String) ytwVar.getValue();
                Object objY7 = bVar.y();
                if (objY7 == c0042a) {
                    objY7 = new Function0() { // from class: m7a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytwVar2.setValue(Boolean.FALSE);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY7);
                }
                ida.c(m28Var, str2, mz1Var, str, (Function0) objY7, bVar, i4 | 24576 | i5 | i6, 0);
                bVar = bVar;
                z = false;
            } else {
                z = false;
                bVar.N(-1095657520);
            }
            bVar.X(z);
            bVar.X(true);
        } else {
            function1 = function0;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function0 function3 = function1;
            eVarZ.d = new Function2(i, mz1Var, m28Var, str, function3) { // from class: n7a
                public final /* synthetic */ m28 a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ mz1 c;
                public final /* synthetic */ String d;

                {
                    this.a = m28Var;
                    this.b = function3;
                    this.c = mz1Var;
                    this.d = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s7a.e(qj40.a(1), this.c, this.a, (a) obj, this.d, this.b);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    public static final void g(BiggestResponse biggestResponse, Function1 function1, final mz1 mz1Var, final String str, androidx.compose.runtime.a aVar, final int i) {
        final Function1 function2;
        final BiggestResponse biggestResponse2;
        boolean z;
        long jX;
        String str2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        biggestResponse.getClass();
        function1.getClass();
        mz1Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-73875105);
        int i2 = (bVarI.M(str) ? 2048 : 1024) | i | (bVarI.M(biggestResponse) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            if (str != null) {
                int i3 = i5c0.d;
                if (str.equalsIgnoreCase(TEFcJcMqR.BJpEQubhG)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            Double dH = kotlin.text.b.h(biggestResponse.getHouseCoefficient());
            double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
            if (z) {
                bVarI.N(-1789646271);
                jX = i5c0.a(dDoubleValue, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1789575188);
                bVarI.X(false);
                jX = mz1Var.x();
            }
            long j = jX;
            long jW = z ? i5c0.a : mz1Var.w();
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = ls7.a(j.i(h.j(j.g(aVar3, 1.0f), 16.0f, 0.0f, 16.0f, 4.0f, 2), 35.0f), j060.c(20.0f));
            long jP = mz1Var.p();
            zk40.a aVar4 = zk40.a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarA, jP, aVar4);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            long j2 = jW;
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            String updateTime = biggestResponse.getUpdateTime();
            updateTime.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date date = simpleDateFormat.parse(updateTime);
                date.getClass();
                str2 = simpleDateFormat2.format(date);
                str2.getClass();
            } catch (Exception e) {
                e.printStackTrace();
                str2 = "";
            }
            long j3 = j58.f;
            imf0 imf0VarB = ni60.b(((sfd0) bVarI.O(ni60.b)).d);
            f160 f160Var = f160.a;
            lkf0.b(str2, s3w.a(h.j(f160Var.a(1.0f, aVar3, true), 12.0f, 0.0f, 0.0f, 0.0f, 14), "biggest_coeff_date_value"), j3, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarB, bVarI, 384, 0, 65528);
            androidx.compose.ui.d dVarA2 = f160Var.a(1.0f, aVar3, true);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar5;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar5;
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            androidx.compose.ui.d dVarA3 = s3w.a(h.h(androidx.compose.foundation.a.b(ls7.a(j.w(aVar3, 110.0f), j060.c(20.0f)), j2, aVar4), 0.0f, 4.0f, 1), "biggest_coeff_coefficient_value");
            aiv aivVarC2 = g75.c(ht.a.a, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarA3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            String houseCoefficient = biggestResponse.getHouseCoefficient();
            houseCoefficient.getClass();
            try {
                double d2 = Double.parseDouble(houseCoefficient);
                houseCoefficient = d2 % 1.0d == 0.0d ? String.valueOf((int) d2) : StringsKt.v0(StringsKt.v0(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)), '0'), '.');
            } catch (Exception unused) {
            }
            boolean z2 = false;
            lkf0.b(yk10.a(houseCoefficient, "x"), androidx.compose.foundation.layout.d.a.b(aVar3, n54Var), j, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).d, R.dimen._9ssp, bVarI), bVarI, 0, 3072, 57336);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
            androidx.compose.ui.d dVarA4 = s3w.a(h.j(f160Var.a(1.0f, aVar3, true), 0.0f, 0.0f, 38.0f, 0.0f, 11), "biggest_coeff_fairness");
            aiv aivVarC3 = g75.c(ht.a.f, false);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarA4);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            crz crzVarA = erz.a(R.drawable.fairness, 0, bVarI);
            yn60 yn60Var = new yn60();
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 14) == 4) {
                z2 = true;
            }
            boolean z4 = z2 | z3;
            Object objY = bVarI.y();
            if (z4 || objY == androidx.compose.runtime.a.C0041a.a) {
                biggestResponse2 = biggestResponse;
                function2 = function1;
                objY = new Function0() { // from class: f7a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(biggestResponse2.getRoundId());
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                biggestResponse2 = biggestResponse;
                function2 = function1;
            }
            h6n.b(crzVarA, "Secure", j.r(androidx.compose.foundation.d.d(aVar3, false, null, null, (Function0) objY, 15), 16.0f), yn60Var.u1, bVarI, 48, 0);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            function2 = function1;
            biggestResponse2 = biggestResponse;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final BiggestResponse biggestResponse3 = biggestResponse2;
            final Function1 function3 = function2;
            eVarZ.d = new Function2(function3, mz1Var, str, i) { // from class: g7a
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ mz1 c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    s7a.g(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        boolean z;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-295519482);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i & 1, z)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarJ = h.j(j.g(aVar2, 1.0f), 16.0f, 0.0f, 16.0f, 8.0f, 2);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            op5 op5Var = op5.a;
            String strC = op5.c(op5Var, pwo.e(R.string.date_cms, bVarI), "Date");
            f160 f160Var = f160.a;
            androidx.compose.ui.d dVarA = s3w.a(h.j(f160Var.a(0.33f, aVar2, true), 12.0f, 0.0f, 0.0f, 0.0f, 14), "biggest_coeff_date_text");
            long j = j58.d;
            gdf0 gdf0Var = new gdf0(5);
            qyd0 qyd0Var = ni60.b;
            lkf0.b(strC, dVarA, j, 0L, null, null, null, 0L, gdf0Var, 0L, 0, false, 0, 0, null, ni60.b(((sfd0) bVarI.O(qyd0Var)).c), bVarI, 384, 0, 65016);
            lkf0.b(op5.c(op5Var, pwo.e(R.string.coeff_text_cms, bVarI), "Coeff"), s3w.a(f160Var.a(0.33f, aVar2, true), "biggest_coefficient_text"), j, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.b(((sfd0) bVarI.O(qyd0Var)).c), bVarI, 384, 0, 65016);
            lkf0.b(op5.c(op5Var, pwo.e(R.string.fairness_cms, bVarI), LGxrN.QSskUJBtw), s3w.a(h.j(f160Var.a(0.33f, aVar2, true), 0.0f, 0.0f, 25.0f, 0.0f, 11), "biggest_coeff_fairness_text"), j, 0L, null, null, null, 0L, new gdf0(2), 0L, 0, false, 0, 0, null, ni60.b(((sfd0) bVarI.O(qyd0Var)).c), bVarI, 384, 0, 65016);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new c7a();
        }
    }
}
