package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fld0 implements eqa0 {
    public final StackTraceElement[] a;

    public fld0(StackTraceElement[] stackTraceElementArr) {
        this.a = stackTraceElementArr;
    }

    @Override // defpackage.eqa0
    public final String a() {
        StackTraceElement[] stackTraceElementArr = this.a;
        if (stackTraceElementArr.length <= 0) {
            return "\tat unknown source";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!stackTraceElement.getClassName().startsWith("io.opentelemetry.sdk.metrics") && !stackTraceElement.getClassName().startsWith("java.lang")) {
                sb.append("\tat ");
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
