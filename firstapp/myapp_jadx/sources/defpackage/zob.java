package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.crashInitiated.model.request.PlaceBetPayload;
import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import com.sportygames.crashInitiated.model.response.CrashInitiatedPlaceBetResponse;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import com.sportygames.crashInitiated.model.response.GameAvailableResponse;
import com.sportygames.crashInitiated.model.response.UserValidateResponse;
import com.sportygames.crashInitiated.model.response.WalletInfoResponse;
import com.sportygames.crashInitiated.remote.models.ChatRoomResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class zob extends j8i0 {
    public final ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> A;
    public final ssw<LoadingState<HTTPResponse<List<CrashInitiatedCoeffListResponse>>>> B;
    public final ssw<LoadingState<HTTPResponse<CrashInitiatedPlaceBetResponse>>> C;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> D;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> E;
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> F;
    public final tsm a;
    public Double b;
    public String c;
    public String d;
    public Function1<? super Boolean, Unit> e;
    public String f;
    public final ssw<LoadingState<HTTPResponse<WalletInfoResponse>>> i;
    public final ssw<LoadingState<HTTPResponse<WalletInfoResponse>>> v;
    public final ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> w;
    public final ssw<LoadingState<HTTPResponse<UserValidateResponse>>> y;
    public final ssw<LoadingState<HTTPResponse<DetailResponse>>> z;

    @c0d(c = "com.sportygames.crashInitiated.viewmodel.CrashInitiatedViewModel$getPromotionalGifts$1", f = "CrashInitiatedViewModel.kt", l = {509}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zob.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            zob zobVar = zob.this;
            ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> sswVar = zobVar.D;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                tsm tsmVar = zobVar.a;
                this.a = 1;
                obj = tsmVar.a(this);
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

    @c0d(c = "com.sportygames.crashInitiated.viewmodel.CrashInitiatedViewModel$getPromotionalGiftsV2$1", f = "CrashInitiatedViewModel.kt", l = {589}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zob.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            zob zobVar = zob.this;
            ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> sswVar = zobVar.E;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                tsm tsmVar = zobVar.a;
                this.a = 1;
                obj = tsmVar.a(this);
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

    @c0d(c = "com.sportygames.crashInitiated.viewmodel.CrashInitiatedViewModel$placeBet$1", f = "CrashInitiatedViewModel.kt", l = {459}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ zob c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ Double v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ GPSData y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, zob zobVar, String str, String str2, String str3, String str4, Double d, boolean z2, GPSData gPSData, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = zobVar;
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
            return new c(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            zob zobVar = this.c;
            if (i == 0) {
                uj50.b(obj);
                if (!this.b) {
                    zobVar.C.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                }
                tsm tsmVar = zobVar.a;
                PlaceBetPayload placeBetPayload = new PlaceBetPayload(this.d, this.e, this.f, this.i, this.v, this.w, this.y);
                this.a = 1;
                obj = tsmVar.b(placeBetPayload, this);
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
                zobVar.C.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                zobVar.C.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                ssw<LoadingState<HTTPResponse<CrashInitiatedPlaceBetResponse>>> sswVar = zobVar.C;
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public static final class d implements poy {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Double f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ kej h;

        @c0d(c = "com.sportygames.crashInitiated.viewmodel.CrashInitiatedViewModel$placeBetWithGPS$1$onPermissionGranted$1", f = "CrashInitiatedViewModel.kt", l = {406}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public dq40 a;
            public int b;
            public final /* synthetic */ zob c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;
            public final /* synthetic */ String f;
            public final /* synthetic */ String i;
            public final /* synthetic */ Double v;
            public final /* synthetic */ boolean w;
            public final /* synthetic */ kej y;

            /* JADX INFO: renamed from: zob$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.crashInitiated.viewmodel.CrashInitiatedViewModel$placeBetWithGPS$1$onPermissionGranted$1$1", f = "CrashInitiatedViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C1407a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ dq40<GPSData> a;
                public final /* synthetic */ kej b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1407a(dq40<GPSData> dq40Var, kej kejVar, v1b<? super C1407a> v1bVar) {
                    super(2, v1bVar);
                    this.a = dq40Var;
                    this.b = kejVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1407a(this.a, this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1407a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            public a(zob zobVar, String str, String str2, String str3, String str4, Double d, boolean z, kej kejVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = zobVar;
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
                    C1407a c1407a = new C1407a(dq40VarA, this.y, null);
                    this.a = dq40VarA;
                    this.b = 1;
                    if (ej5.d(oddVar, c1407a, this) == y5bVar) {
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
                this.c.A1(this.d, this.e, this.f, this.i, this.v, this.w, (GPSData) dq40Var.a, true);
                return Unit.a;
            }
        }

        public d(String str, String str2, String str3, String str4, Double d, boolean z, kej kejVar) {
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
            ej5.c(o8i0.d(zob.this), null, null, new a(zob.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null), 3);
        }
    }

    public static final class e implements noy {
        public e() {
        }

        @Override // defpackage.noy
        public final void a(boolean z) {
            zob.this.C.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(Integer.valueOf(z ? 123450 : 123451), null, 2, null), null, null, 16, null));
        }
    }

    public zob(tsm tsmVar) {
        tsmVar.getClass();
        this.a = tsmVar;
        this.e = new tob(0);
        this.i = new ssw<>();
        this.v = new ssw<>();
        this.w = new ssw<>();
        this.y = new ssw<>();
        this.z = new ssw<>();
        this.A = new ssw<>();
        this.B = new ssw<>();
        this.C = new ssw<>();
        this.D = new ssw<>();
        this.E = new ssw<>();
        new ssw();
        this.F = new ssw<>();
    }

    public final void A1(String str, String str2, String str3, String str4, Double d2, boolean z, GPSData gPSData, boolean z2) {
        str.getClass();
        str3.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        } else {
            ej5.c(o8i0.d(this), null, null, new c(z2, this, str3, str2, str, str4, d2, z, gPSData, null), 3);
        }
    }

    public final void C1(androidx.fragment.app.e eVar, Double d2, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str3.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            return;
        }
        this.C.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
        if (eVar instanceof GameMainActivity) {
            GameMainActivity gameMainActivity = (GameMainActivity) eVar;
            gameMainActivity.J1(new d(str, str2, str3, str4, d2, z, gameMainActivity.E), new e());
        }
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new bpb(this, null), 3);
    }
}
