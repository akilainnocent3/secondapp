package defpackage;

import com.sporty.android.platform.features.newotp.model.OtpAuthenticationData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class e7z<T> implements myh {
    public final /* synthetic */ c7z<T> a;

    public e7z(c7z<T> c7zVar) {
        this.a = c7zVar;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        lk50 lk50Var = (lk50) obj;
        boolean z = lk50Var instanceof lk50.b;
        c7z<T> c7zVar = this.a;
        if (z) {
            c7zVar.f.setValue(z6z.d.a);
        } else if (lk50Var instanceof lk50.c) {
            ej5.c(o8i0.d(c7zVar), null, null, new d7z((OtpAuthenticationData) ((lk50.c) lk50Var).a, c7zVar, null), 3);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            c7zVar.T1(((lk50.a) lk50Var).b);
        }
        return Unit.a;
    }
}
