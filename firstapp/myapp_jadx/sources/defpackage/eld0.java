package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class eld0 {
    public final int a;
    public final StringBuilder b = new StringBuilder();

    public eld0(int i, Throwable th) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[LOOP:2: B:29:0x00a6->B:33:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba A[SYNTHETIC] */
    public final boolean a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, Set<Throwable> set) {
        Throwable[] suppressed;
        int length;
        int i;
        eld0 eld0Var;
        Set<Throwable> set2;
        Throwable cause;
        eld0 eld0Var2;
        Set<Throwable> set3;
        boolean zContains = set.contains(th);
        StringBuilder sb = this.b;
        if (zContains) {
            sb.append(str);
            sb.append(str2);
            sb.append("[CIRCULAR REFERENCE: ");
            sb.append(th);
            sb.append("]");
            sb.append(System.lineSeparator());
            return true;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTraceElementArr.length - 1;
        int length3 = stackTrace.length - 1;
        while (length2 >= 0 && length3 >= 0 && stackTraceElementArr[length2].equals(stackTrace[length3])) {
            length2--;
            length3--;
        }
        sb.append(str);
        sb.append(str2);
        sb.append(th);
        sb.append(System.lineSeparator());
        if (!b()) {
            for (int i2 = 0; i2 <= length3; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(str);
                sb.append("\tat ");
                sb.append(stackTraceElement);
                sb.append(System.lineSeparator());
                if (!b()) {
                }
            }
            int length4 = (stackTrace.length - 1) - length3;
            if (length4 == 0) {
                suppressed = th.getSuppressed();
                length = suppressed.length;
                i = 0;
                while (i < length) {
                    eld0Var2 = this;
                    set3 = set;
                    if (eld0Var2.a(stackTrace, suppressed[i], str.concat("\t"), "Suppressed: ", set3)) {
                        i++;
                        this = eld0Var2;
                        set = set3;
                    }
                }
                eld0Var = this;
                set2 = set;
                cause = th.getCause();
                if (cause != null) {
                    return eld0Var.a(stackTrace, cause, str, "Caused by: ", set2);
                }
                return false;
            }
            sb.append(str);
            sb.append("\t... ");
            sb.append(length4);
            sb.append(" more");
            sb.append(System.lineSeparator());
            if (!b()) {
                suppressed = th.getSuppressed();
                length = suppressed.length;
                i = 0;
                while (i < length) {
                    eld0Var2 = this;
                    set3 = set;
                    if (eld0Var2.a(stackTrace, suppressed[i], str.concat("\t"), "Suppressed: ", set3)) {
                        i++;
                        this = eld0Var2;
                        set = set3;
                    }
                }
                eld0Var = this;
                set2 = set;
                cause = th.getCause();
                if (cause != null) {
                    return eld0Var.a(stackTrace, cause, str, "Caused by: ", set2);
                }
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return this.b.length() >= this.a;
    }
}
