package ok;

import androidx.annotation.Nullable;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f119140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f119141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final e f119142d;

    public e(String str, String str2, StackTraceElement[] stackTraceElementArr, @Nullable e eVar) {
        this.f119139a = str;
        this.f119140b = str2;
        this.f119141c = stackTraceElementArr;
        this.f119142d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
