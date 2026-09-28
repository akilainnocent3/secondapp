package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rti implements Comparable<rti> {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public rti(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(rti rtiVar) {
        rti rtiVar2 = rtiVar;
        rtiVar2.getClass();
        int i = this.a - rtiVar2.a;
        return i == 0 ? this.b - rtiVar2.b : i;
    }
}
