package com.sportybet.feature.luckynumber.featurematch.presentation;

import com.sporty.android.common_ui.uitext.StringUiText;
import defpackage.a4h;
import defpackage.a8q;
import defpackage.ay0;
import defpackage.b8q;
import defpackage.c0d;
import defpackage.gaj;
import defpackage.n1a0;
import defpackage.ogq;
import defpackage.qcn;
import defpackage.rkd0;
import defpackage.tje0;
import defpackage.uf00;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.ukd0;
import defpackage.v1b;
import defpackage.vch0;
import defpackage.x7q;
import defpackage.y5b;
import defpackage.zi50;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchViewModel$cardState$1", f = "LuckyNumberFeatureMatchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends tje0 implements gaj<b8q, d.c, v1b<? super qcn<? extends d>>, Object> {
    public /* synthetic */ b8q a;
    public /* synthetic */ d.c b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v1b v1bVar, k kVar) {
        super(3, v1bVar);
        this.c = kVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(b8q b8qVar, d.c cVar, v1b<? super qcn<? extends d>> v1bVar) {
        h hVar = new h(v1bVar, this.c);
        hVar.a = b8qVar;
        hVar.b = cVar;
        return hVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        d.c cVar;
        d.b bVar;
        uf00 uf00VarF;
        Object bVar2;
        b8q b8qVar = this.a;
        d.c cVar2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        a8q a8qVar = b8qVar.a;
        if (Intrinsics.g(a8qVar, a8q.d.a)) {
            return n1a0.c;
        }
        if (Intrinsics.g(a8qVar, a8q.c.a)) {
            return a4h.a(d.C0406d.a);
        }
        if (Intrinsics.g(a8qVar, a8q.b.a)) {
            return a4h.a(d.a.a);
        }
        if (!(a8qVar instanceof a8q.a)) {
            uhc.a();
            return null;
        }
        if (cVar2 != null) {
            boolean zContains = ((a8q.a) a8qVar).b.contains(x7q.a);
            String str = cVar2.a;
            long j = cVar2.b;
            qcn<Integer> qcnVar = cVar2.c;
            String str2 = cVar2.d;
            str.getClass();
            qcnVar.getClass();
            str2.getClass();
            cVar = new d.c(str, j, qcnVar, str2, zContains);
        } else {
            cVar = null;
        }
        a8q.a aVar = (a8q.a) a8qVar;
        ogq ogqVar = aVar.a.d;
        if (ogqVar != null) {
            boolean zContains2 = aVar.b.contains(x7q.b);
            try {
                zi50.a aVar2 = zi50.b;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(ogqVar.g);
                bigDecimalValueOf.getClass();
                bVar2 = new rkd0(bigDecimalValueOf);
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th);
            }
            rkd0.Companion.getClass();
            Object rkd0Var = new rkd0(rkd0.b);
            if (bVar2 instanceof zi50.b) {
                bVar2 = rkd0Var;
            }
            String strA = ukd0.a(0, ((rkd0) bVar2).a, false, true);
            String str3 = ogqVar.c;
            String str4 = ogqVar.b;
            String strConcat = strA.concat("x");
            StringUiText stringUiText = vch0.a;
            bVar = new d.b(str4, new StringUiText(strConcat), ogqVar.j, str3, zContains2);
        } else {
            bVar = null;
        }
        ArrayList arrayListV = ay0.v(new d[]{cVar, bVar});
        ArrayList arrayList = arrayListV.isEmpty() ? null : arrayListV;
        return (arrayList == null || (uf00VarF = a4h.f(arrayList)) == null) ? a4h.a(d.a.a) : uf00VarF;
    }
}
