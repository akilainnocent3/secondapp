package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.b.a;
import defpackage.jzo;
import defpackage.rsw;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<Interval extends a> {

    public interface a {

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b$a$a, reason: collision with other inner class name */
        public static final class C0039a implements Function1 {
            public static final C0039a a = new C0039a();

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default Function1<Integer, Object> getKey() {
            return null;
        }

        default Function1<Integer, Object> getType() {
            return C0039a.a;
        }
    }

    public abstract rsw j();

    public final Object k(int i) {
        Object objInvoke;
        jzo jzoVarB = j().b(i);
        int i2 = i - jzoVarB.a;
        Function1<Integer, Object> key = jzoVarB.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
