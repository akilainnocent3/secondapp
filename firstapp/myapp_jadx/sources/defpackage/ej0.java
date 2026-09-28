package defpackage;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ej0 {
    public static final xnu a(Bundle bundle) {
        xnu xnuVar = new xnu();
        Set<String> setKeySet = bundle.keySet();
        setKeySet.getClass();
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            if (obj != null) {
                xnuVar.put(str, obj);
            }
        }
        xnu xnuVarC = xnuVar.c();
        if (xnuVarC.isEmpty()) {
            return null;
        }
        return xnuVarC;
    }
}
