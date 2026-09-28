package defpackage;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
public final class bbs {
    public final a a;
    public final Exception b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("OPENED", 0);
            a = aVar;
            a aVar2 = new a("CLOSED", 1);
            b = aVar2;
            a aVar3 = new a("ERROR", 2);
            c = aVar3;
            a aVar4 = new a("FAILED_SERVER_HEARTBEAT", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public bbs(Exception exc) {
        new TreeMap();
        this.a = a.c;
        this.b = exc;
    }

    public bbs(a aVar) {
        new TreeMap();
        this.a = aVar;
    }
}
