package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class j050 {

    @c0d(c = "com.sportybet.android.account.latam.validation.presentation.RegistrationValidationScreenKt$SnackBarMessage$1$1$1", f = "RegistrationValidationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ v5b a;
        public final /* synthetic */ v3a0 b;
        public final /* synthetic */ String c;

        /* JADX INFO: renamed from: j050$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.account.latam.validation.presentation.RegistrationValidationScreenKt$SnackBarMessage$1$1$1$1", f = "RegistrationValidationScreen.kt", l = {129}, m = "invokeSuspend", v = 2)
        public static final class C0706a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ v3a0 b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0706a(v3a0 v3a0Var, String str, v1b<? super C0706a> v1bVar) {
                super(2, v1bVar);
                this.b = v3a0Var;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0706a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0706a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (v3a0.b(this.b, this.c, null, false, null, this, 14) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v5b v5bVar, v3a0 v3a0Var, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = v5bVar;
            this.b = v3a0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(this.a, null, null, new C0706a(this.b, this.c, null), 3);
            return Unit.a;
        }
    }

    public static final void a(String str, androidx.compose.runtime.a aVar, int i) {
        b bVarI = aVar.i(1865173567);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            j(yl9.a, cb40.a(R.string.common_functions__email, new Object[0], bVarI), str, bVarI, ((i2 << 6) & 896) | 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new jz40(i, 0, str);
        }
    }

    public static final void b(final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-470348212);
        int i2 = i | (bVarI.A(function0) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            nzj.d(cb40.a(R.string.common_functions__error, new Object[0], bVarI), cb40.a(R.string.register_login_br__facial_recognition_error_msg, new Object[0], bVarI), null, null, cb40.a(R.string.common_functions__try_again, new Object[0], bVarI), cb40.a(R.string.common_functions__cancel, new Object[0], bVarI), null, null, null, null, null, function0, function1, null, bVarI, 0, (i2 << 6) & 8064, 20380);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0, function1) { // from class: wz40
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = function0;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j050.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final boolean z2, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(482665389);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.b(z2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            final int i3 = z2 ? R.string.register_login_br__start_your_verification : R.string.register_login_br__verify_phone_number_first;
            g(6, pp8.b(-1348987163, new Function2() { // from class: mz40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarH = h.h(aVar3, 16.0f, 0.0f, 2);
                        d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.k, aVar2, 54);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarH);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, d160VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        h6n.b(erz.a(R.drawable.ic_facial_recognition, 0, aVar2), null, j.r(aVar3, 32.0f), c68.a(R.color.brand_quaternary, aVar2), aVar2, 432, 0);
                        d dVarH2 = h.h(new LayoutWeightElement(1.0f, true), 0.0f, 26.0f, 1);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarH2);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        lkf0.d(cb40.a(R.string.register_login_br__facial_recognition, new Object[0], aVar2), null, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 0, 0, 131066);
                        lkf0.d(cb40.a(i3, new Object[0], aVar2), null, c68.a(R.color.text_type1_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar2), aVar2, 0, 0, 131066);
                        aVar2.s();
                        j050.m(0, aVar2, function0, z);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, function0, i) { // from class: nz40
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j050.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(161032204);
        if (bVarI.q(i & 1, i != 0)) {
            h6n.b(erz.a(R.drawable.ic_phone, 0, bVarI), null, h.f(j.r(d.a.b, 32.0f), 4.0f), c68.a(R.color.brand_quaternary, bVarI), bVarI, 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tz40();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(s050 s050Var, androidx.compose.runtime.a aVar, int i) {
        final s050 s050Var2;
        b bVarI = aVar.i(1336390451);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                s050Var2 = (s050) p8i0.a(jq40.a(s050.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                s050Var2 = s050Var;
            }
            bVarI.Y();
            final ytw ytwVarC = wyh.c(s050Var2.b, bVarI, 0, 7);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = b40.a(bVarI);
            }
            final v3a0 v3a0Var = (v3a0) objY;
            hy60.a(null, null, null, pp8.b(-1210001107, new Function2() { // from class: hz40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        s3a0.b(v3a0Var, null, null, aVar2, 6, 6);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, 0, 0L, 0L, null, pp8.b(-2035250044, new gaj() { // from class: sz40
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d dVarE = h.e(d.a.b, tmzVar);
                        l050 l050Var = (l050) ytwVarC.getValue();
                        s050 s050Var3 = s050Var2;
                        boolean zA = aVar2.A(s050Var3);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zA || objY2 == c0042a2) {
                            b050 b050Var = new b050(1, s050Var3, s050.class, "onPhoneNumberChanged", "onPhoneNumberChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                            aVar2.r(b050Var);
                            objY2 = b050Var;
                        }
                        Function1 function1 = (Function1) ((chp) objY2);
                        boolean zA2 = aVar2.A(s050Var3);
                        Object objY3 = aVar2.y();
                        if (zA2 || objY3 == c0042a2) {
                            c050 c050Var = new c050(0, s050Var3, s050.class, "onVerifyPhoneNumberClicked", "onVerifyPhoneNumberClicked()V", 0);
                            aVar2.r(c050Var);
                            objY3 = c050Var;
                        }
                        Function0 function0 = (Function0) ((chp) objY3);
                        boolean zA3 = aVar2.A(s050Var3);
                        Object objY4 = aVar2.y();
                        if (zA3 || objY4 == c0042a2) {
                            d050 d050Var = new d050(0, s050Var3, s050.class, "onVerifyFaceRecognitionClicked", "onVerifyFaceRecognitionClicked()V", 0);
                            aVar2.r(d050Var);
                            objY4 = d050Var;
                        }
                        Function0 function2 = (Function0) ((chp) objY4);
                        boolean zA4 = aVar2.A(s050Var3);
                        Object objY5 = aVar2.y();
                        if (zA4 || objY5 == c0042a2) {
                            e050 e050Var = new e050(0, s050Var3, s050.class, "onExitConfirmed", "onExitConfirmed()V", 0);
                            aVar2.r(e050Var);
                            objY5 = e050Var;
                        }
                        j050.f(dVarE, l050Var, function1, function0, function2, (Function0) ((chp) objY5), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 805309440, 503);
            boolean zA = bVarI.A(s050Var2);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new zbi(s050Var2, 2);
                bVarI.r(objY2);
            }
            tnu tnuVarC = com.sporty.android.platform.features.newotp.agent.b.c((Function1) objY2, bVarI);
            boolean zA2 = bVarI.A(s050Var2);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new e210(s050Var2, 1);
                bVarI.r(objY3);
            }
            tnu tnuVarA = s6h.a((Function1) objY3, bVarI);
            UiText uiText = ((l050) ytwVarC.getValue()).g;
            boolean zA3 = bVarI.A(s050Var2);
            Object objY4 = bVarI.y();
            if (zA3 || objY4 == c0042a) {
                f050 f050Var = new f050(0, s050Var2, s050.class, "onSnackBarMessageShown", "onSnackBarMessageShown()V", 0);
                bVarI.r(f050Var);
                objY4 = f050Var;
            }
            h(uiText, (Function0) ((chp) objY4), v3a0Var, bVarI, 384);
            if (((l050) ytwVarC.getValue()).i) {
                bVarI.N(-1937585717);
                boolean zA4 = bVarI.A(s050Var2);
                Object objY5 = bVarI.y();
                if (zA4 || objY5 == c0042a) {
                    g050 g050Var = new g050(0, s050Var2, s050.class, "onTryAgainFacialRecognition", "onTryAgainFacialRecognition()V", 0);
                    bVarI.r(g050Var);
                    objY5 = g050Var;
                }
                Function0 function0 = (Function0) ((chp) objY5);
                boolean zA5 = bVarI.A(s050Var2);
                Object objY6 = bVarI.y();
                if (zA5 || objY6 == c0042a) {
                    h050 h050Var = new h050(0, s050Var2, s050.class, "onFacialRecognitionErrorDialogDismissed", "onFacialRecognitionErrorDialogDismissed()V", 0);
                    bVarI.r(h050Var);
                    objY6 = h050Var;
                }
                b(function0, (Function0) ((chp) objY6), bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-1937397361);
                bVarI.X(false);
            }
            Unit unit = Unit.a;
            boolean zA6 = bVarI.A(s050Var2) | bVarI.A(tnuVarC) | bVarI.A(tnuVarA);
            Object objY7 = bVarI.y();
            if (zA6 || objY7 == c0042a) {
                objY7 = new i050(s050Var2, tnuVarC, tnuVarA, null);
                bVarI.r(objY7);
            }
            xvf.e(bVarI, unit, (Function2) objY7);
        } else {
            bVarI.G();
            s050Var2 = s050Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vz40(s050Var2, i);
        }
    }

    public static final void f(final d dVar, final l050 l050Var, final Function1 function1, final Function0 function0, final Function0 function2, final Function0 function3, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-1585925203);
        int i2 = i | (bVarI.M(l050Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74897 & i2) != 74896)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            w42.a(false, 16.0f, new kw0.i(12.0f, true, new hw0()), null, function3, pp8.b(-1133625713, new gaj() { // from class: yz40
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        mor.a(0, aVar4);
                        d.a aVar5 = d.a.b;
                        ty0.a(aVar4, j.i(aVar5, 28.0f));
                        l050 l050Var2 = l050Var;
                        l050Var2.getClass();
                        String str = l050Var2.c;
                        ijf0 ijf0Var = l050Var2.b;
                        boolean z = l050Var2.f;
                        z230.d(null, a4h.a(Integer.valueOf(R.string.component_register__progressbar_account_info), Integer.valueOf(R.string.component_register__progressbar_personal_info), Integer.valueOf(R.string.common_functions__identity_verification)), new c430.b(2, p780.f), c68.a(R.color.brand_quaternary, aVar4), aVar4, 0, 1);
                        ty0.a(aVar4, j.i(aVar5, 26.0f));
                        j050.a(l050Var2.a, aVar4, 0);
                        if (z) {
                            aVar4.N(-515259009);
                            j050.l(ijf0Var.a.b, "+" + str, aVar4, 0);
                            aVar4.H();
                        } else {
                            aVar4.N(-515034631);
                            j050.i(l050Var2.b, inm.a("+", str), ijf0Var.a.b.length() > 0 && l050Var2.d == null && !l050Var2.e, l050Var2.d, function1, function0, aVar4, 0);
                            aVar4 = aVar4;
                            aVar4.H();
                        }
                        if (z) {
                            aVar4.N(-514515815);
                            j050.c(z && !l050Var2.h, z, function2, aVar4, 0);
                            aVar4.H();
                        } else {
                            aVar4.N(-514214061);
                            aVar4.H();
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 57344) | 197040, 9);
            if (l050Var.j) {
                bVarI.N(-2096671704);
                q330.a(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.e), 0L, 0.0f, 0L, 0, 0.0f, bVarI, 0, 62);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(-2096591941);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l050Var, function1, function0, function2, function3, i) { // from class: zz40
                public final /* synthetic */ l050 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j050.f(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(int i, op8 op8Var, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(2036023717);
        int i2 = 1;
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            d dVarB = androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), c68.a(R.color.registration_validation_item_bg, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            w1i.a(6, op8Var, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new yl4(i, i2, op8Var);
        }
    }

    public static final void h(final UiText uiText, final Function0<Unit> function0, final v3a0 v3a0Var, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(38320278);
        int i2 = (bVarI.M(uiText) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (!bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVarI.G();
        } else if (uiText == null) {
            bVarI.N(-861748549);
            bVarI.X(false);
        } else {
            bVarI.N(-861748548);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY);
            }
            v5b v5bVar = (v5b) objY;
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            boolean zA = bVarI.A(v5bVar) | bVarI.M(strG);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new a(v5bVar, v3a0Var, strG, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, uiText, (Function2) objY2);
            function0.invoke();
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, v3a0Var, i) { // from class: xz40
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ v3a0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    j050.h(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final ijf0 ijf0Var, final String str, final boolean z, final UiText uiText, final Function1<? super ijf0, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-1177290535);
        int i2 = i | (bVarI.M(ijf0Var) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.M(uiText) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            g(6, pp8.b(1680882337, new Function2() { // from class: kz40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String strG;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = h.g(aVar3, 16.0f, 12.0f);
                        i78 i78VarA = g78.a(new kw0.i(10.0f, true, new hw0()), ht.a.m, aVar2, 6);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.k, aVar2, 54);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, aVar3);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        j050.d(0, aVar2);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        lkf0.d(cb40.a(R.string.common_functions__mobile_phone_number, new Object[0], aVar2), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c68.a(R.color.text_type1_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R_21, aVar2), aVar2, 0, 0, 131064);
                        aVar2.s();
                        UiText uiText2 = uiText;
                        if (uiText2 == null) {
                            aVar2.N(-1234355465);
                            aVar2.H();
                            strG = null;
                        } else {
                            aVar2.N(237276746);
                            strG = uiText2.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b));
                            aVar2.H();
                        }
                        if (strG == null) {
                            strG = "";
                        }
                        ycg.b bVar2 = new ycg.b(strG, "error_text");
                        d160 d160VarA2 = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, aVar2, 6);
                        int iHashCode3 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO3 = aVar2.o();
                        d dVarC3 = c.c(aVar2, aVar3);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA2, bVar);
                        hlh0.a(aVar2, ne00VarO3, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar2, dVarC3, cVar);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        String strA = cb40.a(R.string.common_functions__mobile_number, new Object[0], aVar2);
                        boolean z2 = uiText2 != null;
                        p95 p95Var = new p95();
                        final String str2 = str;
                        jr7.a(layoutWeightElement, ijf0Var, pp8.b(-1551965375, new Function2() { // from class: rz40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar5 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, aVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar5), aVar5, 0, 0, 131066);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), z2, bVar2, false, strA, null, null, null, p95Var, 0, null, null, function1, aVar2, 384, 0, 15264);
                        j050.m(0, aVar2, function0, z);
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, uiText, function1, function0, i) { // from class: lz40
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ UiText d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j050.i(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final op8 op8Var, final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(655461121);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(op8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            g(6, pp8.b(1453780169, new Function2() { // from class: oz40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarH = h.h(d.a.b, 16.0f, 0.0f, 2);
                        d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.k, aVar2, 54);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarH);
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
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, d160VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        op8Var.invoke(aVar2, 0);
                        d dVarH2 = h.h(new LayoutWeightElement(1.0f, true), 0.0f, 26.0f, 1);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarH2);
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
                        hlh0.a(aVar2, i78VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        lkf0.d(str, null, c68.a(R.color.text_type1_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R_21, aVar2), aVar2, 0, 0, 131066);
                        lkf0.d(str2, null, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 0, 24960, 110586);
                        aVar2.s();
                        j050.k(0, aVar2);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pz40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    j050.j(op8Var, str, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(1427812839);
        if (bVarI.q(i & 1, i != 0)) {
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            lkf0.d(cb40.a(R.string.register_login_br__verified, new Object[0], bVarI), null, c68.a(R.color.brand_quaternary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            h6n.b(erz.a(R.drawable.ic_check_circle_green_24dp, 0, bVarI), null, j.r(aVar2, 16.0f), c68.a(R.color.brand_quaternary, bVarI), bVarI, 432, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new uz40();
        }
    }

    public static final void l(final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(878286885);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = a6a0.b(new Function0() { // from class: a050
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return str2 + " " + ((Object) new p95().a(new nk0(str)).a);
                    }
                });
                bVarI.r(objY);
            }
            j(yl9.b, cb40.a(R.string.common_functions__mobile_phone_number, new Object[0], bVarI), (String) ((twd0) objY).getValue(), bVarI, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i) { // from class: iz40
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j050.l(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(final int i, androidx.compose.runtime.a aVar, final Function0 function0, final boolean z) {
        b bVarI = aVar.i(-463597758);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            xya.a(null, z, cb40.a(R.string.common_functions__verify, new Object[0], bVarI), null, sya.a, null, null, null, null, function0, bVarI, ((i2 << 3) & 112) | ((i2 << 24) & 1879048192), 489);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0, z) { // from class: qz40
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = z;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j050.m(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
