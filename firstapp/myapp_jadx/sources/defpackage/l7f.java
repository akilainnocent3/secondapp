package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l7f {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7f) && g7f.b(10.0f, 10.0f) && g7f.b(40.0f, 40.0f) && g7f.b(10.0f, 10.0f) && g7f.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + tvh.a(40.0f, tvh.a(10.0f, tvh.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) g7f.c(10.0f)) + ", top=" + ((Object) g7f.c(40.0f)) + ", end=" + ((Object) g7f.c(10.0f)) + ", bottom=" + ((Object) g7f.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
