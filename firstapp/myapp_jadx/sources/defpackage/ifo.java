package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.gifthint.InstantWinGiftHintHandlerImpl$initGiftHint$1", f = "InstantWinGiftHintHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ifo extends tje0 implements gaj<List<? extends GiftDetails>, String, v1b<? super ink>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ String b;
    public final /* synthetic */ lfo c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifo(lfo lfoVar, String str, v1b<? super ifo> v1bVar) {
        super(3, v1bVar);
        this.c = lfoVar;
        this.d = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(List<? extends GiftDetails> list, String str, v1b<? super ink> v1bVar) {
        ifo ifoVar = new ifo(this.c, this.d, v1bVar);
        ifoVar.a = list;
        ifoVar.b = str;
        return ifoVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Long l;
        Object aVar;
        List list = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str2 = this.d;
        if (list.isEmpty()) {
            return ink.b.a;
        }
        lfo lfoVar = this.c;
        String strF = lfoVar.a.f();
        Iterator it = list.iterator();
        long currentBalance = 0;
        while (it.hasNext()) {
            currentBalance += ((GiftDetails) it.next()).getCurrentBalance();
        }
        String strW = bjb0.W(currentBalance);
        try {
            Map map = (Map) lfoVar.d.fromJson(str, new hfo().getType());
            if (map != null && (l = (Long) map.get(str2)) != null) {
                if (gsc.e(new Date(l.longValue()), new Date())) {
                    aVar = ink.b.a;
                } else {
                    strW.getClass();
                    aVar = new ink.a(strF, strW);
                }
                if (aVar != null) {
                    return aVar;
                }
            }
            strW.getClass();
            return new ink.a(strF, strW);
        } catch (Exception e) {
            itf0.a.f(e, "Error parsing gift hint timestamp map", new Object[0]);
            return ink.b.a;
        }
    }
}
