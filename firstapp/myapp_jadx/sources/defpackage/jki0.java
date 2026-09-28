package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;

/* JADX INFO: loaded from: classes5.dex */
public final class jki0 {
    public static final a e = new a("penalty_shootout", "entrance_bg_penalty_shootout");
    public static final a f = new a("football_legends", "entrance_bg_football_legends");
    public final yqm a;
    public final mgb0 b;
    public final v5b c;
    public final wwd0 d;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("ReplacementCmsKeys(entranceLabel=", this.a, ", imageUrl=", this.b, ")");
        }
    }

    public jki0(yqm yqmVar, mgb0 mgb0Var, @ApplicationScope v5b v5bVar) {
        yqmVar.getClass();
        mgb0Var.getClass();
        v5bVar.getClass();
        this.a = yqmVar;
        this.b = mgb0Var;
        this.c = v5bVar;
        this.d = xwd0.a(qki0.a.a);
    }
}
