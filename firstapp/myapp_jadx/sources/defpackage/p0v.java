package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.instantwin.router.event.MatchEventDetailInput;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class p0v extends vd<MatchEventDetailInput, z1v> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        MatchEventDetailInput matchEventDetailInput = (MatchEventDetailInput) obj;
        matchEventDetailInput.getClass();
        int i = MatchEventDetailActivity.U;
        Intent intent = new Intent(context, (Class<?>) MatchEventDetailActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("ARG_INPUT", matchEventDetailInput);
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        a2v a2vVar;
        if (i != -1 || intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("result_status", -1);
        if (intExtra == 0) {
            a2vVar = a2v.b;
        } else if (intExtra != 1) {
            a2vVar = intExtra != 3 ? a2v.a : a2v.d;
        } else {
            a2vVar = a2v.c;
        }
        return new z1v(a2vVar);
    }
}
