package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$fetchGameDetails$1", f = "FruitHuntViewModel.kt", l = {262}, m = "invokeSuspend", v = 1)
public final class q8j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o8j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8j(o8j o8jVar, v1b<? super q8j> v1bVar) {
        super(2, v1bVar);
        this.b = o8jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q8j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q8j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objD;
        o8j o8jVar = this.b;
        wwd0 wwd0Var = o8jVar.X;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            LoadingState loadingState = new LoadingState(Status.RUNNING, null, null, null, null, 30, null);
            wwd0Var.getClass();
            wwd0Var.k(null, loadingState);
            r5h r5hVar = o8jVar.c;
            this.a = 1;
            r5hVar.getClass();
            pfd pfdVar = fse.a;
            objD = ej5.d(odd.b, new a52(new k5h(1, null), null), this);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objD = obj;
        }
        ResultWrapper resultWrapper = (ResultWrapper) objD;
        if (resultWrapper instanceof ResultWrapper.Success) {
            o8jVar.V = false;
            ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
            DetailResponse detailResponse = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
            if (detailResponse != null) {
                wwd0 wwd0Var2 = o8jVar.G;
                o8jVar.W = detailResponse;
                Double d = new Double(detailResponse.getDefaultAmount());
                wwd0Var2.getClass();
                wwd0Var2.k(null, d);
                if (o8jVar.A1()) {
                    Double d2 = (Double) o8jVar.E.a.getValue();
                    double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                    double dDoubleValue2 = ((Number) wwd0Var2.getValue()).doubleValue();
                    if (dDoubleValue > detailResponse.getMinAmount()) {
                        if (dDoubleValue2 > 0.0d) {
                            detailResponse.setDefaultAmount(dDoubleValue > dDoubleValue2 ? dDoubleValue2 : dDoubleValue);
                            if (dDoubleValue > dDoubleValue2) {
                                dDoubleValue = dDoubleValue2;
                            }
                        } else {
                            double defaultAmount = detailResponse.getDefaultAmount();
                            if (dDoubleValue > defaultAmount) {
                                dDoubleValue = defaultAmount;
                            }
                        }
                        Double dValueOf = Double.valueOf(dDoubleValue);
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, dValueOf);
                    } else {
                        if (dDoubleValue < detailResponse.getDefaultAmount()) {
                            if (dDoubleValue2 > 0.0d) {
                                detailResponse.setDefaultAmount(dDoubleValue2);
                            } else {
                                dDoubleValue2 = detailResponse.getMinAmount();
                            }
                        } else if (dDoubleValue2 > 0.0d) {
                            detailResponse.setDefaultAmount(dDoubleValue2);
                        } else {
                            dDoubleValue2 = detailResponse.getDefaultAmount();
                        }
                        Double dValueOf2 = Double.valueOf(dDoubleValue2);
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, dValueOf2);
                    }
                    detailResponse.setDefaultAmount(detailResponse.getDefaultAmount());
                }
            }
            LoadingState loadingState2 = new LoadingState(Status.SUCCESS, success.getValue(), null, null, null, 28, null);
            wwd0Var.getClass();
            wwd0Var.k(null, loadingState2);
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            LoadingState loadingState3 = new LoadingState(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 22, null);
            wwd0Var.getClass();
            wwd0Var.k(null, loadingState3);
        } else {
            Status status = Status.FAILED;
            resultWrapper.getClass();
            LoadingState loadingState4 = new LoadingState(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 26, null);
            wwd0Var.getClass();
            wwd0Var.k(null, loadingState4);
        }
        return Unit.a;
    }
}
