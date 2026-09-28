package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.entity.SocialMineType;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class sj00 {

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalCodeListScreenKt$PersonalCodeListContent$1$1", f = "PersonalCodeListScreen.kt", l = {382}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ h0s<kl00> c;
        public final /* synthetic */ ytw<kl00> d;
        public final /* synthetic */ ytw<kl00> e;
        public final /* synthetic */ zzr f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0s<kl00> h0sVar, ytw<kl00> ytwVar, ytw<kl00> ytwVar2, zzr zzrVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = h0sVar;
            this.d = ytwVar;
            this.e = ytwVar2;
            this.f = zzrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<kl00> ytwVar = this.e;
            ytw<kl00> ytwVar2 = this.d;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    h0s<kl00> h0sVar = this.c;
                    if (h0sVar.d().a instanceof hxs.c) {
                        if (h0sVar.c() <= 0) {
                            h0sVar = null;
                        }
                        ytwVar2.setValue(h0sVar != null ? h0sVar.e(0) : null);
                        if (ytwVar2.getValue() != null) {
                            kl00 value = ytwVar.getValue();
                            String str = value != null ? value.a : null;
                            kl00 value2 = ytwVar2.getValue();
                            if (!Intrinsics.g(str, value2 != null ? value2.a : null)) {
                                zzr zzrVar = this.f;
                                zi50.a aVar = zi50.b;
                                this.b = null;
                                this.a = 1;
                                uv60 uv60Var = zzr.x;
                                if (zzrVar.f(0, 0, this) == y5bVar) {
                                    return y5bVar;
                                }
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                Unit unit = Unit.a;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable unused) {
                zi50.a aVar3 = zi50.b;
            }
            ytwVar.setValue(ytwVar2.getValue());
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalCodeListScreenKt$PersonalCodeListScreen$1$1$1", f = "PersonalCodeListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<z7a0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Function2<String, z7a0.d, Unit> b;
        public final /* synthetic */ Function1<z7a0.a, Unit> c;
        public final /* synthetic */ Function1<z7a0.b, Unit> d;
        public final /* synthetic */ Function1<z7a0.c, Unit> e;
        public final /* synthetic */ twd0<SocialRouter$PersonalSocial.Data> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super String, ? super z7a0.d, Unit> function2, Function1<? super z7a0.a, Unit> function1, Function1<? super z7a0.b, Unit> function3, Function1<? super z7a0.c, Unit> function4, twd0<SocialRouter$PersonalSocial.Data> twd0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = function2;
            this.c = function1;
            this.d = function3;
            this.e = function4;
            this.f = twd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, this.c, this.d, this.e, this.f, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z7a0 z7a0Var, v1b<? super Unit> v1bVar) {
            return ((b) create(z7a0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            z7a0 z7a0Var = (z7a0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z7a0Var instanceof z7a0.d) {
                this.b.invoke(this.f.getValue().getUsername(), (z7a0.d) z7a0Var);
            } else if (z7a0Var instanceof z7a0.a) {
                this.c.invoke((z7a0.a) z7a0Var);
            } else if (z7a0Var instanceof z7a0.b) {
                this.d.invoke((z7a0.b) z7a0Var);
            } else {
                if (!(z7a0Var instanceof z7a0.c)) {
                    uhc.a();
                    return null;
                }
                this.e.invoke((z7a0.c) z7a0Var);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalCodeListScreenKt$PersonalCodeListScreen$2$1", f = "PersonalCodeListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ h0s<kl00> a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h0s<kl00> h0sVar, ytw<Boolean> ytwVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = h0sVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            h0s<kl00> h0sVar = this.a;
            if (h0sVar.d().f || h0sVar.d().g || h0sVar.c() != 0) {
                this.b.setValue(Boolean.TRUE);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalCodeListScreenKt$PullRefreshCodeListContent$1$1", f = "PersonalCodeListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ h0s<kl00> a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h0s<kl00> h0sVar, ytw<Boolean> ytwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.a = h0sVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a.d().f) {
                this.b.setValue(Boolean.FALSE);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[rx4.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                rx4 rx4Var = rx4.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                rx4 rx4Var2 = rx4.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final void a(final sx4 sx4Var, final String str, final String str2, final Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1595155965);
        int i2 = (bVarI.A(sx4Var) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            rg6.a(g3w.h(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 356.0f), "personal_booking_code_empty_card_" + sx4Var.a.a()), zk40.a, gg6.b(j58.l, 0L, bVarI, 24582, 14), gg6.c(62, 0.0f), m35.a(1.0f, c68.a(R.color.background_type1_tertiary, bVarI)), pp8.b(-1914534831, new gaj() { // from class: lj00
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarH = h.h(j.g(aVar3, 1.0f), 0.0f, 28.0f, 1);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
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
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarH2 = h.h(aVar3, 24.0f, 0.0f, 2);
                        px4 px4Var = sx4Var.a;
                        lkf0.d(str2, g3w.h(dVarH2, "personal_booking_code_empty_card_title_" + px4Var.a()), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, aVar2), aVar2, 0, 0, 130040);
                        d dVarH3 = g3w.h(androidx.compose.foundation.a.b(j.i(wtc.b(aVar3, 20.0f, aVar2, aVar3, 0.74f), 190.0f), c68.a(R.color.background_type1_primary, aVar2), zk40.a), "personal_booking_code_empty_card_image_frame_" + px4Var.a());
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarH3);
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
                        hlh0.a(aVar2, aivVarC, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        mw90.a(str, null, g3w.h(j.e(aVar3, 1.0f), "personal_booking_code_empty_card_image_" + px4Var.a()), null, null, d0b.a.b, null, aVar2, 1572912, 1976);
                        aVar2.s();
                        Function0 function1 = function0;
                        if (function1 != null) {
                            aVar2.N(-2101673593);
                            String strC = px4Var.c(aVar2);
                            d dVarH4 = h.h(wtc.b(aVar3, 20.0f, aVar2, aVar3, 1.0f), 40.0f, 0.0f, 2);
                            aVar2.N(1317391189);
                            alb0 alb0Var = px4Var.c(aVar2).length() > 25 ? g9z.b : g9z.d;
                            aVar2.H();
                            vuc0.b(dVarH4, false, null, alb0Var, null, strC, null, null, null, inm.a("personal_booking_code_empty_card_button_", px4Var.a()), function1, aVar2, 6, 0, 470);
                            aVar2.H();
                        } else {
                            aVar2.N(-2101120057);
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196656, 0);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cvv(sx4Var, str, str2, function0, i);
        }
    }

    public static final void b(final tx4 tx4Var, zpz zpzVar, final CountryCodeName countryCodeName, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1777624375);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(tx4Var) : bVarI.A(tx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(zpzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.d(countryCodeName == null ? -1 : countryCodeName.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = Boolean.valueOf(r0b.d(context));
                bVarI.r(objY);
            }
            final boolean zBooleanValue = ((Boolean) objY).booleanValue();
            androidx.compose.ui.d dVarH = g3w.h(j.g(androidx.compose.ui.d.a.b, 1.0f), "personal_booking_code_empty_carousel");
            bVar = bVarI;
            dpz.a(12.0f, 0, ((i3 >> 3) & 14) | 197040, 16344, null, pp8.b(-684854040, new iaj(zBooleanValue, countryCodeName, function0, function1) { // from class: ij00
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                {
                    this.c = function0;
                    this.d = function1;
                }

                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    a aVar2 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= aVar2.d(iIntValue) ? 32 : 16;
                    }
                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        sx4 sx4Var = this.a.a.get(iIntValue);
                        String strB = sx4Var.a.b(this.b, aVar2);
                        String strD = sx4Var.a.d(aVar2);
                        int iOrdinal = sx4Var.b.ordinal();
                        Function0 function2 = null;
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                function2 = this.c;
                            } else {
                                if (iOrdinal != 2) {
                                    uhc.a();
                                    return null;
                                }
                                function2 = this.d;
                            }
                        }
                        sj00.a(sx4Var, strB, strD, function2, aVar2, 8);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, h.a(2, 40.0f, 0.0f), null, zpzVar, null, null, bVar, dVarH, null, false);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new quv(tx4Var, zpzVar, countryCodeName, function0, function1, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final void c(final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Function0<Unit> function2;
        Function0<Unit> function3;
        int i3;
        int i4;
        boolean z3;
        androidx.compose.runtime.b bVarI = aVar.i(192939696);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function2 = function0;
            i2 |= bVarI.A(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= bVarI.A(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            androidx.compose.ui.d dVarH = g3w.h(h.g(androidx.compose.foundation.a.b(j.g(androidx.compose.ui.d.a.b, 1.0f), c68.a(R.color.background_type1_quaternary, bVarI), zk40.a), 16.0f, 12.0f), "personal_booking_code_footer");
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            if (z) {
                bVarI.N(-1426743074);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                i3 = i2;
                i4 = 0;
                xya.a(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, cb40.a(R.string.page_creator_credits__page_title, new Object[0], bVarI), "personal_booking_code_creator_credits_button", alb0.a(sya.b, null, null, 0L, 8.0f, 15), sya.a(c68.a(R.color.background_type1_primary, bVarI), c68.a(R.color.text_type1_primary, bVarI), 0L, 0L, bVarI, 24576, 12), j060.c(2.0f), qi9.b, null, function3, bVarI, ((i3 << 18) & 1879048192) | 12585984, 258);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                i3 = i2;
                i4 = 0;
                bVarI.N(-1425651378);
                bVarI.X(false);
            }
            if (z2) {
                bVarI.N(-1425601964);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                z3 = true;
                androidx.compose.runtime.b bVar = bVarI;
                xya.a(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, cb40.a(R.string.component_wap_share_bet__share_btn, new Object[i4], bVarI), "personal_booking_code_share_my_bet_button", sya.b, null, j060.c(2.0f), null, null, function2, bVar, 3072 | ((i3 << 21) & 1879048192), 418);
                bVarI = bVar;
                bVarI.X(i4);
            } else {
                z3 = true;
                bVarI.N(-1425177202);
                bVarI.X(i4);
            }
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hj00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sj00.c(z, z2, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1470883541);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14), c68.a(R.color.bg_secondary_d_lightest, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ty0.a(bVarI, j.i(aVar2, 80.0f));
            androidx.compose.ui.d dVarT = j.t(aVar2, 180.0f, 105.0f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new ogm(2);
                bVarI.r(objY);
            }
            mw90.a(cb40.a(R.string.image_url__personal_page_no_book_code, new Object[0], bVarI), "no_booking_code", g3w.h(androidx.compose.foundation.d.d(dVarT, false, null, null, (Function0) objY, 14), "personal_no_booking_code_image"), null, null, null, null, bVarI, 48, 2040);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            lkf0.d(cb40.a(R.string.personal_page__no_booking_code_title, new Object[0], bVarI), g3w.h(aVar2, "personal_no_booking_code_title"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new pv8(i);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-600974167);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
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
            androidx.compose.ui.d dVarC2 = op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarC2);
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
            hlh0.a(bVarI, dVarC3, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            ty0.a(bVarI, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            h6n.b(erz.a(R.drawable.ic_exclamation, 0, bVarI), "code_error", dw.a(j.r(aVar2, 52.0f), 0.5f), c68.a(R.color.text_type1_secondary, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_code_hub__temporary_unavailable, new Object[0], bVarI), dw.a(h.h(aVar2, 24.0f, 0.0f, 2), 0.5f), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            if (1.5f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            ty0.a(bVarI, new LayoutWeightElement(1.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.5f, true));
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new mj00();
        }
    }

    public static final void g(final h0s<kl00> h0sVar, final boolean z, final boolean z2, final boolean z3, final SimpleDateFormat simpleDateFormat, final SimpleDateFormat simpleDateFormat2, final Function1<? super jl00, Unit> function1, final Function1<? super kl00, Unit> function2, final Function1<? super kl00, Unit> function3, final Function1<? super kl00, Unit> function4, final Function1<? super kl00, Unit> function5, final Function0<Unit> function0, final Function0<Unit> function6, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.b bVar;
        int i5;
        kw0.i iVar;
        androidx.compose.runtime.b bVarI = aVar.i(90420757);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(h0sVar) : bVarI.A(h0sVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(simpleDateFormat) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(simpleDateFormat2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.A(function2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.A(function3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.A(function4) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.A(function5) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function6) ? 256 : 128;
        }
        int i7 = i4;
        if (bVarI.q(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                h0s<kl00> h0sVar2 = h0sVar.c() > 0 ? h0sVar : null;
                objY2 = m.b(h0sVar2 != null ? h0sVar2.e(0) : null);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            hxs hxsVar = h0sVar.d().a;
            int i8 = i6 & 14;
            boolean zM = (i8 == 4 || ((i6 & 8) != 0 && bVarI.A(h0sVar))) | bVarI.M(zzrVarA);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                i5 = i8;
                objY3 = new a(h0sVar, ytwVar2, ytwVar, zzrVarA, null);
                bVarI.r(objY3);
            } else {
                i5 = i8;
            }
            xvf.e(bVarI, hxsVar, (Function2) objY3);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.bg_secondary_d_lightest, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            androidx.compose.ui.d dVarA = zqu.a(1.0f, j.g(aVar2, 1.0f), true);
            kw0.i iVar2 = new kw0.i(12.0f, false, new jw0(ht.a.j));
            boolean zA = (i5 == 4 || ((i6 & 8) != 0 && bVarI.A(h0sVar))) | ((i6 & 112) == 32) | bVarI.A(simpleDateFormat) | bVarI.A(simpleDateFormat2) | ((i6 & 3670016) == 1048576) | ((i6 & 29360128) == 8388608) | ((i6 & 234881024) == 67108864) | ((i6 & 1879048192) == 536870912) | ((i7 & 14) == 4);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                iVar = iVar2;
                Function1 function7 = new Function1() { // from class: fj00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        szr.h(szrVar, null, qi9.a, 3);
                        final h0s h0sVar3 = h0sVar;
                        int iC = h0sVar3.c();
                        androidx.paging.compose.a aVar4 = new androidx.paging.compose.a(h0sVar3, new jj00(0));
                        jjc jjcVar = new jjc(2);
                        final boolean z4 = z;
                        final SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
                        final SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
                        final Function1 function8 = function1;
                        final Function1 function9 = function2;
                        final Function1 function10 = function3;
                        final Function1 function11 = function4;
                        final Function1 function12 = function5;
                        szrVar.d(iC, aVar4, jjcVar, new op8(-750109951, new iaj() { // from class: kj00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gwr) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar5.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    kl00 kl00Var = (kl00) h0sVar3.b(iIntValue);
                                    if (kl00Var == null) {
                                        aVar5.N(189353406);
                                        aVar5.H();
                                    } else {
                                        aVar5.N(189353407);
                                        ui00.d(kl00Var, h.a(2, 8.0f, 0.0f), true, z4, simpleDateFormat3, simpleDateFormat4, function8, function9, function10, function11, function12, aVar5, 432);
                                        aVar5.H();
                                    }
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                        szr.h(szrVar, null, new op8(-1680536365, new k9r(h0sVar3, 1), true), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(function7);
                objY4 = function7;
            } else {
                iVar = iVar2;
            }
            aur.a(dVarA, zzrVarA, null, false, iVar, null, null, false, null, (Function1) objY4, bVarI, 24576, 492);
            bVar = bVarI;
            if (z) {
                bVar.N(1628423645);
                int i9 = i7 << 3;
                c(z2, z3, function0, function6, bVar, ((i6 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | (i9 & 896) | (i9 & 7168));
                bVar.X(false);
            } else {
                bVar.N(1628675427);
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gj00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    sj00.g(h0sVar, z, z2, z3, simpleDateFormat, simpleDateFormat2, function1, function2, function3, function4, function5, function0, function6, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(el00 el00Var, final boolean z, final Function1<? super jl00, Unit> function1, final Function2<? super String, ? super z7a0.d, Unit> function2, final Function1<? super z7a0.b, Unit> function3, final Function1<? super z7a0.a, Unit> function4, final Function1<? super z7a0.c, Unit> function5, final Function0<Unit> function0, final Function1<? super String, Unit> function6, final Function0<Unit> function7, final Function0<Unit> function8, final Function0<Unit> function9, final Function0<Unit> function10, final Function0<Unit> function11, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final Function1<? super z7a0.b, Unit> function12;
        int i4;
        androidx.compose.runtime.b bVar;
        Object obj;
        final ytw ytwVar;
        int i5;
        int i6;
        final el00 el00Var2 = el00Var;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function0.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        androidx.compose.runtime.b bVarA = v2g.a(function10, function11, aVar, -1047033421);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarA.M(el00Var2) : bVarA.A(el00Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarA.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarA.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarA.A(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function12 = function3;
            i3 |= bVarA.A(function12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function12 = function3;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarA.A(function4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarA.A(function5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarA.A(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarA.A(function6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarA.A(function7) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarA.A(function8) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarA.A(function9) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarA.A(function10) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarA.A(function11) ? 2048 : 1024;
        }
        int i7 = i4;
        if (bVarA.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            ytw ytwVarC = wyh.c(el00Var2.y, bVarA, 0, 7);
            ytw ytwVarC2 = wyh.c(el00Var2.F, bVarA, 0, 7);
            h0s h0sVarA = k0s.a(el00Var2.D, bVarA);
            Object objY = bVarA.y();
            Object obj2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == obj2) {
                objY = xvf.i(kotlin.coroutines.e.a, bVarA);
                bVarA.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            Object objY2 = bVarA.y();
            if (objY2 == obj2) {
                objY2 = m.b(Boolean.FALSE);
                bVarA.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            int i8 = i3 & 14;
            int i9 = i3;
            boolean zM = ((i3 & 7168) == 2048) | (i8 == 4 || ((i3 & 8) != 0 && bVarA.A(el00Var2))) | bVarA.M(ytwVarC) | ((i9 & 458752) == 131072) | ((i9 & 57344) == 16384) | ((i9 & 3670016) == 1048576) | bVarA.A(v5bVar);
            Object objY3 = bVarA.y();
            if (zM || objY3 == obj2) {
                ytwVar = ytwVarC;
                el00Var2 = el00Var;
                i5 = 8388608;
                obj = new Function0() { // from class: wi00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kzh.d(new g1i(el00Var2.z.b, new sj00.b(function2, function4, function12, function5, ytwVar, null)), v5bVar);
                        return Unit.a;
                    }
                };
                bVarA.r(obj);
            } else {
                i5 = 8388608;
                obj = objY3;
                ytwVar = ytwVarC;
                el00Var2 = el00Var;
            }
            xfa.b((Function0) obj, bVarA, 0);
            Boolean boolValueOf = Boolean.valueOf(h0sVarA.d().f);
            Boolean boolValueOf2 = Boolean.valueOf(h0sVarA.d().g);
            Integer numValueOf = Integer.valueOf(h0sVarA.c());
            boolean zA = bVarA.A(h0sVarA);
            Object objY4 = bVarA.y();
            if (zA || objY4 == obj2) {
                objY4 = new c(h0sVarA, r19, null);
                bVarA.r(objY4);
            }
            xvf.f(boolValueOf, boolValueOf2, numValueOf, (Function2) objY4, bVarA);
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                androidx.compose.runtime.b bVar2 = bVarA;
                bVar2.N(-2117851270);
                SocialRouter$PersonalSocial.Data data = (SocialRouter$PersonalSocial.Data) ytwVar.getValue();
                qm00 qm00Var = (qm00) ytwVarC2.getValue();
                boolean z2 = ((SocialRouter$PersonalSocial.Data) ytwVar.getValue()).getMineType() == SocialMineType.MINE;
                boolean zIsCreator = ((SocialRouter$PersonalSocial.Data) ytwVar.getValue()).isCreator();
                boolean z3 = (i8 == 4 || ((i9 & 8) != 0 && bVar2.A(el00Var2))) | ((i9 & 29360128) == i5);
                Object objY5 = bVar2.y();
                if (z3 || objY5 == obj2) {
                    i6 = 0;
                    objY5 = new cj00(i6, el00Var2, function0);
                    bVar2.r(objY5);
                } else {
                    i6 = 0;
                }
                Function1 function13 = (Function1) objY5;
                int i10 = (i8 == 4 || ((i9 & 8) != 0 && bVar2.A(el00Var2))) ? 1 : i6;
                Object objY6 = bVar2.y();
                if (i10 != 0 || objY6 == obj2) {
                    objY6 = new bhm(el00Var2);
                    bVar2.r(objY6);
                }
                Function2 function14 = (Function2) objY6;
                int i11 = (i8 == 4 || ((i9 & 8) != 0 && bVar2.A(el00Var2))) ? 1 : i6;
                Object objY7 = bVar2.y();
                if (i11 != 0 || objY7 == obj2) {
                    objY7 = new yt3(el00Var2);
                    bVar2.r(objY7);
                }
                Function2 function15 = (Function2) objY7;
                int i12 = (i8 == 4 || ((i9 & 8) != 0 && bVar2.A(el00Var2))) ? 1 : i6;
                Object objY8 = bVar2.y();
                if (i12 != 0 || objY8 == obj2) {
                    objY8 = new Function2() { // from class: nj00
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            kl00 kl00Var = (kl00) obj3;
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            kl00Var.getClass();
                            el00 el00Var3 = el00Var2;
                            el00Var3.w.a(ibd0.a, k00.d);
                            kzh.d(new wzh(new xzh(el00Var3.f.a(kl00Var.a, el00Var3.v.getCountryCode(), ((SocialRouter$PersonalSocial.Data) el00Var3.y.a.getValue()).getRegion(), new qk00(null, el00Var3, kl00Var), new rk00(null, el00Var3, kl00Var)), new sk00(null, el00Var3, kl00Var, zBooleanValue)), new tk00(null, el00Var3, kl00Var, zBooleanValue)), o8i0.d(el00Var3));
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY8);
                }
                Function2 function16 = (Function2) objY8;
                int i13 = (i8 == 4 || ((i9 & 8) != 0 && bVar2.A(el00Var2))) ? 1 : i6;
                Object objY9 = bVar2.y();
                if (i13 != 0 || objY9 == obj2) {
                    objY9 = new Function1() { // from class: oj00
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            kl00 kl00Var = (kl00) obj3;
                            kl00Var.getClass();
                            el00 el00Var3 = el00Var2;
                            q8a0 q8a0Var = el00Var3.i;
                            String str = kl00Var.a;
                            q8a0Var.getClass();
                            str.getClass();
                            kzh.d(new g1i(bm50.b(((vga0) q8a0Var.a).t(str), vch0.b), new uk00(null, el00Var3, kl00Var)), o8i0.d(el00Var3));
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY9);
                }
                int i14 = i7 << 12;
                i(data, h0sVarA, qm00Var, z2, zIsCreator, z, function13, function1, function14, function15, function16, (Function1) objY9, function6, function7, function8, function9, function10, function11, bVar2, SocialRouter$PersonalSocial.Data.$stable | 64 | ((i9 << 12) & 458752) | ((i9 << 15) & 29360128), ((i9 >> 18) & 8064) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (29360128 & i14));
                bVar2.X(i6);
                bVar = bVar2;
            } else {
                bVarA.N(-2118231330);
                androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarA.T);
                ne00 ne00VarS = bVarA.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarA, dVarE);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarA.D();
                if (bVarA.S) {
                    bVarA.F(aVar3);
                } else {
                    bVarA.p();
                }
                hlh0.a(bVarA, aivVarC, yka.a.f);
                hlh0.a(bVarA, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarA, iHashCode, c1350a);
                }
                hlh0.a(bVarA, dVarC, yka.a.d);
                q330.a(dw.a(aVar2, 0.5f), c68.a(R.color.text_type1_secondary, bVarA), 0.0f, 0L, 0, 0.0f, bVarA, 6, 60);
                androidx.compose.runtime.b bVar3 = bVarA;
                bVar3.X(true);
                bVar3.X(false);
                bVar = bVar3;
            }
        } else {
            androidx.compose.runtime.b bVar4 = bVarA;
            bVar4.G();
            bVar = bVar4;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pj00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    sj00.h(el00Var2, z, function1, function2, function3, function4, function5, function0, function6, function7, function8, function9, function10, function11, (a) obj3, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final SocialRouter$PersonalSocial.Data data, final h0s<kl00> h0sVar, qm00 qm00Var, final boolean z, final boolean z2, final boolean z3, Function1<? super Boolean, Unit> function1, final Function1<? super jl00, Unit> function2, Function2<? super kl00, ? super Boolean, Unit> function3, Function2<? super kl00, ? super Boolean, Unit> function4, Function2<? super kl00, ? super Boolean, Unit> function5, final Function1<? super kl00, Unit> function6, final Function1<? super String, Unit> function7, final Function0<Unit> function0, final Function0<Unit> function8, final Function0<Unit> function9, final Function0<Unit> function10, final Function0<Unit> function11, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        final qm00 qm00Var2;
        final Function2<? super kl00, ? super Boolean, Unit> function12;
        final Function1<? super Boolean, Unit> function13;
        SimpleDateFormat simpleDateFormat;
        int i5;
        boolean z5;
        Function2<? super kl00, ? super Boolean, Unit> function14 = function3;
        final Function2<? super kl00, ? super Boolean, Unit> function15 = function4;
        androidx.compose.runtime.b bVarI = aVar.i(769528905);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(data) : bVarI.A(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? bVarI.M(h0sVar) : bVarI.A(h0sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bVarI.M(qm00Var) : bVarI.A(qm00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i3 |= bVarI.b(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarI.b(z3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.A(function2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.A(function14) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.A(function15) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = (bVarI.A(function5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function6) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.A(function8) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.A(function9) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarI.A(function10) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarI.A(function11) ? 8388608 : 4194304;
        }
        if (bVarI.q(i6 & 1, ((i6 & 306783379) == 306783378 && (4793491 & i4) == 4793490) ? false : true)) {
            d930 d930VarB = zcg.b((i4 >> 18) & 112, bVarI, function11, h0sVar.d().a instanceof hxs.b);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new SimpleDateFormat("dd/MM EEE HH:mm", Locale.ENGLISH);
                bVarI.r(objY2);
            }
            SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
                bVarI.r(objY3);
            }
            SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) objY3;
            Boolean boolValueOf = Boolean.valueOf(h0sVar.d().f);
            boolean z6 = (i6 & 112) == 32 || ((i6 & 64) != 0 && bVarI.A(h0sVar));
            Object objY4 = bVarI.y();
            if (z6 || objY4 == c0042a) {
                objY4 = new d(h0sVar, ytwVar, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY4);
            int i7 = i6 & 3670016;
            boolean z7 = i7 == 1048576;
            Object objY5 = bVarI.y();
            if (z7 || objY5 == c0042a) {
                objY5 = new hu3(function1);
                bVarI.r(objY5);
            }
            xfa.c(0, bVarI, (Function2) objY5);
            androidx.compose.ui.d dVarA = a930.a(j.e(androidx.compose.ui.d.a.b, 1.0f), d930VarB);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = new pic(1);
                bVarI.r(objY6);
            }
            androidx.compose.ui.d dVarB = xa80.b(dVarA, false, (Function1) objY6);
            aiv aivVarC = g75.c(ht.a.b, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (h0sVar.c() == 0) {
                bVarI.N(602826322);
                if (((Boolean) ytwVar.getValue()).booleanValue() || h0sVar.d().g) {
                    z5 = false;
                    bVarI.N(602867831);
                    ytwVar.setValue(Boolean.TRUE);
                    f(0, bVarI);
                    bVarI.X(false);
                } else if (z) {
                    bVarI.N(602988514);
                    e(data.getCurrentCountryCode(), z4, z3, function0, function8, function9, function10, bVarI, ((i6 >> 9) & 1008) | (i4 & 7168) | (57344 & i4) | (i4 & 458752) | (i4 & 3670016));
                    bVarI = bVarI;
                    z5 = false;
                    bVarI.X(false);
                } else {
                    z5 = false;
                    bVarI.N(603442974);
                    d(0, bVarI);
                    bVarI.X(false);
                }
                bVarI.X(z5);
                simpleDateFormat = simpleDateFormat3;
            } else {
                bVarI.N(603535354);
                boolean z8 = (i6 & 234881024) == 67108864;
                Object objY7 = bVarI.y();
                if (z8 || objY7 == c0042a) {
                    objY7 = new u7r(function14, 1);
                    bVarI.r(objY7);
                }
                Function1 function16 = (Function1) objY7;
                boolean z9 = (i6 & 1879048192) == 536870912;
                Object objY8 = bVarI.y();
                if (z9 || objY8 == c0042a) {
                    objY8 = new yi00(function15, 0);
                    bVarI.r(objY8);
                }
                Function1 function17 = (Function1) objY8;
                boolean z10 = (i4 & 14) == 4;
                Object objY9 = bVarI.y();
                if (z10 || objY9 == c0042a) {
                    objY9 = new zi00(function5, 0);
                    bVarI.r(objY9);
                }
                Function1 function18 = (Function1) objY9;
                boolean z11 = (i4 & 112) == 32;
                Object objY10 = bVarI.y();
                if (z11 || objY10 == c0042a) {
                    objY10 = new ms3(function6, 1);
                    bVarI.r(objY10);
                }
                int i8 = i6 >> 3;
                int i9 = i6 >> 6;
                g(h0sVar, z, z2, z3, simpleDateFormat2, simpleDateFormat3, function2, function16, function17, function18, (Function1) objY10, function0, function10, bVarI, (i8 & 14) | 8 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i8 & 3670016), ((i4 >> 6) & 112) | ((i4 >> 12) & 896));
                simpleDateFormat = simpleDateFormat3;
                bVarI.X(false);
            }
            w830.b(h0sVar.d().a instanceof hxs.b, d930VarB, null, c68.a(R.color.background_type1_primary, bVarI), c68.a(R.color.text_type1_primary, bVarI), bVarI, 64, 36);
            bVarI.X(true);
            qm00Var2 = qm00Var;
            if (Intrinsics.g(qm00Var2, qm00.d.a)) {
                bVarI.N(-1495961845);
                String strA = cb40.a(R.string.personal_page__code_not_existed_title, new Object[0], bVarI);
                String strA2 = cb40.a(R.string.personal_page__code_not_existed_text, new Object[0], bVarI);
                boolean z12 = i7 == 1048576;
                Object objY11 = bVarI.y();
                if (z12 || objY11 == c0042a) {
                    function13 = function1;
                    objY11 = new x7r(1, function13);
                    bVarI.r(objY11);
                } else {
                    function13 = function1;
                }
                androidx.compose.runtime.b bVar = bVarI;
                nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY11, null, bVar, 0, 0, 12281);
                bVarI = bVar;
                bVarI.X(false);
            } else {
                function13 = function1;
                if (qm00Var2 instanceof qm00.b) {
                    bVarI.N(-1495546104);
                    String strA3 = cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], bVarI);
                    String strA4 = cb40.a(R.string.common_feedback__please_try_again_later, new Object[0], bVarI);
                    boolean z13 = r28 == 1048576;
                    Object objY12 = bVarI.y();
                    if (z13 || objY12 == c0042a) {
                        objY12 = new aj00(function13, 0);
                        bVarI.r(objY12);
                    }
                    androidx.compose.runtime.b bVar2 = bVarI;
                    nzj.b(null, strA3, strA4, null, null, null, null, null, null, null, null, null, (Function0) objY12, null, bVar2, 0, 0, 12281);
                    bVarI = bVar2;
                    bVarI.X(false);
                } else if (qm00Var2 instanceof qm00.a) {
                    bVarI.N(-1495113809);
                    kl00 kl00Var = ((qm00.a) qm00Var2).a;
                    CountryCodeName countryCode = data.getCountryCode();
                    boolean z14 = r28 == 1048576;
                    Object objY13 = bVarI.y();
                    if (z14 || objY13 == c0042a) {
                        objY13 = new Function0() { // from class: bj00
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function13.invoke(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY13);
                    }
                    Function0 function19 = (Function0) objY13;
                    boolean z15 = (i6 & 234881024) == 67108864;
                    Object objY14 = bVarI.y();
                    if (z15 || objY14 == c0042a) {
                        function14 = function3;
                        i5 = 1;
                        objY14 = new eeh(function14, i5);
                        bVarI.r(objY14);
                    } else {
                        function14 = function3;
                        i5 = 1;
                    }
                    Function1 function20 = (Function1) objY14;
                    int i10 = (i6 & 1879048192) == 536870912 ? i5 : 0;
                    Object objY15 = bVarI.y();
                    if (i10 != 0 || objY15 == c0042a) {
                        function15 = function4;
                        objY15 = new Function1() { // from class: qj00
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                kl00 kl00Var2 = (kl00) obj;
                                kl00Var2.getClass();
                                function15.invoke(kl00Var2, Boolean.TRUE);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY15);
                    } else {
                        function15 = function4;
                    }
                    Function1 function21 = (Function1) objY15;
                    if ((i4 & 14) != 4) {
                        i5 = 0;
                    }
                    Object objY16 = bVarI.y();
                    if (i5 != 0 || objY16 == c0042a) {
                        function12 = function5;
                        objY16 = new Function1() { // from class: rj00
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                kl00 kl00Var2 = (kl00) obj;
                                kl00Var2.getClass();
                                function12.invoke(kl00Var2, Boolean.TRUE);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY16);
                    } else {
                        function12 = function5;
                    }
                    androidx.compose.runtime.b bVar3 = bVarI;
                    ik00.b(kl00Var, countryCode, simpleDateFormat2, simpleDateFormat, function19, function7, function2, function20, function21, (Function1) objY16, bVar3, ((i4 << 9) & 458752) | ((i6 >> 3) & 3670016));
                    bVarI = bVar3;
                    bVarI.X(false);
                } else {
                    function14 = function3;
                    function15 = function4;
                    function12 = function5;
                    bVarI.N(-1494440489);
                    bVarI.X(false);
                }
            }
            function14 = function3;
            function15 = function4;
            function12 = function5;
        } else {
            qm00Var2 = qm00Var;
            function12 = function5;
            function13 = function1;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function2<? super kl00, ? super Boolean, Unit> function22 = function14;
            final Function2<? super kl00, ? super Boolean, Unit> function23 = function15;
            eVarZ.d = new Function2() { // from class: xi00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    sj00.i(data, h0sVar, qm00Var2, z, z2, z3, function13, function2, function22, function23, function12, function6, function7, function0, function8, function9, function10, function11, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final CountryCodeName countryCodeName, final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Function0<Unit> function4;
        Function0<Unit> function5;
        androidx.compose.runtime.b bVarI = aVar.i(1072251971);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(countryCodeName == null ? -1 : countryCodeName.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            function4 = function2;
            i2 |= bVarI.A(function4) ? 131072 : 65536;
        } else {
            function4 = function2;
        }
        if ((1572864 & i) == 0) {
            function5 = function3;
            i2 |= bVarI.A(function5) ? 1048576 : 524288;
        } else {
            function5 = function3;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new tx4(null);
                bVarI.r(objY);
            }
            tx4 tx4Var = (tx4) objY;
            boolean zA = bVarI.A(tx4Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new dj00(tx4Var, 0);
                bVarI.r(objY2);
            }
            ved vedVarB = eqz.b(0, (Function0) objY2, bVarI, 0, 3);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.bg_secondary_d_lightest, bVarI), zk40.a);
            n54.a aVar3 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 0);
            int i3 = i2;
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarH = g3w.h(op70.c(zqu.a(1.0f, j.g(aVar2, 1.0f), true), op70.a(bVarI), 14), ACKxwYRsuWyGz.WGuBVXVrFV);
            i78 i78VarA2 = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            ty0.a(bVarI, j.i(aVar2, 36.0f));
            lkf0.d(cb40.a(z ? R.string.personal_page__booking_codes_empty_creator_title : R.string.personal_page__booking_codes_empty_non_creator_title, new Object[0], bVarI), g3w.h(h.h(aVar2, 24.0f, 0.0f, 2), "personal_booking_code_empty_title"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            int i4 = i3 >> 3;
            b(tx4Var, vedVarB, countryCodeName, function1, function4, bVarI, ((i3 << 6) & 896) | 8 | (i4 & 7168) | (57344 & i4));
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            bVarI.X(true);
            if (vedVarB.k() == 0) {
                bVarI.N(1518753199);
                c(z, z2, function0, function5, bVarI, (i4 & 1022) | ((i3 >> 9) & 7168));
                bVarI.X(false);
            } else {
                bVarI.N(1519004981);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ej00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sj00.e(countryCodeName, z, z2, function0, function1, function2, function3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
