package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.MatchEventDetailViewModel$selectedEventFlow$1", f = "MatchEventDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g3v extends tje0 implements gaj<String, List<? extends ieo>, v1b<? super ieo>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ List b;

    @Override // defpackage.gaj
    public final Object invoke(String str, List<? extends ieo> list, v1b<? super ieo> v1bVar) {
        g3v g3vVar = new g3v(3, v1bVar);
        g3vVar.a = str;
        g3vVar.b = list;
        return g3vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        List list = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        for (Object obj2 : list) {
            if (((ieo) obj2).a.equals(str)) {
                return obj2;
            }
        }
        return null;
    }
}
