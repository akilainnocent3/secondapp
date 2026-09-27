package com.fyber.inneractive.sdk.config.global.features;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends com.fyber.inneractive.sdk.config.global.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f44376c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f44377d = new HashMap();

    public h(String str) {
        this.f44375b = str;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String a(String str, String str2) {
        String strB;
        Iterator it = this.f44377d.keySet().iterator();
        do {
            if (!it.hasNext()) {
                strB = null;
                break;
            }
            strB = ((com.fyber.inneractive.sdk.config.global.k) this.f44377d.get((String) it.next())).b(str);
        } while (strB == null);
        if (strB != null) {
            return strB;
        }
        com.fyber.inneractive.sdk.config.global.n nVar = this.f44390a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    public abstract h b();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String b(String str) {
        return a(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[RETURN] */
    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Boolean c(String str) {
        Boolean boolC;
        Iterator it = this.f44377d.keySet().iterator();
        while (it.hasNext()) {
            boolC = ((com.fyber.inneractive.sdk.config.global.k) this.f44377d.get((String) it.next())).c(str);
            if (boolC != null) {
                if (boolC == null) {
                    return super.c(str);
                }
                return boolC;
            }
        }
        boolC = null;
        if (boolC == null) {
            return super.c(str);
        }
        return boolC;
    }

    public final String toString() {
        return String.format("id: %s, params: %s exp: %s", this.f44375b, this.f44390a, this.f44376c);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[RETURN] */
    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Integer a(String str) {
        Integer numA;
        Iterator it = this.f44377d.keySet().iterator();
        while (it.hasNext()) {
            numA = ((com.fyber.inneractive.sdk.config.global.k) this.f44377d.get((String) it.next())).a(str);
            if (numA != null) {
                if (numA == null) {
                    return super.a(str);
                }
                return numA;
            }
        }
        numA = null;
        if (numA == null) {
            return super.a(str);
        }
        return numA;
    }

    public final void a(h hVar) {
        hVar.f44375b = this.f44375b;
        hVar.f44390a = this.f44390a;
        hVar.f44376c = new HashMap(this.f44376c);
        hVar.f44377d = new HashMap(this.f44377d);
    }
}
