package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.home.MainActivity;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yiu implements lfy {
    public final /* synthetic */ MainActivity a;

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = MainActivity.m0;
        final Pair[] pairArr = {new Pair("game", "soccer")};
        long jLongValue = ((Long) obj).longValue();
        FragmentManager supportFragmentManager = this.a.getSupportFragmentManager();
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: dju
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = MainActivity.m0;
                sh8.c().b(o7d.b(wae.GAMES_LOBBY, pairArr));
            }
        };
        fju fjuVar = new fju();
        supportFragmentManager.getClass();
        try {
            gd8.j0(new pke(jLongValue, onClickListener, fjuVar)).showNow(supportFragmentManager, "dialog");
        } catch (Exception unused) {
        }
    }
}
