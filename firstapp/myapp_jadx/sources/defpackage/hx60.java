package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hx60 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        qlf0 qlf0Var = null;
        gdf0 gdf0Var = obj2 != null ? (gdf0) obj2 : null;
        gdf0Var.getClass();
        int i = gdf0Var.a;
        Object obj3 = list.get(1);
        dff0 dff0Var = obj3 != null ? (dff0) obj3 : null;
        dff0Var.getClass();
        int i2 = dff0Var.a;
        Object obj4 = list.get(2);
        pmf0[] pmf0VarArr = omf0.b;
        lx60 lx60Var = kx60.s;
        Boolean bool = Boolean.FALSE;
        Intrinsics.g(obj4, bool);
        omf0 omf0Var = obj4 != null ? (omf0) lx60Var.b.invoke(obj4) : null;
        omf0Var.getClass();
        long j = omf0Var.a;
        Object obj5 = list.get(3);
        pjf0 pjf0Var = pjf0.c;
        pjf0 pjf0Var2 = (Intrinsics.g(obj5, bool) || obj5 == null) ? null : (pjf0) kx60.m.b.invoke(obj5);
        Object obj6 = list.get(4);
        sj10 sj10Var = sj10.b;
        sj10 sj10Var2 = (Intrinsics.g(obj6, bool) || obj6 == null) ? null : (sj10) sx60.a.b.invoke(obj6);
        Object obj7 = list.get(5);
        afs afsVar = afs.c;
        afs afsVar2 = (Intrinsics.g(obj7, bool) || obj7 == null) ? null : (afs) kx60.w.b.invoke(obj7);
        Object obj8 = list.get(6);
        yes yesVar = (Intrinsics.g(obj8, bool) || obj8 == null) ? null : (yes) sx60.b.b.invoke(obj8);
        yesVar.getClass();
        int i3 = yesVar.a;
        Object obj9 = list.get(7);
        tqm tqmVar = obj9 != null ? (tqm) obj9 : null;
        tqmVar.getClass();
        int i4 = tqmVar.a;
        Object obj10 = list.get(8);
        boolean zG = Intrinsics.g(obj10, bool);
        uv60 uv60Var = sx60.c;
        if (!zG && obj10 != null) {
            qlf0Var = (qlf0) uv60Var.b.invoke(obj10);
        }
        return new qrz(i, i2, j, pjf0Var2, sj10Var2, afsVar2, i3, i4, qlf0Var);
    }
}
