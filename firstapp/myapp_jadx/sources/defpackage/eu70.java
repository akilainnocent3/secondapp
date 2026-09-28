package defpackage;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class eu70 {
    public final rdd0 a;
    public final mgb0 b;

    public eu70(rdd0 rdd0Var, mgb0 mgb0Var) {
        rdd0Var.getClass();
        mgb0Var.getClass();
        this.a = rdd0Var;
        this.b = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    public static void b(eu70 eu70Var, String str, mx70 mx70Var, int i) {
        ny70 ny70Var;
        String str2 = null;
        if ((i & 2) != 0) {
            mx70Var = null;
        }
        int size = 0;
        boolean z = (i & 4) == 0;
        eu70Var.getClass();
        str.getClass();
        rdd0 rdd0Var = eu70Var.a;
        if (mx70Var != null) {
            vt70 vt70Var = (vt70) CollectionsKt.firstOrNull(mx70Var.a);
            if (vt70Var != null) {
                vw70 vw70Var = vt70Var.e;
                if (!vw70Var.b.isEmpty() || !vw70Var.a.isEmpty()) {
                    ny70Var = ny70.MATCH;
                } else if (!vt70Var.f.isEmpty()) {
                    ny70Var = ny70.TEAM;
                } else if (!vt70Var.g.isEmpty()) {
                    ny70Var = ny70.TOURNAMENT;
                } else if (!vt70Var.h.isEmpty()) {
                    ny70Var = ny70.PLAYER;
                } else if (vt70Var.i.isEmpty()) {
                    ny70Var = null;
                } else {
                    ny70Var = ny70.GAME;
                }
            } else {
                ny70Var = null;
            }
            if (ny70Var != null) {
                str2 = ny70Var.a;
            }
        }
        if (mx70Var != null) {
            for (vt70 vt70Var2 : mx70Var.a) {
                size += vt70Var2.i.size() + vt70Var2.f.size() + vt70Var2.g.size() + vt70Var2.h.size() + vt70Var2.e.a.size() + vt70Var2.e.b.size();
            }
        }
        rdd0Var.a(new oy70(size, str2, str, z), k00.d);
    }

    public final void a(String str, String str2, ny70 ny70Var) {
        str.getClass();
        str2.getClass();
        this.a.a(new ox70(ny70Var.a, str, str2), k00.d);
    }
}
