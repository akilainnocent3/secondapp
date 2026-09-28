package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class muh {
    public final rdd0 a;
    public final LinkedHashSet b;

    public static final class a implements pdd0 {
        public final String a;
        public final brg b;

        public a(String str, brg brgVar) {
            str.getClass();
            brgVar.getClass();
            this.a = str;
            this.b = brgVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.b.a), new Pair(AnalyticsParam.EVENT_PARAM_JOINTED_ID, this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "flash_boost__view";
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FlashBoostOutcomeView(jointedId=" + this.a + ", source=" + this.b + ")";
        }
    }

    public muh(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.b = new LinkedHashSet();
    }

    public final void a(String str, brg brgVar) {
        str.getClass();
        brgVar.getClass();
        LinkedHashSet linkedHashSet = this.b;
        if (linkedHashSet.contains(str)) {
            return;
        }
        linkedHashSet.add(str);
        this.a.a(new a(str, brgVar), k00.d);
    }
}
