package defpackage;

import com.sporty.android.core.model.pocket.common.ClabeType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface wvd {

    public static final class a implements wvd {
        public final String a;
        public final int b;

        public a(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.wvd
        public final int c() {
            return this.b;
        }

        @Override // defpackage.wvd
        public final String d() {
            return this.a;
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
            return d830.a(this.b, "DefaultDeposit(amount=", this.a, ", channelId=", ")");
        }
    }

    public static final class b implements wvd {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.wvd
        public final String a() {
            return this.a;
        }

        @Override // defpackage.wvd
        public final int c() {
            return 33003;
        }

        @Override // defpackage.wvd
        public final String d() {
            return "1";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode() + gpp.a(33003, 1519, 31);
        }

        public final String toString() {
            return tug.a("FlashVoucherDeposit(amount=1, channelId=33003, voucherCode=", this.a, ")");
        }
    }

    public static final class c implements wvd {
        public final String a;
        public final String b;
        public final int c;
        public final String d;

        public c(String str, String str2, int i, String str3) {
            str.getClass();
            str3.getClass();
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
        }

        @Override // defpackage.wvd
        public final int c() {
            return this.c;
        }

        @Override // defpackage.wvd
        public final String d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b) && this.c == cVar.c && Intrinsics.g(this.d, cVar.d);
        }

        @Override // defpackage.wvd
        public final String getUserId() {
            return this.a;
        }

        public final int hashCode() {
            return this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("PixDeposit(userId=", this.a, ", amount=", this.b, ", channelId=");
            sbA.append(this.c);
            sbA.append(", cpf=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d implements wvd {
        public final String a;
        public final int b;
        public final String c;
        public final ClabeType d;

        public d(String str, int i, String str2, ClabeType clabeType) {
            str.getClass();
            str2.getClass();
            clabeType.getClass();
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = clabeType;
        }

        @Override // defpackage.wvd
        public final String b() {
            return this.c;
        }

        @Override // defpackage.wvd
        public final int c() {
            return this.b;
        }

        @Override // defpackage.wvd
        public final String d() {
            return this.a;
        }

        @Override // defpackage.wvd
        public final ClabeType e() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b && Intrinsics.g(this.c, dVar.c) && this.d == dVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = ml5.a(this.b, "SpeiByStpDeposit(amount=", this.a, ", channelId=", ", clabeNumber=");
            sbA.append(this.c);
            sbA.append(", clabeType=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    default String a() {
        return null;
    }

    default String b() {
        return null;
    }

    int c();

    String d();

    default ClabeType e() {
        return null;
    }

    default String getUserId() {
        return null;
    }
}
