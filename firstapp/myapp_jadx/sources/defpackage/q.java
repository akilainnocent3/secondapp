package defpackage;

import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends j8i0 {
    public final gz a = new gz();
    public final ssw<LoadingState<HTTPResponse<CampaignParticipateV2>>> b = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<Unit>>> c = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<Unit>>> d = new ssw<>();

    @c0d(c = "com.sportygames.commons.viewmodels.ANTestViewModel$fetchCampaign$1", f = "ANTestViewModel.kt", l = {30}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return q.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            q qVar = q.this;
            ssw<LoadingState<HTTPResponse<CampaignParticipateV2>>> sswVar = qVar.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                gz gzVar = qVar.a;
                this.a = 1;
                obj = gzVar.a(this.c, this);
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
                if (!(resultWrapper instanceof ResultWrapper.GenericError)) {
                    uhc.a();
                    return null;
                }
                sswVar.j(new LoadingState<>(Status.FAILED, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.viewmodels.ANTestViewModel$sendConvertData$1", f = "ANTestViewModel.kt", l = {93}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Integer e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ Double v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num, String str, Integer num2, String str2, String str3, Double d, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = num;
            this.d = str;
            this.e = num2;
            this.f = str2;
            this.i = str3;
            this.v = d;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return q.this.new b(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            q qVar = q.this;
            ssw<LoadingState<HTTPResponse<Unit>>> sswVar = qVar.d;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                gz gzVar = qVar.a;
                this.a = 1;
                obj = gzVar.b(this.c, this.d, this.e, this.f, this.i, this.v, this);
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
                sswVar.j(new LoadingState<>(Status.SUCCESS, null, null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                if (!(resultWrapper instanceof ResultWrapper.GenericError)) {
                    uhc.a();
                    return null;
                }
                sswVar.j(new LoadingState<>(Status.FAILED, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public final void x1(String str) {
        this.b.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
        ej5.c(o8i0.d(this), null, null, new a(str, null), 3);
    }

    public final void y1(Integer num, String str, Integer num2, Double d, String str2, String str3) {
        this.d.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
        ej5.c(o8i0.d(this), null, null, new b(num, str, num2, str2, str3, d, null), 3);
    }
}
