package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dpo {

    public static final class a implements aiv {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ niv b;
        public final /* synthetic */ twa c;
        public final /* synthetic */ ytw d;

        /* JADX INFO: renamed from: dpo$a$a, reason: collision with other inner class name */
        public static final class C0498a extends qlr implements Function1<y.a, Unit> {
            public final /* synthetic */ niv a;
            public final /* synthetic */ List b;
            public final /* synthetic */ LinkedHashMap c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0498a(niv nivVar, List list, LinkedHashMap linkedHashMap) {
                super(1);
                this.a = nivVar;
                this.b = list;
                this.c = linkedHashMap;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(y.a aVar) {
                List<? extends vhv> list = this.b;
                LinkedHashMap linkedHashMap = this.c;
                this.a.e(aVar, list, linkedHashMap);
                return Unit.a;
            }
        }

        public a(ytw ytwVar, niv nivVar, twa twaVar, ytw ytwVar2) {
            this.a = ytwVar;
            this.b = nivVar;
            this.c = twaVar;
            this.d = ytwVar2;
        }

        @Override // defpackage.aiv
        public final biv c(t tVar, List<? extends vhv> list, long j) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.a.getValue();
            long jF = this.b.f(j, tVar.getLayoutDirection(), this.c, list, linkedHashMap);
            this.d.getValue();
            return t.z1(tVar, (int) (jF >> 32), (int) (jF & 4294967295L), new C0498a(this.b, list, linkedHashMap));
        }
    }

    public static final class b extends qlr implements Function0<Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ twa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ytw ytwVar, twa twaVar) {
            super(0);
            this.a = ytwVar;
            this.b = twaVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ytw ytwVar = this.a;
            ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
            this.b.d = true;
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<pb80, Unit> {
        public final /* synthetic */ niv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(niv nivVar) {
            super(1);
            this.a = nivVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            b0g0.a(pb80Var, this.a);
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ nwa b;
        public final /* synthetic */ Function0 c;
        public final /* synthetic */ epo d;
        public final /* synthetic */ Function1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ytw ytwVar, nwa nwaVar, Function0 function0, epo epoVar, Function1 function1) {
            super(2);
            this.a = ytwVar;
            this.b = nwaVar;
            this.c = function0;
            this.d = epoVar;
            this.e = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) throws Throwable {
            boo booVar;
            n54 n54Var;
            float f;
            androidx.compose.runtime.a.C0041a.C0042a c0042a;
            androidx.compose.ui.d.a aVar2;
            float f2;
            Throwable th;
            String strA;
            tsr.a aVar3;
            yka.a.C1350a c1350a;
            yka.a.d dVar;
            yka.a.c cVar;
            f160 f160Var;
            yka.a.C1350a c1350a2;
            yka.a.b bVar;
            tsr.a aVar4;
            yka.a.d dVar2;
            yka.a.c cVar2;
            boolean z;
            androidx.compose.ui.d.a aVar5;
            tsr.a aVar6;
            yka.a.b bVar2;
            yka.a.C1350a c1350a3;
            kw0.j jVar;
            yka.a.d dVar3;
            yka.a.c cVar3;
            yka.a.C1350a c1350a4;
            tsr.a aVar7;
            boo booVar2;
            n54.b bVar3;
            int i;
            tsr.a aVar8;
            yka.a.C1350a c1350a5;
            tsr.a aVar9;
            yka.a.C1350a c1350a6;
            String strA2;
            androidx.compose.runtime.a aVar10 = aVar;
            if ((num.intValue() & 3) == 2 && aVar10.j()) {
                aVar10.G();
            } else {
                this.a.setValue(Unit.a);
                nwa nwaVar = this.b;
                int i2 = nwaVar.b;
                nwa nwaVar2 = nwa.this;
                cwa cwaVarE = nwaVar2.e();
                cwa cwaVarE2 = nwaVar2.e();
                epo epoVar = this.d;
                Integer num2 = epoVar.a;
                boo booVar3 = epoVar.j;
                androidx.compose.ui.d.a aVar11 = androidx.compose.ui.d.a.b;
                n54 n54Var2 = ht.a.f;
                n54 n54Var3 = ht.a.a;
                androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
                if (num2 == null) {
                    aVar10.N(-2062830049);
                    aVar10.H();
                    booVar = booVar3;
                    aVar2 = aVar11;
                    f2 = 1.0f;
                    n54Var = n54Var2;
                    c0042a = c0042a2;
                    f = 0.0f;
                    th = null;
                } else {
                    aVar10.N(-2062830048);
                    int iIntValue = num2.intValue();
                    boolean zM = aVar10.M(cwaVarE2);
                    Object objY = aVar10.y();
                    if (zM || objY == c0042a2) {
                        objY = new e(cwaVarE2);
                        aVar10.r(objY);
                    }
                    androidx.compose.ui.d dVarD = nwa.d(aVar11, cwaVarE, (Function1) objY);
                    aiv aivVarC = g75.c(n54Var3, false);
                    int iHashCode = Long.hashCode(aVar10.m());
                    ne00 ne00VarO = aVar10.o();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar10, dVarD);
                    yka.k.getClass();
                    tsr.a aVar12 = yka.a.b;
                    if (aVar10.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar10.D();
                    if (aVar10.g()) {
                        aVar10.F(aVar12);
                    } else {
                        aVar10.p();
                    }
                    hlh0.a(aVar10, aivVarC, yka.a.f);
                    hlh0.a(aVar10, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a7 = yka.a.g;
                    if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar10, iHashCode, c1350a7);
                    }
                    hlh0.a(aVar10, dVarC, yka.a.d);
                    booVar = booVar3;
                    n54Var = n54Var2;
                    f = 0.0f;
                    c0042a = c0042a2;
                    aVar2 = aVar11;
                    f2 = 1.0f;
                    mw90.a(pwo.e(iIntValue, aVar10), "Watermark", dw.a(androidx.compose.foundation.layout.d.a.b(j.c(aVar11, 1.0f), n54Var2), 0.2f), null, null, null, null, aVar10, 48, 2040);
                    aVar10 = aVar10;
                    androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
                    long j = j58.b;
                    th = null;
                    g75.a(androidx.compose.foundation.a.a(dVarE, new hfs(kotlin.collections.b.k(new j58(j58.c(0.6f, j)), new j58(j58.c(0.0f, j))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0), null, 0.0f, 6), aVar10, 6);
                    aVar10.s();
                    aVar10.H();
                }
                Object objY2 = aVar10.y();
                if (objY2 == c0042a) {
                    objY2 = f.a;
                    aVar10.r(objY2);
                }
                androidx.compose.ui.d dVarG = j.g(h.j(h.h(nwa.d(aVar2, cwaVarE2, (Function1) objY2), 28.0f, f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), f2);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar10, 0);
                int iHashCode2 = Long.hashCode(aVar10.m());
                ne00 ne00VarO2 = aVar10.o();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar10, dVarG);
                yka.k.getClass();
                tsr.a aVar13 = yka.a.b;
                if (aVar10.k() == null) {
                    Throwable th2 = th;
                    l2a.b();
                    throw th2;
                }
                aVar10.D();
                if (aVar10.g()) {
                    aVar10.F(aVar13);
                } else {
                    aVar10.p();
                }
                yka.a.b bVar4 = yka.a.f;
                hlh0.a(aVar10, i78VarA, bVar4);
                yka.a.d dVar4 = yka.a.e;
                hlh0.a(aVar10, ne00VarO2, dVar4);
                yka.a.C1350a c1350a8 = yka.a.g;
                if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode2))) {
                    j3c.a(iHashCode2, aVar10, iHashCode2, c1350a8);
                }
                yka.a.c cVar4 = yka.a.d;
                hlh0.a(aVar10, dVarC2, cVar4);
                androidx.compose.ui.d dVarK = j.k(j.g(aVar2, f2), 21.0f, f, 2);
                kw0.j jVar2 = kw0.a;
                n54.b bVar5 = ht.a.k;
                d160 d160VarA = b160.a(jVar2, bVar5, aVar10, 48);
                int iHashCode3 = Long.hashCode(aVar10.m());
                ne00 ne00VarO3 = aVar10.o();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar10, dVarK);
                if (aVar10.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar10.D();
                if (aVar10.g()) {
                    aVar10.F(aVar13);
                } else {
                    aVar10.p();
                }
                hlh0.a(aVar10, d160VarA, bVar4);
                hlh0.a(aVar10, ne00VarO3, dVar4);
                if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode3))) {
                    j3c.a(iHashCode3, aVar10, iHashCode3, c1350a8);
                }
                hlh0.a(aVar10, dVarC3, cVar4);
                f160 f160Var2 = f160.a;
                androidx.compose.ui.d dVarA = f160Var2.a(f2, aVar2, true);
                Integer num3 = epoVar.b;
                if (num3 == null) {
                    aVar10.N(-909808086);
                    aVar10.H();
                    strA = null;
                } else {
                    aVar10.N(-909808085);
                    strA = cb40.a(num3.intValue(), new Object[0], aVar10);
                    aVar10.H();
                }
                if (strA == null) {
                    strA = "";
                }
                androidx.compose.runtime.a aVar14 = aVar10;
                androidx.compose.ui.d.a aVar15 = aVar2;
                androidx.compose.runtime.a.C0041a.C0042a c0042a3 = c0042a;
                boo booVar4 = booVar;
                lkf0.d(strA, dVarA, fjb0.b(aVar10).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar10).p, aVar14, 0, 0, 131064);
                lkf0.d(epoVar.e, null, fjb0.b(aVar14).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar14).p, aVar14, 0, 0, 131066);
                androidx.compose.runtime.a aVar16 = aVar14;
                aVar16.s();
                androidx.compose.ui.d dVarJ = h.j(j.g(aVar15, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                d160 d160VarA2 = b160.a(kw0.g, bVar5, aVar16, 54);
                int iHashCode4 = Long.hashCode(aVar16.m());
                ne00 ne00VarO4 = aVar16.o();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar16, dVarJ);
                if (aVar16.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar16.D();
                if (aVar16.g()) {
                    aVar3 = aVar13;
                    aVar16.F(aVar3);
                } else {
                    aVar3 = aVar13;
                    aVar16.p();
                }
                hlh0.a(aVar16, d160VarA2, bVar4);
                hlh0.a(aVar16, ne00VarO4, dVar4);
                if (aVar16.g() || !Intrinsics.g(aVar16.y(), Integer.valueOf(iHashCode4))) {
                    c1350a = c1350a8;
                    j3c.a(iHashCode4, aVar16, iHashCode4, c1350a);
                } else {
                    c1350a = c1350a8;
                }
                hlh0.a(aVar16, dVarC4, cVar4);
                Integer num4 = epoVar.f;
                if (num4 == null) {
                    aVar16.N(-178761122);
                    aVar16.H();
                    dVar = dVar4;
                    cVar = cVar4;
                } else {
                    aVar16.N(-178761121);
                    crz crzVarA = erz.a(num4.intValue(), 0, aVar16);
                    androidx.compose.ui.d dVarR = j.r(h.j(aVar15, 0.0f, 0.0f, 4.0f, 0.0f, 11), 16.0f);
                    long j2 = fjb0.b(aVar16).o;
                    aVar16 = aVar16;
                    dVar = dVar4;
                    cVar = cVar4;
                    h6n.b(crzVarA, "Sport icon", dVarR, j2, aVar16, 432, 0);
                    aVar16.H();
                }
                UiText uiText = epoVar.g;
                if (uiText == null) {
                    aVar16.N(-178316272);
                    aVar16.H();
                    f160Var = f160Var2;
                    dVar2 = dVar;
                    c1350a2 = c1350a;
                    cVar2 = cVar;
                    aVar4 = aVar3;
                    bVar = bVar4;
                } else {
                    aVar16.N(-178316271);
                    androidx.compose.ui.d dVarA2 = f160Var2.a(1.0f, aVar15, true);
                    aiv aivVarC2 = g75.c(n54Var3, false);
                    int iHashCode5 = Long.hashCode(aVar16.m());
                    ne00 ne00VarO5 = aVar16.o();
                    androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar16, dVarA2);
                    if (aVar16.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar16.D();
                    if (aVar16.g()) {
                        aVar16.F(aVar3);
                    } else {
                        aVar16.p();
                    }
                    hlh0.a(aVar16, aivVarC2, bVar4);
                    hlh0.a(aVar16, ne00VarO5, dVar);
                    if (aVar16.g() || !Intrinsics.g(aVar16.y(), Integer.valueOf(iHashCode5))) {
                        j3c.a(iHashCode5, aVar16, iHashCode5, c1350a);
                    }
                    hlh0.a(aVar16, dVarC5, cVar);
                    androidx.compose.runtime.a aVar17 = aVar16;
                    f160Var = f160Var2;
                    c1350a2 = c1350a;
                    bVar = bVar4;
                    aVar4 = aVar3;
                    dVar2 = dVar;
                    cVar2 = cVar;
                    lkf0.d(uiText.g((Context) aVar16.O(AndroidCompositionLocals_androidKt.b)), null, fjb0.b(aVar16).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar16).f, aVar17, 0, 0, 131066);
                    aVar16 = aVar17;
                    aVar16.s();
                    aVar16.H();
                }
                epo.a aVar18 = epoVar.h;
                if (aVar18 == null) {
                    aVar16.N(-177927935);
                    aVar16.H();
                    aVar5 = aVar15;
                    z = false;
                } else {
                    aVar16.N(-177927934);
                    z = false;
                    aVar5 = r13;
                    h6n.b(erz.a(aVar18.a, 0, aVar16), "Won icon", j.r(h.j(r13, 0.0f, 0.0f, 2.0f, 0.0f, 11), 22.0f), c68.a(aVar18.b, aVar16), aVar16, 432, 0);
                    aVar16.H();
                }
                ColoredUiText coloredUiText = epoVar.i;
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                androidx.compose.runtime.a aVar19 = aVar16;
                androidx.compose.ui.d.a aVar20 = aVar5;
                lkf0.e(coloredUiText.a((Context) aVar16.O(qyd0Var)), g3w.h(aVar5, "ticket_info_cell_result_text"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fjb0.e(aVar16).f, aVar19, 48, 0, 262140);
                androidx.compose.runtime.a aVar21 = aVar19;
                aVar21.s();
                if (booVar4 == null) {
                    aVar21.N(-1784308081);
                    aVar21.H();
                    booVar2 = booVar4;
                    jVar = jVar2;
                    aVar7 = aVar4;
                    bVar2 = bVar;
                    dVar3 = dVar2;
                    c1350a4 = c1350a2;
                    cVar3 = cVar2;
                    bVar3 = bVar5;
                    i = 0;
                } else {
                    aVar21.N(-1784308080);
                    androidx.compose.ui.d dVarJ2 = h.j(j.g(aVar20, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    d160 d160VarA3 = b160.a(jVar2, r12, aVar21, 48);
                    int iHashCode6 = Long.hashCode(aVar21.m());
                    ne00 ne00VarO6 = aVar21.o();
                    androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar21, dVarJ2);
                    if (aVar21.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar21.D();
                    if (aVar21.g()) {
                        aVar6 = aVar4;
                        aVar21.F(aVar6);
                    } else {
                        aVar6 = aVar4;
                        aVar21.p();
                    }
                    bVar2 = bVar;
                    hlh0.a(aVar21, d160VarA3, bVar2);
                    yka.a.d dVar5 = dVar2;
                    hlh0.a(aVar21, ne00VarO6, dVar5);
                    if (aVar21.g() || !Intrinsics.g(aVar21.y(), Integer.valueOf(iHashCode6))) {
                        c1350a3 = c1350a2;
                        j3c.a(iHashCode6, aVar21, iHashCode6, c1350a3);
                    } else {
                        c1350a3 = c1350a2;
                    }
                    yka.a.c cVar5 = cVar2;
                    hlh0.a(aVar21, dVarC6, cVar5);
                    jVar = jVar2;
                    if (booVar4 instanceof zno) {
                        aVar21.N(-288374040);
                        c1350a4 = c1350a3;
                        aVar7 = aVar6;
                        dVar3 = dVar5;
                        cVar3 = cVar5;
                        h9n.a(erz.a(R.drawable.ic_flexible_active, 0, aVar21), "Insure icon", null, null, null, 0.0f, null, aVar21, 48, 124);
                        bVar3 = r12;
                        booVar2 = booVar4;
                        lkf0.d(uch0.a(((zno) booVar4).a, aVar21), h.f(aVar20, 4.0f), fjb0.b(aVar21).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar21).n, aVar21, 48, 0, 131064);
                        aVar21 = aVar21;
                        aVar21.H();
                        i = 0;
                    } else {
                        dVar3 = dVar5;
                        cVar3 = cVar5;
                        c1350a4 = c1350a3;
                        aVar7 = aVar6;
                        booVar2 = booVar4;
                        bVar3 = r12;
                        if (!(booVar2 instanceof aoo)) {
                            throw rg.a(-1671872737, aVar21);
                        }
                        aVar21.N(-287721459);
                        i = 0;
                        h6n.b(erz.a(((aoo) booVar2).a, 0, aVar21), "Insure icon", null, c68.a(R.color.custom_brand_secondary_variable_type3_type1, aVar21), aVar21, 48, 4);
                        aVar21.H();
                    }
                    aVar21.s();
                    aVar21.H();
                }
                androidx.compose.ui.d dVarJ3 = h.j(j.g(r0, 1.0f), 0.0f, booVar2 == null ? 12.0f : 8.0f, 0.0f, 0.0f, 13);
                n54.b bVar6 = bVar3;
                d160 d160VarA4 = b160.a(jVar, bVar6, aVar21, 48);
                int iHashCode7 = Long.hashCode(aVar21.m());
                ne00 ne00VarO7 = aVar21.o();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(aVar21, dVarJ3);
                if (aVar21.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar21.D();
                if (aVar21.g()) {
                    aVar8 = aVar7;
                    aVar21.F(aVar8);
                } else {
                    aVar8 = aVar7;
                    aVar21.p();
                }
                yka.a.b bVar7 = bVar2;
                hlh0.a(aVar21, d160VarA4, bVar7);
                yka.a.d dVar6 = dVar3;
                hlh0.a(aVar21, ne00VarO7, dVar6);
                if (aVar21.g() || !Intrinsics.g(aVar21.y(), Integer.valueOf(iHashCode7))) {
                    c1350a5 = c1350a4;
                    j3c.a(iHashCode7, aVar21, iHashCode7, c1350a5);
                } else {
                    c1350a5 = c1350a4;
                }
                yka.a.c cVar6 = cVar3;
                hlh0.a(aVar21, dVarC7, cVar6);
                androidx.compose.runtime.a aVar22 = aVar21;
                yka.a.C1350a c1350a9 = c1350a5;
                tsr.a aVar23 = aVar8;
                lkf0.d(cb40.a(R.string.bet_history__total_return, new Object[i], aVar21), null, fjb0.b(aVar21).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar21).l, aVar22, 0, 0, 131066);
                androidx.compose.ui.d dVarA3 = f160Var.a(1.0f, aVar20, true);
                aiv aivVarC3 = g75.c(n54Var, false);
                int iHashCode8 = Long.hashCode(aVar22.m());
                ne00 ne00VarO8 = aVar22.o();
                androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(aVar22, dVarA3);
                if (aVar22.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar22.D();
                if (aVar22.g()) {
                    aVar9 = aVar23;
                    aVar22.F(aVar9);
                } else {
                    aVar9 = aVar23;
                    aVar22.p();
                }
                hlh0.a(aVar22, aivVarC3, bVar7);
                hlh0.a(aVar22, ne00VarO8, dVar6);
                if (aVar22.g() || !Intrinsics.g(aVar22.y(), Integer.valueOf(iHashCode8))) {
                    c1350a6 = c1350a9;
                    j3c.a(iHashCode8, aVar22, iHashCode8, c1350a6);
                } else {
                    c1350a6 = c1350a9;
                }
                hlh0.a(aVar22, dVarC8, cVar6);
                yka.a.C1350a c1350a10 = c1350a6;
                tsr.a aVar24 = aVar9;
                lkf0.e(epoVar.k.a((Context) aVar22.O(qyd0Var)), g3w.h(aVar20, "ticket_info_cell_total_return_text"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fjb0.e(aVar22).d, aVar22, 48, 0, 262140);
                aVar22.s();
                aVar22.s();
                ute.b(h.j(j.g(aVar20, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), fjb0.a(aVar22).a, fjb0.b(aVar22).F, aVar22, 6, 0);
                dpo.a(cb40.a(R.string.bet_history__total_stake, new Object[0], aVar22), epoVar.l, "ticket_info_cell_total_stake_text", aVar22, 384);
                UiText uiText2 = epoVar.n;
                if (uiText2 == null) {
                    aVar22.N(-1781424213);
                    aVar22.H();
                } else {
                    aVar22.N(-1781424212);
                    UiText uiText3 = epoVar.m;
                    if (uiText3 == null) {
                        aVar22.N(1680063548);
                        aVar22.H();
                        strA2 = null;
                    } else {
                        aVar22.N(-1331277723);
                        strA2 = uch0.a(uiText3, aVar22);
                        aVar22.H();
                    }
                    dpo.a(strA2, uch0.a(uiText2, aVar22), "ticket_info_cell_gift_amount_text", aVar22, 384);
                    aVar22.H();
                }
                String str = epoVar.o;
                if (str == null) {
                    aVar22.N(-1781115174);
                    aVar22.H();
                } else {
                    aVar22.N(-1781115173);
                    dpo.a(cb40.a(R.string.common_functions__total_odds, new Object[0], aVar22), str, "ticket_info_cell_total_odds_text", aVar22, 384);
                    aVar22.H();
                }
                String str2 = epoVar.p;
                if (str2 == null) {
                    aVar22.N(-1780788837);
                    aVar22.H();
                } else {
                    aVar22.N(-1780788836);
                    dpo.a(cb40.a(R.string.bet_history__total_bonus, new Object[0], aVar22), str2, "ticket_info_cell_total_bonus_text", aVar22, 384);
                    aVar22.H();
                }
                UiText uiText4 = epoVar.q;
                if (uiText4 == null) {
                    aVar22.N(-1780456889);
                    aVar22.H();
                } else {
                    aVar22.N(-1780456888);
                    dpo.a(cb40.a(R.string.bet_history__wh_tax, new Object[0], aVar22), uch0.a(uiText4, aVar22), "ticket_info_cell_withholding_tax_text", aVar22, 384);
                    aVar22.H();
                }
                androidx.compose.ui.d dVarG2 = j.g(aVar20, 1.0f);
                Function1 function1 = this.e;
                boolean zM2 = aVar22.M(function1) | aVar22.A(epoVar);
                Object objY3 = aVar22.y();
                if (zM2 || objY3 == c0042a3) {
                    objY3 = new g(function1, epoVar);
                    aVar22.r(objY3);
                }
                androidx.compose.ui.d dVarH = h.h(androidx.compose.foundation.d.d(dVarG2, false, null, null, (Function0) objY3, 15), 0.0f, 8.0f, 1);
                d160 d160VarA5 = b160.a(kw0.e, bVar6, aVar22, 54);
                int iHashCode9 = Long.hashCode(aVar22.m());
                ne00 ne00VarO9 = aVar22.o();
                androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(aVar22, dVarH);
                if (aVar22.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar22.D();
                if (aVar22.g()) {
                    aVar22.F(aVar24);
                } else {
                    aVar22.p();
                }
                hlh0.a(aVar22, d160VarA5, bVar7);
                hlh0.a(aVar22, ne00VarO9, dVar6);
                if (aVar22.g() || !Intrinsics.g(aVar22.y(), Integer.valueOf(iHashCode9))) {
                    j3c.a(iHashCode9, aVar22, iHashCode9, c1350a10);
                }
                hlh0.a(aVar22, dVarC9, cVar6);
                lkf0.d(uch0.a(epoVar.c, aVar22), g3w.h(aVar20, "ticket_info_cell_ticket_number_text"), fjb0.b(aVar22).y, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(fjb0.e(aVar22).o, 0L, 0L, null, null, null, 0L, yef0.c, null, null, 0, 0L, null, null, 16773119), aVar22, 48, 0, 131064);
                ty0.a(aVar22, j.r(aVar20, 4.0f));
                h6n.b(erz.a(R.drawable.ic__open_it, 0, aVar22), null, j.r(aVar20, 12.0f), fjb0.b(aVar22).y, aVar22, 432, 0);
                aVar22.s();
                aVar22.s();
                aVar22.H();
                if (nwaVar.b != i2) {
                    use useVar = xvf.a;
                    aVar22.t(this.c);
                }
            }
            return Unit.a;
        }
    }

    public static final class e implements Function1<bwa, Unit> {
        public final /* synthetic */ cwa a;

        public e(cwa cwaVar) {
            this.a = cwaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            bwaVar2.h(new gqe("spread"));
            bwaVar2.e(new gqe("spread"));
            gxa gxaVar = bwaVar2.d;
            cwa cwaVar = this.a;
            u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
            njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class f implements Function1<bwa, Unit> {
        public static final f a = new f();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            gxa gxaVar = bwaVar2.d;
            cwa cwaVar = bwaVar2.c;
            u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
            njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class g implements Function0<Unit> {
        public final /* synthetic */ Function1<String, Unit> a;
        public final /* synthetic */ epo b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super String, Unit> function1, epo epoVar) {
            this.a = function1;
            this.b = epoVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke(this.b.d);
            return Unit.a;
        }
    }

    public static final void a(final String str, String str2, final String str3, androidx.compose.runtime.a aVar, final int i) {
        final String str4;
        androidx.compose.runtime.b bVar;
        int i2;
        androidx.compose.ui.d.a aVar2;
        androidx.compose.runtime.b bVar2;
        androidx.compose.runtime.b bVarI = aVar.i(2112839213);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarK = j.k(h.j(j.g(aVar3, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 21.0f, 0.0f, 2);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new bpo(0);
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = xa80.b(dVarK, false, (Function1) objY);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (str == null) {
                bVarI.N(1870141607);
                bVarI.X(false);
                bVar2 = bVarI;
                i2 = i3;
                aVar2 = aVar3;
            } else {
                bVarI.N(1870141608);
                i2 = i3;
                aVar2 = aVar3;
                lkf0.d(str, null, ((lib0) bVarI.O(oib0.a)).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).l, bVarI, 0, 0, 131066);
                bVar2 = bVarI;
                bVar2.X(false);
            }
            ty0.a(bVar2, new LayoutWeightElement(1.0f, true));
            androidx.compose.runtime.b bVar3 = bVar2;
            str4 = str2;
            lkf0.d(str4, g3w.h(aVar2, str3), ((lib0) bVar2.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVar2.O(kjb0.a)).j, bVar3, (i2 >> 3) & 14, 0, 131064);
            bVar = bVar3;
            bVar.X(true);
        } else {
            str4 = str2;
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str4, str3, i) { // from class: cpo
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    dpo.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(epo epoVar, Function1<? super String, Unit> function1, androidx.compose.runtime.a aVar, int i) {
        epo epoVar2;
        Function1<? super String, Unit> function2;
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2038523603);
        int i2 = (bVarI.M(epoVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.ui.d.a.b, ((lib0) bVarI.O(oib0.a)).b1, zk40.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new apo();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
            i0b.a(bVarI, -1003410150, 212064437, false);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzj.a(mmdVar, bVarI);
            }
            niv nivVar = (niv) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = pzj.a(bVarI);
            }
            nwa nwaVar = (nwa) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar = (ytw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = qzj.a(nwaVar, bVarI);
            }
            twa twaVar = (twa) objY5;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = m.a(Unit.a, epx.a);
                bVarI.r(objY6);
            }
            ytw ytwVar2 = (ytw) objY6;
            boolean zA = bVarI.A(nivVar) | bVarI.d(257);
            Object objY7 = bVarI.y();
            if (zA || objY7 == c0042a) {
                objY7 = new a(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(objY7);
            }
            aiv aivVar = (aiv) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a) {
                objY8 = new b(ytwVar, twaVar);
                bVarI.r(objY8);
            }
            Function0 function0 = (Function0) objY8;
            boolean zA2 = bVarI.A(nivVar);
            Object objY9 = bVarI.y();
            if (zA2 || objY9 == c0042a) {
                objY9 = new c(nivVar);
                bVarI.r(objY9);
            }
            epoVar2 = epoVar;
            function2 = function1;
            lsr.a(xa80.b(dVarB2, false, (Function1) objY9), pp8.b(1200550679, new d(ytwVar2, nwaVar, function0, epoVar2, function2), bVarI), aivVar, bVarI, 48);
            bVarI.X(false);
        } else {
            epoVar2 = epoVar;
            function2 = function1;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new n46(epoVar2, function2, i);
        }
    }
}
