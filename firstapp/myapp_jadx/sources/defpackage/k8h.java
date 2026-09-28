package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.HighlightData;
import com.sportybet.plugin.realsports.data.MixHighlight;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getHighlightData$3", f = "FactsCenterRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k8h extends tje0 implements gaj<BaseResponse<List<? extends Event>>, BaseResponse<MixHighlight>, v1b<? super HighlightData>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ BaseResponse b;

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<List<? extends Event>> baseResponse, BaseResponse<MixHighlight> baseResponse2, v1b<? super HighlightData> v1bVar) {
        k8h k8hVar = new k8h(3, v1bVar);
        k8hVar.a = baseResponse;
        k8hVar.b = baseResponse2;
        return k8hVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws IOException {
        List list;
        List list2;
        BaseResponse baseResponse = this.a;
        BaseResponse baseResponse2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!baseResponse.hasData() || !baseResponse2.hasData()) {
            String str = baseResponse.message;
            if (str == null) {
                str = baseResponse2.message;
            }
            throw new IOException(str);
        }
        List list3 = (List) baseResponse.data;
        if (list3 == null) {
            list3 = m2g.a;
        }
        MixHighlight mixHighlight = (MixHighlight) baseResponse2.data;
        if (mixHighlight == null || (list = mixHighlight.tournaments) == null) {
            list = m2g.a;
        }
        if (mixHighlight == null || (list2 = mixHighlight.events) == null) {
            list2 = m2g.a;
        }
        return new HighlightData(list3, list, list2);
    }
}
