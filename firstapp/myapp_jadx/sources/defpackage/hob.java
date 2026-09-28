package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.repository.CrashInitiatedRepository$gameDetails$2", f = "CrashInitiatedRepository.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class hob extends tje0 implements Function1<v1b<? super HTTPResponse<DetailResponse>>, Object> {
    public sob a;
    public int b;
    public final /* synthetic */ sob c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hob(sob sobVar, v1b<? super hob> v1bVar) {
        super(1, v1bVar);
        this.c = sobVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new hob(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<DetailResponse>> v1bVar) {
        return ((hob) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        sob sobVar;
        Object objGameDetails;
        ArrayList<Double> arrayList;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            sobVar = this.c;
            znb znbVarA = sobVar.a.a();
            this.a = sobVar;
            this.b = 1;
            objGameDetails = znbVarA.gameDetails(this);
            if (objGameDetails == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sob sobVar2 = this.a;
            uj50.b(obj);
            sobVar = sobVar2;
            objGameDetails = obj;
        }
        HTTPResponse hTTPResponse = (HTTPResponse) objGameDetails;
        sobVar.getClass();
        Integer bizCode = hTTPResponse.getBizCode();
        Integer numValueOf = Integer.valueOf(bizCode != null ? bizCode.intValue() : 0);
        String message = hTTPResponse.getMessage();
        if (message == null) {
            message = "";
        }
        Integer total = hTTPResponse.getTotal();
        Integer numValueOf2 = Integer.valueOf(total != null ? total.intValue() : 0);
        DetailResponse detailResponse = (DetailResponse) hTTPResponse.getData();
        double defaultAmount = detailResponse != null ? detailResponse.getDefaultAmount() : 952.0d;
        DetailResponse detailResponse2 = (DetailResponse) hTTPResponse.getData();
        double minAmount = detailResponse2 != null ? detailResponse2.getMinAmount() : 2.0d;
        DetailResponse detailResponse3 = (DetailResponse) hTTPResponse.getData();
        double maxAmount = detailResponse3 != null ? detailResponse3.getMaxAmount() : 952952.0d;
        DetailResponse detailResponse4 = (DetailResponse) hTTPResponse.getData();
        double maxPayout = detailResponse4 != null ? detailResponse4.getMaxPayout() : 1.0E7d;
        DetailResponse detailResponse5 = (DetailResponse) hTTPResponse.getData();
        double minUserCoefficient = detailResponse5 != null ? detailResponse5.getMinUserCoefficient() : 1.01d;
        DetailResponse detailResponse6 = (DetailResponse) hTTPResponse.getData();
        double maxUserCoefficient = detailResponse6 != null ? detailResponse6.getMaxUserCoefficient() : 10000.0d;
        DetailResponse detailResponse7 = (DetailResponse) hTTPResponse.getData();
        double desiredRTP = detailResponse7 != null ? detailResponse7.getDesiredRTP() : 1.0d;
        DetailResponse detailResponse8 = (DetailResponse) hTTPResponse.getData();
        double defaultUserCoefficient = detailResponse8 != null ? detailResponse8.getDefaultUserCoefficient() : 2.0d;
        DetailResponse detailResponse9 = (DetailResponse) hTTPResponse.getData();
        if (detailResponse9 == null || (arrayList = detailResponse9.getAutoBetChips()) == null) {
            arrayList = new ArrayList<>();
        }
        DetailResponse detailResponse10 = new DetailResponse(defaultAmount, minAmount, maxAmount, maxPayout, minUserCoefficient, maxUserCoefficient, desiredRTP, defaultUserCoefficient, arrayList);
        Boolean error = hTTPResponse.getError();
        Boolean boolValueOf = Boolean.valueOf(error != null ? error.booleanValue() : false);
        String partialError = hTTPResponse.getPartialError();
        return new HTTPResponse(numValueOf, message, numValueOf2, detailResponse10, boolValueOf, partialError == null ? "" : partialError, null, 64, null);
    }
}
