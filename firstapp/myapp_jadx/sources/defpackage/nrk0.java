package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nrk0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hwk0 c;

    public nrk0(hwk0 hwk0Var, String str, long j) {
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
        Integer num = (Integer) ox0Var.get(str);
        k8l0 k8l0Var = hwk0Var.a;
        if (num == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
            return;
        }
        khl0 khl0Var = k8l0Var.l;
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.l(khl0Var);
        igl0 igl0VarM = khl0Var.m(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            ox0Var.put(str, Integer.valueOf(iIntValue));
            return;
        }
        ox0Var.remove(str);
        ox0 ox0Var2 = hwk0Var.b;
        Long l = (Long) ox0Var2.get(str);
        long j = this.b;
        if (l == null) {
            k8l0.m(y4l0Var2);
            y4l0Var2.f.a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            ox0Var2.remove(str);
            hwk0Var.l(str, jLongValue, igl0VarM);
        }
        if (ox0Var.isEmpty()) {
            long j2 = hwk0Var.d;
            if (j2 == 0) {
                k8l0.m(y4l0Var2);
                y4l0Var2.f.a("First ad exposure time was never set");
            } else {
                hwk0Var.k(j - j2, igl0VarM);
                hwk0Var.d = 0L;
            }
        }
    }
}
