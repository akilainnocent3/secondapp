package defpackage;

import com.google.protobuf.Reader;
import defpackage.lhl0;
import defpackage.thl0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class thl0<MessageType extends thl0<MessageType, BuilderType>, BuilderType extends lhl0<MessageType, BuilderType>> extends bel0<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected iml0 zzc = iml0.f;

    public static thl0 m(Class cls) {
        Map map = zzd;
        thl0 thl0Var = (thl0) map.get(cls);
        if (thl0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                thl0Var = (thl0) map.get(cls);
            } catch (ClassNotFoundException e) {
                rzk.b("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (thl0Var != null) {
            return thl0Var;
        }
        try {
            thl0 thl0Var2 = (thl0) ((thl0) rml0.a.allocateInstance(cls)).p(6);
            if (thl0Var2 != null) {
                map.put(cls, thl0Var2);
                return thl0Var2;
            }
            fm20.a();
            return null;
        } catch (InstantiationException e2) {
            dad.a(e2);
            return null;
        }
    }

    public static void n(Class cls, thl0 thl0Var) {
        thl0Var.h();
        zzd.put(cls, thl0Var);
    }

    public static Object o(Method method, thl0 thl0Var, Object... objArr) {
        try {
            return method.invoke(thl0Var, objArr);
        } catch (IllegalAccessException e) {
            jk40.a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            jk40.a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    @Override // defpackage.lkl0
    public final int a() {
        if (g()) {
            int iH = cll0.c.a(getClass()).h(this);
            if (iH >= 0) {
                return iH;
            }
            rhl0.a(String.valueOf(iH).length() + 42, iH);
            return 0;
        }
        int i = this.zzb & Reader.READ_DONE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iH2 = cll0.c.a(getClass()).h(this);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        rhl0.a(String.valueOf(iH2).length() + 42, iH2);
        return 0;
    }

    @Override // defpackage.lkl0
    public final /* synthetic */ jkl0 b() {
        return (lhl0) p(5);
    }

    @Override // defpackage.lkl0
    public final void c(qfl0 qfl0Var) {
        ill0 ill0VarA = cll0.c.a(getClass());
        wfl0 wfl0Var = qfl0Var.a;
        if (wfl0Var == null) {
            wfl0Var = new wfl0(qfl0Var);
        }
        ill0VarA.c(this, wfl0Var);
    }

    @Override // defpackage.nkl0
    public final /* synthetic */ thl0 d() {
        return (thl0) p(6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return cll0.c.a(getClass()).b(this, (thl0) obj);
    }

    @Override // defpackage.bel0
    public final int f(ill0 ill0Var) {
        if (g()) {
            int iH = ill0Var.h(this);
            if (iH >= 0) {
                return iH;
            }
            rhl0.a(String.valueOf(iH).length() + 42, iH);
            return 0;
        }
        int i = this.zzb & Reader.READ_DONE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iH2 = ill0Var.h(this);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        rhl0.a(String.valueOf(iH2).length() + 42, iH2);
        return 0;
    }

    public final boolean g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.zzb &= Reader.READ_DONE;
    }

    public final int hashCode() {
        if (g()) {
            return cll0.c.a(getClass()).a(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iA = cll0.c.a(getClass()).a(this);
        this.zza = iA;
        return iA;
    }

    public final void i() {
        cll0.c.a(getClass()).f(this);
        h();
    }

    public final lhl0 j() {
        return (lhl0) p(5);
    }

    public final lhl0 k() {
        lhl0 lhl0Var = (lhl0) p(5);
        lhl0Var.j(this);
        return lhl0Var;
    }

    public final void l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Reader.READ_DONE;
    }

    public abstract Object p(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = pkl0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        pkl0.b(this, sb, 0);
        return sb.toString();
    }
}
