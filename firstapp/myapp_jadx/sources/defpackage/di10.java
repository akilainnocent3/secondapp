package defpackage;

import androidx.fragment.app.e;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.spindabottle.remote.models.PlaceBetRequest;
import com.sportygames.spindabottle.remote.models.PlaceBetResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi10;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class di10 extends j8i0 {
    public final d6b0 a = d6b0.a;
    public final ssw<LoadingState<HTTPResponse<PlaceBetResponse>>> b = new ssw<>();

    public static final class a implements poy {
        public final /* synthetic */ PlaceBetRequest b;
        public final /* synthetic */ kej c;

        /* JADX INFO: renamed from: di10$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.spindabottle.viewmodels.PlaceBetViewModel$placeBetWithGPS$1$onPermissionGranted$1", f = "PlaceBetViewModel.kt", l = {40}, m = "invokeSuspend", v = 1)
        public static final class C0486a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public dq40 a;
            public int b;
            public final /* synthetic */ di10 c;
            public final /* synthetic */ PlaceBetRequest d;
            public final /* synthetic */ kej e;

            /* JADX INFO: renamed from: di10$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.spindabottle.viewmodels.PlaceBetViewModel$placeBetWithGPS$1$onPermissionGranted$1$1", f = "PlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0487a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ dq40<GPSData> a;
                public final /* synthetic */ kej b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0487a(dq40<GPSData> dq40Var, kej kejVar, v1b<? super C0487a> v1bVar) {
                    super(2, v1bVar);
                    this.a = dq40Var;
                    this.b = kejVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0487a(this.a, this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0487a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            public C0486a(di10 di10Var, PlaceBetRequest placeBetRequest, kej kejVar, v1b<? super C0486a> v1bVar) {
                super(2, v1bVar);
                this.c = di10Var;
                this.d = placeBetRequest;
                this.e = kejVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0486a(this.c, this.d, this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0486a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                    C0487a c0487a = new C0487a(dq40VarA, this.e, null);
                    this.a = dq40VarA;
                    this.b = 1;
                    if (ej5.d(oddVar, c0487a, this) == y5bVar) {
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
                di10 di10Var = this.c;
                ej5.c(o8i0.d(di10Var), null, null, new bi10(true, di10Var, placeBetRequest, null), 3);
                return Unit.a;
            }
        }

        public a(PlaceBetRequest placeBetRequest, kej kejVar) {
            this.b = placeBetRequest;
            this.c = kejVar;
        }

        @Override // defpackage.poy
        public final void a() {
            di10 di10Var = di10.this;
            ej5.c(o8i0.d(di10Var), null, null, new C0486a(di10Var, this.b, this.c, null), 3);
        }
    }

    public static final class b implements noy {
        public b() {
        }

        @Override // defpackage.noy
        public final void a(boolean z) {
            di10.this.b.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(Integer.valueOf(z ? 123450 : 123451), null, 2, null), null, null, 16, null));
        }
    }

    public static void x1(di10 di10Var, PlaceBetRequest placeBetRequest) {
        di10Var.getClass();
        ej5.c(o8i0.d(di10Var), null, null, new bi10(false, di10Var, placeBetRequest, null), 3);
    }

    public final void y1(PlaceBetRequest placeBetRequest, e eVar) {
        this.b.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
        if (eVar instanceof GameMainActivity) {
            GameMainActivity gameMainActivity = (GameMainActivity) eVar;
            gameMainActivity.J1(new a(placeBetRequest, gameMainActivity.E), new b());
        }
    }
}
