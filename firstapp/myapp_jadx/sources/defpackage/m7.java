package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m7<Key, Value> {
    public final a[] a;
    public final hxs.a[] b;
    public final gx0<b<Key, Value>> c;
    public boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("UNBLOCKED", 0);
            a = aVar;
            a aVar2 = new a("COMPLETED", 1);
            b = aVar2;
            a aVar3 = new a("REQUIRES_REFRESH", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b<Key, Value> {
        public final kxs a;
        public xqz<Key, Value> b;

        public b(kxs kxsVar, xqz<Key, Value> xqzVar) {
            kxsVar.getClass();
            this.a = kxsVar;
            this.b = xqzVar;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kxs.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class d extends qlr implements Function1<b<Key, Value>, Boolean> {
        public final /* synthetic */ kxs a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kxs kxsVar) {
            super(1);
            this.a = kxsVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            return Boolean.valueOf(bVar.a == this.a);
        }
    }

    public m7() {
        int length = kxs.values().length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            aVarArr[i] = a.a;
        }
        this.a = aVarArr;
        int length2 = kxs.values().length;
        hxs.a[] aVarArr2 = new hxs.a[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            aVarArr2[i2] = null;
        }
        this.b = aVarArr2;
        this.c = new gx0<>();
    }

    public final void a(kxs kxsVar) {
        kxsVar.getClass();
        p48.A(this.c, new d(kxsVar));
    }

    public final hxs b(kxs kxsVar) {
        a aVar = this.a[kxsVar.ordinal()];
        gx0<b<Key, Value>> gx0Var = this.c;
        if (gx0Var == null || !gx0Var.isEmpty()) {
            Iterator<b<Key, Value>> it = gx0Var.iterator();
            while (it.hasNext()) {
                if (it.next().a == kxsVar) {
                    if (aVar == a.c) {
                        break;
                    }
                    return hxs.b.b;
                }
            }
        }
        hxs.a aVar2 = this.b[kxsVar.ordinal()];
        if (aVar2 != null) {
            return aVar2;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
            } else if (c.a[kxsVar.ordinal()] != 1) {
                return hxs.c.b;
            }
        }
        return hxs.c.c;
    }

    public final Pair<kxs, xqz<Key, Value>> c() {
        b<Key, Value> next;
        Iterator<b<Key, Value>> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            kxs kxsVar = next.a;
            if (kxsVar != kxs.a && this.a[kxsVar.ordinal()] == a.a) {
                break;
            }
        }
        b<Key, Value> bVar = next;
        if (bVar != null) {
            return new Pair<>(bVar.a, bVar.b);
        }
        return null;
    }

    public final void d(kxs kxsVar, a aVar) {
        kxsVar.getClass();
        this.a[kxsVar.ordinal()] = aVar;
    }

    public final void e(kxs kxsVar, hxs.a aVar) {
        kxsVar.getClass();
        this.b[kxsVar.ordinal()] = aVar;
    }
}
