package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.CampaignRepository$collectGifts$2", f = "CampaignRepository.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 1)
public final class f86 extends tje0 implements Function1<v1b<? super HTTPResponse<String>>, Object> {
    public int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f86(int i, v1b<? super f86> v1bVar) {
        super(1, v1bVar);
        this.b = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new f86(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<String>> v1bVar) {
        return ((f86) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        mpe0 mpe0Var = on0.a;
        Object value = on0.c.getValue();
        value.getClass();
        this.a = 1;
        Object objC = ((e46) value).c(this.b, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
