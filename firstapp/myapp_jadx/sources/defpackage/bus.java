package defpackage;

import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bus implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bus(int i, Object obj, Object obj2) {
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
                topicInfo.setSportId((String) obj3);
                topicInfo.setProductId(tva.a);
                topicInfo.setMarketId(((RegularMarketRule) obj2).a);
                break;
            default:
                isw iswVar = (isw) obj3;
                ytw ytwVar = (ytw) obj2;
                ukf0 ukf0Var = (ukf0) obj;
                ukf0Var.getClass();
                if (!ukf0Var.e() || iswVar.j() <= 0.45f) {
                    ytwVar.setValue(Boolean.TRUE);
                } else {
                    iswVar.A(iswVar.j() * 0.9f);
                    ytwVar.setValue(Boolean.FALSE);
                }
                break;
        }
        return Unit.a;
    }
}
