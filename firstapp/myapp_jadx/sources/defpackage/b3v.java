package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.MatchEventDetailViewModel$4", f = "MatchEventDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b3v extends tje0 implements Function2<png, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ m3v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3v(v1b v1bVar, m3v m3vVar) {
        super(2, v1bVar);
        this.b = m3vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b3v b3vVar = new b3v(v1bVar, this.b);
        b3vVar.a = obj;
        return b3vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(png pngVar, v1b<? super Unit> v1bVar) {
        return ((b3v) create(pngVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        EventData eventData;
        List<Event> list;
        Event event;
        EventData eventData2;
        List<Event> list2;
        Event event2;
        png pngVar = (png) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.W;
        png pngVar2 = (png) wwd0Var.getValue();
        Object value3 = wwd0Var.getValue();
        String str = null;
        png.c cVar = value3 instanceof png.c ? (png.c) value3 : null;
        String str2 = (cVar == null || (eventData2 = cVar.a) == null || (list2 = eventData2.events) == null || (event2 = (Event) CollectionsKt.firstOrNull(list2)) == null) ? null : event2.eventId;
        boolean z = pngVar instanceof png.c;
        png.c cVar2 = z ? (png.c) pngVar : null;
        if (cVar2 != null && (eventData = cVar2.a) != null && (list = eventData.events) != null && (event = (Event) CollectionsKt.firstOrNull(list)) != null) {
            str = event.eventId;
        }
        if (!(pngVar2 instanceof png.c) || !z) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, pngVar));
        } else if (!Intrinsics.g(str2, str)) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, pngVar));
        }
        return Unit.a;
    }
}
