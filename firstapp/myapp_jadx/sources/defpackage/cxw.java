package defpackage;

import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.plugin.myfavorite.widget.MyFavoriteLivePanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cxw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cxw(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                TopicInfo topicInfo = (TopicInfo) obj;
                int i2 = MyFavoriteLivePanel.p0;
                topicInfo.setSportId((String) obj3);
                topicInfo.setProductId(tva.a);
                topicInfo.setMarketId(((RegularMarketRule) obj2).a);
                return null;
            default:
                lfy lfyVar = (lfy) obj2;
                if (((vu90) obj3).l.compareAndSet(true, false)) {
                    lfyVar.u1(obj);
                }
                return Unit.a;
        }
    }
}
