package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.remote.entity.SocialFollowData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$loadStaticSuggestions$1", f = "SocialNetworkSearchViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class nea0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rea0 b;

    @c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$loadStaticSuggestions$1$1", f = "SocialNetworkSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<BaseResponse<List<? extends SocialFollowData>>, BaseResponse<List<? extends SocialFollowData>>, v1b<? super Pair<? extends List<? extends d9a0>, ? extends List<? extends d9a0>>>, Object> {
        public /* synthetic */ BaseResponse a;
        public /* synthetic */ BaseResponse b;
        public final /* synthetic */ rea0 c;

        /* JADX INFO: renamed from: nea0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0896a extends pf implements Function1<String, String> {
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String str) {
                String str2 = str;
                str2.getClass();
                return ((bnh0) this.a).e(str2);
            }
        }

        public static final /* synthetic */ class b extends pf implements Function1<String, String> {
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String str) {
                String str2 = str;
                str2.getClass();
                return ((bnh0) this.a).e(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rea0 rea0Var, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.c = rea0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(BaseResponse<List<? extends SocialFollowData>> baseResponse, BaseResponse<List<? extends SocialFollowData>> baseResponse2, v1b<? super Pair<? extends List<? extends d9a0>, ? extends List<? extends d9a0>>> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.a = baseResponse;
            aVar.b = baseResponse2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BaseResponse baseResponse = this.a;
            BaseResponse baseResponse2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            List list = (List) baseResponse.data;
            rea0 rea0Var = this.c;
            return new Pair(zfa0.a(list, new b(1, rea0Var.f, bnh0.class, "getResourcesUrl", "getResourcesUrl([Ljava/lang/String;)Ljava/lang/String;", 2)), zfa0.a((List) baseResponse2.data, new C0896a(1, rea0Var.f, bnh0.class, "getResourcesUrl", "getResourcesUrl([Ljava/lang/String;)Ljava/lang/String;", 2)));
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ rea0 a;

        public b(rea0 rea0Var) {
            this.a = rea0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Pair pair = (Pair) obj;
            List list = (List) pair.a;
            List list2 = (List) pair.b;
            wwd0 wwd0Var = this.a.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, mea0.a((mea0) value, a4h.f(list), a4h.f(list2), null, false, 44)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nea0(rea0 rea0Var, v1b<? super nea0> v1bVar) {
        super(2, v1bVar);
        this.b = rea0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nea0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nea0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rea0 rea0Var = this.b;
        vga0 vga0Var = rea0Var.e;
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lyh lyhVarH = vga0.h(vga0Var, 3, null, 5);
            lyh lyhVarJ = vga0.j(vga0Var, 3, null, 5);
            a aVar = new a(rea0Var, null);
            b bVar = new b(rea0Var);
            this.a = 1;
            Object objA = r78.a(this, bVar, new o1i(aVar, null), q1i.a, new lyh[]{lyhVarH, lyhVarJ});
            if (objA != y5b.a) {
                objA = Unit.a;
            }
            if (objA == obj2) {
                return obj2;
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
