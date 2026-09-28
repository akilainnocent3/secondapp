package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w630 {
    public static final w630 c = new w630();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final vnu a = new vnu();

    public final <T> bn70<T> a(Class<T> cls) {
        t3h<?> t3hVar;
        bn70<T> bn70VarT;
        Class<?> cls2;
        fyo.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        bn70<T> bn70Var = (bn70) concurrentHashMap.get(cls);
        if (bn70Var != null) {
            return bn70Var;
        }
        Class<?> cls3 = on70.a;
        if (!m1k.class.isAssignableFrom(cls) && (cls2 = on70.a) != null && !cls2.isAssignableFrom(cls)) {
            hb5.a("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        tnv tnvVarMessageInfoFor = this.a.a.messageInfoFor(cls);
        if (tnvVarMessageInfoFor.isMessageSetWireFormat()) {
            if (m1k.class.isAssignableFrom(cls)) {
                bn70VarT = new nov<>(on70.c, x3h.a, tnvVarMessageInfoFor.getDefaultInstance());
            } else {
                bgh0<?, ?> bgh0Var = on70.b;
                t3h<?> t3hVar2 = x3h.b;
                if (t3hVar2 == null) {
                    ib5.a("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                bn70VarT = new nov<>(bgh0Var, t3hVar2, tnvVarMessageInfoFor.getDefaultInstance());
            }
        } else if (m1k.class.isAssignableFrom(cls)) {
            bn70VarT = kov.t(tnvVarMessageInfoFor, pqx.b, rhs.b, on70.c, tnvVarMessageInfoFor.getSyntax().ordinal() != 1 ? x3h.a : null, qou.b);
        } else {
            lqx lqxVar = pqx.a;
            phs phsVar = rhs.a;
            bgh0<?, ?> bgh0Var2 = on70.b;
            if (tnvVarMessageInfoFor.getSyntax().ordinal() != 1) {
                t3h<?> t3hVar3 = x3h.b;
                if (t3hVar3 == null) {
                    ib5.a("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                t3hVar = t3hVar3;
            } else {
                t3hVar = null;
            }
            bn70VarT = kov.t(tnvVarMessageInfoFor, lqxVar, phsVar, bgh0Var2, t3hVar, qou.a);
        }
        bn70<T> bn70Var2 = (bn70) concurrentHashMap.putIfAbsent(cls, bn70VarT);
        return bn70Var2 != null ? bn70Var2 : bn70VarT;
    }
}
