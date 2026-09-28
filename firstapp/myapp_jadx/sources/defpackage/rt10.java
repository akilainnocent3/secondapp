package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getWithdrawMomoSavedAssets$1", f = "PocketRepositoryImpl.kt", l = {688}, m = "invokeSuspend", v = 2)
public final class rt10 extends tje0 implements Function1<v1b<? super AssetData>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt10(ms10 ms10Var, v1b<? super rt10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new rt10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super AssetData> v1bVar) {
        return ((rt10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ms10 ms10Var = this.b;
            int i2 = a.a[ms10Var.d.getCountryCode().ordinal()] == 1 ? 1 : 2;
            pr10 pr10Var = ms10Var.a;
            this.a = 1;
            obj = pr10Var.h0(4, i2, this);
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
        return n52.b((BaseResponse) obj);
    }
}
