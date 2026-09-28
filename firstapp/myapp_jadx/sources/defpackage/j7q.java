package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j7q {
    public final i6u a;
    public final mgb0 b;
    public final k5b c;
    public final b390 d;
    public final t340 e;
    public final b390 f;
    public final tuw g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;

    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "FavoriteResult(isAddFavorite=" + this.a + ", isSuccess=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("UpdateTask(lotteryId=", this.a, ", isAddFavorite=", ")", this.b);
        }
    }

    public j7q(i6u i6uVar, mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        i6uVar.getClass();
        mgb0Var.getClass();
        this.a = i6uVar;
        this.b = mgb0Var;
        this.c = k5bVar;
        pb5 pb5Var = pb5.b;
        b390 b390VarA = d390.a(0, 64, pb5Var);
        this.d = b390VarA;
        this.e = e1i.a(b390VarA);
        this.f = d390.a(0, 64, pb5Var);
        this.g = uuw.a();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, boolean z, x1b x1bVar) {
        m7q m7qVar;
        or60 or60VarC;
        if (x1bVar instanceof m7q) {
            m7qVar = (m7q) x1bVar;
            int i = m7qVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7qVar.c = i - Integer.MIN_VALUE;
            } else {
                m7qVar = new m7q(this, x1bVar);
            }
        } else {
            m7qVar = new m7q(this, x1bVar);
        }
        Object objQ = m7qVar.a;
        y5b y5bVar = y5b.a;
        int i2 = m7qVar.c;
        if (i2 == 0) {
            uj50.b(objQ);
            i6u i6uVar = this.a;
            i6uVar.getClass();
            if (z) {
                str.getClass();
                or60VarC = i6uVar.c(new j6u(i6uVar, str, null));
            } else {
                str.getClass();
                or60VarC = i6uVar.c(new r6u(i6uVar, str, null));
            }
            yzh yzhVarA = bm50.a(new l7q(or60VarC));
            m7qVar.c = 1;
            objQ = bm50.q(yzhVarA, m7qVar);
            if (objQ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objQ);
        }
        return Boolean.valueOf(objQ != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void b(x1b x1bVar) {
        o7q o7qVar;
        if (x1bVar instanceof o7q) {
            o7qVar = (o7q) x1bVar;
            int i = o7qVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7qVar.c = i - Integer.MIN_VALUE;
            } else {
                o7qVar = new o7q(this, x1bVar);
            }
        } else {
            o7qVar = new o7q(this, x1bVar);
        }
        Object obj = o7qVar.a;
        y5b y5bVar = y5b.a;
        int i2 = o7qVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            p7q p7qVar = new p7q(this, null);
            o7qVar.c = 1;
            if (w5b.d(p7qVar, o7qVar) == y5bVar) {
                return;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            uj50.b(obj);
        }
        fkd.a();
    }
}
