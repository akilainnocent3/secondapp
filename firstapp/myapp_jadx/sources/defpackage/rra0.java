package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public abstract class rra0 {
    public static final a a;
    public static final b b;
    public static final c c;
    public static final /* synthetic */ rra0[] d;

    public final enum a extends rra0 {
        public a() {
            super("NONE", 0);
        }

        @Override // defpackage.rra0
        public final sra0 a(Set<uqa0> set) {
            return wra0.a;
        }
    }

    public final enum b extends rra0 {
        public final vra0 e;

        public b() {
            super("SPAN_KIND", 1);
            EnumMap enumMap = new EnumMap(wqa0.class);
            enumMap.put(wqa0.b, new ura0(Collections.singleton(uqa0.b)));
            enumMap.put(wqa0.c, new ura0(Collections.singleton(uqa0.c)));
            enumMap.put(wqa0.e, new ura0(Collections.singleton(uqa0.d)));
            enumMap.put(wqa0.d, new ura0(Collections.singleton(uqa0.e)));
            this.e = new vra0(enumMap);
        }

        @Override // defpackage.rra0
        public final sra0 a(Set<uqa0> set) {
            return this.e;
        }
    }

    public final enum c extends rra0 {
        public c() {
            super("SEMCONV", 2);
        }

        @Override // defpackage.rra0
        public final sra0 a(Set<uqa0> set) {
            return set.isEmpty() ? wra0.a : new ura0(set);
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        b bVar = new b();
        b = bVar;
        c cVar = new c();
        c = cVar;
        d = new rra0[]{aVar, bVar, cVar};
    }

    public rra0() {
        throw null;
    }

    public static rra0 valueOf(String str) {
        return (rra0) Enum.valueOf(rra0.class, str);
    }

    public static rra0[] values() {
        return (rra0[]) d.clone();
    }

    public abstract sra0 a(Set<uqa0> set);
}
