package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class y050 {
    public static final AtomicReference<mmp> a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;

    static {
        Logger.getLogger(y050.class.getName());
        a = new AtomicReference<>(new mmp());
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    public static synchronized <KeyProtoT extends wnv, KeyFormatProtoT extends wnv> void a(String str, Map<String, gnp.a.C0605a<KeyFormatProtoT>> map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (a.get().a.containsKey(str)) {
                for (Map.Entry<String, gnp.a.C0605a<KeyFormatProtoT>> entry : map.entrySet()) {
                    if (!d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + entry.getKey() + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry<String, gnp.a.C0605a<KeyFormatProtoT>> entry2 : map.entrySet()) {
                    if (d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + entry2.getKey());
                    }
                }
            }
        }
    }

    public static <KeyT extends b3, P> P b(KeyT keyt, Class<P> cls) {
        ew20 ew20Var = ktw.b.a.get();
        ew20Var.getClass();
        ew20.b bVar = new ew20.b(keyt.getClass(), cls);
        HashMap map = ew20Var.a;
        if (map.containsKey(bVar)) {
            return (P) ((zv20) map.get(bVar)).a(keyt);
        }
        v050.a(bVar, "No PrimitiveConstructor for ", " available");
        return null;
    }

    public static <P> P c(String str, ql5 ql5Var, Class<P> cls) {
        mmp mmpVar = a.get();
        mmpVar.getClass();
        mmp.a aVarA = mmpVar.a(str);
        if (aVarA.b().contains(cls)) {
            kmp kmpVarC = aVarA.c(cls);
            gnp<KeyProtoT> gnpVar = kmpVarC.a;
            try {
                wnv wnvVarE = gnpVar.e(ql5Var);
                Class<PrimitiveT> cls2 = kmpVarC.b;
                if (Void.class.equals(cls2)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                gnpVar.f(wnvVarE);
                aw20 aw20Var = (aw20) gnpVar.b.get(cls2);
                if (aw20Var != null) {
                    return (P) aw20Var.a(wnvVarE);
                }
                d9h0.a(cls2.getCanonicalName(), "Requested primitive class ", " not supported.");
                return null;
            } catch (f0p e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(gnpVar.a.getName()), e);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(aVarA.a());
        sb.append(", supported primitives: ");
        Set<Class<?>> setB = aVarA.b();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class<?> cls3 : setB) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls3.getCanonicalName());
            z = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static Object d(String str, byte[] bArr) {
        ql5.f fVar = ql5.b;
        return c(str, ql5.c(bArr, 0, bArr.length), vm.class);
    }

    public static synchronized bmp e(bnp bnpVar) {
        kmp kmpVarD;
        kmpVarD = a.get().a(bnpVar.y()).d();
        if (!((Boolean) c.get(bnpVar.y())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + bnpVar.y());
        }
        return kmpVarD.a(bnpVar.z());
    }

    public static synchronized <KeyProtoT extends wnv> void f(gnp<KeyProtoT> gnpVar, boolean z) {
        try {
            AtomicReference<mmp> atomicReference = a;
            mmp mmpVar = new mmp(atomicReference.get());
            mmpVar.b(gnpVar);
            String strB = gnpVar.b();
            a(strB, z ? gnpVar.c().b() : Collections.EMPTY_MAP, z);
            if (!atomicReference.get().a.containsKey(strB)) {
                b.put(strB, new w050());
                if (z) {
                    g(strB, gnpVar.c().b());
                }
            }
            c.put(strB, Boolean.valueOf(z));
            atomicReference.set(mmpVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static <KeyFormatProtoT extends wnv> void g(String str, Map<String, gnp.a.C0605a<KeyFormatProtoT>> map) {
        uaz uazVar;
        for (Map.Entry<String, gnp.a.C0605a<KeyFormatProtoT>> entry : map.entrySet()) {
            String key = entry.getKey();
            byte[] byteArray = entry.getValue().a.toByteArray();
            anp.a aVar = entry.getValue().b;
            bnp.a aVarA = bnp.A();
            aVarA.e();
            ((bnp) aVarA.b).C(str);
            ql5.f fVarC = ql5.c(byteArray, 0, byteArray.length);
            aVarA.e();
            ((bnp) aVarA.b).D(fVarC);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                uazVar = uaz.TINK;
            } else if (iOrdinal == 1) {
                uazVar = uaz.LEGACY;
            } else if (iOrdinal == 2) {
                uazVar = uaz.RAW;
            } else {
                if (iOrdinal != 3) {
                    hb5.a("Unknown output prefix type");
                    return;
                }
                uazVar = uaz.CRUNCHY;
            }
            aVarA.e();
            ((bnp) aVarA.b).B(uazVar);
            d.put(key, new anp(aVarA.b()));
        }
    }

    public static synchronized <B, P> void h(iw20<B, P> iw20Var) {
        ktw ktwVar = ktw.b;
        synchronized (ktwVar) {
            ew20.a aVar = new ew20.a(ktwVar.a.get());
            HashMap map = aVar.b;
            if (iw20Var != null) {
                Class<P> clsB = iw20Var.b();
                if (map.containsKey(clsB)) {
                    iw20 iw20Var2 = (iw20) map.get(clsB);
                    if (!iw20Var2.equals(iw20Var) || !iw20Var.equals(iw20Var2)) {
                        npp.a(clsB, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                    }
                } else {
                    map.put(clsB, iw20Var);
                }
            } else {
                bmy.a("wrapper must be non-null");
            }
            ktwVar.a.set(new ew20(aVar));
        }
    }
}
