package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$loadSuggestedList$1", f = "SocialNetworkSuggestedViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class mfa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kfa0 b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ kfa0 a;

        public a(kfa0 kfa0Var) {
            this.a = kfa0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            kfa0 kfa0Var = this.a;
            kfa0Var.getClass();
            kfa0Var.y1(new pfa0((BaseResponse) obj, kfa0Var, null));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfa0(kfa0 kfa0Var, String str, v1b<? super mfa0> v1bVar) {
        super(2, v1bVar);
        this.b = kfa0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mfa0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mfa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kfa0 kfa0Var = this.b;
            lyh lyhVarH = vga0.h(kfa0Var.e, 20, this.c, 1);
            a aVar = new a(kfa0Var);
            this.a = 1;
            if (lyhVarH.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
