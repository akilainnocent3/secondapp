package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl$isTokenPresent$2", f = "BiometricCryptoRepositoryImpl.kt", l = {156, 159}, m = "invokeSuspend", v = 2)
public final class tc4 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ yc4 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc4(yc4 yc4Var, String str, v1b<? super tc4> v1bVar) {
        super(2, v1bVar);
        this.c = yc4Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tc4(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((tc4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        Boolean bool;
        boolean zBooleanValue;
        m2l m2lVar = this.c.c;
        y5b y5bVar = y5b.a;
        int i2 = this.b;
        String str = this.d;
        boolean z = false;
        if (i2 == 0) {
            uj50.b(obj);
            zn20.a aVar = new zn20.a("biometric_token_" + str);
            m2lVar.getClass();
            lyh<Boolean> lyhVarG = m2lVar.a.g(aVar);
            this.b = 1;
            obj = s0i.c(lyhVarG, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(obj);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.a;
            uj50.b(obj);
        }
        bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (i != 0 && zBooleanValue) {
            z = true;
        }
        return Boolean.valueOf(z);
        Boolean bool2 = (Boolean) obj;
        ?? BooleanValue = bool2 != null ? bool2.booleanValue() : 0;
        zn20.a aVar2 = new zn20.a(inm.a("biometric_token_iv_", str));
        m2lVar.getClass();
        lyh<Boolean> lyhVarG2 = m2lVar.a.g(aVar2);
        this.a = BooleanValue;
        this.b = 2;
        Object objC = s0i.c(lyhVarG2, this);
        if (objC != y5bVar) {
            ?? r7 = BooleanValue;
            obj = objC;
            i = r7 == true ? 1 : 0;
            bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (i != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return y5bVar;
    }
}
