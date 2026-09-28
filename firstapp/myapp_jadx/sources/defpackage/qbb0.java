package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.viewmodel.SpinMatchViewModel$getGameDetails$1", f = "SpinMatchViewModel.kt", l = {195}, m = "invokeSuspend", v = 1)
public final class qbb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nbb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbb0(nbb0 nbb0Var, v1b<? super qbb0> v1bVar) {
        super(2, v1bVar);
        this.b = nbb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qbb0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qbb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ArrayList<DetailResponse.BetConfigList> betConfigList;
        int i;
        nbb0 nbb0Var = this.b;
        ssw<LoadingState<HTTPResponse<DetailResponse>>> sswVar = nbb0Var.i;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            mbb0 mbb0Var = nbb0Var.a;
            this.a = 1;
            mbb0Var.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new a52(new bbb0(1, null), null), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
            DetailResponse detailResponse = (DetailResponse) ((HTTPResponse) success.getValue()).getData();
            if (detailResponse != null && (betConfigList = detailResponse.getBetConfigList()) != null) {
                int size = betConfigList.size();
                int i3 = 0;
                while (i3 < size) {
                    DetailResponse.BetConfigList betConfigList2 = betConfigList.get(i3);
                    i3++;
                    DetailResponse.BetConfigList betConfigList3 = betConfigList2;
                    String colour = betConfigList3.getColour();
                    if (colour != null) {
                        switch (colour.hashCode()) {
                            case -1008851410:
                                if (!colour.equals("orange")) {
                                    i = R.color.white;
                                } else {
                                    i = R.color.sg_spin_match_orange;
                                }
                                break;
                            case -815929690:
                                colour.equals("no match");
                                i = R.color.white;
                                break;
                            case -734239628:
                                if (!colour.equals("yellow")) {
                                    i = R.color.white;
                                } else {
                                    i = R.color.sg_spin_match_yellow;
                                }
                                break;
                            case 3027034:
                                if (!colour.equals("blue")) {
                                    i = R.color.white;
                                } else {
                                    i = R.color.sg_spin_match_blue;
                                }
                                break;
                            case 3441014:
                                if (!colour.equals("pink")) {
                                    i = R.color.white;
                                } else {
                                    i = R.color.sg_spin_match_pink;
                                }
                                break;
                            case 98619139:
                                if (!colour.equals("green")) {
                                    i = R.color.white;
                                } else {
                                    i = R.color.sg_spin_match_green;
                                }
                                break;
                            default:
                                i = R.color.white;
                                break;
                        }
                    } else {
                        i = R.color.white;
                    }
                    betConfigList3.setColorCode(i);
                }
            }
            sswVar.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            sswVar.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(new Integer(-11), null), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            Status status = Status.FAILED;
            resultWrapper.getClass();
            sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
        }
        return Unit.a;
    }
}
