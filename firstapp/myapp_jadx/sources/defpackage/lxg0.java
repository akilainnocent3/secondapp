package defpackage;

import com.sporty.android.platform.features.newotp.model.AuthenticationMethodData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class lxg0<T> implements myh {
    public final /* synthetic */ g7z.a a;

    public lxg0(g7z.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        lk50<? extends AuthenticationMethodData> lk50Var = (lk50) obj;
        itf0.a aVar = itf0.a;
        aVar.q("George");
        aVar.a("results = " + lk50Var, new Object[0]);
        this.a.invoke(lk50Var);
        return Unit.a;
    }
}
