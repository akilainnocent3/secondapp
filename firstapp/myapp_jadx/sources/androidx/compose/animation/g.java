package androidx.compose.animation;

import defpackage.kpu;
import defpackage.ntg0;
import defpackage.o8h;
import defpackage.owg;
import defpackage.wy60;
import defpackage.x57;
import defpackage.xy90;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final owg a = new owg(new ntg0((o8h) null, (xy90) null, (x57) null, (wy60) null, (LinkedHashMap) null, 63));
    public static final owg b = new owg(new ntg0((o8h) null, (xy90) null, (x57) null, (wy60) null, (LinkedHashMap) null, 47));

    public static final class a {
    }

    public abstract ntg0 a();

    public final owg b(g gVar) {
        o8h o8hVar = gVar.a().a;
        if (o8hVar == null) {
            o8hVar = a().a;
        }
        xy90 xy90Var = gVar.a().b;
        if (xy90Var == null) {
            xy90Var = a().b;
        }
        x57 x57Var = gVar.a().c;
        if (x57Var == null) {
            x57Var = a().c;
        }
        wy60 wy60Var = gVar.a().d;
        if (wy60Var == null) {
            wy60Var = a().d;
        }
        return new owg(new ntg0(o8hVar, xy90Var, x57Var, wy60Var, gVar.a().e || a().e, kpu.h(a().f, gVar.a().f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g) && Intrinsics.g(((g) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        ntg0 ntg0VarA = a();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        o8h o8hVar = ntg0VarA.a;
        sb.append(o8hVar != null ? o8hVar.toString() : null);
        sb.append(",\nSlide - ");
        xy90 xy90Var = ntg0VarA.b;
        sb.append(xy90Var != null ? xy90Var.toString() : null);
        sb.append(",\nShrink - ");
        x57 x57Var = ntg0VarA.c;
        sb.append(x57Var != null ? x57Var.toString() : null);
        sb.append(",\nScale - ");
        wy60 wy60Var = ntg0VarA.d;
        sb.append(wy60Var != null ? wy60Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(ntg0VarA.e);
        return sb.toString();
    }
}
