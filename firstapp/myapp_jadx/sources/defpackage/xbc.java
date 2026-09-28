package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$loadCustomCodeList$getCodeFlagState$1", f = "CustomCodeUseCase.kt", l = {66, 69}, m = "invokeSuspend", v = 2)
public final class xbc extends tje0 implements Function1<v1b<? super j8c>, Object> {
    public boolean a;
    public int b;
    public final /* synthetic */ sbc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbc(sbc sbcVar, v1b<? super xbc> v1bVar) {
        super(1, v1bVar);
        this.c = sbcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new xbc(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super j8c> v1bVar) {
        return ((xbc) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        y5b y5bVar = y5b.a;
        int i = this.b;
        sbc sbcVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = sbcVar.f;
            this.b = 1;
            obj = m2lVar.a.getBoolean("key_custom_code_was_created", false, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.a;
            uj50.b(obj);
        }
        return new j8c(z, ((Boolean) obj).booleanValue(), qq1.e(sbcVar.g, BOConfigParam.CodeHubCustomCodeCountLimit, 5));
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m2l m2lVar2 = sbcVar.f;
        this.a = zBooleanValue;
        this.b = 2;
        Object obj2 = m2lVar2.a.getBoolean("key_custom_code_edit_hint_watched", false, this);
        if (obj2 != y5bVar) {
            obj = obj2;
            z = zBooleanValue;
            return new j8c(z, ((Boolean) obj).booleanValue(), qq1.e(sbcVar.g, BOConfigParam.CodeHubCustomCodeCountLimit, 5));
        }
        return y5bVar;
    }
}
