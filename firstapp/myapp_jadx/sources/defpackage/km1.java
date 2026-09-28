package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import com.sportygames.spindabottle.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spindabottle.viewmodels.AvailableViewModel$gameDetails$1", f = "AvailableViewModel.kt", l = {178}, m = "invokeSuspend", v = 1)
public final class km1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fm1 b;
    public final /* synthetic */ double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km1(fm1 fm1Var, double d, v1b<? super km1> v1bVar) {
        super(2, v1bVar);
        this.b = fm1Var;
        this.c = d;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new km1(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((km1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Double balance;
        Double balance2;
        Double balance3;
        Double balance4;
        Double balance5;
        fm1 fm1Var = this.b;
        ssw<Double> sswVar = fm1Var.b;
        ssw<LoadingState<HTTPResponse<DetailResponse>>> sswVar2 = fm1Var.i;
        ssw<WalletInfo> sswVar3 = fm1Var.z;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar2.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            d6b0 d6b0Var = fm1Var.a;
            this.a = 1;
            d6b0Var.getClass();
            pfd pfdVar = fse.a;
            objD = ej5.d(odd.b, new a52(new t5b0(1, null), null), this);
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
            WalletInfo walletInfoD = sswVar3.d();
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = (walletInfoD == null || (balance5 = walletInfoD.getBalance()) == null) ? 0.0d : balance5.doubleValue();
            ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
            DetailResponse detailResponse = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
            double minAmount = detailResponse != null ? detailResponse.getMinAmount() : 0.0d;
            double d = this.c;
            if (dDoubleValue2 <= minAmount) {
                WalletInfo walletInfoD2 = sswVar3.d();
                double dDoubleValue3 = (walletInfoD2 == null || (balance = walletInfoD2.getBalance()) == null) ? 0.0d : balance.doubleValue();
                DetailResponse detailResponse2 = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
                if (dDoubleValue3 < (detailResponse2 != null ? detailResponse2.getDefaultAmount() : 0.0d)) {
                    if (d > 0.0d) {
                        sswVar.j(new Double(d));
                        DetailResponse detailResponse3 = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
                        if (detailResponse3 != null) {
                            detailResponse3.setDefaultAmount(d);
                        }
                    } else {
                        DetailResponse detailResponse4 = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
                        sswVar.j(detailResponse4 != null ? new Double(detailResponse4.getMinAmount()) : null);
                    }
                } else if (d > 0.0d) {
                    sswVar.j(new Double(d));
                    DetailResponse detailResponse5 = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
                    if (detailResponse5 != null) {
                        detailResponse5.setDefaultAmount(d);
                    }
                } else {
                    DetailResponse detailResponse6 = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
                    sswVar.j(detailResponse6 != null ? new Double(detailResponse6.getDefaultAmount()) : null);
                }
            } else if (d > 0.0d) {
                WalletInfo walletInfoD3 = sswVar3.d();
                double dDoubleValue4 = (walletInfoD3 == null || (balance4 = walletInfoD3.getBalance()) == null) ? 0.0d : balance4.doubleValue();
                if (dDoubleValue4 > d) {
                    dDoubleValue4 = d;
                }
                sswVar.j(new Double(dDoubleValue4));
                DetailResponse detailResponse7 = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
                if (detailResponse7 != null) {
                    WalletInfo walletInfoD4 = sswVar3.d();
                    if (walletInfoD4 != null && (balance3 = walletInfoD4.getBalance()) != null) {
                        dDoubleValue = balance3.doubleValue();
                    }
                    if (dDoubleValue <= d) {
                        d = dDoubleValue;
                    }
                    detailResponse7.setDefaultAmount(d);
                }
            } else {
                WalletInfo walletInfoD5 = sswVar3.d();
                double dDoubleValue5 = (walletInfoD5 == null || (balance2 = walletInfoD5.getBalance()) == null) ? 0.0d : balance2.doubleValue();
                DetailResponse detailResponse8 = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
                sswVar.j(new Double(Math.min(dDoubleValue5, detailResponse8 != null ? detailResponse8.getDefaultAmount() : 0.0d)));
            }
            sswVar2.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
            fm1Var.w.m((DetailResponse) ((HTTPResponse) success.getValue()).getData());
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            sswVar2.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            Status status = Status.FAILED;
            resultWrapper.getClass();
            sswVar2.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
        }
        return Unit.a;
    }
}
