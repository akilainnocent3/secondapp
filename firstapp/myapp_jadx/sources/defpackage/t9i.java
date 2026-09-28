package defpackage;

import androidx.recyclerview.widget.r;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t9i implements Comparable<t9i> {
    public static final t9i A;
    public static final t9i B;
    public static final t9i C;
    public static final t9i D;
    public static final t9i E;
    public static final t9i F;
    public static final t9i G;
    public static final List<t9i> H;
    public static final t9i b;
    public static final t9i c;
    public static final t9i d;
    public static final t9i e;
    public static final t9i f;
    public static final t9i i;
    public static final t9i v;
    public static final t9i w;
    public static final t9i y;
    public static final t9i z;
    public final int a;

    static {
        t9i t9iVar = new t9i(100);
        b = t9iVar;
        t9i t9iVar2 = new t9i(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        c = t9iVar2;
        t9i t9iVar3 = new t9i(300);
        d = t9iVar3;
        t9i t9iVar4 = new t9i(400);
        e = t9iVar4;
        t9i t9iVar5 = new t9i(500);
        f = t9iVar5;
        t9i t9iVar6 = new t9i(600);
        i = t9iVar6;
        t9i t9iVar7 = new t9i(700);
        v = t9iVar7;
        t9i t9iVar8 = new t9i(800);
        w = t9iVar8;
        t9i t9iVar9 = new t9i(900);
        y = t9iVar9;
        z = t9iVar;
        A = t9iVar3;
        B = t9iVar4;
        C = t9iVar5;
        D = t9iVar6;
        E = t9iVar7;
        F = t9iVar8;
        G = t9iVar9;
        H = b.k(t9iVar, t9iVar2, t9iVar3, t9iVar4, t9iVar5, t9iVar6, t9iVar7, t9iVar8, t9iVar9);
    }

    public t9i(int i2) {
        this.a = i2;
        boolean z2 = false;
        if (1 <= i2 && i2 < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        xkn.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(t9i t9iVar) {
        return Intrinsics.h(this.a, t9iVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t9i) {
            return this.a == ((t9i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return rr1.b(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}
