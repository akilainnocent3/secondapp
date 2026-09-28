package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class flc0 {
    public final ulc0 a;
    public final a b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("START", 0);
            a = aVar;
            a aVar2 = new a("END", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
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
    }

    public flc0(ulc0 ulc0Var, a aVar) {
        ulc0Var.getClass();
        this.a = ulc0Var;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flc0)) {
            return false;
        }
        flc0 flc0Var = (flc0) obj;
        return Intrinsics.g(this.a, flc0Var.a) && this.b == flc0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsSettlementMatchTrackerItemState(runningPhase=" + this.a + ", animationPosition=" + this.b + ")";
    }
}
