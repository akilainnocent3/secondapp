package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.remote.entity.SocialFollowData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$processResponse$1", f = "SocialNetworkSuggestedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pfa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ BaseResponse<List<SocialFollowData>> a;
    public final /* synthetic */ kfa0 b;

    public static final /* synthetic */ class a extends pf implements Function1<String, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String str2 = str;
            str2.getClass();
            return ((bnh0) this.a).e(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfa0(BaseResponse<List<SocialFollowData>> baseResponse, kfa0 kfa0Var, v1b<? super pfa0> v1bVar) {
        super(2, v1bVar);
        this.a = baseResponse;
        this.b = kfa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pfa0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pfa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<SocialFollowData> list = this.a.data;
        kfa0 kfa0Var = this.b;
        List<d9a0> listA = zfa0.a(list, new a(1, kfa0Var.f, bnh0.class, "getResourcesUrl", "getResourcesUrl([Ljava/lang/String;)Ljava/lang/String;", 2));
        boolean zIsEmpty = listA.isEmpty();
        wwd0 wwd0Var = kfa0Var.a;
        if (zIsEmpty) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, jfa0.a((jfa0) value2, null, null, true, 0, 19)));
        } else {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, jfa0.a((jfa0) value, listA, null, false, 0, 18)));
        }
        return Unit.a;
    }
}
