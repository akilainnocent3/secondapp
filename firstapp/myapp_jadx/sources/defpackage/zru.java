package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.json.JsonSerializeService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class zru {
    public final v5b a;
    public final w5k b;
    public final uqm c;
    public final rym d;
    public final JsonSerializeService e;
    public final AtomicBoolean f;
    public jvd0 g;

    public zru(@ApplicationScope v5b v5bVar, w5k w5kVar, uqm uqmVar, rym rymVar, JsonSerializeService jsonSerializeService) {
        v5bVar.getClass();
        uqmVar.getClass();
        rymVar.getClass();
        jsonSerializeService.getClass();
        this.a = v5bVar;
        this.b = w5kVar;
        this.c = uqmVar;
        this.d = rymVar;
        this.e = jsonSerializeService;
        this.f = new AtomicBoolean(false);
        uqmVar.addLogoutEventListener(new fjt() { // from class: xru
            @Override // defpackage.fjt
            public final void p() {
                zru zruVar = this.a;
                jvd0 jvd0Var = zruVar.g;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                zruVar.g = null;
                zruVar.f.set(false);
            }
        });
    }
}
