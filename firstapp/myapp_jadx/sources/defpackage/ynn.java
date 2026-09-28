package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ynn<T> {
    public final yd2<T> a;

    public ynn(yd2<T> yd2Var) {
        this.a = yd2Var;
    }

    public T a(uf50 uf50Var) throws unn {
        b21 b21Var = uf50Var.a;
        StringBuilder sb = new StringBuilder("| (+) '");
        yd2<T> yd2Var = this.a;
        sb.append(yd2Var);
        sb.append('\'');
        String string = sb.toString();
        b21Var.getClass();
        b21Var.f(v6s.a, string);
        try {
            wrz wrzVar = uf50Var.e;
            if (wrzVar == null) {
                wrzVar = new wrz(3, null);
            }
            return yd2Var.d.invoke(uf50Var.b, wrzVar);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                if (StringsKt.M(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(CollectionsKt.a0(arrayList, "\n\t", null, null, null, 62));
            String str = "* Instance creation error : could not create instance for '" + yd2Var + "': " + sb2.toString();
            b21Var.getClass();
            b21Var.f(v6s.d, str);
            throw new unn("Could not create instance for '" + yd2Var + '\'', e);
        }
    }

    public abstract T b(uf50 uf50Var);
}
