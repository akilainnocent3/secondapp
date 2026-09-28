package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cmm {

    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.dialog.HowToPlayBottomSheetKt$HowToPlayBottomSheet$1$1$1$1$1", f = "HowToPlayBottomSheet.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ j590 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j590 j590Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = j590Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
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
                this.a = 1;
                if (this.b.d(this) == y5bVar) {
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

    public static final void a(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVar;
        function0.getClass();
        b bVarI = aVar.i(208096800);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.A(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            qyd0 qyd0Var = ajb0.a;
            bVar = bVarI;
            v1w.a(function0, v8j0.a(v8j0.b(d.a.b)), j590VarG, 0.0f, false, j060.e(((zib0) bVarI.O(qyd0Var)).d, ((zib0) bVarI.O(qyd0Var)).d, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).i0, 0L, 0L, d59.a, null, null, pp8.b(2022204418, new gaj() { // from class: wlm
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarC = g3w.c(j.i(d.a.b, (float) ((((double) ((Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp) * 0.9d) - 22.0d)));
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarC);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, yka.a.d);
                        final v5b v5bVar2 = v5bVar;
                        boolean zA = aVar2.A(v5bVar2);
                        final j590 j590Var = j590VarG;
                        boolean zM = zA | aVar2.M(j590Var);
                        final Function0 function1 = function0;
                        boolean zM2 = zM | aVar2.M(function1);
                        Object objY2 = aVar2.y();
                        if (zM2 || objY2 == a.C0041a.a) {
                            objY2 = new Function0() { // from class: ylm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    final j590 j590Var2 = j590Var;
                                    jvd0 jvd0VarC = ej5.c(v5bVar2, null, null, new cmm.a(j590Var2, null), 3);
                                    final Function0 function2 = function1;
                                    jvd0VarC.invokeOnCompletion(new Function1() { // from class: amm
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            if (!j590Var2.e()) {
                                                function2.invoke();
                                            }
                                            return Unit.a;
                                        }
                                    });
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        cmm.d((Function0) objY2, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, i2 & 14, 3078, 7064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xlm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    cmm.a(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(1420775533);
        if (bVarI.q(i & 1, i != 0)) {
            d dVarC = op70.c(j.g(d.a.b, 1.0f), op70.a(bVarI), 14);
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
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
            hlh0.a(bVarI, dVarC2, yka.a.d);
            e(R.string.page_virtual__build_and_go_how_to_play_content_title1, R.string.page_virtual__build_and_go_how_to_play_content_desc1, cb40.a(R.string.page_virtual__build_and_go_how_to_play_content_img1, new Object[0], bVarI), bVarI, 0, 0);
            e(R.string.page_virtual__build_and_go_how_to_play_content_title2, R.string.page_virtual__build_and_go_how_to_play_content_desc2, cb40.a(R.string.page_virtual__build_and_go_how_to_play_content_img2, new Object[0], bVarI), bVarI, 0, 0);
            e(R.string.page_virtual__build_and_go_how_to_play_content_title3, R.string.page_virtual__build_and_go_how_to_play_content_desc3, cb40.a(R.string.page_virtual__build_and_go_how_to_play_content_img3, new Object[0], bVarI), bVarI, 0, 0);
            e(R.string.page_virtual__build_and_go_how_to_play_content_title4, R.string.page_virtual__build_and_go_how_to_play_content_desc4, null, bVarI, 0, 4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tnc(i);
        }
    }

    public static final void c(Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        int i2;
        b bVarI = aVar.i(766203003);
        int i3 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new bmm();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarJ, false, (Function1) objY);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
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
            h9n.a(erz.a(R.drawable.ic__feature__build_and_go, 0, bVarI), null, j.r(aVar2, 24.0f), null, null, 0.0f, null, bVarI, 432, 120);
            String strA = cb40.a(R.string.common_helps__how_to_play, new Object[0], bVarI);
            qyd0 qyd0Var = oib0.a;
            i2 = 1;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).d, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            d040.a(1.0f, true, bVarI);
            crz crzVarA = erz.a(R.drawable.ic_cancel, 0, bVarI);
            d dVarR = j.r(aVar2, 16.0f);
            boolean z = (i3 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new rnc(function0, 1);
                bVarI.r(objY2);
            }
            h6n.b(crzVarA, "Close icon", g3w.h(g3w.f(dVarR, true, (Function0) objY2), "how_to_play_close_icon"), ((lib0) bVarI.O(qyd0Var)).P, bVarI, 48, 0);
            bVarI.X(true);
        } else {
            i2 = 1;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new dih(i, i2, function0);
        }
    }

    public static final void d(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(2069684314);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarF = h.f(j.e(d.a.b, 1.0f), 16.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            c(function0, bVarI, i2 & 14);
            b(0, bVarI);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: zlm
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cmm.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final int i, final int i2, String str, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        String str2;
        int i5;
        final String str3;
        String str4;
        b bVarI = aVar.i(898762732);
        int i6 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(i2) ? 32 : 16);
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 = i6 | 384;
            str2 = str;
        } else {
            str2 = str;
            i5 = i6 | (bVarI.M(str2) ? 256 : 128);
        }
        if (bVarI.q(i5 & 1, (i5 & 147) != 146)) {
            String str5 = i7 != 0 ? null : str2;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            String strA = cb40.a(i, new Object[0], bVarI);
            d dVarG2 = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).a;
            qyd0 qyd0Var2 = kjb0.a;
            String str6 = str5;
            lkf0.d(strA, dVarG2, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).j, bVarI, 48, 0, 131064);
            lkf0.d(cb40.a(i2, new Object[0], bVarI), j.g(aVar2, 1.0f), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 48, 0, 131064);
            bVarI = bVarI;
            if (str6 == null) {
                bVarI.N(-46846424);
                bVarI.X(false);
                str4 = str6;
            } else {
                bVarI.N(-46846423);
                d dVarA = ls7.a(j.i(j.g(aVar2, 1.0f), 160.0f), j060.c(((zib0) bVarI.O(ajb0.a)).d));
                str4 = str6;
                mw90.a(str4, null, dVarA, null, null, null, null, bVarI, 48, 2040);
                bVarI.X(false);
            }
            bVarI.X(true);
            str3 = str4;
        } else {
            bVarI.G();
            str3 = str2;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, i3, i4, str3) { // from class: vlm
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ int d;

                {
                    this.c = str3;
                    this.d = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cmm.e(this.a, this.b, this.c, (a) obj, iA, this.d);
                    return Unit.a;
                }
            };
        }
    }
}
