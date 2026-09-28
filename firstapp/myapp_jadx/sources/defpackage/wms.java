package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.live.data.LiveEventData;
import com.sportybet.plugin.realsports.live.data.LiveSpinnerMeta;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wms implements fpy {
    public final /* synthetic */ fid0 a;
    public final /* synthetic */ yms b;

    public wms(fid0 fid0Var, yms ymsVar) {
        this.a = fid0Var;
        this.b = ymsVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Event event;
        Object tag = this.a.G.getTag();
        Object obj = null;
        if (!(tag instanceof LiveSpinnerMeta)) {
            tag = null;
        }
        LiveSpinnerMeta liveSpinnerMeta = (LiveSpinnerMeta) tag;
        if (liveSpinnerMeta == null || liveSpinnerMeta.getLastSelectedPos() < 0 || liveSpinnerMeta.getLastSelectedPos() == i) {
            return;
        }
        xss.i iVar = this.b.d;
        int eventPos = liveSpinnerMeta.getEventPos();
        String marketId = liveSpinnerMeta.getMarketId();
        String str = liveSpinnerMeta.getSpecifierList().get(i);
        iVar.getClass();
        marketId.getClass();
        str.getClass();
        xss xssVar = xss.this;
        try {
            zi50.a aVar = zi50.b;
            Object obj2 = xssVar.u.get(eventPos);
            obj2.getClass();
            Event event2 = ((LiveEventData) obj2).getEvent();
            event2.setSelectSpecifier(marketId, str);
            ArrayList arrayListG = r48.G(xssVar.t, LiveEventData.class);
            int size = arrayListG.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayListG.get(i2);
                i2++;
                if (Intrinsics.g(((LiveEventData) obj3).getEvent().eventId, event2.eventId)) {
                    obj = obj3;
                    break;
                }
            }
            LiveEventData liveEventData = (LiveEventData) obj;
            if (liveEventData != null && (event = liveEventData.getEvent()) != null) {
                event.setSelectSpecifier(marketId, str);
            }
            xssVar.d(eventPos);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }
}
