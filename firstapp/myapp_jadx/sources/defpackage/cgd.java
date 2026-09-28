package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class cgd implements yha0 {
    public final ip0 a;

    public cgd(ip0 ip0Var) {
        this.a = ip0Var;
    }

    @Override // defpackage.yha0
    public final void a(Context context, dha0.f fVar) {
        context.getClass();
        String strB = fVar.a;
        if (StringsKt.U(strB)) {
            strB = sn5.b(context, R.string.common_feedback__sorry_something_went_wrong, new Object[0]);
        }
        if (StringsKt.U(strB)) {
            return;
        }
        Toast.makeText(context, strB, 0).show();
    }

    @Override // defpackage.yha0
    public final void b(Activity activity, dha0.c cVar) {
        wha0.e(activity, cVar);
    }

    @Override // defpackage.yha0
    public final void c(Activity activity, dha0.a aVar) {
        wha0.a(activity, aVar);
    }

    @Override // defpackage.yha0
    public final void d(Activity activity, dha0.e eVar) {
        wha0.d(activity, eVar, null);
    }

    @Override // defpackage.yha0
    public final boolean e(aga0 aga0Var) {
        aga0Var.getClass();
        return this.a.a(aga0Var);
    }
}
