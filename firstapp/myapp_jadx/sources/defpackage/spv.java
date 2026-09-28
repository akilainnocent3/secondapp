package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class spv implements gld0 {
    public final gld0[] a;
    public final tpv b = new tpv();

    public spv(gld0... gld0VarArr) {
        this.a = gld0VarArr;
    }

    @Override // defpackage.gld0
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            gld0 gld0Var = this.a[i];
            if (stackTraceElementArrA.length <= 1024) {
                break;
            }
            stackTraceElementArrA = gld0Var.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > 1024 ? this.b.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
