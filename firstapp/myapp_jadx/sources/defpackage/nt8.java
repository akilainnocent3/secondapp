package defpackage;

import android.content.Context;
import com.sportygames.commons.SportyGamesManager;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class nt8 implements otk0 {
    public static final op8 a = new op8(2001058673, new lt8(), false);
    public static final op8 b = new op8(1289389568, new mt8(), false);
    public static final /* synthetic */ nt8 c = new nt8();

    public static final String a(int i, String str) {
        String string;
        String strC = op5.c(op5.a, str, "");
        if (!StringsKt.U(strC)) {
            return strC;
        }
        Context applicationContext = SportyGamesManager.getApplicationContext();
        return (applicationContext == null || (string = applicationContext.getString(i)) == null) ? "" : string;
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Integer.valueOf((int) bol0.b.get().zzd());
    }
}
