package defpackage;

import com.sportygames.chat.remote.models.NextRainResponse;
import com.sportygames.chat.remote.models.RainClaimInfoResponse;
import com.sportygames.chat.remote.models.RainDetailInfoResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.ResultChatWrapper;
import com.sportygames.commons.remote.model.StatusChat;
import com.sportygames.crash.models.RainUiAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class lw30 extends j8i0 {
    public final ssw<RainUiAction> A;
    public final ssw B;
    public final vv30 a;
    public final xc7 b;
    public final ssw<LoadingStateChat<HTTPResponse<NextRainResponse>>> c;
    public final ssw<LoadingStateChat<HTTPResponse<NextRainResponse>>> d;
    public final ssw<LoadingStateChat<HTTPResponse<RainClaimInfoResponse>>> e;
    public final ssw<LoadingStateChat<HTTPResponse<RainDetailInfoResponse>>> f;
    public final ssw<LoadingStateChat<HTTPResponse<RainClaimInfoResponse>>> i;
    public final ssw<LoadingStateChat<HTTPResponse<RainClaimInfoResponse>>> v;
    public final ssw<LoadingStateChat<HTTPResponse<RainClaimInfoResponse>>> w;
    public final ssw<RainDetailInfoResponse> y;
    public final ssw z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StatusChat.values().length];
            try {
                iArr[StatusChat.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusChat.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportygames.chat.viewmodels.RainViewModel$getRainClaimInfo$1", f = "RainViewModel.kt", l = {77}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return lw30.this.new b(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lw30 lw30Var = lw30.this;
            ssw<LoadingStateChat<HTTPResponse<RainClaimInfoResponse>>> sswVar = lw30Var.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingStateChat<>(StatusChat.RUNNING, null, null, null));
                xc7 xc7Var = lw30Var.b;
                this.a = 1;
                xc7Var.getClass();
                obj = xc7.a(this.d, this);
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
            ResultChatWrapper resultChatWrapper = (ResultChatWrapper) obj;
            if (resultChatWrapper instanceof ResultChatWrapper.Success) {
                sswVar.j(new LoadingStateChat<>(StatusChat.SUCCESS, ((ResultChatWrapper.Success) resultChatWrapper).getValue(), null, null));
            } else if (resultChatWrapper instanceof ResultChatWrapper.NetworkError) {
                sswVar.j(new LoadingStateChat<>(StatusChat.FAILED, null, null, (ResultChatWrapper.NetworkError) resultChatWrapper));
            } else {
                sswVar.j(new LoadingStateChat<>(StatusChat.FAILED, null, resultChatWrapper instanceof ResultChatWrapper.GenericError ? (ResultChatWrapper.GenericError) resultChatWrapper : null, null));
            }
            return Unit.a;
        }
    }

    public lw30(vv30 vv30Var) {
        vv30Var.getClass();
        this.a = vv30Var;
        this.b = new xc7();
        this.c = new ssw<>();
        this.d = new ssw<>();
        this.e = new ssw<>();
        this.f = new ssw<>();
        this.i = new ssw<>();
        this.v = new ssw<>();
        this.w = new ssw<>();
        ssw<RainDetailInfoResponse> sswVar = new ssw<>();
        this.y = sswVar;
        this.z = sswVar;
        ssw<RainUiAction> sswVar2 = new ssw<>();
        this.A = sswVar2;
        this.B = sswVar2;
    }

    public final void x1(String str, String str2) {
        ej5.c(o8i0.d(this), null, null, new b(str, str2, null), 3);
    }
}
