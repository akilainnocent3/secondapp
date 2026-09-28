package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.data.LiveSectionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.LiveSectionUseCase$fetchLiveSectionData$1", f = "LiveSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lts extends tje0 implements iaj<BaseResponse<List<? extends Sport>>, BaseResponse<List<? extends Tournament>>, BaseResponse<BoostInfo>, v1b<? super LiveSectionData>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ BaseResponse b;
    public /* synthetic */ BaseResponse c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lts(String str, v1b<? super lts> v1bVar) {
        super(4, v1bVar);
        this.d = str;
    }

    @Override // defpackage.iaj
    public final Object d(BaseResponse<List<? extends Sport>> baseResponse, BaseResponse<List<? extends Tournament>> baseResponse2, BaseResponse<BoostInfo> baseResponse3, v1b<? super LiveSectionData> v1bVar) {
        lts ltsVar = new lts(this.d, v1bVar);
        ltsVar.a = baseResponse;
        ltsVar.b = baseResponse2;
        ltsVar.c = baseResponse3;
        return ltsVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        BoostResult boostResult;
        BaseResponse baseResponse = this.a;
        BaseResponse baseResponse2 = this.b;
        BaseResponse baseResponse3 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mfb0 mfb0VarE = lfb0.d().e(this.d);
        if (mfb0VarE == null) {
            throw new Throwable("No supported sport");
        }
        List list = (List) n52.b(baseResponse);
        list.getClass();
        ArrayList arrayListF = lfb0.d().f(list);
        int size = arrayListF.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj2 = arrayListF.get(i);
            i++;
            i2 += ((Sport) obj2).eventSize;
        }
        List list2 = (List) n52.b(baseResponse2);
        list2.getClass();
        Iterator it = list2.iterator();
        int size2 = 0;
        while (it.hasNext()) {
            size2 += ((Tournament) it.next()).events.size();
        }
        BoostInfo boostInfo = (BoostInfo) baseResponse3.data;
        if (boostInfo == null || (boostResult = t25.a(boostInfo)) == null) {
            boostResult = new BoostResult(false, null, 3, null);
        }
        return new LiveSectionData(mfb0VarE, i2, size2, list2, boostResult);
    }
}
