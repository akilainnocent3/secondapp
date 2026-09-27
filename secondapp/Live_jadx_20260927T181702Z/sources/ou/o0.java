package ou;

import com.ironsource.C4235d4;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class o0 extends v1 implements su.k, su.m {
    public o0() {
        super(null);
    }

    @oy.l
    public abstract o0 P0(boolean z10);

    @oy.l
    public abstract o0 Q0(@oy.l c1 c1Var);

    @oy.l
    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<xs.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            cv.h0.u0(sb2, C4235d4.j.f61460d, zt.c.s(zt.c.f162383j, it.next(), null, 2, null), "] ");
        }
        sb2.append(I0());
        if (!G0().isEmpty()) {
            fr.r0.o3(G0(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "<", (112 & 8) == 0 ? ">" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
        if (J0()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
