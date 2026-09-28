package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.handler.MatchEventDetailEventSwitcherHandlerImpl$init$3", f = "MatchEventDetailEventSwitcherHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o1v extends tje0 implements gaj<String, List<? extends xfo>, v1b<? super List<? extends t1v>>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ List b;

    @Override // defpackage.gaj
    public final Object invoke(String str, List<? extends xfo> list, v1b<? super List<? extends t1v>> v1bVar) {
        o1v o1vVar = new o1v(3, v1bVar);
        o1vVar.a = str;
        o1vVar.b = list;
        return o1vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        List<xfo> list = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (str == null) {
            xfo xfoVar = (xfo) CollectionsKt.firstOrNull(list);
            str = xfoVar != null ? xfoVar.a : null;
        }
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (xfo xfoVar2 : list) {
            String str2 = xfoVar2.a;
            arrayList.add(new t1v(str2, xfoVar2.b, Intrinsics.g(str, str2)));
        }
        return arrayList;
    }
}
