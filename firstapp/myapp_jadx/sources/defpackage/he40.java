package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.recap.data.remote.dto.NetworkRecapConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.data.repository.RecapRepositoryImpl$getRecapConfig$2", f = "RecapRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class he40 extends tje0 implements Function2<v5b, v1b<? super ad40>, Object> {
    public int a;
    public final /* synthetic */ me40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he40(me40 me40Var, v1b<? super he40> v1bVar) {
        super(2, v1bVar);
        this.b = me40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new he40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ad40> v1bVar) {
        return ((he40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            t840 t840Var = this.b.a;
            this.a = 1;
            obj = t840Var.i(this);
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
        NetworkRecapConfig networkRecapConfig = (NetworkRecapConfig) n52.b((BaseResponse) obj);
        networkRecapConfig.getClass();
        Boolean recapEnabled = networkRecapConfig.getRecapEnabled();
        boolean zBooleanValue = recapEnabled != null ? recapEnabled.booleanValue() : false;
        Integer latestRecapYear = networkRecapConfig.getLatestRecapYear();
        return new ad40(zBooleanValue, latestRecapYear != null ? latestRecapYear.intValue() : 0, false);
    }
}
