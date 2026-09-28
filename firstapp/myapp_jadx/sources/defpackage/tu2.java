package defpackage;

import android.util.Pair;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$createJsonString$2", f = "BetItemImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tu2 extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ List<Selection> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tu2(List<? extends Selection> list, v1b<? super tu2> v1bVar) {
        super(2, v1bVar);
        this.b = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tu2 tu2Var = new tu2(this.b, v1bVar);
        tu2Var.a = obj;
        return tu2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((tu2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<Selection> list = this.b;
        try {
            zi50.a aVar = zi50.b;
            bVar = sh8.b().toJson(list);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Event event = ((Selection) it.next()).a;
                arrayList.add(event != null ? event.eventId : null);
            }
            w950.a("BetItem", "createJsonString", new Throwable("Selection Json parser error"), a.c(new Pair(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, arrayList.toString())));
        }
        if (bVar instanceof zi50.b) {
            return null;
        }
        return bVar;
    }
}
