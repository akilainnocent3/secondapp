package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.rush.model.entity.DetailResponseEntity;
import com.sportygames.rush.model.response.DetailResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.data.RushRepository$gameDetails$2", f = "RushRepository.kt", l = {41}, m = "invokeSuspend", v = 1)
public final class l660 extends tje0 implements Function1<v1b<? super HTTPResponse<DetailResponseEntity>>, Object> {
    public w660 a;
    public int b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new l660(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<DetailResponseEntity>> v1bVar) {
        return ((l660) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        w660 w660Var;
        Object objGameDetails;
        ArrayList<Double> arrayListF;
        double d;
        double d2;
        ArrayList<Double> autoBetChips;
        Double defaultUserCoefficient;
        Double desiredRTP;
        Double maxUserCoefficient;
        Double minUserCoefficient;
        Double maxPayout;
        Double maxAmount;
        Double minAmount;
        Double defaultAmount;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            w660Var = w660.a;
            mpe0 mpe0Var = on0.a;
            j660 j660VarN = on0.n();
            this.a = w660Var;
            this.b = 1;
            objGameDetails = j660VarN.gameDetails(this);
            if (objGameDetails == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w660 w660Var2 = this.a;
            uj50.b(obj);
            w660Var = w660Var2;
            objGameDetails = obj;
        }
        HTTPResponse hTTPResponse = (HTTPResponse) objGameDetails;
        w660 w660Var3 = w660.a;
        w660Var.getClass();
        Integer bizCode = hTTPResponse.getBizCode();
        Integer numValueOf = Integer.valueOf(bizCode != null ? bizCode.intValue() : 0);
        String message = hTTPResponse.getMessage();
        if (message == null) {
            message = "";
        }
        Integer total = hTTPResponse.getTotal();
        Integer numValueOf2 = Integer.valueOf(total != null ? total.intValue() : 0);
        DetailResponse detailResponse = (DetailResponse) hTTPResponse.getData();
        double dDoubleValue = (detailResponse == null || (defaultAmount = detailResponse.getDefaultAmount()) == null) ? 952.0d : defaultAmount.doubleValue();
        DetailResponse detailResponse2 = (DetailResponse) hTTPResponse.getData();
        double dDoubleValue2 = 2.0d;
        double dDoubleValue3 = (detailResponse2 == null || (minAmount = detailResponse2.getMinAmount()) == null) ? 2.0d : minAmount.doubleValue();
        DetailResponse detailResponse3 = (DetailResponse) hTTPResponse.getData();
        double dDoubleValue4 = (detailResponse3 == null || (maxAmount = detailResponse3.getMaxAmount()) == null) ? 952952.0d : maxAmount.doubleValue();
        DetailResponse detailResponse4 = (DetailResponse) hTTPResponse.getData();
        double dDoubleValue5 = (detailResponse4 == null || (maxPayout = detailResponse4.getMaxPayout()) == null) ? 1.0E7d : maxPayout.doubleValue();
        DetailResponse detailResponse5 = (DetailResponse) hTTPResponse.getData();
        double dDoubleValue6 = (detailResponse5 == null || (minUserCoefficient = detailResponse5.getMinUserCoefficient()) == null) ? 1.01d : minUserCoefficient.doubleValue();
        DetailResponse detailResponse6 = (DetailResponse) hTTPResponse.getData();
        double dDoubleValue7 = (detailResponse6 == null || (maxUserCoefficient = detailResponse6.getMaxUserCoefficient()) == null) ? 10000.0d : maxUserCoefficient.doubleValue();
        DetailResponse detailResponse7 = (DetailResponse) hTTPResponse.getData();
        double dDoubleValue8 = (detailResponse7 == null || (desiredRTP = detailResponse7.getDesiredRTP()) == null) ? 1.0d : desiredRTP.doubleValue();
        DetailResponse detailResponse8 = (DetailResponse) hTTPResponse.getData();
        if (detailResponse8 != null && (defaultUserCoefficient = detailResponse8.getDefaultUserCoefficient()) != null) {
            dDoubleValue2 = defaultUserCoefficient.doubleValue();
        }
        DetailResponse detailResponse9 = (DetailResponse) hTTPResponse.getData();
        if (detailResponse9 == null || (autoBetChips = detailResponse9.getAutoBetChips()) == null) {
            arrayListF = b.f(Double.valueOf(10.0d), Double.valueOf(50.0d), Double.valueOf(100.0d), Double.valueOf(500.0d), Double.valueOf(1000.0d));
            d = dDoubleValue7;
            d2 = dDoubleValue8;
        } else {
            arrayListF = autoBetChips;
            d = dDoubleValue7;
            d2 = dDoubleValue8;
        }
        DetailResponseEntity detailResponseEntity = new DetailResponseEntity(dDoubleValue, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, d, d2, dDoubleValue2, arrayListF);
        Boolean error = hTTPResponse.getError();
        Boolean boolValueOf = Boolean.valueOf(error != null ? error.booleanValue() : false);
        String partialError = hTTPResponse.getPartialError();
        return new HTTPResponse(numValueOf, message, numValueOf2, detailResponseEntity, boolValueOf, partialError == null ? "" : partialError, null, 64, null);
    }
}
