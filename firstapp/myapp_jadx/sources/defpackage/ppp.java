package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ppp {
    public final mpp a;
    public final List<a> b;
    public final e4w c = e4w.b;

    public static final class a {
        public final b3 a;

        public a(b3 b3Var) {
            this.a = b3Var;
        }
    }

    public ppp(mpp mppVar, List<a> list) {
        this.a = mppVar;
        this.b = list;
    }

    public static final ppp a(mpp mppVar) throws GeneralSecurityException {
        if (mppVar.y() <= 0) {
            opp.a("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(mppVar.y());
        for (mpp.b bVar : mppVar.z()) {
            bVar.getClass();
            try {
                try {
                    b3 b3VarA = ttw.b.a(n630.a(bVar.w().y(), bVar.w().z(), bVar.w().x(), bVar.y(), bVar.y() == uaz.RAW ? null : Integer.valueOf(bVar.x())));
                    int iOrdinal = bVar.z().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new a(b3VarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new ayf0("Creating a protokey serialization failed", e);
            }
        }
        return new ppp(mppVar, Collections.unmodifiableList(arrayList));
    }

    public static final ppp c(a64 a64Var, c80 c80Var) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = a64Var.a;
        try {
            m4g m4gVarY = m4g.y(byteArrayInputStream, r3h.a());
            byteArrayInputStream.close();
            if (m4gVarY.w().size() == 0) {
                opp.a("empty keyset");
                return null;
            }
            try {
                mpp mppVarD = mpp.D(c80Var.b(m4gVarY.w().k(), bArr), r3h.a());
                if (mppVarD.y() > 0) {
                    return a(mppVarD);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (f0p unused) {
                opp.a("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public final String toString() {
        return grh0.a(this.a).toString();
    }

    public final <P> P b(Class<P> cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        Object objB;
        AtomicReference<mmp> atomicReference = y050.a;
        try {
            HashMap map = ktw.b.a.get().b;
            if (map.containsKey(cls)) {
                clsA = ((iw20) map.get(cls)).a();
            } else {
                v050.a(cls, "No input primitive class for ", " available");
                clsA = null;
            }
        } catch (GeneralSecurityException unused) {
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i = grh0.a;
        mpp mppVar = this.a;
        int iA = mppVar.A();
        Iterator<mpp.b> it = mppVar.z().iterator();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            zmp zmpVar = zmp.ENABLED;
            if (!zHasNext) {
                if (i2 == 0) {
                    opp.a("keyset must contain at least one ENABLED key");
                    return null;
                }
                if (!z && !z2) {
                    opp.a("keyset doesn't contain a valid primary key");
                    return null;
                }
                hw20.a aVar = new hw20.a(clsA);
                if (aVar.b == null) {
                    ib5.a(ACKxwYRsuWyGz.EVNugRgsZfKu);
                    return null;
                }
                aVar.d = this.c;
                for (int i3 = 0; i3 < mppVar.y(); i3++) {
                    mpp.b bVarX = mppVar.x(i3);
                    if (bVarX.z().equals(zmpVar)) {
                        try {
                            bmp bmpVarW = bVarX.w();
                            AtomicReference<mmp> atomicReference2 = y050.a;
                            objC = y050.c(bmpVarW.y(), bmpVarW.z(), clsA);
                        } catch (GeneralSecurityException e) {
                            if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                                throw e;
                            }
                            objC = null;
                        }
                        List<a> list = this.b;
                        if (list.get(i3) != null) {
                            try {
                                objB = y050.b(list.get(i3).a, clsA);
                            } catch (GeneralSecurityException unused2) {
                                objB = null;
                            }
                        } else {
                            objB = null;
                        }
                        if (bVarX.x() == mppVar.A()) {
                            aVar.a(objB, objC, bVarX, true);
                        } else {
                            aVar.a(objB, objC, bVarX, false);
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = aVar.b;
                if (concurrentHashMap == null) {
                    ib5.a("build cannot be called twice");
                    return null;
                }
                hw20.b<P> bVar = aVar.c;
                e4w e4wVar = aVar.d;
                Class<P> cls2 = aVar.a;
                hw20 hw20Var = new hw20(concurrentHashMap, bVar, e4wVar, cls2);
                aVar.b = null;
                AtomicReference<mmp> atomicReference3 = y050.a;
                HashMap map2 = ktw.b.a.get().b;
                if (!map2.containsKey(cls)) {
                    npp.a(cls, "No wrapper found for ");
                    return null;
                }
                iw20 iw20Var = (iw20) map2.get(cls);
                if (cls2.equals(iw20Var.a()) && iw20Var.a().equals(cls2)) {
                    return (P) iw20Var.c(hw20Var);
                }
                opp.a("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                return null;
            }
            mpp.b next = it.next();
            if (next.z() == zmpVar) {
                if (!next.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(next.x())));
                }
                if (next.y() == uaz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.x())));
                }
                if (next.z() == zmp.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.x())));
                }
                if (next.x() == iA) {
                    if (z) {
                        opp.a("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (next.w().x() != bmp.b.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
    }
}
