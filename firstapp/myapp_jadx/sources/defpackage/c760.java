package defpackage;

import androidx.fragment.app.e;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.rush.model.entity.DetailResponseEntity;
import com.sportygames.rush.model.request.PlaceBetPayload;
import com.sportygames.rush.model.response.ChatRoomResponse;
import com.sportygames.rush.model.response.GameAvailableResponse;
import com.sportygames.rush.model.response.RushCoeffListResponse;
import com.sportygames.rush.model.response.RushPlaceBetResponse;
import com.sportygames.rush.model.response.UserValidateResponse;
import com.sportygames.rush.model.response.WalletInfoResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc760;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c760 extends j8i0 {
    public Double b;
    public String c;
    public String d;
    public String e;
    public final w660 a = w660.a;
    public final ssw<LoadingState<HTTPResponse<WalletInfoResponse>>> f = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<WalletInfoResponse>>> i = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> v = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<UserValidateResponse>>> w = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<DetailResponseEntity>>> y = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> z = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<RushCoeffListResponse>>>> A = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<RushPlaceBetResponse>>> B = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> C = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> D = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<WalletInfoResponse>>> E = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> F = new ssw<>();

    @c0d(c = "com.sportygames.rush.viewmodel.RushViewModel$getPromotionalGifts$1", f = "RushViewModel.kt", l = {509}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c760.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c760 c760Var = c760.this;
            ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> sswVar = c760Var.C;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                w660 w660Var = c760Var.a;
                this.a = 1;
                w660Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new r660(1, null), null), this);
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

    @c0d(c = "com.sportygames.rush.viewmodel.RushViewModel$placeBet$1", f = "RushViewModel.kt", l = {460}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ c760 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ Double v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ GPSData y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, c760 c760Var, String str, String str2, String str3, String str4, Double d, boolean z2, GPSData gPSData, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = c760Var;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.i = str4;
            this.v = d;
            this.w = z2;
            this.y = gPSData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            c760 c760Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                if (!this.b) {
                    c760Var.B.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                }
                w660 w660Var = c760Var.a;
                PlaceBetPayload placeBetPayload = new PlaceBetPayload(this.d, this.e, this.f, this.i, this.v, this.w, this.y);
                this.a = 1;
                w660Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new t660(placeBetPayload, null), null), this);
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
                c760Var.B.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                c760Var.B.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                ssw<LoadingState<HTTPResponse<RushPlaceBetResponse>>> sswVar = c760Var.B;
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public static final class c implements poy {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Double f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ kej h;

        @c0d(c = "com.sportygames.rush.viewmodel.RushViewModel$placeBetWithGPS$1$onPermissionGranted$1", f = "RushViewModel.kt", l = {407}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public dq40 a;
            public int b;
            public final /* synthetic */ c760 c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;
            public final /* synthetic */ String f;
            public final /* synthetic */ String i;
            public final /* synthetic */ Double v;
            public final /* synthetic */ boolean w;
            public final /* synthetic */ kej y;

            /* JADX INFO: renamed from: c760$c$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.rush.viewmodel.RushViewModel$placeBetWithGPS$1$onPermissionGranted$1$1", f = "RushViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0155a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ dq40<GPSData> a;
                public final /* synthetic */ kej b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0155a(dq40<GPSData> dq40Var, kej kejVar, v1b<? super C0155a> v1bVar) {
                    super(2, v1bVar);
                    this.a = dq40Var;
                    this.b = kejVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0155a(this.a, this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0155a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            public a(c760 c760Var, String str, String str2, String str3, String str4, Double d, boolean z, kej kejVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = c760Var;
                this.d = str;
                this.e = str2;
                this.f = str3;
                this.i = str4;
                this.v = d;
                this.w = z;
                this.y = kejVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
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
                    C0155a c0155a = new C0155a(dq40VarA, this.y, null);
                    this.a = dq40VarA;
                    this.b = 1;
                    if (ej5.d(oddVar, c0155a, this) == y5bVar) {
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
                this.c.z1(this.d, this.e, this.f, this.i, this.v, this.w, (GPSData) dq40Var.a, true);
                return Unit.a;
            }
        }

        public c(String str, String str2, String str3, String str4, Double d, boolean z, kej kejVar) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = d;
            this.g = z;
            this.h = kejVar;
        }

        @Override // defpackage.poy
        public final void a() {
            ej5.c(o8i0.d(c760.this), null, null, new a(c760.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null), 3);
        }
    }

    public static final class d implements noy {
        public d() {
        }

        @Override // defpackage.noy
        public final void a(boolean z) {
            c760.this.B.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(Integer.valueOf(z ? 123450 : 123451), null, 2, null), null, null, 16, null));
        }
    }

    public final void A1(e eVar, Double d2, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str3.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            return;
        }
        this.B.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
        if (eVar instanceof GameMainActivity) {
            GameMainActivity gameMainActivity = (GameMainActivity) eVar;
            gameMainActivity.J1(new c(str, str2, str3, str4, d2, z, gameMainActivity.E), new d());
        }
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new f760(this, null), 3);
    }

    public final void z1(String str, String str2, String str3, String str4, Double d2, boolean z, GPSData gPSData, boolean z2) {
        str.getClass();
        str3.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        } else {
            ej5.c(o8i0.d(this), null, null, new b(z2, this, str3, str2, str, str4, d2, z, gPSData, null), 3);
        }
    }
}
