package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class wk1 extends ryd0.c {
    public final String a;
    public final String b;
    public final boolean c;

    public wk1(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            bmy.a("Null osRelease");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            bmy.a("Null osCodeName");
            throw null;
        }
        this.b = str2;
        this.c = z;
    }

    @Override // ryd0.c
    public final boolean a() {
        return this.c;
    }

    @Override // ryd0.c
    public final String b() {
        return this.b;
    }

    @Override // ryd0.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ryd0.c)) {
            return false;
        }
        ryd0.c cVar = (ryd0.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        return (this.c ? 1231 : 1237) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return mq0.a(sb, this.c, "}");
    }
}
