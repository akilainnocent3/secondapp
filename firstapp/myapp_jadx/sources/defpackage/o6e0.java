package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.google.protobuf.Reader;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class o6e0 {
    public static final hfs a = ya5.a.i(new Pair[]{new Pair(Float.valueOf(0.0f), new j58(r58.b(439695941))), new Pair(Float.valueOf(1.0f), new j58(r58.d(2348871593L)))}, 14);

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.components.StreakHeroSectionKt$EarnRepairToolButton$1$1", f = "StreakHeroSection.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function1<i04, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super i04, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = function1;
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
            this.a.invoke(new i04.i(q7e0.h.a, kotlin.collections.a.c(k00.d)));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.components.StreakHeroSectionKt$StreakRepairCard$1$1$1$1", f = "StreakHeroSection.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function1<i04, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, boolean z, v1b v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a) {
                this.b.invoke(new i04.i(q7e0.n.a, kotlin.collections.a.c(k00.d)));
            }
            return Unit.a;
        }
    }

    public static final void b(final d dVar, final int i, final int i2, boolean z, final UiText uiText, final Function0 function0, androidx.compose.runtime.a aVar, final int i3) {
        d dVar2;
        int i4;
        final boolean z2 = z;
        androidx.compose.runtime.b bVarI = aVar.i(1147341599);
        if ((i3 & 6) == 0) {
            dVar2 = dVar;
            i4 = (bVarI.M(dVar2) ? 4 : 2) | i3;
        } else {
            dVar2 = dVar;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= bVarI.M(uiText) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= bVarI.A(function0) ? 131072 : 65536;
        }
        int i5 = i4;
        if (bVarI.q(i5 & 1, (i5 & 74899) != 74898)) {
            int i6 = (i5 >> 6) & 112;
            d dVarA = g3w.a(dVar2, z2, new w4e0(), new x4e0(), bVarI, (i5 & 14) | i6, 0);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                z2 = z2;
                bVarI.F(aVar2);
            } else {
                z2 = z2;
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar3 = d.a.b;
            u(z2 ? j.e(aVar3, 1.0f) : androidx.compose.foundation.layout.d.a.f(aVar3), null, pp8.b(170143821, new gaj() { // from class: y4e0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m75 m75Var = (m75) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    m75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar4.M(m75Var) ? 4 : 2;
                    }
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        o6e0.o(m75Var, i2, z2, uiText, function0, aVar4, iIntValue & 14);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
            s(i, ((i5 >> 3) & 14) | i6, bVarI, z2);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z4e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o6e0.b(dVar, i, i2, z2, uiText, function0, (a) obj, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final uxs uxsVar, final Function1<? super i04, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-674364210);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(uxsVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Unit unit = Unit.a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new a(function1, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            d dVarH = g3w.h(j.g(d.a.b, 1.0f), "earn_repair_tool_button");
            i060 i060VarC = j060.c(((zib0) bVarI.O(ajb0.a)).e);
            long j = ((lib0) bVarI.O(oib0.a)).Q;
            alb0 alb0VarA = alb0.a(sya.e, new g7f(28.0f), h.a(2, 12.0f, 0.0f), 0L, 0.0f, 25);
            boolean z2 = i3 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: a6e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        i04.h hVar = new i04.h(true);
                        Function1 function2 = function1;
                        function2.invoke(hVar);
                        function2.invoke(new i04.i(q7e0.g.a, kotlin.collections.a.c(k00.d)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            bVar = bVarI;
            jst.c((Function0) objY2, dVarH, uxsVar, alb0VarA, 0L, 0L, j, 0L, 0L, 0L, i060VarC, null, bVar, ((i2 << 6) & 896) | 48);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b6e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    o6e0.c(uxsVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final float f, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-360548837);
        int i2 = i | (bVarI.c(f) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final float fC1 = ((mmd) bVarI.O(kna.h)).C1(f);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
            d dVarA = ls7.a(dVar.f(dVarG), j060.e(0.0f, 0.0f, 15.0f, 15.0f, 3));
            q04[] q04VarArr = q04.b;
            mw90.b("https://s.sporty.net/cms/loyalty_daily_streak_main_lobby_bg_2a8e1ab160.png", "Hero Section Background", dVarA, pib0.a(R.drawable.bg__loyalty_streak_hero_section, 0, bVarI), null, pib0.a(R.drawable.bg__loyalty_streak_hero_section, 0, bVarI), null, null, d0b.a.a, 0.0f, null, bVarI, 48, 6, 31696);
            d dVarA2 = ls7.a(dVar.f(j.g(aVar2, 1.0f)), j060.e(0.0f, 0.0f, 15.0f, 15.0f, 3));
            boolean zC = bVarI.c(fC1);
            Object objY = bVarI.y();
            if (zC || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: x5e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        hfs hfsVar = o6e0.a;
                        float f2 = fC1;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-f2)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        tcf.V1(lzaVar, hfsVar, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + f2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 0.0f, null, null, 0, 120);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            g75.a(androidx.compose.ui.draw.a.c(dVarA2, (Function1) objY), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: i6e0
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    o6e0.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final int i, final int i2, final String str, final UiText uiText, final boolean z, final UiText uiText2, final UiText uiText3, final boolean z2, final uxs uxsVar, final UiText uiText4, final UiText uiText5, final Float f, final Function1 function1, final float f2, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.b bVarI = aVar.i(-1477682132);
        int i4 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(i2) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.M(uiText) ? 2048 : 1024) | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(uiText2) ? 131072 : 65536) | (bVarI.M(uiText3) ? 1048576 : 524288) | (bVarI.b(z2) ? 8388608 : 4194304) | (bVarI.d(uxsVar.ordinal()) ? 67108864 : 33554432) | (bVarI.M(uiText4) ? 536870912 : 268435456);
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (((((bVarI.M(uiText5) ? (char) 4 : (char) 2) | (bVarI.M(f) ? ' ' : (char) 16)) | (bVarI.A(function1) ? 256 : 128)) | (bVarI.c(f2) ? 2048 : 1024)) & 1171) == 1170) ? false : true)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            n54.a aVar3 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            ty0.a(bVarI, j.i(aVar2, 56.0f + f2));
            d dVarG2 = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            d dVarG3 = h.g(dVarG2, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).e);
            i78 i78VarA2 = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG3);
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
            m(0, bVarI);
            ty0.a(bVarI, j.i(aVar2, 40.0f));
            int i5 = i4 >> 3;
            p(i, i2, str, z, uiText2, uiText, uiText3, z2, uxsVar, uiText4, uiText5, f, function1, bVarI, (i4 & 1022) | (i5 & 7168) | (i5 & 57344) | (458752 & (i4 << 6)) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192));
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).e));
            q(0, bVarI);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, str, uiText, z, uiText2, uiText3, z2, uxsVar, uiText4, uiText5, f, function1, f2, i3) { // from class: n5e0
                public final /* synthetic */ Float A;
                public final /* synthetic */ Function1 B;
                public final /* synthetic */ float C;
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ UiText d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ UiText f;
                public final /* synthetic */ UiText i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ uxs w;
                public final /* synthetic */ UiText y;
                public final /* synthetic */ UiText z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    o6e0.e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final UiText uiText, Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final Function0<Unit> function1 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(-365988905);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(uiText) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(Reader.READ_DONE);
                bVarI.r(objY);
            }
            final osw oswVar = (osw) objY;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            kw0.g gVar = kw0.g;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar, bVarI, 54);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            qyd0 qyd0Var = ejb0.a;
            d dVarJ = h.j(layoutWeightElement, 0.0f, 0.0f, ((cjb0) bVarI.O(qyd0Var)).c, 0.0f, 11);
            int i3 = i2;
            d160 d160VarA2 = b160.a(kw0.a, bVar, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String strA = cb40.a(R.string.page_loyalty__streak_boost, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).m;
            qyd0 qyd0Var3 = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var3)).o;
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new gaj() { // from class: v5e0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        t tVar = (t) obj;
                        vhv vhvVar = (vhv) obj2;
                        tVar.getClass();
                        vhvVar.getClass();
                        final y yVarD0 = vhvVar.d0(((kxa) obj3).a);
                        return t.z1(tVar, Math.min(yVarD0.a, oswVar.D()), yVarD0.b, new Function1() { // from class: f6e0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                y.a aVar4 = (y.a) obj4;
                                aVar4.getClass();
                                aVar4.s(yVarD0, 0, 0, 0.0f);
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(objY2);
            }
            d dVarA = androidx.compose.ui.layout.j.a(layoutWeightElement2, (gaj) objY2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new Function1() { // from class: w5e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ukf0 ukf0Var = (ukf0) obj;
                        ukf0Var.getClass();
                        int i4 = ukf0Var.b.f;
                        float fMax = 0.0f;
                        for (int i5 = 0; i5 < i4; i5++) {
                            fMax = Math.max(fMax, ukf0Var.h(i5));
                        }
                        oswVar.k((int) Math.ceil(fMax));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            lkf0.d(strA, dVarA, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, (Function1) objY3, imf0Var, bVarI, 0, 1597440, 49144);
            ty0.a(bVarI, j.w(aVar2, ((cjb0) bVarI.O(qyd0Var)).b));
            function1 = function0;
            c6n.a(function1, g3w.h(j.r(aVar2, 16.0f), "streak_boost_info_button"), false, null, null, gv9.d, bVarI, ((i3 >> 3) & 14) | 1572912, 60);
            bVarI.X(true);
            lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), g3w.h(h.g(androidx.compose.foundation.a.b(aVar2, j58.c(0.12f, j58.b), j060.c(((zib0) bVarI.O(ajb0.a)).e)), 10.0f, ((cjb0) bVarI.O(qyd0Var)).c), "current_boost_rate"), ((lib0) bVarI.O(qyd0Var3)).o, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(qyd0Var2)).f, bVarI, 0, 24960, 110584);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    o6e0.f(uiText, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(UiText uiText, UiText uiText2, final Float f, final uxs uxsVar, final Function1<? super i04, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        UiText uiText3;
        final UiText uiText4;
        androidx.compose.runtime.b bVarI = aVar.i(117478443);
        int i2 = (bVarI.M(uiText) ? 4 : 2) | i | (bVarI.M(uiText2) ? 32 : 16) | (bVarI.M(f) ? 256 : 128) | (bVarI.d(uxsVar.ordinal()) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (!bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            uiText3 = uiText2;
            uiText4 = uiText;
            bVarI.G();
        } else if (uiText == null || uiText2 == null || f == null) {
            uiText3 = uiText2;
            uiText4 = uiText;
            bVarI.N(-597577176);
            c(uxsVar, function1, bVarI, (i2 >> 9) & WebSocketProtocol.PAYLOAD_SHORT);
            bVarI.X(false);
        } else {
            bVarI.N(-597748048);
            uiText3 = uiText2;
            h(null, uiText, f.floatValue(), uiText3, bVarI, ((i2 << 3) & 112) | (i2 & 896) | ((i2 << 6) & 7168));
            uiText4 = uiText;
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final UiText uiText5 = uiText3;
            eVarZ.d = new Function2(uiText5, f, uxsVar, function1, i) { // from class: u5e0
                public final /* synthetic */ UiText b;
                public final /* synthetic */ Float c;
                public final /* synthetic */ uxs d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    o6e0.g(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(d dVar, final UiText uiText, final float f, UiText uiText2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        final d dVar2;
        yka.a.C1350a c1350a;
        final UiText uiText3 = uiText2;
        androidx.compose.runtime.b bVarI = aVar.i(-793890903);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(uiText) ? 32 : 16;
        }
        int i3 = i2 | (bVarI.c(f) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= bVarI.M(uiText3) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            imf0 imf0Var = new imf0(((lib0) bVarI.O(oib0.a)).o, mla.m(8.0f, bVarI), t9i.E, null, null, 0L, null, null, 0, 0L, null, null, 16777208);
            kw0.i iVar = new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0());
            dVar2 = d.a.b;
            d dVarG = j.g(dVar2, 1.0f);
            i78 i78VarA = g78.a(iVar, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG2 = j.g(dVar2, 1.0f);
            kw0.g gVar = kw0.g;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar3, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.page_loyalty__mission_time_left, new Object[0], bVarI), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131070);
            uiText.getClass();
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            lkf0.d(uiText.g((Context) bVarI.O(qyd0Var)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131070);
            bVarI.X(true);
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(dVar2, 1.0f), 4.0f), j58.c(0.2f, j58.f), j060.c(4.0f));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a2;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(dVar2, f), 4.0f), ((ast) bVarI.O(cst.e)).a, j060.c(4.0f)), bVarI, 0);
            bVarI.X(true);
            d dVarG3 = j.g(dVar2, 1.0f);
            d160 d160VarA2 = b160.a(gVar, bVar3, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            lkf0.d(cb40.a(R.string.page_loyalty__streak_goal, new Object[0], bVarI), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131070);
            uiText2.getClass();
            uiText3 = uiText2;
            lkf0.d(uiText3.g((Context) bVarI.O(qyd0Var)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131070);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: g6e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o6e0.h(dVar2, uiText, f, uiText3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0133  */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b0  */
    public static final void i(String str, boolean z, boolean z2, final Function0 function0, final Function0 function1, androidx.compose.runtime.a aVar, final int i) {
        final boolean z3;
        String str2;
        int i2;
        int iHashCode;
        final boolean z4 = z;
        androidx.compose.runtime.b bVarI = aVar.i(163805289);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z4) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            int i4 = i3 >> 3;
            z3 = z2;
            d dVarA = g3w.a(j.g(aVar2, 1.0f), z3, new q5e0(), null, bVarI, (i4 & 112) | 6, 4);
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(kw0.g, z3 ? ht.a.l : bVar, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i2 = i3;
            } else {
                i2 = i3;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (z3) {
                    bVarI.N(566991105);
                    j(((i2 << 3) & 112) | 6, bVarI, null, str, true);
                    bVarI.X(false);
                } else {
                    bVarI.N(567071829);
                    bVarI.X(false);
                }
                d160 d160VarA2 = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0()), bVar, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, aVar2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                z4 = z;
                l(z3, z4, function0, bVarI, ((i2 >> 6) & 14) | (i2 & 112) | (i4 & 896));
                bVarI = bVarI;
                c6n.a(function1, g3w.h(j.r(aVar2, 16.0f), "streak_repair_info_button"), false, null, null, pp8.b(1835295311, new Function2() { // from class: r5e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar4 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            h6n.b(pib0.a(R.drawable.ic__question_circle, 0, aVar4), "Info", j.r(d.a.b, z3 ? 12.0f : 16.0f), ((lib0) aVar4.O(oib0.a)).a0, aVar4, 48, 0);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i2 >> 12) & 14) | 1572912, 60);
                bVarI.X(true);
                if (z3) {
                    str2 = str;
                    bVarI.N(568082677);
                    bVarI.X(false);
                } else {
                    bVarI.N(568000992);
                    str2 = str;
                    j(((i2 << 3) & 112) | 6, bVarI, null, str2, false);
                    bVarI.X(false);
                }
                bVarI.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            if (z3) {
                bVarI.N(566991105);
                j(((i2 << 3) & 112) | 6, bVarI, null, str, true);
                bVarI.X(false);
            } else {
                bVarI.N(567071829);
                bVarI.X(false);
            }
            d160 d160VarA3 = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0()), bVar, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            z4 = z;
            l(z3, z4, function0, bVarI, ((i2 >> 6) & 14) | (i2 & 112) | (i4 & 896));
            bVarI = bVarI;
            c6n.a(function1, g3w.h(j.r(aVar2, 16.0f), "streak_repair_info_button"), false, null, null, pp8.b(1835295311, new Function2() { // from class: r5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h6n.b(pib0.a(R.drawable.ic__question_circle, 0, aVar4), "Info", j.r(d.a.b, z3 ? 12.0f : 16.0f), ((lib0) aVar4.O(oib0.a)).a0, aVar4, 48, 0);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 12) & 14) | 1572912, 60);
            bVarI.X(true);
            if (z3) {
                bVarI.N(568000992);
                str2 = str;
                j(((i2 << 3) & 112) | 6, bVarI, null, str2, false);
                bVarI.X(false);
            } else {
                str2 = str;
                bVarI.N(568082677);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            z3 = z2;
            str2 = str;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str3 = str2;
            final boolean z5 = z3;
            eVarZ.d = new Function2(str3, z4, z5, function0, function1, i) { // from class: s5e0
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    o6e0.i(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final int i, androidx.compose.runtime.a aVar, d dVar, final String str, final boolean z) {
        int i2;
        androidx.compose.runtime.b bVar;
        final d dVar2;
        imf0 imf0VarB;
        d dVarA;
        androidx.compose.runtime.b bVarI = aVar.i(309835286);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                imf0 imf0Var = new imf0(0L, 0L, t9i.E, null, null, 0L, null, null, 0, 0L, new uk10(), new afs(afs.a.d, 17, 0), 15204347);
                bVarI.r(imf0Var);
                objY = imf0Var;
            }
            imf0 imf0Var2 = (imf0) objY;
            long jM = mla.m(40.0f, bVarI);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = k.a(0);
                bVarI.r(objY2);
            }
            final osw oswVar = (osw) objY2;
            if (z) {
                bVarI.N(418888020);
                bVarI.X(false);
                imf0VarB = imf0.b(imf0Var2, 0L, jM, null, null, null, 0L, null, null, null, 0, jM, null, null, 16646141);
            } else {
                bVarI.N(418979718);
                imf0VarB = ((ijb0) bVarI.O(kjb0.a)).g;
                bVarI.X(false);
            }
            imf0 imf0Var3 = imf0VarB;
            long j = ((lib0) bVarI.O(oib0.a)).o;
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(aVar2, "current_repair_tool_count");
            if (!z || oswVar.D() <= 0) {
                bVarI.N(419872828);
                bVarI.X(false);
                dVarA = aVar2;
            } else {
                bVarI.N(419557868);
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new gaj() { // from class: c6e0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            t tVar = (t) obj;
                            vhv vhvVar = (vhv) obj2;
                            tVar.getClass();
                            vhvVar.getClass();
                            y yVarD0 = vhvVar.d0(((kxa) obj3).a);
                            return t.z1(tVar, yVarD0.a, oswVar.D(), new lto(yVarD0, 1));
                        }
                    };
                    bVarI.r(objY3);
                }
                dVarA = androidx.compose.ui.layout.j.a(aVar2, (gaj) objY3);
                bVarI.X(false);
            }
            d dVarN = dVarH.n(dVarA);
            boolean z2 = (i3 & 14) == 4;
            Object objY4 = bVarI.y();
            if (z2 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: d6e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ukf0 ukf0Var = (ukf0) obj;
                        ukf0Var.getClass();
                        if (z) {
                            oswVar.k((int) ukf0Var.e);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            bVar = bVarI;
            lkf0.d(str, dVarN, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objY4, imf0Var3, bVar, (i3 >> 3) & 14, 0, 65528);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e6e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o6e0.j(qj40.a(i | 1), (a) obj, dVar2, str, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        imf0 imf0Var;
        androidx.compose.runtime.b bVarI = aVar.i(324166696);
        int i2 = (bVarI.b(z) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (z) {
                bVarI.N(-1798368586);
                bVarI.X(false);
            } else {
                bVarI.N(-1798615873);
                h6n.b(pib0.a(R.drawable.ic__repair, 0, bVarI), "Streak Repair", j.r(aVar2, 16.0f), ((lib0) bVarI.O(oib0.a)).a0, bVarI, 432, 0);
                bVarI.X(false);
            }
            String strA = cb40.a(R.string.page_loyalty__streak_repair, new Object[0], bVarI);
            if (z) {
                bVarI.N(2020202415);
                imf0Var = fjb0.e(bVarI).d;
            } else {
                bVarI.N(2020203055);
                imf0Var = fjb0.e(bVarI).i;
            }
            bVarI.X(false);
            lkf0.d(strA, null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, z) { // from class: z5e0
                public final /* synthetic */ boolean a;

                {
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    o6e0.k(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(final boolean z, boolean z2, Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z3 = z2;
        final Function0<Unit> function1 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(-632827510);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            if (z) {
                bVarI.N(-1952714044);
                d dVarC = c9j.c(g3w.h(j.v(aVar2, 1.0f, 1.0f, 0.0f, 12), "streak_repair_use_button"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "bettingstreak__streakrepair");
                i060 i060VarC = j060.c(((zib0) bVarI.O(ajb0.a)).e);
                alb0 alb0Var = g9z.a;
                qyd0 qyd0Var = cst.e;
                long j = ((ast) bVarI.O(qyd0Var)).a;
                qyd0 qyd0Var2 = oib0.a;
                vuc0.a(dVarC, z3, g9z.b(j, ((lib0) bVarI.O(qyd0Var2)).Q, bVarI, 1), null, function0, g9z.a(((ast) bVarI.O(qyd0Var)).a, ((lib0) bVarI.O(qyd0Var2)).Q, bVarI, 1), alb0.a(g9z.d, new g7f(22.0f), h.a(2, 12.0f, 0.0f), 0L, 0.0f, 25), i060VarC, null, gv9.b, bVarI, (i2 & 112) | 805306368 | ((i2 << 6) & 57344), 264);
                bVarI = bVarI;
                bVarI.X(false);
                z3 = z2;
                function1 = function0;
            } else {
                bVarI.N(-1951408510);
                d dVarC2 = c9j.c(g3w.h(j.v(aVar2, 1.0f, 1.0f, 0.0f, 12), "streak_repair_use_button"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "bettingstreak__streakrepair");
                i060 i060VarC2 = j060.c(((zib0) bVarI.O(ajb0.a)).e);
                qyd0 qyd0Var3 = oib0.a;
                function1 = function0;
                jst.a(function1, dVarC2, z2, alb0.a(sya.e, new g7f(22.0f), h.a(2, 12.0f, 0.0f), 0L, 0.0f, 25), 0L, ((lib0) bVarI.O(qyd0Var3)).a, ((lib0) bVarI.O(qyd0Var3)).Q, ((lib0) bVarI.O(qyd0Var3)).g0, i060VarC2, null, bVarI, ((i2 >> 6) & 14) | ((i2 << 3) & 896));
                z3 = z2;
                bVarI = bVarI;
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h6e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    o6e0.l(z, z3, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1231204096);
        if (bVarI.q(i & 1, i != 0)) {
            mw90.b(cb40.a(R.string.page_loyalty__loyalty_daily_streak_banner, new Object[0], bVarI), "Loyalty Daily Streak Banner", j.i(j.g(d.a.b, 1.0f), 76.0f), null, null, pib0.a(R.drawable.img__loyalty_daily_streak, 0, bVarI), null, null, d0b.a.g, 0.0f, null, bVarI, 432, 6, 31704);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new j6e0();
        }
    }

    public static final void n(UiText uiText, Function0 function0, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-926237534);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(uiText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            u(null, new g7f(72.0f), pp8.b(1262862638, new e7t(i3, function0, uiText), bVarI), bVarI, 3456, 3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new v4e0(uiText, function0, i, 0);
        }
    }

    public static final void o(final m75 m75Var, final int i, boolean z, final UiText uiText, final Function0 function0, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        boolean z2;
        androidx.compose.runtime.b bVar;
        imf0 imf0Var;
        qyd0 qyd0Var;
        float f;
        Function0 function1;
        androidx.compose.runtime.b bVarI = aVar.i(-823657634);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(m75Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.M(uiText) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i4 = i3;
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            d dVarB = m75Var.b(j.g(aVar2, 1.0f), z ? ht.a.b : ht.a.h);
            qyd0 qyd0Var2 = ejb0.a;
            z2 = z;
            d dVarA = g3w.a(h.j(dVarB, ((cjb0) bVarI.O(qyd0Var2)).e, 0.0f, ((cjb0) bVarI.O(qyd0Var2)).e, ((cjb0) bVarI.O(qyd0Var2)).f, 2), z2, new d5e0(), new e5e0(), bVarI, (i4 >> 3) & 112, 0);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            String strA = cb40.a(R.string.page_loyalty__current_streak, new Object[0], bVarI);
            if (z2) {
                bVarI.N(-451203509);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).d;
            } else {
                bVarI.N(-451202869);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).a;
            }
            bVarI.X(false);
            lkf0.d(strA, null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
            bVar = bVarI;
            if (z2) {
                bVar.N(-451198318);
                qyd0Var = qyd0Var2;
                f = ((cjb0) bVar.O(qyd0Var)).e;
            } else {
                qyd0Var = qyd0Var2;
                bVar.N(-451197549);
                f = ((cjb0) bVar.O(qyd0Var)).d;
            }
            bVar.X(false);
            ty0.a(bVar, j.i(aVar2, f));
            v(i, ((i4 >> 6) & 14) | (i4 & 112), bVar, z2);
            if (uiText != null) {
                bVar.N(-1102086194);
                ty0.a(bVar, j.i(aVar2, ((cjb0) bVar.O(qyd0Var)).g));
                if (function0 == null) {
                    bVar.N(-1101886120);
                    Object objY = bVar.y();
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new f5e0();
                        bVar.r(objY);
                    }
                    function1 = (Function0) objY;
                    bVar.X(false);
                } else {
                    bVar.N(-451187330);
                    bVar.X(false);
                    function1 = function0;
                }
                f(uiText, function1, bVar, (i4 >> 9) & 14);
                bVar.X(false);
            } else {
                bVar.N(-1101859398);
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            z2 = z;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final boolean z3 = z2;
            eVarZ.d = new Function2() { // from class: g5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o6e0.o(m75Var, i, z3, uiText, function0, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void p(final int i, final int i2, final String str, final boolean z, final UiText uiText, final UiText uiText2, final UiText uiText3, final boolean z2, final uxs uxsVar, final UiText uiText4, final UiText uiText5, final Float f, final Function1 function1, androidx.compose.runtime.a aVar, final int i3) {
        boolean z3;
        androidx.compose.runtime.b bVarI = aVar.i(-642997315);
        int i4 = (bVarI.d(i) ? 4 : 2) | i3 | (bVarI.d(i2) ? 32 : 16) | (bVarI.M(str) ? 256 : 128);
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= bVarI.M(uiText) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= bVarI.M(uiText2) ? 131072 : 65536;
        }
        int i5 = i4 | (bVarI.M(uiText3) ? 1048576 : 524288) | (bVarI.b(z2) ? 8388608 : 4194304) | (bVarI.d(uxsVar.ordinal()) ? 67108864 : 33554432) | (bVarI.M(uiText4) ? 536870912 : 268435456);
        int i6 = (bVarI.M(uiText5) ? 4 : 2) | (bVarI.M(f) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            boolean z4 = ((i6 & 896) == 256) | ((i5 & 3670016) == 1048576);
            Object objY = bVarI.y();
            if (z4 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: l6e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        StringUiText stringUiText = vch0.a;
                        function1.invoke(new i04.a(new ResourceUiText(R.string.page_loyalty__loyalty_streak_boost), uiText3));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            d.a aVar2 = d.a.b;
            int i7 = ((i5 >> 18) & 112) | 6;
            d dVarA = g3w.a(j.g(aVar2, 1.0f), z2, new m6e0(), null, bVarI, i7, 4);
            d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            b(g3w.a(aVar2, z2, new n6e0(), new t4e0(), bVarI, i7, 0), i, i2, z2, z2 ? uiText2 : null, z2 ? function0 : null, bVarI, ((i5 << 3) & 1008) | ((i5 >> 12) & 7168));
            if (z2) {
                bVarI.N(751205293);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                int i8 = i5 >> 3;
                int i9 = i5 >> 9;
                int i10 = (i8 & 7168) | (i8 & 112) | 24576 | (i8 & 896) | (i9 & 458752) | (i9 & 3670016);
                int i11 = i6 << 21;
                t(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), str, z, uiText, true, uxsVar, uiText4, uiText5, f, function1, bVarI, i10 | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), 0);
                bVarI = bVarI;
                bVarI.X(false);
                z3 = true;
            } else {
                bVarI.N(751811095);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                d dVarI = j.i(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 157.0f);
                i78 i78VarA = g78.a(kw0.g, ht.a.n, bVarI, 54);
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
                int i12 = i5 >> 3;
                t(null, str, z, uiText, false, uxsVar, null, null, null, function1, bVarI, (i12 & 7168) | (i12 & 112) | 24576 | (i12 & 896) | ((i5 >> 9) & 458752) | ((i6 << 21) & 1879048192), 449);
                bVarI = bVarI;
                n(uiText2, function0, bVarI, (i5 >> 15) & 14);
                z3 = true;
                bVarI.X(true);
                bVarI.X(false);
            }
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u4e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    o6e0.p(i, i2, str, z, uiText, uiText2, uiText3, z2, uxsVar, uiText4, uiText5, f, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void q(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(2065263032);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.page_loyalty__streak_instruction_description, new Object[0], bVarI), null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((ijb0) bVarI.O(kjb0.a)).q, 0L, 0L, t9i.E, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), bVar, 0, 0, 131066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new k6e0();
        }
    }

    public static final void r(final int i, final int i2, final UiText uiText, final String str, final boolean z, final UiText uiText2, final UiText uiText3, boolean z2, uxs uxsVar, UiText uiText4, UiText uiText5, Float f, final Function1<? super i04, Unit> function1, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        String str2;
        boolean z3;
        final boolean z4;
        int i7;
        int i8;
        int i9;
        final uxs uxsVar2;
        final UiText uiText6;
        final UiText uiText7;
        final Float f2;
        uiText.getClass();
        str.getClass();
        uiText2.getClass();
        uiText3.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2006578898);
        int i10 = (bVarI.d(i) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i6 = i2;
            i10 |= bVarI.d(i6) ? 32 : 16;
        } else {
            i6 = i2;
        }
        int i11 = i10 | (bVarI.M(uiText) ? 256 : 128);
        if ((i3 & 3072) == 0) {
            str2 = str;
            i11 |= bVarI.M(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i3 & 24576) == 0) {
            z3 = z;
            i11 |= bVarI.b(z3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            z3 = z;
        }
        int i12 = i11 | (bVarI.M(uiText2) ? 131072 : 65536) | (bVarI.M(uiText3) ? 1048576 : 524288);
        int i13 = i5 & 128;
        if (i13 != 0) {
            i12 |= 12582912;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i3 & 12582912) == 0) {
                i12 |= bVarI.b(z4) ? 8388608 : 4194304;
            }
        }
        int i14 = i5 & 256;
        if (i14 != 0) {
            i7 = i12 | 100663296;
        } else {
            i7 = i12 | (bVarI.d(uxsVar == null ? -1 : uxsVar.ordinal()) ? 67108864 : 33554432);
        }
        int i15 = i5 & 512;
        if (i15 != 0) {
            i8 = i7 | 805306368;
        } else {
            i8 = i7 | (bVarI.M(uiText4) ? 536870912 : 268435456);
        }
        int i16 = i5 & 1024;
        if (i16 != 0) {
            i9 = i4 | 6;
        } else {
            i9 = i4 | (bVarI.M(uiText5) ? 4 : 2);
        }
        int i17 = i5 & 2048;
        if (i17 != 0) {
            i9 |= 48;
        } else if ((i4 & 48) == 0) {
            i9 |= bVarI.M(f) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i9 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 147) == 146) ? false : true)) {
            final boolean z5 = i13 != 0 ? false : z4;
            final uxs uxsVar3 = i14 != 0 ? uxs.ENABLE : uxsVar;
            final UiText uiText8 = i15 != 0 ? null : uiText4;
            final UiText uiText9 = i16 != 0 ? null : uiText5;
            final Float f3 = i17 != 0 ? null : f;
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            final float fD = r8j0.c(q8j0.a.a(bVarI).f, bVarI).d();
            final int i18 = i6;
            final String str3 = str2;
            final boolean z6 = z3;
            l0u.b(6, pp8.b(1014164167, new Function2() { // from class: s4e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG = j.g(d.a.b, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
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
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        float f4 = fD;
                        o6e0.d(f4, aVar2, 6);
                        o6e0.e(i, i18, str3, uiText, z6, uiText2, uiText3, z5, uxsVar3, uiText8, uiText9, f3, function1, f4, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
            z4 = z5;
            uxsVar2 = uxsVar3;
            uiText6 = uiText8;
            uiText7 = uiText9;
            f2 = f3;
        } else {
            bVarI.G();
            uxsVar2 = uxsVar;
            uiText6 = uiText4;
            uiText7 = uiText5;
            f2 = f;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    int iA2 = qj40.a(i4);
                    o6e0.r(i, i2, uiText, str, z, uiText2, uiText3, z4, uxsVar2, uiText6, uiText7, f2, function1, (a) obj, iA, iA2, i5);
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(final int i, final int i2, androidx.compose.runtime.a aVar, final boolean z) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(985048542);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            h9n.a(pib0.a(i, i3 & 14, bVarI), "Current Streak", g.d(g3w.a(d.a.b, z, new j5e0(), new k5e0(), bVarI, (i3 & 112) | 6, 0), 0.0f, -25.0f, 1), null, null, 0.0f, null, bVarI, 48, 120);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    o6e0.s(i, iA, (a) obj, z);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x0124  */
    /* JADX WARN: Code duplicated, block: B:108:0x0126  */
    /* JADX WARN: Code duplicated, block: B:111:0x012b  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    public static final void t(d dVar, final String str, final boolean z, final UiText uiText, final boolean z2, final uxs uxsVar, UiText uiText2, UiText uiText3, Float f, final Function1<? super i04, Unit> function1, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        boolean z3;
        UiText uiText4;
        int i4;
        UiText uiText5;
        int i5;
        int i6;
        Float f2;
        int i7;
        int i8;
        boolean z4;
        androidx.compose.runtime.b bVar;
        final UiText uiText6;
        final UiText uiText7;
        final Float f3;
        e eVarZ;
        d dVar3;
        final UiText uiText8;
        final UiText uiText9;
        final Float f4;
        int i9;
        androidx.compose.runtime.b bVarI = aVar.i(65449049);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= bVarI.b(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.M(uiText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.d(uxsVar.ordinal()) ? 131072 : 65536;
        }
        int i11 = i2 & 64;
        if (i11 == 0) {
            if ((1572864 & i) == 0) {
                uiText4 = uiText2;
                i3 |= bVarI.M(uiText4) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    uiText5 = uiText3;
                    if (bVarI.M(uiText5)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    if ((100663296 & i) == 0) {
                        f2 = f;
                        if (bVarI.M(f2)) {
                            i7 = 67108864;
                        } else {
                            i7 = 33554432;
                        }
                        i3 |= i7;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(function1)) {
                            i9 = 536870912;
                        } else {
                            i9 = 268435456;
                        }
                        i3 |= i9;
                    }
                    i8 = i3;
                    if ((i8 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (bVarI.q(i8 & 1, z4)) {
                        if (i10 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i11 != 0) {
                            uiText8 = null;
                        } else {
                            uiText8 = uiText4;
                        }
                        if (i4 != 0) {
                            uiText9 = null;
                        } else {
                            uiText9 = uiText5;
                        }
                        if (i6 != 0) {
                            f4 = null;
                        } else {
                            f4 = f2;
                        }
                        final boolean z5 = z3;
                        f2 = f4;
                        bVar = bVarI;
                        dVar2 = dVar3;
                        u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                            /* JADX WARN: Type inference failed for: r14v2 */
                            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                            /* JADX WARN: Type inference failed for: r14v4 */
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                yka.a.C1350a c1350a;
                                yka.a.b bVar2;
                                ?? r14;
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((m75) obj).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d.a aVar3 = d.a.b;
                                    d dVarC = c.c(aVar2, aVar3);
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
                                    yka.a.b bVar3 = yka.a.f;
                                    hlh0.a(aVar2, i78VarA, bVar3);
                                    yka.a.d dVar4 = yka.a.e;
                                    hlh0.a(aVar2, ne00VarO, dVar4);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC, cVar);
                                    final boolean z6 = z2;
                                    if (z6) {
                                        aVar2.N(-730788052);
                                        c1350a = c1350a2;
                                        bVar2 = bVar3;
                                        r14 = 0;
                                        h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                                        aVar2 = aVar2;
                                        aVar2.H();
                                    } else {
                                        c1350a = c1350a2;
                                        bVar2 = bVar3;
                                        r14 = 0;
                                        aVar2.N(-730344597);
                                        aVar2.H();
                                    }
                                    Unit unit = Unit.a;
                                    boolean z7 = z5;
                                    boolean zB = aVar2.b(z7);
                                    final Function1 function2 = function1;
                                    boolean zM = zB | aVar2.M(function2);
                                    Object objY = aVar2.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zM || objY == c0042a) {
                                        objY = new o6e0.b(function2, z7, r14);
                                        aVar2.r(objY);
                                    }
                                    xvf.e(aVar2, unit, (Function2) objY);
                                    a aVar5 = aVar2;
                                    d dVarA = g3w.a(aVar3, z6, new m5e0(), new o5e0(), aVar5, 6, 0);
                                    i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                                    int iHashCode2 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO2 = aVar5.o();
                                    d dVarC2 = c.c(aVar5, dVarA);
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw r14;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar4);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, i78VarA2, bVar2);
                                    hlh0.a(aVar5, ne00VarO2, dVar4);
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar5, dVarC2, cVar);
                                    o6e0.k(z6, aVar5, 0);
                                    boolean zM2 = aVar5.M(function2);
                                    Object objY2 = aVar5.y();
                                    if (zM2 || objY2 == c0042a) {
                                        objY2 = new xtx(function2, 1);
                                        aVar5.r(objY2);
                                    }
                                    Function0 function0 = (Function0) objY2;
                                    boolean zB2 = aVar5.b(z6) | aVar5.M(function2);
                                    final UiText uiText10 = uiText;
                                    boolean zM3 = zB2 | aVar5.M(uiText10);
                                    Object objY3 = aVar5.y();
                                    if (zM3 || objY3 == c0042a) {
                                        objY3 = new Function0() { // from class: p5e0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                boolean z8 = z6;
                                                Function1 function3 = function2;
                                                UiText uiText11 = uiText10;
                                                if (z8) {
                                                    function3.invoke(new i04.b(uiText11));
                                                } else {
                                                    function3.invoke(new i04.c(uiText11));
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        aVar5.r(objY3);
                                    }
                                    o6e0.i(str, z7, z6, function0, (Function0) objY3, aVar5, 0);
                                    if (z6) {
                                        aVar5.N(200486271);
                                        o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                                        aVar5.H();
                                    } else {
                                        aVar5.N(200857217);
                                        aVar5.H();
                                    }
                                    aVar5.s();
                                    aVar5.s();
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVar, (i8 & 14) | 3072, 2);
                        uiText7 = uiText9;
                        uiText6 = uiText8;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        uiText6 = uiText4;
                        uiText7 = uiText5;
                    }
                    f3 = f2;
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: b5e0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                f2 = f;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                i8 = i3;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i8 & 1, z4)) {
                    if (i10 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i11 != 0) {
                        uiText8 = null;
                    } else {
                        uiText8 = uiText4;
                    }
                    if (i4 != 0) {
                        uiText9 = null;
                    } else {
                        uiText9 = uiText5;
                    }
                    if (i6 != 0) {
                        f4 = null;
                    } else {
                        f4 = f2;
                    }
                    final boolean z6 = z3;
                    f2 = f4;
                    bVar = bVarI;
                    dVar2 = dVar3;
                    u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                        /* JADX WARN: Type inference failed for: r14v2 */
                        /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                        /* JADX WARN: Type inference failed for: r14v4 */
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            yka.a.C1350a c1350a;
                            yka.a.b bVar2;
                            ?? r14;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((m75) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d.a aVar3 = d.a.b;
                                d dVarC = c.c(aVar2, aVar3);
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
                                yka.a.b bVar3 = yka.a.f;
                                hlh0.a(aVar2, i78VarA, bVar3);
                                yka.a.d dVar4 = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar4);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                final boolean z7 = z2;
                                if (z7) {
                                    aVar2.N(-730788052);
                                    c1350a = c1350a2;
                                    bVar2 = bVar3;
                                    r14 = 0;
                                    h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                                    aVar2 = aVar2;
                                    aVar2.H();
                                } else {
                                    c1350a = c1350a2;
                                    bVar2 = bVar3;
                                    r14 = 0;
                                    aVar2.N(-730344597);
                                    aVar2.H();
                                }
                                Unit unit = Unit.a;
                                boolean z8 = z6;
                                boolean zB = aVar2.b(z8);
                                final Function1 function2 = function1;
                                boolean zM = zB | aVar2.M(function2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new o6e0.b(function2, z8, r14);
                                    aVar2.r(objY);
                                }
                                xvf.e(aVar2, unit, (Function2) objY);
                                a aVar5 = aVar2;
                                d dVarA = g3w.a(aVar3, z7, new m5e0(), new o5e0(), aVar5, 6, 0);
                                i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                                int iHashCode2 = Long.hashCode(aVar5.m());
                                ne00 ne00VarO2 = aVar5.o();
                                d dVarC2 = c.c(aVar5, dVarA);
                                if (aVar5.k() == null) {
                                    l2a.b();
                                    throw r14;
                                }
                                aVar5.D();
                                if (aVar5.g()) {
                                    aVar5.F(aVar4);
                                } else {
                                    aVar5.p();
                                }
                                hlh0.a(aVar5, i78VarA2, bVar2);
                                hlh0.a(aVar5, ne00VarO2, dVar4);
                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar5, dVarC2, cVar);
                                o6e0.k(z7, aVar5, 0);
                                boolean zM2 = aVar5.M(function2);
                                Object objY2 = aVar5.y();
                                if (zM2 || objY2 == c0042a) {
                                    objY2 = new xtx(function2, 1);
                                    aVar5.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zB2 = aVar5.b(z7) | aVar5.M(function2);
                                final UiText uiText10 = uiText;
                                boolean zM3 = zB2 | aVar5.M(uiText10);
                                Object objY3 = aVar5.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new Function0() { // from class: p5e0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            boolean z9 = z7;
                                            Function1 function3 = function2;
                                            UiText uiText11 = uiText10;
                                            if (z9) {
                                                function3.invoke(new i04.b(uiText11));
                                            } else {
                                                function3.invoke(new i04.c(uiText11));
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar5.r(objY3);
                                }
                                o6e0.i(str, z8, z7, function0, (Function0) objY3, aVar5, 0);
                                if (z7) {
                                    aVar5.N(200486271);
                                    o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                                    aVar5.H();
                                } else {
                                    aVar5.N(200857217);
                                    aVar5.H();
                                }
                                aVar5.s();
                                aVar5.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, (i8 & 14) | 3072, 2);
                    uiText7 = uiText9;
                    uiText6 = uiText8;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    uiText6 = uiText4;
                    uiText7 = uiText5;
                }
                f3 = f2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b5e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            uiText5 = uiText3;
            i6 = i2 & 256;
            if (i6 != 0) {
                if ((100663296 & i) == 0) {
                    f2 = f;
                    if (bVarI.M(f2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                i8 = i3;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i8 & 1, z4)) {
                    if (i10 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i11 != 0) {
                        uiText8 = null;
                    } else {
                        uiText8 = uiText4;
                    }
                    if (i4 != 0) {
                        uiText9 = null;
                    } else {
                        uiText9 = uiText5;
                    }
                    if (i6 != 0) {
                        f4 = null;
                    } else {
                        f4 = f2;
                    }
                    final boolean z7 = z3;
                    f2 = f4;
                    bVar = bVarI;
                    dVar2 = dVar3;
                    u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                        /* JADX WARN: Type inference failed for: r14v2 */
                        /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                        /* JADX WARN: Type inference failed for: r14v4 */
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            yka.a.C1350a c1350a;
                            yka.a.b bVar2;
                            ?? r14;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((m75) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d.a aVar3 = d.a.b;
                                d dVarC = c.c(aVar2, aVar3);
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
                                yka.a.b bVar3 = yka.a.f;
                                hlh0.a(aVar2, i78VarA, bVar3);
                                yka.a.d dVar4 = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar4);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                final boolean z8 = z2;
                                if (z8) {
                                    aVar2.N(-730788052);
                                    c1350a = c1350a2;
                                    bVar2 = bVar3;
                                    r14 = 0;
                                    h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                                    aVar2 = aVar2;
                                    aVar2.H();
                                } else {
                                    c1350a = c1350a2;
                                    bVar2 = bVar3;
                                    r14 = 0;
                                    aVar2.N(-730344597);
                                    aVar2.H();
                                }
                                Unit unit = Unit.a;
                                boolean z9 = z7;
                                boolean zB = aVar2.b(z9);
                                final Function1 function2 = function1;
                                boolean zM = zB | aVar2.M(function2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new o6e0.b(function2, z9, r14);
                                    aVar2.r(objY);
                                }
                                xvf.e(aVar2, unit, (Function2) objY);
                                a aVar5 = aVar2;
                                d dVarA = g3w.a(aVar3, z8, new m5e0(), new o5e0(), aVar5, 6, 0);
                                i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                                int iHashCode2 = Long.hashCode(aVar5.m());
                                ne00 ne00VarO2 = aVar5.o();
                                d dVarC2 = c.c(aVar5, dVarA);
                                if (aVar5.k() == null) {
                                    l2a.b();
                                    throw r14;
                                }
                                aVar5.D();
                                if (aVar5.g()) {
                                    aVar5.F(aVar4);
                                } else {
                                    aVar5.p();
                                }
                                hlh0.a(aVar5, i78VarA2, bVar2);
                                hlh0.a(aVar5, ne00VarO2, dVar4);
                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar5, dVarC2, cVar);
                                o6e0.k(z8, aVar5, 0);
                                boolean zM2 = aVar5.M(function2);
                                Object objY2 = aVar5.y();
                                if (zM2 || objY2 == c0042a) {
                                    objY2 = new xtx(function2, 1);
                                    aVar5.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zB2 = aVar5.b(z8) | aVar5.M(function2);
                                final UiText uiText10 = uiText;
                                boolean zM3 = zB2 | aVar5.M(uiText10);
                                Object objY3 = aVar5.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new Function0() { // from class: p5e0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            boolean z10 = z8;
                                            Function1 function3 = function2;
                                            UiText uiText11 = uiText10;
                                            if (z10) {
                                                function3.invoke(new i04.b(uiText11));
                                            } else {
                                                function3.invoke(new i04.c(uiText11));
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar5.r(objY3);
                                }
                                o6e0.i(str, z9, z8, function0, (Function0) objY3, aVar5, 0);
                                if (z8) {
                                    aVar5.N(200486271);
                                    o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                                    aVar5.H();
                                } else {
                                    aVar5.N(200857217);
                                    aVar5.H();
                                }
                                aVar5.s();
                                aVar5.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, (i8 & 14) | 3072, 2);
                    uiText7 = uiText9;
                    uiText6 = uiText8;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    uiText6 = uiText4;
                    uiText7 = uiText5;
                }
                f3 = f2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b5e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            f2 = f;
            if ((i & 805306368) == 0) {
                if (bVarI.A(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            i8 = i3;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i8 & 1, z4)) {
                if (i10 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i11 != 0) {
                    uiText8 = null;
                } else {
                    uiText8 = uiText4;
                }
                if (i4 != 0) {
                    uiText9 = null;
                } else {
                    uiText9 = uiText5;
                }
                if (i6 != 0) {
                    f4 = null;
                } else {
                    f4 = f2;
                }
                final boolean z8 = z3;
                f2 = f4;
                bVar = bVarI;
                dVar2 = dVar3;
                u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                    /* JADX WARN: Type inference failed for: r14v2 */
                    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                    /* JADX WARN: Type inference failed for: r14v4 */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        yka.a.C1350a c1350a;
                        yka.a.b bVar2;
                        ?? r14;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((m75) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d.a aVar3 = d.a.b;
                            d dVarC = c.c(aVar2, aVar3);
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
                            yka.a.b bVar3 = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar3);
                            yka.a.d dVar4 = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar4);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            final boolean z9 = z2;
                            if (z9) {
                                aVar2.N(-730788052);
                                c1350a = c1350a2;
                                bVar2 = bVar3;
                                r14 = 0;
                                h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                                aVar2 = aVar2;
                                aVar2.H();
                            } else {
                                c1350a = c1350a2;
                                bVar2 = bVar3;
                                r14 = 0;
                                aVar2.N(-730344597);
                                aVar2.H();
                            }
                            Unit unit = Unit.a;
                            boolean z10 = z8;
                            boolean zB = aVar2.b(z10);
                            final Function1 function2 = function1;
                            boolean zM = zB | aVar2.M(function2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zM || objY == c0042a) {
                                objY = new o6e0.b(function2, z10, r14);
                                aVar2.r(objY);
                            }
                            xvf.e(aVar2, unit, (Function2) objY);
                            a aVar5 = aVar2;
                            d dVarA = g3w.a(aVar3, z9, new m5e0(), new o5e0(), aVar5, 6, 0);
                            i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                            int iHashCode2 = Long.hashCode(aVar5.m());
                            ne00 ne00VarO2 = aVar5.o();
                            d dVarC2 = c.c(aVar5, dVarA);
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw r14;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar4);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, i78VarA2, bVar2);
                            hlh0.a(aVar5, ne00VarO2, dVar4);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar5, dVarC2, cVar);
                            o6e0.k(z9, aVar5, 0);
                            boolean zM2 = aVar5.M(function2);
                            Object objY2 = aVar5.y();
                            if (zM2 || objY2 == c0042a) {
                                objY2 = new xtx(function2, 1);
                                aVar5.r(objY2);
                            }
                            Function0 function0 = (Function0) objY2;
                            boolean zB2 = aVar5.b(z9) | aVar5.M(function2);
                            final UiText uiText10 = uiText;
                            boolean zM3 = zB2 | aVar5.M(uiText10);
                            Object objY3 = aVar5.y();
                            if (zM3 || objY3 == c0042a) {
                                objY3 = new Function0() { // from class: p5e0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean z11 = z9;
                                        Function1 function3 = function2;
                                        UiText uiText11 = uiText10;
                                        if (z11) {
                                            function3.invoke(new i04.b(uiText11));
                                        } else {
                                            function3.invoke(new i04.c(uiText11));
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar5.r(objY3);
                            }
                            o6e0.i(str, z10, z9, function0, (Function0) objY3, aVar5, 0);
                            if (z9) {
                                aVar5.N(200486271);
                                o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                                aVar5.H();
                            } else {
                                aVar5.N(200857217);
                                aVar5.H();
                            }
                            aVar5.s();
                            aVar5.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, (i8 & 14) | 3072, 2);
                uiText7 = uiText9;
                uiText6 = uiText8;
            } else {
                bVar = bVarI;
                bVar.G();
                uiText6 = uiText4;
                uiText7 = uiText5;
            }
            f3 = f2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: b5e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        uiText4 = uiText2;
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                uiText5 = uiText3;
                if (bVarI.M(uiText5)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            i6 = i2 & 256;
            if (i6 != 0) {
                if ((100663296 & i) == 0) {
                    f2 = f;
                    if (bVarI.M(f2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                i8 = i3;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i8 & 1, z4)) {
                    if (i10 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i11 != 0) {
                        uiText8 = null;
                    } else {
                        uiText8 = uiText4;
                    }
                    if (i4 != 0) {
                        uiText9 = null;
                    } else {
                        uiText9 = uiText5;
                    }
                    if (i6 != 0) {
                        f4 = null;
                    } else {
                        f4 = f2;
                    }
                    final boolean z9 = z3;
                    f2 = f4;
                    bVar = bVarI;
                    dVar2 = dVar3;
                    u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                        /* JADX WARN: Type inference failed for: r14v2 */
                        /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                        /* JADX WARN: Type inference failed for: r14v4 */
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            yka.a.C1350a c1350a;
                            yka.a.b bVar2;
                            ?? r14;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((m75) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d.a aVar3 = d.a.b;
                                d dVarC = c.c(aVar2, aVar3);
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
                                yka.a.b bVar3 = yka.a.f;
                                hlh0.a(aVar2, i78VarA, bVar3);
                                yka.a.d dVar4 = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar4);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                final boolean z10 = z2;
                                if (z10) {
                                    aVar2.N(-730788052);
                                    c1350a = c1350a2;
                                    bVar2 = bVar3;
                                    r14 = 0;
                                    h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                                    aVar2 = aVar2;
                                    aVar2.H();
                                } else {
                                    c1350a = c1350a2;
                                    bVar2 = bVar3;
                                    r14 = 0;
                                    aVar2.N(-730344597);
                                    aVar2.H();
                                }
                                Unit unit = Unit.a;
                                boolean z11 = z9;
                                boolean zB = aVar2.b(z11);
                                final Function1 function2 = function1;
                                boolean zM = zB | aVar2.M(function2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new o6e0.b(function2, z11, r14);
                                    aVar2.r(objY);
                                }
                                xvf.e(aVar2, unit, (Function2) objY);
                                a aVar5 = aVar2;
                                d dVarA = g3w.a(aVar3, z10, new m5e0(), new o5e0(), aVar5, 6, 0);
                                i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                                int iHashCode2 = Long.hashCode(aVar5.m());
                                ne00 ne00VarO2 = aVar5.o();
                                d dVarC2 = c.c(aVar5, dVarA);
                                if (aVar5.k() == null) {
                                    l2a.b();
                                    throw r14;
                                }
                                aVar5.D();
                                if (aVar5.g()) {
                                    aVar5.F(aVar4);
                                } else {
                                    aVar5.p();
                                }
                                hlh0.a(aVar5, i78VarA2, bVar2);
                                hlh0.a(aVar5, ne00VarO2, dVar4);
                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar5, dVarC2, cVar);
                                o6e0.k(z10, aVar5, 0);
                                boolean zM2 = aVar5.M(function2);
                                Object objY2 = aVar5.y();
                                if (zM2 || objY2 == c0042a) {
                                    objY2 = new xtx(function2, 1);
                                    aVar5.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zB2 = aVar5.b(z10) | aVar5.M(function2);
                                final UiText uiText10 = uiText;
                                boolean zM3 = zB2 | aVar5.M(uiText10);
                                Object objY3 = aVar5.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new Function0() { // from class: p5e0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            boolean z12 = z10;
                                            Function1 function3 = function2;
                                            UiText uiText11 = uiText10;
                                            if (z12) {
                                                function3.invoke(new i04.b(uiText11));
                                            } else {
                                                function3.invoke(new i04.c(uiText11));
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar5.r(objY3);
                                }
                                o6e0.i(str, z11, z10, function0, (Function0) objY3, aVar5, 0);
                                if (z10) {
                                    aVar5.N(200486271);
                                    o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                                    aVar5.H();
                                } else {
                                    aVar5.N(200857217);
                                    aVar5.H();
                                }
                                aVar5.s();
                                aVar5.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, (i8 & 14) | 3072, 2);
                    uiText7 = uiText9;
                    uiText6 = uiText8;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    uiText6 = uiText4;
                    uiText7 = uiText5;
                }
                f3 = f2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b5e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            f2 = f;
            if ((i & 805306368) == 0) {
                if (bVarI.A(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            i8 = i3;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i8 & 1, z4)) {
                if (i10 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i11 != 0) {
                    uiText8 = null;
                } else {
                    uiText8 = uiText4;
                }
                if (i4 != 0) {
                    uiText9 = null;
                } else {
                    uiText9 = uiText5;
                }
                if (i6 != 0) {
                    f4 = null;
                } else {
                    f4 = f2;
                }
                final boolean z10 = z3;
                f2 = f4;
                bVar = bVarI;
                dVar2 = dVar3;
                u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                    /* JADX WARN: Type inference failed for: r14v2 */
                    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                    /* JADX WARN: Type inference failed for: r14v4 */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        yka.a.C1350a c1350a;
                        yka.a.b bVar2;
                        ?? r14;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((m75) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d.a aVar3 = d.a.b;
                            d dVarC = c.c(aVar2, aVar3);
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
                            yka.a.b bVar3 = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar3);
                            yka.a.d dVar4 = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar4);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            final boolean z11 = z2;
                            if (z11) {
                                aVar2.N(-730788052);
                                c1350a = c1350a2;
                                bVar2 = bVar3;
                                r14 = 0;
                                h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                                aVar2 = aVar2;
                                aVar2.H();
                            } else {
                                c1350a = c1350a2;
                                bVar2 = bVar3;
                                r14 = 0;
                                aVar2.N(-730344597);
                                aVar2.H();
                            }
                            Unit unit = Unit.a;
                            boolean z12 = z10;
                            boolean zB = aVar2.b(z12);
                            final Function1 function2 = function1;
                            boolean zM = zB | aVar2.M(function2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zM || objY == c0042a) {
                                objY = new o6e0.b(function2, z12, r14);
                                aVar2.r(objY);
                            }
                            xvf.e(aVar2, unit, (Function2) objY);
                            a aVar5 = aVar2;
                            d dVarA = g3w.a(aVar3, z11, new m5e0(), new o5e0(), aVar5, 6, 0);
                            i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                            int iHashCode2 = Long.hashCode(aVar5.m());
                            ne00 ne00VarO2 = aVar5.o();
                            d dVarC2 = c.c(aVar5, dVarA);
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw r14;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar4);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, i78VarA2, bVar2);
                            hlh0.a(aVar5, ne00VarO2, dVar4);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar5, dVarC2, cVar);
                            o6e0.k(z11, aVar5, 0);
                            boolean zM2 = aVar5.M(function2);
                            Object objY2 = aVar5.y();
                            if (zM2 || objY2 == c0042a) {
                                objY2 = new xtx(function2, 1);
                                aVar5.r(objY2);
                            }
                            Function0 function0 = (Function0) objY2;
                            boolean zB2 = aVar5.b(z11) | aVar5.M(function2);
                            final UiText uiText10 = uiText;
                            boolean zM3 = zB2 | aVar5.M(uiText10);
                            Object objY3 = aVar5.y();
                            if (zM3 || objY3 == c0042a) {
                                objY3 = new Function0() { // from class: p5e0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean z13 = z11;
                                        Function1 function3 = function2;
                                        UiText uiText11 = uiText10;
                                        if (z13) {
                                            function3.invoke(new i04.b(uiText11));
                                        } else {
                                            function3.invoke(new i04.c(uiText11));
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar5.r(objY3);
                            }
                            o6e0.i(str, z12, z11, function0, (Function0) objY3, aVar5, 0);
                            if (z11) {
                                aVar5.N(200486271);
                                o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                                aVar5.H();
                            } else {
                                aVar5.N(200857217);
                                aVar5.H();
                            }
                            aVar5.s();
                            aVar5.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, (i8 & 14) | 3072, 2);
                uiText7 = uiText9;
                uiText6 = uiText8;
            } else {
                bVar = bVarI;
                bVar.G();
                uiText6 = uiText4;
                uiText7 = uiText5;
            }
            f3 = f2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: b5e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        uiText5 = uiText3;
        i6 = i2 & 256;
        if (i6 != 0) {
            if ((100663296 & i) == 0) {
                f2 = f;
                if (bVarI.M(f2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((i & 805306368) == 0) {
                if (bVarI.A(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            i8 = i3;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i8 & 1, z4)) {
                if (i10 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i11 != 0) {
                    uiText8 = null;
                } else {
                    uiText8 = uiText4;
                }
                if (i4 != 0) {
                    uiText9 = null;
                } else {
                    uiText9 = uiText5;
                }
                if (i6 != 0) {
                    f4 = null;
                } else {
                    f4 = f2;
                }
                final boolean z11 = z3;
                f2 = f4;
                bVar = bVarI;
                dVar2 = dVar3;
                u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                    /* JADX WARN: Type inference failed for: r14v2 */
                    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                    /* JADX WARN: Type inference failed for: r14v4 */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        yka.a.C1350a c1350a;
                        yka.a.b bVar2;
                        ?? r14;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((m75) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d.a aVar3 = d.a.b;
                            d dVarC = c.c(aVar2, aVar3);
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
                            yka.a.b bVar3 = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar3);
                            yka.a.d dVar4 = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar4);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            final boolean z12 = z2;
                            if (z12) {
                                aVar2.N(-730788052);
                                c1350a = c1350a2;
                                bVar2 = bVar3;
                                r14 = 0;
                                h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                                aVar2 = aVar2;
                                aVar2.H();
                            } else {
                                c1350a = c1350a2;
                                bVar2 = bVar3;
                                r14 = 0;
                                aVar2.N(-730344597);
                                aVar2.H();
                            }
                            Unit unit = Unit.a;
                            boolean z13 = z11;
                            boolean zB = aVar2.b(z13);
                            final Function1 function2 = function1;
                            boolean zM = zB | aVar2.M(function2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zM || objY == c0042a) {
                                objY = new o6e0.b(function2, z13, r14);
                                aVar2.r(objY);
                            }
                            xvf.e(aVar2, unit, (Function2) objY);
                            a aVar5 = aVar2;
                            d dVarA = g3w.a(aVar3, z12, new m5e0(), new o5e0(), aVar5, 6, 0);
                            i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                            int iHashCode2 = Long.hashCode(aVar5.m());
                            ne00 ne00VarO2 = aVar5.o();
                            d dVarC2 = c.c(aVar5, dVarA);
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw r14;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar4);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, i78VarA2, bVar2);
                            hlh0.a(aVar5, ne00VarO2, dVar4);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar5, dVarC2, cVar);
                            o6e0.k(z12, aVar5, 0);
                            boolean zM2 = aVar5.M(function2);
                            Object objY2 = aVar5.y();
                            if (zM2 || objY2 == c0042a) {
                                objY2 = new xtx(function2, 1);
                                aVar5.r(objY2);
                            }
                            Function0 function0 = (Function0) objY2;
                            boolean zB2 = aVar5.b(z12) | aVar5.M(function2);
                            final UiText uiText10 = uiText;
                            boolean zM3 = zB2 | aVar5.M(uiText10);
                            Object objY3 = aVar5.y();
                            if (zM3 || objY3 == c0042a) {
                                objY3 = new Function0() { // from class: p5e0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean z14 = z12;
                                        Function1 function3 = function2;
                                        UiText uiText11 = uiText10;
                                        if (z14) {
                                            function3.invoke(new i04.b(uiText11));
                                        } else {
                                            function3.invoke(new i04.c(uiText11));
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar5.r(objY3);
                            }
                            o6e0.i(str, z13, z12, function0, (Function0) objY3, aVar5, 0);
                            if (z12) {
                                aVar5.N(200486271);
                                o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                                aVar5.H();
                            } else {
                                aVar5.N(200857217);
                                aVar5.H();
                            }
                            aVar5.s();
                            aVar5.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, (i8 & 14) | 3072, 2);
                uiText7 = uiText9;
                uiText6 = uiText8;
            } else {
                bVar = bVarI;
                bVar.G();
                uiText6 = uiText4;
                uiText7 = uiText5;
            }
            f3 = f2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: b5e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 100663296;
        f2 = f;
        if ((i & 805306368) == 0) {
            if (bVarI.A(function1)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        i8 = i3;
        if ((i8 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i8 & 1, z4)) {
            if (i10 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            if (i11 != 0) {
                uiText8 = null;
            } else {
                uiText8 = uiText4;
            }
            if (i4 != 0) {
                uiText9 = null;
            } else {
                uiText9 = uiText5;
            }
            if (i6 != 0) {
                f4 = null;
            } else {
                f4 = f2;
            }
            final boolean z12 = z3;
            f2 = f4;
            bVar = bVarI;
            dVar2 = dVar3;
            u(dVar2, z2 ? null : new g7f(72.0f), pp8.b(-1384618675, new gaj() { // from class: a5e0
                /* JADX WARN: Type inference failed for: r14v2 */
                /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, v1b] */
                /* JADX WARN: Type inference failed for: r14v4 */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yka.a.C1350a c1350a;
                    yka.a.b bVar2;
                    ?? r14;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC = c.c(aVar2, aVar3);
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
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar3);
                        yka.a.d dVar4 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar4);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        final boolean z13 = z2;
                        if (z13) {
                            aVar2.N(-730788052);
                            c1350a = c1350a2;
                            bVar2 = bVar3;
                            r14 = 0;
                            h9n.a(pib0.a(R.drawable.ic__repair, 0, aVar2), null, dw.a(j.i(j.w(new HorizontalAlignElement(ht.a.o), 74.0f), 50.0f), 0.35f), ht.a.h, d0b.a.a, 0.0f, null, aVar2, 27696, 96);
                            aVar2 = aVar2;
                            aVar2.H();
                        } else {
                            c1350a = c1350a2;
                            bVar2 = bVar3;
                            r14 = 0;
                            aVar2.N(-730344597);
                            aVar2.H();
                        }
                        Unit unit = Unit.a;
                        boolean z14 = z12;
                        boolean zB = aVar2.b(z14);
                        final Function1 function2 = function1;
                        boolean zM = zB | aVar2.M(function2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY == c0042a) {
                            objY = new o6e0.b(function2, z14, r14);
                            aVar2.r(objY);
                        }
                        xvf.e(aVar2, unit, (Function2) objY);
                        a aVar5 = aVar2;
                        d dVarA = g3w.a(aVar3, z13, new m5e0(), new o5e0(), aVar5, 6, 0);
                        i78 i78VarA2 = g78.a(kw0.g, ht.a.n, aVar5, 54);
                        int iHashCode2 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO2 = aVar5.o();
                        d dVarC2 = c.c(aVar5, dVarA);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw r14;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar4);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, i78VarA2, bVar2);
                        hlh0.a(aVar5, ne00VarO2, dVar4);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar5, dVarC2, cVar);
                        o6e0.k(z13, aVar5, 0);
                        boolean zM2 = aVar5.M(function2);
                        Object objY2 = aVar5.y();
                        if (zM2 || objY2 == c0042a) {
                            objY2 = new xtx(function2, 1);
                            aVar5.r(objY2);
                        }
                        Function0 function0 = (Function0) objY2;
                        boolean zB2 = aVar5.b(z13) | aVar5.M(function2);
                        final UiText uiText10 = uiText;
                        boolean zM3 = zB2 | aVar5.M(uiText10);
                        Object objY3 = aVar5.y();
                        if (zM3 || objY3 == c0042a) {
                            objY3 = new Function0() { // from class: p5e0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    boolean z15 = z13;
                                    Function1 function3 = function2;
                                    UiText uiText11 = uiText10;
                                    if (z15) {
                                        function3.invoke(new i04.b(uiText11));
                                    } else {
                                        function3.invoke(new i04.c(uiText11));
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar5.r(objY3);
                        }
                        o6e0.i(str, z14, z13, function0, (Function0) objY3, aVar5, 0);
                        if (z13) {
                            aVar5.N(200486271);
                            o6e0.g(uiText8, uiText9, f4, uxsVar, function2, aVar5, 0);
                            aVar5.H();
                        } else {
                            aVar5.N(200857217);
                            aVar5.H();
                        }
                        aVar5.s();
                        aVar5.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i8 & 14) | 3072, 2);
            uiText7 = uiText9;
            uiText6 = uiText8;
        } else {
            bVar = bVarI;
            bVar.G();
            uiText6 = uiText4;
            uiText7 = uiText5;
        }
        f3 = f2;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o6e0.t(dVar2, str, z, uiText, z2, uxsVar, uiText6, uiText7, f3, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void u(d dVar, g7f g7fVar, final op8 op8Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final g7f g7fVar2;
        d dVarI;
        androidx.compose.runtime.b bVarI = aVar.i(-77379180);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 = i3 | 432;
        } else if ((i & 384) == 0) {
            i5 |= bVarI.M(g7fVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            d dVar2 = d.a.b;
            if (i4 != 0) {
                dVar = dVar2;
            }
            g7f g7fVar3 = i6 != 0 ? null : g7fVar;
            d dVarN = dVar.n(dVar2);
            if (g7fVar3 != null && (dVarI = j.i(dVar2, g7fVar3.a)) != null) {
                dVar2 = dVarI;
            }
            d dVarN2 = dVarN.n(dVar2);
            qyd0 qyd0Var = cst.e;
            long j = ((ast) bVarI.O(qyd0Var)).r;
            qyd0 qyd0Var2 = ajb0.a;
            d dVarA = d35.a(androidx.compose.foundation.a.b(dVarN2, j, j060.c(((zib0) bVarI.O(qyd0Var2)).d)), 0.5f, ((ast) bVarI.O(qyd0Var)).s, j060.c(((zib0) bVarI.O(qyd0Var2)).d));
            int i7 = i5 & 7168;
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            op8Var.invoke(androidx.compose.foundation.layout.d.a, bVarI, Integer.valueOf(((i7 >> 6) & 112) | 6));
            bVarI.X(true);
            g7fVar2 = g7fVar3;
        } else {
            bVarI.G();
            g7fVar2 = g7fVar;
        }
        final d dVar3 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o6e0.u(dVar3, g7fVar2, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void v(final int i, final int i2, androidx.compose.runtime.a aVar, final boolean z) {
        int i3;
        androidx.compose.runtime.b bVar;
        kw0.e iVar;
        String strA;
        androidx.compose.runtime.b bVarI = aVar.i(242651448);
        if ((i2 & 6) == 0) {
            i3 = i2 | (bVarI.b(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            if (z) {
                bVarI.N(1259814646);
                iVar = new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0());
                bVarI.X(false);
            } else {
                bVarI.N(1259816164);
                bVarI.X(false);
                iVar = kw0.g;
            }
            d160 d160VarA = b160.a(iVar, ht.a.l, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            String strValueOf = String.valueOf(i);
            long jM = mla.m(z ? 40 : 48, bVarI);
            t9i t9iVar = t9i.E;
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).o;
            mjm mjmVar = mt.a;
            lkf0.d(strValueOf, g3w.h(new WithAlignmentLineElement(mjmVar), "current_streak_count"), j, null, jM, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1572864, 0, 262056);
            if (i > 1) {
                bVarI.N(252696315);
                strA = cb40.a(R.string.common_dates__days, new Object[0], bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(252776636);
                strA = cb40.a(R.string.common_dates__day, new Object[0], bVarI);
                bVarI.X(false);
            }
            lkf0.d(strA, new WithAlignmentLineElement(mjmVar), ((lib0) bVarI.O(qyd0Var)).o, null, mla.m(z ? 12 : 20, bVarI), null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1572864, 0, 262056);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t5e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    o6e0.v(i, iA, (a) obj, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar) {
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(1808660778);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i & 1, z)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarR = j.r(aVar2, 16.0f);
            crz crzVarA = pib0.a(R.drawable.ic__rocket, 0, bVarI);
            qyd0 qyd0Var = oib0.a;
            h6n.b(crzVarA, QWvyvNzGsBpRT.xIolJ, dVarR, ((lib0) bVarI.O(qyd0Var)).a0, bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_loyalty__streak_boost, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new i5e0();
        }
    }
}
