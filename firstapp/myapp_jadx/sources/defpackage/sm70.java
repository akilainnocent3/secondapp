package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class sm70 {

    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("NETWORK_UNMETERED", 0);
            a = bVar;
            b bVar2 = new b("DEVICE_IDLE", 1);
            b = bVar2;
            b bVar3 = new b("DEVICE_CHARGING", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public abstract ss7 a();

    public final long b(kw20 kw20Var, long j, int i) {
        long jB = j - a().b();
        a aVar = c().get(kw20Var);
        long jA = aVar.a();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * ((long) i2)))), jB), aVar.c());
    }

    public abstract Map<kw20, a> c();
}
