package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.bethistory.presentation.LNBetHistoryViewModel$orderState$1", f = "LNBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class typ extends tje0 implements gaj<lk50<? extends wgq>, qcn<? extends String>, v1b<? super qxq>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ qcn b;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends wgq> lk50Var, qcn<? extends String> qcnVar, v1b<? super qxq> v1bVar) {
        typ typVar = new typ(3, v1bVar);
        typVar.a = lk50Var;
        typVar.b = qcnVar;
        return typVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tlq tlqVar;
        mxq mxqVarA;
        lk50 lk50Var = this.a;
        qcn qcnVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50Var.getClass();
        qcnVar.getClass();
        if (lk50Var instanceof lk50.a) {
            return qxq.b.a;
        }
        if (lk50Var.equals(lk50.b.a)) {
            return qxq.d.a;
        }
        if (!(lk50Var instanceof lk50.c)) {
            uhc.a();
            return null;
        }
        wgq wgqVar = (wgq) ((lk50.c) lk50Var).a;
        oxq.b bVar = new oxq.b(0);
        qcn<lxq> qcnVar2 = wgqVar.a;
        ArrayList arrayList = new ArrayList();
        for (lxq lxqVar : qcnVar2) {
            if (!qcnVar.contains(lxqVar.a)) {
                arrayList.add(lxqVar);
            }
        }
        if (arrayList.isEmpty()) {
            return qxq.a.a;
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            lxq lxqVar2 = (lxq) obj2;
            String str = new SimpleDateFormat("MMM d", Locale.ENGLISH).format(new Date(lxqVar2.k));
            str.getClass();
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
            String str2 = (String) CollectionsKt.V(0, listSplit$default);
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) CollectionsKt.V(1, listSplit$default);
            oxq.b bVar2 = new oxq.b(str3 != null ? str3 : "", str2);
            if (bVar2.equals(bVar)) {
                mxqVarA = nxq.a(lxqVar2, oxq.a.a);
            } else {
                mxqVarA = nxq.a(lxqVar2, bVar2);
                bVar = bVar2;
            }
            arrayList2.add(mxqVarA);
        }
        uf00 uf00VarF = a4h.f(arrayList2);
        vgq vgqVar = wgqVar.b;
        if (Intrinsics.g(vgqVar, vgq.a.a)) {
            tlqVar = tlq.a;
        } else if (Intrinsics.g(vgqVar, vgq.b.a)) {
            tlqVar = tlq.c;
        } else {
            if (!(vgqVar instanceof vgq.c)) {
                uhc.a();
                return null;
            }
            tlqVar = tlq.b;
        }
        return new qxq.c(tlqVar, uf00VarF);
    }
}
