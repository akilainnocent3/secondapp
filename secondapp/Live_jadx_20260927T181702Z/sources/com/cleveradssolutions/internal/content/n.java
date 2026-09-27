package com.cleveradssolutions.internal.content;

import fr.y1;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n implements com.cleveradssolutions.mediation.core.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f43426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43427c = new Object();

    public n(HashMap map) {
        this.f43426b = map;
    }

    @Override // com.cleveradssolutions.mediation.core.u
    public final long B(String key, long j10) {
        m0.p(key, "key");
        Object parameter = getParameter(key);
        if (parameter instanceof Long) {
            return ((Number) parameter).longValue();
        }
        if (parameter instanceof Number) {
            return ((Number) parameter).longValue();
        }
        if (parameter instanceof String) {
            try {
                return (long) Double.parseDouble((String) parameter);
            } catch (NumberFormatException unused) {
            }
        }
        return j10;
    }

    @Override // com.cleveradssolutions.mediation.core.u
    public final String K0(String key) {
        m0.p(key, "key");
        Object parameter = getParameter(key);
        if (parameter != null) {
            return parameter.toString();
        }
        return null;
    }

    public final boolean R0(String key) {
        m0.p(key, "key");
        int iR0 = r0(key, -1);
        return iR0 < 0 || iR0 != 0;
    }

    public final Object S0(String key) {
        Object objRemove;
        m0.p(key, "key");
        synchronized (this.f43427c) {
            HashMap map = this.f43426b;
            objRemove = map != null ? map.remove(key) : null;
        }
        return objRemove;
    }

    public final Boolean T0(String key) {
        m0.p(key, "key");
        int iR0 = r0(key, -1);
        if (iR0 < 0) {
            return null;
        }
        return Boolean.valueOf(iR0 != 0);
    }

    @Override // com.cleveradssolutions.mediation.core.u
    public Set e() {
        Set setK;
        synchronized (this.f43427c) {
            try {
                if (this.f43426b == null) {
                    Q0();
                }
                HashMap map = this.f43426b;
                if (map == null || (setK = map.keySet()) == null) {
                    setK = y1.k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return setK;
    }

    @Override // com.cleveradssolutions.mediation.core.u
    public Object getParameter(String key) {
        Object obj;
        m0.p(key, "key");
        synchronized (this.f43427c) {
            try {
                if (this.f43426b == null) {
                    Q0();
                }
                HashMap map = this.f43426b;
                if (map != null) {
                    String lowerCase = key.toLowerCase(Locale.ROOT);
                    m0.o(lowerCase, "toLowerCase(...)");
                    obj = map.get(lowerCase);
                } else {
                    obj = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.cleveradssolutions.mediation.core.u
    public final int r0(String key, int i10) {
        m0.p(key, "key");
        Object parameter = getParameter(key);
        if (parameter instanceof Integer) {
            return ((Number) parameter).intValue();
        }
        if (parameter instanceof Number) {
            return ((Number) parameter).intValue();
        }
        if (parameter instanceof String) {
            try {
                return (int) Double.parseDouble((String) parameter);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    @Override // com.cleveradssolutions.mediation.core.u
    public final void setParameter(String key, Object obj) {
        m0.p(key, "key");
        String lowerCase = key.toLowerCase(Locale.ROOT);
        m0.o(lowerCase, "toLowerCase(...)");
        synchronized (this.f43427c) {
            try {
                if (obj == null) {
                    HashMap map = this.f43426b;
                    if (map != null) {
                        map.remove(lowerCase);
                    }
                } else {
                    if (this.f43426b == null) {
                        Q0();
                    }
                    if (this.f43426b == null) {
                        this.f43426b = new HashMap();
                    }
                    HashMap map2 = this.f43426b;
                    if (map2 != null) {
                        map2.put(lowerCase, obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void Q0() {
    }
}
