package defpackage;

import android.content.Context;
import com.sporty.android.core.model.patron.UserPhone;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j1e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        szi.b bVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                r2e r2eVarR0 = ((m1e) obj).P0();
                UserPhone userPhone = (UserPhone) r2eVarR0.R0.a.getValue();
                if (userPhone != null) {
                    jvd0 jvd0Var = r2eVarR0.V0;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    r2eVarR0.V0 = ej5.c(o8i0.d(r2eVarR0), null, null, new b2e(r2eVarR0, userPhone, null), 3);
                }
                return Unit.a;
            case 1:
                szi sziVar = (szi) obj;
                String str = sziVar.b;
                if (str == null || !sziVar.d) {
                    bVar = new szi.b(sziVar.a, sziVar.b, new szi.a(), sziVar.c, sziVar.e);
                } else {
                    Context context = sziVar.a;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    bVar = new szi.b(sziVar.a, new File(noBackupFilesDir, str).getAbsolutePath(), new szi.a(), sziVar.c, sziVar.e);
                }
                bVar.setWriteAheadLoggingEnabled(sziVar.i);
                return bVar;
            case 2:
                int i2 = LivePageActivity.b0;
                ((nqs) obj).e.s0(0);
                return Unit.a;
            default:
                tqd0 tqd0VarJ0 = ((umd0) obj).j0();
                tqd0VarJ0.getClass();
                ej5.c(o8i0.d(tqd0VarJ0), null, null, new pqd0(tqd0VarJ0, null), 3);
                return Unit.a;
        }
    }
}
