package defpackage;

import com.sporty.android.core.model.pocket.common.ClabeType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class msj0 {
    public int a;
    public String b;
    public String c;

    public static final class a extends msj0 {
        public final String d;
        public final c100 e;
        public final String f;

        public a(String str, c100 c100Var, String str2) {
            str.getClass();
            c100Var.getClass();
            this.d = str;
            this.e = c100Var;
            this.f = str2;
        }

        @Override // defpackage.msj0
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.d, aVar.d) && this.e == aVar.e && Intrinsics.g(this.f, aVar.f);
        }

        @Override // defpackage.msj0
        public final c100 h() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
            String str = this.f;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // defpackage.msj0
        public final String i() {
            return this.f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MPesa(amount=");
            sb.append(this.d);
            sb.append(", payChannel=");
            sb.append(this.e);
            sb.append(", phoneNumber=");
            return uf80.a(sb, this.f, ")");
        }
    }

    public static final class b extends msj0 {
        public final String d;
        public final c100 e;

        public b(String str, c100 c100Var) {
            str.getClass();
            c100Var.getClass();
            this.d = str;
            this.e = c100Var;
        }

        @Override // defpackage.msj0
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.d, bVar.d) && this.e == bVar.e;
        }

        @Override // defpackage.msj0
        public final c100 h() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Nuvei(amount=" + this.d + ", payChannel=" + this.e + ")";
        }
    }

    public static final class c extends msj0 {
        public final String d;
        public final c100 e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public c(String str, c100 c100Var, String str2, String str3, String str4, String str5) {
            c100Var.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            this.d = str;
            this.e = c100Var;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = str5;
        }

        @Override // defpackage.msj0
        public final String a() {
            return this.h;
        }

        @Override // defpackage.msj0
        public final String b() {
            return this.i;
        }

        @Override // defpackage.msj0
        public final String c() {
            return this.d;
        }

        @Override // defpackage.msj0
        public final String d() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.d, cVar.d) && this.e == cVar.e && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && Intrinsics.g(this.h, cVar.h) && Intrinsics.g(this.i, cVar.i);
        }

        @Override // defpackage.msj0
        public final String g() {
            return this.f;
        }

        @Override // defpackage.msj0
        public final c100 h() {
            return this.e;
        }

        public final int hashCode() {
            return this.i.hashCode() + gmf0.a(gmf0.a(gmf0.a((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Pix(amount=");
            sb.append(this.d);
            sb.append(", payChannel=");
            sb.append(this.e);
            sb.append(", ispb=");
            hxa.c(sb, this.f, ", branch=", this.g, ", accountId=");
            return kwi.a(sb, this.h, ", accountType=", this.i, ")");
        }
    }

    public static final class d extends msj0 {
        public final String d;
        public final c100 e;
        public final ClabeType f;
        public final String g;

        public d(String str, c100 c100Var, ClabeType clabeType, String str2) {
            str.getClass();
            c100Var.getClass();
            clabeType.getClass();
            str2.getClass();
            this.d = str;
            this.e = c100Var;
            this.f = clabeType;
            this.g = str2;
        }

        @Override // defpackage.msj0
        public final String c() {
            return this.d;
        }

        @Override // defpackage.msj0
        public final String e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && Intrinsics.g(this.g, dVar.g);
        }

        @Override // defpackage.msj0
        public final ClabeType f() {
            return this.f;
        }

        @Override // defpackage.msj0
        public final c100 h() {
            return this.e;
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "SpeiStp(amount=" + this.d + ", payChannel=" + this.e + ", clabeType=" + this.f + ", clabeNumber=" + this.g + ")";
        }
    }

    public String a() {
        return null;
    }

    public String b() {
        return null;
    }

    public abstract String c();

    public String d() {
        return null;
    }

    public String e() {
        return null;
    }

    public ClabeType f() {
        return null;
    }

    public String g() {
        return null;
    }

    public abstract c100 h();

    public String i() {
        return null;
    }
}
