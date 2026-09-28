package defpackage;

import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.redblack.remote.models.FetchBetAmountResponse;
import com.sportygames.redblack.remote.models.RoundInitializeResponse;
import com.sportygames.redblack.remote.models.RoundRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lg060;", "Lj8i0;", "<init>", "()V", "b", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g060 extends j8i0 {
    public final mo40 a = mo40.a;
    public final ssw<LoadingState<HTTPResponse<RoundInitializeResponse>>> b = new ssw<>();
    public final ssw<RoundInitializeResponse> c = new ssw<>();
    public final ssw<Double> d = new ssw<>();
    public final ssw<b> e = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<FetchBetAmountResponse>>> f = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<Map<String, String>>>> i = new ssw<>();

    public static final class a {
        public final double a;
        public final double b;
        public final double c;
        public final double d;

        public a(double d, double d2, double d3, double d4) {
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0 && Double.compare(this.c, aVar.c) == 0 && Double.compare(this.d, aVar.d) == 0;
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

    public static final class b {
        public final GiftItem a;
        public final double b;
        public final double c;

        public b(GiftItem giftItem, double d, double d2) {
            this.a = giftItem;
            this.b = d;
            this.c = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Double.compare(this.b, bVar.b) == 0 && Double.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.c) + nrg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "GiftAppliedDetail(giftItem=" + this.a + ", amount=" + this.b + ", userAmount=" + this.c + ")";
        }
    }

    @c0d(c = "com.sportygames.redblack.viewmodels.RoundViewModel$endRound$1", f = "RoundViewModel.kt", l = {171}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RoundRequest c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RoundRequest roundRequest, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = roundRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g060.this.new c(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            g060 g060Var = g060.this;
            ssw<LoadingState<HTTPResponse<Map<String, String>>>> sswVar = g060Var.i;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                mo40 mo40Var = g060Var.a;
                this.a = 1;
                mo40Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new ao40(this.c, null), null), this);
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
                if (((Map) ((HTTPResponse) success.getValue()).getData()) != null) {
                    sswVar.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
                }
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

    @c0d(c = "com.sportygames.redblack.viewmodels.RoundViewModel$fetchBetAmount$1", f = "RoundViewModel.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RoundRequest c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RoundRequest roundRequest, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = roundRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g060.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objD;
            g060 g060Var = g060.this;
            ssw<LoadingState<HTTPResponse<FetchBetAmountResponse>>> sswVar = g060Var.f;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                mo40 mo40Var = g060Var.a;
                this.a = 1;
                mo40Var.getClass();
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new a52(new bo40(this.c, null), null), this);
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
                ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
                FetchBetAmountResponse fetchBetAmountResponse = (FetchBetAmountResponse) ((HTTPResponse) success.getValue()).getData();
                if (fetchBetAmountResponse != null) {
                    ssw<RoundInitializeResponse> sswVar2 = g060Var.c;
                    ssw<Double> sswVar3 = g060Var.d;
                    RoundInitializeResponse roundInitializeResponseD = sswVar2.d();
                    if ((roundInitializeResponseD != null ? roundInitializeResponseD.getUserBalance() : 0.0d) > fetchBetAmountResponse.getBetAmountVO().getMinAmount()) {
                        RoundInitializeResponse roundInitializeResponseD2 = sswVar2.d();
                        sswVar3.j(new Double(Math.min(roundInitializeResponseD2 != null ? roundInitializeResponseD2.getUserBalance() : 0.0d, fetchBetAmountResponse.getBetAmountVO().getDefaultAmount())));
                    } else {
                        RoundInitializeResponse roundInitializeResponseD3 = sswVar2.d();
                        if ((roundInitializeResponseD3 != null ? roundInitializeResponseD3.getUserBalance() : 0.0d) < fetchBetAmountResponse.getBetAmountVO().getDefaultAmount()) {
                            sswVar3.j(new Double(fetchBetAmountResponse.getBetAmountVO().getMinAmount()));
                        } else {
                            sswVar3.j(new Double(fetchBetAmountResponse.getBetAmountVO().getDefaultAmount()));
                        }
                    }
                    sswVar.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
                    RoundInitializeResponse roundInitializeResponseD4 = sswVar2.d();
                    sswVar2.j(roundInitializeResponseD4 != null ? RoundInitializeResponse.copy$default(roundInitializeResponseD4, fetchBetAmountResponse.getBetAmountVO(), fetchBetAmountResponse.getBetChipList(), 0L, 0.0d, 0.0d, fetchBetAmountResponse.getTurnId(), 0.0d, null, null, 476, null) : null);
                }
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

    @c0d(c = "com.sportygames.redblack.viewmodels.RoundViewModel$roundInitialize$1", f = "RoundViewModel.kt", l = {49}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g060.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objD;
            g060 g060Var = g060.this;
            ssw<LoadingState<HTTPResponse<RoundInitializeResponse>>> sswVar = g060Var.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                mo40 mo40Var = g060Var.a;
                this.a = 1;
                mo40Var.getClass();
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new a52(new ko40(1, null), null), this);
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
                ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
                RoundInitializeResponse roundInitializeResponse = (RoundInitializeResponse) ((HTTPResponse) success.getValue()).getData();
                if (roundInitializeResponse != null) {
                    g060Var.c.m(RoundInitializeResponse.copy$default(roundInitializeResponse, null, null, 0L, 0.0d, 0.0d, 0, 0.0d, null, null, 511, null));
                    sswVar.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
                }
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

    public final void x1(RoundRequest roundRequest) {
        ej5.c(o8i0.d(this), null, null, new c(roundRequest, null), 3);
    }

    public final void y1(RoundRequest roundRequest) {
        ej5.c(o8i0.d(this), null, null, new d(roundRequest, null), 3);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new e(null), 3);
    }
}
