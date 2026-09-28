package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class r4 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static u5n a(d68 d68Var, long j) {
        u5n u5nVar = d68Var.f0;
        if (u5nVar != null) {
            return u5nVar;
        }
        long j2 = j58.l;
        u5n u5nVar2 = new u5n(j2, j, j2, j58.c(ovd0.a, j));
        d68Var.f0 = u5nVar2;
        return u5nVar2;
    }

    public static u5n b(a aVar) {
        long j = ((j58) aVar.O(iza.a)).a;
        u5n u5nVarA = a((d68) aVar.O(g68.a), j);
        if (nbh0.a(u5nVarA.b, j)) {
            return u5nVarA;
        }
        return u5nVarA.a(u5nVarA.a, j, u5nVarA.c, j58.c(ovd0.a, j));
    }

    public static u5n c(long j, long j2, a aVar, int i) {
        long j3 = j58.m;
        if ((i & 8) != 0) {
            j2 = j58.c(ovd0.a, j);
        }
        return a((d68) aVar.O(g68.a), ((j58) aVar.O(iza.a)).a).a(j3, j, j3, j2);
    }

    public static final void d(ygp ygpVar, String str) {
        String string;
        ygpVar.getClass();
        String str2 = "in the polymorphic scope of '" + ygpVar.k() + '\'';
        if (str == null) {
            string = zdf0.a('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbA = ux5.a("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            hxa.c(sbA, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbA.append(ygpVar.k());
            sbA.append("' has to be sealed and '@Serializable'.");
            string = sbA.toString();
        }
        throw new ee80(string);
    }
}
