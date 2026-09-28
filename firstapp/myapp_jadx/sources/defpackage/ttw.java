package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ttw {
    public static final ttw b = new ttw();
    public final AtomicReference<ge80> a = new AtomicReference<>(new ge80(new ge80.a()));

    public final b3 a(n630 n630Var) throws GeneralSecurityException {
        AtomicReference<ge80> atomicReference = this.a;
        ge80 ge80Var = atomicReference.get();
        ge80Var.getClass();
        sl5 sl5Var = n630Var.b;
        if (!ge80Var.b.containsKey(new ge80.b(n630.class, sl5Var))) {
            try {
                b6s b6sVar = new b6s(8);
                n630Var.d.ordinal();
                return b6sVar;
            } catch (GeneralSecurityException e) {
                throw new ayf0("Creating a LegacyProtoKey failed", e);
            }
        }
        ge80 ge80Var2 = atomicReference.get();
        ge80Var2.getClass();
        ge80.b bVar = new ge80.b(n630.class, sl5Var);
        HashMap map = ge80Var2.b;
        if (map.containsKey(bVar)) {
            return ((qmp) map.get(bVar)).a(n630Var);
        }
        v050.a(bVar, "No Key Parser for requested key type ", " available");
        return null;
    }

    public final synchronized <SerializationT extends be80> void b(qmp<SerializationT> qmpVar) {
        ge80.a aVar = new ge80.a(this.a.get());
        qmpVar.getClass();
        ge80.b bVar = new ge80.b(n630.class, qmpVar.a);
        HashMap map = aVar.b;
        if (map.containsKey(bVar)) {
            qmp qmpVar2 = (qmp) map.get(bVar);
            if (!qmpVar2.equals(qmpVar) || !qmpVar.equals(qmpVar2)) {
                npp.a(bVar, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(bVar, qmpVar);
        }
        this.a.set(new ge80(aVar));
    }

    public final synchronized <KeyT extends b3, SerializationT extends be80> void c(xmp<KeyT, SerializationT> xmpVar) {
        ge80.a aVar = new ge80.a(this.a.get());
        ge80.c cVar = new ge80.c(xmpVar.a, n630.class);
        HashMap map = aVar.a;
        if (map.containsKey(cVar)) {
            xmp xmpVar2 = (xmp) map.get(cVar);
            if (!xmpVar2.equals(xmpVar) || !xmpVar.equals(xmpVar2)) {
                npp.a(cVar, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(cVar, xmpVar);
        }
        this.a.set(new ge80(aVar));
    }

    public final synchronized <SerializationT extends be80> void d(yrz<SerializationT> yrzVar) {
        ge80.a aVar = new ge80.a(this.a.get());
        yrzVar.getClass();
        ge80.b bVar = new ge80.b(o630.class, yrzVar.a);
        HashMap map = aVar.d;
        if (map.containsKey(bVar)) {
            yrz yrzVar2 = (yrz) map.get(bVar);
            if (!yrzVar2.equals(yrzVar) || !yrzVar.equals(yrzVar2)) {
                npp.a(bVar, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(bVar, yrzVar);
        }
        this.a.set(new ge80(aVar));
    }

    public final synchronized <ParametersT extends bjb0, SerializationT extends be80> void e(asz<ParametersT, SerializationT> aszVar) {
        ge80.a aVar = new ge80.a(this.a.get());
        ge80.c cVar = new ge80.c(aszVar.a, o630.class);
        HashMap map = aVar.c;
        if (map.containsKey(cVar)) {
            asz aszVar2 = (asz) map.get(cVar);
            if (!aszVar2.equals(aszVar) || !aszVar.equals(aszVar2)) {
                npp.a(cVar, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(cVar, aszVar);
        }
        this.a.set(new ge80(aVar));
    }
}
