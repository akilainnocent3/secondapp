package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class lpy {
    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        jdh0 jdh0VarB = b(function1, obj, null);
        if (jdh0VarB != null) {
            o5b.a(coroutineContext, jdh0VarB);
        }
    }

    public static final jdh0 b(Function1 function1, Object obj, jdh0 jdh0Var) {
        try {
            function1.invoke(obj);
            return jdh0Var;
        } catch (Throwable th) {
            if (jdh0Var == null || jdh0Var.getCause() == th) {
                return new jdh0(wga.a(obj, "Exception in undelivered element handler for "), th);
            }
            rtg.a(jdh0Var, th);
            return jdh0Var;
        }
    }

    public static final icb0 c(CMSRes cMSRes, a aVar) {
        co5 next;
        cMSRes.getClass();
        aVar.N(1442909085);
        b bVar = (b) aVar.O(c.a);
        Iterator<co5> it = bVar.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ncb0));
        co5 co5Var = next;
        if (co5Var != null) {
            ncb0 ncb0Var = co5Var instanceof ncb0 ? (ncb0) co5Var : null;
            if (ncb0Var != null) {
                String strE = c.e(bVar, cMSRes, new String[0]);
                icb0 icb0Var = strE != null ? ncb0Var.a.get(strE) : null;
                aVar.H();
                return icb0Var;
            }
        }
        aVar.H();
        return null;
    }
}
