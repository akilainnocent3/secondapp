package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gdf0 {
    public final int a;

    public /* synthetic */ gdf0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ gdf0 a(int i) {
        return new gdf0(i);
    }

    public static String b(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gdf0) {
            return this.a == ((gdf0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
