package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes8.dex */
public final class g120 {
    public static final void a(yd80 yd80Var) {
        yd80Var.getClass();
        if (yd80Var instanceof yd80.b) {
            ib5.a("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (yd80Var instanceof bw20) {
            ib5.a("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (yd80Var instanceof f120) {
            ib5.a("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String b(wbp wbpVar, pd80 pd80Var) {
        pd80Var.getClass();
        wbpVar.getClass();
        for (Annotation annotation : pd80Var.getAnnotations()) {
            if (annotation instanceof ecp) {
                return ((ecp) annotation).discriminator();
            }
        }
        return wbpVar.a.d;
    }

    public static final void c(he80<?> he80Var, he80<?> he80Var2, String str) {
        if (he80Var instanceof nt70) {
            pd80 descriptor = he80Var2.getDescriptor();
            descriptor.getClass();
            if (fz9.a(descriptor).contains(str)) {
                StringBuilder sbA = ux5.a("Sealed class '", he80Var2.getDescriptor().h(), "' cannot be serialized as base class '", ((nt70) he80Var).getDescriptor().h(), "' because it has property name that conflicts with JSON class discriminator '");
                sbA.append(str);
                sbA.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbA.toString().toString());
            }
        }
    }
}
