package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ln0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ln0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mpe0 mpe0Var = on0.a;
                on0.t();
                OkHttpClient okHttpClientJ = on0.j();
                on50.b bVar = new on50.b();
                bVar.a(SportyGamesManager.getInstance().getBaseUrlCMS());
                bVar.c(okHttpClientJ);
                fal falVarC = fal.c();
                ArrayList arrayList = bVar.c;
                arrayList.add(falVarC);
                arrayList.add(i5w.c());
                arrayList.add(new uy60());
                return (qm5) bVar.b().a(qm5.class);
            default:
                return Unit.a;
        }
    }
}
