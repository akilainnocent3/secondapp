package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zix {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public String j;
    public ygp<?> k;
    public Object l;

    public static final class a {
        public boolean a;
        public boolean b;
        public String c;
        public ygp<?> d;
        public Object e;
        public int f;
        public int g;
        public int h;
        public int i;
    }

    public zix() {
        throw null;
    }

    public zix(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zix)) {
            zix zixVar = (zix) obj;
            if (this.a == zixVar.a && this.b == zixVar.b && this.c == zixVar.c && Intrinsics.g(this.j, zixVar.j) && Intrinsics.g(this.k, zixVar.k) && Intrinsics.g(this.l, zixVar.l) && this.d == zixVar.d && this.e == zixVar.e && this.f == zixVar.f && this.g == zixVar.g && this.h == zixVar.h && this.i == zixVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        String str = this.j;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        ygp<?> ygpVar = this.k;
        int iHashCode2 = (iHashCode + (ygpVar != null ? ygpVar.hashCode() : 0)) * 31;
        Object obj = this.l;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        String str = this.j;
        StringBuilder sb = new StringBuilder(zix.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.c;
        if ((str != null || i != -1) && str != null) {
            sb.append("popUpTo(");
            if (str != null) {
                sb.append(str);
            } else {
                ygp<?> ygpVar = this.k;
                if (ygpVar != null) {
                    sb.append(ygpVar);
                } else {
                    Object obj = this.l;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(i));
                    }
                }
            }
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i2 = this.i;
        int i3 = this.h;
        int i4 = this.g;
        int i5 = this.f;
        if (i5 != -1 || i4 != -1 || i3 != -1 || i2 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i5));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(")");
        }
        return sb.toString();
    }
}
