package defpackage;

import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spindabottle.remote.models.ChatRoomResponse;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import com.sportygames.spindabottle.remote.models.GameAvailableResponse;
import com.sportygames.spindabottle.remote.models.UserValidateResponse;
import com.sportygames.spindabottle.remote.models.WalletInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lfm1;", "Lj8i0;", "<init>", "()V", "c", "d", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fm1 extends j8i0 {
    public boolean c;
    public final d6b0 a = d6b0.a;
    public final ssw<Double> b = new ssw<>();
    public final ssw<d> d = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> e = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<UserValidateResponse>>> f = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<DetailResponse>>> i = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> v = new ssw<>();
    public final ssw<DetailResponse> w = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<WalletInfo>>> y = new ssw<>();
    public final ssw<WalletInfo> z = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> A = new ssw<>();

    @c0d(c = "com.sportygames.spindabottle.viewmodels.AvailableViewModel$gameAvailableStatus$1", f = "AvailableViewModel.kt", l = {138, 140}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ResultWrapper.Success a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fm1.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objD;
            ResultWrapper resultWrapper;
            fm1 fm1Var = fm1.this;
            ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar = fm1Var.e;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                d6b0 d6b0Var = fm1Var.a;
                this.b = 1;
                d6b0Var.getClass();
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new a52(new z5b0(1, null), null), this);
                if (objD != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
                objD = obj;
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                resultWrapper = this.a;
                uj50.b(obj);
            }
            sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            return Unit.a;
            ResultWrapper resultWrapper2 = (ResultWrapper) objD;
            if (resultWrapper2 instanceof ResultWrapper.Success) {
                ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper2;
                GameAvailableResponse gameAvailableResponse = (GameAvailableResponse) ((HTTPResponse) success.getValue()).getData();
                boolean zSpecialThemeAvailable = gameAvailableResponse != null ? gameAvailableResponse.specialThemeAvailable() : false;
                this.a = success;
                this.b = 2;
                pfd pfdVar2 = fse.a;
                Object objD2 = ej5.d(gku.a, new yn1(fm1Var, zSpecialThemeAvailable, null), this);
                if (objD2 != y5bVar) {
                    objD2 = Unit.a;
                }
                if (objD2 != y5bVar) {
                    resultWrapper = resultWrapper2;
                    sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
                }
                return y5bVar;
            }
            if (resultWrapper2 instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper2, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper2.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper2, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.spindabottle.viewmodels.AvailableViewModel$walletInfo$1", f = "AvailableViewModel.kt", l = {262}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fm1.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fm1 fm1Var = fm1.this;
            ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar = fm1Var.y;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                d6b0 d6b0Var = fm1Var.a;
                this.a = 1;
                d6b0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new c6b0(1, null), null), this);
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
                fm1Var.z.m((WalletInfo) ((HTTPResponse) success.getValue()).getData());
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

    public static final class c {
        public final double a;
        public final double b;
        public final double c;
        public final double d;

        public c(double d, double d2, double d3, double d4) {
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.a, cVar.a) == 0 && Double.compare(this.b, cVar.b) == 0 && Double.compare(this.c, cVar.c) == 0 && Double.compare(this.d, cVar.d) == 0;
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

    public static final class d {
        public final GiftItem a;
        public final double b;
        public final double c;

        public d(GiftItem giftItem, double d, double d2) {
            this.a = giftItem;
            this.b = d;
            this.c = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && Double.compare(this.b, dVar.b) == 0 && Double.compare(this.c, dVar.c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.c) + nrg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "GiftAppliedDetail(giftItem=" + this.a + ", amount=" + this.b + ", userAmount=" + this.c + ")";
        }
    }

    public final void x1() {
        LoadingState<HTTPResponse<GameAvailableResponse>> loadingStateD = this.e.d();
        if ((loadingStateD != null ? loadingStateD.getStatus() : null) == Status.RUNNING) {
            return;
        }
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1(Double d2) {
        ssw<Double> sswVar = this.b;
        Double d3 = sswVar.d();
        if (d3 == null || !d3.equals(d2)) {
            sswVar.m(d2);
        }
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }
}
