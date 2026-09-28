package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t6e {

    public static final class a extends c {
    }

    public static final class b extends c {
    }

    public static abstract class c extends t6e {
        public final String a;

        public c(String str) {
            this.a = str;
        }
    }

    public static final class d extends c {
    }

    public static final class e extends t6e {
        public final String a;
        public final o77 b;
        public final String c;

        public e(String str, o77 o77Var, String str2) {
            str.getClass();
            this.a = str;
            this.b = o77Var;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DepositSuccess(tradeId=");
            sb.append(this.a);
            sb.append(", channelUIState=");
            sb.append(this.b);
            sb.append(", displayPhone=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class f extends t6e {
        public final String a;
        public final o77 b;
        public final String c;

        public f(String str, o77 o77Var, String str2) {
            str.getClass();
            this.a = str;
            this.b = o77Var;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DepositSuccessNeedNameConfirm(tradeId=");
            sb.append(this.a);
            sb.append(", channelUIState=");
            sb.append(this.b);
            sb.append(", displayPhone=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class g extends c {
    }

    public static final class h extends c {
    }

    public static final class i extends c {
        public static final i b = new i("");
    }
}
