package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$loadCustomCodeList$getUserInfoResult$1", f = "CustomCodeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zbc extends tje0 implements Function2<Boolean, v1b<? super lyh<? extends lk50<? extends sbc.a>>>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ sbc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbc(sbc sbcVar, v1b<? super zbc> v1bVar) {
        super(2, v1bVar);
        this.b = sbcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zbc zbcVar = new zbc(this.b, v1bVar);
        zbcVar.a = ((Boolean) obj).booleanValue();
        return zbcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super lyh<? extends lk50<? extends sbc.a>>> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((zbc) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return bm50.m(this.b.d.a(pu0.c.a), new Function1() { // from class: ybc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                AccountInfo accountInfo = (AccountInfo) obj2;
                String nickname = accountInfo.getNickname();
                boolean z2 = false;
                if (z) {
                    Boolean boolIsCreator = accountInfo.isCreator();
                    if (boolIsCreator != null ? boolIsCreator.booleanValue() : false) {
                        z2 = true;
                    }
                }
                return new sbc.a(nickname, z2);
            }
        });
    }
}
