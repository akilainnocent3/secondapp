package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s9g {
    public static final t9g a = new t9g(new ntg0((o8h) null, (xy90) null, (x57) null, (wy60) null, (LinkedHashMap) null, 63));

    public abstract ntg0 a();

    public final t9g b(s9g s9gVar) {
        o8h o8hVar = s9gVar.a().a;
        if (o8hVar == null) {
            o8hVar = a().a;
        }
        xy90 xy90Var = s9gVar.a().b;
        if (xy90Var == null) {
            xy90Var = a().b;
        }
        x57 x57Var = s9gVar.a().c;
        if (x57Var == null) {
            x57Var = a().c;
        }
        wy60 wy60Var = s9gVar.a().d;
        if (wy60Var == null) {
            wy60Var = a().d;
        }
        return new t9g(new ntg0(o8hVar, xy90Var, x57Var, wy60Var, kpu.h(a().f, s9gVar.a().f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s9g) && Intrinsics.g(((s9g) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "EnterTransition.None";
        }
        ntg0 ntg0VarA = a();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
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
        return sb.toString();
    }
}
