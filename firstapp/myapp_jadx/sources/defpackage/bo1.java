package defpackage;

import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.evenodd.remote.models.ChatRoomResponse;
import com.sportygames.evenodd.remote.models.DetailResponse;
import com.sportygames.evenodd.remote.models.GameAvailableResponse;
import com.sportygames.evenodd.remote.models.UserValidateResponse;
import com.sportygames.evenodd.remote.models.WalletInfo;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lbo1;", "Lj8i0;", "<init>", "()V", "b", "c", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bo1 extends j8i0 {
    public final hhg a = hhg.a;
    public final ssw<Double> b = new ssw<>();
    public final ssw<c> c = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> d = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<UserValidateResponse>>> e = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<DetailResponse>>> f = new ssw<>();
    public final ssw<DetailResponse> i = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<WalletInfo>>> v = new ssw<>();
    public final ssw<WalletInfo> w = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> y = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> z = new ssw<>();

    @c0d(c = "com.sportygames.evenodd.viewmodels.AvailableViewModel$walletInfo$1", f = "AvailableViewModel.kt", l = {248}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return bo1.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            bo1 bo1Var = bo1.this;
            ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar = bo1Var.v;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                hhg hhgVar = bo1Var.a;
                this.a = 1;
                hhgVar.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new ghg(1, null), null), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
                bo1Var.w.m((WalletInfo) ((HTTPResponse) success.getValue()).getData());
                sswVar.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public static final class b {
        public final double a;
        public final double b;
        public final double c;
        public final double d;

        public b(double d, double d2, double d3, double d4) {
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.a, bVar.a) == 0 && Double.compare(this.b, bVar.b) == 0 && Double.compare(this.c, bVar.c) == 0 && Double.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + nrg0.a(nrg0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = ffp.a(this.a, "AmountConfigInfo(betAmount=", ", minAmount=");
            sbA.append(this.b);
            hib0.b(this.c, ", maxAmount=", ", walletBalance=", sbA);
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c {
        public final GiftItem a;
        public final double b;
        public final double c;

        public c(GiftItem giftItem, double d, double d2) {
            this.a = giftItem;
            this.b = d;
            this.c = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && Double.compare(this.b, cVar.b) == 0 && Double.compare(this.c, cVar.c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.c) + nrg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "GiftAppliedDetail(giftItem=" + this.a + ", amount=" + this.b + ", userAmount=" + this.c + ")";
        }
    }

    public final void A1(c cVar) {
        double d = cVar != null ? cVar.b : 0.0d;
        ssw<Double> sswVar = this.b;
        Double d2 = sswVar.d();
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        ssw<c> sswVar2 = this.c;
        if (d < dDoubleValue) {
            sswVar2.m(cVar);
        } else {
            sswVar.m(cVar != null ? Double.valueOf(cVar.b) : null);
            sswVar2.m(cVar);
        }
    }

    public final void B1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final b x1() {
        Double balance;
        Double d = this.b.d();
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        WalletInfo walletInfoD = this.w.d();
        double dDoubleValue2 = (walletInfoD == null || (balance = walletInfoD.getBalance()) == null) ? 0.0d : balance.doubleValue();
        ssw<DetailResponse> sswVar = this.i;
        DetailResponse detailResponseD = sswVar.d();
        double minAmount = detailResponseD != null ? detailResponseD.getMinAmount() : 0.0d;
        DetailResponse detailResponseD2 = sswVar.d();
        return new b(dDoubleValue, minAmount, detailResponseD2 != null ? detailResponseD2.getMaxAmount() : 0.0d, dDoubleValue2);
    }

    public final Double y1() {
        return this.b.d();
    }

    public final void z1(Double d) {
        this.b.m(d);
    }
}
