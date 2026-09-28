package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ruj0 extends b3 {
    public static final String z = jgt.g("WorkContinuationImpl");
    public final svj0 c;
    public final String d;
    public final lvg e;
    public final List<? extends jwj0> f;
    public final ArrayList i;
    public final ArrayList v;
    public boolean w;
    public v1z y;

    public ruj0() {
        throw null;
    }

    public ruj0(svj0 svj0Var, String str, lvg lvgVar, List list) {
        super(13);
        this.c = svj0Var;
        this.d = str;
        this.e = lvgVar;
        this.f = list;
        this.i = new ArrayList(list.size());
        this.v = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (lvgVar == lvg.a && ((jwj0) list.get(i)).b.u != Long.MAX_VALUE) {
                hb5.a("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((jwj0) list.get(i)).a.toString();
            string.getClass();
            this.i.add(string);
            this.v.add(string);
        }
    }

    public static HashSet Y(ruj0 ruj0Var) {
        HashSet hashSet = new HashSet();
        ruj0Var.getClass();
        return hashSet;
    }

    public final s1z X() {
        if (this.w) {
            jgt.e().h(z, "Already enqueued work ids (" + TextUtils.join(", ", this.i) + ")");
        } else {
            svj0 svj0Var = this.c;
            this.y = z1z.a(svj0Var.b.i, "EnqueueRunnable_" + this.e.name(), svj0Var.d.c(), new eh7(this, 3));
        }
        return this.y;
    }
}
