package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class w1b implements Callback, Function1<Throwable, Unit> {
    public final Call a;
    public final bc6 b;

    public w1b(Call call, bc6 bc6Var) {
        this.a = call;
        this.b = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        try {
            this.a.cancel();
        } catch (Throwable unused) {
        }
        return Unit.a;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        if (call.getG()) {
            return;
        }
        zi50.a aVar = zi50.b;
        this.b.resumeWith(uj50.a(iOException));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        zi50.a aVar = zi50.b;
        this.b.resumeWith(response);
    }
}
