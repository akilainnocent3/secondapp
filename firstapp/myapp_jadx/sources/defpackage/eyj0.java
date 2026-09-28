package defpackage;

import android.os.Build;
import android.os.Trace;
import androidx.work.d;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class eyj0 extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ayj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyj0(d dVar, boolean z, String str, ayj0 ayj0Var) {
        super(1);
        this.a = dVar;
        this.b = z;
        this.c = str;
        this.d = ayj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        String str;
        Throwable th2 = th;
        if (th2 instanceof xxj0) {
            this.a.c.compareAndSet(-256, ((xxj0) th2).a);
        }
        if (this.b && (str = this.c) != null) {
            ayj0 ayj0Var = this.d;
            eqa eqaVar = ayj0Var.e.i;
            int iHashCode = ayj0Var.a.hashCode();
            if (Build.VERSION.SDK_INT >= 29) {
                tig0.b(iHashCode, sig0.d(str));
            } else {
                String strD = sig0.d(str);
                try {
                    Method method = sig0.d;
                    if (method == null) {
                        method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        sig0.d = method;
                    }
                    method.invoke(null, Long.valueOf(sig0.a), strD, Integer.valueOf(iHashCode));
                } catch (Exception e) {
                    sig0.a("asyncTraceEnd", e);
                }
            }
        }
        return Unit.a;
    }
}
