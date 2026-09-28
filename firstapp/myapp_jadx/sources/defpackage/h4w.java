package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h4w {
    public static final a a = new a();

    public static class a implements f4w.a {
    }

    public static <P> g4w a(hw20<P> hw20Var) {
        ymp ympVar;
        ArrayList arrayList = new ArrayList();
        e4w e4wVar = e4w.b;
        e4w e4wVar2 = hw20Var.c;
        Iterator<List<hw20.b<P>>> it = hw20Var.a.values().iterator();
        while (it.hasNext()) {
            for (hw20.b<P> bVar : it.next()) {
                int iOrdinal = bVar.d.ordinal();
                if (iOrdinal == 1) {
                    ympVar = ymp.b;
                } else if (iOrdinal == 2) {
                    ympVar = ymp.c;
                } else {
                    if (iOrdinal != 3) {
                        ib5.a("Unknown key status");
                        return null;
                    }
                    ympVar = ymp.d;
                }
                int i = bVar.f;
                String strSubstring = bVar.g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new g4w.a(ympVar, i, strSubstring, bVar.e.name()));
            }
        }
        hw20.b<P> bVar2 = hw20Var.b;
        Integer numValueOf = bVar2 != null ? Integer.valueOf(bVar2.f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((g4w.a) obj).b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                dad.a(e);
                return null;
            }
        }
        return new g4w(e4wVar2, Collections.unmodifiableList(arrayList), numValueOf);
    }
}
