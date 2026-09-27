package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5382sl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dc f98322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cc f98323b;

    public C5382sl(PublicLogger publicLogger, String str) {
        this(new Dc(str, publicLogger), new Cc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Gc gc2, String str, String str2) {
        try {
            int size = gc2.size();
            int i10 = this.f98322a.f95726c.f97938a;
            if (size < i10 || (i10 == gc2.size() && gc2.containsKey(str))) {
                this.f98323b.getClass();
                int length = gc2.f95856a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (gc2.containsKey(str)) {
                    String str3 = (String) gc2.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    gc2.put(str, str2);
                    return true;
                }
                Cc cc2 = this.f98323b;
                cc2.f95685b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", cc2.f95684a, 4500, str);
            } else {
                Dc dc2 = this.f98322a;
                dc2.f95727d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", dc2.f95728e, Integer.valueOf(dc2.f95726c.f97938a), str);
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean b(Gc gc2, String str, String str2) {
        if (gc2 == null) {
            return false;
        }
        String strA = this.f98322a.f95724a.a(str);
        String strA2 = this.f98322a.f95725b.a(str2);
        if (!gc2.containsKey(strA)) {
            if (strA2 != null) {
                return a(gc2, strA, strA2);
            }
            return false;
        }
        String str3 = (String) gc2.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(gc2, strA, strA2);
        }
        return false;
    }

    public C5382sl(Dc dc2, Cc cc2) {
        this.f98322a = dc2;
        this.f98323b = cc2;
    }
}
