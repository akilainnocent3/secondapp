package o0;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f118576g = 80;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f118577h = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f118578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f118579c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f118580d = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f118581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118582f;

    public c(char[] cArr) {
        this.f118578b = cArr;
    }

    public void a(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    @Override // 
    @NonNull
    public c e() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f118579c == cVar.f118579c && this.f118580d == cVar.f118580d && this.f118582f == cVar.f118582f && Arrays.equals(this.f118578b, cVar.f118578b)) {
            return Objects.equals(this.f118581e, cVar.f118581e);
        }
        return false;
    }

    public String f() {
        String str = new String(this.f118578b);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f118580d;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f118579c;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f118579c;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public c g() {
        return this.f118581e;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f118578b) * 31;
        long j10 = this.f118579c;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f118580d;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        b bVar = this.f118581e;
        return ((i11 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f118582f;
    }

    public String i() {
        if (!g.f118587d) {
            return "";
        }
        return p() + " -> ";
    }

    public long j() {
        return this.f118580d;
    }

    public float l() {
        if (this instanceof e) {
            return ((e) this).l();
        }
        return Float.NaN;
    }

    public int m() {
        if (this instanceof e) {
            return ((e) this).m();
        }
        return 0;
    }

    public int n() {
        return this.f118582f;
    }

    public long o() {
        return this.f118579c;
    }

    public String p() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean q() {
        char[] cArr = this.f118578b;
        return cArr != null && cArr.length >= 1;
    }

    public boolean r() {
        return this.f118580d != Long.MAX_VALUE;
    }

    public boolean s() {
        return this.f118579c > -1;
    }

    public boolean t() {
        return this.f118579c == -1;
    }

    public String toString() {
        long j10 = this.f118579c;
        long j11 = this.f118580d;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f118579c + TokenBuilder.TOKEN_DELIMITER + this.f118580d + gi.j.f86771d;
        }
        return p() + " (" + this.f118579c + " : " + this.f118580d + ") <<" + new String(this.f118578b).substring((int) this.f118579c, ((int) this.f118580d) + 1) + ">>";
    }

    public void u(b bVar) {
        this.f118581e = bVar;
    }

    public void v(long j10) {
        if (this.f118580d != Long.MAX_VALUE) {
            return;
        }
        this.f118580d = j10;
        if (g.f118587d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        b bVar = this.f118581e;
        if (bVar != null) {
            bVar.A(this);
        }
    }

    public void w(int i10) {
        this.f118582f = i10;
    }

    public void x(long j10) {
        this.f118579c = j10;
    }

    public String y(int i10, int i11) {
        return "";
    }

    public String z() {
        return "";
    }
}
