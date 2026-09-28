package defpackage;

import android.content.DialogInterface;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pke implements gd8.a {
    public final /* synthetic */ long a;
    public final /* synthetic */ DialogInterface.OnClickListener b;
    public final /* synthetic */ DialogInterface.OnClickListener c;

    public /* synthetic */ pke(long j, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        this.a = j;
        this.b = onClickListener;
        this.c = onClickListener2;
    }

    @Override // gd8.a
    public final b a(e eVar) {
        b.a aVar = new b.a(eVar);
        eVar.getClass();
        aVar.setTitle(sn5.b(eVar, R.string.sporty_soccer__unfinished_game, new Object[0]));
        aVar.a.f = sn5.b(eVar, R.string.sporty_soccer__unfinished_game_msg, Long.valueOf(this.a));
        String strB = sn5.b(eVar, R.string.common_functions__continue, new Object[0]);
        Locale locale = Locale.ROOT;
        String upperCase = strB.toUpperCase(locale);
        upperCase.getClass();
        aVar.c(upperCase, this.b);
        String upperCase2 = sn5.b(eVar, R.string.common_functions__close, new Object[0]).toUpperCase(locale);
        upperCase2.getClass();
        aVar.b(upperCase2, this.c);
        return aVar.create();
    }
}
