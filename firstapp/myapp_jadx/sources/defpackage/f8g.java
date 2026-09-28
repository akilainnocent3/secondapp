package defpackage;

import androidx.compose.animation.g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f8g extends qlr implements Function1<w7g, jsg0> {
    public final /* synthetic */ jsg0 a;
    public final /* synthetic */ s9g b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8g(jsg0 jsg0Var, s9g s9gVar, g gVar) {
        super(1);
        this.a = jsg0Var;
        this.b = s9gVar;
        this.c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final jsg0 invoke(w7g w7gVar) {
        int iOrdinal = w7gVar.ordinal();
        jsg0 jsg0Var = null;
        s9g s9gVar = this.b;
        g gVar = this.c;
        if (iOrdinal == 0) {
            wy60 wy60Var = s9gVar.a().d;
            if (wy60Var != null) {
                jsg0Var = new jsg0(wy60Var.b);
            } else {
                wy60 wy60Var2 = gVar.a().d;
                if (wy60Var2 != null) {
                    jsg0Var = new jsg0(wy60Var2.b);
                }
            }
        } else if (iOrdinal == 1) {
            jsg0Var = this.a;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            wy60 wy60Var3 = gVar.a().d;
            if (wy60Var3 != null) {
                jsg0Var = new jsg0(wy60Var3.b);
            } else {
                wy60 wy60Var4 = s9gVar.a().d;
                if (wy60Var4 != null) {
                    jsg0Var = new jsg0(wy60Var4.b);
                }
            }
        }
        return new jsg0(jsg0Var != null ? jsg0Var.a : jsg0.b);
    }
}
