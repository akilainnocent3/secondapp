package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5189l2 f96889a;

    public Zk(InterfaceC5189l2 interfaceC5189l2) {
        this.f96889a = interfaceC5189l2;
    }

    public final ArrayList a(Iterable iterable) {
        String hexString;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String strA = this.f96889a.a(str);
                if (strA == null || (hexString = StringUtils.toHexString(MessageDigest.getInstance(to.c.algoTypeS2).digest(strA.getBytes(cv.g.f77202b)))) == null) {
                    PublicLogger.Companion.getAnonymousInstance().info("Input " + str + " is not a valid data", new Object[0]);
                    hexString = null;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
            if (hexString != null) {
                arrayList.add(hexString);
            }
        }
        return arrayList;
    }
}
