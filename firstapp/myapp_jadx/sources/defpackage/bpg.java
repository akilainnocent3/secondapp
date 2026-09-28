package defpackage;

import android.util.Log;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bpg implements xsg0 {
    @Override // defpackage.xsg0
    public final Object apply(Object obj) {
        fg80 fg80Var = (fg80) obj;
        gg80.a.getClass();
        String strA = gg80.b.a(fg80Var);
        strA.getClass();
        fg80Var.getClass();
        nrg nrgVar = nrg.SESSION_START;
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strA.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }
}
