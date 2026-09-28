package defpackage;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bug0 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList<Transition> c = new ArrayList<>();

    public bug0(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bug0)) {
            return false;
        }
        bug0 bug0Var = (bug0) obj;
        return this.b == bug0Var.b && this.a.equals(bug0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = mq0.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbB.append(this.b);
        sbB.append("\n");
        String strConcat = sbB.toString().concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    @Deprecated
    public bug0() {
    }
}
