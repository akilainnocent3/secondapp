package defpackage;

import androidx.fragment.app.e;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.redblack.remote.models.PlaceBetRequest;
import com.sportygames.redblack.remote.models.PlaceBetResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lynh0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ynh0 extends j8i0 {
    public final mo40 a = mo40.a;
    public final ssw<LoadingState<HTTPResponse<PlaceBetResponse>>> b = new ssw<>();
    public PlaceBetRequest c;

    @c0d(c = "com.sportygames.redblack.viewmodels.UserActionViewModel$placeBet$2", f = "UserActionViewModel.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ynh0 c;
        public final /* synthetic */ PlaceBetRequest d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, ynh0 ynh0Var, PlaceBetRequest placeBetRequest, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = ynh0Var;
            this.d = placeBetRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ynh0 ynh0Var = this.c;
            ssw<LoadingState<HTTPResponse<PlaceBetResponse>>> sswVar = ynh0Var.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (!this.b) {
                    sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                }
                mo40 mo40Var = ynh0Var.a;
                this.a = 1;
                obj = mo40Var.d(this.d, this);
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
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
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

    public static final class b implements poy {
        public final /* synthetic */ PlaceBetRequest b;
        public final /* synthetic */ kej c;

        @c0d(c = "com.sportygames.redblack.viewmodels.UserActionViewModel$placeBetWithGPS$1$onPermissionGranted$1", f = "UserActionViewModel.kt", l = {41}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public dq40 a;
            public int b;
            public final /* synthetic */ ynh0 c;
            public final /* synthetic */ PlaceBetRequest d;
            public final /* synthetic */ kej e;

            /* JADX INFO: renamed from: ynh0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.redblack.viewmodels.UserActionViewModel$placeBetWithGPS$1$onPermissionGranted$1$1", f = "UserActionViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C1353a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ dq40<GPSData> a;
                public final /* synthetic */ kej b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1353a(dq40<GPSData> dq40Var, kej kejVar, v1b<? super C1353a> v1bVar) {
                    super(2, v1bVar);
                    this.a = dq40Var;
                    this.b = kejVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1353a(this.a, this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1353a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    kej kejVar = this.b;
                    this.a.a = kejVar != null ? kejVar.a() : 0;
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ynh0 ynh0Var, PlaceBetRequest placeBetRequest, kej kejVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = ynh0Var;
                this.d = placeBetRequest;
                this.e = kejVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.c, this.d, this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                dq40 dq40Var;
                y5b y5bVar = y5b.a;
                int i = this.b;
                if (i == 0) {
                    dq40 dq40VarA = j6w.a(obj);
                    pfd pfdVar = fse.a;
                    odd oddVar = odd.b;
                    C1353a c1353a = new C1353a(dq40VarA, this.e, null);
                    this.a = dq40VarA;
                    this.b = 1;
                    if (ej5.d(oddVar, c1353a, this) == y5bVar) {
                        return y5bVar;
                    }
                    dq40Var = dq40VarA;
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dq40Var = this.a;
                    uj50.b(obj);
                }
                GPSData gPSData = (GPSData) dq40Var.a;
                PlaceBetRequest placeBetRequest = this.d;
                if (gPSData != null) {
                    placeBetRequest.setGpsData(gPSData);
                }
                this.c.x1(placeBetRequest, true);
                return Unit.a;
            }
        }

        public b(PlaceBetRequest placeBetRequest, kej kejVar) {
            this.b = placeBetRequest;
            this.c = kejVar;
        }

        @Override // defpackage.poy
        public final void a() {
            ynh0 ynh0Var = ynh0.this;
            ej5.c(o8i0.d(ynh0Var), null, null, new a(ynh0Var, this.b, this.c, null), 3);
        }
    }

    public static final class c implements noy {
        public c() {
        }

        @Override // defpackage.noy
        public final void a(boolean z) {
            ynh0.this.b.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(Integer.valueOf(z ? 123450 : 123451), null, 2, null), null, null, 16, null));
        }
    }

    public final void x1(PlaceBetRequest placeBetRequest, boolean z) {
        this.c = placeBetRequest;
        Double betAmount = placeBetRequest.getBetAmount();
        if (betAmount != null) {
            placeBetRequest.setBetAmount(Double.valueOf(new BigDecimal(String.valueOf(betAmount.doubleValue())).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        }
        ej5.c(o8i0.d(this), null, null, new a(z, this, placeBetRequest, null), 3);
    }

    public final void y1(PlaceBetRequest placeBetRequest, e eVar) {
        this.b.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
        if (eVar instanceof GameMainActivity) {
            GameMainActivity gameMainActivity = (GameMainActivity) eVar;
            gameMainActivity.J1(new b(placeBetRequest, gameMainActivity.E), new c());
        }
    }
}
