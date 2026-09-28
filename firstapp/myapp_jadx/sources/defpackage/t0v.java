package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t0v implements gv5<EventData> {
    public final /* synthetic */ u0v a;
    public final /* synthetic */ String b;

    public t0v(u0v u0vVar, String str) {
        this.a = u0vVar;
        this.b = str;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<EventData> su5Var, Throwable th) {
        String str = this.b;
        u0v u0vVar = this.a;
        th.getClass();
        try {
            u0vVar.h(str, u0vVar.c(th));
        } finally {
            u0vVar.g(str);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<EventData> su5Var, bi50<EventData> bi50Var) {
        EventData eventData;
        String str = this.b;
        u0v u0vVar = this.a;
        try {
            if (!bi50Var.a.getIsSuccessful() || (eventData = bi50Var.b) == null) {
                u0vVar.h(str, u0vVar.b(bi50Var));
                return;
            }
            EventData eventData2 = eventData;
            n4p n4pVar = u0vVar.b;
            n4p n4pVar2 = u0vVar.b;
            if (!Intrinsics.g(n4pVar.t, eventData2.roundId)) {
                n4pVar2.d();
                n4pVar2.t = eventData2.roundId;
            }
            u0vVar.k.put(str, eventData2);
            u0vVar.j(eventData2);
            u0vVar.h(str, new nqc(u0vVar.d(str)));
        } finally {
            u0vVar.g(str);
        }
    }
}
