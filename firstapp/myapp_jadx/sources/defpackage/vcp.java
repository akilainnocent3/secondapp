package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class vcp {
    public final cwf a;
    public boolean b;

    public static final /* synthetic */ class a extends saj implements Function2<pd80, Integer, Boolean> {
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(pd80 pd80Var, Integer num) {
            pd80 pd80Var2 = pd80Var;
            int iIntValue = num.intValue();
            pd80Var2.getClass();
            vcp vcpVar = (vcp) this.receiver;
            vcpVar.getClass();
            boolean z = !pd80Var2.i(iIntValue) && pd80Var2.g(iIntValue).b();
            vcpVar.b = z;
            return Boolean.valueOf(z);
        }
    }

    public vcp(pd80 pd80Var) {
        pd80Var.getClass();
        this.a = new cwf(pd80Var, new a(2, this, vcp.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
