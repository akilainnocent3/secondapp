package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class u630 {
    public static final u630 c = new u630();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final wnu a = new wnu();

    public final <T> an70<T> a(Class<T> cls) {
        an70<T> an70VarV;
        Class<?> cls2;
        gyo.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        an70<T> an70Var = (an70) concurrentHashMap.get(cls);
        if (an70Var != null) {
            return an70Var;
        }
        Class<?> cls3 = nn70.a;
        if (!n1k.class.isAssignableFrom(cls) && (cls2 = nn70.a) != null && !cls2.isAssignableFrom(cls)) {
            hb5.a("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        snv snvVarMessageInfoFor = this.a.a.messageInfoFor(cls);
        if (!snvVarMessageInfoFor.isMessageSetWireFormat()) {
            boolean zIsAssignableFrom = n1k.class.isAssignableFrom(cls);
            s630 s630Var = s630.a;
            if (zIsAssignableFrom) {
                an70VarV = snvVarMessageInfoFor.getSyntax() == s630Var ? jov.v(snvVarMessageInfoFor, oqx.b, ohs.b, nn70.d, w3h.a, pou.b) : jov.v(snvVarMessageInfoFor, oqx.b, ohs.b, nn70.d, null, pou.b);
            } else if (snvVarMessageInfoFor.getSyntax() == s630Var) {
                kqx kqxVar = oqx.a;
                ohs.a aVar = ohs.a;
                agh0<?, ?> agh0Var = nn70.b;
                s3h<?> s3hVar = w3h.b;
                if (s3hVar == null) {
                    ib5.a("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                an70VarV = jov.v(snvVarMessageInfoFor, kqxVar, aVar, agh0Var, s3hVar, pou.a);
            } else {
                an70VarV = jov.v(snvVarMessageInfoFor, oqx.a, ohs.a, nn70.c, null, pou.a);
            }
        } else if (n1k.class.isAssignableFrom(cls)) {
            an70VarV = new mov<>(nn70.d, w3h.a, snvVarMessageInfoFor.getDefaultInstance());
        } else {
            agh0<?, ?> agh0Var2 = nn70.b;
            s3h<?> s3hVar2 = w3h.b;
            if (s3hVar2 == null) {
                ib5.a("Protobuf runtime is not correctly loaded.");
                return null;
            }
            an70VarV = new mov<>(agh0Var2, s3hVar2, snvVarMessageInfoFor.getDefaultInstance());
        }
        an70<T> an70Var2 = (an70) concurrentHashMap.putIfAbsent(cls, an70VarV);
        return an70Var2 != null ? an70Var2 : an70VarV;
    }
}
