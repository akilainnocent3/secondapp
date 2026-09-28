package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class ftf {

    @c0d(c = "com.sportybet.android.limits.edit.compose.EditSportsScreenKt$BettingFormEvent$1$1", f = "EditSportsScreen.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a390<id90> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ ytw<o990> d;

        /* JADX INFO: renamed from: ftf$a$a, reason: collision with other inner class name */
        public static final class C0585a<T> implements myh {
            public final /* synthetic */ Function0<Unit> a;
            public final /* synthetic */ ytw<o990> b;

            public C0585a(ytw ytwVar, Function0 function0) {
                this.a = function0;
                this.b = ytwVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                id90 id90Var = (id90) obj;
                if (id90Var instanceof ssf.a) {
                    this.a.invoke();
                } else if (id90Var instanceof o990) {
                    this.b.setValue((o990) id90Var);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a390<? extends id90> a390Var, Function0<Unit> function0, ytw<o990> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = a390Var;
            this.c = function0;
            this.d = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0585a c0585a = new C0585a(this.d, this.c);
                this.a = 1;
                if (this.b.collect(c0585a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fkd.a();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final a390<? extends id90> a390Var, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVar;
        a390Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1826376881);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(a390Var) : bVarI.A(a390Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            Unit unit = Unit.a;
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(a390Var))) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new a(a390Var, function0, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            o990 o990Var = (o990) ytwVar.getValue();
            if (o990Var == null) {
                bVarI.N(-947460607);
                bVarI.X(false);
                bVar = bVarI;
            } else {
                bVarI.N(-947460606);
                String strA = cb40.a(R.string.common_functions__error, new Object[0], bVarI);
                String strG = o990Var.a.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new Function0() { // from class: btf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytwVar.setValue(null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                nzj.b(null, strA, strG, null, null, null, null, null, null, null, null, null, (Function0) objY3, null, bVarI, 0, 384, 12281);
                bVar = bVarI;
                bVar.X(false);
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ctf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    ftf.a(a390Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final scs scsVar, final vfb0 vfb0Var, zsf zsfVar, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        final zsf zsfVar2;
        zsf zsfVar3;
        int i2;
        v1b v1bVar;
        function0.getClass();
        b bVarI = aVar.i(-660551587);
        int i3 = i | 128 | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                String string = vfb0Var.toString();
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    zsfVar3 = (zsf) p8i0.a(jq40.a(zsf.class), w8i0VarA, string, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-897);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-897);
                zsfVar3 = zsfVar;
            }
            bVarI.Y();
            ytw ytwVarC = wyh.c(zsfVar3.b, bVarI, 0, 7);
            ytw ytwVarB = n95.b(zsfVar3.I, bVarI);
            ytw ytwVarB2 = n95.b(zsfVar3.K, bVarI);
            a(zsfVar3.d, function0, bVarI, (i2 >> 6) & 112);
            usf usfVar = (usf) ytwVarC.getValue();
            boolean z = usfVar instanceof usf.b;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z) {
                bVarI.N(865102739);
                k0k.a(0, 3, bVarI, null, null);
                bVarI.X(false);
                v1bVar = null;
            } else if (usfVar instanceof usf.c) {
                bVarI.N(865105390);
                usf usfVar2 = (usf) ytwVarC.getValue();
                usfVar2.getClass();
                wfb0 wfb0Var = ((usf.c) usfVar2).a;
                uxs uxsVar = (uxs) ytwVarB.getValue();
                boolean zBooleanValue = ((Boolean) ytwVarB2.getValue()).booleanValue();
                boolean zA = bVarI.A(zsfVar3);
                Object objY = bVarI.y();
                if (zA || objY == c0042a) {
                    gtf gtfVar = new gtf(1, zsfVar3, zsf.class, "onDailyTextChanged", "onDailyTextChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                    bVarI.r(gtfVar);
                    objY = gtfVar;
                }
                Function1 function1 = (Function1) ((chp) objY);
                boolean zA2 = bVarI.A(zsfVar3);
                Object objY2 = bVarI.y();
                if (zA2 || objY2 == c0042a) {
                    htf htfVar = new htf(1, zsfVar3, zsf.class, "onWeeklyTextChanged", "onWeeklyTextChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                    bVarI.r(htfVar);
                    objY2 = htfVar;
                }
                Function1 function2 = (Function1) ((chp) objY2);
                boolean zA3 = bVarI.A(zsfVar3);
                Object objY3 = bVarI.y();
                if (zA3 || objY3 == c0042a) {
                    objY3 = new itf(1, zsfVar3, zsf.class, "onMonthlyTextChanged", "onMonthlyTextChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                    bVarI.r(objY3);
                }
                Function1 function3 = (Function1) ((chp) objY3);
                boolean zA4 = bVarI.A(zsfVar3);
                Object objY4 = bVarI.y();
                if (zA4 || objY4 == c0042a) {
                    jtf jtfVar = new jtf(0, zsfVar3, zsf.class, "onResetForm", "onResetForm()Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(jtfVar);
                    objY4 = jtfVar;
                }
                Function0 function4 = (Function0) objY4;
                boolean zA5 = bVarI.A(zsfVar3);
                Object objY5 = bVarI.y();
                if (zA5 || objY5 == c0042a) {
                    ktf ktfVar = new ktf(0, zsfVar3, zsf.class, "saveLimits", "saveLimits()Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(ktfVar);
                    objY5 = ktfVar;
                }
                c(wfb0Var, uxsVar, zBooleanValue, function1, function2, function3, function4, (Function0) objY5, bVarI, 0);
                bVarI = bVarI;
                bVarI.X(false);
                v1bVar = null;
            } else {
                v1bVar = null;
                if (!(usfVar instanceof usf.a)) {
                    throw igf0.a(bVarI, 865101429, false);
                }
                bVarI.N(865122255);
                cdg.a(0, 1, bVarI, null);
                bVarI.X(false);
            }
            boolean zA6 = bVarI.A(zsfVar3);
            Object objY6 = bVarI.y();
            if (zA6 || objY6 == c0042a) {
                objY6 = new ltf(v1bVar, zsfVar3, scsVar, vfb0Var);
                bVarI.r(objY6);
            }
            xvf.e(bVarI, vfb0Var, (Function2) objY6);
            zsfVar2 = zsfVar3;
        } else {
            bVarI.G();
            zsfVar2 = zsfVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(vfb0Var, zsfVar2, function0, i) { // from class: dtf
                public final /* synthetic */ vfb0 b;
                public final /* synthetic */ zsf c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(55);
                    ftf.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final wfb0 wfb0Var, final uxs uxsVar, final boolean z, final Function1 function1, final Function1 function2, final Function1 function3, final Function0 function0, final Function0 function4, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(203220338);
        int i2 = i | (bVarI.M(wfb0Var) ? 4 : 2) | (bVarI.d(uxsVar.ordinal()) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.A(function4) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarI = h.i(op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14), 24.0f, 24.0f, 24.0f, 100.0f);
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            ufb0.b(wfb0Var.a, wfb0Var.b, wfb0Var.c, function1, function2, function3, bVarI, i2 & 523264);
            bVarI = bVarI;
            boolean z2 = true;
            d dVarH = h.h(aVar2, 0.0f, 24.0f, 1);
            i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            bVarI.N(-1550644776);
            Iterator<UiText> it = wfb0Var.d.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                UiText next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                UiText uiText = next;
                d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
                int iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, aVar2);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS4, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                }
                hlh0.a(bVarI, dVarC4, yka.a.d);
                b bVar2 = bVarI;
                d.a aVar6 = aVar2;
                lkf0.d(i4 + ". ", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R_21, bVarI), bVar2, 0, 0, 131070);
                lkf0.d(uiText.g((Context) bVar2.O(AndroidCompositionLocals_androidKt.b)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R_21, bVar2), bVar2, 0, 0, 131070);
                bVarI = bVar2;
                szg.a(bVarI, true, aVar6, 8.0f, bVarI);
                it = it;
                aVar2 = aVar6;
                z2 = true;
                i3 = i4;
            }
            boolean z3 = z2;
            f30.a(bVarI, false, z3, z3);
            int i5 = i2 >> 9;
            rsf.a(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), z, uxsVar, function0, function4, bVarI, ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i5 & 7168) | (i5 & 57344), 0);
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uxsVar, z, function1, function2, function3, function0, function4, i) { // from class: etf
                public final /* synthetic */ uxs b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ftf.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
