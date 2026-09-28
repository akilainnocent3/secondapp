package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.AddFavouriteRequest;
import com.sportygames.lobby.remote.models.AddFavouriteResponse;
import com.sportygames.lobby.remote.models.BannerDetailResponse;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.NotificationResponse;
import com.sportygames.lobby.remote.models.SearchResultResponse;
import com.sportygames.lobby.remote.models.UpdateFavouriteRequest;
import com.sportygames.lobby.remote.models.WalletInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ljct;", "Lj8i0;", "<init>", "()V", "a", "b", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jct extends j8i0 {
    public final ssw<LoadingState<HTTPResponse<List<CategoriesResponse>>>> A;
    public Integer B;
    public Integer C;
    public Integer D;
    public final ssw<iuj> E;
    public final ssw<nah> F;
    public final ssw<LoadingState<HTTPResponse<List<BannerDetailResponse>>>> G;
    public final ssw<LoadingState<HTTPResponse<GameDetails>>> H;
    public final ssw<LoadingState<HTTPResponse<SearchResultResponse>>> I;
    public final znz.c J;
    public final znz.c K;
    public final uxi0 a;
    public final ssw<LoadingState<HTTPResponse<WalletInfo>>> b;
    public final ssw<LoadingState<HTTPResponse<AddFavouriteResponse>>> c;
    public ssw<LoadingState<List<GameDetails>>> d;
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> e;
    public ssw<LoadingState<List<GameDetails>>> f;
    public final ssw<LoadingState<HTTPResponse<List<NotificationResponse>>>> i;
    public ssw<LoadingState<List<GameDetails>>> v;
    public brs w;
    public brs y;
    public brs z;

    /* JADX INFO: loaded from: classes.dex */
    public static final class a<T> extends l620<T> {
        public final ArrayList c;

        public a(ArrayList arrayList) {
            super(aqc.f.a);
            this.c = arrayList;
        }
    }

    public static final class b implements Executor {
        public final Handler a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            this.a.post(runnable);
        }
    }

    @c0d(c = "com.sportygames.lobby.viewmodels.LobbyViewModel$deleteFavourite$1", f = "LobbyViewModel.kt", l = {209}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AddFavouriteRequest c;
        public final /* synthetic */ Map<String, String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AddFavouriteRequest addFavouriteRequest, Map<String, String> map, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = addFavouriteRequest;
            this.d = map;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jct.this.new c(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jct jctVar = jct.this;
            ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar = jctVar.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = jctVar.a;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new kxi0(this.c, null), null), this);
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
                if (((List) ((HTTPResponse) success.getValue()).getData()) != null) {
                    sswVar.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, this.d));
                }
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, this.d));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, this.d));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.lobby.viewmodels.LobbyViewModel$getBannerInfo$1", f = "LobbyViewModel.kt", l = {460}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jct.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jct jctVar = jct.this;
            ssw<LoadingState<HTTPResponse<List<BannerDetailResponse>>>> sswVar = jctVar.G;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = jctVar.a;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new lxi0(1, null), null), this);
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

    @c0d(c = "com.sportygames.lobby.viewmodels.LobbyViewModel$getCategoriesList$1", f = "LobbyViewModel.kt", l = {301}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jct.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jct jctVar = jct.this;
            ssw<LoadingState<HTTPResponse<List<CategoriesResponse>>>> sswVar = jctVar.A;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = jctVar.a;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new mxi0(1, null), null), this);
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

    @c0d(c = "com.sportygames.lobby.viewmodels.LobbyViewModel$getGameByName$1", f = "LobbyViewModel.kt", l = {501}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jct.this.new f(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jct jctVar = jct.this;
            ssw<LoadingState<HTTPResponse<GameDetails>>> sswVar = jctVar.H;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = jctVar.a;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new oxi0(this.c, null), null), this);
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

    @c0d(c = "com.sportygames.lobby.viewmodels.LobbyViewModel$getNotification$1", f = "LobbyViewModel.kt", l = {257}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jct.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jct jctVar = jct.this;
            ssw<LoadingState<HTTPResponse<List<NotificationResponse>>>> sswVar = jctVar.i;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = jctVar.a;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new qxi0(25, 0, null), null), this);
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

    @c0d(c = "com.sportygames.lobby.viewmodels.LobbyViewModel$getSearchResult$1", f = "LobbyViewModel.kt", l = {542}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jct.this.new h(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jct jctVar = jct.this;
            ssw<LoadingState<HTTPResponse<SearchResultResponse>>> sswVar = jctVar.I;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = jctVar.a;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new rxi0(this.c, null), null), this);
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

    public jct() {
        uxi0 uxi0Var = new uxi0();
        this.a = uxi0Var;
        this.b = new ssw<>();
        this.c = new ssw<>();
        this.d = new ssw<>();
        this.e = new ssw<>();
        this.f = new ssw<>();
        this.i = new ssw<>();
        this.v = new ssw<>();
        this.A = new ssw<>();
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.G = new ssw<>();
        this.H = new ssw<>();
        this.I = new ssw<>();
        xwd0.a(Boolean.FALSE);
        znz.c.a aVar = new znz.c.a();
        aVar.b(20);
        aVar.d = false;
        znz.c cVarA = aVar.a();
        this.J = cVarA;
        znz.c.a aVar2 = new znz.c.a();
        aVar2.b(20);
        aVar2.d = false;
        this.K = aVar2.a();
        this.E = new ssw<>();
        this.F = new ssw<>();
        new ssw();
        nct nctVar = new nct(this, uxi0Var);
        ew0 ew0Var = fw0.f;
        k5b k5bVarA = gf8.a(ew0Var);
        vje0 vje0Var = new vje0(k5bVarA, new ypc(k5bVarA, nctVar));
        dw0 dw0Var = fw0.e;
        this.w = new brs(cVarA, vje0Var, gf8.a(dw0Var), k5bVarA);
        mct mctVar = new mct(this, uxi0Var);
        k5b k5bVarA2 = gf8.a(ew0Var);
        this.y = new brs(cVarA, new vje0(k5bVarA2, new ypc(k5bVarA2, mctVar)), gf8.a(dw0Var), k5bVarA2);
        this.I = new ssw<>();
    }

    public static u1b y1(ArrayList arrayList, znz.c cVar) {
        a aVar = new a(arrayList);
        k5b k5bVarA = gf8.a(new b());
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        executor.getClass();
        k5b k5bVarA2 = gf8.a(executor);
        u5s u5sVar = new u5s(k5bVarA2, aVar);
        u5sVar.a(cVar.a);
        int i = znz.w;
        return znz.b.a(k5bVarA, k5bVarA2, q2l.a, cVar, null, u5sVar, null);
    }

    public final void A1() {
        ej5.c(o8i0.d(this), null, null, new e(null), 3);
    }

    public final void B1(String str) {
        str.getClass();
        ej5.c(o8i0.d(this), null, null, new f(str, null), 3);
    }

    public final void C1() {
        ej5.c(o8i0.d(this), null, null, new g(null), 3);
    }

    public final void D1(String str) {
        str.getClass();
        ej5.c(o8i0.d(this), null, null, new h(str, null), 3);
    }

    public final void E1(ibs ibsVar, int i) {
        ibsVar.getClass();
        this.D = Integer.valueOf(i);
        nah nahVarD = this.F.d();
        if (nahVarD != null) {
            nahVarD.b.a();
        }
        mct mctVar = new mct(this, this.a);
        znz.c cVar = this.J;
        cVar.getClass();
        k5b k5bVarA = gf8.a(fw0.f);
        this.y = new brs(cVar, new vje0(k5bVarA, new ypc(k5bVarA, mctVar)), gf8.a(fw0.e), k5bVarA);
    }

    public final void F1(UpdateFavouriteRequest updateFavouriteRequest) {
        znz.c cVar = this.K;
        cVar.getClass();
        oct octVar = new oct(this, updateFavouriteRequest);
        k5b k5bVarA = gf8.a(fw0.f);
        this.z = new brs(cVar, new vje0(k5bVarA, new ypc(k5bVarA, octVar)), gf8.a(fw0.e), k5bVarA);
    }

    public final void x1(AddFavouriteRequest addFavouriteRequest, Map<String, String> map) {
        ej5.c(o8i0.d(this), null, null, new c(addFavouriteRequest, map, null), 3);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new d(null), 3);
    }
}
