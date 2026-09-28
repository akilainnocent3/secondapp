package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.service.CountryCodeName;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
public final class ysh implements anh0 {
    public final k650 a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"m650", "Lcom/google/gson/reflect/TypeToken;", "injection"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<Map<CountryCodeName, ? extends f750>> {
    }

    public ysh(k650 k650Var) {
        k650Var.getClass();
        this.a = k650Var;
    }

    @Override // defpackage.anh0
    public final lyh<Map<CountryCodeName, f750>> a() {
        Type type = new a().getType();
        type.getClass();
        return this.a.d(type);
    }
}
