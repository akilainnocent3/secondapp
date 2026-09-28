package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class jtk0 extends ltk0 {
    public final String a;

    public jtk0(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ltk0 ltk0Var = (ltk0) obj;
        ltk0Var.getClass();
        String str = this.a;
        int length = str.length();
        String str2 = ((jtk0) ltk0Var).a;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jtk0.class == obj.getClass()) {
            return this.a.equals(((jtk0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.a});
    }

    public final String toString() {
        return tug.a("\"", this.a, "\"");
    }
}
