package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ps4 {

    @c0d(c = "com.sportygames.component.vault.modal.BonusVaultConfirmationComponentKt$BonusVaultConfirmationComponent$1$1", f = "BonusVaultConfirmationComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ cnj a;
        public final /* synthetic */ ytw<Boolean> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function1<nt4, Unit> d;
        public final /* synthetic */ nt4 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(cnj cnjVar, ytw<Boolean> ytwVar, Function0<Unit> function0, Function1<? super nt4, Unit> function1, nt4 nt4Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = cnjVar;
            this.b = ytwVar;
            this.c = function0;
            this.d = function1;
            this.e = nt4Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int iOrdinal = this.a.ordinal();
            ytw<Boolean> ytwVar = this.b;
            if (iOrdinal == 1) {
                ytwVar.setValue(Boolean.TRUE);
            } else if (iOrdinal == 2) {
                ytwVar.setValue(Boolean.FALSE);
                this.c.invoke();
                this.d.invoke(this.e);
            } else if (iOrdinal == 3) {
                ytwVar.setValue(Boolean.FALSE);
            }
            return Unit.a;
        }
    }

    public static final void a(final nt4 nt4Var, final cnj cnjVar, final Function1<? super nt4, Unit> function1, final Function1<? super nt4, Unit> function2, final Function0<Unit> function0, final Function1<? super String, String> function3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        ytw ytwVar;
        nt4Var.getClass();
        cnjVar.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function3.getClass();
        b bVarI = aVar.i(1771764817);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(nt4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.d(cnjVar.ordinal()) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function0) ? 16384 : 8192;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar2 = (ytw) objY;
            boolean z = ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | ((i3 & 14) == 4);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                ytwVar = ytwVar2;
                a aVar2 = new a(cnjVar, ytwVar, function0, function2, nt4Var, null);
                bVarI.r(aVar2);
                objY2 = aVar2;
            } else {
                ytwVar = ytwVar2;
            }
            xvf.e(bVarI, cnjVar, (Function2) objY2);
            final ytw ytwVar3 = ytwVar;
            u60.a(function0, new yle(false, false, 3), pp8.b(-627257944, new Function2() { // from class: ls4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    tsr.a aVar3;
                    yka.a.C1350a c1350a;
                    a aVar4;
                    a aVar5 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar6 = d.a.b;
                        d dVarE = j.e(aVar6, 1.0f);
                        aiv aivVarC = g75.c(ht.a.h, false);
                        int iHashCode = Long.hashCode(aVar5.m());
                        ne00 ne00VarO = aVar5.o();
                        d dVarC = c.c(aVar5, dVarE);
                        yka.k.getClass();
                        tsr.a aVar7 = yka.a.b;
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar7);
                        } else {
                            aVar5.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar5, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar5, ne00VarO, dVar);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar5, iHashCode, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar5, dVarC, cVar);
                        d dVarA = j.A(j.g(aVar6, 1.0f), null, 3);
                        n54.a aVar8 = ht.a.m;
                        kw0.k kVar = kw0.c;
                        i78 i78VarA = g78.a(kVar, aVar8, aVar5, 0);
                        int iHashCode2 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO2 = aVar5.o();
                        d dVarC2 = c.c(aVar5, dVarA);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar7);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, i78VarA, bVar);
                        hlh0.a(aVar5, ne00VarO2, dVar);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar5, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar5, dVarC2, cVar);
                        long j = j58.f;
                        zk40.a aVar9 = zk40.a;
                        d dVarG = j.g(androidx.compose.foundation.a.b(aVar6, j, aVar9), 1.0f);
                        i78 i78VarA2 = g78.a(kVar, ht.a.n, aVar5, 48);
                        int iHashCode3 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO3 = aVar5.o();
                        d dVarC3 = c.c(aVar5, dVarG);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar7);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, i78VarA2, bVar);
                        hlh0.a(aVar5, ne00VarO3, dVar);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar5, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar5, dVarC3, cVar);
                        ty0.a(aVar5, j.i(aVar6, 16.0f));
                        ks4[] ks4VarArr = ks4.a;
                        Function1 function4 = function3;
                        String str = (String) function4.invoke("bonus_vault_play_game");
                        nt4 nt4Var2 = nt4Var;
                        String strP = kotlin.text.c.p(str, "{gameName}", nt4Var2.a, false);
                        long j2 = j58.b;
                        t9i t9iVar = t9i.v;
                        lkf0.b(strP, null, j2, i7f.b(22.0f, aVar5), null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar5, 196992, 0, 130514);
                        ty0.a(aVar5, j.i(aVar6, 12.0f));
                        lkf0.b((String) function4.invoke("bonus_vault_choose_one_game"), j.g(aVar6, 0.9f), j2, i7f.b(16.0f, aVar5), null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar5, 197040, 0, 130512);
                        ty0.a(aVar5, j.i(aVar6, 16.0f));
                        aVar5.s();
                        d dVarI = j.i(j.g(aVar6, 1.0f), 50.0f);
                        d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar5, 0);
                        int iHashCode4 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO4 = aVar5.o();
                        d dVarC4 = c.c(aVar5, dVarI);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar3 = aVar7;
                            aVar5.F(aVar3);
                        } else {
                            aVar3 = aVar7;
                            aVar5.p();
                        }
                        hlh0.a(aVar5, d160VarA, bVar);
                        hlh0.a(aVar5, ne00VarO4, dVar);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                            c1350a = c1350a2;
                            j3c.a(iHashCode4, aVar5, iHashCode4, c1350a);
                        } else {
                            c1350a = c1350a2;
                        }
                        hlh0.a(aVar5, dVarC4, cVar);
                        d dVarC5 = j.c(aVar6, 1.0f);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarB = androidx.compose.foundation.a.b(dVarC5.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), r58.d(4281678405L), aVar9);
                        Function0 function5 = function0;
                        boolean zM = aVar5.M(function5);
                        Object objY3 = aVar5.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM || objY3 == c0042a2) {
                            objY3 = new ns4(function5, 0);
                            aVar5.r(objY3);
                        }
                        d dVarD = androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY3, 15);
                        n54 n54Var = ht.a.e;
                        aiv aivVarC2 = g75.c(n54Var, false);
                        int iHashCode5 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO5 = aVar5.o();
                        d dVarC6 = c.c(aVar5, dVarD);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar3);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, aivVarC2, bVar);
                        hlh0.a(aVar5, ne00VarO5, dVar);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode5))) {
                            j3c.a(iHashCode5, aVar5, iHashCode5, c1350a);
                        }
                        hlh0.a(aVar5, dVarC6, cVar);
                        yka.a.C1350a c1350a3 = c1350a;
                        tsr.a aVar10 = aVar3;
                        lkf0.b((String) function4.invoke("bonus_vault_cancel"), null, j, i7f.b(18.0f, aVar5), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar5, 196992, 0, 131026);
                        aVar5.s();
                        d dVarC7 = j.c(aVar6, 1.0f);
                        if (2.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarB2 = androidx.compose.foundation.a.b(dVarC7.n(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), r58.d(4278884151L), aVar9);
                        boolean z2 = cnjVar != cnj.b;
                        Function1 function6 = function1;
                        boolean zM2 = aVar5.M(function6) | aVar5.M(nt4Var2);
                        Object objY4 = aVar5.y();
                        if (zM2 || objY4 == c0042a2) {
                            objY4 = new os4(function6, nt4Var2);
                            aVar5.r(objY4);
                        }
                        d dVarD2 = androidx.compose.foundation.d.d(dVarB2, z2, null, null, (Function0) objY4, 14);
                        aiv aivVarC3 = g75.c(n54Var, false);
                        int iHashCode6 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO6 = aVar5.o();
                        d dVarC8 = c.c(aVar5, dVarD2);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar10);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, aivVarC3, bVar);
                        hlh0.a(aVar5, ne00VarO6, dVar);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode6))) {
                            j3c.a(iHashCode6, aVar5, iHashCode6, c1350a3);
                        }
                        hlh0.a(aVar5, dVarC8, cVar);
                        if (((Boolean) ytwVar3.getValue()).booleanValue()) {
                            aVar5.N(2022803767);
                            q330.b(null, j, 0.0f, 0L, 0, aVar5, 48, 29);
                            aVar5.H();
                            aVar4 = aVar5;
                        } else {
                            aVar5.N(2022948940);
                            lkf0.b((String) function4.invoke(sgwpmp.TZw), null, j, i7f.b(18.0f, aVar5), null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar5, 196992, 0, 130514);
                            aVar4 = aVar5;
                            aVar4.H();
                        }
                        aVar4.s();
                        aVar4.s();
                        aVar4.s();
                        aVar4.s();
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i3 >> 12) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ms4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ps4.a(nt4Var, cnjVar, function1, function2, function0, function3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
