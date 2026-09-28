package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.BroadcastConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qgm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qgm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<BroadcastConfig> list;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tgm tgmVar = (tgm) obj2;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse.isSuccessful() && (list = (List) baseResponse.data) != null) {
                    for (BroadcastConfig broadcastConfig : list) {
                        int groupType = broadcastConfig.getGroupType();
                        List<BroadcastConfig.Info> infos = broadcastConfig.getInfos();
                        if (groupType == 1) {
                            tgmVar.e.j(new pgm(1, infos));
                        } else if (groupType == 2) {
                            tgmVar.i.j(new pgm(1, infos));
                        } else if (groupType == 20) {
                            tgmVar.w.j(new pgm(1, infos));
                        }
                    }
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(str);
                break;
        }
        return Unit.a;
    }
}
