package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$loadWinnerList$1", f = "SocialNetworkSuggestedViewModel.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class nfa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
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
            kfa0Var.y1(new pfa0((BaseResponse) obj, kfa0Var, null));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfa0(kfa0 kfa0Var, String str, v1b<? super nfa0> v1bVar) {
        super(2, v1bVar);
        this.b = kfa0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nfa0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nfa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kfa0 kfa0Var = this.b;
            vga0 vga0Var = kfa0Var.e;
            String str = this.c;
            lyh lyhVarJ = vga0.j(vga0Var, 20, str.length() > 0 ? str : null, 1);
            a aVar = new a(kfa0Var);
            this.a = 1;
            if (lyhVarJ.collect(aVar, this) == y5bVar) {
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
