package defpackage;

import android.content.Context;
import com.sportygames.commons.SportyGamesManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class nka {
    public static final String a(int i, String str) {
        String string;
        String strC = op5.c(op5.a, str, "");
        if (!StringsKt.U(strC)) {
            return strC;
        }
        Context applicationContext = SportyGamesManager.getApplicationContext();
        return (applicationContext == null || (string = applicationContext.getString(i)) == null) ? "" : string;
    }

    public static final boolean b(Throwable th, Function0 function0) {
        mie mieVar;
        th.getClass();
        List<Throwable> listB = fj10.a.b(th);
        boolean z = false;
        if (listB == null || !listB.isEmpty()) {
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof mie) {
                    return false;
                }
            }
        }
        try {
            List list = (List) function0.invoke();
            boolean zIsEmpty = list.isEmpty();
            z = !zIsEmpty;
            mieVar = !zIsEmpty ? new mie(list) : null;
        } catch (Throwable th2) {
            mieVar = th2;
        }
        if (mieVar != null) {
            rtg.a(th, mieVar);
        }
        return z;
    }
}
