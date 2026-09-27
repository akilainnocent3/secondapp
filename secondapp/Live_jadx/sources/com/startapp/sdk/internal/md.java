package com.startapp.sdk.internal;

import com.ironsource.G5;
import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class md extends se {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f75197b;

    public md(Set set) {
        super(set);
        this.f75197b = new LinkedHashMap();
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        String string;
        if (this.f75508a.contains(str)) {
            return;
        }
        try {
            if (obj instanceof re) {
                string = ((re) obj).b();
            } else {
                string = obj != null ? obj.toString() : null;
            }
            if (string == null) {
                if (z10) {
                    throw new SDKException(str);
                }
            } else {
                if (z11) {
                    string = URLEncoder.encode(string, "UTF-8");
                }
                this.f75197b.put(str, string);
            }
        } catch (UnsupportedEncodingException e10) {
            if (z10) {
                throw new SDKException(str, e10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('?');
        for (Map.Entry entry : this.f75197b.entrySet()) {
            if (entry.getValue() instanceof String) {
                sb2.append((String) entry.getKey());
                sb2.append(G5.T);
                sb2.append(entry.getValue());
                sb2.append('&');
            } else if (entry.getValue() instanceof Set) {
                for (Object obj : (Set) entry.getValue()) {
                    if (obj instanceof String) {
                        sb2.append((String) entry.getKey());
                        sb2.append(G5.T);
                        sb2.append(obj);
                        sb2.append('&');
                    }
                }
            }
        }
        if (sb2.length() != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString().replace(com.google.android.material.badge.a.f50153v, "%20");
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Set set) {
        if (this.f75508a.contains(str) || set == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(URLEncoder.encode((String) it.next(), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f75197b.put(str, hashSet);
    }
}
