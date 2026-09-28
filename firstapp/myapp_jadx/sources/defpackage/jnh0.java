package defpackage;

import android.accounts.Account;
import android.os.Build;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.network.web.UrlTool$createHeadersSync$1", f = "UrlTool.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jnh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ LinkedHashMap a;
    public final /* synthetic */ knh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnh0(LinkedHashMap linkedHashMap, knh0 knh0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.a = linkedHashMap;
        this.b = knh0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jnh0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jnh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String password;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        knh0 knh0Var = this.b;
        String str = knh0Var.b.a().a;
        LinkedHashMap linkedHashMap = this.a;
        linkedHashMap.put("DeviceId", str);
        uqm uqmVar = knh0Var.a;
        String lastAccessToken = uqmVar.getLastAccessToken();
        if (lastAccessToken != null && lastAccessToken.length() != 0) {
            linkedHashMap.put("Authorization", lastAccessToken);
        }
        Account account = uqmVar.getAccount();
        if (account != null && (password = knh0Var.v.getPassword(account)) != null) {
            linkedHashMap.put("RefreshToken", password);
        }
        linkedHashMap.put("Platform", "wap");
        linkedHashMap.put("ClientId", "app");
        linkedHashMap.put("PhoneModel", Build.MODEL);
        linkedHashMap.put("AppVersion", knh0Var.i.b().a());
        linkedHashMap.put("ApiLevel", "13");
        linkedHashMap.put("OperId", knh0Var.c.k());
        return Unit.a;
    }
}
