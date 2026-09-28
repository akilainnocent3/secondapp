package defpackage;

import com.appsflyer.internal.h;
import com.sportybet.android.transaction.ui.txdetails.TxDetailsActivity;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class l8o implements j8o {
    public final mpe0 a = hwr.b(new k8o());
    public final o8o b = new o8o(this);

    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return h.a(this.a, "ActivityInfo(id=", ", name=", this.b, ")");
        }
    }

    public l8o(tv5 tv5Var) {
    }

    @Override // defpackage.j8o
    public final boolean a() {
        return e(TxListActivity.class.getName());
    }

    @Override // defpackage.j8o
    public final o8o b() {
        return this.b;
    }

    @Override // defpackage.j8o
    public final boolean c() {
        return e(VirtualLobbyActivity.class.getName());
    }

    @Override // defpackage.j8o
    public final boolean d() {
        List listK = b.k(TxDetailsActivity.class.getName(), TxDetailsV2Activity.class.getName());
        ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) this.a.getValue();
        if (concurrentLinkedDeque != null && concurrentLinkedDeque.isEmpty()) {
            return false;
        }
        Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            if (listK.contains(((a) it.next()).b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(String str) {
        ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) this.a.getValue();
        if (concurrentLinkedDeque != null && concurrentLinkedDeque.isEmpty()) {
            return false;
        }
        Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).b.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
