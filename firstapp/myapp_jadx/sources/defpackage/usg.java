package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.c;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class usg implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) obj;
        List list = (List) obj2;
        cVar.getClass();
        list.getClass();
        Event event = cVar.e.a;
        return (event == null || list.isEmpty()) ? new ba20.b(R.string.bet_builder__mega_bb_available_when_lineups_confirmed) : new ba20.a(event, list);
    }
}
