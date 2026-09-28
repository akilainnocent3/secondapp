package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sar implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sar(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                int length = str.length();
                ((Function1) obj2).invoke(new i9r.h(new ijf0(str, vlf0.a(length, length), 4)));
                return Unit.a;
            case 1:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((Function1) obj2).invoke(new jxo(urrVar.a()));
                return Unit.a;
            default:
                jl00 jl00Var = ((kl00) obj2).n.get(((Integer) obj).intValue());
                String str2 = jl00Var.a;
                long j = jl00Var.c;
                int i2 = jl00Var.g;
                String str3 = jl00Var.h;
                int i3 = jl00Var.i;
                String str4 = jl00Var.j;
                long jNanoTime = System.nanoTime();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("_");
                sb.append(j);
                sb.append("_");
                f78.b(i2, "_", str3, "_", sb);
                f78.b(i3, "_", str4, "_", sb);
                sb.append(jNanoTime);
                return sb.toString();
        }
    }
}
