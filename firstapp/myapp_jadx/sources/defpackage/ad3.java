package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ad3 implements zc3 {
    public final Context a;
    public final h940 b;
    public final nzm c;
    public final k5b d;
    public volatile a e;

    public static final class a {
        public final String a;
        public final int b;

        public a(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
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

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "CacheKey(orderId=", this.a, ", widthPx=", ")");
        }
    }

    public ad3(Context context, h940 h940Var, nzm nzmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        h940Var.getClass();
        nzmVar.getClass();
        this.a = context;
        this.b = h940Var;
        this.c = nzmVar;
        this.d = k5bVar;
    }

    @Override // defpackage.zc3
    public final or60 a(String str, Configuration configuration) {
        return new or60(new bd3(this, configuration, str, null));
    }
}
