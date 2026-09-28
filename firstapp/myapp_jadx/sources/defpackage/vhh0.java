package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class vhh0 {
    public final List<uhh0> a;

    public vhh0(vlc vlcVar, wvy wvyVar) {
        this.a = b.k(vlcVar, wvyVar);
    }

    public final uhh0 a(String str, String str2, boolean z) {
        Object next;
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((uhh0) next).d(str, str2, z)) {
                return (uhh0) next;
            }
        }
        next = null;
        return (uhh0) next;
    }

    public final dih0 b(Selection selection) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            dih0 dih0VarC = ((uhh0) it.next()).c(selection);
            if (dih0VarC != null) {
                return dih0VarC;
            }
        }
        return null;
    }
}
