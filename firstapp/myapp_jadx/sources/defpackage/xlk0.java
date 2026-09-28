package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xlk0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hwk0 c;

    public xlk0(hwk0 hwk0Var, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = hwk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        hwk0 hwk0Var = this.c;
        hwk0Var.g();
        String str = this.a;
        hm20.e(str);
        ox0 ox0Var = hwk0Var.c;
        boolean zIsEmpty = ox0Var.isEmpty();
        long j = this.b;
        if (zIsEmpty) {
            hwk0Var.d = j;
        }
        Integer num = (Integer) ox0Var.get(str);
        if (num != null) {
            ox0Var.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        if (ox0Var.c < 100) {
            ox0Var.put(str, 1);
            hwk0Var.b.put(str, Long.valueOf(j));
        } else {
            y4l0 y4l0Var = hwk0Var.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.a("Too many ads visible");
        }
    }
}
