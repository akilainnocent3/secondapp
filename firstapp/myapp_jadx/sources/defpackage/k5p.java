package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk5p;", "Lej10;", "<init>", "()V", "a", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class k5p extends ej10 {

    public static final class a {
        public static final a a = new a();
        public static final Integer b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            b = num2;
        }
    }

    @Override // defpackage.ej10
    public final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = a.b;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // defpackage.ej10
    public final List<Throwable> b(Throwable th) {
        th.getClass();
        Integer num = a.b;
        if (num != null && num.intValue() < 19) {
            return super.b(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        suppressed.getClass();
        List<Throwable> listAsList = Arrays.asList(suppressed);
        listAsList.getClass();
        return listAsList;
    }
}
