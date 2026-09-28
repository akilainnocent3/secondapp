package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class byf0 {
    public static final Logger a = Logger.getLogger(byf0.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a {
        public static final C0146a a;
        public static final b b;
        public static final /* synthetic */ a[] c;

        /* JADX INFO: renamed from: byf0$a$a, reason: collision with other inner class name */
        public final enum C0146a extends a {
            public C0146a() {
                super("ALGORITHM_NOT_FIPS", 0);
            }

            @Override // byf0.a
            public final boolean a() {
                return !byf0.a();
            }
        }

        public final enum b extends a {
            public b() {
                super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            }

            @Override // byf0.a
            public final boolean a() {
                Boolean bool;
                if (byf0.a()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                    } catch (Exception unused) {
                        byf0.a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
        }

        static {
            C0146a c0146a = new C0146a();
            a = c0146a;
            b bVar = new b();
            b = bVar;
            c = new a[]{c0146a, bVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }

        public abstract boolean a();
    }

    public static boolean a() {
        return b.get();
    }
}
